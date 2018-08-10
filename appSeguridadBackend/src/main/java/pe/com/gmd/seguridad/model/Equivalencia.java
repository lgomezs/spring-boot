/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.gmd.seguridad.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author lgomezs
 */
@Entity
@Table(name = "EQUIVALENCIA")
@NamedQueries({
    @NamedQuery(name = "Equivalencia.findAll", query = "SELECT e FROM Equivalencia e")})
public class Equivalencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_EQUI")
    private Long idEqui;
    @Size(max = 30)
    @Column(name = "ID_USUA")
    private String idUsua;
    @Size(max = 30)
    @Column(name = "ID_USUA_SIST")
    private String idUsuaSist;
    @Size(max = 18)
    @Column(name = "ID_SIST")
    private String idSist;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "ID_USUA_CREA")
    private String idUsuaCrea;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FE_USUA_CREA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date feUsuaCrea;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 39)
    @Column(name = "DE_TERM_CREA")
    private String deTermCrea;
    @Size(max = 30)
    @Column(name = "ID_USUA_MODI")
    private String idUsuaModi;
    @Column(name = "FE_USUA_MODI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date feUsuaModi;
    @Size(max = 39)
    @Column(name = "DE_TERM_MODI")
    private String deTermModi;

    public Equivalencia() {
    }

    public Equivalencia(Long idEqui) {
        this.idEqui = idEqui;
    }

    public Equivalencia(Long idEqui, String idUsuaCrea, Date feUsuaCrea, String deTermCrea) {
        this.idEqui = idEqui;
        this.idUsuaCrea = idUsuaCrea;
        this.feUsuaCrea = feUsuaCrea;
        this.deTermCrea = deTermCrea;
    }

    public Long getIdEqui() {
        return idEqui;
    }

    public void setIdEqui(Long idEqui) {
        this.idEqui = idEqui;
    }

    public String getIdUsua() {
        return idUsua;
    }

    public void setIdUsua(String idUsua) {
        this.idUsua = idUsua;
    }

    public String getIdUsuaSist() {
        return idUsuaSist;
    }

    public void setIdUsuaSist(String idUsuaSist) {
        this.idUsuaSist = idUsuaSist;
    }

    public String getIdSist() {
        return idSist;
    }

    public void setIdSist(String idSist) {
        this.idSist = idSist;
    }

    public String getIdUsuaCrea() {
        return idUsuaCrea;
    }

    public void setIdUsuaCrea(String idUsuaCrea) {
        this.idUsuaCrea = idUsuaCrea;
    }

    public Date getFeUsuaCrea() {
        return feUsuaCrea;
    }

    public void setFeUsuaCrea(Date feUsuaCrea) {
        this.feUsuaCrea = feUsuaCrea;
    }

    public String getDeTermCrea() {
        return deTermCrea;
    }

    public void setDeTermCrea(String deTermCrea) {
        this.deTermCrea = deTermCrea;
    }

    public String getIdUsuaModi() {
        return idUsuaModi;
    }

    public void setIdUsuaModi(String idUsuaModi) {
        this.idUsuaModi = idUsuaModi;
    }

    public Date getFeUsuaModi() {
        return feUsuaModi;
    }

    public void setFeUsuaModi(Date feUsuaModi) {
        this.feUsuaModi = feUsuaModi;
    }

    public String getDeTermModi() {
        return deTermModi;
    }

    public void setDeTermModi(String deTermModi) {
        this.deTermModi = deTermModi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEqui != null ? idEqui.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equivalencia)) {
            return false;
        }
        Equivalencia other = (Equivalencia) object;
        if ((this.idEqui == null && other.idEqui != null) || (this.idEqui != null && !this.idEqui.equals(other.idEqui))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.Equivalencia[ idEqui=" + idEqui + " ]";
    }
    
}
