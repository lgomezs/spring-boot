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
public class PerfilPermisoPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_SISTEMA")
    private int idSistema;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PERFIL")
    private int idPerfil;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 21)
    @Column(name = "ID_PERMISO")
    private String idPermiso;

    public PerfilPermisoPK() {
    }

    public PerfilPermisoPK(int idSistema, int idPerfil, String idPermiso) {
        this.idSistema = idSistema;
        this.idPerfil = idPerfil;
        this.idPermiso = idPermiso;
    }

    public int getIdSistema() {
        return idSistema;
    }

    public void setIdSistema(int idSistema) {
        this.idSistema = idSistema;
    }

    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    public String getIdPermiso() {
        return idPermiso;
    }

    public void setIdPermiso(String idPermiso) {
        this.idPermiso = idPermiso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idSistema;
        hash += (int) idPerfil;
        hash += (idPermiso != null ? idPermiso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PerfilPermisoPK)) {
            return false;
        }
        PerfilPermisoPK other = (PerfilPermisoPK) object;
        if (this.idSistema != other.idSistema) {
            return false;
        }
        if (this.idPerfil != other.idPerfil) {
            return false;
        }
        if ((this.idPermiso == null && other.idPermiso != null) || (this.idPermiso != null && !this.idPermiso.equals(other.idPermiso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.PerfilPermisoPK[ idSistema=" + idSistema + ", idPerfil=" + idPerfil + ", idPermiso=" + idPermiso + " ]";
    }
    
}
