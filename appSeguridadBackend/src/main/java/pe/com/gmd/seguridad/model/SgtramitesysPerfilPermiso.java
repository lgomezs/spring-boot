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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
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
@Table(name = "SGTRAMITESYS_PERFIL_PERMISO")
@NamedQueries({
    @NamedQuery(name = "SgtramitesysPerfilPermiso.findAll", query = "SELECT s FROM SgtramitesysPerfilPermiso s")})
public class SgtramitesysPerfilPermiso implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SgtramitesysPerfilPermisoPK sgtramitesysPerfilPermisoPK;
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
    @JoinColumn(name = "ID_PERFIL", referencedColumnName = "ID_PERFIL", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SgtramitesysPerfil sgtramitesysPerfil;
    @JoinColumn(name = "ID_PERMISO", referencedColumnName = "ID_PERMISO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SgtramitesysPermiso sgtramitesysPermiso;

    public SgtramitesysPerfilPermiso() {
    }

    public SgtramitesysPerfilPermiso(SgtramitesysPerfilPermisoPK sgtramitesysPerfilPermisoPK) {
        this.sgtramitesysPerfilPermisoPK = sgtramitesysPerfilPermisoPK;
    }

    public SgtramitesysPerfilPermiso(SgtramitesysPerfilPermisoPK sgtramitesysPerfilPermisoPK, String idUsuaCrea, Date feUsuaCrea, String deTermCrea) {
        this.sgtramitesysPerfilPermisoPK = sgtramitesysPerfilPermisoPK;
        this.idUsuaCrea = idUsuaCrea;
        this.feUsuaCrea = feUsuaCrea;
        this.deTermCrea = deTermCrea;
    }

    public SgtramitesysPerfilPermiso(String idPermiso, int idPerfil) {
        this.sgtramitesysPerfilPermisoPK = new SgtramitesysPerfilPermisoPK(idPermiso, idPerfil);
    }

    public SgtramitesysPerfilPermisoPK getSgtramitesysPerfilPermisoPK() {
        return sgtramitesysPerfilPermisoPK;
    }

    public void setSgtramitesysPerfilPermisoPK(SgtramitesysPerfilPermisoPK sgtramitesysPerfilPermisoPK) {
        this.sgtramitesysPerfilPermisoPK = sgtramitesysPerfilPermisoPK;
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

    public SgtramitesysPerfil getSgtramitesysPerfil() {
        return sgtramitesysPerfil;
    }

    public void setSgtramitesysPerfil(SgtramitesysPerfil sgtramitesysPerfil) {
        this.sgtramitesysPerfil = sgtramitesysPerfil;
    }

    public SgtramitesysPermiso getSgtramitesysPermiso() {
        return sgtramitesysPermiso;
    }

    public void setSgtramitesysPermiso(SgtramitesysPermiso sgtramitesysPermiso) {
        this.sgtramitesysPermiso = sgtramitesysPermiso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sgtramitesysPerfilPermisoPK != null ? sgtramitesysPerfilPermisoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SgtramitesysPerfilPermiso)) {
            return false;
        }
        SgtramitesysPerfilPermiso other = (SgtramitesysPerfilPermiso) object;
        if ((this.sgtramitesysPerfilPermisoPK == null && other.sgtramitesysPerfilPermisoPK != null) || (this.sgtramitesysPerfilPermisoPK != null && !this.sgtramitesysPerfilPermisoPK.equals(other.sgtramitesysPerfilPermisoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.SgtramitesysPerfilPermiso[ sgtramitesysPerfilPermisoPK=" + sgtramitesysPerfilPermisoPK + " ]";
    }
    
}
