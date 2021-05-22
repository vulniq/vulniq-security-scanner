


package org.mitre.oval.xmlschema.oval_definitions_5_macos;

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
 *         &lt;element name="device" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="filepath" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="uread" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#macos}EntityStatePermissionCompareType" minOccurs="0"/>
 *         &lt;element name="uwrite" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#macos}EntityStatePermissionCompareType" minOccurs="0"/>
 *         &lt;element name="uexec" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#macos}EntityStatePermissionCompareType" minOccurs="0"/>
 *         &lt;element name="gread" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#macos}EntityStatePermissionCompareType" minOccurs="0"/>
 *         &lt;element name="gwrite" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#macos}EntityStatePermissionCompareType" minOccurs="0"/>
 *         &lt;element name="gexec" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#macos}EntityStatePermissionCompareType" minOccurs="0"/>
 *         &lt;element name="oread" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#macos}EntityStatePermissionCompareType" minOccurs="0"/>
 *         &lt;element name="owrite" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#macos}EntityStatePermissionCompareType" minOccurs="0"/>
 *         &lt;element name="oexec" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#macos}EntityStatePermissionCompareType" minOccurs="0"/>
 *         &lt;element name="user_differs" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="actual_user" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="expected_user" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="group_differs" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="actual_group" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="expected_group" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="symlink_differs" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="actual_symlink" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="expected_symlink" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
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
public class DiskutilState
    extends StateType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateStringType device;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateStringType filepath;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStatePermissionCompareType uread;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStatePermissionCompareType uwrite;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStatePermissionCompareType uexec;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStatePermissionCompareType gread;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStatePermissionCompareType gwrite;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStatePermissionCompareType gexec;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStatePermissionCompareType oread;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStatePermissionCompareType owrite;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStatePermissionCompareType oexec;
    @XmlElement(name = "user_differs", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateBoolType userDiffers;
    @XmlElement(name = "actual_user", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateIntType actualUser;
    @XmlElement(name = "expected_user", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateIntType expectedUser;
    @XmlElement(name = "group_differs", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateBoolType groupDiffers;
    @XmlElement(name = "actual_group", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateIntType actualGroup;
    @XmlElement(name = "expected_group", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateIntType expectedGroup;
    @XmlElement(name = "symlink_differs", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateBoolType symlinkDiffers;
    @XmlElement(name = "actual_symlink", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateStringType actualSymlink;
    @XmlElement(name = "expected_symlink", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateStringType expectedSymlink;

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setDevice(EntityStateStringType value) {
        this.device = value;
    }

    /**
     * Gets the value of the filepath property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getFilepath() {
        return filepath;
    }

    /**
     * Sets the value of the filepath property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setFilepath(EntityStateStringType value) {
        this.filepath = value;
    }

    /**
     * Gets the value of the uread property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public EntityStatePermissionCompareType getUread() {
        return uread;
    }

    /**
     * Sets the value of the uread property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public void setUread(EntityStatePermissionCompareType value) {
        this.uread = value;
    }

    /**
     * Gets the value of the uwrite property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public EntityStatePermissionCompareType getUwrite() {
        return uwrite;
    }

    /**
     * Sets the value of the uwrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public void setUwrite(EntityStatePermissionCompareType value) {
        this.uwrite = value;
    }

    /**
     * Gets the value of the uexec property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public EntityStatePermissionCompareType getUexec() {
        return uexec;
    }

    /**
     * Sets the value of the uexec property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public void setUexec(EntityStatePermissionCompareType value) {
        this.uexec = value;
    }

    /**
     * Gets the value of the gread property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public EntityStatePermissionCompareType getGread() {
        return gread;
    }

    /**
     * Sets the value of the gread property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public void setGread(EntityStatePermissionCompareType value) {
        this.gread = value;
    }

    /**
     * Gets the value of the gwrite property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public EntityStatePermissionCompareType getGwrite() {
        return gwrite;
    }

    /**
     * Sets the value of the gwrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public void setGwrite(EntityStatePermissionCompareType value) {
        this.gwrite = value;
    }

    /**
     * Gets the value of the gexec property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public EntityStatePermissionCompareType getGexec() {
        return gexec;
    }

    /**
     * Sets the value of the gexec property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public void setGexec(EntityStatePermissionCompareType value) {
        this.gexec = value;
    }

    /**
     * Gets the value of the oread property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public EntityStatePermissionCompareType getOread() {
        return oread;
    }

    /**
     * Sets the value of the oread property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public void setOread(EntityStatePermissionCompareType value) {
        this.oread = value;
    }

    /**
     * Gets the value of the owrite property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public EntityStatePermissionCompareType getOwrite() {
        return owrite;
    }

    /**
     * Sets the value of the owrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public void setOwrite(EntityStatePermissionCompareType value) {
        this.owrite = value;
    }

    /**
     * Gets the value of the oexec property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public EntityStatePermissionCompareType getOexec() {
        return oexec;
    }

    /**
     * Sets the value of the oexec property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStatePermissionCompareType }
     *     
     */
    public void setOexec(EntityStatePermissionCompareType value) {
        this.oexec = value;
    }

    /**
     * Gets the value of the userDiffers property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getUserDiffers() {
        return userDiffers;
    }

    /**
     * Sets the value of the userDiffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setUserDiffers(EntityStateBoolType value) {
        this.userDiffers = value;
    }

    /**
     * Gets the value of the actualUser property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getActualUser() {
        return actualUser;
    }

    /**
     * Sets the value of the actualUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setActualUser(EntityStateIntType value) {
        this.actualUser = value;
    }

    /**
     * Gets the value of the expectedUser property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getExpectedUser() {
        return expectedUser;
    }

    /**
     * Sets the value of the expectedUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setExpectedUser(EntityStateIntType value) {
        this.expectedUser = value;
    }

    /**
     * Gets the value of the groupDiffers property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getGroupDiffers() {
        return groupDiffers;
    }

    /**
     * Sets the value of the groupDiffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setGroupDiffers(EntityStateBoolType value) {
        this.groupDiffers = value;
    }

    /**
     * Gets the value of the actualGroup property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getActualGroup() {
        return actualGroup;
    }

    /**
     * Sets the value of the actualGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setActualGroup(EntityStateIntType value) {
        this.actualGroup = value;
    }

    /**
     * Gets the value of the expectedGroup property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getExpectedGroup() {
        return expectedGroup;
    }

    /**
     * Sets the value of the expectedGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setExpectedGroup(EntityStateIntType value) {
        this.expectedGroup = value;
    }

    /**
     * Gets the value of the symlinkDiffers property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSymlinkDiffers() {
        return symlinkDiffers;
    }

    /**
     * Sets the value of the symlinkDiffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSymlinkDiffers(EntityStateBoolType value) {
        this.symlinkDiffers = value;
    }

    /**
     * Gets the value of the actualSymlink property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getActualSymlink() {
        return actualSymlink;
    }

    /**
     * Sets the value of the actualSymlink property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setActualSymlink(EntityStateStringType value) {
        this.actualSymlink = value;
    }

    /**
     * Gets the value of the expectedSymlink property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getExpectedSymlink() {
        return expectedSymlink;
    }

    /**
     * Sets the value of the expectedSymlink property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setExpectedSymlink(EntityStateStringType value) {
        this.expectedSymlink = value;
    }

}
