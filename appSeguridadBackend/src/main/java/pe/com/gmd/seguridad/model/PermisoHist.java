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
@Table(name = "PERMISO_HIST")
@NamedQueries({
    @NamedQuery(name = "PermisoHist.findAll", query = "SELECT p FROM PermisoHist p")})
public class PermisoHist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PERM_HIST")
    private Integer idPermHist;
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
        @JoinColumn(name = "ID_PERMISO", referencedColumnName = "ID_PERMISO"),
        @JoinColumn(name = "ID_SISTEMA", referencedColumnName = "ID_SISTEMA")})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Permiso permiso;

    public PermisoHist() {
    }

    public PermisoHist(Integer idPermHist) {
        this.idPermHist = idPermHist;
    }

    public PermisoHist(Integer idPermHist, String noPerm, String tiObjPerm, Character stPerm, Character stRegi, String idUsuaCreaHist, Date feUsuaCreaHist, String deTermCreaHist, String idUsuaCrea, Date feUsuaCrea, String deTermCrea) {
        this.idPermHist = idPermHist;
        this.noPerm = noPerm;
        this.tiObjPerm = tiObjPerm;
        this.stPerm = stPerm;
        this.stRegi = stRegi;
        this.idUsuaCreaHist = idUsuaCreaHist;
        this.feUsuaCreaHist = feUsuaCreaHist;
        this.deTermCreaHist = deTermCreaHist;
        this.idUsuaCrea = idUsuaCrea;
        this.feUsuaCrea = feUsuaCrea;
        this.deTermCrea = deTermCrea;
    }

    public Integer getIdPermHist() {
        return idPermHist;
    }

    public void setIdPermHist(Integer idPermHist) {
        this.idPermHist = idPermHist;
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

    public Permiso getPermiso() {
        return permiso;
    }

    public void setPermiso(Permiso permiso) {
        this.permiso = permiso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPermHist != null ? idPermHist.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PermisoHist)) {
            return false;
        }
        PermisoHist other = (PermisoHist) object;
        if ((this.idPermHist == null && other.idPermHist != null) || (this.idPermHist != null && !this.idPermHist.equals(other.idPermHist))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.PermisoHist[ idPermHist=" + idPermHist + " ]";
    }
    
}
