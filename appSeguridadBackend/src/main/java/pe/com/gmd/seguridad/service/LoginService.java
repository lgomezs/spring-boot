package pe.com.gmd.seguridad.service;

import pe.com.gmd.seguridad.view.model.ChangeRolViewModel;
import pe.com.gmd.seguridad.view.model.CurrentUser;

public interface LoginService {

	CurrentUser authenticate(String cuentaUsuario);

	Boolean validateModuleActionName(Long idUsuario, String moduleCode, String actionName);

	ChangeRolViewModel updateDefaultRole(String account, String roleCode);
	
}
