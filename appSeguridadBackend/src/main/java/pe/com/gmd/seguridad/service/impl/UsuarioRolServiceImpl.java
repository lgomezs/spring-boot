package pe.com.gmd.seguridad.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.gmd.seguridad.exception.BusinessException;
import pe.com.gmd.seguridad.model.UsuarioRol;
import pe.com.gmd.seguridad.model.UsuarioRolPK;
import pe.com.gmd.seguridad.model.repository.jpa.UsuarioRolRepository;
import pe.com.gmd.seguridad.service.UsuarioRolService;

@Service
public class UsuarioRolServiceImpl implements UsuarioRolService{

	@Autowired
	private UsuarioRolRepository usuarioRolRepository;
	
	@Override
	public void insertar(UsuarioRol entidad) throws BusinessException {
		try {
			usuarioRolRepository.save(entidad);			
		} catch (Exception exception) {
			throw new BusinessException(exception);
		}			
	}

	@Override
	public void actualizar(UsuarioRol entidad) throws BusinessException {
		try {
			usuarioRolRepository.save(entidad);			
		} catch (Exception exception) {
			throw new BusinessException(exception);
		}	
	}

	@Override
	public void eliminar(UsuarioRolPK id) throws BusinessException {
		try {
			usuarioRolRepository.delete(id);
		} catch (Exception exception) {
			throw new BusinessException(exception);
		}	
		
	}

	@Override
	public UsuarioRol obtener(UsuarioRolPK id) throws BusinessException {
		try {
			return usuarioRolRepository.findOne(id);
		} catch (Exception exception) {
			throw new BusinessException(exception);
		}	
	}

	@Override
	public List<UsuarioRol> listar() throws BusinessException {
		List<UsuarioRol>  lista=new ArrayList<UsuarioRol>();
		try {
			usuarioRolRepository.findAll().forEach(e -> lista.add(e));	
		} catch (Exception exception) {
			throw new BusinessException(exception);
		}	
		return lista;
	}

}
