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
@Table(name = "PERMISO")
@NamedQueries({
    @NamedQuery(name = "Permiso.findAll", query = "SELECT p FROM Permiso p")})
public class Permiso implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PermisoPK permisoPK;
    @Size(max = 21)
    @Column(name = "ID_PERM_PDR")
    private String idPermPdr;
    @Column(name = "UN_NIVE")
    private Short unNive;
    @Column(name = "ID_OPCI_APLI")
    private Integer idOpciApli;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NO_PERM")
    private String noPerm;
    @Size(max = 100)
    @Column(name = "NO_REGI_ACCN")
    private String noRegiAccn;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "TI_OBJ_PERM")
    private String tiObjPerm;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ST_PERM")
    private Character stPerm;
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
    @JoinColumn(name = "ID_SISTEMA", referencedColumnName = "ID_SISTEMA", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Sistema sistema;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "permiso", fetch = FetchType.LAZY)
    private List<PermisoHist> permisoHistList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "permiso", fetch = FetchType.LAZY)
    private List<UsuarioPermisoSegapsys> usuarioPermisoSegapsysList;

    public Permiso() {
    }

    public Permiso(PermisoPK permisoPK) {
        this.permisoPK = permisoPK;
    }

    public Permiso(PermisoPK permisoPK, String noPerm, String tiObjPerm, Character stPerm, Character stRegi, String idUsuaCrea, Date feUsuaCrea, String deTermCrea) {
        this.permisoPK = permisoPK;
        this.noPerm = noPerm;
        this.tiObjPerm = tiObjPerm;
        this.stPerm = stPerm;
        this.stRegi = stRegi;
        this.idUsuaCrea = idUsuaCrea;
        this.feUsuaCrea = feUsuaCrea;
        this.deTermCrea = deTermCrea;
    }

    public Permiso(String idPermiso, int idSistema) {
        this.permisoPK = new PermisoPK(idPermiso, idSistema);
    }

    public PermisoPK getPermisoPK() {
        return permisoPK;
    }

    public void setPermisoPK(PermisoPK permisoPK) {
        this.permisoPK = permisoPK;
    }

    public String getIdPermPdr() {
        return idPermPdr;
    }

    public void setIdPermPdr(String idPermPdr) {
        this.idPermPdr = idPermPdr;
    }

    public Short getUnNive() {
        return unNive;
    }

    public void setUnNive(Short unNive) {
        this.unNive = unNive;
    }

    public Integer getIdOpciApli() {
        return idOpciApli;
    }

    public void setIdOpciApli(Integer idOpciApli) {
        this.idOpciApli = idOpciApli;
    }

    public String getNoPerm() {
        return noPerm;
    }

    public void setNoPerm(String noPerm) {
        this.noPerm = noPerm;
    }

    public String getNoRegiAccn() {
        return noRegiAccn;
    }

    public void setNoRegiAccn(String noRegiAccn) {
        this.noRegiAccn = noRegiAccn;
    }

    public String getTiObjPerm() {
        return tiObjPerm;
    }

    public void setTiObjPerm(String tiObjPerm) {
        this.tiObjPerm = tiObjPerm;
    }

    public Character getStPerm() {
        return stPerm;
    }

    public void setStPerm(Character stPerm) {
        this.stPerm = stPerm;
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

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

    public List<PermisoHist> getPermisoHistList() {
        return permisoHistList;
    }

    public void setPermisoHistList(List<PermisoHist> permisoHistList) {
        this.permisoHistList = permisoHistList;
    }

    public List<UsuarioPermisoSegapsys> getUsuarioPermisoSegapsysList() {
        return usuarioPermisoSegapsysList;
    }

    public void setUsuarioPermisoSegapsysList(List<UsuarioPermisoSegapsys> usuarioPermisoSegapsysList) {
        this.usuarioPermisoSegapsysList = usuarioPermisoSegapsysList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (permisoPK != null ? permisoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Permiso)) {
            return false;
        }
        Permiso other = (Permiso) object;
        if ((this.permisoPK == null && other.permisoPK != null) || (this.permisoPK != null && !this.permisoPK.equals(other.permisoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.Permiso[ permisoPK=" + permisoPK + " ]";
    }
    
}
