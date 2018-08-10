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
@Table(name = "SERVICIO_HORARIO")
@NamedQueries({
    @NamedQuery(name = "ServicioHorario.findAll", query = "SELECT s FROM ServicioHorario s")})
public class ServicioHorario implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ServicioHorarioPK servicioHorarioPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ST_SERV_HORA")
    private Character stServHora;
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
    @JoinColumn(name = "ID_HORARIO", referencedColumnName = "ID_HORARIO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Horario horario;
    @JoinColumn(name = "ID_SERVICIO", referencedColumnName = "ID_SERVICIO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Servicio servicio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "servicioHorario", fetch = FetchType.LAZY)
    private List<ServicioHorarioHist> servicioHorarioHistList;

    public ServicioHorario() {
    }

    public ServicioHorario(ServicioHorarioPK servicioHorarioPK) {
        this.servicioHorarioPK = servicioHorarioPK;
    }

    public ServicioHorario(ServicioHorarioPK servicioHorarioPK, Character stServHora, Character stRegi, String idUsuaCrea, Date feUsuaCrea, String deTermCrea) {
        this.servicioHorarioPK = servicioHorarioPK;
        this.stServHora = stServHora;
        this.stRegi = stRegi;
        this.idUsuaCrea = idUsuaCrea;
        this.feUsuaCrea = feUsuaCrea;
        this.deTermCrea = deTermCrea;
    }

    public ServicioHorario(int idServicio, int idHorario) {
        this.servicioHorarioPK = new ServicioHorarioPK(idServicio, idHorario);
    }

    public ServicioHorarioPK getServicioHorarioPK() {
        return servicioHorarioPK;
    }

    public void setServicioHorarioPK(ServicioHorarioPK servicioHorarioPK) {
        this.servicioHorarioPK = servicioHorarioPK;
    }

    public Character getStServHora() {
        return stServHora;
    }

    public void setStServHora(Character stServHora) {
        this.stServHora = stServHora;
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

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public List<ServicioHorarioHist> getServicioHorarioHistList() {
        return servicioHorarioHistList;
    }

    public void setServicioHorarioHistList(List<ServicioHorarioHist> servicioHorarioHistList) {
        this.servicioHorarioHistList = servicioHorarioHistList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (servicioHorarioPK != null ? servicioHorarioPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ServicioHorario)) {
            return false;
        }
        ServicioHorario other = (ServicioHorario) object;
        if ((this.servicioHorarioPK == null && other.servicioHorarioPK != null) || (this.servicioHorarioPK != null && !this.servicioHorarioPK.equals(other.servicioHorarioPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.ServicioHorario[ servicioHorarioPK=" + servicioHorarioPK + " ]";
    }
    
}
