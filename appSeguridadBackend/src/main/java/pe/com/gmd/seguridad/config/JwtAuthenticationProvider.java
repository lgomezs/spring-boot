package pe.com.gmd.seguridad.config;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import pe.com.gmd.seguridad.dto.UserContext;
import pe.com.gmd.seguridad.model.Sistema;
import pe.com.gmd.seguridad.model.Usuario;
import pe.com.gmd.seguridad.model.UsuarioRol;
import pe.com.gmd.seguridad.service.UsuarioService;
import pe.com.gmd.seguridad.service.impl.DatabaseUserService;


@Component
public class JwtAuthenticationProvider implements AuthenticationProvider {

	private final JwtSettings jwtSettings;
	 
	@Autowired
    private UsuarioService usuarioService;
	@Autowired
	private DatabaseUserService databaseUserService;

    
    @Autowired
    public JwtAuthenticationProvider(JwtSettings jwtSettings) {
        this.jwtSettings = jwtSettings;
    }
    
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        RawAccessJwtToken rawAccessToken = (RawAccessJwtToken) authentication.getCredentials();

        Jws<Claims> jwsClaims = rawAccessToken.parseClaims(jwtSettings.getTokenSigningKey());
        Long subject = Long.valueOf(jwsClaims.getBody().getSubject());
       
        Usuario user = usuarioService.obtener(subject); 

        if(user==null) new UsernameNotFoundException("User Id no encontrado: " + subject);
        
        List<Sistema> listSistema=  databaseUserService.consultaSistemaPorUsuario(user.getIdUsuario());
        
        if(listSistema!=null) {
        	List<UsuarioRol> listRoles = databaseUserService.consultaUsuarioRol(user.getIdUsuario());
        	if(listRoles==null) throw new InsufficientAuthenticationException("Usuario no tiene roles asignados");
        	
        	List<GrantedAuthority> authorities = listRoles.stream()
                    .map(authority -> new SimpleGrantedAuthority(authority.getRol().authority()))
                    .collect(Collectors.toList());

            UserContext userContext = UserContext.create(user.getIdUsuario(), authorities);

            return new JwtAuthenticationToken(userContext, userContext.getAuthorities());
            
        }else {
        	throw new InsufficientAuthenticationException("Usuario no tiene sistemas asignados");
        }
        
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return (JwtAuthenticationToken.class.isAssignableFrom(authentication));
    }
}
