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
@Table(name = "HORARIO_HIST")
@NamedQueries({
    @NamedQuery(name = "HorarioHist.findAll", query = "SELECT h FROM HorarioHist h")})
public class HorarioHist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_HORA_HIST")
    private Integer idHoraHist;
    @Basic(optional = false)
    @NotNull
    @Column(name = "UN_HH_HORA_INI")
    private short unHhHoraIni;
    @Basic(optional = false)
    @NotNull
    @Column(name = "UN_HH_HORA_FIN")
    private short unHhHoraFin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "UN_MINU_HORA_INI")
    private short unMinuHoraIni;
    @Basic(optional = false)
    @NotNull
    @Column(name = "UN_MINU_HORA_FIN")
    private short unMinuHoraFin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "UN_DIA_SEMA_INI")
    private short unDiaSemaIni;
    @Basic(optional = false)
    @NotNull
    @Column(name = "UN_DIA_SEMA_FIN")
    private short unDiaSemaFin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ST_HORA")
    private Character stHora;
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
    @JoinColumn(name = "ID_HORARIO", referencedColumnName = "ID_HORARIO")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Horario idHorario;

    public HorarioHist() {
    }

    public HorarioHist(Integer idHoraHist) {
        this.idHoraHist = idHoraHist;
    }

    public HorarioHist(Integer idHoraHist, short unHhHoraIni, short unHhHoraFin, short unMinuHoraIni, short unMinuHoraFin, short unDiaSemaIni, short unDiaSemaFin, Character stHora, Character stRegi, String idUsuaCreaHist, Date feUsuaCreaHist, String deTermCreaHist, String idUsuaCrea, Date feUsuaCrea, String deTermCrea) {
        this.idHoraHist = idHoraHist;
        this.unHhHoraIni = unHhHoraIni;
        this.unHhHoraFin = unHhHoraFin;
        this.unMinuHoraIni = unMinuHoraIni;
        this.unMinuHoraFin = unMinuHoraFin;
        this.unDiaSemaIni = unDiaSemaIni;
        this.unDiaSemaFin = unDiaSemaFin;
        this.stHora = stHora;
        this.stRegi = stRegi;
        this.idUsuaCreaHist = idUsuaCreaHist;
        this.feUsuaCreaHist = feUsuaCreaHist;
        this.deTermCreaHist = deTermCreaHist;
        this.idUsuaCrea = idUsuaCrea;
        this.feUsuaCrea = feUsuaCrea;
        this.deTermCrea = deTermCrea;
    }

    public Integer getIdHoraHist() {
        return idHoraHist;
    }

    public void setIdHoraHist(Integer idHoraHist) {
        this.idHoraHist = idHoraHist;
    }

    public short getUnHhHoraIni() {
        return unHhHoraIni;
    }

    public void setUnHhHoraIni(short unHhHoraIni) {
        this.unHhHoraIni = unHhHoraIni;
    }

    public short getUnHhHoraFin() {
        return unHhHoraFin;
    }

    public void setUnHhHoraFin(short unHhHoraFin) {
        this.unHhHoraFin = unHhHoraFin;
    }

    public short getUnMinuHoraIni() {
        return unMinuHoraIni;
    }

    public void setUnMinuHoraIni(short unMinuHoraIni) {
        this.unMinuHoraIni = unMinuHoraIni;
    }

    public short getUnMinuHoraFin() {
        return unMinuHoraFin;
    }

    public void setUnMinuHoraFin(short unMinuHoraFin) {
        this.unMinuHoraFin = unMinuHoraFin;
    }

    public short getUnDiaSemaIni() {
        return unDiaSemaIni;
    }

    public void setUnDiaSemaIni(short unDiaSemaIni) {
        this.unDiaSemaIni = unDiaSemaIni;
    }

    public short getUnDiaSemaFin() {
        return unDiaSemaFin;
    }

    public void setUnDiaSemaFin(short unDiaSemaFin) {
        this.unDiaSemaFin = unDiaSemaFin;
    }

    public Character getStHora() {
        return stHora;
    }

    public void setStHora(Character stHora) {
        this.stHora = stHora;
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

    public Horario getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(Horario idHorario) {
        this.idHorario = idHorario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHoraHist != null ? idHoraHist.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HorarioHist)) {
            return false;
        }
        HorarioHist other = (HorarioHist) object;
        if ((this.idHoraHist == null && other.idHoraHist != null) || (this.idHoraHist != null && !this.idHoraHist.equals(other.idHoraHist))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.HorarioHist[ idHoraHist=" + idHoraHist + " ]";
    }
    
}
