/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.gmd.seguridad.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "MD_APPLICATIONFILES")
@NamedQueries({
    @NamedQuery(name = "MdApplicationfiles.findAll", query = "SELECT m FROM MdApplicationfiles m")})
public class MdApplicationfiles implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4000)
    @Column(name = "URI")
    private String uri;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "TYPE")
    private String type;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "STATE")
    private String state;
    @Size(max = 100)
    @Column(name = "LANGUAGE")
    private String language;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECURITY_GROUP_ID")
    private BigInteger securityGroupId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CREATED_ON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Size(max = 4000)
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "UPDATED_ON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedOn;
    @Size(max = 4000)
    @Column(name = "UPDATED_BY")
    private String updatedBy;
    @JoinColumn(name = "APPLICATIONS_ID_FK", referencedColumnName = "ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private MdApplications applicationsIdFk;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "applicationfilesId", fetch = FetchType.LAZY)
    private List<MdFileArtifacts> mdFileArtifactsList;

    public MdApplicationfiles() {
    }

    public MdApplicationfiles(BigDecimal id) {
        this.id = id;
    }

    public MdApplicationfiles(BigDecimal id, String name, String uri, String type, String state, BigInteger securityGroupId, Date createdOn) {
        this.id = id;
        this.name = name;
        this.uri = uri;
        this.type = type;
        this.state = state;
        this.securityGroupId = securityGroupId;
        this.createdOn = createdOn;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public BigInteger getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(BigInteger securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public MdApplications getApplicationsIdFk() {
        return applicationsIdFk;
    }

    public void setApplicationsIdFk(MdApplications applicationsIdFk) {
        this.applicationsIdFk = applicationsIdFk;
    }

    public List<MdFileArtifacts> getMdFileArtifactsList() {
        return mdFileArtifactsList;
    }

    public void setMdFileArtifactsList(List<MdFileArtifacts> mdFileArtifactsList) {
        this.mdFileArtifactsList = mdFileArtifactsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MdApplicationfiles)) {
            return false;
        }
        MdApplicationfiles other = (MdApplicationfiles) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.MdApplicationfiles[ id=" + id + " ]";
    }
    
}
