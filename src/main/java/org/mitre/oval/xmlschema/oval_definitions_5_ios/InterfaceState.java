


package org.mitre.oval.xmlschema.oval_definitions_5_ios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateAnySimpleType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateIPAddressStringType;
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
 *         &lt;element name="ip_directed_broadcast_command" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntityStateAnySimpleType">
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
 *         &lt;element name="no_ip_directed_broadcast_command" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="proxy_arp_command" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntityStateAnySimpleType">
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
 *               &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntityStateAnySimpleType">
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
 *         &lt;element name="hardware_addr" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="ipv4_address" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIPAddressStringType" minOccurs="0"/>
 *         &lt;element name="ipv6_address" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIPAddressStringType" minOccurs="0"/>
 *         &lt;element name="ipv4_access_list" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="ipv6_access_list" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="crypto_map" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="ipv4_urpf_command" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="ipv6_urpf_command" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="urpf_command" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="switchport_trunk_encapsulation" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#ios}EntityStateTrunkEncapType" minOccurs="0"/>
 *         &lt;element name="switchport_mode" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#ios}EntityStateSwitchportModeType" minOccurs="0"/>
 *         &lt;element name="switchport_native_vlan" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntityStateAnySimpleType">
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
 *               &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntityStateAnySimpleType">
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
 *         &lt;element name="switchport_trunked_vlans" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="switchport_pruned_vlans" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="switchport_port_security" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
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
public class InterfaceState
    extends StateType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios")
    protected EntityStateStringType name;
    @XmlElement(name = "ip_directed_broadcast_command", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios")
    protected InterfaceState.IpDirectedBroadcastCommand ipDirectedBroadcastCommand;
    @XmlElement(name = "no_ip_directed_broadcast_command", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios")
    protected EntityStateStringType noIpDirectedBroadcastCommand;
    @XmlElement(name = "proxy_arp_command", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios")
    protected InterfaceState.ProxyArpCommand proxyArpCommand;
    @XmlElement(name = "shutdown_command", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios")
    protected InterfaceState.ShutdownCommand shutdownCommand;
    @XmlElement(name = "hardware_addr", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios")
    protected EntityStateStringType hardwareAddr;
    @XmlElement(name = "ipv4_address", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios")
    protected EntityStateIPAddressStringType ipv4Address;
    @XmlElement(name = "ipv6_address", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios")
    protected EntityStateIPAddressStringType ipv6Address;
    @XmlElement(name = "ipv4_access_list", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios")
    protected EntityStateStringType ipv4AccessList;
    @XmlElement(name = "ipv6_access_list", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios")
    protected EntityStateStringType ipv6AccessList;
    @XmlElement(name = "crypto_map", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios")
    protected EntityStateStringType cryptoMap;
    @XmlElement(name = "ipv4_urpf_command", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios")
    protected EntityStateStringType ipv4UrpfCommand;
    @XmlElement(name = "ipv6_urpf_command", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios")
    protected EntityStateStringType ipv6UrpfCommand;
    @XmlElement(name = "urpf_command", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios")
    protected EntityStateStringType urpfCommand;
    @XmlElement(name = "switchport_trunk_encapsulation", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios")
    protected EntityStateTrunkEncapType switchportTrunkEncapsulation;
    @XmlElement(name = "switchport_mode", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios")
    protected EntityStateSwitchportModeType switchportMode;
    @XmlElement(name = "switchport_native_vlan", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios")
    protected InterfaceState.SwitchportNativeVlan switchportNativeVlan;
    @XmlElement(name = "switchport_access_vlan", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios")
    protected InterfaceState.SwitchportAccessVlan switchportAccessVlan;
    @XmlElement(name = "switchport_trunked_vlans", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios")
    protected EntityStateStringType switchportTrunkedVlans;
    @XmlElement(name = "switchport_pruned_vlans", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios")
    protected EntityStateStringType switchportPrunedVlans;
    @XmlElement(name = "switchport_port_security", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios")
    protected EntityStateStringType switchportPortSecurity;

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
     * Gets the value of the ipDirectedBroadcastCommand property.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceState.IpDirectedBroadcastCommand }
     *     
     */
    public InterfaceState.IpDirectedBroadcastCommand getIpDirectedBroadcastCommand() {
        return ipDirectedBroadcastCommand;
    }

    /**
     * Sets the value of the ipDirectedBroadcastCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceState.IpDirectedBroadcastCommand }
     *     
     */
    public void setIpDirectedBroadcastCommand(InterfaceState.IpDirectedBroadcastCommand value) {
        this.ipDirectedBroadcastCommand = value;
    }

    /**
     * Gets the value of the noIpDirectedBroadcastCommand property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getNoIpDirectedBroadcastCommand() {
        return noIpDirectedBroadcastCommand;
    }

    /**
     * Sets the value of the noIpDirectedBroadcastCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setNoIpDirectedBroadcastCommand(EntityStateStringType value) {
        this.noIpDirectedBroadcastCommand = value;
    }

    /**
     * Gets the value of the proxyArpCommand property.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceState.ProxyArpCommand }
     *     
     */
    public InterfaceState.ProxyArpCommand getProxyArpCommand() {
        return proxyArpCommand;
    }

    /**
     * Sets the value of the proxyArpCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceState.ProxyArpCommand }
     *     
     */
    public void setProxyArpCommand(InterfaceState.ProxyArpCommand value) {
        this.proxyArpCommand = value;
    }

    /**
     * Gets the value of the shutdownCommand property.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceState.ShutdownCommand }
     *     
     */
    public InterfaceState.ShutdownCommand getShutdownCommand() {
        return shutdownCommand;
    }

    /**
     * Sets the value of the shutdownCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceState.ShutdownCommand }
     *     
     */
    public void setShutdownCommand(InterfaceState.ShutdownCommand value) {
        this.shutdownCommand = value;
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
     * Gets the value of the ipv4Address property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIPAddressStringType }
     *     
     */
    public EntityStateIPAddressStringType getIpv4Address() {
        return ipv4Address;
    }

    /**
     * Sets the value of the ipv4Address property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIPAddressStringType }
     *     
     */
    public void setIpv4Address(EntityStateIPAddressStringType value) {
        this.ipv4Address = value;
    }

    /**
     * Gets the value of the ipv6Address property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIPAddressStringType }
     *     
     */
    public EntityStateIPAddressStringType getIpv6Address() {
        return ipv6Address;
    }

    /**
     * Sets the value of the ipv6Address property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIPAddressStringType }
     *     
     */
    public void setIpv6Address(EntityStateIPAddressStringType value) {
        this.ipv6Address = value;
    }

    /**
     * Gets the value of the ipv4AccessList property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getIpv4AccessList() {
        return ipv4AccessList;
    }

    /**
     * Sets the value of the ipv4AccessList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setIpv4AccessList(EntityStateStringType value) {
        this.ipv4AccessList = value;
    }

    /**
     * Gets the value of the ipv6AccessList property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getIpv6AccessList() {
        return ipv6AccessList;
    }

    /**
     * Sets the value of the ipv6AccessList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setIpv6AccessList(EntityStateStringType value) {
        this.ipv6AccessList = value;
    }

    /**
     * Gets the value of the cryptoMap property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getCryptoMap() {
        return cryptoMap;
    }

    /**
     * Sets the value of the cryptoMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setCryptoMap(EntityStateStringType value) {
        this.cryptoMap = value;
    }

    /**
     * Gets the value of the ipv4UrpfCommand property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getIpv4UrpfCommand() {
        return ipv4UrpfCommand;
    }

    /**
     * Sets the value of the ipv4UrpfCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setIpv4UrpfCommand(EntityStateStringType value) {
        this.ipv4UrpfCommand = value;
    }

    /**
     * Gets the value of the ipv6UrpfCommand property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getIpv6UrpfCommand() {
        return ipv6UrpfCommand;
    }

    /**
     * Sets the value of the ipv6UrpfCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setIpv6UrpfCommand(EntityStateStringType value) {
        this.ipv6UrpfCommand = value;
    }

    /**
     * Gets the value of the urpfCommand property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getUrpfCommand() {
        return urpfCommand;
    }

    /**
     * Sets the value of the urpfCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setUrpfCommand(EntityStateStringType value) {
        this.urpfCommand = value;
    }

    /**
     * Gets the value of the switchportTrunkEncapsulation property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateTrunkEncapType }
     *     
     */
    public EntityStateTrunkEncapType getSwitchportTrunkEncapsulation() {
        return switchportTrunkEncapsulation;
    }

    /**
     * Sets the value of the switchportTrunkEncapsulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateTrunkEncapType }
     *     
     */
    public void setSwitchportTrunkEncapsulation(EntityStateTrunkEncapType value) {
        this.switchportTrunkEncapsulation = value;
    }

    /**
     * Gets the value of the switchportMode property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateSwitchportModeType }
     *     
     */
    public EntityStateSwitchportModeType getSwitchportMode() {
        return switchportMode;
    }

    /**
     * Sets the value of the switchportMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateSwitchportModeType }
     *     
     */
    public void setSwitchportMode(EntityStateSwitchportModeType value) {
        this.switchportMode = value;
    }

    /**
     * Gets the value of the switchportNativeVlan property.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceState.SwitchportNativeVlan }
     *     
     */
    public InterfaceState.SwitchportNativeVlan getSwitchportNativeVlan() {
        return switchportNativeVlan;
    }

    /**
     * Sets the value of the switchportNativeVlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceState.SwitchportNativeVlan }
     *     
     */
    public void setSwitchportNativeVlan(InterfaceState.SwitchportNativeVlan value) {
        this.switchportNativeVlan = value;
    }

    /**
     * Gets the value of the switchportAccessVlan property.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceState.SwitchportAccessVlan }
     *     
     */
    public InterfaceState.SwitchportAccessVlan getSwitchportAccessVlan() {
        return switchportAccessVlan;
    }

    /**
     * Sets the value of the switchportAccessVlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceState.SwitchportAccessVlan }
     *     
     */
    public void setSwitchportAccessVlan(InterfaceState.SwitchportAccessVlan value) {
        this.switchportAccessVlan = value;
    }

    /**
     * Gets the value of the switchportTrunkedVlans property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getSwitchportTrunkedVlans() {
        return switchportTrunkedVlans;
    }

    /**
     * Sets the value of the switchportTrunkedVlans property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setSwitchportTrunkedVlans(EntityStateStringType value) {
        this.switchportTrunkedVlans = value;
    }

    /**
     * Gets the value of the switchportPrunedVlans property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getSwitchportPrunedVlans() {
        return switchportPrunedVlans;
    }

    /**
     * Sets the value of the switchportPrunedVlans property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setSwitchportPrunedVlans(EntityStateStringType value) {
        this.switchportPrunedVlans = value;
    }

    /**
     * Gets the value of the switchportPortSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getSwitchportPortSecurity() {
        return switchportPortSecurity;
    }

    /**
     * Sets the value of the switchportPortSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setSwitchportPortSecurity(EntityStateStringType value) {
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
     *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntityStateAnySimpleType">
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
        extends EntityStateAnySimpleType
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
     *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntityStateAnySimpleType">
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
        extends EntityStateAnySimpleType
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
     *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntityStateAnySimpleType">
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
        extends EntityStateAnySimpleType
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
     *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntityStateAnySimpleType">
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
        extends EntityStateAnySimpleType
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
     *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntityStateAnySimpleType">
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
        extends EntityStateAnySimpleType
    {


    }

}
