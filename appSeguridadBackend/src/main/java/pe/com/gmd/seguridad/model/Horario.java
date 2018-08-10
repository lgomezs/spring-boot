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
@Table(name = "HORARIO")
@NamedQueries({
    @NamedQuery(name = "Horario.findAll", query = "SELECT h FROM Horario h")})
public class Horario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_HORARIO")
    private Integer idHorario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "UN_HH_HORA_INI")
    private short unHhHoraIni;
    @Basic(optional = false)
    @NotNull
    @Column(name = "UN_MINU_HORA_INI")
    private short unMinuHoraIni;
    @Basic(optional = false)
    @NotNull
    @Column(name = "UN_HH_HORA_FIN")
    private short unHhHoraFin;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "horario", fetch = FetchType.LAZY)
    private List<ServicioHorario> servicioHorarioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idHorario", fetch = FetchType.LAZY)
    private List<HorarioHist> horarioHistList;

    public Horario() {
    }

    public Horario(Integer idHorario) {
        this.idHorario = idHorario;
    }

    public Horario(Integer idHorario, short unHhHoraIni, short unMinuHoraIni, short unHhHoraFin, short unMinuHoraFin, short unDiaSemaIni, short unDiaSemaFin, Character stHora, Character stRegi, String idUsuaCrea, Date feUsuaCrea, String deTermCrea) {
        this.idHorario = idHorario;
        this.unHhHoraIni = unHhHoraIni;
        this.unMinuHoraIni = unMinuHoraIni;
        this.unHhHoraFin = unHhHoraFin;
        this.unMinuHoraFin = unMinuHoraFin;
        this.unDiaSemaIni = unDiaSemaIni;
        this.unDiaSemaFin = unDiaSemaFin;
        this.stHora = stHora;
        this.stRegi = stRegi;
        this.idUsuaCrea = idUsuaCrea;
        this.feUsuaCrea = feUsuaCrea;
        this.deTermCrea = deTermCrea;
    }

    public Integer getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(Integer idHorario) {
        this.idHorario = idHorario;
    }

    public short getUnHhHoraIni() {
        return unHhHoraIni;
    }

    public void setUnHhHoraIni(short unHhHoraIni) {
        this.unHhHoraIni = unHhHoraIni;
    }

    public short getUnMinuHoraIni() {
        return unMinuHoraIni;
    }

    public void setUnMinuHoraIni(short unMinuHoraIni) {
        this.unMinuHoraIni = unMinuHoraIni;
    }

    public short getUnHhHoraFin() {
        return unHhHoraFin;
    }

    public void setUnHhHoraFin(short unHhHoraFin) {
        this.unHhHoraFin = unHhHoraFin;
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

    public List<HorarioHist> getHorarioHistList() {
        return horarioHistList;
    }

    public void setHorarioHistList(List<HorarioHist> horarioHistList) {
        this.horarioHistList = horarioHistList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHorario != null ? idHorario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Horario)) {
            return false;
        }
        Horario other = (Horario) object;
        if ((this.idHorario == null && other.idHorario != null) || (this.idHorario != null && !this.idHorario.equals(other.idHorario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.Horario[ idHorario=" + idHorario + " ]";
    }
    
}
