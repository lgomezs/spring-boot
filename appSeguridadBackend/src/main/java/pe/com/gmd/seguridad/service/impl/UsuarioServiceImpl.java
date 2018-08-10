package pe.com.gmd.seguridad.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

import pe.com.gmd.seguridad.exception.BusinessException;
import pe.com.gmd.seguridad.model.Usuario;
import pe.com.gmd.seguridad.model.repository.jpa.UsuarioRepository;
import pe.com.gmd.seguridad.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	final Logger LOGGER = LoggerFactory.getLogger(getClass());
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public void insertar(Usuario entidad) throws BusinessException {
		try {
			usuarioRepository.save(entidad);			
		} catch (Exception exception) {
			throw new BusinessException(exception);
		}		
	}

	@Override
	public void actualizar(Usuario entidad) throws BusinessException {
		try {
			usuarioRepository.save(entidad);			
		} catch (Exception exception) {
			throw new BusinessException(exception);
		}			
	}

	@Override
	public void eliminar(Long id) throws BusinessException {
		try {
			usuarioRepository.delete(id);			
		} catch (Exception exception) {
			throw new BusinessException(exception);
		}	
	}

	@Override
	public Usuario obtener(Long id) throws BusinessException {
		try {
			return usuarioRepository.findOne(id);	
		} catch (Exception exception) {
			throw new BusinessException(exception);
		}	
	}

	@Override
	public List<Usuario> listar() throws BusinessException {
		List<Usuario>  lista=new ArrayList<Usuario>();
		try {				
			 usuarioRepository.findAll().forEach(e -> lista.add(e));			
		} catch (Exception exception) {
			throw new BusinessException(exception);
		}	
		return lista;
	}

	@Override
	public Usuario buscarUsuarioPorLogin(String usuario) throws BusinessException {
		try {
			return usuarioRepository.buscarUsuarioPorLogin(usuario);
		} catch (Exception exception) {
			throw new BusinessException(exception);
		}
	}
}
