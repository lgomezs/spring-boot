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
import javax.persistence.Lob;
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
@Table(name = "USUARIO_HIST")
@NamedQueries({
    @NamedQuery(name = "UsuarioHist.findAll", query = "SELECT u FROM UsuarioHist u")})
public class UsuarioHist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_USUA_HIST")
    private Integer idUsuaHist;
    @Size(max = 28)
    @Column(name = "ID_UBICACION")
    private String idUbicacion;
    @Column(name = "ID_INSTITUCION")
    private Integer idInstitucion;
    @Size(max = 40)
    @Column(name = "AP_PTNO_USUA")
    private String apPtnoUsua;
    @Size(max = 40)
    @Column(name = "AP_MTNO_USUA")
    private String apMtnoUsua;
    @Size(max = 40)
    @Column(name = "NO_USUA")
    private String noUsua;
    @Size(max = 20)
    @Column(name = "LG_USUA")
    private String lgUsua;
    @Size(max = 50)
    @Column(name = "TX_PWD_USUA")
    private String txPwdUsua;
    @Column(name = "FE_ACTU_PWD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date feActuPwd;
    @Column(name = "FE_EXP_PWD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date feExpPwd;
    @Size(max = 1)
    @Column(name = "IN_CAMB_OBLI_PWD")
    private String inCambObliPwd;
    @Size(max = 50)
    @Column(name = "TI_DOCU_IDEN")
    private String tiDocuIden;
    @Size(max = 20)
    @Column(name = "TX_NUME_DOCU_IDEN")
    private String txNumeDocuIden;
    @Size(max = 20)
    @Column(name = "TX_USUA_RED")
    private String txUsuaRed;
    @Size(max = 50)
    @Column(name = "TX_DOM_RED")
    private String txDomRed;
    @Column(name = "FE_INI_CONT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date feIniCont;
    @Column(name = "FE_FIN_CONT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date feFinCont;
    @Size(max = 20)
    @Column(name = "TX_COD_EMP")
    private String txCodEmp;
    @Lob
    @Column(name = "BO_IMAG_USUA")
    private Serializable boImagUsua;
    @Lob
    @Column(name = "BO_IMAG_USUA_FIR")
    private Serializable boImagUsuaFir;
    @Size(max = 50)
    @Column(name = "TI_TRAB")
    private String tiTrab;
    @Column(name = "TI_ACS_USUA")
    private Character tiAcsUsua;
    @Column(name = "ST_USUA")
    private Character stUsua;
    @Column(name = "ST_REGI")
    private Character stRegi;
    @Size(max = 39)
    @Column(name = "DE_TERM_ACS")
    private String deTermAcs;
    @Size(max = 50)
    @Column(name = "TX_DIRE_MAC")
    private String txDireMac;
    @Size(max = 50)
    @Column(name = "TI_MOTI_BAJA")
    private String tiMotiBaja;
    @Size(max = 200)
    @Column(name = "TX_OBSE_BAJA")
    private String txObseBaja;
    @Column(name = "FE_BAJA_USUA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date feBajaUsua;
    @Column(name = "IN_VACA")
    private Character inVaca;
    @Size(max = 32)
    @Column(name = "TX_KEY_PWD")
    private String txKeyPwd;
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
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario idUsuario;

    public UsuarioHist() {
    }

    public UsuarioHist(Integer idUsuaHist) {
        this.idUsuaHist = idUsuaHist;
    }

    public UsuarioHist(Integer idUsuaHist, String idUsuaCreaHist, Date feUsuaCreaHist, String deTermCreaHist, String idUsuaCrea, Date feUsuaCrea, String deTermCrea) {
        this.idUsuaHist = idUsuaHist;
        this.idUsuaCreaHist = idUsuaCreaHist;
        this.feUsuaCreaHist = feUsuaCreaHist;
        this.deTermCreaHist = deTermCreaHist;
        this.idUsuaCrea = idUsuaCrea;
        this.feUsuaCrea = feUsuaCrea;
        this.deTermCrea = deTermCrea;
    }

    public Integer getIdUsuaHist() {
        return idUsuaHist;
    }

    public void setIdUsuaHist(Integer idUsuaHist) {
        this.idUsuaHist = idUsuaHist;
    }

    public String getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(String idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public Integer getIdInstitucion() {
        return idInstitucion;
    }

    public void setIdInstitucion(Integer idInstitucion) {
        this.idInstitucion = idInstitucion;
    }

    public String getApPtnoUsua() {
        return apPtnoUsua;
    }

    public void setApPtnoUsua(String apPtnoUsua) {
        this.apPtnoUsua = apPtnoUsua;
    }

    public String getApMtnoUsua() {
        return apMtnoUsua;
    }

    public void setApMtnoUsua(String apMtnoUsua) {
        this.apMtnoUsua = apMtnoUsua;
    }

    public String getNoUsua() {
        return noUsua;
    }

    public void setNoUsua(String noUsua) {
        this.noUsua = noUsua;
    }

    public String getLgUsua() {
        return lgUsua;
    }

    public void setLgUsua(String lgUsua) {
        this.lgUsua = lgUsua;
    }

    public String getTxPwdUsua() {
        return txPwdUsua;
    }

    public void setTxPwdUsua(String txPwdUsua) {
        this.txPwdUsua = txPwdUsua;
    }

    public Date getFeActuPwd() {
        return feActuPwd;
    }

    public void setFeActuPwd(Date feActuPwd) {
        this.feActuPwd = feActuPwd;
    }

    public Date getFeExpPwd() {
        return feExpPwd;
    }

    public void setFeExpPwd(Date feExpPwd) {
        this.feExpPwd = feExpPwd;
    }

    public String getInCambObliPwd() {
        return inCambObliPwd;
    }

    public void setInCambObliPwd(String inCambObliPwd) {
        this.inCambObliPwd = inCambObliPwd;
    }

    public String getTiDocuIden() {
        return tiDocuIden;
    }

    public void setTiDocuIden(String tiDocuIden) {
        this.tiDocuIden = tiDocuIden;
    }

    public String getTxNumeDocuIden() {
        return txNumeDocuIden;
    }

    public void setTxNumeDocuIden(String txNumeDocuIden) {
        this.txNumeDocuIden = txNumeDocuIden;
    }

    public String getTxUsuaRed() {
        return txUsuaRed;
    }

    public void setTxUsuaRed(String txUsuaRed) {
        this.txUsuaRed = txUsuaRed;
    }

    public String getTxDomRed() {
        return txDomRed;
    }

    public void setTxDomRed(String txDomRed) {
        this.txDomRed = txDomRed;
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

    public String getTxCodEmp() {
        return txCodEmp;
    }

    public void setTxCodEmp(String txCodEmp) {
        this.txCodEmp = txCodEmp;
    }

    public Serializable getBoImagUsua() {
        return boImagUsua;
    }

    public void setBoImagUsua(Serializable boImagUsua) {
        this.boImagUsua = boImagUsua;
    }

    public Serializable getBoImagUsuaFir() {
        return boImagUsuaFir;
    }

    public void setBoImagUsuaFir(Serializable boImagUsuaFir) {
        this.boImagUsuaFir = boImagUsuaFir;
    }

    public String getTiTrab() {
        return tiTrab;
    }

    public void setTiTrab(String tiTrab) {
        this.tiTrab = tiTrab;
    }

    public Character getTiAcsUsua() {
        return tiAcsUsua;
    }

    public void setTiAcsUsua(Character tiAcsUsua) {
        this.tiAcsUsua = tiAcsUsua;
    }

    public Character getStUsua() {
        return stUsua;
    }

    public void setStUsua(Character stUsua) {
        this.stUsua = stUsua;
    }

    public Character getStRegi() {
        return stRegi;
    }

    public void setStRegi(Character stRegi) {
        this.stRegi = stRegi;
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

    public String getTiMotiBaja() {
        return tiMotiBaja;
    }

    public void setTiMotiBaja(String tiMotiBaja) {
        this.tiMotiBaja = tiMotiBaja;
    }

    public String getTxObseBaja() {
        return txObseBaja;
    }

    public void setTxObseBaja(String txObseBaja) {
        this.txObseBaja = txObseBaja;
    }

    public Date getFeBajaUsua() {
        return feBajaUsua;
    }

    public void setFeBajaUsua(Date feBajaUsua) {
        this.feBajaUsua = feBajaUsua;
    }

    public Character getInVaca() {
        return inVaca;
    }

    public void setInVaca(Character inVaca) {
        this.inVaca = inVaca;
    }

    public String getTxKeyPwd() {
        return txKeyPwd;
    }

    public void setTxKeyPwd(String txKeyPwd) {
        this.txKeyPwd = txKeyPwd;
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

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuaHist != null ? idUsuaHist.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioHist)) {
            return false;
        }
        UsuarioHist other = (UsuarioHist) object;
        if ((this.idUsuaHist == null && other.idUsuaHist != null) || (this.idUsuaHist != null && !this.idUsuaHist.equals(other.idUsuaHist))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.UsuarioHist[ idUsuaHist=" + idUsuaHist + " ]";
    }
    
}
