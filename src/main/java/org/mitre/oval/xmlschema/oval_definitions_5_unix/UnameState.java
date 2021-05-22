


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
 *         &lt;element name="machine_class" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="node_name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="os_name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="os_release" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="os_version" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="processor_type" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
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
    "machineClass",
    "nodeName",
    "osName",
    "osRelease",
    "osVersion",
    "processorType"
})
public class UnameState
    extends StateType
{

    @XmlElement(name = "machine_class", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#unix")
    protected EntityStateStringType machineClass;
    @XmlElement(name = "node_name", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#unix")
    protected EntityStateStringType nodeName;
    @XmlElement(name = "os_name", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#unix")
    protected EntityStateStringType osName;
    @XmlElement(name = "os_release", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#unix")
    protected EntityStateStringType osRelease;
    @XmlElement(name = "os_version", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#unix")
    protected EntityStateStringType osVersion;
    @XmlElement(name = "processor_type", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#unix")
    protected EntityStateStringType processorType;

    /**
     * Gets the value of the machineClass property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getMachineClass() {
        return machineClass;
    }

    /**
     * Sets the value of the machineClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setMachineClass(EntityStateStringType value) {
        this.machineClass = value;
    }

    /**
     * Gets the value of the nodeName property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getNodeName() {
        return nodeName;
    }

    /**
     * Sets the value of the nodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setNodeName(EntityStateStringType value) {
        this.nodeName = value;
    }

    /**
     * Gets the value of the osName property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getOsName() {
        return osName;
    }

    /**
     * Sets the value of the osName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setOsName(EntityStateStringType value) {
        this.osName = value;
    }

    /**
     * Gets the value of the osRelease property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getOsRelease() {
        return osRelease;
    }

    /**
     * Sets the value of the osRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setOsRelease(EntityStateStringType value) {
        this.osRelease = value;
    }

    /**
     * Gets the value of the osVersion property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getOsVersion() {
        return osVersion;
    }

    /**
     * Sets the value of the osVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setOsVersion(EntityStateStringType value) {
        this.osVersion = value;
    }

    /**
     * Gets the value of the processorType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getProcessorType() {
        return processorType;
    }

    /**
     * Sets the value of the processorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setProcessorType(EntityStateStringType value) {
        this.processorType = value;
    }

}
