


package org.mitre.oval.xmlschema.oval_system_characteristics_5_macos;

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
 *         &lt;element name="device" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="filepath" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="uread" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos}EntityItemPermissionCompareType" minOccurs="0"/>
 *         &lt;element name="uwrite" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos}EntityItemPermissionCompareType" minOccurs="0"/>
 *         &lt;element name="uexec" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos}EntityItemPermissionCompareType" minOccurs="0"/>
 *         &lt;element name="gread" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos}EntityItemPermissionCompareType" minOccurs="0"/>
 *         &lt;element name="gwrite" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos}EntityItemPermissionCompareType" minOccurs="0"/>
 *         &lt;element name="gexec" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos}EntityItemPermissionCompareType" minOccurs="0"/>
 *         &lt;element name="oread" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos}EntityItemPermissionCompareType" minOccurs="0"/>
 *         &lt;element name="owrite" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos}EntityItemPermissionCompareType" minOccurs="0"/>
 *         &lt;element name="oexec" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos}EntityItemPermissionCompareType" minOccurs="0"/>
 *         &lt;element name="user_differs" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="actual_user" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="expected_user" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="group_differs" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="actual_group" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="expected_group" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="symlink_differs" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="actual_symlink" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="expected_symlink" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
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
    "device",
    "filepath",
    "uread",
    "uwrite",
    "uexec",
    "gread",
    "gwrite",
    "gexec",
    "oread",
    "owrite",
    "oexec",
    "userDiffers",
    "actualUser",
    "expectedUser",
    "groupDiffers",
    "actualGroup",
    "expectedGroup",
    "symlinkDiffers",
    "actualSymlink",
    "expectedSymlink"
})
public class DiskutilItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemStringType device;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemStringType filepath;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemPermissionCompareType uread;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemPermissionCompareType uwrite;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemPermissionCompareType uexec;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemPermissionCompareType gread;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemPermissionCompareType gwrite;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemPermissionCompareType gexec;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemPermissionCompareType oread;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemPermissionCompareType owrite;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemPermissionCompareType oexec;
    @XmlElement(name = "user_differs", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemBoolType userDiffers;
    @XmlElement(name = "actual_user", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemIntType actualUser;
    @XmlElement(name = "expected_user", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemIntType expectedUser;
    @XmlElement(name = "group_differs", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemBoolType groupDiffers;
    @XmlElement(name = "actual_group", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemIntType actualGroup;
    @XmlElement(name = "expected_group", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemIntType expectedGroup;
    @XmlElement(name = "symlink_differs", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemBoolType symlinkDiffers;
    @XmlElement(name = "actual_symlink", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemStringType actualSymlink;
    @XmlElement(name = "expected_symlink", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemStringType expectedSymlink;

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setDevice(EntityItemStringType value) {
        this.device = value;
    }

    /**
     * Gets the value of the filepath property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getFilepath() {
        return filepath;
    }

    /**
     * Sets the value of the filepath property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setFilepath(EntityItemStringType value) {
        this.filepath = value;
    }

    /**
     * Gets the value of the uread property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public EntityItemPermissionCompareType getUread() {
        return uread;
    }

    /**
     * Sets the value of the uread property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public void setUread(EntityItemPermissionCompareType value) {
        this.uread = value;
    }

    /**
     * Gets the value of the uwrite property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public EntityItemPermissionCompareType getUwrite() {
        return uwrite;
    }

    /**
     * Sets the value of the uwrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public void setUwrite(EntityItemPermissionCompareType value) {
        this.uwrite = value;
    }

    /**
     * Gets the value of the uexec property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public EntityItemPermissionCompareType getUexec() {
        return uexec;
    }

    /**
     * Sets the value of the uexec property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public void setUexec(EntityItemPermissionCompareType value) {
        this.uexec = value;
    }

    /**
     * Gets the value of the gread property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public EntityItemPermissionCompareType getGread() {
        return gread;
    }

    /**
     * Sets the value of the gread property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public void setGread(EntityItemPermissionCompareType value) {
        this.gread = value;
    }

    /**
     * Gets the value of the gwrite property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public EntityItemPermissionCompareType getGwrite() {
        return gwrite;
    }

    /**
     * Sets the value of the gwrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public void setGwrite(EntityItemPermissionCompareType value) {
        this.gwrite = value;
    }

    /**
     * Gets the value of the gexec property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public EntityItemPermissionCompareType getGexec() {
        return gexec;
    }

    /**
     * Sets the value of the gexec property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public void setGexec(EntityItemPermissionCompareType value) {
        this.gexec = value;
    }

    /**
     * Gets the value of the oread property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public EntityItemPermissionCompareType getOread() {
        return oread;
    }

    /**
     * Sets the value of the oread property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public void setOread(EntityItemPermissionCompareType value) {
        this.oread = value;
    }

    /**
     * Gets the value of the owrite property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public EntityItemPermissionCompareType getOwrite() {
        return owrite;
    }

    /**
     * Sets the value of the owrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public void setOwrite(EntityItemPermissionCompareType value) {
        this.owrite = value;
    }

    /**
     * Gets the value of the oexec property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public EntityItemPermissionCompareType getOexec() {
        return oexec;
    }

    /**
     * Sets the value of the oexec property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemPermissionCompareType }
     *     
     */
    public void setOexec(EntityItemPermissionCompareType value) {
        this.oexec = value;
    }

    /**
     * Gets the value of the userDiffers property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getUserDiffers() {
        return userDiffers;
    }

    /**
     * Sets the value of the userDiffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setUserDiffers(EntityItemBoolType value) {
        this.userDiffers = value;
    }

    /**
     * Gets the value of the actualUser property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getActualUser() {
        return actualUser;
    }

    /**
     * Sets the value of the actualUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setActualUser(EntityItemIntType value) {
        this.actualUser = value;
    }

    /**
     * Gets the value of the expectedUser property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getExpectedUser() {
        return expectedUser;
    }

    /**
     * Sets the value of the expectedUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setExpectedUser(EntityItemIntType value) {
        this.expectedUser = value;
    }

    /**
     * Gets the value of the groupDiffers property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getGroupDiffers() {
        return groupDiffers;
    }

    /**
     * Sets the value of the groupDiffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setGroupDiffers(EntityItemBoolType value) {
        this.groupDiffers = value;
    }

    /**
     * Gets the value of the actualGroup property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getActualGroup() {
        return actualGroup;
    }

    /**
     * Sets the value of the actualGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setActualGroup(EntityItemIntType value) {
        this.actualGroup = value;
    }

    /**
     * Gets the value of the expectedGroup property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getExpectedGroup() {
        return expectedGroup;
    }

    /**
     * Sets the value of the expectedGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setExpectedGroup(EntityItemIntType value) {
        this.expectedGroup = value;
    }

    /**
     * Gets the value of the symlinkDiffers property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSymlinkDiffers() {
        return symlinkDiffers;
    }

    /**
     * Sets the value of the symlinkDiffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSymlinkDiffers(EntityItemBoolType value) {
        this.symlinkDiffers = value;
    }

    /**
     * Gets the value of the actualSymlink property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getActualSymlink() {
        return actualSymlink;
    }

    /**
     * Sets the value of the actualSymlink property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setActualSymlink(EntityItemStringType value) {
        this.actualSymlink = value;
    }

    /**
     * Gets the value of the expectedSymlink property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getExpectedSymlink() {
        return expectedSymlink;
    }

    /**
     * Sets the value of the expectedSymlink property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setExpectedSymlink(EntityItemStringType value) {
        this.expectedSymlink = value;
    }

}
