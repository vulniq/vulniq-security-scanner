


package org.mitre.oval.xmlschema.oval_definitions_5_windows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateBoolType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateIntType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateStringType;
import org.mitre.oval.xmlschema.oval_definitions_5.StateType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.mitre.org/XMLSchema/oval-definitions-5}StateType">
 *       &lt;sequence>
 *         &lt;element name="netname" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="shared_type" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateSharedResourceTypeType" minOccurs="0"/>
 *         &lt;element name="max_uses" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="current_uses" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="local_path" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="access_read_permission" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="access_write_permission" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="access_create_permission" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="access_exec_permission" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="access_delete_permission" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="access_atrib_permission" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="access_perm_permission" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="access_all_permission" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "netname",
    "sharedType",
    "maxUses",
    "currentUses",
    "localPath",
    "accessReadPermission",
    "accessWritePermission",
    "accessCreatePermission",
    "accessExecPermission",
    "accessDeletePermission",
    "accessAtribPermission",
    "accessPermPermission",
    "accessAllPermission"
})
public class SharedresourceState
    extends StateType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateStringType netname;
    @XmlElement(name = "shared_type", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateSharedResourceTypeType sharedType;
    @XmlElement(name = "max_uses", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType maxUses;
    @XmlElement(name = "current_uses", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType currentUses;
    @XmlElement(name = "local_path", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateStringType localPath;
    @XmlElement(name = "access_read_permission", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType accessReadPermission;
    @XmlElement(name = "access_write_permission", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType accessWritePermission;
    @XmlElement(name = "access_create_permission", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType accessCreatePermission;
    @XmlElement(name = "access_exec_permission", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType accessExecPermission;
    @XmlElement(name = "access_delete_permission", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType accessDeletePermission;
    @XmlElement(name = "access_atrib_permission", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType accessAtribPermission;
    @XmlElement(name = "access_perm_permission", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType accessPermPermission;
    @XmlElement(name = "access_all_permission", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType accessAllPermission;

    /**
     * Gets the value of the netname property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getNetname() {
        return netname;
    }

    /**
     * Sets the value of the netname property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setNetname(EntityStateStringType value) {
        this.netname = value;
    }

    /**
     * Gets the value of the sharedType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateSharedResourceTypeType }
     *     
     */
    public EntityStateSharedResourceTypeType getSharedType() {
        return sharedType;
    }

    /**
     * Sets the value of the sharedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateSharedResourceTypeType }
     *     
     */
    public void setSharedType(EntityStateSharedResourceTypeType value) {
        this.sharedType = value;
    }

    /**
     * Gets the value of the maxUses property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMaxUses() {
        return maxUses;
    }

    /**
     * Sets the value of the maxUses property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMaxUses(EntityStateIntType value) {
        this.maxUses = value;
    }

    /**
     * Gets the value of the currentUses property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getCurrentUses() {
        return currentUses;
    }

    /**
     * Sets the value of the currentUses property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setCurrentUses(EntityStateIntType value) {
        this.currentUses = value;
    }

    /**
     * Gets the value of the localPath property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getLocalPath() {
        return localPath;
    }

    /**
     * Sets the value of the localPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setLocalPath(EntityStateStringType value) {
        this.localPath = value;
    }

    /**
     * Gets the value of the accessReadPermission property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAccessReadPermission() {
        return accessReadPermission;
    }

    /**
     * Sets the value of the accessReadPermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAccessReadPermission(EntityStateBoolType value) {
        this.accessReadPermission = value;
    }

    /**
     * Gets the value of the accessWritePermission property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAccessWritePermission() {
        return accessWritePermission;
    }

    /**
     * Sets the value of the accessWritePermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAccessWritePermission(EntityStateBoolType value) {
        this.accessWritePermission = value;
    }

    /**
     * Gets the value of the accessCreatePermission property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAccessCreatePermission() {
        return accessCreatePermission;
    }

    /**
     * Sets the value of the accessCreatePermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAccessCreatePermission(EntityStateBoolType value) {
        this.accessCreatePermission = value;
    }

    /**
     * Gets the value of the accessExecPermission property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAccessExecPermission() {
        return accessExecPermission;
    }

    /**
     * Sets the value of the accessExecPermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAccessExecPermission(EntityStateBoolType value) {
        this.accessExecPermission = value;
    }

    /**
     * Gets the value of the accessDeletePermission property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAccessDeletePermission() {
        return accessDeletePermission;
    }

    /**
     * Sets the value of the accessDeletePermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAccessDeletePermission(EntityStateBoolType value) {
        this.accessDeletePermission = value;
    }

    /**
     * Gets the value of the accessAtribPermission property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAccessAtribPermission() {
        return accessAtribPermission;
    }

    /**
     * Sets the value of the accessAtribPermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAccessAtribPermission(EntityStateBoolType value) {
        this.accessAtribPermission = value;
    }

    /**
     * Gets the value of the accessPermPermission property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAccessPermPermission() {
        return accessPermPermission;
    }

    /**
     * Sets the value of the accessPermPermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAccessPermPermission(EntityStateBoolType value) {
        this.accessPermPermission = value;
    }

    /**
     * Gets the value of the accessAllPermission property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAccessAllPermission() {
        return accessAllPermission;
    }

    /**
     * Sets the value of the accessAllPermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAccessAllPermission(EntityStateBoolType value) {
        this.accessAllPermission = value;
    }

}
