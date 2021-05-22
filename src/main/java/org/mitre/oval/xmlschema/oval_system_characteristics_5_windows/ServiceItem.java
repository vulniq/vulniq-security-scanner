


package org.mitre.oval.xmlschema.oval_system_characteristics_5_windows;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemBoolType;
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
 *         &lt;element name="service_name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="display_name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="description" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="service_type" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemServiceTypeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="start_type" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemServiceStartTypeType" minOccurs="0"/>
 *         &lt;element name="current_state" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemServiceCurrentStateType" minOccurs="0"/>
 *         &lt;element name="controls_accepted" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemServiceControlsAcceptedType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="start_name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="path" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="pid" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="service_flag" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="dependencies" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" maxOccurs="unbounded" minOccurs="0"/>
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
public class ServiceItem
    extends ItemType
{

    @XmlElement(name = "service_name", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemStringType serviceName;
    @XmlElement(name = "display_name", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemStringType displayName;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemStringType description;
    @XmlElement(name = "service_type", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected List<EntityItemServiceTypeType> serviceType;
    @XmlElement(name = "start_type", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemServiceStartTypeType startType;
    @XmlElement(name = "current_state", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemServiceCurrentStateType currentState;
    @XmlElement(name = "controls_accepted", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected List<EntityItemServiceControlsAcceptedType> controlsAccepted;
    @XmlElement(name = "start_name", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemStringType startName;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemStringType path;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType pid;
    @XmlElement(name = "service_flag", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType serviceFlag;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected List<EntityItemStringType> dependencies;

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
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setDisplayName(EntityItemStringType value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setDescription(EntityItemStringType value) {
        this.description = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemServiceTypeType }
     * 
     * 
     */
    public List<EntityItemServiceTypeType> getServiceType() {
        if (serviceType == null) {
            serviceType = new ArrayList<EntityItemServiceTypeType>();
        }
        return this.serviceType;
    }

    /**
     * Gets the value of the startType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemServiceStartTypeType }
     *     
     */
    public EntityItemServiceStartTypeType getStartType() {
        return startType;
    }

    /**
     * Sets the value of the startType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemServiceStartTypeType }
     *     
     */
    public void setStartType(EntityItemServiceStartTypeType value) {
        this.startType = value;
    }

    /**
     * Gets the value of the currentState property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemServiceCurrentStateType }
     *     
     */
    public EntityItemServiceCurrentStateType getCurrentState() {
        return currentState;
    }

    /**
     * Sets the value of the currentState property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemServiceCurrentStateType }
     *     
     */
    public void setCurrentState(EntityItemServiceCurrentStateType value) {
        this.currentState = value;
    }

    /**
     * Gets the value of the controlsAccepted property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controlsAccepted property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControlsAccepted().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemServiceControlsAcceptedType }
     * 
     * 
     */
    public List<EntityItemServiceControlsAcceptedType> getControlsAccepted() {
        if (controlsAccepted == null) {
            controlsAccepted = new ArrayList<EntityItemServiceControlsAcceptedType>();
        }
        return this.controlsAccepted;
    }

    /**
     * Gets the value of the startName property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getStartName() {
        return startName;
    }

    /**
     * Sets the value of the startName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setStartName(EntityItemStringType value) {
        this.startName = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setPath(EntityItemStringType value) {
        this.path = value;
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
     * Gets the value of the serviceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getServiceFlag() {
        return serviceFlag;
    }

    /**
     * Sets the value of the serviceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setServiceFlag(EntityItemBoolType value) {
        this.serviceFlag = value;
    }

    /**
     * Gets the value of the dependencies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dependencies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDependencies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemStringType }
     * 
     * 
     */
    public List<EntityItemStringType> getDependencies() {
        if (dependencies == null) {
            dependencies = new ArrayList<EntityItemStringType>();
        }
        return this.dependencies;
    }

}
