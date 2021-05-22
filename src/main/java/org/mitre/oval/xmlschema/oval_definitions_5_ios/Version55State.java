


package org.mitre.oval.xmlschema.oval_definitions_5_ios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateIOSVersionType;
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
 *         &lt;element name="major_version" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="minor_version" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="release" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="train_identifier" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="rebuild" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="subrebuild" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="mainline_rebuild" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="version_string" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIOSVersionType" minOccurs="0"/>
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
    "majorVersion",
    "minorVersion",
    "release",
    "trainIdentifier",
    "rebuild",
    "subrebuild",
    "mainlineRebuild",
    "versionString"
})
public class Version55State
    extends StateType
{

    @XmlElement(name = "major_version", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios")
    protected EntityStateIntType majorVersion;
    @XmlElement(name = "minor_version", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios")
    protected EntityStateIntType minorVersion;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios")
    protected EntityStateIntType release;
    @XmlElement(name = "train_identifier", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios")
    protected EntityStateStringType trainIdentifier;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios")
    protected EntityStateIntType rebuild;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios")
    protected EntityStateStringType subrebuild;
    @XmlElement(name = "mainline_rebuild", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios")
    protected EntityStateStringType mainlineRebuild;
    @XmlElement(name = "version_string", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios")
    protected EntityStateIOSVersionType versionString;

    /**
     * Gets the value of the majorVersion property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMajorVersion() {
        return majorVersion;
    }

    /**
     * Sets the value of the majorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMajorVersion(EntityStateIntType value) {
        this.majorVersion = value;
    }

    /**
     * Gets the value of the minorVersion property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMinorVersion() {
        return minorVersion;
    }

    /**
     * Sets the value of the minorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMinorVersion(EntityStateIntType value) {
        this.minorVersion = value;
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
     * Gets the value of the trainIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getTrainIdentifier() {
        return trainIdentifier;
    }

    /**
     * Sets the value of the trainIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setTrainIdentifier(EntityStateStringType value) {
        this.trainIdentifier = value;
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
     * Gets the value of the subrebuild property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getSubrebuild() {
        return subrebuild;
    }

    /**
     * Sets the value of the subrebuild property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setSubrebuild(EntityStateStringType value) {
        this.subrebuild = value;
    }

    /**
     * Gets the value of the mainlineRebuild property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getMainlineRebuild() {
        return mainlineRebuild;
    }

    /**
     * Sets the value of the mainlineRebuild property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setMainlineRebuild(EntityStateStringType value) {
        this.mainlineRebuild = value;
    }

    /**
     * Gets the value of the versionString property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIOSVersionType }
     *     
     */
    public EntityStateIOSVersionType getVersionString() {
        return versionString;
    }

    /**
     * Sets the value of the versionString property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIOSVersionType }
     *     
     */
    public void setVersionString(EntityStateIOSVersionType value) {
        this.versionString = value;
    }

}
