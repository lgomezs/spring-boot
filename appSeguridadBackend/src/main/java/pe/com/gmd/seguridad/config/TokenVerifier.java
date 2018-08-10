package pe.com.gmd.seguridad.config;

public interface TokenVerifier {
	public boolean verify(String jti);
}
