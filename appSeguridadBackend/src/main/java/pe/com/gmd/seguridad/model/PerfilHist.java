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
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
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
@Table(name = "PERFIL_HIST")
@NamedQueries({
    @NamedQuery(name = "PerfilHist.findAll", query = "SELECT p FROM PerfilHist p")})
public class PerfilHist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PERF_HIST")
    private Integer idPerfHist;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "NO_PERF")
    private String noPerf;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "DE_PERF")
    private String dePerf;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ST_PERF")
    private Character stPerf;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ST_REGI")
    private Character stRegi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "ID_USUA_CREA_HIST")
    private String idUsuaCreaHist;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FE_USUA_CREA_HIST")
    @Temporal(TemporalType.TIMESTAMP)
    private Date feUsuaCreaHist;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 39)
    @Column(name = "DE_TERM_CREA_HIST")
    private String deTermCreaHist;
    @Size(max = 30)
    @Column(name = "ID_USUA_MODI_HIST")
    private String idUsuaModiHist;
    @Column(name = "FE_USUA_MODI_HIST")
    @Temporal(TemporalType.TIMESTAMP)
    private Date feUsuaModiHist;
    @Size(max = 39)
    @Column(name = "DE_TERM_MODI_HIST")
    private String deTermModiHist;
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
    @JoinColumns({
        @JoinColumn(name = "ID_PERFIL", referencedColumnName = "ID_PERFIL"),
        @JoinColumn(name = "ID_SISTEMA", referencedColumnName = "ID_SISTEMA")})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Perfil perfil;

    public PerfilHist() {
    }

    public PerfilHist(Integer idPerfHist) {
        this.idPerfHist = idPerfHist;
    }

    public PerfilHist(Integer idPerfHist, String noPerf, String dePerf, Character stPerf, Character stRegi, String idUsuaCreaHist, Date feUsuaCreaHist, String deTermCreaHist, String idUsuaCrea, Date feUsuaCrea, String deTermCrea) {
        this.idPerfHist = idPerfHist;
        this.noPerf = noPerf;
        this.dePerf = dePerf;
        this.stPerf = stPerf;
        this.stRegi = stRegi;
        this.idUsuaCreaHist = idUsuaCreaHist;
        this.feUsuaCreaHist = feUsuaCreaHist;
        this.deTermCreaHist = deTermCreaHist;
        this.idUsuaCrea = idUsuaCrea;
        this.feUsuaCrea = feUsuaCrea;
        this.deTermCrea = deTermCrea;
    }

    public Integer getIdPerfHist() {
        return idPerfHist;
    }

    public void setIdPerfHist(Integer idPerfHist) {
        this.idPerfHist = idPerfHist;
    }

    public String getNoPerf() {
        return noPerf;
    }

    public void setNoPerf(String noPerf) {
        this.noPerf = noPerf;
    }

    public String getDePerf() {
        return dePerf;
    }

    public void setDePerf(String dePerf) {
        this.dePerf = dePerf;
    }

    public Character getStPerf() {
        return stPerf;
    }

    public void setStPerf(Character stPerf) {
        this.stPerf = stPerf;
    }

    public Character getStRegi() {
        return stRegi;
    }

    public void setStRegi(Character stRegi) {
        this.stRegi = stRegi;
    }

    public String getIdUsuaCreaHist() {
        return idUsuaCreaHist;
    }

    public void setIdUsuaCreaHist(String idUsuaCreaHist) {
        this.idUsuaCreaHist = idUsuaCreaHist;
    }

    public Date getFeUsuaCreaHist() {
        return feUsuaCreaHist;
    }

    public void setFeUsuaCreaHist(Date feUsuaCreaHist) {
        this.feUsuaCreaHist = feUsuaCreaHist;
    }

    public String getDeTermCreaHist() {
        return deTermCreaHist;
    }

    public void setDeTermCreaHist(String deTermCreaHist) {
        this.deTermCreaHist = deTermCreaHist;
    }

    public String getIdUsuaModiHist() {
        return idUsuaModiHist;
    }

    public void setIdUsuaModiHist(String idUsuaModiHist) {
        this.idUsuaModiHist = idUsuaModiHist;
    }

    public Date getFeUsuaModiHist() {
        return feUsuaModiHist;
    }

    public void setFeUsuaModiHist(Date feUsuaModiHist) {
        this.feUsuaModiHist = feUsuaModiHist;
    }

    public String getDeTermModiHist() {
        return deTermModiHist;
    }

    public void setDeTermModiHist(String deTermModiHist) {
        this.deTermModiHist = deTermModiHist;
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

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPerfHist != null ? idPerfHist.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PerfilHist)) {
            return false;
        }
        PerfilHist other = (PerfilHist) object;
        if ((this.idPerfHist == null && other.idPerfHist != null) || (this.idPerfHist != null && !this.idPerfHist.equals(other.idPerfHist))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.PerfilHist[ idPerfHist=" + idPerfHist + " ]";
    }
    
}
