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
public class InstitucionFeriadoPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_FERIADO")
    private int idFeriado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_INSTITUCION")
    private int idInstitucion;

    public InstitucionFeriadoPK() {
    }

    public InstitucionFeriadoPK(int idFeriado, int idInstitucion) {
        this.idFeriado = idFeriado;
        this.idInstitucion = idInstitucion;
    }

    public int getIdFeriado() {
        return idFeriado;
    }

    public void setIdFeriado(int idFeriado) {
        this.idFeriado = idFeriado;
    }

    public int getIdInstitucion() {
        return idInstitucion;
    }

    public void setIdInstitucion(int idInstitucion) {
        this.idInstitucion = idInstitucion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idFeriado;
        hash += (int) idInstitucion;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InstitucionFeriadoPK)) {
            return false;
        }
        InstitucionFeriadoPK other = (InstitucionFeriadoPK) object;
        if (this.idFeriado != other.idFeriado) {
            return false;
        }
        if (this.idInstitucion != other.idInstitucion) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.InstitucionFeriadoPK[ idFeriado=" + idFeriado + ", idInstitucion=" + idInstitucion + " ]";
    }
    
}
