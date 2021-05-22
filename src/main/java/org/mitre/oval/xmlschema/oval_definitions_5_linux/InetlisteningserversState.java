


package org.mitre.oval.xmlschema.oval_definitions_5_linux;

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
 *         &lt;element name="protocol" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="local_address" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIPAddressStringType" minOccurs="0"/>
 *         &lt;element name="local_port" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="local_full_address" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="program_name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="foreign_address" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIPAddressStringType" minOccurs="0"/>
 *         &lt;element name="foreign_port" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="foreign_full_address" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="pid" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="user_id" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
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
public class InetlisteningserversState
    extends StateType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateStringType protocol;
    @XmlElement(name = "local_address", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateIPAddressStringType localAddress;
    @XmlElement(name = "local_port", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateIntType localPort;
    @XmlElement(name = "local_full_address", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateStringType localFullAddress;
    @XmlElement(name = "program_name", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateStringType programName;
    @XmlElement(name = "foreign_address", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateIPAddressStringType foreignAddress;
    @XmlElement(name = "foreign_port", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateIntType foreignPort;
    @XmlElement(name = "foreign_full_address", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateStringType foreignFullAddress;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateIntType pid;
    @XmlElement(name = "user_id", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateIntType userId;

    /**
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setProtocol(EntityStateStringType value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the localAddress property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIPAddressStringType }
     *     
     */
    public EntityStateIPAddressStringType getLocalAddress() {
        return localAddress;
    }

    /**
     * Sets the value of the localAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIPAddressStringType }
     *     
     */
    public void setLocalAddress(EntityStateIPAddressStringType value) {
        this.localAddress = value;
    }

    /**
     * Gets the value of the localPort property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getLocalPort() {
        return localPort;
    }

    /**
     * Sets the value of the localPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setLocalPort(EntityStateIntType value) {
        this.localPort = value;
    }

    /**
     * Gets the value of the localFullAddress property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getLocalFullAddress() {
        return localFullAddress;
    }

    /**
     * Sets the value of the localFullAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setLocalFullAddress(EntityStateStringType value) {
        this.localFullAddress = value;
    }

    /**
     * Gets the value of the programName property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getProgramName() {
        return programName;
    }

    /**
     * Sets the value of the programName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setProgramName(EntityStateStringType value) {
        this.programName = value;
    }

    /**
     * Gets the value of the foreignAddress property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIPAddressStringType }
     *     
     */
    public EntityStateIPAddressStringType getForeignAddress() {
        return foreignAddress;
    }

    /**
     * Sets the value of the foreignAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIPAddressStringType }
     *     
     */
    public void setForeignAddress(EntityStateIPAddressStringType value) {
        this.foreignAddress = value;
    }

    /**
     * Gets the value of the foreignPort property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getForeignPort() {
        return foreignPort;
    }

    /**
     * Sets the value of the foreignPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setForeignPort(EntityStateIntType value) {
        this.foreignPort = value;
    }

    /**
     * Gets the value of the foreignFullAddress property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getForeignFullAddress() {
        return foreignFullAddress;
    }

    /**
     * Sets the value of the foreignFullAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setForeignFullAddress(EntityStateStringType value) {
        this.foreignFullAddress = value;
    }

    /**
     * Gets the value of the pid property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getPid() {
        return pid;
    }

    /**
     * Sets the value of the pid property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setPid(EntityStateIntType value) {
        this.pid = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setUserId(EntityStateIntType value) {
        this.userId = value;
    }

}
