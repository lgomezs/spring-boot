package pe.com.gmd.seguridad.service;

import java.util.List;

import pe.com.gmd.seguridad.exception.BusinessException;

public interface ServiceBase<E,ID> {

	void insertar(E entidad) throws BusinessException;

	void actualizar(E entidad) throws BusinessException;

	void eliminar(ID id) throws BusinessException;

	E obtener(ID id) throws BusinessException;

	List<E> listar() throws BusinessException;
	
}
