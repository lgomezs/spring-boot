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
@Table(name = "MD_DERIVATIVES")
@NamedQueries({
    @NamedQuery(name = "MdDerivatives.findAll", query = "SELECT m FROM MdDerivatives m")})
public class MdDerivatives implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SRC_ID")
    private BigInteger srcId;
    @Size(max = 4000)
    @Column(name = "SRC_TYPE")
    private String srcType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DERIVED_ID")
    private BigInteger derivedId;
    @Size(max = 4000)
    @Column(name = "DERIVED_TYPE")
    private String derivedType;
    @Column(name = "TRANSFORMED")
    private Character transformed;
    @Size(max = 4000)
    @Column(name = "ORIGINAL_IDENTIFIER")
    private String originalIdentifier;
    @Size(max = 4000)
    @Column(name = "NEW_IDENTIFIER")
    private String newIdentifier;
    @Size(max = 40)
    @Column(name = "DERIVED_OBJECT_NAMESPACE")
    private String derivedObjectNamespace;
    @Size(max = 10)
    @Column(name = "DERIVATIVE_REASON")
    private String derivativeReason;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECURITY_GROUP_ID")
    private BigInteger securityGroupId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CREATED_ON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Size(max = 255)
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "LAST_UPDATED_ON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedOn;
    @Size(max = 255)
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @JoinColumn(name = "DERIVED_CONNECTION_ID_FK", referencedColumnName = "ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private MdConnections derivedConnectionIdFk;

    public MdDerivatives() {
    }

    public MdDerivatives(BigDecimal id) {
        this.id = id;
    }

    public MdDerivatives(BigDecimal id, BigInteger srcId, BigInteger derivedId, BigInteger securityGroupId, Date createdOn) {
        this.id = id;
        this.srcId = srcId;
        this.derivedId = derivedId;
        this.securityGroupId = securityGroupId;
        this.createdOn = createdOn;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigInteger getSrcId() {
        return srcId;
    }

    public void setSrcId(BigInteger srcId) {
        this.srcId = srcId;
    }

    public String getSrcType() {
        return srcType;
    }

    public void setSrcType(String srcType) {
        this.srcType = srcType;
    }

    public BigInteger getDerivedId() {
        return derivedId;
    }

    public void setDerivedId(BigInteger derivedId) {
        this.derivedId = derivedId;
    }

    public String getDerivedType() {
        return derivedType;
    }

    public void setDerivedType(String derivedType) {
        this.derivedType = derivedType;
    }

    public Character getTransformed() {
        return transformed;
    }

    public void setTransformed(Character transformed) {
        this.transformed = transformed;
    }

    public String getOriginalIdentifier() {
        return originalIdentifier;
    }

    public void setOriginalIdentifier(String originalIdentifier) {
        this.originalIdentifier = originalIdentifier;
    }

    public String getNewIdentifier() {
        return newIdentifier;
    }

    public void setNewIdentifier(String newIdentifier) {
        this.newIdentifier = newIdentifier;
    }

    public String getDerivedObjectNamespace() {
        return derivedObjectNamespace;
    }

    public void setDerivedObjectNamespace(String derivedObjectNamespace) {
        this.derivedObjectNamespace = derivedObjectNamespace;
    }

    public String getDerivativeReason() {
        return derivativeReason;
    }

    public void setDerivativeReason(String derivativeReason) {
        this.derivativeReason = derivativeReason;
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

    public Date getLastUpdatedOn() {
        return lastUpdatedOn;
    }

    public void setLastUpdatedOn(Date lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public MdConnections getDerivedConnectionIdFk() {
        return derivedConnectionIdFk;
    }

    public void setDerivedConnectionIdFk(MdConnections derivedConnectionIdFk) {
        this.derivedConnectionIdFk = derivedConnectionIdFk;
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
        if (!(object instanceof MdDerivatives)) {
            return false;
        }
        MdDerivatives other = (MdDerivatives) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.MdDerivatives[ id=" + id + " ]";
    }
    
}
