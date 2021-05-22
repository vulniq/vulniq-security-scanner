


package org.mitre.oval.xmlschema.oval_system_characteristics_5_ios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemAnySimpleType;
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
 *         &lt;element name="ip_directed_broadcast_command" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-system-characteristics-5>EntityItemAnySimpleType">
 *                 &lt;attribute name="datatype" default="string">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration">
 *                       &lt;enumeration value="string"/>
 *                       &lt;enumeration value="boolean"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="no_ip_directed_broadcast_command" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="proxy_arp_command" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-system-characteristics-5>EntityItemAnySimpleType">
 *                 &lt;attribute name="datatype" default="string">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration">
 *                       &lt;enumeration value="string"/>
 *                       &lt;enumeration value="boolean"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="shutdown_command" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-system-characteristics-5>EntityItemAnySimpleType">
 *                 &lt;attribute name="datatype" default="string">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration">
 *                       &lt;enumeration value="string"/>
 *                       &lt;enumeration value="boolean"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="hardware_addr" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="ipv4_address" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIPAddressStringType" minOccurs="0"/>
 *         &lt;element name="ipv6_address" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIPAddressStringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ipv4_access_list" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="ipv6_access_list" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="crypto_map" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="ipv4_urpf_command" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="ipv6_urpf_command" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="urpf_command" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="switchport_trunk_encapsulation" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios}EntityItemTrunkEncapType" minOccurs="0"/>
 *         &lt;element name="switchport_mode" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios}EntityItemSwitchportModeType" minOccurs="0"/>
 *         &lt;element name="switchport_native_vlan" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-system-characteristics-5>EntityItemAnySimpleType">
 *                 &lt;attribute name="datatype" default="string">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration">
 *                       &lt;enumeration value="string"/>
 *                       &lt;enumeration value="int"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="switchport_access_vlan" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-system-characteristics-5>EntityItemAnySimpleType">
 *                 &lt;attribute name="datatype" default="string">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration">
 *                       &lt;enumeration value="string"/>
 *                       &lt;enumeration value="int"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="switchport_trunked_vlans" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="switchport_pruned_vlans" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="switchport_port_security" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
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
    "ipDirectedBroadcastCommand",
    "noIpDirectedBroadcastCommand",
    "proxyArpCommand",
    "shutdownCommand",
    "hardwareAddr",
    "ipv4Address",
    "ipv6Address",
    "ipv4AccessList",
    "ipv6AccessList",
    "cryptoMap",
    "ipv4UrpfCommand",
    "ipv6UrpfCommand",
    "urpfCommand",
    "switchportTrunkEncapsulation",
    "switchportMode",
    "switchportNativeVlan",
    "switchportAccessVlan",
    "switchportTrunkedVlans",
    "switchportPrunedVlans",
    "switchportPortSecurity"
})
public class InterfaceItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios")
    protected EntityItemStringType name;
    @XmlElement(name = "ip_directed_broadcast_command", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios")
    protected InterfaceItem.IpDirectedBroadcastCommand ipDirectedBroadcastCommand;
    @XmlElement(name = "no_ip_directed_broadcast_command", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios")
    protected EntityItemStringType noIpDirectedBroadcastCommand;
    @XmlElement(name = "proxy_arp_command", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios")
    protected InterfaceItem.ProxyArpCommand proxyArpCommand;
    @XmlElement(name = "shutdown_command", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios")
    protected InterfaceItem.ShutdownCommand shutdownCommand;
    @XmlElement(name = "hardware_addr", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios")
    protected EntityItemStringType hardwareAddr;
    @XmlElement(name = "ipv4_address", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios")
    protected EntityItemIPAddressStringType ipv4Address;
    @XmlElement(name = "ipv6_address", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios")
    protected List<EntityItemIPAddressStringType> ipv6Address;
    @XmlElement(name = "ipv4_access_list", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios")
    protected List<EntityItemStringType> ipv4AccessList;
    @XmlElement(name = "ipv6_access_list", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios")
    protected List<EntityItemStringType> ipv6AccessList;
    @XmlElement(name = "crypto_map", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios")
    protected EntityItemStringType cryptoMap;
    @XmlElement(name = "ipv4_urpf_command", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios")
    protected EntityItemStringType ipv4UrpfCommand;
    @XmlElement(name = "ipv6_urpf_command", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios")
    protected EntityItemStringType ipv6UrpfCommand;
    @XmlElement(name = "urpf_command", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios")
    protected EntityItemStringType urpfCommand;
    @XmlElement(name = "switchport_trunk_encapsulation", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios")
    protected EntityItemTrunkEncapType switchportTrunkEncapsulation;
    @XmlElement(name = "switchport_mode", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios")
    protected EntityItemSwitchportModeType switchportMode;
    @XmlElement(name = "switchport_native_vlan", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios")
    protected InterfaceItem.SwitchportNativeVlan switchportNativeVlan;
    @XmlElement(name = "switchport_access_vlan", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios")
    protected InterfaceItem.SwitchportAccessVlan switchportAccessVlan;
    @XmlElement(name = "switchport_trunked_vlans", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios")
    protected EntityItemStringType switchportTrunkedVlans;
    @XmlElement(name = "switchport_pruned_vlans", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios")
    protected EntityItemStringType switchportPrunedVlans;
    @XmlElement(name = "switchport_port_security", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios")
    protected EntityItemStringType switchportPortSecurity;

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
     * Gets the value of the ipDirectedBroadcastCommand property.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceItem.IpDirectedBroadcastCommand }
     *     
     */
    public InterfaceItem.IpDirectedBroadcastCommand getIpDirectedBroadcastCommand() {
        return ipDirectedBroadcastCommand;
    }

    /**
     * Sets the value of the ipDirectedBroadcastCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceItem.IpDirectedBroadcastCommand }
     *     
     */
    public void setIpDirectedBroadcastCommand(InterfaceItem.IpDirectedBroadcastCommand value) {
        this.ipDirectedBroadcastCommand = value;
    }

    /**
     * Gets the value of the noIpDirectedBroadcastCommand property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getNoIpDirectedBroadcastCommand() {
        return noIpDirectedBroadcastCommand;
    }

    /**
     * Sets the value of the noIpDirectedBroadcastCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setNoIpDirectedBroadcastCommand(EntityItemStringType value) {
        this.noIpDirectedBroadcastCommand = value;
    }

    /**
     * Gets the value of the proxyArpCommand property.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceItem.ProxyArpCommand }
     *     
     */
    public InterfaceItem.ProxyArpCommand getProxyArpCommand() {
        return proxyArpCommand;
    }

    /**
     * Sets the value of the proxyArpCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceItem.ProxyArpCommand }
     *     
     */
    public void setProxyArpCommand(InterfaceItem.ProxyArpCommand value) {
        this.proxyArpCommand = value;
    }

    /**
     * Gets the value of the shutdownCommand property.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceItem.ShutdownCommand }
     *     
     */
    public InterfaceItem.ShutdownCommand getShutdownCommand() {
        return shutdownCommand;
    }

    /**
     * Sets the value of the shutdownCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceItem.ShutdownCommand }
     *     
     */
    public void setShutdownCommand(InterfaceItem.ShutdownCommand value) {
        this.shutdownCommand = value;
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

    /**
     * Gets the value of the switchportTrunkEncapsulation property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemTrunkEncapType }
     *     
     */
    public EntityItemTrunkEncapType getSwitchportTrunkEncapsulation() {
        return switchportTrunkEncapsulation;
    }

    /**
     * Sets the value of the switchportTrunkEncapsulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemTrunkEncapType }
     *     
     */
    public void setSwitchportTrunkEncapsulation(EntityItemTrunkEncapType value) {
        this.switchportTrunkEncapsulation = value;
    }

    /**
     * Gets the value of the switchportMode property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemSwitchportModeType }
     *     
     */
    public EntityItemSwitchportModeType getSwitchportMode() {
        return switchportMode;
    }

    /**
     * Sets the value of the switchportMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemSwitchportModeType }
     *     
     */
    public void setSwitchportMode(EntityItemSwitchportModeType value) {
        this.switchportMode = value;
    }

    /**
     * Gets the value of the switchportNativeVlan property.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceItem.SwitchportNativeVlan }
     *     
     */
    public InterfaceItem.SwitchportNativeVlan getSwitchportNativeVlan() {
        return switchportNativeVlan;
    }

    /**
     * Sets the value of the switchportNativeVlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceItem.SwitchportNativeVlan }
     *     
     */
    public void setSwitchportNativeVlan(InterfaceItem.SwitchportNativeVlan value) {
        this.switchportNativeVlan = value;
    }

    /**
     * Gets the value of the switchportAccessVlan property.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceItem.SwitchportAccessVlan }
     *     
     */
    public InterfaceItem.SwitchportAccessVlan getSwitchportAccessVlan() {
        return switchportAccessVlan;
    }

    /**
     * Sets the value of the switchportAccessVlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceItem.SwitchportAccessVlan }
     *     
     */
    public void setSwitchportAccessVlan(InterfaceItem.SwitchportAccessVlan value) {
        this.switchportAccessVlan = value;
    }

    /**
     * Gets the value of the switchportTrunkedVlans property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getSwitchportTrunkedVlans() {
        return switchportTrunkedVlans;
    }

    /**
     * Sets the value of the switchportTrunkedVlans property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setSwitchportTrunkedVlans(EntityItemStringType value) {
        this.switchportTrunkedVlans = value;
    }

    /**
     * Gets the value of the switchportPrunedVlans property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getSwitchportPrunedVlans() {
        return switchportPrunedVlans;
    }

    /**
     * Sets the value of the switchportPrunedVlans property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setSwitchportPrunedVlans(EntityItemStringType value) {
        this.switchportPrunedVlans = value;
    }

    /**
     * Gets the value of the switchportPortSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getSwitchportPortSecurity() {
        return switchportPortSecurity;
    }

    /**
     * Sets the value of the switchportPortSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setSwitchportPortSecurity(EntityItemStringType value) {
        this.switchportPortSecurity = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-system-characteristics-5>EntityItemAnySimpleType">
     *       &lt;attribute name="datatype" default="string">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration">
     *             &lt;enumeration value="string"/>
     *             &lt;enumeration value="boolean"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class IpDirectedBroadcastCommand
        extends EntityItemAnySimpleType
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-system-characteristics-5>EntityItemAnySimpleType">
     *       &lt;attribute name="datatype" default="string">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration">
     *             &lt;enumeration value="string"/>
     *             &lt;enumeration value="boolean"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ProxyArpCommand
        extends EntityItemAnySimpleType
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-system-characteristics-5>EntityItemAnySimpleType">
     *       &lt;attribute name="datatype" default="string">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration">
     *             &lt;enumeration value="string"/>
     *             &lt;enumeration value="boolean"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ShutdownCommand
        extends EntityItemAnySimpleType
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-system-characteristics-5>EntityItemAnySimpleType">
     *       &lt;attribute name="datatype" default="string">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration">
     *             &lt;enumeration value="string"/>
     *             &lt;enumeration value="int"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SwitchportAccessVlan
        extends EntityItemAnySimpleType
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-system-characteristics-5>EntityItemAnySimpleType">
     *       &lt;attribute name="datatype" default="string">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration">
     *             &lt;enumeration value="string"/>
     *             &lt;enumeration value="int"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SwitchportNativeVlan
        extends EntityItemAnySimpleType
    {


    }

}
