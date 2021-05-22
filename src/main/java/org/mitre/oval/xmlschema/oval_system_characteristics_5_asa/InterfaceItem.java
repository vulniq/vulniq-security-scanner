


package org.mitre.oval.xmlschema.oval_system_characteristics_5_asa;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemBoolType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemIPAddressStringType;
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
 *         &lt;element name="proxy_arp" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="shutdown" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="hardware_addr" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="ipv4_address" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIPAddressStringType" minOccurs="0"/>
 *         &lt;element name="ipv6_address" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIPAddressStringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ipv4_access_list" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="ipv6_access_list" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="ipv4_v6_access_list" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="crypto_map" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="ipv4_urpf_command" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="ipv6_urpf_command" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="urpf_command" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
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
    "proxyArp",
    "shutdown",
    "hardwareAddr",
    "ipv4Address",
    "ipv6Address",
    "ipv4AccessList",
    "ipv6AccessList",
    "ipv4V6AccessList",
    "cryptoMap",
    "ipv4UrpfCommand",
    "ipv6UrpfCommand",
    "urpfCommand"
})
public class InterfaceItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
    protected EntityItemStringType name;
    @XmlElement(name = "proxy_arp", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
    protected EntityItemBoolType proxyArp;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
    protected EntityItemBoolType shutdown;
    @XmlElement(name = "hardware_addr", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
    protected EntityItemStringType hardwareAddr;
    @XmlElement(name = "ipv4_address", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
    protected EntityItemIPAddressStringType ipv4Address;
    @XmlElement(name = "ipv6_address", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
    protected List<EntityItemIPAddressStringType> ipv6Address;
    @XmlElement(name = "ipv4_access_list", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
    protected List<EntityItemStringType> ipv4AccessList;
    @XmlElement(name = "ipv6_access_list", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
    protected List<EntityItemStringType> ipv6AccessList;
    @XmlElement(name = "ipv4_v6_access_list", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
    protected List<EntityItemStringType> ipv4V6AccessList;
    @XmlElement(name = "crypto_map", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
    protected EntityItemStringType cryptoMap;
    @XmlElement(name = "ipv4_urpf_command", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
    protected EntityItemStringType ipv4UrpfCommand;
    @XmlElement(name = "ipv6_urpf_command", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
    protected EntityItemStringType ipv6UrpfCommand;
    @XmlElement(name = "urpf_command", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
    protected EntityItemStringType urpfCommand;

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
     * Gets the value of the proxyArp property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getProxyArp() {
        return proxyArp;
    }

    /**
     * Sets the value of the proxyArp property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setProxyArp(EntityItemBoolType value) {
        this.proxyArp = value;
    }

    /**
     * Gets the value of the shutdown property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getShutdown() {
        return shutdown;
    }

    /**
     * Sets the value of the shutdown property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setShutdown(EntityItemBoolType value) {
        this.shutdown = value;
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
     * Gets the value of the ipv4Address property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIPAddressStringType }
     *     
     */
    public EntityItemIPAddressStringType getIpv4Address() {
        return ipv4Address;
    }

    /**
     * Sets the value of the ipv4Address property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIPAddressStringType }
     *     
     */
    public void setIpv4Address(EntityItemIPAddressStringType value) {
        this.ipv4Address = value;
    }

    /**
     * Gets the value of the ipv6Address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipv6Address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIpv6Address().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemIPAddressStringType }
     * 
     * 
     */
    public List<EntityItemIPAddressStringType> getIpv6Address() {
        if (ipv6Address == null) {
            ipv6Address = new ArrayList<EntityItemIPAddressStringType>();
        }
        return this.ipv6Address;
    }

    /**
     * Gets the value of the ipv4AccessList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipv4AccessList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIpv4AccessList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemStringType }
     * 
     * 
     */
    public List<EntityItemStringType> getIpv4AccessList() {
        if (ipv4AccessList == null) {
            ipv4AccessList = new ArrayList<EntityItemStringType>();
        }
        return this.ipv4AccessList;
    }

    /**
     * Gets the value of the ipv6AccessList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipv6AccessList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIpv6AccessList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemStringType }
     * 
     * 
     */
    public List<EntityItemStringType> getIpv6AccessList() {
        if (ipv6AccessList == null) {
            ipv6AccessList = new ArrayList<EntityItemStringType>();
        }
        return this.ipv6AccessList;
    }

    /**
     * Gets the value of the ipv4V6AccessList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipv4V6AccessList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIpv4V6AccessList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemStringType }
     * 
     * 
     */
    public List<EntityItemStringType> getIpv4V6AccessList() {
        if (ipv4V6AccessList == null) {
            ipv4V6AccessList = new ArrayList<EntityItemStringType>();
        }
        return this.ipv4V6AccessList;
    }

    /**
     * Gets the value of the cryptoMap property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getCryptoMap() {
        return cryptoMap;
    }

    /**
     * Sets the value of the cryptoMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setCryptoMap(EntityItemStringType value) {
        this.cryptoMap = value;
    }

    /**
     * Gets the value of the ipv4UrpfCommand property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getIpv4UrpfCommand() {
        return ipv4UrpfCommand;
    }

    /**
     * Sets the value of the ipv4UrpfCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setIpv4UrpfCommand(EntityItemStringType value) {
        this.ipv4UrpfCommand = value;
    }

    /**
     * Gets the value of the ipv6UrpfCommand property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getIpv6UrpfCommand() {
        return ipv6UrpfCommand;
    }

    /**
     * Sets the value of the ipv6UrpfCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setIpv6UrpfCommand(EntityItemStringType value) {
        this.ipv6UrpfCommand = value;
    }

    /**
     * Gets the value of the urpfCommand property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getUrpfCommand() {
        return urpfCommand;
    }

    /**
     * Sets the value of the urpfCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setUrpfCommand(EntityItemStringType value) {
        this.urpfCommand = value;
    }

}
