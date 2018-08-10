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
@Table(name = "SGTRAMITESYS_USUARIO")
@NamedQueries({
    @NamedQuery(name = "SgtramitesysUsuario.findAll", query = "SELECT s FROM SgtramitesysUsuario s")})
public class SgtramitesysUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_USUARIO")
    private Integer idUsuario;
    @Size(max = 40)
    @Column(name = "NO_NOMB_USUA")
    private String noNombUsua;
    @Size(max = 40)
    @Column(name = "AP_PTNO_USUA")
    private String apPtnoUsua;
    @Size(max = 40)
    @Column(name = "AP_MTNO_USUA")
    private String apMtnoUsua;
    @Size(max = 20)
    @Column(name = "LG_USUA")
    private String lgUsua;
    @Column(name = "ST_ESTA")
    private Character stEsta;
    @Column(name = "ST_REGI")
    private Character stRegi;
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

    public SgtramitesysUsuario() {
    }

    public SgtramitesysUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public SgtramitesysUsuario(Integer idUsuario, String idUsuaCrea, Date feUsuaCrea, String deTermCrea) {
        this.idUsuario = idUsuario;
        this.idUsuaCrea = idUsuaCrea;
        this.feUsuaCrea = feUsuaCrea;
        this.deTermCrea = deTermCrea;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNoNombUsua() {
        return noNombUsua;
    }

    public void setNoNombUsua(String noNombUsua) {
        this.noNombUsua = noNombUsua;
    }

    public String getApPtnoUsua() {
        return apPtnoUsua;
    }

    public void setApPtnoUsua(String apPtnoUsua) {
        this.apPtnoUsua = apPtnoUsua;
    }

    public String getApMtnoUsua() {
        return apMtnoUsua;
    }

    public void setApMtnoUsua(String apMtnoUsua) {
        this.apMtnoUsua = apMtnoUsua;
    }

    public String getLgUsua() {
        return lgUsua;
    }

    public void setLgUsua(String lgUsua) {
        this.lgUsua = lgUsua;
    }

    public Character getStEsta() {
        return stEsta;
    }

    public void setStEsta(Character stEsta) {
        this.stEsta = stEsta;
    }

    public Character getStRegi() {
        return stRegi;
    }

    public void setStRegi(Character stRegi) {
        this.stRegi = stRegi;
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
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SgtramitesysUsuario)) {
            return false;
        }
        SgtramitesysUsuario other = (SgtramitesysUsuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.SgtramitesysUsuario[ idUsuario=" + idUsuario + " ]";
    }
    
}
