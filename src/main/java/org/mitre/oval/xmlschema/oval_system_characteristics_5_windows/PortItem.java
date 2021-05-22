


package org.mitre.oval.xmlschema.oval_system_characteristics_5_windows;

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
 *         &lt;element name="local_address" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIPAddressStringType" minOccurs="0"/>
 *         &lt;element name="local_port" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="protocol" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemProtocolType" minOccurs="0"/>
 *         &lt;element name="pid" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="foreign_address" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIPAddressStringType" minOccurs="0"/>
 *         &lt;element name="foreign_port" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
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
    "localAddress",
    "localPort",
    "protocol",
    "pid",
    "foreignAddress",
    "foreignPort"
})
public class PortItem
    extends ItemType
{

    @XmlElement(name = "local_address", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIPAddressStringType localAddress;
    @XmlElement(name = "local_port", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType localPort;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemProtocolType protocol;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType pid;
    @XmlElement(name = "foreign_address", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIPAddressStringType foreignAddress;
    @XmlElement(name = "foreign_port", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemStringType foreignPort;

    /**
     * Gets the value of the localAddress property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIPAddressStringType }
     *     
     */
    public EntityItemIPAddressStringType getLocalAddress() {
        return localAddress;
    }

    /**
     * Sets the value of the localAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIPAddressStringType }
     *     
     */
    public void setLocalAddress(EntityItemIPAddressStringType value) {
        this.localAddress = value;
    }

    /**
     * Gets the value of the localPort property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getLocalPort() {
        return localPort;
    }

    /**
     * Sets the value of the localPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setLocalPort(EntityItemIntType value) {
        this.localPort = value;
    }

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemProtocolType }
     *     
     */
    public EntityItemProtocolType getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemProtocolType }
     *     
     */
    public void setProtocol(EntityItemProtocolType value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the pid property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getPid() {
        return pid;
    }

    /**
     * Sets the value of the pid property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setPid(EntityItemIntType value) {
        this.pid = value;
    }

    /**
     * Gets the value of the foreignAddress property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIPAddressStringType }
     *     
     */
    public EntityItemIPAddressStringType getForeignAddress() {
        return foreignAddress;
    }

    /**
     * Sets the value of the foreignAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIPAddressStringType }
     *     
     */
    public void setForeignAddress(EntityItemIPAddressStringType value) {
        this.foreignAddress = value;
    }

    /**
     * Gets the value of the foreignPort property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getForeignPort() {
        return foreignPort;
    }

    /**
     * Sets the value of the foreignPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setForeignPort(EntityItemStringType value) {
        this.foreignPort = value;
    }

}
