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
@Table(name = "MD_MIGR_PARAMETER")
@NamedQueries({
    @NamedQuery(name = "MdMigrParameter.findAll", query = "SELECT m FROM MdMigrParameter m")})
public class MdMigrParameter implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "OBJECT_ID")
    private BigInteger objectId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4000)
    @Column(name = "OBJECT_TYPE")
    private String objectType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PARAM_EXISTING")
    private BigInteger paramExisting;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PARAM_ORDER")
    private BigInteger paramOrder;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4000)
    @Column(name = "PARAM_NAME")
    private String paramName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4000)
    @Column(name = "PARAM_TYPE")
    private String paramType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4000)
    @Column(name = "PARAM_DATA_TYPE")
    private String paramDataType;
    @Column(name = "PERCISION")
    private BigInteger percision;
    @Column(name = "SCALE")
    private BigInteger scale;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NULLABLE")
    private Character nullable;
    @Size(max = 4000)
    @Column(name = "DEFAULT_VALUE")
    private String defaultValue;
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

    public MdMigrParameter() {
    }

    public MdMigrParameter(BigDecimal id) {
        this.id = id;
    }

    public MdMigrParameter(BigDecimal id, BigInteger objectId, String objectType, BigInteger paramExisting, BigInteger paramOrder, String paramName, String paramType, String paramDataType, Character nullable, BigInteger securityGroupId, Date createdOn) {
        this.id = id;
        this.objectId = objectId;
        this.objectType = objectType;
        this.paramExisting = paramExisting;
        this.paramOrder = paramOrder;
        this.paramName = paramName;
        this.paramType = paramType;
        this.paramDataType = paramDataType;
        this.nullable = nullable;
        this.securityGroupId = securityGroupId;
        this.createdOn = createdOn;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigInteger getObjectId() {
        return objectId;
    }

    public void setObjectId(BigInteger objectId) {
        this.objectId = objectId;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public BigInteger getParamExisting() {
        return paramExisting;
    }

    public void setParamExisting(BigInteger paramExisting) {
        this.paramExisting = paramExisting;
    }

    public BigInteger getParamOrder() {
        return paramOrder;
    }

    public void setParamOrder(BigInteger paramOrder) {
        this.paramOrder = paramOrder;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public String getParamType() {
        return paramType;
    }

    public void setParamType(String paramType) {
        this.paramType = paramType;
    }

    public String getParamDataType() {
        return paramDataType;
    }

    public void setParamDataType(String paramDataType) {
        this.paramDataType = paramDataType;
    }

    public BigInteger getPercision() {
        return percision;
    }

    public void setPercision(BigInteger percision) {
        this.percision = percision;
    }

    public BigInteger getScale() {
        return scale;
    }

    public void setScale(BigInteger scale) {
        this.scale = scale;
    }

    public Character getNullable() {
        return nullable;
    }

    public void setNullable(Character nullable) {
        this.nullable = nullable;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MdMigrParameter)) {
            return false;
        }
        MdMigrParameter other = (MdMigrParameter) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.MdMigrParameter[ id=" + id + " ]";
    }
    
}
