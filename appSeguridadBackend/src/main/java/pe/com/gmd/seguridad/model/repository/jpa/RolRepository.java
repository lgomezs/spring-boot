package pe.com.gmd.seguridad.model.repository.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.com.gmd.seguridad.model.Rol;

@Repository
public interface RolRepository extends CrudRepository<Rol, Integer> {

}
