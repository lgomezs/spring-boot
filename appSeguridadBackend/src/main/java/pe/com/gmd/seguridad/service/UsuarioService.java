package pe.com.gmd.seguridad.service;

import pe.com.gmd.seguridad.exception.BusinessException;
import pe.com.gmd.seguridad.model.Usuario;


public interface UsuarioService extends ServiceBase<Usuario, Long> {

	Usuario buscarUsuarioPorLogin(String usuario)throws BusinessException;
	
	
	
}
