package pe.com.gmd.seguridad.config;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import pe.com.gmd.seguridad.dto.UserContext;
import pe.com.gmd.seguridad.model.Sistema;
import pe.com.gmd.seguridad.model.Usuario;
import pe.com.gmd.seguridad.model.UsuarioRol;
import pe.com.gmd.seguridad.service.LdapService;
import pe.com.gmd.seguridad.service.UsuarioRolService;
import pe.com.gmd.seguridad.service.impl.DatabaseUserService;

@Component
public class AjaxAuthenticationProvider implements AuthenticationProvider{
	private final BCryptPasswordEncoder encoder;
    private final DatabaseUserService userService;
    private final UsuarioRolService usuarioRolService;

    @Value("${spring.security.ldap.active}")
    private boolean ldapActive;

    @Autowired
    private LdapService ldapService;
    
    
    @Autowired
    public AjaxAuthenticationProvider(final DatabaseUserService userService, final BCryptPasswordEncoder encoder,final UsuarioRolService usuarioRolService) {
        this.userService = userService;
        this.encoder = encoder;
        this.usuarioRolService=usuarioRolService;
    }
    
    
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        Assert.notNull(authentication, "Datos de autenticaci\u00f3n no proveidos");
        String username = (String) authentication.getPrincipal();
        String password = (String) authentication.getCredentials();
        Usuario user = null;

        //verifica si esta activo el LDAP
        if(ldapActive){
            if(!ldapService.authenticate(username, password)){              
            	throw new BadCredentialsException("Usuario o contrase\u00f1a no v\u00e1lidos.");
            }
        }

        user = userService.getByUsername(username).orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado: " + username));
                
        if(!ldapActive && !(user.getStUsua()=='1')){
        	throw new BadCredentialsException("Usuario inactivo.");
        }      
        
        if (!ldapActive && !encoder.matches(password, user.getTxPwdUsua())) {
                throw new BadCredentialsException("Usuario o contrase\u00f1a no v\u00e1lidos.");
        }

        //se reuperan los roles
        List<Sistema> listSistema=  userService.consultaSistemaPorUsuario(user.getIdUsuario());
        if(listSistema!=null) {
        	        	
        	if(user.getUsuarioRolList()==null) throw new InsufficientAuthenticationException("Usuario no tiene roles asignados");
        	
        	List<GrantedAuthority> authorities = user.getUsuarioRolList().stream()
                    .map(authority -> new SimpleGrantedAuthority(authority.getRol().authority()))
                    .collect(Collectors.toList());

            UserContext userContext = UserContext.create(user.getIdUsuario(), authorities);
            
            return new UsernamePasswordAuthenticationToken(userContext, null, userContext.getAuthorities());
                       
        }else {
        	throw new InsufficientAuthenticationException("Usuario no tiene sistemas asignados");
        }        
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
    }

}

