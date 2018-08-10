package pe.com.gmd.seguridad.view.model;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import pe.com.gmd.seguridad.json.JsonDateSimpleDeserializer;
import pe.com.gmd.seguridad.json.JsonDateSimpleSerializer;



public class AuditingEntityViewModel {

	private Long rowVersion;
	private String creador;

	@JsonSerialize(using = JsonDateSimpleSerializer.class)
	@JsonDeserialize(using = JsonDateSimpleDeserializer.class)
	private Date fechaCreacion;
	private String actualizador;
	@JsonSerialize(using = JsonDateSimpleSerializer.class)
	@JsonDeserialize(using = JsonDateSimpleDeserializer.class)
	private Date fechaActualizacion;

	public Long getRowVersion() {
		return rowVersion;
	}

	public void setRowVersion(Long rowVersion) {
		this.rowVersion = rowVersion;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getActualizador() {
		return actualizador;
	}

	public void setActualizador(String actualizador) {
		this.actualizador = actualizador;
	}

	public Date getFechaActualizacion() {
		return fechaActualizacion;
	}

	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

}
