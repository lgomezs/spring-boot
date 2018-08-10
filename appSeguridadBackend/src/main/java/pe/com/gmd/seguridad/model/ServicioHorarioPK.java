/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.gmd.seguridad.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author lgomezs
 */
@Embeddable
public class ServicioHorarioPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_SERVICIO")
    private int idServicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_HORARIO")
    private int idHorario;

    public ServicioHorarioPK() {
    }

    public ServicioHorarioPK(int idServicio, int idHorario) {
        this.idServicio = idServicio;
        this.idHorario = idHorario;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idServicio;
        hash += (int) idHorario;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ServicioHorarioPK)) {
            return false;
        }
        ServicioHorarioPK other = (ServicioHorarioPK) object;
        if (this.idServicio != other.idServicio) {
            return false;
        }
        if (this.idHorario != other.idHorario) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.ServicioHorarioPK[ idServicio=" + idServicio + ", idHorario=" + idHorario + " ]";
    }
    
}
