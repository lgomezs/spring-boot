package pe.com.gmd.seguridad.view.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import pe.com.gmd.seguridad.json.JsonFlagIntegerDeserializer;
import pe.com.gmd.seguridad.json.JsonFlagIntegerSerializer;


public class AssignedRole {

	private String roleName;
	private String roleDescription;
	@JsonSerialize(using = JsonFlagIntegerSerializer.class)
	@JsonDeserialize(using = JsonFlagIntegerDeserializer.class)
	private Integer assigned;
	@JsonSerialize(using = JsonFlagIntegerSerializer.class)
	@JsonDeserialize(using = JsonFlagIntegerDeserializer.class)
	private Integer roleDefault;

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Integer getAssigned() {
		return assigned;
	}

	public void setAssigned(Integer assigned) {
		this.assigned = assigned;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	public Integer getRoleDefault() {
		return roleDefault;
	}

	public void setRoleDefault(Integer roleDefault) {
		this.roleDefault = roleDefault;
	}

}
