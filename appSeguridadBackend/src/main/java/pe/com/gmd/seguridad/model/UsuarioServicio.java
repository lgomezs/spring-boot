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
@Table(name = "USUARIO_SERVICIO")
@NamedQueries({
    @NamedQuery(name = "UsuarioServicio.findAll", query = "SELECT u FROM UsuarioServicio u")})
public class UsuarioServicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsuarioServicioPK usuarioServicioPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FE_INI_VINC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date feIniVinc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FE_FIN_VINC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date feFinVinc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ST_USUA_SERV")
    private Character stUsuaServ;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ST_REGI")
    private Character stRegi;
    @Size(max = 250)
    @Column(name = "TX_OBSE")
    private String txObse;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioServicio", fetch = FetchType.LAZY)
    private List<UsuarioServicioHist> usuarioServicioHistList;
    @JoinColumn(name = "ID_SERVICIO", referencedColumnName = "ID_SERVICIO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Servicio servicio;
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario usuario;

    public UsuarioServicio() {
    }

    public UsuarioServicio(UsuarioServicioPK usuarioServicioPK) {
        this.usuarioServicioPK = usuarioServicioPK;
    }

    public UsuarioServicio(UsuarioServicioPK usuarioServicioPK, Date feIniVinc, Date feFinVinc, Character stUsuaServ, Character stRegi, String idUsuaCrea, Date feUsuaCrea, String deTermCrea) {
        this.usuarioServicioPK = usuarioServicioPK;
        this.feIniVinc = feIniVinc;
        this.feFinVinc = feFinVinc;
        this.stUsuaServ = stUsuaServ;
        this.stRegi = stRegi;
        this.idUsuaCrea = idUsuaCrea;
        this.feUsuaCrea = feUsuaCrea;
        this.deTermCrea = deTermCrea;
    }

    public UsuarioServicio(int idUsuario, int idServicio) {
        this.usuarioServicioPK = new UsuarioServicioPK(idUsuario, idServicio);
    }

    public UsuarioServicioPK getUsuarioServicioPK() {
        return usuarioServicioPK;
    }

    public void setUsuarioServicioPK(UsuarioServicioPK usuarioServicioPK) {
        this.usuarioServicioPK = usuarioServicioPK;
    }

    public Date getFeIniVinc() {
        return feIniVinc;
    }

    public void setFeIniVinc(Date feIniVinc) {
        this.feIniVinc = feIniVinc;
    }

    public Date getFeFinVinc() {
        return feFinVinc;
    }

    public void setFeFinVinc(Date feFinVinc) {
        this.feFinVinc = feFinVinc;
    }

    public Character getStUsuaServ() {
        return stUsuaServ;
    }

    public void setStUsuaServ(Character stUsuaServ) {
        this.stUsuaServ = stUsuaServ;
    }

    public Character getStRegi() {
        return stRegi;
    }

    public void setStRegi(Character stRegi) {
        this.stRegi = stRegi;
    }

    public String getTxObse() {
        return txObse;
    }

    public void setTxObse(String txObse) {
        this.txObse = txObse;
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

    public List<UsuarioServicioHist> getUsuarioServicioHistList() {
        return usuarioServicioHistList;
    }

    public void setUsuarioServicioHistList(List<UsuarioServicioHist> usuarioServicioHistList) {
        this.usuarioServicioHistList = usuarioServicioHistList;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
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
        hash += (usuarioServicioPK != null ? usuarioServicioPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioServicio)) {
            return false;
        }
        UsuarioServicio other = (UsuarioServicio) object;
        if ((this.usuarioServicioPK == null && other.usuarioServicioPK != null) || (this.usuarioServicioPK != null && !this.usuarioServicioPK.equals(other.usuarioServicioPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.UsuarioServicio[ usuarioServicioPK=" + usuarioServicioPK + " ]";
    }
    
}
