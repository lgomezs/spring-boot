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
@Table(name = "MD_INDEX_DETAILS")
@NamedQueries({
    @NamedQuery(name = "MdIndexDetails.findAll", query = "SELECT m FROM MdIndexDetails m")})
public class MdIndexDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "INDEX_PORTION")
    private BigInteger indexPortion;
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
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private MdColumns columnIdFk;
    @JoinColumn(name = "INDEX_ID_FK", referencedColumnName = "ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private MdIndexes indexIdFk;

    public MdIndexDetails() {
    }

    public MdIndexDetails(BigDecimal id) {
        this.id = id;
    }

    public MdIndexDetails(BigDecimal id, BigInteger detailOrder, BigInteger securityGroupId, Date createdOn) {
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

    public BigInteger getIndexPortion() {
        return indexPortion;
    }

    public void setIndexPortion(BigInteger indexPortion) {
        this.indexPortion = indexPortion;
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

    public MdIndexes getIndexIdFk() {
        return indexIdFk;
    }

    public void setIndexIdFk(MdIndexes indexIdFk) {
        this.indexIdFk = indexIdFk;
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
        if (!(object instanceof MdIndexDetails)) {
            return false;
        }
        MdIndexDetails other = (MdIndexDetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.MdIndexDetails[ id=" + id + " ]";
    }
    
}
