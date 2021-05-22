


package org.mitre.oval.xmlschema.oval_system_characteristics_5_ios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemIOSVersionType;
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
 *         &lt;element name="major_release" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="train_number" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="major_version" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="minor_version" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="release" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="train_identifier" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="rebuild" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="subrebuild" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="mainline_rebuild" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="version_string" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIOSVersionType" minOccurs="0"/>
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
    "majorRelease",
    "trainNumber",
    "majorVersion",
    "minorVersion",
    "release",
    "trainIdentifier",
    "rebuild",
    "subrebuild",
    "mainlineRebuild",
    "versionString"
})
public class VersionItem
    extends ItemType
{

    @XmlElement(name = "major_release", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios")
    protected EntityItemStringType majorRelease;
    @XmlElement(name = "train_number", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios")
    protected EntityItemStringType trainNumber;
    @XmlElement(name = "major_version", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios")
    protected EntityItemIntType majorVersion;
    @XmlElement(name = "minor_version", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios")
    protected EntityItemIntType minorVersion;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios")
    protected EntityItemIntType release;
    @XmlElement(name = "train_identifier", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios")
    protected EntityItemStringType trainIdentifier;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios")
    protected EntityItemIntType rebuild;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios")
    protected EntityItemStringType subrebuild;
    @XmlElement(name = "mainline_rebuild", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios")
    protected EntityItemStringType mainlineRebuild;
    @XmlElement(name = "version_string", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios")
    protected EntityItemIOSVersionType versionString;

    /**
     * Gets the value of the majorRelease property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getMajorRelease() {
        return majorRelease;
    }

    /**
     * Sets the value of the majorRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setMajorRelease(EntityItemStringType value) {
        this.majorRelease = value;
    }

    /**
     * Gets the value of the trainNumber property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getTrainNumber() {
        return trainNumber;
    }

    /**
     * Sets the value of the trainNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setTrainNumber(EntityItemStringType value) {
        this.trainNumber = value;
    }

    /**
     * Gets the value of the majorVersion property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMajorVersion() {
        return majorVersion;
    }

    /**
     * Sets the value of the majorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMajorVersion(EntityItemIntType value) {
        this.majorVersion = value;
    }

    /**
     * Gets the value of the minorVersion property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMinorVersion() {
        return minorVersion;
    }

    /**
     * Sets the value of the minorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMinorVersion(EntityItemIntType value) {
        this.minorVersion = value;
    }

    /**
     * Gets the value of the release property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getRelease() {
        return release;
    }

    /**
     * Sets the value of the release property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setRelease(EntityItemIntType value) {
        this.release = value;
    }

    /**
     * Gets the value of the trainIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getTrainIdentifier() {
        return trainIdentifier;
    }

    /**
     * Sets the value of the trainIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setTrainIdentifier(EntityItemStringType value) {
        this.trainIdentifier = value;
    }

    /**
     * Gets the value of the rebuild property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getRebuild() {
        return rebuild;
    }

    /**
     * Sets the value of the rebuild property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setRebuild(EntityItemIntType value) {
        this.rebuild = value;
    }

    /**
     * Gets the value of the subrebuild property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getSubrebuild() {
        return subrebuild;
    }

    /**
     * Sets the value of the subrebuild property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setSubrebuild(EntityItemStringType value) {
        this.subrebuild = value;
    }

    /**
     * Gets the value of the mainlineRebuild property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getMainlineRebuild() {
        return mainlineRebuild;
    }

    /**
     * Sets the value of the mainlineRebuild property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setMainlineRebuild(EntityItemStringType value) {
        this.mainlineRebuild = value;
    }

    /**
     * Gets the value of the versionString property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIOSVersionType }
     *     
     */
    public EntityItemIOSVersionType getVersionString() {
        return versionString;
    }

    /**
     * Sets the value of the versionString property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIOSVersionType }
     *     
     */
    public void setVersionString(EntityItemIOSVersionType value) {
        this.versionString = value;
    }

}
