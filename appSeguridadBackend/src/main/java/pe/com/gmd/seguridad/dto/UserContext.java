package pe.com.gmd.seguridad.dto;

import java.util.List;

import org.springframework.security.core.GrantedAuthority;

public class UserContext {
	private Long userId;
	private final List<GrantedAuthority> authorities;

	private UserContext(Long userId, List<GrantedAuthority> authorities) {
		this.userId = userId;
		this.authorities = authorities;
	}

	public static UserContext create(Long userId, List<GrantedAuthority> authorities) {
		if (userId == null)
			throw new IllegalArgumentException("Usuario es requerido");
		return new UserContext(userId, authorities);
	}

	public List<GrantedAuthority> getAuthorities() {
		return authorities;
	}

	public Long getUserId() {
		return userId;
	}

}
