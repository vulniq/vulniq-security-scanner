
package org.mitre.oval.xmlschema.oval_system_characteristics_5_linux;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemAnySimpleType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemBoolType;
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
 *         &lt;element name="name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="epoch" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-system-characteristics-5>EntityItemAnySimpleType">
 *                 &lt;attribute name="datatype" default="string">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration">
 *                       &lt;enumeration value="string"/>
 *                       &lt;enumeration value="int"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="version" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-system-characteristics-5>EntityItemAnySimpleType">
 *                 &lt;attribute name="datatype" default="string">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration">
 *                       &lt;enumeration value="string"/>
 *                       &lt;enumeration value="version"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="release" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-system-characteristics-5>EntityItemAnySimpleType">
 *                 &lt;attribute name="datatype" default="string">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration">
 *                       &lt;enumeration value="string"/>
 *                       &lt;enumeration value="version"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="arch" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="filepath" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="extended_name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="size_differs" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux}EntityItemRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="mode_differs" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux}EntityItemRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="md5_differs" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux}EntityItemRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="filedigest_differs" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux}EntityItemRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="device_differs" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux}EntityItemRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="link_mismatch" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux}EntityItemRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="ownership_differs" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux}EntityItemRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="group_differs" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux}EntityItemRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="mtime_differs" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux}EntityItemRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="capabilities_differ" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux}EntityItemRpmVerifyResultType" minOccurs="0"/>
 *         &lt;element name="configuration_file" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="documentation_file" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="ghost_file" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="license_file" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="readme_file" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
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
    "epoch",
    "version",
    "release",
    "arch",
    "filepath",
    "extendedName",
    "sizeDiffers",
    "modeDiffers",
    "md5Differs",
    "filedigestDiffers",
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
public class RpmverifyfileItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemStringType name;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected RpmverifyfileItem.Epoch epoch;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected RpmverifyfileItem.Version version;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected RpmverifyfileItem.Release release;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemStringType arch;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemStringType filepath;
    @XmlElement(name = "extended_name", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemStringType extendedName;
    @XmlElement(name = "size_differs", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemRpmVerifyResultType sizeDiffers;
    @XmlElement(name = "mode_differs", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemRpmVerifyResultType modeDiffers;
    @XmlElement(name = "md5_differs", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemRpmVerifyResultType md5Differs;
    @XmlElement(name = "filedigest_differs", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemRpmVerifyResultType filedigestDiffers;
    @XmlElement(name = "device_differs", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemRpmVerifyResultType deviceDiffers;
    @XmlElement(name = "link_mismatch", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemRpmVerifyResultType linkMismatch;
    @XmlElement(name = "ownership_differs", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemRpmVerifyResultType ownershipDiffers;
    @XmlElement(name = "group_differs", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemRpmVerifyResultType groupDiffers;
    @XmlElement(name = "mtime_differs", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemRpmVerifyResultType mtimeDiffers;
    @XmlElement(name = "capabilities_differ", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemRpmVerifyResultType capabilitiesDiffer;
    @XmlElement(name = "configuration_file", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemBoolType configurationFile;
    @XmlElement(name = "documentation_file", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemBoolType documentationFile;
    @XmlElement(name = "ghost_file", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemBoolType ghostFile;
    @XmlElement(name = "license_file", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemBoolType licenseFile;
    @XmlElement(name = "readme_file", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemBoolType readmeFile;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setName(EntityItemStringType value) {
        this.name = value;
    }

    /**
     * Gets the value of the epoch property.
     * 
     * @return
     *     possible object is
     *     {@link RpmverifyfileItem.Epoch }
     *     
     */
    public RpmverifyfileItem.Epoch getEpoch() {
        return epoch;
    }

    /**
     * Sets the value of the epoch property.
     * 
     * @param value
     *     allowed object is
     *     {@link RpmverifyfileItem.Epoch }
     *     
     */
    public void setEpoch(RpmverifyfileItem.Epoch value) {
        this.epoch = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link RpmverifyfileItem.Version }
     *     
     */
    public RpmverifyfileItem.Version getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link RpmverifyfileItem.Version }
     *     
     */
    public void setVersion(RpmverifyfileItem.Version value) {
        this.version = value;
    }

    /**
     * Gets the value of the release property.
     * 
     * @return
     *     possible object is
     *     {@link RpmverifyfileItem.Release }
     *     
     */
    public RpmverifyfileItem.Release getRelease() {
        return release;
    }

    /**
     * Sets the value of the release property.
     * 
     * @param value
     *     allowed object is
     *     {@link RpmverifyfileItem.Release }
     *     
     */
    public void setRelease(RpmverifyfileItem.Release value) {
        this.release = value;
    }

    /**
     * Gets the value of the arch property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getArch() {
        return arch;
    }

    /**
     * Sets the value of the arch property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setArch(EntityItemStringType value) {
        this.arch = value;
    }

    /**
     * Gets the value of the filepath property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getFilepath() {
        return filepath;
    }

    /**
     * Sets the value of the filepath property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setFilepath(EntityItemStringType value) {
        this.filepath = value;
    }

    /**
     * Gets the value of the extendedName property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getExtendedName() {
        return extendedName;
    }

    /**
     * Sets the value of the extendedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setExtendedName(EntityItemStringType value) {
        this.extendedName = value;
    }

    /**
     * Gets the value of the sizeDiffers property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public EntityItemRpmVerifyResultType getSizeDiffers() {
        return sizeDiffers;
    }

    /**
     * Sets the value of the sizeDiffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public void setSizeDiffers(EntityItemRpmVerifyResultType value) {
        this.sizeDiffers = value;
    }

    /**
     * Gets the value of the modeDiffers property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public EntityItemRpmVerifyResultType getModeDiffers() {
        return modeDiffers;
    }

    /**
     * Sets the value of the modeDiffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public void setModeDiffers(EntityItemRpmVerifyResultType value) {
        this.modeDiffers = value;
    }

    /**
     * Gets the value of the md5Differs property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public EntityItemRpmVerifyResultType getMd5Differs() {
        return md5Differs;
    }

    /**
     * Sets the value of the md5Differs property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public void setMd5Differs(EntityItemRpmVerifyResultType value) {
        this.md5Differs = value;
    }

    /**
     * Gets the value of the filedigestDiffers property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public EntityItemRpmVerifyResultType getFiledigestDiffers() {
        return filedigestDiffers;
    }

    /**
     * Sets the value of the filedigestDiffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public void setFiledigestDiffers(EntityItemRpmVerifyResultType value) {
        this.filedigestDiffers = value;
    }

    /**
     * Gets the value of the deviceDiffers property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public EntityItemRpmVerifyResultType getDeviceDiffers() {
        return deviceDiffers;
    }

    /**
     * Sets the value of the deviceDiffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public void setDeviceDiffers(EntityItemRpmVerifyResultType value) {
        this.deviceDiffers = value;
    }

    /**
     * Gets the value of the linkMismatch property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public EntityItemRpmVerifyResultType getLinkMismatch() {
        return linkMismatch;
    }

    /**
     * Sets the value of the linkMismatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public void setLinkMismatch(EntityItemRpmVerifyResultType value) {
        this.linkMismatch = value;
    }

    /**
     * Gets the value of the ownershipDiffers property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public EntityItemRpmVerifyResultType getOwnershipDiffers() {
        return ownershipDiffers;
    }

    /**
     * Sets the value of the ownershipDiffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public void setOwnershipDiffers(EntityItemRpmVerifyResultType value) {
        this.ownershipDiffers = value;
    }

    /**
     * Gets the value of the groupDiffers property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public EntityItemRpmVerifyResultType getGroupDiffers() {
        return groupDiffers;
    }

    /**
     * Sets the value of the groupDiffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public void setGroupDiffers(EntityItemRpmVerifyResultType value) {
        this.groupDiffers = value;
    }

    /**
     * Gets the value of the mtimeDiffers property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public EntityItemRpmVerifyResultType getMtimeDiffers() {
        return mtimeDiffers;
    }

    /**
     * Sets the value of the mtimeDiffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public void setMtimeDiffers(EntityItemRpmVerifyResultType value) {
        this.mtimeDiffers = value;
    }

    /**
     * Gets the value of the capabilitiesDiffer property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public EntityItemRpmVerifyResultType getCapabilitiesDiffer() {
        return capabilitiesDiffer;
    }

    /**
     * Sets the value of the capabilitiesDiffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemRpmVerifyResultType }
     *     
     */
    public void setCapabilitiesDiffer(EntityItemRpmVerifyResultType value) {
        this.capabilitiesDiffer = value;
    }

    /**
     * Gets the value of the configurationFile property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getConfigurationFile() {
        return configurationFile;
    }

    /**
     * Sets the value of the configurationFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setConfigurationFile(EntityItemBoolType value) {
        this.configurationFile = value;
    }

    /**
     * Gets the value of the documentationFile property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getDocumentationFile() {
        return documentationFile;
    }

    /**
     * Sets the value of the documentationFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setDocumentationFile(EntityItemBoolType value) {
        this.documentationFile = value;
    }

    /**
     * Gets the value of the ghostFile property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getGhostFile() {
        return ghostFile;
    }

    /**
     * Sets the value of the ghostFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setGhostFile(EntityItemBoolType value) {
        this.ghostFile = value;
    }

    /**
     * Gets the value of the licenseFile property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getLicenseFile() {
        return licenseFile;
    }

    /**
     * Sets the value of the licenseFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setLicenseFile(EntityItemBoolType value) {
        this.licenseFile = value;
    }

    /**
     * Gets the value of the readmeFile property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getReadmeFile() {
        return readmeFile;
    }

    /**
     * Sets the value of the readmeFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setReadmeFile(EntityItemBoolType value) {
        this.readmeFile = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-system-characteristics-5>EntityItemAnySimpleType">
     *       &lt;attribute name="datatype" default="string">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration">
     *             &lt;enumeration value="string"/>
     *             &lt;enumeration value="int"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Epoch
        extends EntityItemAnySimpleType
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-system-characteristics-5>EntityItemAnySimpleType">
     *       &lt;attribute name="datatype" default="string">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration">
     *             &lt;enumeration value="string"/>
     *             &lt;enumeration value="version"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Release
        extends EntityItemAnySimpleType
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-system-characteristics-5>EntityItemAnySimpleType">
     *       &lt;attribute name="datatype" default="string">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration">
     *             &lt;enumeration value="string"/>
     *             &lt;enumeration value="version"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Version
        extends EntityItemAnySimpleType
    {


    }

}
