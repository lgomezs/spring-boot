package pe.com.gmd.seguridad.rest;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import pe.com.gmd.seguridad.config.JwtSettings;
import pe.com.gmd.seguridad.config.JwtToken;
import pe.com.gmd.seguridad.config.JwtTokenFactory;
import pe.com.gmd.seguridad.config.RawAccessJwtToken;
import pe.com.gmd.seguridad.config.RefreshToken;
import pe.com.gmd.seguridad.config.TokenExtractor;
import pe.com.gmd.seguridad.config.TokenVerifier;
import pe.com.gmd.seguridad.config.WebSecurityConfig;
import pe.com.gmd.seguridad.dto.UserContext;
import pe.com.gmd.seguridad.exception.InvalidJwtToken;
import pe.com.gmd.seguridad.model.Sistema;
import pe.com.gmd.seguridad.model.Usuario;
import pe.com.gmd.seguridad.model.UsuarioRol;
import pe.com.gmd.seguridad.service.UserService;


@RestController
public class RefreshTokenEndpoint {
		
		@Autowired private JwtTokenFactory tokenFactory;
	    @Autowired private JwtSettings jwtSettings;
	    @Autowired private UserService userService;
	    @Autowired private TokenVerifier tokenVerifier;
	    @Autowired @Qualifier("jwtHeaderTokenExtractor") private TokenExtractor tokenExtractor;

	    @RequestMapping(value="/api/auth/token", method= RequestMethod.GET, produces={ MediaType.APPLICATION_JSON_VALUE })
	    public @ResponseBody JwtToken refreshToken(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	        String tokenPayload = tokenExtractor.extract(request.getHeader(WebSecurityConfig.JWT_TOKEN_HEADER_PARAM));

	        RawAccessJwtToken rawToken = new RawAccessJwtToken(tokenPayload);
	        RefreshToken refreshToken = RefreshToken.create(rawToken, jwtSettings.getTokenSigningKey()).orElseThrow(() -> new InvalidJwtToken());

	        String jti = refreshToken.getJti();
	        if (!tokenVerifier.verify(jti)) {
	            throw new InvalidJwtToken();
	        }

	        String cuentaUsuario = refreshToken.getClaims().getBody().get("cuentaUsuario").toString();
	        Usuario user = userService.getByUsername(cuentaUsuario).orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado: " + cuentaUsuario));
	        
	        //se reuperan los roles
	        List<Sistema> listSistema=  userService.consultaSistemaPorUsuario(user.getIdUsuario());
	        if(listSistema!=null) {
	        	List<UsuarioRol> listRoles = userService.consultaUsuarioRol(user.getIdUsuario());
	        	if(listRoles==null) throw new InsufficientAuthenticationException("Usuario no tiene roles asignados");
	        	
	        	List<GrantedAuthority> authorities = listRoles.stream()
	                    .map(authority -> new SimpleGrantedAuthority(authority.getRol().authority()))
	                    .collect(Collectors.toList());

	            UserContext userContext = UserContext.create(user.getIdUsuario(), authorities);

	            return tokenFactory.createAccessJwtToken(userContext);
	        }else {
	        	throw new InsufficientAuthenticationException("Usuario no tiene sistemas asignados");
	        }     
	    }   		
}
