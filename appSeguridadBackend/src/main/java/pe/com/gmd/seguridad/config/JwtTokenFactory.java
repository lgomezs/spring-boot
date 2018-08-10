package pe.com.gmd.seguridad.config;

import java.util.UUID;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import pe.com.gmd.seguridad.dto.UserContext;
import pe.com.gmd.seguridad.model.Usuario;
import pe.com.gmd.seguridad.service.UsuarioService;
import pe.com.gmd.seguridad.util.StringUtil;

import org.apache.commons.lang3.StringUtils;



@Component
public class JwtTokenFactory {
	private final JwtSettings settings;    
    @Autowired
    private UsuarioService usuarioService;
    
    
    @Autowired
    public JwtTokenFactory(JwtSettings settings) {
        this.settings = settings;
    }
    
    public AccessJwtToken createAccessJwtToken(UserContext userContext) {
        if (userContext.getUserId()==null)
            throw new IllegalArgumentException("No se puede crear token JWT sin usuario");

        if (userContext.getAuthorities() == null || userContext.getAuthorities().isEmpty())
            throw new IllegalArgumentException("El Usuario no tiene ning\u00fan privilegio");

        Claims claims = Jwts.claims().setSubject(String.valueOf(userContext.getUserId()));
        Usuario usuarioDto = usuarioService.obtener(userContext.getUserId());
        DateTime currentTime = new DateTime();
        
        claims.put("cuentaUsuario", usuarioDto.getLgUsua());
        claims.put("empleado", StringUtil.toCamelCase(usuarioDto.getNoUsua()) + " " + StringUtil.toCamelCase(usuarioDto.getApPtnoUsua() + " " + usuarioDto.getApMtnoUsua()));
        
        String token = Jwts.builder()
                .setClaims(claims)
                .setIssuer(settings.getTokenIssuer())
                .setIssuedAt(currentTime.toDate())
                .setExpiration(currentTime.plusMinutes(settings.getTokenExpirationTime()).toDate())
                .signWith(SignatureAlgorithm.HS512, settings.getTokenSigningKey())
                .compact();

        return new AccessJwtToken(token, claims);
    }

    public JwtToken createRefreshToken(UserContext userContext) {
        if (userContext.getUserId()==null) {
            throw new IllegalArgumentException("No se puede crear token JWT sin usuario");
        }
        DateTime currentTime = new DateTime();

        Claims claims = Jwts.claims().setSubject(String.valueOf(userContext.getUserId()));
       
        Usuario usuarioDto = usuarioService.obtener(userContext.getUserId());

        claims.put("cuentaUsuario", usuarioDto.getLgUsua());
        claims.put("empleado", StringUtil.toCamelCase(usuarioDto.getNoUsua()) + " " + StringUtil.toCamelCase(usuarioDto.getApPtnoUsua() + " " + usuarioDto.getApMtnoUsua()));
        
        String token = Jwts.builder()
                .setClaims(claims)
                .setIssuer(settings.getTokenIssuer())
                .setId(UUID.randomUUID().toString())
                .setIssuedAt(currentTime.toDate())
                .setExpiration(currentTime.plusMinutes(settings.getRefreshTokenExpTime()).toDate())
                .signWith(SignatureAlgorithm.HS512, settings.getTokenSigningKey())
                .compact();

        return new AccessJwtToken(token, claims);
    }    

}
