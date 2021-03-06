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
import javax.persistence.Lob;
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
@Table(name = "MD_CONSTRAINTS")
@NamedQueries({
    @NamedQuery(name = "MdConstraints.findAll", query = "SELECT m FROM MdConstraints m")})
public class MdConstraints implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Size(max = 4000)
    @Column(name = "DELETE_CLAUSE")
    private String deleteClause;
    @Size(max = 4000)
    @Column(name = "NAME")
    private String name;
    @Size(max = 4000)
    @Column(name = "CONSTRAINT_TYPE")
    private String constraintType;
    @Column(name = "REFTABLE_ID_FK")
    private BigInteger reftableIdFk;
    @Lob
    @Column(name = "CONSTRAINT_TEXT")
    private String constraintText;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LANGUAGE")
    private String language;
    @Size(max = 4000)
    @Column(name = "COMMENTS")
    private String comments;
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
    @JoinColumn(name = "TABLE_ID_FK", referencedColumnName = "ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private MdTables tableIdFk;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "constraintIdFk", fetch = FetchType.LAZY)
    private List<MdConstraintDetails> mdConstraintDetailsList;

    public MdConstraints() {
    }

    public MdConstraints(BigDecimal id) {
        this.id = id;
    }

    public MdConstraints(BigDecimal id, String language, BigInteger securityGroupId, Date createdOn) {
        this.id = id;
        this.language = language;
        this.securityGroupId = securityGroupId;
        this.createdOn = createdOn;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getDeleteClause() {
        return deleteClause;
    }

    public void setDeleteClause(String deleteClause) {
        this.deleteClause = deleteClause;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConstraintType() {
        return constraintType;
    }

    public void setConstraintType(String constraintType) {
        this.constraintType = constraintType;
    }

    public BigInteger getReftableIdFk() {
        return reftableIdFk;
    }

    public void setReftableIdFk(BigInteger reftableIdFk) {
        this.reftableIdFk = reftableIdFk;
    }

    public String getConstraintText() {
        return constraintText;
    }

    public void setConstraintText(String constraintText) {
        this.constraintText = constraintText;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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

    public MdTables getTableIdFk() {
        return tableIdFk;
    }

    public void setTableIdFk(MdTables tableIdFk) {
        this.tableIdFk = tableIdFk;
    }

    public List<MdConstraintDetails> getMdConstraintDetailsList() {
        return mdConstraintDetailsList;
    }

    public void setMdConstraintDetailsList(List<MdConstraintDetails> mdConstraintDetailsList) {
        this.mdConstraintDetailsList = mdConstraintDetailsList;
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
        if (!(object instanceof MdConstraints)) {
            return false;
        }
        MdConstraints other = (MdConstraints) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.MdConstraints[ id=" + id + " ]";
    }
    
}
