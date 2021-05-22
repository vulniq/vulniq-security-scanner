
package org.mitre.oval.xmlschema.oval_definitions_5_solaris;

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
 *         &lt;element name="fmri" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="service_name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="service_state" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris}EntityStateSmfServiceStateType" minOccurs="0"/>
 *         &lt;element name="protocol" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="server_executable" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="server_arguements" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="exec_as_user" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
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
    "fmri",
    "serviceName",
    "serviceState",
    "protocol",
    "serverExecutable",
    "serverArguements",
    "execAsUser"
})
public class SmfState
    extends StateType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris")
    protected EntityStateStringType fmri;
    @XmlElement(name = "service_name", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris")
    protected EntityStateStringType serviceName;
    @XmlElement(name = "service_state", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris")
    protected EntityStateSmfServiceStateType serviceState;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris")
    protected EntityStateStringType protocol;
    @XmlElement(name = "server_executable", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris")
    protected EntityStateStringType serverExecutable;
    @XmlElement(name = "server_arguements", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris")
    protected EntityStateStringType serverArguements;
    @XmlElement(name = "exec_as_user", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#solaris")
    protected EntityStateStringType execAsUser;

    /**
     * Gets the value of the fmri property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getFmri() {
        return fmri;
    }

    /**
     * Sets the value of the fmri property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setFmri(EntityStateStringType value) {
        this.fmri = value;
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
     * Gets the value of the serviceState property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateSmfServiceStateType }
     *     
     */
    public EntityStateSmfServiceStateType getServiceState() {
        return serviceState;
    }

    /**
     * Sets the value of the serviceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateSmfServiceStateType }
     *     
     */
    public void setServiceState(EntityStateSmfServiceStateType value) {
        this.serviceState = value;
    }

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
     * Gets the value of the serverExecutable property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getServerExecutable() {
        return serverExecutable;
    }

    /**
     * Sets the value of the serverExecutable property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setServerExecutable(EntityStateStringType value) {
        this.serverExecutable = value;
    }

    /**
     * Gets the value of the serverArguements property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getServerArguements() {
        return serverArguements;
    }

    /**
     * Sets the value of the serverArguements property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setServerArguements(EntityStateStringType value) {
        this.serverArguements = value;
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

}
