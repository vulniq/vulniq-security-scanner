


package org.mitre.oval.xmlschema.oval_definitions_5_windows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateBoolType;
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
 *         &lt;element name="service_name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="display_name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="description" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="service_type" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateServiceTypeType" minOccurs="0"/>
 *         &lt;element name="start_type" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateServiceStartTypeType" minOccurs="0"/>
 *         &lt;element name="current_state" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateServiceCurrentStateType" minOccurs="0"/>
 *         &lt;element name="controls_accepted" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateServiceControlsAcceptedType" minOccurs="0"/>
 *         &lt;element name="start_name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="path" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="pid" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="service_flag" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="dependencies" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
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
    "serviceName",
    "displayName",
    "description",
    "serviceType",
    "startType",
    "currentState",
    "controlsAccepted",
    "startName",
    "path",
    "pid",
    "serviceFlag",
    "dependencies"
})
public class ServiceState
    extends StateType
{

    @XmlElement(name = "service_name", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateStringType serviceName;
    @XmlElement(name = "display_name", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateStringType displayName;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateStringType description;
    @XmlElement(name = "service_type", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateServiceTypeType serviceType;
    @XmlElement(name = "start_type", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateServiceStartTypeType startType;
    @XmlElement(name = "current_state", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateServiceCurrentStateType currentState;
    @XmlElement(name = "controls_accepted", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateServiceControlsAcceptedType controlsAccepted;
    @XmlElement(name = "start_name", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateStringType startName;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateStringType path;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType pid;
    @XmlElement(name = "service_flag", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType serviceFlag;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateStringType dependencies;

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
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setDisplayName(EntityStateStringType value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setDescription(EntityStateStringType value) {
        this.description = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateServiceTypeType }
     *     
     */
    public EntityStateServiceTypeType getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateServiceTypeType }
     *     
     */
    public void setServiceType(EntityStateServiceTypeType value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the startType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateServiceStartTypeType }
     *     
     */
    public EntityStateServiceStartTypeType getStartType() {
        return startType;
    }

    /**
     * Sets the value of the startType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateServiceStartTypeType }
     *     
     */
    public void setStartType(EntityStateServiceStartTypeType value) {
        this.startType = value;
    }

    /**
     * Gets the value of the currentState property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateServiceCurrentStateType }
     *     
     */
    public EntityStateServiceCurrentStateType getCurrentState() {
        return currentState;
    }

    /**
     * Sets the value of the currentState property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateServiceCurrentStateType }
     *     
     */
    public void setCurrentState(EntityStateServiceCurrentStateType value) {
        this.currentState = value;
    }

    /**
     * Gets the value of the controlsAccepted property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateServiceControlsAcceptedType }
     *     
     */
    public EntityStateServiceControlsAcceptedType getControlsAccepted() {
        return controlsAccepted;
    }

    /**
     * Sets the value of the controlsAccepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateServiceControlsAcceptedType }
     *     
     */
    public void setControlsAccepted(EntityStateServiceControlsAcceptedType value) {
        this.controlsAccepted = value;
    }

    /**
     * Gets the value of the startName property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getStartName() {
        return startName;
    }

    /**
     * Sets the value of the startName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setStartName(EntityStateStringType value) {
        this.startName = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setPath(EntityStateStringType value) {
        this.path = value;
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
     * Gets the value of the serviceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getServiceFlag() {
        return serviceFlag;
    }

    /**
     * Sets the value of the serviceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setServiceFlag(EntityStateBoolType value) {
        this.serviceFlag = value;
    }

    /**
     * Gets the value of the dependencies property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getDependencies() {
        return dependencies;
    }

    /**
     * Sets the value of the dependencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setDependencies(EntityStateStringType value) {
        this.dependencies = value;
    }

}
