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
@Table(name = "MD_CONSTRAINT_DETAILS")
@NamedQueries({
    @NamedQuery(name = "MdConstraintDetails.findAll", query = "SELECT m FROM MdConstraintDetails m")})
public class MdConstraintDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "REF_FLAG")
    private Character refFlag;
    @Column(name = "COLUMN_PORTION")
    private BigInteger columnPortion;
    @Lob
    @Column(name = "CONSTRAINT_TEXT")
    private String constraintText;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DETAIL_ORDER")
    private BigInteger detailOrder;
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
    @JoinColumn(name = "COLUMN_ID_FK", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private MdColumns columnIdFk;
    @JoinColumn(name = "CONSTRAINT_ID_FK", referencedColumnName = "ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private MdConstraints constraintIdFk;

    public MdConstraintDetails() {
    }

    public MdConstraintDetails(BigDecimal id) {
        this.id = id;
    }

    public MdConstraintDetails(BigDecimal id, BigInteger detailOrder, BigInteger securityGroupId, Date createdOn) {
        this.id = id;
        this.detailOrder = detailOrder;
        this.securityGroupId = securityGroupId;
        this.createdOn = createdOn;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Character getRefFlag() {
        return refFlag;
    }

    public void setRefFlag(Character refFlag) {
        this.refFlag = refFlag;
    }

    public BigInteger getColumnPortion() {
        return columnPortion;
    }

    public void setColumnPortion(BigInteger columnPortion) {
        this.columnPortion = columnPortion;
    }

    public String getConstraintText() {
        return constraintText;
    }

    public void setConstraintText(String constraintText) {
        this.constraintText = constraintText;
    }

    public BigInteger getDetailOrder() {
        return detailOrder;
    }

    public void setDetailOrder(BigInteger detailOrder) {
        this.detailOrder = detailOrder;
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

    public MdColumns getColumnIdFk() {
        return columnIdFk;
    }

    public void setColumnIdFk(MdColumns columnIdFk) {
        this.columnIdFk = columnIdFk;
    }

    public MdConstraints getConstraintIdFk() {
        return constraintIdFk;
    }

    public void setConstraintIdFk(MdConstraints constraintIdFk) {
        this.constraintIdFk = constraintIdFk;
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
        if (!(object instanceof MdConstraintDetails)) {
            return false;
        }
        MdConstraintDetails other = (MdConstraintDetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.MdConstraintDetails[ id=" + id + " ]";
    }
    
}
