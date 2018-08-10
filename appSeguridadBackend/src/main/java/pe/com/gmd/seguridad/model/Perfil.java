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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "PERFIL")
@NamedQueries({
    @NamedQuery(name = "Perfil.findAll", query = "SELECT p FROM Perfil p")})
public class Perfil implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PerfilPK perfilPK;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "perfil", fetch = FetchType.LAZY)
    private List<RolPerfil> rolPerfilList;
    @JoinColumn(name = "ID_SISTEMA", referencedColumnName = "ID_SISTEMA", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Sistema sistema;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "perfil", fetch = FetchType.LAZY)
    private List<PerfilHist> perfilHistList;

    public Perfil() {
    }

    public Perfil(PerfilPK perfilPK) {
        this.perfilPK = perfilPK;
    }

    public Perfil(PerfilPK perfilPK, String noPerf, String dePerf, Character stPerf, Character stRegi, String idUsuaCrea, Date feUsuaCrea, String deTermCrea) {
        this.perfilPK = perfilPK;
        this.noPerf = noPerf;
        this.dePerf = dePerf;
        this.stPerf = stPerf;
        this.stRegi = stRegi;
        this.idUsuaCrea = idUsuaCrea;
        this.feUsuaCrea = feUsuaCrea;
        this.deTermCrea = deTermCrea;
    }

    public Perfil(int idPerfil, int idSistema) {
        this.perfilPK = new PerfilPK(idPerfil, idSistema);
    }

    public PerfilPK getPerfilPK() {
        return perfilPK;
    }

    public void setPerfilPK(PerfilPK perfilPK) {
        this.perfilPK = perfilPK;
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

    public List<RolPerfil> getRolPerfilList() {
        return rolPerfilList;
    }

    public void setRolPerfilList(List<RolPerfil> rolPerfilList) {
        this.rolPerfilList = rolPerfilList;
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

    public List<PerfilHist> getPerfilHistList() {
        return perfilHistList;
    }

    public void setPerfilHistList(List<PerfilHist> perfilHistList) {
        this.perfilHistList = perfilHistList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (perfilPK != null ? perfilPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Perfil)) {
            return false;
        }
        Perfil other = (Perfil) object;
        if ((this.perfilPK == null && other.perfilPK != null) || (this.perfilPK != null && !this.perfilPK.equals(other.perfilPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.Perfil[ perfilPK=" + perfilPK + " ]";
    }
    
}
