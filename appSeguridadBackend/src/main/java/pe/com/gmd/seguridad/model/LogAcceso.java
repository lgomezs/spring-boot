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
@Table(name = "LOG_ACCESO")
@NamedQueries({
    @NamedQuery(name = "LogAcceso.findAll", query = "SELECT l FROM LogAcceso l")})
public class LogAcceso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_LOG_ACS")
    private Integer idLogAcs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_USUARIO")
    private int idUsuario;
    @Column(name = "ID_SISTEMA")
    private Integer idSistema;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FE_INI_ACS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date feIniAcs;
    @Column(name = "FE_FIN_ACS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date feFinAcs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "IN_RESU_CONE")
    private String inResuCone;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "DE_LOG_ACS")
    private String deLogAcs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 39)
    @Column(name = "DE_TERM_ACS")
    private String deTermAcs;
    @Size(max = 50)
    @Column(name = "TX_DIRE_MAC")
    private String txDireMac;
    @Size(max = 30)
    @Column(name = "TX_NOMB_PC")
    private String txNombPc;
    @Size(max = 48)
    @Column(name = "TX_LOG_ACCE_CIFR")
    private String txLogAcceCifr;
    @Size(max = 18)
    @Column(name = "TX_FLUJ_ACCE")
    private String txFlujAcce;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ST_LOG_ACS")
    private Character stLogAcs;
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

    public LogAcceso() {
    }

    public LogAcceso(Integer idLogAcs) {
        this.idLogAcs = idLogAcs;
    }

    public LogAcceso(Integer idLogAcs, int idUsuario, Date feIniAcs, String inResuCone, String deLogAcs, String deTermAcs, Character stLogAcs, Character stRegi, String idUsuaCrea, Date feUsuaCrea, String deTermCrea) {
        this.idLogAcs = idLogAcs;
        this.idUsuario = idUsuario;
        this.feIniAcs = feIniAcs;
        this.inResuCone = inResuCone;
        this.deLogAcs = deLogAcs;
        this.deTermAcs = deTermAcs;
        this.stLogAcs = stLogAcs;
        this.stRegi = stRegi;
        this.idUsuaCrea = idUsuaCrea;
        this.feUsuaCrea = feUsuaCrea;
        this.deTermCrea = deTermCrea;
    }

    public Integer getIdLogAcs() {
        return idLogAcs;
    }

    public void setIdLogAcs(Integer idLogAcs) {
        this.idLogAcs = idLogAcs;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdSistema() {
        return idSistema;
    }

    public void setIdSistema(Integer idSistema) {
        this.idSistema = idSistema;
    }

    public Date getFeIniAcs() {
        return feIniAcs;
    }

    public void setFeIniAcs(Date feIniAcs) {
        this.feIniAcs = feIniAcs;
    }

    public Date getFeFinAcs() {
        return feFinAcs;
    }

    public void setFeFinAcs(Date feFinAcs) {
        this.feFinAcs = feFinAcs;
    }

    public String getInResuCone() {
        return inResuCone;
    }

    public void setInResuCone(String inResuCone) {
        this.inResuCone = inResuCone;
    }

    public String getDeLogAcs() {
        return deLogAcs;
    }

    public void setDeLogAcs(String deLogAcs) {
        this.deLogAcs = deLogAcs;
    }

    public String getDeTermAcs() {
        return deTermAcs;
    }

    public void setDeTermAcs(String deTermAcs) {
        this.deTermAcs = deTermAcs;
    }

    public String getTxDireMac() {
        return txDireMac;
    }

    public void setTxDireMac(String txDireMac) {
        this.txDireMac = txDireMac;
    }

    public String getTxNombPc() {
        return txNombPc;
    }

    public void setTxNombPc(String txNombPc) {
        this.txNombPc = txNombPc;
    }

    public String getTxLogAcceCifr() {
        return txLogAcceCifr;
    }

    public void setTxLogAcceCifr(String txLogAcceCifr) {
        this.txLogAcceCifr = txLogAcceCifr;
    }

    public String getTxFlujAcce() {
        return txFlujAcce;
    }

    public void setTxFlujAcce(String txFlujAcce) {
        this.txFlujAcce = txFlujAcce;
    }

    public Character getStLogAcs() {
        return stLogAcs;
    }

    public void setStLogAcs(Character stLogAcs) {
        this.stLogAcs = stLogAcs;
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
        hash += (idLogAcs != null ? idLogAcs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LogAcceso)) {
            return false;
        }
        LogAcceso other = (LogAcceso) object;
        if ((this.idLogAcs == null && other.idLogAcs != null) || (this.idLogAcs != null && !this.idLogAcs.equals(other.idLogAcs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.LogAcceso[ idLogAcs=" + idLogAcs + " ]";
    }
    
}
