/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.gmd.seguridad.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "TMP_PRUEBA")
@NamedQueries({
    @NamedQuery(name = "TmpPrueba.findAll", query = "SELECT t FROM TmpPrueba t")})
public class TmpPrueba implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_TMP_PRUEBA")
    private Integer idTmpPrueba;
    @Size(max = 200)
    @Column(name = "NO_INST")
    private String noInst;
    @Size(max = 50)
    @Column(name = "TI_DOCU")
    private String tiDocu;
    @Size(max = 25)
    @Column(name = "TX_NUME_DOCU")
    private String txNumeDocu;
    @Size(max = 15)
    @Column(name = "NO_ABRV_INST")
    private String noAbrvInst;
    @Size(max = 200)
    @Column(name = "DE_INST")
    private String deInst;
    @Size(max = 50)
    @Column(name = "TI_INST")
    private String tiInst;
    @Column(name = "ST_INST")
    private Character stInst;
    @Column(name = "ST_REGI_INST")
    private Character stRegiInst;
    @Size(max = 28)
    @Column(name = "ID_UBICACION")
    private String idUbicacion;
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
    @Column(name = "FE_INI_CONT_USU")
    @Temporal(TemporalType.TIMESTAMP)
    private Date feIniContUsu;
    @Column(name = "FE_FIN_CONT_USU")
    @Temporal(TemporalType.TIMESTAMP)
    private Date feFinContUsu;
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
    @Column(name = "ST_REGI_USU")
    private Character stRegiUsu;
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
    @Column(name = "ID_EMPL")
    private BigInteger idEmpl;
    @Size(max = 150)
    @Column(name = "DE_SIST")
    private String deSist;
    @Size(max = 50)
    @Column(name = "NO_SIST")
    private String noSist;
    @Size(max = 50)
    @Column(name = "TI_SIST")
    private String tiSist;
    @Column(name = "ST_SIST")
    private Character stSist;
    @Column(name = "ST_REGI_SIST")
    private Character stRegiSist;
    @Column(name = "IN_VER")
    private Character inVer;
    @Size(max = 300)
    @Column(name = "RU_SIST")
    private String ruSist;
    @Column(name = "IN_ADM_PERF")
    private Character inAdmPerf;
    @Column(name = "ID_SERV_PDR")
    private Integer idServPdr;
    @Column(name = "UN_NIVE_SERV")
    private Short unNiveServ;
    @Size(max = 50)
    @Column(name = "TI_SERV")
    private String tiServ;
    @Size(max = 200)
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
    @Column(name = "FE_INI_CONT_SERV")
    @Temporal(TemporalType.TIMESTAMP)
    private Date feIniContServ;
    @Column(name = "FE_FIN_CONT_SERV")
    @Temporal(TemporalType.TIMESTAMP)
    private Date feFinContServ;
    @Column(name = "ST_SERV")
    private Character stServ;
    @Column(name = "ST_REGI_SERV")
    private Character stRegiServ;
    @Size(max = 3)
    @Column(name = "TX_PREF_SERV")
    private String txPrefServ;
    @Column(name = "UN_HH_HORA_INI")
    private Short unHhHoraIni;
    @Column(name = "UN_MINU_HORA_INI")
    private Short unMinuHoraIni;
    @Column(name = "UN_HH_HORA_FIN")
    private Short unHhHoraFin;
    @Column(name = "UN_MINU_HORA_FIN")
    private Short unMinuHoraFin;
    @Column(name = "UN_DIA_SEMA_INI")
    private Short unDiaSemaIni;
    @Column(name = "UN_DIA_SEMA_FIN")
    private Short unDiaSemaFin;
    @Column(name = "ST_HORA")
    private Character stHora;
    @Column(name = "ST_REGI_HOR")
    private Character stRegiHor;
    @Size(max = 40)
    @Column(name = "NO_PERF")
    private String noPerf;
    @Size(max = 255)
    @Column(name = "DE_PERF")
    private String dePerf;
    @Column(name = "ST_PERF")
    private Character stPerf;
    @Column(name = "ST_REGI_PERF")
    private Character stRegiPerf;
    @Size(max = 100)
    @Column(name = "NO_ROL")
    private String noRol;
    @Size(max = 100)
    @Column(name = "DE_ROL")
    private String deRol;
    @Size(max = 50)
    @Column(name = "TI_ROL")
    private String tiRol;
    @Column(name = "ST_ROL")
    private Character stRol;
    @Column(name = "ST_REGI_ROL")
    private Character stRegiRol;
    @Size(max = 21)
    @Column(name = "ID_PERM_PDR")
    private String idPermPdr;
    @Column(name = "UN_NIVE_PERM")
    private Short unNivePerm;
    @Column(name = "ID_OPCI_APLI")
    private Integer idOpciApli;
    @Size(max = 100)
    @Column(name = "NO_PERM")
    private String noPerm;
    @Size(max = 100)
    @Column(name = "NO_REGI_ACCN")
    private String noRegiAccn;
    @Size(max = 50)
    @Column(name = "TI_OBJ_PERM")
    private String tiObjPerm;
    @Column(name = "ST_PERM")
    private Character stPerm;
    @Column(name = "ST_REGI_PERM")
    private Character stRegiPerm;
    @Size(max = 30)
    @Column(name = "ID_USUA_CREA")
    private String idUsuaCrea;
    @Column(name = "FE_USUA_CREA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date feUsuaCrea;
    @Size(max = 39)
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

    public TmpPrueba() {
    }

    public TmpPrueba(Integer idTmpPrueba) {
        this.idTmpPrueba = idTmpPrueba;
    }

    public Integer getIdTmpPrueba() {
        return idTmpPrueba;
    }

    public void setIdTmpPrueba(Integer idTmpPrueba) {
        this.idTmpPrueba = idTmpPrueba;
    }

    public String getNoInst() {
        return noInst;
    }

    public void setNoInst(String noInst) {
        this.noInst = noInst;
    }

    public String getTiDocu() {
        return tiDocu;
    }

    public void setTiDocu(String tiDocu) {
        this.tiDocu = tiDocu;
    }

    public String getTxNumeDocu() {
        return txNumeDocu;
    }

    public void setTxNumeDocu(String txNumeDocu) {
        this.txNumeDocu = txNumeDocu;
    }

    public String getNoAbrvInst() {
        return noAbrvInst;
    }

    public void setNoAbrvInst(String noAbrvInst) {
        this.noAbrvInst = noAbrvInst;
    }

    public String getDeInst() {
        return deInst;
    }

    public void setDeInst(String deInst) {
        this.deInst = deInst;
    }

    public String getTiInst() {
        return tiInst;
    }

    public void setTiInst(String tiInst) {
        this.tiInst = tiInst;
    }

    public Character getStInst() {
        return stInst;
    }

    public void setStInst(Character stInst) {
        this.stInst = stInst;
    }

    public Character getStRegiInst() {
        return stRegiInst;
    }

    public void setStRegiInst(Character stRegiInst) {
        this.stRegiInst = stRegiInst;
    }

    public String getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(String idUbicacion) {
        this.idUbicacion = idUbicacion;
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

    public Date getFeIniContUsu() {
        return feIniContUsu;
    }

    public void setFeIniContUsu(Date feIniContUsu) {
        this.feIniContUsu = feIniContUsu;
    }

    public Date getFeFinContUsu() {
        return feFinContUsu;
    }

    public void setFeFinContUsu(Date feFinContUsu) {
        this.feFinContUsu = feFinContUsu;
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

    public Character getStRegiUsu() {
        return stRegiUsu;
    }

    public void setStRegiUsu(Character stRegiUsu) {
        this.stRegiUsu = stRegiUsu;
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

    public BigInteger getIdEmpl() {
        return idEmpl;
    }

    public void setIdEmpl(BigInteger idEmpl) {
        this.idEmpl = idEmpl;
    }

    public String getDeSist() {
        return deSist;
    }

    public void setDeSist(String deSist) {
        this.deSist = deSist;
    }

    public String getNoSist() {
        return noSist;
    }

    public void setNoSist(String noSist) {
        this.noSist = noSist;
    }

    public String getTiSist() {
        return tiSist;
    }

    public void setTiSist(String tiSist) {
        this.tiSist = tiSist;
    }

    public Character getStSist() {
        return stSist;
    }

    public void setStSist(Character stSist) {
        this.stSist = stSist;
    }

    public Character getStRegiSist() {
        return stRegiSist;
    }

    public void setStRegiSist(Character stRegiSist) {
        this.stRegiSist = stRegiSist;
    }

    public Character getInVer() {
        return inVer;
    }

    public void setInVer(Character inVer) {
        this.inVer = inVer;
    }

    public String getRuSist() {
        return ruSist;
    }

    public void setRuSist(String ruSist) {
        this.ruSist = ruSist;
    }

    public Character getInAdmPerf() {
        return inAdmPerf;
    }

    public void setInAdmPerf(Character inAdmPerf) {
        this.inAdmPerf = inAdmPerf;
    }

    public Integer getIdServPdr() {
        return idServPdr;
    }

    public void setIdServPdr(Integer idServPdr) {
        this.idServPdr = idServPdr;
    }

    public Short getUnNiveServ() {
        return unNiveServ;
    }

    public void setUnNiveServ(Short unNiveServ) {
        this.unNiveServ = unNiveServ;
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

    public Date getFeIniContServ() {
        return feIniContServ;
    }

    public void setFeIniContServ(Date feIniContServ) {
        this.feIniContServ = feIniContServ;
    }

    public Date getFeFinContServ() {
        return feFinContServ;
    }

    public void setFeFinContServ(Date feFinContServ) {
        this.feFinContServ = feFinContServ;
    }

    public Character getStServ() {
        return stServ;
    }

    public void setStServ(Character stServ) {
        this.stServ = stServ;
    }

    public Character getStRegiServ() {
        return stRegiServ;
    }

    public void setStRegiServ(Character stRegiServ) {
        this.stRegiServ = stRegiServ;
    }

    public String getTxPrefServ() {
        return txPrefServ;
    }

    public void setTxPrefServ(String txPrefServ) {
        this.txPrefServ = txPrefServ;
    }

    public Short getUnHhHoraIni() {
        return unHhHoraIni;
    }

    public void setUnHhHoraIni(Short unHhHoraIni) {
        this.unHhHoraIni = unHhHoraIni;
    }

    public Short getUnMinuHoraIni() {
        return unMinuHoraIni;
    }

    public void setUnMinuHoraIni(Short unMinuHoraIni) {
        this.unMinuHoraIni = unMinuHoraIni;
    }

    public Short getUnHhHoraFin() {
        return unHhHoraFin;
    }

    public void setUnHhHoraFin(Short unHhHoraFin) {
        this.unHhHoraFin = unHhHoraFin;
    }

    public Short getUnMinuHoraFin() {
        return unMinuHoraFin;
    }

    public void setUnMinuHoraFin(Short unMinuHoraFin) {
        this.unMinuHoraFin = unMinuHoraFin;
    }

    public Short getUnDiaSemaIni() {
        return unDiaSemaIni;
    }

    public void setUnDiaSemaIni(Short unDiaSemaIni) {
        this.unDiaSemaIni = unDiaSemaIni;
    }

    public Short getUnDiaSemaFin() {
        return unDiaSemaFin;
    }

    public void setUnDiaSemaFin(Short unDiaSemaFin) {
        this.unDiaSemaFin = unDiaSemaFin;
    }

    public Character getStHora() {
        return stHora;
    }

    public void setStHora(Character stHora) {
        this.stHora = stHora;
    }

    public Character getStRegiHor() {
        return stRegiHor;
    }

    public void setStRegiHor(Character stRegiHor) {
        this.stRegiHor = stRegiHor;
    }

    public String getNoPerf() {
        return noPerf;
    }

    public void setNoPerf(String noPerf) {
        this.noPerf = noPerf;
    }

    public String getDePerf() {
        return dePerf;
    }

    public void setDePerf(String dePerf) {
        this.dePerf = dePerf;
    }

    public Character getStPerf() {
        return stPerf;
    }

    public void setStPerf(Character stPerf) {
        this.stPerf = stPerf;
    }

    public Character getStRegiPerf() {
        return stRegiPerf;
    }

    public void setStRegiPerf(Character stRegiPerf) {
        this.stRegiPerf = stRegiPerf;
    }

    public String getNoRol() {
        return noRol;
    }

    public void setNoRol(String noRol) {
        this.noRol = noRol;
    }

    public String getDeRol() {
        return deRol;
    }

    public void setDeRol(String deRol) {
        this.deRol = deRol;
    }

    public String getTiRol() {
        return tiRol;
    }

    public void setTiRol(String tiRol) {
        this.tiRol = tiRol;
    }

    public Character getStRol() {
        return stRol;
    }

    public void setStRol(Character stRol) {
        this.stRol = stRol;
    }

    public Character getStRegiRol() {
        return stRegiRol;
    }

    public void setStRegiRol(Character stRegiRol) {
        this.stRegiRol = stRegiRol;
    }

    public String getIdPermPdr() {
        return idPermPdr;
    }

    public void setIdPermPdr(String idPermPdr) {
        this.idPermPdr = idPermPdr;
    }

    public Short getUnNivePerm() {
        return unNivePerm;
    }

    public void setUnNivePerm(Short unNivePerm) {
        this.unNivePerm = unNivePerm;
    }

    public Integer getIdOpciApli() {
        return idOpciApli;
    }

    public void setIdOpciApli(Integer idOpciApli) {
        this.idOpciApli = idOpciApli;
    }

    public String getNoPerm() {
        return noPerm;
    }

    public void setNoPerm(String noPerm) {
        this.noPerm = noPerm;
    }

    public String getNoRegiAccn() {
        return noRegiAccn;
    }

    public void setNoRegiAccn(String noRegiAccn) {
        this.noRegiAccn = noRegiAccn;
    }

    public String getTiObjPerm() {
        return tiObjPerm;
    }

    public void setTiObjPerm(String tiObjPerm) {
        this.tiObjPerm = tiObjPerm;
    }

    public Character getStPerm() {
        return stPerm;
    }

    public void setStPerm(Character stPerm) {
        this.stPerm = stPerm;
    }

    public Character getStRegiPerm() {
        return stRegiPerm;
    }

    public void setStRegiPerm(Character stRegiPerm) {
        this.stRegiPerm = stRegiPerm;
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
        hash += (idTmpPrueba != null ? idTmpPrueba.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TmpPrueba)) {
            return false;
        }
        TmpPrueba other = (TmpPrueba) object;
        if ((this.idTmpPrueba == null && other.idTmpPrueba != null) || (this.idTmpPrueba != null && !this.idTmpPrueba.equals(other.idTmpPrueba))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.TmpPrueba[ idTmpPrueba=" + idTmpPrueba + " ]";
    }
    
}
