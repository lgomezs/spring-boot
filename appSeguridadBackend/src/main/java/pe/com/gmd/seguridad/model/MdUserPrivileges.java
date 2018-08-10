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
@Table(name = "MD_USER_PRIVILEGES")
@NamedQueries({
    @NamedQuery(name = "MdUserPrivileges.findAll", query = "SELECT m FROM MdUserPrivileges m")})
public class MdUserPrivileges implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
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
    @Column(name = "LAST_UDPATED_BY")
    private String lastUdpatedBy;
    @JoinColumn(name = "PRIVILEGE_ID_FK", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private MdPrivileges privilegeIdFk;
    @JoinColumn(name = "USER_ID_FK", referencedColumnName = "ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private MdUsers userIdFk;

    public MdUserPrivileges() {
    }

    public MdUserPrivileges(BigDecimal id) {
        this.id = id;
    }

    public MdUserPrivileges(BigDecimal id, BigInteger securityGroupId, Date createdOn) {
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

    public String getLastUdpatedBy() {
        return lastUdpatedBy;
    }

    public void setLastUdpatedBy(String lastUdpatedBy) {
        this.lastUdpatedBy = lastUdpatedBy;
    }

    public MdPrivileges getPrivilegeIdFk() {
        return privilegeIdFk;
    }

    public void setPrivilegeIdFk(MdPrivileges privilegeIdFk) {
        this.privilegeIdFk = privilegeIdFk;
    }

    public MdUsers getUserIdFk() {
        return userIdFk;
    }

    public void setUserIdFk(MdUsers userIdFk) {
        this.userIdFk = userIdFk;
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
        if (!(object instanceof MdUserPrivileges)) {
            return false;
        }
        MdUserPrivileges other = (MdUserPrivileges) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.MdUserPrivileges[ id=" + id + " ]";
    }
    
}
