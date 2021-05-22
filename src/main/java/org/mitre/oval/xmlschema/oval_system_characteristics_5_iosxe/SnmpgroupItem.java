


package org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="version" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe}EntityItemSNMPVersionStringType" minOccurs="0"/>
 *         &lt;element name="snmpv3_sec_level" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe}EntityItemSNMPSecLevelStringType" minOccurs="0"/>
 *         &lt;element name="ipv4_acl" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="ipv6_acl" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="read_view" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="write_view" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="notify_view" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
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
    "name",
    "version",
    "snmpv3SecLevel",
    "ipv4Acl",
    "ipv6Acl",
    "readView",
    "writeView",
    "notifyView"
})
public class SnmpgroupItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe")
    protected EntityItemStringType name;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe")
    protected EntityItemSNMPVersionStringType version;
    @XmlElement(name = "snmpv3_sec_level", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe")
    protected EntityItemSNMPSecLevelStringType snmpv3SecLevel;
    @XmlElement(name = "ipv4_acl", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe")
    protected EntityItemStringType ipv4Acl;
    @XmlElement(name = "ipv6_acl", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe")
    protected EntityItemStringType ipv6Acl;
    @XmlElement(name = "read_view", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe")
    protected EntityItemStringType readView;
    @XmlElement(name = "write_view", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe")
    protected EntityItemStringType writeView;
    @XmlElement(name = "notify_view", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe")
    protected EntityItemStringType notifyView;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setName(EntityItemStringType value) {
        this.name = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemSNMPVersionStringType }
     *     
     */
    public EntityItemSNMPVersionStringType getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemSNMPVersionStringType }
     *     
     */
    public void setVersion(EntityItemSNMPVersionStringType value) {
        this.version = value;
    }

    /**
     * Gets the value of the snmpv3SecLevel property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemSNMPSecLevelStringType }
     *     
     */
    public EntityItemSNMPSecLevelStringType getSnmpv3SecLevel() {
        return snmpv3SecLevel;
    }

    /**
     * Sets the value of the snmpv3SecLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemSNMPSecLevelStringType }
     *     
     */
    public void setSnmpv3SecLevel(EntityItemSNMPSecLevelStringType value) {
        this.snmpv3SecLevel = value;
    }

    /**
     * Gets the value of the ipv4Acl property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getIpv4Acl() {
        return ipv4Acl;
    }

    /**
     * Sets the value of the ipv4Acl property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setIpv4Acl(EntityItemStringType value) {
        this.ipv4Acl = value;
    }

    /**
     * Gets the value of the ipv6Acl property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getIpv6Acl() {
        return ipv6Acl;
    }

    /**
     * Sets the value of the ipv6Acl property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setIpv6Acl(EntityItemStringType value) {
        this.ipv6Acl = value;
    }

    /**
     * Gets the value of the readView property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getReadView() {
        return readView;
    }

    /**
     * Sets the value of the readView property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setReadView(EntityItemStringType value) {
        this.readView = value;
    }

    /**
     * Gets the value of the writeView property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getWriteView() {
        return writeView;
    }

    /**
     * Sets the value of the writeView property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setWriteView(EntityItemStringType value) {
        this.writeView = value;
    }

    /**
     * Gets the value of the notifyView property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getNotifyView() {
        return notifyView;
    }

    /**
     * Sets the value of the notifyView property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setNotifyView(EntityItemStringType value) {
        this.notifyView = value;
    }

}
