package pe.com.gmd.seguridad.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.gmd.seguridad.exception.BusinessException;
import pe.com.gmd.seguridad.model.Sistema;
import pe.com.gmd.seguridad.model.Usuario;
import pe.com.gmd.seguridad.model.UsuarioRol;
import pe.com.gmd.seguridad.model.repository.jpa.UsuarioRepository;
import pe.com.gmd.seguridad.service.UserService;

@Service
public class DatabaseUserService implements UserService {
	private final UsuarioRepository usuarioRepository;

	@Autowired
	public DatabaseUserService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	public UsuarioRepository getUserRepository() {
		return usuarioRepository;
	}

	@Override
	public Optional<Usuario> getByUsername(String username) {
		return this.usuarioRepository.findByUsername(username);
	}

	public Optional<Usuario> getByUserId(Long userId) {
		return this.usuarioRepository.findByUserId(userId);
	}

	@Override
	public List<UsuarioRol> consultaUsuarioRol(Long userId) throws BusinessException {
		List<UsuarioRol> listRoles=null;
		try {
			listRoles = usuarioRepository.consultaUsuarioRol(userId);
		} catch (Exception e) {
			throw new BusinessException(e);
		}
		return listRoles;
	}

	@Override
	public List<Sistema> consultaSistemaPorUsuario(Long userId) throws BusinessException {
		List<Sistema> listSistemas=null;
		try {
			listSistemas = usuarioRepository.consultaSistemaPorUsuario(userId);
		} catch (Exception e) {
			throw new BusinessException(e);
		}
		return listSistemas;
	}

}
