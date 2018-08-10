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
@Table(name = "MD_CONNECTIONS")
@NamedQueries({
    @NamedQuery(name = "MdConnections.findAll", query = "SELECT m FROM MdConnections m")})
public class MdConnections implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Size(max = 4000)
    @Column(name = "TYPE")
    private String type;
    @Size(max = 4000)
    @Column(name = "HOST")
    private String host;
    @Column(name = "PORT")
    private BigInteger port;
    @Size(max = 4000)
    @Column(name = "USERNAME")
    private String username;
    @Size(max = 4000)
    @Column(name = "PASSWORD")
    private String password;
    @Size(max = 4000)
    @Column(name = "DBURL")
    private String dburl;
    @Size(max = 255)
    @Column(name = "NAME")
    private String name;
    @Lob
    @Column(name = "NATIVE_SQL")
    private String nativeSql;
    @Size(max = 30)
    @Column(name = "STATUS")
    private String status;
    @Column(name = "NUM_CATALOGS")
    private BigInteger numCatalogs;
    @Column(name = "NUM_COLUMNS")
    private BigInteger numColumns;
    @Column(name = "NUM_CONSTRAINTS")
    private BigInteger numConstraints;
    @Column(name = "NUM_GROUPS")
    private BigInteger numGroups;
    @Column(name = "NUM_ROLES")
    private BigInteger numRoles;
    @Column(name = "NUM_INDEXES")
    private BigInteger numIndexes;
    @Column(name = "NUM_OTHER_OBJECTS")
    private BigInteger numOtherObjects;
    @Column(name = "NUM_PACKAGES")
    private BigInteger numPackages;
    @Column(name = "NUM_PRIVILEGES")
    private BigInteger numPrivileges;
    @Column(name = "NUM_SCHEMAS")
    private BigInteger numSchemas;
    @Column(name = "NUM_SEQUENCES")
    private BigInteger numSequences;
    @Column(name = "NUM_STORED_PROGRAMS")
    private BigInteger numStoredPrograms;
    @Column(name = "NUM_SYNONYMS")
    private BigInteger numSynonyms;
    @Column(name = "NUM_TABLES")
    private BigInteger numTables;
    @Column(name = "NUM_TABLESPACES")
    private BigInteger numTablespaces;
    @Column(name = "NUM_TRIGGERS")
    private BigInteger numTriggers;
    @Column(name = "NUM_USER_DEFINED_DATA_TYPES")
    private BigInteger numUserDefinedDataTypes;
    @Column(name = "NUM_USERS")
    private BigInteger numUsers;
    @Column(name = "NUM_VIEWS")
    private BigInteger numViews;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "connectionIdFk", fetch = FetchType.LAZY)
    private List<MdCatalogs> mdCatalogsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "connectionIdFk", fetch = FetchType.LAZY)
    private List<MigrGenerationOrder> migrGenerationOrderList;
    @JoinColumn(name = "PROJECT_ID_FK", referencedColumnName = "ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private MdProjects projectIdFk;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "connectionIdFk", fetch = FetchType.LAZY)
    private List<MdMigrDependency> mdMigrDependencyList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "connectionIdFk", fetch = FetchType.LAZY)
    private List<MdAdditionalProperties> mdAdditionalPropertiesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "derivedConnectionIdFk", fetch = FetchType.LAZY)
    private List<MdDerivatives> mdDerivativesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "connectionIdFk", fetch = FetchType.LAZY)
    private List<MdApplications> mdApplicationsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "connectionIdFk", fetch = FetchType.LAZY)
    private List<MdMigrParameter> mdMigrParameterList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "connectionIdFk", fetch = FetchType.LAZY)
    private List<MdMigrWeakdep> mdMigrWeakdepList;

    public MdConnections() {
    }

    public MdConnections(BigDecimal id) {
        this.id = id;
    }

    public MdConnections(BigDecimal id, BigInteger securityGroupId, Date createdOn) {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public BigInteger getPort() {
        return port;
    }

    public void setPort(BigInteger port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDburl() {
        return dburl;
    }

    public void setDburl(String dburl) {
        this.dburl = dburl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNativeSql() {
        return nativeSql;
    }

    public void setNativeSql(String nativeSql) {
        this.nativeSql = nativeSql;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigInteger getNumCatalogs() {
        return numCatalogs;
    }

    public void setNumCatalogs(BigInteger numCatalogs) {
        this.numCatalogs = numCatalogs;
    }

    public BigInteger getNumColumns() {
        return numColumns;
    }

    public void setNumColumns(BigInteger numColumns) {
        this.numColumns = numColumns;
    }

    public BigInteger getNumConstraints() {
        return numConstraints;
    }

    public void setNumConstraints(BigInteger numConstraints) {
        this.numConstraints = numConstraints;
    }

    public BigInteger getNumGroups() {
        return numGroups;
    }

    public void setNumGroups(BigInteger numGroups) {
        this.numGroups = numGroups;
    }

    public BigInteger getNumRoles() {
        return numRoles;
    }

    public void setNumRoles(BigInteger numRoles) {
        this.numRoles = numRoles;
    }

    public BigInteger getNumIndexes() {
        return numIndexes;
    }

    public void setNumIndexes(BigInteger numIndexes) {
        this.numIndexes = numIndexes;
    }

    public BigInteger getNumOtherObjects() {
        return numOtherObjects;
    }

    public void setNumOtherObjects(BigInteger numOtherObjects) {
        this.numOtherObjects = numOtherObjects;
    }

    public BigInteger getNumPackages() {
        return numPackages;
    }

    public void setNumPackages(BigInteger numPackages) {
        this.numPackages = numPackages;
    }

    public BigInteger getNumPrivileges() {
        return numPrivileges;
    }

    public void setNumPrivileges(BigInteger numPrivileges) {
        this.numPrivileges = numPrivileges;
    }

    public BigInteger getNumSchemas() {
        return numSchemas;
    }

    public void setNumSchemas(BigInteger numSchemas) {
        this.numSchemas = numSchemas;
    }

    public BigInteger getNumSequences() {
        return numSequences;
    }

    public void setNumSequences(BigInteger numSequences) {
        this.numSequences = numSequences;
    }

    public BigInteger getNumStoredPrograms() {
        return numStoredPrograms;
    }

    public void setNumStoredPrograms(BigInteger numStoredPrograms) {
        this.numStoredPrograms = numStoredPrograms;
    }

    public BigInteger getNumSynonyms() {
        return numSynonyms;
    }

    public void setNumSynonyms(BigInteger numSynonyms) {
        this.numSynonyms = numSynonyms;
    }

    public BigInteger getNumTables() {
        return numTables;
    }

    public void setNumTables(BigInteger numTables) {
        this.numTables = numTables;
    }

    public BigInteger getNumTablespaces() {
        return numTablespaces;
    }

    public void setNumTablespaces(BigInteger numTablespaces) {
        this.numTablespaces = numTablespaces;
    }

    public BigInteger getNumTriggers() {
        return numTriggers;
    }

    public void setNumTriggers(BigInteger numTriggers) {
        this.numTriggers = numTriggers;
    }

    public BigInteger getNumUserDefinedDataTypes() {
        return numUserDefinedDataTypes;
    }

    public void setNumUserDefinedDataTypes(BigInteger numUserDefinedDataTypes) {
        this.numUserDefinedDataTypes = numUserDefinedDataTypes;
    }

    public BigInteger getNumUsers() {
        return numUsers;
    }

    public void setNumUsers(BigInteger numUsers) {
        this.numUsers = numUsers;
    }

    public BigInteger getNumViews() {
        return numViews;
    }

    public void setNumViews(BigInteger numViews) {
        this.numViews = numViews;
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

    public List<MdCatalogs> getMdCatalogsList() {
        return mdCatalogsList;
    }

    public void setMdCatalogsList(List<MdCatalogs> mdCatalogsList) {
        this.mdCatalogsList = mdCatalogsList;
    }

    public List<MigrGenerationOrder> getMigrGenerationOrderList() {
        return migrGenerationOrderList;
    }

    public void setMigrGenerationOrderList(List<MigrGenerationOrder> migrGenerationOrderList) {
        this.migrGenerationOrderList = migrGenerationOrderList;
    }

    public MdProjects getProjectIdFk() {
        return projectIdFk;
    }

    public void setProjectIdFk(MdProjects projectIdFk) {
        this.projectIdFk = projectIdFk;
    }

    public List<MdMigrDependency> getMdMigrDependencyList() {
        return mdMigrDependencyList;
    }

    public void setMdMigrDependencyList(List<MdMigrDependency> mdMigrDependencyList) {
        this.mdMigrDependencyList = mdMigrDependencyList;
    }

    public List<MdAdditionalProperties> getMdAdditionalPropertiesList() {
        return mdAdditionalPropertiesList;
    }

    public void setMdAdditionalPropertiesList(List<MdAdditionalProperties> mdAdditionalPropertiesList) {
        this.mdAdditionalPropertiesList = mdAdditionalPropertiesList;
    }

    public List<MdDerivatives> getMdDerivativesList() {
        return mdDerivativesList;
    }

    public void setMdDerivativesList(List<MdDerivatives> mdDerivativesList) {
        this.mdDerivativesList = mdDerivativesList;
    }

    public List<MdApplications> getMdApplicationsList() {
        return mdApplicationsList;
    }

    public void setMdApplicationsList(List<MdApplications> mdApplicationsList) {
        this.mdApplicationsList = mdApplicationsList;
    }

    public List<MdMigrParameter> getMdMigrParameterList() {
        return mdMigrParameterList;
    }

    public void setMdMigrParameterList(List<MdMigrParameter> mdMigrParameterList) {
        this.mdMigrParameterList = mdMigrParameterList;
    }

    public List<MdMigrWeakdep> getMdMigrWeakdepList() {
        return mdMigrWeakdepList;
    }

    public void setMdMigrWeakdepList(List<MdMigrWeakdep> mdMigrWeakdepList) {
        this.mdMigrWeakdepList = mdMigrWeakdepList;
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
        if (!(object instanceof MdConnections)) {
            return false;
        }
        MdConnections other = (MdConnections) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.MdConnections[ id=" + id + " ]";
    }
    
}
