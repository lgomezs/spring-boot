package pe.com.gmd.seguridad.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.gmd.seguridad.exception.BusinessException;
import pe.com.gmd.seguridad.model.Rol;
import pe.com.gmd.seguridad.model.repository.jpa.RolRepository;
import pe.com.gmd.seguridad.service.RolService;

@Service
public class RolServiceImpl implements RolService{

	@Autowired
	private RolRepository rolRepository;
	
	
	@Override
	public void insertar(Rol entidad) throws BusinessException {
		try {
			rolRepository.save(entidad);			
		} catch (Exception exception) {
			throw new BusinessException(exception);
		}	
	}

	@Override
	public void actualizar(Rol entidad) throws BusinessException {
		try {
			rolRepository.save(entidad);			
		} catch (Exception exception) {
			throw new BusinessException(exception);
		}	
		
	}

	@Override
	public void eliminar(Integer id) throws BusinessException {
		try {
			rolRepository.delete(id);			
		} catch (Exception exception) {
			throw new BusinessException(exception);
		}
	}

	@Override
	public Rol obtener(Integer id) throws BusinessException {
		try {
			return rolRepository.findOne(id);			
		} catch (Exception exception) {
			throw new BusinessException(exception);
		}	
	}

	@Override
	public List<Rol> listar() throws BusinessException {
		List<Rol>  lista=new ArrayList<Rol>();
		try {
			rolRepository.findAll().forEach(e->lista.add(e));
		} catch (Exception exception) {
			throw new BusinessException(exception);
		}	
		return lista;
	}

}
