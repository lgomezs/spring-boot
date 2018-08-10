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
@Table(name = "MD_MIGR_WEAKDEP")
@NamedQueries({
    @NamedQuery(name = "MdMigrWeakdep.findAll", query = "SELECT m FROM MdMigrWeakdep m")})
public class MdMigrWeakdep implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PARENT_ID")
    private BigInteger parentId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4000)
    @Column(name = "CHILD_NAME")
    private String childName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4000)
    @Column(name = "PARENT_TYPE")
    private String parentType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4000)
    @Column(name = "CHILD_TYPE")
    private String childType;
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
    @JoinColumn(name = "CONNECTION_ID_FK", referencedColumnName = "ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private MdConnections connectionIdFk;
    @JoinColumn(name = "SCHEMA_ID_FK", referencedColumnName = "ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private MdSchemas schemaIdFk;

    public MdMigrWeakdep() {
    }

    public MdMigrWeakdep(BigDecimal id) {
        this.id = id;
    }

    public MdMigrWeakdep(BigDecimal id, BigInteger parentId, String childName, String parentType, String childType, BigInteger securityGroupId, Date createdOn) {
        this.id = id;
        this.parentId = parentId;
        this.childName = childName;
        this.parentType = parentType;
        this.childType = childType;
        this.securityGroupId = securityGroupId;
        this.createdOn = createdOn;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigInteger getParentId() {
        return parentId;
    }

    public void setParentId(BigInteger parentId) {
        this.parentId = parentId;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public String getParentType() {
        return parentType;
    }

    public void setParentType(String parentType) {
        this.parentType = parentType;
    }

    public String getChildType() {
        return childType;
    }

    public void setChildType(String childType) {
        this.childType = childType;
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

    public MdConnections getConnectionIdFk() {
        return connectionIdFk;
    }

    public void setConnectionIdFk(MdConnections connectionIdFk) {
        this.connectionIdFk = connectionIdFk;
    }

    public MdSchemas getSchemaIdFk() {
        return schemaIdFk;
    }

    public void setSchemaIdFk(MdSchemas schemaIdFk) {
        this.schemaIdFk = schemaIdFk;
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
        if (!(object instanceof MdMigrWeakdep)) {
            return false;
        }
        MdMigrWeakdep other = (MdMigrWeakdep) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.MdMigrWeakdep[ id=" + id + " ]";
    }
    
}
