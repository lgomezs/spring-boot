package pe.com.gmd.seguridad.model.repository.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.com.gmd.seguridad.model.UsuarioRol;
import pe.com.gmd.seguridad.model.UsuarioRolPK;

@Repository
public interface UsuarioRolRepository  extends CrudRepository<UsuarioRol, UsuarioRolPK>{

}
