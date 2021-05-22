


package org.mitre.oval.xmlschema.oval_definitions_5_linux;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="mount_point" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="device" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="uuid" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="fs_type" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="mount_options" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="total_space" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="space_used" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="space_left" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="space_left_for_unprivileged_users" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="block_size" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
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
    "mountPoint",
    "device",
    "uuid",
    "fsType",
    "mountOptions",
    "totalSpace",
    "spaceUsed",
    "spaceLeft",
    "spaceLeftForUnprivilegedUsers",
    "blockSize"
})
public class PartitionState
    extends StateType
{

    @XmlElement(name = "mount_point", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateStringType mountPoint;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateStringType device;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateStringType uuid;
    @XmlElement(name = "fs_type", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateStringType fsType;
    @XmlElement(name = "mount_options", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateStringType mountOptions;
    @XmlElement(name = "total_space", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateIntType totalSpace;
    @XmlElement(name = "space_used", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateIntType spaceUsed;
    @XmlElement(name = "space_left", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateIntType spaceLeft;
    @XmlElement(name = "space_left_for_unprivileged_users", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateIntType spaceLeftForUnprivilegedUsers;
    @XmlElement(name = "block_size", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateIntType blockSize;

    /**
     * Gets the value of the mountPoint property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getMountPoint() {
        return mountPoint;
    }

    /**
     * Sets the value of the mountPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setMountPoint(EntityStateStringType value) {
        this.mountPoint = value;
    }

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
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setUuid(EntityStateStringType value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the fsType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getFsType() {
        return fsType;
    }

    /**
     * Sets the value of the fsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setFsType(EntityStateStringType value) {
        this.fsType = value;
    }

    /**
     * Gets the value of the mountOptions property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getMountOptions() {
        return mountOptions;
    }

    /**
     * Sets the value of the mountOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setMountOptions(EntityStateStringType value) {
        this.mountOptions = value;
    }

    /**
     * Gets the value of the totalSpace property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getTotalSpace() {
        return totalSpace;
    }

    /**
     * Sets the value of the totalSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setTotalSpace(EntityStateIntType value) {
        this.totalSpace = value;
    }

    /**
     * Gets the value of the spaceUsed property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getSpaceUsed() {
        return spaceUsed;
    }

    /**
     * Sets the value of the spaceUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setSpaceUsed(EntityStateIntType value) {
        this.spaceUsed = value;
    }

    /**
     * Gets the value of the spaceLeft property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getSpaceLeft() {
        return spaceLeft;
    }

    /**
     * Sets the value of the spaceLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setSpaceLeft(EntityStateIntType value) {
        this.spaceLeft = value;
    }

    /**
     * Gets the value of the spaceLeftForUnprivilegedUsers property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getSpaceLeftForUnprivilegedUsers() {
        return spaceLeftForUnprivilegedUsers;
    }

    /**
     * Sets the value of the spaceLeftForUnprivilegedUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setSpaceLeftForUnprivilegedUsers(EntityStateIntType value) {
        this.spaceLeftForUnprivilegedUsers = value;
    }

    /**
     * Gets the value of the blockSize property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getBlockSize() {
        return blockSize;
    }

    /**
     * Sets the value of the blockSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setBlockSize(EntityStateIntType value) {
        this.blockSize = value;
    }

}
