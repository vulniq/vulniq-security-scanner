


package org.mitre.oval.xmlschema.oval_definitions_5_iosxe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="platform" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="rp" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="pkg" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="version_string" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="major_release" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="release" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="rebuild" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="train" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="ios_release" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="ios_train" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
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
    "platform",
    "rp",
    "pkg",
    "versionString",
    "majorRelease",
    "release",
    "rebuild",
    "train",
    "iosRelease",
    "iosTrain"
})
public class VersionState
    extends StateType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe")
    protected EntityStateStringType platform;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe")
    protected EntityStateIntType rp;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe")
    protected EntityStateStringType pkg;
    @XmlElement(name = "version_string", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe")
    protected EntityStateStringType versionString;
    @XmlElement(name = "major_release", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe")
    protected EntityStateIntType majorRelease;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe")
    protected EntityStateIntType release;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe")
    protected EntityStateIntType rebuild;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe")
    protected EntityStateStringType train;
    @XmlElement(name = "ios_release", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe")
    protected EntityStateStringType iosRelease;
    @XmlElement(name = "ios_train", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe")
    protected EntityStateStringType iosTrain;

    /**
     * Gets the value of the platform property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getPlatform() {
        return platform;
    }

    /**
     * Sets the value of the platform property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setPlatform(EntityStateStringType value) {
        this.platform = value;
    }

    /**
     * Gets the value of the rp property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getRp() {
        return rp;
    }

    /**
     * Sets the value of the rp property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setRp(EntityStateIntType value) {
        this.rp = value;
    }

    /**
     * Gets the value of the pkg property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getPkg() {
        return pkg;
    }

    /**
     * Sets the value of the pkg property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setPkg(EntityStateStringType value) {
        this.pkg = value;
    }

    /**
     * Gets the value of the versionString property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getVersionString() {
        return versionString;
    }

    /**
     * Sets the value of the versionString property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setVersionString(EntityStateStringType value) {
        this.versionString = value;
    }

    /**
     * Gets the value of the majorRelease property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMajorRelease() {
        return majorRelease;
    }

    /**
     * Sets the value of the majorRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMajorRelease(EntityStateIntType value) {
        this.majorRelease = value;
    }

    /**
     * Gets the value of the release property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getRelease() {
        return release;
    }

    /**
     * Sets the value of the release property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setRelease(EntityStateIntType value) {
        this.release = value;
    }

    /**
     * Gets the value of the rebuild property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getRebuild() {
        return rebuild;
    }

    /**
     * Sets the value of the rebuild property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setRebuild(EntityStateIntType value) {
        this.rebuild = value;
    }

    /**
     * Gets the value of the train property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getTrain() {
        return train;
    }

    /**
     * Sets the value of the train property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setTrain(EntityStateStringType value) {
        this.train = value;
    }

    /**
     * Gets the value of the iosRelease property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getIosRelease() {
        return iosRelease;
    }

    /**
     * Sets the value of the iosRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setIosRelease(EntityStateStringType value) {
        this.iosRelease = value;
    }

    /**
     * Gets the value of the iosTrain property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getIosTrain() {
        return iosTrain;
    }

    /**
     * Sets the value of the iosTrain property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setIosTrain(EntityStateStringType value) {
        this.iosTrain = value;
    }

}
