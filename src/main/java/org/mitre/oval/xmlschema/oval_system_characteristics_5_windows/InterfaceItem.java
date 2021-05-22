


package org.mitre.oval.xmlschema.oval_system_characteristics_5_windows;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemIPAddressStringType;
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
 *         &lt;element name="name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="index" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="type" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemInterfaceTypeType" minOccurs="0"/>
 *         &lt;element name="hardware_addr" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="inet_addr" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIPAddressStringType" minOccurs="0"/>
 *         &lt;element name="broadcast_addr" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIPAddressStringType" minOccurs="0"/>
 *         &lt;element name="netmask" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIPAddressStringType" minOccurs="0"/>
 *         &lt;element name="addr_type" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAddrTypeType" maxOccurs="unbounded" minOccurs="0"/>
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
public class InterfaceItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemStringType name;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType index;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemInterfaceTypeType type;
    @XmlElement(name = "hardware_addr", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemStringType hardwareAddr;
    @XmlElement(name = "inet_addr", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIPAddressStringType inetAddr;
    @XmlElement(name = "broadcast_addr", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIPAddressStringType broadcastAddr;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIPAddressStringType netmask;
    @XmlElement(name = "addr_type", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected List<EntityItemAddrTypeType> addrType;

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
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setIndex(EntityItemIntType value) {
        this.index = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemInterfaceTypeType }
     *     
     */
    public EntityItemInterfaceTypeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemInterfaceTypeType }
     *     
     */
    public void setType(EntityItemInterfaceTypeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the hardwareAddr property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getHardwareAddr() {
        return hardwareAddr;
    }

    /**
     * Sets the value of the hardwareAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setHardwareAddr(EntityItemStringType value) {
        this.hardwareAddr = value;
    }

    /**
     * Gets the value of the inetAddr property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIPAddressStringType }
     *     
     */
    public EntityItemIPAddressStringType getInetAddr() {
        return inetAddr;
    }

    /**
     * Sets the value of the inetAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIPAddressStringType }
     *     
     */
    public void setInetAddr(EntityItemIPAddressStringType value) {
        this.inetAddr = value;
    }

    /**
     * Gets the value of the broadcastAddr property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIPAddressStringType }
     *     
     */
    public EntityItemIPAddressStringType getBroadcastAddr() {
        return broadcastAddr;
    }

    /**
     * Sets the value of the broadcastAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIPAddressStringType }
     *     
     */
    public void setBroadcastAddr(EntityItemIPAddressStringType value) {
        this.broadcastAddr = value;
    }

    /**
     * Gets the value of the netmask property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIPAddressStringType }
     *     
     */
    public EntityItemIPAddressStringType getNetmask() {
        return netmask;
    }

    /**
     * Sets the value of the netmask property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIPAddressStringType }
     *     
     */
    public void setNetmask(EntityItemIPAddressStringType value) {
        this.netmask = value;
    }

    /**
     * Gets the value of the addrType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addrType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddrType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemAddrTypeType }
     * 
     * 
     */
    public List<EntityItemAddrTypeType> getAddrType() {
        if (addrType == null) {
            addrType = new ArrayList<EntityItemAddrTypeType>();
        }
        return this.addrType;
    }

}
