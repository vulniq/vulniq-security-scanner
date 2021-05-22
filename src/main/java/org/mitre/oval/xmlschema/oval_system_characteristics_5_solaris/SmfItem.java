


package org.mitre.oval.xmlschema.oval_system_characteristics_5_solaris;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="fmri" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="service_name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="service_state" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris}EntityItemSmfServiceStateType" minOccurs="0"/>
 *         &lt;element name="protocol" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="server_executable" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="server_arguements" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="exec_as_user" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
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
public class SmfItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris")
    protected EntityItemStringType fmri;
    @XmlElement(name = "service_name", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris")
    protected EntityItemStringType serviceName;
    @XmlElement(name = "service_state", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris")
    protected EntityItemSmfServiceStateType serviceState;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris")
    protected List<EntityItemStringType> protocol;
    @XmlElement(name = "server_executable", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris")
    protected EntityItemStringType serverExecutable;
    @XmlElement(name = "server_arguements", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris")
    protected EntityItemStringType serverArguements;
    @XmlElement(name = "exec_as_user", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris")
    protected EntityItemStringType execAsUser;

    /**
     * Gets the value of the fmri property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getFmri() {
        return fmri;
    }

    /**
     * Sets the value of the fmri property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setFmri(EntityItemStringType value) {
        this.fmri = value;
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
     * Gets the value of the serviceState property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemSmfServiceStateType }
     *     
     */
    public EntityItemSmfServiceStateType getServiceState() {
        return serviceState;
    }

    /**
     * Sets the value of the serviceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemSmfServiceStateType }
     *     
     */
    public void setServiceState(EntityItemSmfServiceStateType value) {
        this.serviceState = value;
    }

    /**
     * Gets the value of the protocol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the protocol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProtocol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemStringType }
     * 
     * 
     */
    public List<EntityItemStringType> getProtocol() {
        if (protocol == null) {
            protocol = new ArrayList<EntityItemStringType>();
        }
        return this.protocol;
    }

    /**
     * Gets the value of the serverExecutable property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getServerExecutable() {
        return serverExecutable;
    }

    /**
     * Sets the value of the serverExecutable property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setServerExecutable(EntityItemStringType value) {
        this.serverExecutable = value;
    }

    /**
     * Gets the value of the serverArguements property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getServerArguements() {
        return serverArguements;
    }

    /**
     * Sets the value of the serverArguements property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setServerArguements(EntityItemStringType value) {
        this.serverArguements = value;
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

}
