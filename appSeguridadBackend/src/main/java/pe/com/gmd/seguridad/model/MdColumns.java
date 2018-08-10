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
@Table(name = "MD_COLUMNS")
@NamedQueries({
    @NamedQuery(name = "MdColumns.findAll", query = "SELECT m FROM MdColumns m")})
public class MdColumns implements Serializable {

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
    @Column(name = "COLUMN_NAME")
    private String columnName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "COLUMN_ORDER")
    private BigInteger columnOrder;
    @Size(max = 4000)
    @Column(name = "COLUMN_TYPE")
    private String columnType;
    @Column(name = "PRECISION")
    private BigInteger precision;
    @Column(name = "SCALE")
    private BigInteger scale;
    @Column(name = "NULLABLE")
    private Character nullable;
    @Size(max = 4000)
    @Column(name = "DEFAULT_VALUE")
    private String defaultValue;
    @Lob
    @Column(name = "NATIVE_SQL")
    private String nativeSql;
    @Size(max = 4000)
    @Column(name = "NATIVE_KEY")
    private String nativeKey;
    @Column(name = "DATATYPE_TRANSFORMED_FLAG")
    private Character datatypeTransformedFlag;
    @Size(max = 4000)
    @Column(name = "COMMENTS")
    private String comments;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SECURITY_GROUP_ID")
    private BigInteger securityGroupId;
    @Size(max = 255)
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CREATED_ON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Size(max = 255)
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;
    @Column(name = "LAST_UPDATED_ON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedOn;
    @JoinColumn(name = "TABLE_ID_FK", referencedColumnName = "ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private MdTables tableIdFk;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "columnIdFk", fetch = FetchType.LAZY)
    private List<MdIndexDetails> mdIndexDetailsList;
    @OneToMany(mappedBy = "columnIdFk", fetch = FetchType.LAZY)
    private List<MdConstraintDetails> mdConstraintDetailsList;

    public MdColumns() {
    }

    public MdColumns(BigDecimal id) {
        this.id = id;
    }

    public MdColumns(BigDecimal id, String columnName, BigInteger columnOrder, BigInteger securityGroupId, Date createdOn) {
        this.id = id;
        this.columnName = columnName;
        this.columnOrder = columnOrder;
        this.securityGroupId = securityGroupId;
        this.createdOn = createdOn;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public BigInteger getColumnOrder() {
        return columnOrder;
    }

    public void setColumnOrder(BigInteger columnOrder) {
        this.columnOrder = columnOrder;
    }

    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    public BigInteger getPrecision() {
        return precision;
    }

    public void setPrecision(BigInteger precision) {
        this.precision = precision;
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

    public Character getDatatypeTransformedFlag() {
        return datatypeTransformedFlag;
    }

    public void setDatatypeTransformedFlag(Character datatypeTransformedFlag) {
        this.datatypeTransformedFlag = datatypeTransformedFlag;
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

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Date getLastUpdatedOn() {
        return lastUpdatedOn;
    }

    public void setLastUpdatedOn(Date lastUpdatedOn) {
        this.lastUpdatedOn = lastUpdatedOn;
    }

    public MdTables getTableIdFk() {
        return tableIdFk;
    }

    public void setTableIdFk(MdTables tableIdFk) {
        this.tableIdFk = tableIdFk;
    }

    public List<MdIndexDetails> getMdIndexDetailsList() {
        return mdIndexDetailsList;
    }

    public void setMdIndexDetailsList(List<MdIndexDetails> mdIndexDetailsList) {
        this.mdIndexDetailsList = mdIndexDetailsList;
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
        if (!(object instanceof MdColumns)) {
            return false;
        }
        MdColumns other = (MdColumns) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.MdColumns[ id=" + id + " ]";
    }
    
}
