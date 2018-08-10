/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.gmd.seguridad.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name = "INSTITUCION_FERIADO")
@NamedQueries({
    @NamedQuery(name = "InstitucionFeriado.findAll", query = "SELECT i FROM InstitucionFeriado i")})
public class InstitucionFeriado implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InstitucionFeriadoPK institucionFeriadoPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ST_INST_FERI")
    private Character stInstFeri;
    @Basic(optional = false)
    @NotNull
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "institucionFeriado", fetch = FetchType.LAZY)
    private List<InstitucionFeriadoHist> institucionFeriadoHistList;

    public InstitucionFeriado() {
    }

    public InstitucionFeriado(InstitucionFeriadoPK institucionFeriadoPK) {
        this.institucionFeriadoPK = institucionFeriadoPK;
    }

    public InstitucionFeriado(InstitucionFeriadoPK institucionFeriadoPK, Character stInstFeri, Character stRegi, String idUsuaCrea, Date feUsuaCrea, String deTermCrea) {
        this.institucionFeriadoPK = institucionFeriadoPK;
        this.stInstFeri = stInstFeri;
        this.stRegi = stRegi;
        this.idUsuaCrea = idUsuaCrea;
        this.feUsuaCrea = feUsuaCrea;
        this.deTermCrea = deTermCrea;
    }

    public InstitucionFeriado(int idFeriado, int idInstitucion) {
        this.institucionFeriadoPK = new InstitucionFeriadoPK(idFeriado, idInstitucion);
    }

    public InstitucionFeriadoPK getInstitucionFeriadoPK() {
        return institucionFeriadoPK;
    }

    public void setInstitucionFeriadoPK(InstitucionFeriadoPK institucionFeriadoPK) {
        this.institucionFeriadoPK = institucionFeriadoPK;
    }

    public Character getStInstFeri() {
        return stInstFeri;
    }

    public void setStInstFeri(Character stInstFeri) {
        this.stInstFeri = stInstFeri;
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

    public List<InstitucionFeriadoHist> getInstitucionFeriadoHistList() {
        return institucionFeriadoHistList;
    }

    public void setInstitucionFeriadoHistList(List<InstitucionFeriadoHist> institucionFeriadoHistList) {
        this.institucionFeriadoHistList = institucionFeriadoHistList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (institucionFeriadoPK != null ? institucionFeriadoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InstitucionFeriado)) {
            return false;
        }
        InstitucionFeriado other = (InstitucionFeriado) object;
        if ((this.institucionFeriadoPK == null && other.institucionFeriadoPK != null) || (this.institucionFeriadoPK != null && !this.institucionFeriadoPK.equals(other.institucionFeriadoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.InstitucionFeriado[ institucionFeriadoPK=" + institucionFeriadoPK + " ]";
    }
    
}
