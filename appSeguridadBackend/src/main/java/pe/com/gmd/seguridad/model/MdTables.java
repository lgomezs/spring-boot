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
@Table(name = "MD_TABLES")
@NamedQueries({
    @NamedQuery(name = "MdTables.findAll", query = "SELECT m FROM MdTables m")})
public class MdTables implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4000)
    @Column(name = "TABLE_NAME")
    private String tableName;
    @Lob
    @Column(name = "NATIVE_SQL")
    private String nativeSql;
    @Size(max = 4000)
    @Column(name = "NATIVE_KEY")
    private String nativeKey;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4000)
    @Column(name = "QUALIFIED_NATIVE_NAME")
    private String qualifiedNativeName;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tableIdFk", fetch = FetchType.LAZY)
    private List<MdConstraints> mdConstraintsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tableIdFk", fetch = FetchType.LAZY)
    private List<MdColumns> mdColumnsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tableIdFk", fetch = FetchType.LAZY)
    private List<MdIndexes> mdIndexesList;
    @JoinColumn(name = "SCHEMA_ID_FK", referencedColumnName = "ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private MdSchemas schemaIdFk;

    public MdTables() {
    }

    public MdTables(BigDecimal id) {
        this.id = id;
    }

    public MdTables(BigDecimal id, String tableName, String qualifiedNativeName, BigInteger securityGroupId, Date createdOn) {
        this.id = id;
        this.tableName = tableName;
        this.qualifiedNativeName = qualifiedNativeName;
        this.securityGroupId = securityGroupId;
        this.createdOn = createdOn;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getNativeSql() {
        return nativeSql;
    }

    public void setNativeSql(String nativeSql) {
        this.nativeSql = nativeSql;
    }

    public String getNativeKey() {
        return nativeKey;
    }

    public void setNativeKey(String nativeKey) {
        this.nativeKey = nativeKey;
    }

    public String getQualifiedNativeName() {
        return qualifiedNativeName;
    }

    public void setQualifiedNativeName(String qualifiedNativeName) {
        this.qualifiedNativeName = qualifiedNativeName;
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

    public List<MdConstraints> getMdConstraintsList() {
        return mdConstraintsList;
    }

    public void setMdConstraintsList(List<MdConstraints> mdConstraintsList) {
        this.mdConstraintsList = mdConstraintsList;
    }

    public List<MdColumns> getMdColumnsList() {
        return mdColumnsList;
    }

    public void setMdColumnsList(List<MdColumns> mdColumnsList) {
        this.mdColumnsList = mdColumnsList;
    }

    public List<MdIndexes> getMdIndexesList() {
        return mdIndexesList;
    }

    public void setMdIndexesList(List<MdIndexes> mdIndexesList) {
        this.mdIndexesList = mdIndexesList;
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
        if (!(object instanceof MdTables)) {
            return false;
        }
        MdTables other = (MdTables) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.MdTables[ id=" + id + " ]";
    }
    
}
