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
@Table(name = "USUARIO_SERVICIO_HIST")
@NamedQueries({
    @NamedQuery(name = "UsuarioServicioHist.findAll", query = "SELECT u FROM UsuarioServicioHist u")})
public class UsuarioServicioHist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_USUA_SERV_HIST")
    private Integer idUsuaServHist;
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
        @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO"),
        @JoinColumn(name = "ID_SERVICIO", referencedColumnName = "ID_SERVICIO")})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private UsuarioServicio usuarioServicio;

    public UsuarioServicioHist() {
    }

    public UsuarioServicioHist(Integer idUsuaServHist) {
        this.idUsuaServHist = idUsuaServHist;
    }

    public UsuarioServicioHist(Integer idUsuaServHist, Date feIniVinc, Date feFinVinc, Character stUsuaServ, Character stRegi, String idUsuaCreaHist, Date feUsuaCreaHist, String deTermCreaHist, String idUsuaCrea, Date feUsuaCrea, String deTermCrea) {
        this.idUsuaServHist = idUsuaServHist;
        this.feIniVinc = feIniVinc;
        this.feFinVinc = feFinVinc;
        this.stUsuaServ = stUsuaServ;
        this.stRegi = stRegi;
        this.idUsuaCreaHist = idUsuaCreaHist;
        this.feUsuaCreaHist = feUsuaCreaHist;
        this.deTermCreaHist = deTermCreaHist;
        this.idUsuaCrea = idUsuaCrea;
        this.feUsuaCrea = feUsuaCrea;
        this.deTermCrea = deTermCrea;
    }

    public Integer getIdUsuaServHist() {
        return idUsuaServHist;
    }

    public void setIdUsuaServHist(Integer idUsuaServHist) {
        this.idUsuaServHist = idUsuaServHist;
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

    public UsuarioServicio getUsuarioServicio() {
        return usuarioServicio;
    }

    public void setUsuarioServicio(UsuarioServicio usuarioServicio) {
        this.usuarioServicio = usuarioServicio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuaServHist != null ? idUsuaServHist.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioServicioHist)) {
            return false;
        }
        UsuarioServicioHist other = (UsuarioServicioHist) object;
        if ((this.idUsuaServHist == null && other.idUsuaServHist != null) || (this.idUsuaServHist != null && !this.idUsuaServHist.equals(other.idUsuaServHist))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.UsuarioServicioHist[ idUsuaServHist=" + idUsuaServHist + " ]";
    }
    
}
