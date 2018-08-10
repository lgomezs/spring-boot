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
import javax.persistence.Id;
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
@Table(name = "MENSAJE_SEGURIDAD")
@NamedQueries({
    @NamedQuery(name = "MensajeSeguridad.findAll", query = "SELECT m FROM MensajeSeguridad m")})
public class MensajeSeguridad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_MENSAJE")
    private Integer idMensaje;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "TX_TITL_MSJE")
    private String txTitlMsje;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2000)
    @Column(name = "TX_MSJE")
    private String txMsje;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FE_INI_VIGE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date feIniVige;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FE_FIN_VIGE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date feFinVige;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ST_MSJE")
    private Character stMsje;
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

    public MensajeSeguridad() {
    }

    public MensajeSeguridad(Integer idMensaje) {
        this.idMensaje = idMensaje;
    }

    public MensajeSeguridad(Integer idMensaje, String txTitlMsje, String txMsje, Date feIniVige, Date feFinVige, Character stMsje, Character stRegi, String idUsuaCrea, Date feUsuaCrea, String deTermCrea) {
        this.idMensaje = idMensaje;
        this.txTitlMsje = txTitlMsje;
        this.txMsje = txMsje;
        this.feIniVige = feIniVige;
        this.feFinVige = feFinVige;
        this.stMsje = stMsje;
        this.stRegi = stRegi;
        this.idUsuaCrea = idUsuaCrea;
        this.feUsuaCrea = feUsuaCrea;
        this.deTermCrea = deTermCrea;
    }

    public Integer getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(Integer idMensaje) {
        this.idMensaje = idMensaje;
    }

    public String getTxTitlMsje() {
        return txTitlMsje;
    }

    public void setTxTitlMsje(String txTitlMsje) {
        this.txTitlMsje = txTitlMsje;
    }

    public String getTxMsje() {
        return txMsje;
    }

    public void setTxMsje(String txMsje) {
        this.txMsje = txMsje;
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

    public Character getStMsje() {
        return stMsje;
    }

    public void setStMsje(Character stMsje) {
        this.stMsje = stMsje;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMensaje != null ? idMensaje.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MensajeSeguridad)) {
            return false;
        }
        MensajeSeguridad other = (MensajeSeguridad) object;
        if ((this.idMensaje == null && other.idMensaje != null) || (this.idMensaje != null && !this.idMensaje.equals(other.idMensaje))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.MensajeSeguridad[ idMensaje=" + idMensaje + " ]";
    }
    
}
