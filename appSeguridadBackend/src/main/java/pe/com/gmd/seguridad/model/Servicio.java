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
@Table(name = "SERVICIO")
@NamedQueries({
    @NamedQuery(name = "Servicio.findAll", query = "SELECT s FROM Servicio s")})
public class Servicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_SERVICIO")
    private Integer idServicio;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "servicio", fetch = FetchType.LAZY)
    private List<ServicioHorario> servicioHorarioList;
    @JoinColumn(name = "ID_INSTITUCION", referencedColumnName = "ID_INSTITUCION")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Institucion idInstitucion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idServicio", fetch = FetchType.LAZY)
    private List<ServicioHist> servicioHistList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "servicio", fetch = FetchType.LAZY)
    private List<UsuarioServicio> usuarioServicioList;

    public Servicio() {
    }

    public Servicio(Integer idServicio) {
        this.idServicio = idServicio;
    }

    public Servicio(Integer idServicio, String noServ, Character stServ, Character stRegi, String idUsuaCrea, Date feUsuaCrea, String deTermCrea) {
        this.idServicio = idServicio;
        this.noServ = noServ;
        this.stServ = stServ;
        this.stRegi = stRegi;
        this.idUsuaCrea = idUsuaCrea;
        this.feUsuaCrea = feUsuaCrea;
        this.deTermCrea = deTermCrea;
    }

    public Integer getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Integer idServicio) {
        this.idServicio = idServicio;
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

    public List<ServicioHorario> getServicioHorarioList() {
        return servicioHorarioList;
    }

    public void setServicioHorarioList(List<ServicioHorario> servicioHorarioList) {
        this.servicioHorarioList = servicioHorarioList;
    }

    public Institucion getIdInstitucion() {
        return idInstitucion;
    }

    public void setIdInstitucion(Institucion idInstitucion) {
        this.idInstitucion = idInstitucion;
    }

    public List<ServicioHist> getServicioHistList() {
        return servicioHistList;
    }

    public void setServicioHistList(List<ServicioHist> servicioHistList) {
        this.servicioHistList = servicioHistList;
    }

    public List<UsuarioServicio> getUsuarioServicioList() {
        return usuarioServicioList;
    }

    public void setUsuarioServicioList(List<UsuarioServicio> usuarioServicioList) {
        this.usuarioServicioList = usuarioServicioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idServicio != null ? idServicio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Servicio)) {
            return false;
        }
        Servicio other = (Servicio) object;
        if ((this.idServicio == null && other.idServicio != null) || (this.idServicio != null && !this.idServicio.equals(other.idServicio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.Servicio[ idServicio=" + idServicio + " ]";
    }
    
}
