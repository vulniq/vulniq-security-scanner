


package org.mitre.oval.xmlschema.oval_definitions_5_unix;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="service_name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="server_program" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="server_arguments" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="endpoint_type" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#unix}EntityStateEndpointType" minOccurs="0"/>
 *         &lt;element name="exec_as_user" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="wait_status" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#unix}EntityStateWaitStatusType" minOccurs="0"/>
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
public class InetdState
    extends StateType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#unix")
    protected EntityStateStringType protocol;
    @XmlElement(name = "service_name", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#unix")
    protected EntityStateStringType serviceName;
    @XmlElement(name = "server_program", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#unix")
    protected EntityStateStringType serverProgram;
    @XmlElement(name = "server_arguments", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#unix")
    protected EntityStateStringType serverArguments;
    @XmlElement(name = "endpoint_type", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#unix")
    protected EntityStateEndpointType endpointType;
    @XmlElement(name = "exec_as_user", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#unix")
    protected EntityStateStringType execAsUser;
    @XmlElement(name = "wait_status", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#unix")
    protected EntityStateWaitStatusType waitStatus;

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
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setServiceName(EntityStateStringType value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the serverProgram property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getServerProgram() {
        return serverProgram;
    }

    /**
     * Sets the value of the serverProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setServerProgram(EntityStateStringType value) {
        this.serverProgram = value;
    }

    /**
     * Gets the value of the serverArguments property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getServerArguments() {
        return serverArguments;
    }

    /**
     * Sets the value of the serverArguments property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setServerArguments(EntityStateStringType value) {
        this.serverArguments = value;
    }

    /**
     * Gets the value of the endpointType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateEndpointType }
     *     
     */
    public EntityStateEndpointType getEndpointType() {
        return endpointType;
    }

    /**
     * Sets the value of the endpointType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateEndpointType }
     *     
     */
    public void setEndpointType(EntityStateEndpointType value) {
        this.endpointType = value;
    }

    /**
     * Gets the value of the execAsUser property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getExecAsUser() {
        return execAsUser;
    }

    /**
     * Sets the value of the execAsUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setExecAsUser(EntityStateStringType value) {
        this.execAsUser = value;
    }

    /**
     * Gets the value of the waitStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateWaitStatusType }
     *     
     */
    public EntityStateWaitStatusType getWaitStatus() {
        return waitStatus;
    }

    /**
     * Sets the value of the waitStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateWaitStatusType }
     *     
     */
    public void setWaitStatus(EntityStateWaitStatusType value) {
        this.waitStatus = value;
    }

}
