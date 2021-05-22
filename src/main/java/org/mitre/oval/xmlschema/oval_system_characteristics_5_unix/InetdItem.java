


package org.mitre.oval.xmlschema.oval_system_characteristics_5_unix;

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
 *         &lt;element name="protocol" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="service_name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="server_program" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="server_arguments" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="endpoint_type" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix}EntityItemEndpointType" minOccurs="0"/>
 *         &lt;element name="exec_as_user" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="wait_status" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix}EntityItemWaitStatusType" minOccurs="0"/>
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
    "serviceName",
    "serverProgram",
    "serverArguments",
    "endpointType",
    "execAsUser",
    "waitStatus"
})
public class InetdItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix")
    protected EntityItemStringType protocol;
    @XmlElement(name = "service_name", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix")
    protected EntityItemStringType serviceName;
    @XmlElement(name = "server_program", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix")
    protected EntityItemStringType serverProgram;
    @XmlElement(name = "server_arguments", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix")
    protected EntityItemStringType serverArguments;
    @XmlElement(name = "endpoint_type", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix")
    protected EntityItemEndpointType endpointType;
    @XmlElement(name = "exec_as_user", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix")
    protected EntityItemStringType execAsUser;
    @XmlElement(name = "wait_status", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix")
    protected EntityItemWaitStatusType waitStatus;

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
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setServiceName(EntityItemStringType value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the serverProgram property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getServerProgram() {
        return serverProgram;
    }

    /**
     * Sets the value of the serverProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setServerProgram(EntityItemStringType value) {
        this.serverProgram = value;
    }

    /**
     * Gets the value of the serverArguments property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getServerArguments() {
        return serverArguments;
    }

    /**
     * Sets the value of the serverArguments property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setServerArguments(EntityItemStringType value) {
        this.serverArguments = value;
    }

    /**
     * Gets the value of the endpointType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemEndpointType }
     *     
     */
    public EntityItemEndpointType getEndpointType() {
        return endpointType;
    }

    /**
     * Sets the value of the endpointType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemEndpointType }
     *     
     */
    public void setEndpointType(EntityItemEndpointType value) {
        this.endpointType = value;
    }

    /**
     * Gets the value of the execAsUser property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getExecAsUser() {
        return execAsUser;
    }

    /**
     * Sets the value of the execAsUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setExecAsUser(EntityItemStringType value) {
        this.execAsUser = value;
    }

    /**
     * Gets the value of the waitStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemWaitStatusType }
     *     
     */
    public EntityItemWaitStatusType getWaitStatus() {
        return waitStatus;
    }

    /**
     * Sets the value of the waitStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemWaitStatusType }
     *     
     */
    public void setWaitStatus(EntityItemWaitStatusType value) {
        this.waitStatus = value;
    }

}
