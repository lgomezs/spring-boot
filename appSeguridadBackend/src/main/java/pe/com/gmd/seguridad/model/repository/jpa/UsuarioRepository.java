package pe.com.gmd.seguridad.model.repository.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.com.gmd.seguridad.exception.BusinessException;
import pe.com.gmd.seguridad.model.Sistema;
import pe.com.gmd.seguridad.model.Usuario;
import pe.com.gmd.seguridad.model.UsuarioRol;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long>{
	
	@Query("Select u from Usuario u where u.lgUsua =:username")
	Usuario buscarUsuarioPorLogin(@Param("username") String username)throws BusinessException;
	
	@Query("select u from Usuario u where u.lgUsua=:username")
	public Optional<Usuario> findByUsername(@Param("username") String username);
	    
	@Query("select u from Usuario u where u.idUsuario=:userId")
	public Optional<Usuario> findByUserId(@Param("userId") Long userId);
	
	@Query(value = "SELECT R.ID_ROL     as idRol,\r\n " + 
			"		       R.NO_ROL     as noRol,\r\n " + 
			"		       R.DE_ROL     as desRol\r\n " + 
			"		FROM   SEGURIDADSYS.USUARIO_ROL UR,\r\n " + 
			"		       SEGURIDADSYS.ROL R\r\n " + 
			"		WHERE  UR.ID_USUARIO=:userId AND UR.ID_ROL = R.ID_ROL AND \r\n " + 
			"		       TRUNC(UR.FE_FIN_VIGE) >= TRUNC(SYSDATE) AND\r\n " + 
			"		       R.TI_ROL = 1 AND UR.ST_USUA_ROL = 1 AND\r\n " + 
			"		       R.ST_ROL = 1 AND UR.ST_REGI = 1 AND R.ST_REGI = 1", nativeQuery = true)
	List<UsuarioRol> consultaUsuarioRol(@Param("userId") Long userId)throws BusinessException;
  
	@Query(value = "SELECT  DISTINCT(S.ID_SISTEMA) as idSistema,\r\n" + 
			"		        S.NO_SIST as noSistema,\r\n" + 
			"		        S.RU_SIST as rutaSistema \r\n" + 
			"		FROM    SEGURIDADSYS.USUARIO_PERFIL UP,\r\n" + 
			"		        SEGURIDADSYS.SISTEMA S\r\n" + 
			"		WHERE   UP.ID_USUARIO =:userId AND \r\n" + 
			"		        UP.ID_SISTEMA = S.ID_SISTEMA AND \r\n" + 
			"		        TRUNC(UP.FE_FIN_VIGE) >= TRUNC(SYSDATE) AND\r\n" + 
			"		        UP.ST_USUA_PERF = 1 AND\r\n" + 
			"		        S.TI_SIST = 2 AND\r\n" + 
			"		        UP.ST_REGI = 1 AND\r\n" + 
			"		        S.ST_REGI = 1 AND \r\n" + 
			"		        S.ST_SIST = 1", nativeQuery = true)
	List<Sistema> consultaSistemaPorUsuario(@Param("userId") Long userId)throws BusinessException;
	    
}
