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
@Table(name = "SERVICIO_HIST")
@NamedQueries({
    @NamedQuery(name = "ServicioHist.findAll", query = "SELECT s FROM ServicioHist s")})
public class ServicioHist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_SERV_HIST")
    private Integer idServHist;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_INSTITUCION")
    private int idInstitucion;
    @Column(name = "ID_SERV_PDR")
    private Integer idServPdr;
    @Column(name = "UN_NIVE")
    private Short unNive;
    @Size(max = 50)
    @Column(name = "TI_SERV")
    private String tiServ;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "NO_SERV")
    private String noServ;
    @Size(max = 30)
    @Column(name = "TX_NUME_CONT")
    private String txNumeCont;
    @Size(max = 50)
    @Column(name = "TI_CONV")
    private String tiConv;
    @Size(max = 20)
    @Column(name = "TX_NUME_CONV")
    private String txNumeConv;
    @Size(max = 10)
    @Column(name = "AA_CONV")
    private String aaConv;
    @Column(name = "FE_INI_CONT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date feIniCont;
    @Column(name = "FE_FIN_CONT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date feFinCont;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ST_SERV")
    private Character stServ;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ST_REGI")
    private Character stRegi;
    @Size(max = 3)
    @Column(name = "TX_PREF_SERV")
    private String txPrefServ;
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
    @JoinColumn(name = "ID_SERVICIO", referencedColumnName = "ID_SERVICIO")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Servicio idServicio;

    public ServicioHist() {
    }

    public ServicioHist(Integer idServHist) {
        this.idServHist = idServHist;
    }

    public ServicioHist(Integer idServHist, int idInstitucion, String noServ, Character stServ, Character stRegi, String idUsuaCreaHist, Date feUsuaCreaHist, String deTermCreaHist, String idUsuaCrea, Date feUsuaCrea, String deTermCrea) {
        this.idServHist = idServHist;
        this.idInstitucion = idInstitucion;
        this.noServ = noServ;
        this.stServ = stServ;
        this.stRegi = stRegi;
        this.idUsuaCreaHist = idUsuaCreaHist;
        this.feUsuaCreaHist = feUsuaCreaHist;
        this.deTermCreaHist = deTermCreaHist;
        this.idUsuaCrea = idUsuaCrea;
        this.feUsuaCrea = feUsuaCrea;
        this.deTermCrea = deTermCrea;
    }

    public Integer getIdServHist() {
        return idServHist;
    }

    public void setIdServHist(Integer idServHist) {
        this.idServHist = idServHist;
    }

    public int getIdInstitucion() {
        return idInstitucion;
    }

    public void setIdInstitucion(int idInstitucion) {
        this.idInstitucion = idInstitucion;
    }

    public Integer getIdServPdr() {
        return idServPdr;
    }

    public void setIdServPdr(Integer idServPdr) {
        this.idServPdr = idServPdr;
    }

    public Short getUnNive() {
        return unNive;
    }

    public void setUnNive(Short unNive) {
        this.unNive = unNive;
    }

    public String getTiServ() {
        return tiServ;
    }

    public void setTiServ(String tiServ) {
        this.tiServ = tiServ;
    }

    public String getNoServ() {
        return noServ;
    }

    public void setNoServ(String noServ) {
        this.noServ = noServ;
    }

    public String getTxNumeCont() {
        return txNumeCont;
    }

    public void setTxNumeCont(String txNumeCont) {
        this.txNumeCont = txNumeCont;
    }

    public String getTiConv() {
        return tiConv;
    }

    public void setTiConv(String tiConv) {
        this.tiConv = tiConv;
    }

    public String getTxNumeConv() {
        return txNumeConv;
    }

    public void setTxNumeConv(String txNumeConv) {
        this.txNumeConv = txNumeConv;
    }

    public String getAaConv() {
        return aaConv;
    }

    public void setAaConv(String aaConv) {
        this.aaConv = aaConv;
    }

    public Date getFeIniCont() {
        return feIniCont;
    }

    public void setFeIniCont(Date feIniCont) {
        this.feIniCont = feIniCont;
    }

    public Date getFeFinCont() {
        return feFinCont;
    }

    public void setFeFinCont(Date feFinCont) {
        this.feFinCont = feFinCont;
    }

    public Character getStServ() {
        return stServ;
    }

    public void setStServ(Character stServ) {
        this.stServ = stServ;
    }

    public Character getStRegi() {
        return stRegi;
    }

    public void setStRegi(Character stRegi) {
        this.stRegi = stRegi;
    }

    public String getTxPrefServ() {
        return txPrefServ;
    }

    public void setTxPrefServ(String txPrefServ) {
        this.txPrefServ = txPrefServ;
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

    public Servicio getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Servicio idServicio) {
        this.idServicio = idServicio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idServHist != null ? idServHist.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ServicioHist)) {
            return false;
        }
        ServicioHist other = (ServicioHist) object;
        if ((this.idServHist == null && other.idServHist != null) || (this.idServHist != null && !this.idServHist.equals(other.idServHist))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.ServicioHist[ idServHist=" + idServHist + " ]";
    }
    
}
