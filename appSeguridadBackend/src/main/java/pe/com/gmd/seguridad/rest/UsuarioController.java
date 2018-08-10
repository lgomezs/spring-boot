package pe.com.gmd.seguridad.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import pe.com.gmd.seguridad.exception.BusinessException;
import pe.com.gmd.seguridad.model.Usuario;
import pe.com.gmd.seguridad.service.UsuarioService;

//anotación para habilitar CORS
@CrossOrigin
@RestController
@RequestMapping("/auth")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping(value="/buscarUsuario",method = RequestMethod.POST)
	public @ResponseBody Usuario buscarUsuarioPorLogin(@RequestBody String username){
		System.out.println("Inicio buscarUsuarioPorLogin");
		Usuario usuario=null;
		try {
			if(username!=null)
				username=username.toUpperCase();
			System.out.println(username);
			usuario = usuarioService.buscarUsuarioPorLogin(username);			
		}catch (Exception exception) {		
			exception.printStackTrace();
			throw new BusinessException(exception);			
		}
		System.out.println("Fin buscarUsuarioPorLogin");
		return usuario;
	}
	
	

//	@RequestMapping(value="/listarUsuarios",method = RequestMethod.POST)
//	public @ResponseBody ResponseEntity<List<Usuario>> buscar(@RequestParam String documento){
//		System.out.println("Inicio listarUuarioPorDcumento");
//		List<Usuario> listUsuario=null;
//		try {
//			listUsuario = usuarioService.listar();
//			System.out.println("listUsuario size : "+ listUsuario.size());
//			if(listUsuario==null) {
//				return new ResponseEntity<>(listUsuario,HttpStatus.NO_CONTENT);
//			}
//		}catch (Exception exception) {	
//			exception.printStackTrace();
//			return new ResponseEntity<>(listUsuario,HttpStatus.INTERNAL_SERVER_ERROR);		
//		}
//		System.out.println("Fin listarUuarioPorDcumento");
//		return new ResponseEntity<>(listUsuario,HttpStatus.OK);
//	}	
	
	
	
}
