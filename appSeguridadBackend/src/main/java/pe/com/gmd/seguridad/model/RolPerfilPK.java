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
public class RolPerfilPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_ROL")
    private int idRol;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PERFIL")
    private int idPerfil;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_SISTEMA")
    private int idSistema;

    public RolPerfilPK() {
    }

    public RolPerfilPK(int idRol, int idPerfil, int idSistema) {
        this.idRol = idRol;
        this.idPerfil = idPerfil;
        this.idSistema = idSistema;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
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
        hash += (int) idRol;
        hash += (int) idPerfil;
        hash += (int) idSistema;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RolPerfilPK)) {
            return false;
        }
        RolPerfilPK other = (RolPerfilPK) object;
        if (this.idRol != other.idRol) {
            return false;
        }
        if (this.idPerfil != other.idPerfil) {
            return false;
        }
        if (this.idSistema != other.idSistema) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.RolPerfilPK[ idRol=" + idRol + ", idPerfil=" + idPerfil + ", idSistema=" + idSistema + " ]";
    }
    
}
