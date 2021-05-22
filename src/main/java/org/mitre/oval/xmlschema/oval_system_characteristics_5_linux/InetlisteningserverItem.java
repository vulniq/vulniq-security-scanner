


package org.mitre.oval.xmlschema.oval_system_characteristics_5_linux;

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
 *         &lt;element name="protocol" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="local_address" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIPAddressStringType" minOccurs="0"/>
 *         &lt;element name="local_port" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="local_full_address" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="program_name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="foreign_address" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIPAddressStringType" minOccurs="0"/>
 *         &lt;element name="foreign_port" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="foreign_full_address" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="pid" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="user_id" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
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
    "protocol",
    "localAddress",
    "localPort",
    "localFullAddress",
    "programName",
    "foreignAddress",
    "foreignPort",
    "foreignFullAddress",
    "pid",
    "userId"
})
public class InetlisteningserverItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemStringType protocol;
    @XmlElement(name = "local_address", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemIPAddressStringType localAddress;
    @XmlElement(name = "local_port", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemIntType localPort;
    @XmlElement(name = "local_full_address", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemStringType localFullAddress;
    @XmlElement(name = "program_name", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemStringType programName;
    @XmlElement(name = "foreign_address", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemIPAddressStringType foreignAddress;
    @XmlElement(name = "foreign_port", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemIntType foreignPort;
    @XmlElement(name = "foreign_full_address", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemStringType foreignFullAddress;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemIntType pid;
    @XmlElement(name = "user_id", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemIntType userId;

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setProtocol(EntityItemStringType value) {
        this.protocol = value;
    }

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
     * Gets the value of the localFullAddress property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getLocalFullAddress() {
        return localFullAddress;
    }

    /**
     * Sets the value of the localFullAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setLocalFullAddress(EntityItemStringType value) {
        this.localFullAddress = value;
    }

    /**
     * Gets the value of the programName property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getProgramName() {
        return programName;
    }

    /**
     * Sets the value of the programName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setProgramName(EntityItemStringType value) {
        this.programName = value;
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
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getForeignPort() {
        return foreignPort;
    }

    /**
     * Sets the value of the foreignPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setForeignPort(EntityItemIntType value) {
        this.foreignPort = value;
    }

    /**
     * Gets the value of the foreignFullAddress property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getForeignFullAddress() {
        return foreignFullAddress;
    }

    /**
     * Sets the value of the foreignFullAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setForeignFullAddress(EntityItemStringType value) {
        this.foreignFullAddress = value;
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
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setUserId(EntityItemIntType value) {
        this.userId = value;
    }

}
