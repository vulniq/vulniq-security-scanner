
package org.mitre.oval.xmlschema.oval_system_characteristics_5_catos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemIntType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemVersionType;
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
 *         &lt;element name="module_number" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="type" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="model" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="software_major_release" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemVersionType" minOccurs="0"/>
 *         &lt;element name="software_individual_release" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="software_version_id" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="hardware_major_release" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemVersionType" minOccurs="0"/>
 *         &lt;element name="hardware_individual_release" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="firmware_major_release" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemVersionType" minOccurs="0"/>
 *         &lt;element name="firmware_individual_release" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
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
public class ModuleItem
    extends ItemType
{

    @XmlElement(name = "module_number", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#catos")
    protected EntityItemIntType moduleNumber;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#catos")
    protected EntityItemStringType type;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#catos")
    protected EntityItemStringType model;
    @XmlElement(name = "software_major_release", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#catos")
    protected EntityItemVersionType softwareMajorRelease;
    @XmlElement(name = "software_individual_release", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#catos")
    protected EntityItemIntType softwareIndividualRelease;
    @XmlElement(name = "software_version_id", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#catos")
    protected EntityItemStringType softwareVersionId;
    @XmlElement(name = "hardware_major_release", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#catos")
    protected EntityItemVersionType hardwareMajorRelease;
    @XmlElement(name = "hardware_individual_release", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#catos")
    protected EntityItemIntType hardwareIndividualRelease;
    @XmlElement(name = "firmware_major_release", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#catos")
    protected EntityItemVersionType firmwareMajorRelease;
    @XmlElement(name = "firmware_individual_release", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#catos")
    protected EntityItemIntType firmwareIndividualRelease;

    /**
     * Gets the value of the moduleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getModuleNumber() {
        return moduleNumber;
    }

    /**
     * Sets the value of the moduleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setModuleNumber(EntityItemIntType value) {
        this.moduleNumber = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setType(EntityItemStringType value) {
        this.type = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setModel(EntityItemStringType value) {
        this.model = value;
    }

    /**
     * Gets the value of the softwareMajorRelease property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemVersionType }
     *     
     */
    public EntityItemVersionType getSoftwareMajorRelease() {
        return softwareMajorRelease;
    }

    /**
     * Sets the value of the softwareMajorRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemVersionType }
     *     
     */
    public void setSoftwareMajorRelease(EntityItemVersionType value) {
        this.softwareMajorRelease = value;
    }

    /**
     * Gets the value of the softwareIndividualRelease property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getSoftwareIndividualRelease() {
        return softwareIndividualRelease;
    }

    /**
     * Sets the value of the softwareIndividualRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setSoftwareIndividualRelease(EntityItemIntType value) {
        this.softwareIndividualRelease = value;
    }

    /**
     * Gets the value of the softwareVersionId property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getSoftwareVersionId() {
        return softwareVersionId;
    }

    /**
     * Sets the value of the softwareVersionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setSoftwareVersionId(EntityItemStringType value) {
        this.softwareVersionId = value;
    }

    /**
     * Gets the value of the hardwareMajorRelease property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemVersionType }
     *     
     */
    public EntityItemVersionType getHardwareMajorRelease() {
        return hardwareMajorRelease;
    }

    /**
     * Sets the value of the hardwareMajorRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemVersionType }
     *     
     */
    public void setHardwareMajorRelease(EntityItemVersionType value) {
        this.hardwareMajorRelease = value;
    }

    /**
     * Gets the value of the hardwareIndividualRelease property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getHardwareIndividualRelease() {
        return hardwareIndividualRelease;
    }

    /**
     * Sets the value of the hardwareIndividualRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setHardwareIndividualRelease(EntityItemIntType value) {
        this.hardwareIndividualRelease = value;
    }

    /**
     * Gets the value of the firmwareMajorRelease property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemVersionType }
     *     
     */
    public EntityItemVersionType getFirmwareMajorRelease() {
        return firmwareMajorRelease;
    }

    /**
     * Sets the value of the firmwareMajorRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemVersionType }
     *     
     */
    public void setFirmwareMajorRelease(EntityItemVersionType value) {
        this.firmwareMajorRelease = value;
    }

    /**
     * Gets the value of the firmwareIndividualRelease property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getFirmwareIndividualRelease() {
        return firmwareIndividualRelease;
    }

    /**
     * Sets the value of the firmwareIndividualRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setFirmwareIndividualRelease(EntityItemIntType value) {
        this.firmwareIndividualRelease = value;
    }

}
