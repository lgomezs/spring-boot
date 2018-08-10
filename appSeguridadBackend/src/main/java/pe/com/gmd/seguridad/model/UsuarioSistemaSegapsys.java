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
@Table(name = "USUARIO_SISTEMA_SEGAPSYS")
@NamedQueries({
    @NamedQuery(name = "UsuarioSistemaSegapsys.findAll", query = "SELECT u FROM UsuarioSistemaSegapsys u")})
public class UsuarioSistemaSegapsys implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsuarioSistemaSegapsysPK usuarioSistemaSegapsysPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_USUA_PREV")
    private int idUsuaPrev;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_SIST_PREV")
    private int idSistPrev;
    @Column(name = "FE_INI_VIGE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date feIniVige;
    @Column(name = "FE_FIN_VIGE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date feFinVige;
    @Column(name = "ST_USUA_SIST")
    private Character stUsuaSist;
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
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario usuario;

    public UsuarioSistemaSegapsys() {
    }

    public UsuarioSistemaSegapsys(UsuarioSistemaSegapsysPK usuarioSistemaSegapsysPK) {
        this.usuarioSistemaSegapsysPK = usuarioSistemaSegapsysPK;
    }

    public UsuarioSistemaSegapsys(UsuarioSistemaSegapsysPK usuarioSistemaSegapsysPK, int idUsuaPrev, int idSistPrev, String idUsuaCrea, Date feUsuaCrea, String deTermCrea) {
        this.usuarioSistemaSegapsysPK = usuarioSistemaSegapsysPK;
        this.idUsuaPrev = idUsuaPrev;
        this.idSistPrev = idSistPrev;
        this.idUsuaCrea = idUsuaCrea;
        this.feUsuaCrea = feUsuaCrea;
        this.deTermCrea = deTermCrea;
    }

    public UsuarioSistemaSegapsys(int idUsuario, int idSistema) {
        this.usuarioSistemaSegapsysPK = new UsuarioSistemaSegapsysPK(idUsuario, idSistema);
    }

    public UsuarioSistemaSegapsysPK getUsuarioSistemaSegapsysPK() {
        return usuarioSistemaSegapsysPK;
    }

    public void setUsuarioSistemaSegapsysPK(UsuarioSistemaSegapsysPK usuarioSistemaSegapsysPK) {
        this.usuarioSistemaSegapsysPK = usuarioSistemaSegapsysPK;
    }

    public int getIdUsuaPrev() {
        return idUsuaPrev;
    }

    public void setIdUsuaPrev(int idUsuaPrev) {
        this.idUsuaPrev = idUsuaPrev;
    }

    public int getIdSistPrev() {
        return idSistPrev;
    }

    public void setIdSistPrev(int idSistPrev) {
        this.idSistPrev = idSistPrev;
    }

    public Date getFeIniVige() {
        return feIniVige;
    }

    public void setFeIniVige(Date feIniVige) {
        this.feIniVige = feIniVige;
    }

    public Date getFeFinVige() {
        return feFinVige;
    }

    public void setFeFinVige(Date feFinVige) {
        this.feFinVige = feFinVige;
    }

    public Character getStUsuaSist() {
        return stUsuaSist;
    }

    public void setStUsuaSist(Character stUsuaSist) {
        this.stUsuaSist = stUsuaSist;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usuarioSistemaSegapsysPK != null ? usuarioSistemaSegapsysPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioSistemaSegapsys)) {
            return false;
        }
        UsuarioSistemaSegapsys other = (UsuarioSistemaSegapsys) object;
        if ((this.usuarioSistemaSegapsysPK == null && other.usuarioSistemaSegapsysPK != null) || (this.usuarioSistemaSegapsysPK != null && !this.usuarioSistemaSegapsysPK.equals(other.usuarioSistemaSegapsysPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.UsuarioSistemaSegapsys[ usuarioSistemaSegapsysPK=" + usuarioSistemaSegapsysPK + " ]";
    }
    
}
