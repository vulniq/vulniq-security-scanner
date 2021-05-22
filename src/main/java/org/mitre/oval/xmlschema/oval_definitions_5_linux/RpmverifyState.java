


package org.mitre.oval.xmlschema.oval_definitions_5_linux;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateBoolType;
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
 *         &lt;element name="name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="filepath" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="size_differs" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#linux}EntityStateRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="mode_differs" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#linux}EntityStateRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="md5_differs" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#linux}EntityStateRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="device_differs" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#linux}EntityStateRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="link_mismatch" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#linux}EntityStateRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="ownership_differs" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#linux}EntityStateRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="group_differs" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#linux}EntityStateRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="mtime_differs" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#linux}EntityStateRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="capabilities_differ" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#linux}EntityStateRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="configuration_file" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="documentation_file" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="ghost_file" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="license_file" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="readme_file" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
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
    "name",
    "filepath",
    "sizeDiffers",
    "modeDiffers",
    "md5Differs",
    "deviceDiffers",
    "linkMismatch",
    "ownershipDiffers",
    "groupDiffers",
    "mtimeDiffers",
    "capabilitiesDiffer",
    "configurationFile",
    "documentationFile",
    "ghostFile",
    "licenseFile",
    "readmeFile"
})
public class RpmverifyState
    extends StateType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateStringType name;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateStringType filepath;
    @XmlElement(name = "size_differs", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateRpmVerifyResultType sizeDiffers;
    @XmlElement(name = "mode_differs", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateRpmVerifyResultType modeDiffers;
    @XmlElement(name = "md5_differs", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateRpmVerifyResultType md5Differs;
    @XmlElement(name = "device_differs", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateRpmVerifyResultType deviceDiffers;
    @XmlElement(name = "link_mismatch", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateRpmVerifyResultType linkMismatch;
    @XmlElement(name = "ownership_differs", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateRpmVerifyResultType ownershipDiffers;
    @XmlElement(name = "group_differs", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateRpmVerifyResultType groupDiffers;
    @XmlElement(name = "mtime_differs", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateRpmVerifyResultType mtimeDiffers;
    @XmlElement(name = "capabilities_differ", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateRpmVerifyResultType capabilitiesDiffer;
    @XmlElement(name = "configuration_file", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateBoolType configurationFile;
    @XmlElement(name = "documentation_file", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateBoolType documentationFile;
    @XmlElement(name = "ghost_file", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateBoolType ghostFile;
    @XmlElement(name = "license_file", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateBoolType licenseFile;
    @XmlElement(name = "readme_file", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateBoolType readmeFile;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setName(EntityStateStringType value) {
        this.name = value;
    }

    /**
     * Gets the value of the filepath property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getFilepath() {
        return filepath;
    }

    /**
     * Sets the value of the filepath property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setFilepath(EntityStateStringType value) {
        this.filepath = value;
    }

    /**
     * Gets the value of the sizeDiffers property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateRpmVerifyResultType }
     *     
     */
    public EntityStateRpmVerifyResultType getSizeDiffers() {
        return sizeDiffers;
    }

    /**
     * Sets the value of the sizeDiffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateRpmVerifyResultType }
     *     
     */
    public void setSizeDiffers(EntityStateRpmVerifyResultType value) {
        this.sizeDiffers = value;
    }

    /**
     * Gets the value of the modeDiffers property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateRpmVerifyResultType }
     *     
     */
    public EntityStateRpmVerifyResultType getModeDiffers() {
        return modeDiffers;
    }

    /**
     * Sets the value of the modeDiffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateRpmVerifyResultType }
     *     
     */
    public void setModeDiffers(EntityStateRpmVerifyResultType value) {
        this.modeDiffers = value;
    }

    /**
     * Gets the value of the md5Differs property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateRpmVerifyResultType }
     *     
     */
    public EntityStateRpmVerifyResultType getMd5Differs() {
        return md5Differs;
    }

    /**
     * Sets the value of the md5Differs property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateRpmVerifyResultType }
     *     
     */
    public void setMd5Differs(EntityStateRpmVerifyResultType value) {
        this.md5Differs = value;
    }

    /**
     * Gets the value of the deviceDiffers property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateRpmVerifyResultType }
     *     
     */
    public EntityStateRpmVerifyResultType getDeviceDiffers() {
        return deviceDiffers;
    }

    /**
     * Sets the value of the deviceDiffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateRpmVerifyResultType }
     *     
     */
    public void setDeviceDiffers(EntityStateRpmVerifyResultType value) {
        this.deviceDiffers = value;
    }

    /**
     * Gets the value of the linkMismatch property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateRpmVerifyResultType }
     *     
     */
    public EntityStateRpmVerifyResultType getLinkMismatch() {
        return linkMismatch;
    }

    /**
     * Sets the value of the linkMismatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateRpmVerifyResultType }
     *     
     */
    public void setLinkMismatch(EntityStateRpmVerifyResultType value) {
        this.linkMismatch = value;
    }

    /**
     * Gets the value of the ownershipDiffers property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateRpmVerifyResultType }
     *     
     */
    public EntityStateRpmVerifyResultType getOwnershipDiffers() {
        return ownershipDiffers;
    }

    /**
     * Sets the value of the ownershipDiffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateRpmVerifyResultType }
     *     
     */
    public void setOwnershipDiffers(EntityStateRpmVerifyResultType value) {
        this.ownershipDiffers = value;
    }

    /**
     * Gets the value of the groupDiffers property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateRpmVerifyResultType }
     *     
     */
    public EntityStateRpmVerifyResultType getGroupDiffers() {
        return groupDiffers;
    }

    /**
     * Sets the value of the groupDiffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateRpmVerifyResultType }
     *     
     */
    public void setGroupDiffers(EntityStateRpmVerifyResultType value) {
        this.groupDiffers = value;
    }

    /**
     * Gets the value of the mtimeDiffers property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateRpmVerifyResultType }
     *     
     */
    public EntityStateRpmVerifyResultType getMtimeDiffers() {
        return mtimeDiffers;
    }

    /**
     * Sets the value of the mtimeDiffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateRpmVerifyResultType }
     *     
     */
    public void setMtimeDiffers(EntityStateRpmVerifyResultType value) {
        this.mtimeDiffers = value;
    }

    /**
     * Gets the value of the capabilitiesDiffer property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateRpmVerifyResultType }
     *     
     */
    public EntityStateRpmVerifyResultType getCapabilitiesDiffer() {
        return capabilitiesDiffer;
    }

    /**
     * Sets the value of the capabilitiesDiffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateRpmVerifyResultType }
     *     
     */
    public void setCapabilitiesDiffer(EntityStateRpmVerifyResultType value) {
        this.capabilitiesDiffer = value;
    }

    /**
     * Gets the value of the configurationFile property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getConfigurationFile() {
        return configurationFile;
    }

    /**
     * Sets the value of the configurationFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setConfigurationFile(EntityStateBoolType value) {
        this.configurationFile = value;
    }

    /**
     * Gets the value of the documentationFile property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getDocumentationFile() {
        return documentationFile;
    }

    /**
     * Sets the value of the documentationFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setDocumentationFile(EntityStateBoolType value) {
        this.documentationFile = value;
    }

    /**
     * Gets the value of the ghostFile property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getGhostFile() {
        return ghostFile;
    }

    /**
     * Sets the value of the ghostFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setGhostFile(EntityStateBoolType value) {
        this.ghostFile = value;
    }

    /**
     * Gets the value of the licenseFile property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getLicenseFile() {
        return licenseFile;
    }

    /**
     * Sets the value of the licenseFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setLicenseFile(EntityStateBoolType value) {
        this.licenseFile = value;
    }

    /**
     * Gets the value of the readmeFile property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getReadmeFile() {
        return readmeFile;
    }

    /**
     * Sets the value of the readmeFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setReadmeFile(EntityStateBoolType value) {
        this.readmeFile = value;
    }

}
