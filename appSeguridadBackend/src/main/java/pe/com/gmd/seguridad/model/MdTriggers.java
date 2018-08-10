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
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "MD_TRIGGERS")
@NamedQueries({
    @NamedQuery(name = "MdTriggers.findAll", query = "SELECT m FROM MdTriggers m")})
public class MdTriggers implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TABLE_OR_VIEW_ID_FK")
    private BigInteger tableOrViewIdFk;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TRIGGER_ON_FLAG")
    private Character triggerOnFlag;
    @Size(max = 4000)
    @Column(name = "TRIGGER_NAME")
    private String triggerName;
    @Size(max = 4000)
    @Column(name = "TRIGGER_TIMING")
    private String triggerTiming;
    @Size(max = 4000)
    @Column(name = "TRIGGER_OPERATION")
    private String triggerOperation;
    @Size(max = 4000)
    @Column(name = "TRIGGER_EVENT")
    private String triggerEvent;
    @Lob
    @Column(name = "NATIVE_SQL")
    private String nativeSql;
    @Size(max = 4000)
    @Column(name = "NATIVE_KEY")
    private String nativeKey;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LANGUAGE")
    private String language;
    @Size(max = 4000)
    @Column(name = "COMMENTS")
    private String comments;
    @Column(name = "LINECOUNT")
    private BigInteger linecount;
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

    public MdTriggers() {
    }

    public MdTriggers(BigDecimal id) {
        this.id = id;
    }

    public MdTriggers(BigDecimal id, BigInteger tableOrViewIdFk, Character triggerOnFlag, String language, BigInteger securityGroupId, Date createdOn) {
        this.id = id;
        this.tableOrViewIdFk = tableOrViewIdFk;
        this.triggerOnFlag = triggerOnFlag;
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

    public BigInteger getTableOrViewIdFk() {
        return tableOrViewIdFk;
    }

    public void setTableOrViewIdFk(BigInteger tableOrViewIdFk) {
        this.tableOrViewIdFk = tableOrViewIdFk;
    }

    public Character getTriggerOnFlag() {
        return triggerOnFlag;
    }

    public void setTriggerOnFlag(Character triggerOnFlag) {
        this.triggerOnFlag = triggerOnFlag;
    }

    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    public String getTriggerTiming() {
        return triggerTiming;
    }

    public void setTriggerTiming(String triggerTiming) {
        this.triggerTiming = triggerTiming;
    }

    public String getTriggerOperation() {
        return triggerOperation;
    }

    public void setTriggerOperation(String triggerOperation) {
        this.triggerOperation = triggerOperation;
    }

    public String getTriggerEvent() {
        return triggerEvent;
    }

    public void setTriggerEvent(String triggerEvent) {
        this.triggerEvent = triggerEvent;
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

    public BigInteger getLinecount() {
        return linecount;
    }

    public void setLinecount(BigInteger linecount) {
        this.linecount = linecount;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MdTriggers)) {
            return false;
        }
        MdTriggers other = (MdTriggers) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.MdTriggers[ id=" + id + " ]";
    }
    
}
