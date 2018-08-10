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
import javax.validation.constraints.Size;

/**
 *
 * @author lgomezs
 */
@Embeddable
public class PermisoPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 21)
    @Column(name = "ID_PERMISO")
    private String idPermiso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_SISTEMA")
    private int idSistema;

    public PermisoPK() {
    }

    public PermisoPK(String idPermiso, int idSistema) {
        this.idPermiso = idPermiso;
        this.idSistema = idSistema;
    }

    public String getIdPermiso() {
        return idPermiso;
    }

    public void setIdPermiso(String idPermiso) {
        this.idPermiso = idPermiso;
    }

    public int getIdSistema() {
        return idSistema;
    }

    public void setIdSistema(int idSistema) {
        this.idSistema = idSistema;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPermiso != null ? idPermiso.hashCode() : 0);
        hash += (int) idSistema;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PermisoPK)) {
            return false;
        }
        PermisoPK other = (PermisoPK) object;
        if ((this.idPermiso == null && other.idPermiso != null) || (this.idPermiso != null && !this.idPermiso.equals(other.idPermiso))) {
            return false;
        }
        if (this.idSistema != other.idSistema) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.PermisoPK[ idPermiso=" + idPermiso + ", idSistema=" + idSistema + " ]";
    }
    
}
