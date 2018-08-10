/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.gmd.seguridad.model;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "INSTITUCION")
@NamedQueries({
    @NamedQuery(name = "Institucion.findAll", query = "SELECT i FROM Institucion i")})
public class Institucion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_INSTITUCION")
    private Integer idInstitucion;
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
    @Column(name = "ID_EMPL")
    private BigInteger idEmpl;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idInstitucion", fetch = FetchType.LAZY)
    private List<Servicio> servicioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idInstitucion", fetch = FetchType.LAZY)
    private List<InstitucionHist> institucionHistList;
    @OneToMany(mappedBy = "idInstitucion", fetch = FetchType.LAZY)
    private List<Usuario> usuarioList;

    public Institucion() {
    }

    public Institucion(Integer idInstitucion) {
        this.idInstitucion = idInstitucion;
    }

    public Institucion(Integer idInstitucion, String noInst, String tiDocu, String txNumeDocu, String noAbrvInst, String tiInst, Character stInst, Character stRegi, String idUsuaCrea, Date feUsuaCrea, String deTermCrea) {
        this.idInstitucion = idInstitucion;
        this.noInst = noInst;
        this.tiDocu = tiDocu;
        this.txNumeDocu = txNumeDocu;
        this.noAbrvInst = noAbrvInst;
        this.tiInst = tiInst;
        this.stInst = stInst;
        this.stRegi = stRegi;
        this.idUsuaCrea = idUsuaCrea;
        this.feUsuaCrea = feUsuaCrea;
        this.deTermCrea = deTermCrea;
    }

    public Integer getIdInstitucion() {
        return idInstitucion;
    }

    public void setIdInstitucion(Integer idInstitucion) {
        this.idInstitucion = idInstitucion;
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

    public BigInteger getIdEmpl() {
        return idEmpl;
    }

    public void setIdEmpl(BigInteger idEmpl) {
        this.idEmpl = idEmpl;
    }

    public List<Servicio> getServicioList() {
        return servicioList;
    }

    public void setServicioList(List<Servicio> servicioList) {
        this.servicioList = servicioList;
    }

    public List<InstitucionHist> getInstitucionHistList() {
        return institucionHistList;
    }

    public void setInstitucionHistList(List<InstitucionHist> institucionHistList) {
        this.institucionHistList = institucionHistList;
    }

    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInstitucion != null ? idInstitucion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Institucion)) {
            return false;
        }
        Institucion other = (Institucion) object;
        if ((this.idInstitucion == null && other.idInstitucion != null) || (this.idInstitucion != null && !this.idInstitucion.equals(other.idInstitucion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.Institucion[ idInstitucion=" + idInstitucion + " ]";
    }
    
}
