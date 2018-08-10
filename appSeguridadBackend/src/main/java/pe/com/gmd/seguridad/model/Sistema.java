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
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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
@Table(name = "SISTEMA")
@NamedQueries({
    @NamedQuery(name = "Sistema.findAll", query = "SELECT s FROM Sistema s")})
public class Sistema implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_SISTEMA")
    private Integer idSistema;
    @Size(max = 150)
    @Column(name = "DE_SIST")
    private String deSist;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NO_SIST")
    private String noSist;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "TI_SIST")
    private String tiSist;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ST_SIST")
    private Character stSist;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ST_REGI")
    private Character stRegi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IN_VER")
    private Character inVer;
    @Size(max = 300)
    @Column(name = "RU_SIST")
    private String ruSist;
    @Column(name = "IN_ADM_PERF")
    private Character inAdmPerf;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "IN_CONP")
    private Character inConp;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sistema", fetch = FetchType.LAZY)
    private List<UsuarioSistemaSegapsys> usuarioSistemaSegapsysList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sistema", fetch = FetchType.LAZY)
    private List<Permiso> permisoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sistema", fetch = FetchType.LAZY)
    private List<Perfil> perfilList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSistema", fetch = FetchType.LAZY)
    private List<SistemaHist> sistemaHistList;

    public Sistema() {
    }

    public Sistema(Integer idSistema) {
        this.idSistema = idSistema;
    }

    public Sistema(Integer idSistema, String noSist, String tiSist, Character stSist, Character stRegi, Character inVer, String idUsuaCrea, Date feUsuaCrea, String deTermCrea, Character inConp) {
        this.idSistema = idSistema;
        this.noSist = noSist;
        this.tiSist = tiSist;
        this.stSist = stSist;
        this.stRegi = stRegi;
        this.inVer = inVer;
        this.idUsuaCrea = idUsuaCrea;
        this.feUsuaCrea = feUsuaCrea;
        this.deTermCrea = deTermCrea;
        this.inConp = inConp;
    }

    public Integer getIdSistema() {
        return idSistema;
    }

    public void setIdSistema(Integer idSistema) {
        this.idSistema = idSistema;
    }

    public String getDeSist() {
        return deSist;
    }

    public void setDeSist(String deSist) {
        this.deSist = deSist;
    }

    public String getNoSist() {
        return noSist;
    }

    public void setNoSist(String noSist) {
        this.noSist = noSist;
    }

    public String getTiSist() {
        return tiSist;
    }

    public void setTiSist(String tiSist) {
        this.tiSist = tiSist;
    }

    public Character getStSist() {
        return stSist;
    }

    public void setStSist(Character stSist) {
        this.stSist = stSist;
    }

    public Character getStRegi() {
        return stRegi;
    }

    public void setStRegi(Character stRegi) {
        this.stRegi = stRegi;
    }

    public Character getInVer() {
        return inVer;
    }

    public void setInVer(Character inVer) {
        this.inVer = inVer;
    }

    public String getRuSist() {
        return ruSist;
    }

    public void setRuSist(String ruSist) {
        this.ruSist = ruSist;
    }

    public Character getInAdmPerf() {
        return inAdmPerf;
    }

    public void setInAdmPerf(Character inAdmPerf) {
        this.inAdmPerf = inAdmPerf;
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

    public Character getInConp() {
        return inConp;
    }

    public void setInConp(Character inConp) {
        this.inConp = inConp;
    }

    public List<UsuarioSistemaSegapsys> getUsuarioSistemaSegapsysList() {
        return usuarioSistemaSegapsysList;
    }

    public void setUsuarioSistemaSegapsysList(List<UsuarioSistemaSegapsys> usuarioSistemaSegapsysList) {
        this.usuarioSistemaSegapsysList = usuarioSistemaSegapsysList;
    }

    public List<Permiso> getPermisoList() {
        return permisoList;
    }

    public void setPermisoList(List<Permiso> permisoList) {
        this.permisoList = permisoList;
    }

    public List<Perfil> getPerfilList() {
        return perfilList;
    }

    public void setPerfilList(List<Perfil> perfilList) {
        this.perfilList = perfilList;
    }

    public List<SistemaHist> getSistemaHistList() {
        return sistemaHistList;
    }

    public void setSistemaHistList(List<SistemaHist> sistemaHistList) {
        this.sistemaHistList = sistemaHistList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSistema != null ? idSistema.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sistema)) {
            return false;
        }
        Sistema other = (Sistema) object;
        if ((this.idSistema == null && other.idSistema != null) || (this.idSistema != null && !this.idSistema.equals(other.idSistema))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.Sistema[ idSistema=" + idSistema + " ]";
    }
    
}
