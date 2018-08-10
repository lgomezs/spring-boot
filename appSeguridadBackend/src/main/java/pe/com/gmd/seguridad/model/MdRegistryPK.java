/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.gmd.seguridad.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author lgomezs
 */
@Embeddable
public class MdRegistryPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "OBJECT_TYPE")
    private String objectType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "OBJECT_NAME")
    private String objectName;

    public MdRegistryPK() {
    }

    public MdRegistryPK(String objectType, String objectName) {
        this.objectType = objectType;
        this.objectName = objectName;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (objectType != null ? objectType.hashCode() : 0);
        hash += (objectName != null ? objectName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MdRegistryPK)) {
            return false;
        }
        MdRegistryPK other = (MdRegistryPK) object;
        if ((this.objectType == null && other.objectType != null) || (this.objectType != null && !this.objectType.equals(other.objectType))) {
            return false;
        }
        if ((this.objectName == null && other.objectName != null) || (this.objectName != null && !this.objectName.equals(other.objectName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pe.com.gmd.seguridad.seguridad.model.MdRegistryPK[ objectType=" + objectType + ", objectName=" + objectName + " ]";
    }
    
}
