


package org.mitre.oval.xmlschema.oval_system_characteristics_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The InterfaceType complex type is used to describe an existing network interface on the system. This information can help identify a specific system on a given network.
 * 
 * <p>Java class for InterfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterfaceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="interface_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ip_address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mac_address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterfaceType", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", propOrder = {
    "interfaceName",
    "ipAddress",
    "macAddress"
})
public class InterfaceType {

    @XmlElement(name = "interface_name", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", required = true)
    protected String interfaceName;
    @XmlElement(name = "ip_address", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", required = true)
    protected String ipAddress;
    @XmlElement(name = "mac_address", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", required = true)
    protected String macAddress;

    /**
     * Gets the value of the interfaceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterfaceName() {
        return interfaceName;
    }

    /**
     * Sets the value of the interfaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterfaceName(String value) {
        this.interfaceName = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the macAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * Sets the value of the macAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacAddress(String value) {
        this.macAddress = value;
    }

}
