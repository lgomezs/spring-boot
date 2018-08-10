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
import javax.persistence.JoinColumns;
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
@Table(name = "ROL_PERFIL")
@NamedQueries({
    @NamedQuery(name = "RolPerfil.findAll", query = "SELECT r FROM RolPerfil r")})
public class RolPerfil implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RolPerfilPK rolPerfilPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ST_ROL_PERF")
    private Character stRolPerf;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rolPerfil", fetch = FetchType.LAZY)
    private List<RolPerfilHist> rolPerfilHistList;
    @JoinColumns({
        @JoinColumn(name = "ID_PERFIL", referencedColumnName = "ID_PERFIL", insertable = false, updatable = false),
        @JoinColumn(name = "ID_SISTEMA", referencedColumnName = "ID_SISTEMA", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Perfil perfil;
    @JoinColumn(name = "ID_ROL", referencedColumnName = "ID_ROL", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Rol rol;

    public RolPerfil() {
    }

    public RolPerfil(RolPerfilPK rolPerfilPK) {
        this.rolPerfilPK = rolPerfilPK;
    }

    public RolPerfil(RolPerfilPK rolPerfilPK, Character stRolPerf, Character stRegi, String idUsuaCrea, Date feUsuaCrea, String deTermCrea) {
        this.rolPerfilPK = rolPerfilPK;
        this.stRolPerf = stRolPerf;
        this.stRegi = stRegi;
        this.idUsuaCrea = idUsuaCrea;
        this.feUsuaCrea = feUsuaCrea;
        this.deTermCrea = deTermCrea;
    }

    public RolPerfil(int idRol, int idPerfil, int idSistema) {
        this.rolPerfilPK = new RolPerfilPK(idRol, idPerfil, idSistema);
    }

    public RolPerfilPK getRolPerfilPK() {
        return rolPerfilPK;
    }

    public void setRolPerfilPK(RolPerfilPK rolPerfilPK) {
        this.rolPerfilPK = rolPerfilPK;
    }

    public Character getStRolPerf() {
        return stRolPerf;
    }

    public void setStRolPerf(Character stRolPerf) {
        this.stRolPerf = stRolPerf;
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

    public List<RolPerfilHist> getRolPerfilHistList() {
        return rolPerfilHistList;
    }

    public void setRolPerfilHistList(List<RolPerfilHist> rolPerfilHistList) {
        this.rolPerfilHistList = rolPerfilHistList;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rolPerfilPK != null ? rolPerfilPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RolPerfil)) {
            return false;
        }
        RolPerfil other = (RolPerfil) object;
        if ((this.rolPerfilPK == null && other.rolPerfilPK != null) || (this.rolPerfilPK != null && !this.rolPerfilPK.equals(other.rolPerfilPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.RolPerfil[ rolPerfilPK=" + rolPerfilPK + " ]";
    }
    
}
