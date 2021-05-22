


package org.mitre.oval.xmlschema.oval_definitions_5_windows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateIPAddressStringType;
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
 *         &lt;element name="name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="index" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="type" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateInterfaceTypeType" minOccurs="0"/>
 *         &lt;element name="hardware_addr" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="inet_addr" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIPAddressStringType" minOccurs="0"/>
 *         &lt;element name="broadcast_addr" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIPAddressStringType" minOccurs="0"/>
 *         &lt;element name="netmask" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIPAddressStringType" minOccurs="0"/>
 *         &lt;element name="addr_type" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAddrTypeType" minOccurs="0"/>
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
    "index",
    "type",
    "hardwareAddr",
    "inetAddr",
    "broadcastAddr",
    "netmask",
    "addrType"
})
public class InterfaceState
    extends StateType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateStringType name;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType index;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateInterfaceTypeType type;
    @XmlElement(name = "hardware_addr", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateStringType hardwareAddr;
    @XmlElement(name = "inet_addr", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIPAddressStringType inetAddr;
    @XmlElement(name = "broadcast_addr", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIPAddressStringType broadcastAddr;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIPAddressStringType netmask;
    @XmlElement(name = "addr_type", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAddrTypeType addrType;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setName(EntityStateStringType value) {
        this.name = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setIndex(EntityStateIntType value) {
        this.index = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateInterfaceTypeType }
     *     
     */
    public EntityStateInterfaceTypeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateInterfaceTypeType }
     *     
     */
    public void setType(EntityStateInterfaceTypeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the hardwareAddr property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getHardwareAddr() {
        return hardwareAddr;
    }

    /**
     * Sets the value of the hardwareAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setHardwareAddr(EntityStateStringType value) {
        this.hardwareAddr = value;
    }

    /**
     * Gets the value of the inetAddr property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIPAddressStringType }
     *     
     */
    public EntityStateIPAddressStringType getInetAddr() {
        return inetAddr;
    }

    /**
     * Sets the value of the inetAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIPAddressStringType }
     *     
     */
    public void setInetAddr(EntityStateIPAddressStringType value) {
        this.inetAddr = value;
    }

    /**
     * Gets the value of the broadcastAddr property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIPAddressStringType }
     *     
     */
    public EntityStateIPAddressStringType getBroadcastAddr() {
        return broadcastAddr;
    }

    /**
     * Sets the value of the broadcastAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIPAddressStringType }
     *     
     */
    public void setBroadcastAddr(EntityStateIPAddressStringType value) {
        this.broadcastAddr = value;
    }

    /**
     * Gets the value of the netmask property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIPAddressStringType }
     *     
     */
    public EntityStateIPAddressStringType getNetmask() {
        return netmask;
    }

    /**
     * Sets the value of the netmask property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIPAddressStringType }
     *     
     */
    public void setNetmask(EntityStateIPAddressStringType value) {
        this.netmask = value;
    }

    /**
     * Gets the value of the addrType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAddrTypeType }
     *     
     */
    public EntityStateAddrTypeType getAddrType() {
        return addrType;
    }

    /**
     * Sets the value of the addrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAddrTypeType }
     *     
     */
    public void setAddrType(EntityStateAddrTypeType value) {
        this.addrType = value;
    }

}
