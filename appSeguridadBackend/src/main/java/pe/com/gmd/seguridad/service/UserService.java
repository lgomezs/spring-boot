package pe.com.gmd.seguridad.service;

import java.util.List;
import java.util.Optional;

import pe.com.gmd.seguridad.exception.BusinessException;
import pe.com.gmd.seguridad.model.Sistema;
import pe.com.gmd.seguridad.model.Usuario;
import pe.com.gmd.seguridad.model.UsuarioRol;



public interface UserService {

	  public Optional<Usuario> getByUsername(String username);
	    
	  public Optional<Usuario> getByUserId(Long userId);
	  
	  List<UsuarioRol> consultaUsuarioRol(Long userId)throws BusinessException;
	  
	  List<Sistema> consultaSistemaPorUsuario(Long userId)throws BusinessException;
	    
}
