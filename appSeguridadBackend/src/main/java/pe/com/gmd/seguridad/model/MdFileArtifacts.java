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
@Table(name = "MD_FILE_ARTIFACTS")
@NamedQueries({
    @NamedQuery(name = "MdFileArtifacts.findAll", query = "SELECT m FROM MdFileArtifacts m")})
public class MdFileArtifacts implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Size(max = 4000)
    @Column(name = "PATTERN")
    private String pattern;
    @Size(max = 4000)
    @Column(name = "STRING_FOUND")
    private String stringFound;
    @Size(max = 4000)
    @Column(name = "STRING_REPLACED")
    private String stringReplaced;
    @Size(max = 200)
    @Column(name = "TYPE")
    private String type;
    @Size(max = 4000)
    @Column(name = "STATUS")
    private String status;
    @Column(name = "LINE")
    private BigInteger line;
    @Column(name = "PATTERN_START")
    private BigInteger patternStart;
    @Column(name = "PATTERN_END")
    private BigInteger patternEnd;
    @Column(name = "DUE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dueDate;
    @Size(max = 100)
    @Column(name = "DB_TYPE")
    private String dbType;
    @Size(max = 1000)
    @Column(name = "CODE_TYPE")
    private String codeType;
    @Size(max = 4000)
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "PRIORITY")
    private BigInteger priority;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "SECURITY_GROUP_ID")
    private String securityGroupId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CREATED_ON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Size(max = 4000)
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "LAST_UPDATED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdated;
    @Size(max = 4000)
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @JoinColumn(name = "APPLICATIONFILES_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private MdApplicationfiles applicationfilesId;

    public MdFileArtifacts() {
    }

    public MdFileArtifacts(BigDecimal id) {
        this.id = id;
    }

    public MdFileArtifacts(BigDecimal id, String securityGroupId, Date createdOn) {
        this.id = id;
        this.securityGroupId = securityGroupId;
        this.createdOn = createdOn;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getStringFound() {
        return stringFound;
    }

    public void setStringFound(String stringFound) {
        this.stringFound = stringFound;
    }

    public String getStringReplaced() {
        return stringReplaced;
    }

    public void setStringReplaced(String stringReplaced) {
        this.stringReplaced = stringReplaced;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigInteger getLine() {
        return line;
    }

    public void setLine(BigInteger line) {
        this.line = line;
    }

    public BigInteger getPatternStart() {
        return patternStart;
    }

    public void setPatternStart(BigInteger patternStart) {
        this.patternStart = patternStart;
    }

    public BigInteger getPatternEnd() {
        return patternEnd;
    }

    public void setPatternEnd(BigInteger patternEnd) {
        this.patternEnd = patternEnd;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getDbType() {
        return dbType;
    }

    public void setDbType(String dbType) {
        this.dbType = dbType;
    }

    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigInteger getPriority() {
        return priority;
    }

    public void setPriority(BigInteger priority) {
        this.priority = priority;
    }

    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
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

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public MdApplicationfiles getApplicationfilesId() {
        return applicationfilesId;
    }

    public void setApplicationfilesId(MdApplicationfiles applicationfilesId) {
        this.applicationfilesId = applicationfilesId;
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
        if (!(object instanceof MdFileArtifacts)) {
            return false;
        }
        MdFileArtifacts other = (MdFileArtifacts) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.MdFileArtifacts[ id=" + id + " ]";
    }
    
}
