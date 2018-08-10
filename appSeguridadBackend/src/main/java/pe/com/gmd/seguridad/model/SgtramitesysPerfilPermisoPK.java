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
public class SgtramitesysPerfilPermisoPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 21)
    @Column(name = "ID_PERMISO")
    private String idPermiso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PERFIL")
    private int idPerfil;

    public SgtramitesysPerfilPermisoPK() {
    }

    public SgtramitesysPerfilPermisoPK(String idPermiso, int idPerfil) {
        this.idPermiso = idPermiso;
        this.idPerfil = idPerfil;
    }

    public String getIdPermiso() {
        return idPermiso;
    }

    public void setIdPermiso(String idPermiso) {
        this.idPermiso = idPermiso;
    }

    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPermiso != null ? idPermiso.hashCode() : 0);
        hash += (int) idPerfil;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SgtramitesysPerfilPermisoPK)) {
            return false;
        }
        SgtramitesysPerfilPermisoPK other = (SgtramitesysPerfilPermisoPK) object;
        if ((this.idPermiso == null && other.idPermiso != null) || (this.idPermiso != null && !this.idPermiso.equals(other.idPermiso))) {
            return false;
        }
        if (this.idPerfil != other.idPerfil) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.SgtramitesysPerfilPermisoPK[ idPermiso=" + idPermiso + ", idPerfil=" + idPerfil + " ]";
    }
    
}
