


package org.mitre.oval.xmlschema.oval_definitions_5_android;

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
 *         &lt;element name="hardware" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="model" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="product" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="cpu_abi" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="cpu_abi2" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="build_fingerprint" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="os_version_code_name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="os_version_build_number" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="os_version_release_name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="os_version_sdk_number" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="hardware_keystore" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
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
    "hardware",
    "manufacturer",
    "model",
    "product",
    "cpuAbi",
    "cpuAbi2",
    "buildFingerprint",
    "osVersionCodeName",
    "osVersionBuildNumber",
    "osVersionReleaseName",
    "osVersionSdkNumber",
    "hardwareKeystore"
})
public class SystemdetailsState
    extends StateType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateStringType hardware;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateStringType manufacturer;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateStringType model;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateStringType product;
    @XmlElement(name = "cpu_abi", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateStringType cpuAbi;
    @XmlElement(name = "cpu_abi2", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateStringType cpuAbi2;
    @XmlElement(name = "build_fingerprint", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateStringType buildFingerprint;
    @XmlElement(name = "os_version_code_name", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateStringType osVersionCodeName;
    @XmlElement(name = "os_version_build_number", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateStringType osVersionBuildNumber;
    @XmlElement(name = "os_version_release_name", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateStringType osVersionReleaseName;
    @XmlElement(name = "os_version_sdk_number", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateIntType osVersionSdkNumber;
    @XmlElement(name = "hardware_keystore", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateBoolType hardwareKeystore;

    /**
     * Gets the value of the hardware property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getHardware() {
        return hardware;
    }

    /**
     * Sets the value of the hardware property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setHardware(EntityStateStringType value) {
        this.hardware = value;
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setManufacturer(EntityStateStringType value) {
        this.manufacturer = value;
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
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setProduct(EntityStateStringType value) {
        this.product = value;
    }

    /**
     * Gets the value of the cpuAbi property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getCpuAbi() {
        return cpuAbi;
    }

    /**
     * Sets the value of the cpuAbi property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setCpuAbi(EntityStateStringType value) {
        this.cpuAbi = value;
    }

    /**
     * Gets the value of the cpuAbi2 property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getCpuAbi2() {
        return cpuAbi2;
    }

    /**
     * Sets the value of the cpuAbi2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setCpuAbi2(EntityStateStringType value) {
        this.cpuAbi2 = value;
    }

    /**
     * Gets the value of the buildFingerprint property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getBuildFingerprint() {
        return buildFingerprint;
    }

    /**
     * Sets the value of the buildFingerprint property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setBuildFingerprint(EntityStateStringType value) {
        this.buildFingerprint = value;
    }

    /**
     * Gets the value of the osVersionCodeName property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getOsVersionCodeName() {
        return osVersionCodeName;
    }

    /**
     * Sets the value of the osVersionCodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setOsVersionCodeName(EntityStateStringType value) {
        this.osVersionCodeName = value;
    }

    /**
     * Gets the value of the osVersionBuildNumber property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getOsVersionBuildNumber() {
        return osVersionBuildNumber;
    }

    /**
     * Sets the value of the osVersionBuildNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setOsVersionBuildNumber(EntityStateStringType value) {
        this.osVersionBuildNumber = value;
    }

    /**
     * Gets the value of the osVersionReleaseName property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getOsVersionReleaseName() {
        return osVersionReleaseName;
    }

    /**
     * Sets the value of the osVersionReleaseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setOsVersionReleaseName(EntityStateStringType value) {
        this.osVersionReleaseName = value;
    }

    /**
     * Gets the value of the osVersionSdkNumber property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getOsVersionSdkNumber() {
        return osVersionSdkNumber;
    }

    /**
     * Sets the value of the osVersionSdkNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setOsVersionSdkNumber(EntityStateIntType value) {
        this.osVersionSdkNumber = value;
    }

    /**
     * Gets the value of the hardwareKeystore property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getHardwareKeystore() {
        return hardwareKeystore;
    }

    /**
     * Sets the value of the hardwareKeystore property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setHardwareKeystore(EntityStateBoolType value) {
        this.hardwareKeystore = value;
    }

}
