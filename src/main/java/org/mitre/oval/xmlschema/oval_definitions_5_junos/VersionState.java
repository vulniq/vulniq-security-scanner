


package org.mitre.oval.xmlschema.oval_definitions_5_junos;

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
 *         &lt;element name="component" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="raw_value" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="major" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="minor" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="type" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#junos}EntityStateJunosReleaseTypeType" minOccurs="0"/>
 *         &lt;element name="build" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="maintenance_release" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="spin" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="build_date" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
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
    "component",
    "rawValue",
    "major",
    "minor",
    "type",
    "build",
    "maintenanceRelease",
    "spin",
    "buildDate"
})
public class VersionState
    extends StateType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#junos")
    protected EntityStateStringType component;
    @XmlElement(name = "raw_value", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#junos")
    protected EntityStateStringType rawValue;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#junos")
    protected EntityStateIntType major;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#junos")
    protected EntityStateIntType minor;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#junos")
    protected EntityStateJunosReleaseTypeType type;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#junos")
    protected EntityStateIntType build;
    @XmlElement(name = "maintenance_release", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#junos")
    protected EntityStateIntType maintenanceRelease;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#junos")
    protected EntityStateIntType spin;
    @XmlElement(name = "build_date", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#junos")
    protected EntityStateIntType buildDate;

    /**
     * Gets the value of the component property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getComponent() {
        return component;
    }

    /**
     * Sets the value of the component property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setComponent(EntityStateStringType value) {
        this.component = value;
    }

    /**
     * Gets the value of the rawValue property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getRawValue() {
        return rawValue;
    }

    /**
     * Sets the value of the rawValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setRawValue(EntityStateStringType value) {
        this.rawValue = value;
    }

    /**
     * Gets the value of the major property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMajor() {
        return major;
    }

    /**
     * Sets the value of the major property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMajor(EntityStateIntType value) {
        this.major = value;
    }

    /**
     * Gets the value of the minor property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMinor() {
        return minor;
    }

    /**
     * Sets the value of the minor property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMinor(EntityStateIntType value) {
        this.minor = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateJunosReleaseTypeType }
     *     
     */
    public EntityStateJunosReleaseTypeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateJunosReleaseTypeType }
     *     
     */
    public void setType(EntityStateJunosReleaseTypeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the build property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getBuild() {
        return build;
    }

    /**
     * Sets the value of the build property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setBuild(EntityStateIntType value) {
        this.build = value;
    }

    /**
     * Gets the value of the maintenanceRelease property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMaintenanceRelease() {
        return maintenanceRelease;
    }

    /**
     * Sets the value of the maintenanceRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMaintenanceRelease(EntityStateIntType value) {
        this.maintenanceRelease = value;
    }

    /**
     * Gets the value of the spin property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getSpin() {
        return spin;
    }

    /**
     * Sets the value of the spin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setSpin(EntityStateIntType value) {
        this.spin = value;
    }

    /**
     * Gets the value of the buildDate property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getBuildDate() {
        return buildDate;
    }

    /**
     * Sets the value of the buildDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setBuildDate(EntityStateIntType value) {
        this.buildDate = value;
    }

}
