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
@Table(name = "MD_SCHEMAS")
@NamedQueries({
    @NamedQuery(name = "MdSchemas.findAll", query = "SELECT m FROM MdSchemas m")})
public class MdSchemas implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Size(max = 4000)
    @Column(name = "NAME")
    private String name;
    @Column(name = "TYPE")
    private Character type;
    @Size(max = 4000)
    @Column(name = "CHARACTER_SET")
    private String characterSet;
    @Size(max = 40)
    @Column(name = "VERSION_TAG")
    private String versionTag;
    @Lob
    @Column(name = "NATIVE_SQL")
    private String nativeSql;
    @Size(max = 4000)
    @Column(name = "NATIVE_KEY")
    private String nativeKey;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "schemaIdFk", fetch = FetchType.LAZY)
    private List<MdStoredPrograms> mdStoredProgramsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "schemaIdFk", fetch = FetchType.LAZY)
    private List<MdPackages> mdPackagesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "schemaIdFk", fetch = FetchType.LAZY)
    private List<MdUserDefinedDataTypes> mdUserDefinedDataTypesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "schemaIdFk", fetch = FetchType.LAZY)
    private List<MdUsers> mdUsersList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "schemaIdFk", fetch = FetchType.LAZY)
    private List<MdSequences> mdSequencesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "schemaIdFk", fetch = FetchType.LAZY)
    private List<MdPrivileges> mdPrivilegesList;
    @JoinColumn(name = "CATALOG_ID_FK", referencedColumnName = "ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private MdCatalogs catalogIdFk;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "schemaIdFk", fetch = FetchType.LAZY)
    private List<MdTables> mdTablesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "schemaIdFk", fetch = FetchType.LAZY)
    private List<MdSynonyms> mdSynonymsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "schemaIdFk", fetch = FetchType.LAZY)
    private List<MdGroups> mdGroupsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "schemaIdFk", fetch = FetchType.LAZY)
    private List<MdOtherObjects> mdOtherObjectsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "schemaIdFk", fetch = FetchType.LAZY)
    private List<MdMigrWeakdep> mdMigrWeakdepList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "schemaIdFk", fetch = FetchType.LAZY)
    private List<MdTablespaces> mdTablespacesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "schemaIdFk", fetch = FetchType.LAZY)
    private List<MdViews> mdViewsList;

    public MdSchemas() {
    }

    public MdSchemas(BigDecimal id) {
        this.id = id;
    }

    public MdSchemas(BigDecimal id, BigInteger securityGroupId, Date createdOn) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getType() {
        return type;
    }

    public void setType(Character type) {
        this.type = type;
    }

    public String getCharacterSet() {
        return characterSet;
    }

    public void setCharacterSet(String characterSet) {
        this.characterSet = characterSet;
    }

    public String getVersionTag() {
        return versionTag;
    }

    public void setVersionTag(String versionTag) {
        this.versionTag = versionTag;
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

    public List<MdStoredPrograms> getMdStoredProgramsList() {
        return mdStoredProgramsList;
    }

    public void setMdStoredProgramsList(List<MdStoredPrograms> mdStoredProgramsList) {
        this.mdStoredProgramsList = mdStoredProgramsList;
    }

    public List<MdPackages> getMdPackagesList() {
        return mdPackagesList;
    }

    public void setMdPackagesList(List<MdPackages> mdPackagesList) {
        this.mdPackagesList = mdPackagesList;
    }

    public List<MdUserDefinedDataTypes> getMdUserDefinedDataTypesList() {
        return mdUserDefinedDataTypesList;
    }

    public void setMdUserDefinedDataTypesList(List<MdUserDefinedDataTypes> mdUserDefinedDataTypesList) {
        this.mdUserDefinedDataTypesList = mdUserDefinedDataTypesList;
    }

    public List<MdUsers> getMdUsersList() {
        return mdUsersList;
    }

    public void setMdUsersList(List<MdUsers> mdUsersList) {
        this.mdUsersList = mdUsersList;
    }

    public List<MdSequences> getMdSequencesList() {
        return mdSequencesList;
    }

    public void setMdSequencesList(List<MdSequences> mdSequencesList) {
        this.mdSequencesList = mdSequencesList;
    }

    public List<MdPrivileges> getMdPrivilegesList() {
        return mdPrivilegesList;
    }

    public void setMdPrivilegesList(List<MdPrivileges> mdPrivilegesList) {
        this.mdPrivilegesList = mdPrivilegesList;
    }

    public MdCatalogs getCatalogIdFk() {
        return catalogIdFk;
    }

    public void setCatalogIdFk(MdCatalogs catalogIdFk) {
        this.catalogIdFk = catalogIdFk;
    }

    public List<MdTables> getMdTablesList() {
        return mdTablesList;
    }

    public void setMdTablesList(List<MdTables> mdTablesList) {
        this.mdTablesList = mdTablesList;
    }

    public List<MdSynonyms> getMdSynonymsList() {
        return mdSynonymsList;
    }

    public void setMdSynonymsList(List<MdSynonyms> mdSynonymsList) {
        this.mdSynonymsList = mdSynonymsList;
    }

    public List<MdGroups> getMdGroupsList() {
        return mdGroupsList;
    }

    public void setMdGroupsList(List<MdGroups> mdGroupsList) {
        this.mdGroupsList = mdGroupsList;
    }

    public List<MdOtherObjects> getMdOtherObjectsList() {
        return mdOtherObjectsList;
    }

    public void setMdOtherObjectsList(List<MdOtherObjects> mdOtherObjectsList) {
        this.mdOtherObjectsList = mdOtherObjectsList;
    }

    public List<MdMigrWeakdep> getMdMigrWeakdepList() {
        return mdMigrWeakdepList;
    }

    public void setMdMigrWeakdepList(List<MdMigrWeakdep> mdMigrWeakdepList) {
        this.mdMigrWeakdepList = mdMigrWeakdepList;
    }

    public List<MdTablespaces> getMdTablespacesList() {
        return mdTablespacesList;
    }

    public void setMdTablespacesList(List<MdTablespaces> mdTablespacesList) {
        this.mdTablespacesList = mdTablespacesList;
    }

    public List<MdViews> getMdViewsList() {
        return mdViewsList;
    }

    public void setMdViewsList(List<MdViews> mdViewsList) {
        this.mdViewsList = mdViewsList;
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
        if (!(object instanceof MdSchemas)) {
            return false;
        }
        MdSchemas other = (MdSchemas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.MdSchemas[ id=" + id + " ]";
    }
    
}
