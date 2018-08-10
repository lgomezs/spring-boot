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
@Table(name = "INSTITUCION_HIST")
@NamedQueries({
    @NamedQuery(name = "InstitucionHist.findAll", query = "SELECT i FROM InstitucionHist i")})
public class InstitucionHist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_INST_HIST")
    private Integer idInstHist;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "NO_INST")
    private String noInst;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "TI_DOCU")
    private String tiDocu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "TX_NUME_DOCU")
    private String txNumeDocu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "NO_ABRV_INST")
    private String noAbrvInst;
    @Size(max = 200)
    @Column(name = "DE_INST")
    private String deInst;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "TI_INST")
    private String tiInst;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ST_INST")
    private Character stInst;
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
    @JoinColumn(name = "ID_INSTITUCION", referencedColumnName = "ID_INSTITUCION")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Institucion idInstitucion;

    public InstitucionHist() {
    }

    public InstitucionHist(Integer idInstHist) {
        this.idInstHist = idInstHist;
    }

    public InstitucionHist(Integer idInstHist, String noInst, String tiDocu, String txNumeDocu, String noAbrvInst, String tiInst, Character stInst, Character stRegi, String idUsuaCreaHist, Date feUsuaCreaHist, String deTermCreaHist, String idUsuaCrea, Date feUsuaCrea, String deTermCrea) {
        this.idInstHist = idInstHist;
        this.noInst = noInst;
        this.tiDocu = tiDocu;
        this.txNumeDocu = txNumeDocu;
        this.noAbrvInst = noAbrvInst;
        this.tiInst = tiInst;
        this.stInst = stInst;
        this.stRegi = stRegi;
        this.idUsuaCreaHist = idUsuaCreaHist;
        this.feUsuaCreaHist = feUsuaCreaHist;
        this.deTermCreaHist = deTermCreaHist;
        this.idUsuaCrea = idUsuaCrea;
        this.feUsuaCrea = feUsuaCrea;
        this.deTermCrea = deTermCrea;
    }

    public Integer getIdInstHist() {
        return idInstHist;
    }

    public void setIdInstHist(Integer idInstHist) {
        this.idInstHist = idInstHist;
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

    public Institucion getIdInstitucion() {
        return idInstitucion;
    }

    public void setIdInstitucion(Institucion idInstitucion) {
        this.idInstitucion = idInstitucion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInstHist != null ? idInstHist.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InstitucionHist)) {
            return false;
        }
        InstitucionHist other = (InstitucionHist) object;
        if ((this.idInstHist == null && other.idInstHist != null) || (this.idInstHist != null && !this.idInstHist.equals(other.idInstHist))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.InstitucionHist[ idInstHist=" + idInstHist + " ]";
    }
    
}
