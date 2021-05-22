


package org.mitre.oval.xmlschema.oval_system_characteristics_5_linux;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="mount_point" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="device" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="uuid" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="fs_type" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="mount_options" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="total_space" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="space_used" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="space_left" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="space_left_for_unprivileged_users" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="block_size" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
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
public class PartitionItem
    extends ItemType
{

    @XmlElement(name = "mount_point", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemStringType mountPoint;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemStringType device;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemStringType uuid;
    @XmlElement(name = "fs_type", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemStringType fsType;
    @XmlElement(name = "mount_options", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected List<EntityItemStringType> mountOptions;
    @XmlElement(name = "total_space", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemIntType totalSpace;
    @XmlElement(name = "space_used", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemIntType spaceUsed;
    @XmlElement(name = "space_left", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemIntType spaceLeft;
    @XmlElement(name = "space_left_for_unprivileged_users", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemIntType spaceLeftForUnprivilegedUsers;
    @XmlElement(name = "block_size", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemIntType blockSize;

    /**
     * Gets the value of the mountPoint property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getMountPoint() {
        return mountPoint;
    }

    /**
     * Sets the value of the mountPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setMountPoint(EntityItemStringType value) {
        this.mountPoint = value;
    }

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
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setUuid(EntityItemStringType value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the fsType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getFsType() {
        return fsType;
    }

    /**
     * Sets the value of the fsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setFsType(EntityItemStringType value) {
        this.fsType = value;
    }

    /**
     * Gets the value of the mountOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mountOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMountOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemStringType }
     * 
     * 
     */
    public List<EntityItemStringType> getMountOptions() {
        if (mountOptions == null) {
            mountOptions = new ArrayList<EntityItemStringType>();
        }
        return this.mountOptions;
    }

    /**
     * Gets the value of the totalSpace property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getTotalSpace() {
        return totalSpace;
    }

    /**
     * Sets the value of the totalSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setTotalSpace(EntityItemIntType value) {
        this.totalSpace = value;
    }

    /**
     * Gets the value of the spaceUsed property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getSpaceUsed() {
        return spaceUsed;
    }

    /**
     * Sets the value of the spaceUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setSpaceUsed(EntityItemIntType value) {
        this.spaceUsed = value;
    }

    /**
     * Gets the value of the spaceLeft property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getSpaceLeft() {
        return spaceLeft;
    }

    /**
     * Sets the value of the spaceLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setSpaceLeft(EntityItemIntType value) {
        this.spaceLeft = value;
    }

    /**
     * Gets the value of the spaceLeftForUnprivilegedUsers property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getSpaceLeftForUnprivilegedUsers() {
        return spaceLeftForUnprivilegedUsers;
    }

    /**
     * Sets the value of the spaceLeftForUnprivilegedUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setSpaceLeftForUnprivilegedUsers(EntityItemIntType value) {
        this.spaceLeftForUnprivilegedUsers = value;
    }

    /**
     * Gets the value of the blockSize property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getBlockSize() {
        return blockSize;
    }

    /**
     * Sets the value of the blockSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setBlockSize(EntityItemIntType value) {
        this.blockSize = value;
    }

}
