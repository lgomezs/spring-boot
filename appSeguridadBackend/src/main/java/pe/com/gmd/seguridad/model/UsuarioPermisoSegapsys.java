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
@Table(name = "USUARIO_PERMISO_SEGAPSYS")
@NamedQueries({
    @NamedQuery(name = "UsuarioPermisoSegapsys.findAll", query = "SELECT u FROM UsuarioPermisoSegapsys u")})
public class UsuarioPermisoSegapsys implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsuarioPermisoSegapsysPK usuarioPermisoSegapsysPK;
    @Column(name = "ID_USUA_PREV")
    private Integer idUsuaPrev;
    @Size(max = 21)
    @Column(name = "ID_PERM_PREV")
    private String idPermPrev;
    @Column(name = "ID_SIST_PREV")
    private Integer idSistPrev;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ST_USUA_PERM")
    private Character stUsuaPerm;
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
    @JoinColumns({
        @JoinColumn(name = "ID_PERMISO", referencedColumnName = "ID_PERMISO", insertable = false, updatable = false),
        @JoinColumn(name = "ID_SISTEMA", referencedColumnName = "ID_SISTEMA", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Permiso permiso;
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario usuario;

    public UsuarioPermisoSegapsys() {
    }

    public UsuarioPermisoSegapsys(UsuarioPermisoSegapsysPK usuarioPermisoSegapsysPK) {
        this.usuarioPermisoSegapsysPK = usuarioPermisoSegapsysPK;
    }

    public UsuarioPermisoSegapsys(UsuarioPermisoSegapsysPK usuarioPermisoSegapsysPK, Character stUsuaPerm, Character stRegi, String idUsuaCrea, Date feUsuaCrea, String deTermCrea) {
        this.usuarioPermisoSegapsysPK = usuarioPermisoSegapsysPK;
        this.stUsuaPerm = stUsuaPerm;
        this.stRegi = stRegi;
        this.idUsuaCrea = idUsuaCrea;
        this.feUsuaCrea = feUsuaCrea;
        this.deTermCrea = deTermCrea;
    }

    public UsuarioPermisoSegapsys(int idUsuario, String idPermiso, int idSistema) {
        this.usuarioPermisoSegapsysPK = new UsuarioPermisoSegapsysPK(idUsuario, idPermiso, idSistema);
    }

    public UsuarioPermisoSegapsysPK getUsuarioPermisoSegapsysPK() {
        return usuarioPermisoSegapsysPK;
    }

    public void setUsuarioPermisoSegapsysPK(UsuarioPermisoSegapsysPK usuarioPermisoSegapsysPK) {
        this.usuarioPermisoSegapsysPK = usuarioPermisoSegapsysPK;
    }

    public Integer getIdUsuaPrev() {
        return idUsuaPrev;
    }

    public void setIdUsuaPrev(Integer idUsuaPrev) {
        this.idUsuaPrev = idUsuaPrev;
    }

    public String getIdPermPrev() {
        return idPermPrev;
    }

    public void setIdPermPrev(String idPermPrev) {
        this.idPermPrev = idPermPrev;
    }

    public Integer getIdSistPrev() {
        return idSistPrev;
    }

    public void setIdSistPrev(Integer idSistPrev) {
        this.idSistPrev = idSistPrev;
    }

    public Character getStUsuaPerm() {
        return stUsuaPerm;
    }

    public void setStUsuaPerm(Character stUsuaPerm) {
        this.stUsuaPerm = stUsuaPerm;
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

    public Permiso getPermiso() {
        return permiso;
    }

    public void setPermiso(Permiso permiso) {
        this.permiso = permiso;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usuarioPermisoSegapsysPK != null ? usuarioPermisoSegapsysPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioPermisoSegapsys)) {
            return false;
        }
        UsuarioPermisoSegapsys other = (UsuarioPermisoSegapsys) object;
        if ((this.usuarioPermisoSegapsysPK == null && other.usuarioPermisoSegapsysPK != null) || (this.usuarioPermisoSegapsysPK != null && !this.usuarioPermisoSegapsysPK.equals(other.usuarioPermisoSegapsysPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.UsuarioPermisoSegapsys[ usuarioPermisoSegapsysPK=" + usuarioPermisoSegapsysPK + " ]";
    }
    
}
