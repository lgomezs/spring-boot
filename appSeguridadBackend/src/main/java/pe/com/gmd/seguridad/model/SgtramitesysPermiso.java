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
@Table(name = "SGTRAMITESYS_PERMISO")
@NamedQueries({
    @NamedQuery(name = "SgtramitesysPermiso.findAll", query = "SELECT s FROM SgtramitesysPermiso s")})
public class SgtramitesysPermiso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 21)
    @Column(name = "ID_PERMISO")
    private String idPermiso;
    @Size(max = 21)
    @Column(name = "ID_PERM_PDR")
    private String idPermPdr;
    @Size(max = 100)
    @Column(name = "NO_REGI_ACCION")
    private String noRegiAccion;
    @Size(max = 100)
    @Column(name = "TX_NOMB_PERMISO")
    private String txNombPermiso;
    @Column(name = "UN_NIVE")
    private Short unNive;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sgtramitesysPermiso", fetch = FetchType.LAZY)
    private List<SgtramitesysPerfilPermiso> sgtramitesysPerfilPermisoList;

    public SgtramitesysPermiso() {
    }

    public SgtramitesysPermiso(String idPermiso) {
        this.idPermiso = idPermiso;
    }

    public SgtramitesysPermiso(String idPermiso, String idUsuaCrea, Date feUsuaCrea, String deTermCrea) {
        this.idPermiso = idPermiso;
        this.idUsuaCrea = idUsuaCrea;
        this.feUsuaCrea = feUsuaCrea;
        this.deTermCrea = deTermCrea;
    }

    public String getIdPermiso() {
        return idPermiso;
    }

    public void setIdPermiso(String idPermiso) {
        this.idPermiso = idPermiso;
    }

    public String getIdPermPdr() {
        return idPermPdr;
    }

    public void setIdPermPdr(String idPermPdr) {
        this.idPermPdr = idPermPdr;
    }

    public String getNoRegiAccion() {
        return noRegiAccion;
    }

    public void setNoRegiAccion(String noRegiAccion) {
        this.noRegiAccion = noRegiAccion;
    }

    public String getTxNombPermiso() {
        return txNombPermiso;
    }

    public void setTxNombPermiso(String txNombPermiso) {
        this.txNombPermiso = txNombPermiso;
    }

    public Short getUnNive() {
        return unNive;
    }

    public void setUnNive(Short unNive) {
        this.unNive = unNive;
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

    public List<SgtramitesysPerfilPermiso> getSgtramitesysPerfilPermisoList() {
        return sgtramitesysPerfilPermisoList;
    }

    public void setSgtramitesysPerfilPermisoList(List<SgtramitesysPerfilPermiso> sgtramitesysPerfilPermisoList) {
        this.sgtramitesysPerfilPermisoList = sgtramitesysPerfilPermisoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPermiso != null ? idPermiso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SgtramitesysPermiso)) {
            return false;
        }
        SgtramitesysPermiso other = (SgtramitesysPermiso) object;
        if ((this.idPermiso == null && other.idPermiso != null) || (this.idPermiso != null && !this.idPermiso.equals(other.idPermiso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.SgtramitesysPermiso[ idPermiso=" + idPermiso + " ]";
    }
    
}
