package pe.com.gmd.seguridad.service;

public interface LdapService {

	 boolean authenticate(String usuario, String password);
}
