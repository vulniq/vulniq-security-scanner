


package org.mitre.oval.xmlschema.oval_definitions_5_catos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateIntType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateStringType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateVersionType;
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
 *         &lt;element name="module_number" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="type" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="model" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="software_major_release" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateVersionType" minOccurs="0"/>
 *         &lt;element name="software_individual_release" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="software_version_id" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="hardware_major_release" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateVersionType" minOccurs="0"/>
 *         &lt;element name="hardware_individual_release" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="firmware_major_release" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateVersionType" minOccurs="0"/>
 *         &lt;element name="firmware_individual_release" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
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
    "moduleNumber",
    "type",
    "model",
    "softwareMajorRelease",
    "softwareIndividualRelease",
    "softwareVersionId",
    "hardwareMajorRelease",
    "hardwareIndividualRelease",
    "firmwareMajorRelease",
    "firmwareIndividualRelease"
})
public class ModuleState
    extends StateType
{

    @XmlElement(name = "module_number", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#catos")
    protected EntityStateIntType moduleNumber;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#catos")
    protected EntityStateStringType type;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#catos")
    protected EntityStateStringType model;
    @XmlElement(name = "software_major_release", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#catos")
    protected EntityStateVersionType softwareMajorRelease;
    @XmlElement(name = "software_individual_release", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#catos")
    protected EntityStateIntType softwareIndividualRelease;
    @XmlElement(name = "software_version_id", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#catos")
    protected EntityStateStringType softwareVersionId;
    @XmlElement(name = "hardware_major_release", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#catos")
    protected EntityStateVersionType hardwareMajorRelease;
    @XmlElement(name = "hardware_individual_release", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#catos")
    protected EntityStateIntType hardwareIndividualRelease;
    @XmlElement(name = "firmware_major_release", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#catos")
    protected EntityStateVersionType firmwareMajorRelease;
    @XmlElement(name = "firmware_individual_release", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#catos")
    protected EntityStateIntType firmwareIndividualRelease;

    /**
     * Gets the value of the moduleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getModuleNumber() {
        return moduleNumber;
    }

    /**
     * Sets the value of the moduleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setModuleNumber(EntityStateIntType value) {
        this.moduleNumber = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setType(EntityStateStringType value) {
        this.type = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setModel(EntityStateStringType value) {
        this.model = value;
    }

    /**
     * Gets the value of the softwareMajorRelease property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateVersionType }
     *     
     */
    public EntityStateVersionType getSoftwareMajorRelease() {
        return softwareMajorRelease;
    }

    /**
     * Sets the value of the softwareMajorRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateVersionType }
     *     
     */
    public void setSoftwareMajorRelease(EntityStateVersionType value) {
        this.softwareMajorRelease = value;
    }

    /**
     * Gets the value of the softwareIndividualRelease property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getSoftwareIndividualRelease() {
        return softwareIndividualRelease;
    }

    /**
     * Sets the value of the softwareIndividualRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setSoftwareIndividualRelease(EntityStateIntType value) {
        this.softwareIndividualRelease = value;
    }

    /**
     * Gets the value of the softwareVersionId property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getSoftwareVersionId() {
        return softwareVersionId;
    }

    /**
     * Sets the value of the softwareVersionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setSoftwareVersionId(EntityStateStringType value) {
        this.softwareVersionId = value;
    }

    /**
     * Gets the value of the hardwareMajorRelease property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateVersionType }
     *     
     */
    public EntityStateVersionType getHardwareMajorRelease() {
        return hardwareMajorRelease;
    }

    /**
     * Sets the value of the hardwareMajorRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateVersionType }
     *     
     */
    public void setHardwareMajorRelease(EntityStateVersionType value) {
        this.hardwareMajorRelease = value;
    }

    /**
     * Gets the value of the hardwareIndividualRelease property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getHardwareIndividualRelease() {
        return hardwareIndividualRelease;
    }

    /**
     * Sets the value of the hardwareIndividualRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setHardwareIndividualRelease(EntityStateIntType value) {
        this.hardwareIndividualRelease = value;
    }

    /**
     * Gets the value of the firmwareMajorRelease property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateVersionType }
     *     
     */
    public EntityStateVersionType getFirmwareMajorRelease() {
        return firmwareMajorRelease;
    }

    /**
     * Sets the value of the firmwareMajorRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateVersionType }
     *     
     */
    public void setFirmwareMajorRelease(EntityStateVersionType value) {
        this.firmwareMajorRelease = value;
    }

    /**
     * Gets the value of the firmwareIndividualRelease property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getFirmwareIndividualRelease() {
        return firmwareIndividualRelease;
    }

    /**
     * Sets the value of the firmwareIndividualRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setFirmwareIndividualRelease(EntityStateIntType value) {
        this.firmwareIndividualRelease = value;
    }

}
