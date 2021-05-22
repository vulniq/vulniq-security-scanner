


package org.mitre.oval.xmlschema.oval_system_characteristics_5_windows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemBoolType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemIntType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}ItemType">
 *       &lt;sequence>
 *         &lt;element name="netname" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="shared_type" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemSharedResourceTypeType" minOccurs="0"/>
 *         &lt;element name="max_uses" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="current_uses" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="local_path" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="access_read_permission" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="access_write_permission" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="access_create_permission" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="access_exec_permission" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="access_delete_permission" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="access_atrib_permission" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="access_perm_permission" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="access_all_permission" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
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
public class SharedresourceItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemStringType netname;
    @XmlElement(name = "shared_type", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemSharedResourceTypeType sharedType;
    @XmlElement(name = "max_uses", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType maxUses;
    @XmlElement(name = "current_uses", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType currentUses;
    @XmlElement(name = "local_path", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemStringType localPath;
    @XmlElement(name = "access_read_permission", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType accessReadPermission;
    @XmlElement(name = "access_write_permission", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType accessWritePermission;
    @XmlElement(name = "access_create_permission", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType accessCreatePermission;
    @XmlElement(name = "access_exec_permission", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType accessExecPermission;
    @XmlElement(name = "access_delete_permission", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType accessDeletePermission;
    @XmlElement(name = "access_atrib_permission", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType accessAtribPermission;
    @XmlElement(name = "access_perm_permission", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType accessPermPermission;
    @XmlElement(name = "access_all_permission", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType accessAllPermission;

    /**
     * Gets the value of the netname property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getNetname() {
        return netname;
    }

    /**
     * Sets the value of the netname property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setNetname(EntityItemStringType value) {
        this.netname = value;
    }

    /**
     * Gets the value of the sharedType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemSharedResourceTypeType }
     *     
     */
    public EntityItemSharedResourceTypeType getSharedType() {
        return sharedType;
    }

    /**
     * Sets the value of the sharedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemSharedResourceTypeType }
     *     
     */
    public void setSharedType(EntityItemSharedResourceTypeType value) {
        this.sharedType = value;
    }

    /**
     * Gets the value of the maxUses property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMaxUses() {
        return maxUses;
    }

    /**
     * Sets the value of the maxUses property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMaxUses(EntityItemIntType value) {
        this.maxUses = value;
    }

    /**
     * Gets the value of the currentUses property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getCurrentUses() {
        return currentUses;
    }

    /**
     * Sets the value of the currentUses property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setCurrentUses(EntityItemIntType value) {
        this.currentUses = value;
    }

    /**
     * Gets the value of the localPath property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getLocalPath() {
        return localPath;
    }

    /**
     * Sets the value of the localPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setLocalPath(EntityItemStringType value) {
        this.localPath = value;
    }

    /**
     * Gets the value of the accessReadPermission property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAccessReadPermission() {
        return accessReadPermission;
    }

    /**
     * Sets the value of the accessReadPermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAccessReadPermission(EntityItemBoolType value) {
        this.accessReadPermission = value;
    }

    /**
     * Gets the value of the accessWritePermission property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAccessWritePermission() {
        return accessWritePermission;
    }

    /**
     * Sets the value of the accessWritePermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAccessWritePermission(EntityItemBoolType value) {
        this.accessWritePermission = value;
    }

    /**
     * Gets the value of the accessCreatePermission property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAccessCreatePermission() {
        return accessCreatePermission;
    }

    /**
     * Sets the value of the accessCreatePermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAccessCreatePermission(EntityItemBoolType value) {
        this.accessCreatePermission = value;
    }

    /**
     * Gets the value of the accessExecPermission property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAccessExecPermission() {
        return accessExecPermission;
    }

    /**
     * Sets the value of the accessExecPermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAccessExecPermission(EntityItemBoolType value) {
        this.accessExecPermission = value;
    }

    /**
     * Gets the value of the accessDeletePermission property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAccessDeletePermission() {
        return accessDeletePermission;
    }

    /**
     * Sets the value of the accessDeletePermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAccessDeletePermission(EntityItemBoolType value) {
        this.accessDeletePermission = value;
    }

    /**
     * Gets the value of the accessAtribPermission property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAccessAtribPermission() {
        return accessAtribPermission;
    }

    /**
     * Sets the value of the accessAtribPermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAccessAtribPermission(EntityItemBoolType value) {
        this.accessAtribPermission = value;
    }

    /**
     * Gets the value of the accessPermPermission property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAccessPermPermission() {
        return accessPermPermission;
    }

    /**
     * Sets the value of the accessPermPermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAccessPermPermission(EntityItemBoolType value) {
        this.accessPermPermission = value;
    }

    /**
     * Gets the value of the accessAllPermission property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAccessAllPermission() {
        return accessAllPermission;
    }

    /**
     * Sets the value of the accessAllPermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAccessAllPermission(EntityItemBoolType value) {
        this.accessAllPermission = value;
    }

}
