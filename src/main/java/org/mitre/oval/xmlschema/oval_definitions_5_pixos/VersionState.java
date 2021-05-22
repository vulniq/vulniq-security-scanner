


package org.mitre.oval.xmlschema.oval_definitions_5_pixos;

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
 *         &lt;element name="pix_release" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="pix_major_release" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateVersionType" minOccurs="0"/>
 *         &lt;element name="pix_minor_release" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateVersionType" minOccurs="0"/>
 *         &lt;element name="pix_build" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
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
    "pixRelease",
    "pixMajorRelease",
    "pixMinorRelease",
    "pixBuild"
})
public class VersionState
    extends StateType
{

    @XmlElement(name = "pix_release", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#pixos")
    protected EntityStateStringType pixRelease;
    @XmlElement(name = "pix_major_release", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#pixos")
    protected EntityStateVersionType pixMajorRelease;
    @XmlElement(name = "pix_minor_release", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#pixos")
    protected EntityStateVersionType pixMinorRelease;
    @XmlElement(name = "pix_build", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#pixos")
    protected EntityStateIntType pixBuild;

    /**
     * Gets the value of the pixRelease property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getPixRelease() {
        return pixRelease;
    }

    /**
     * Sets the value of the pixRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setPixRelease(EntityStateStringType value) {
        this.pixRelease = value;
    }

    /**
     * Gets the value of the pixMajorRelease property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateVersionType }
     *     
     */
    public EntityStateVersionType getPixMajorRelease() {
        return pixMajorRelease;
    }

    /**
     * Sets the value of the pixMajorRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateVersionType }
     *     
     */
    public void setPixMajorRelease(EntityStateVersionType value) {
        this.pixMajorRelease = value;
    }

    /**
     * Gets the value of the pixMinorRelease property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateVersionType }
     *     
     */
    public EntityStateVersionType getPixMinorRelease() {
        return pixMinorRelease;
    }

    /**
     * Sets the value of the pixMinorRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateVersionType }
     *     
     */
    public void setPixMinorRelease(EntityStateVersionType value) {
        this.pixMinorRelease = value;
    }

    /**
     * Gets the value of the pixBuild property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getPixBuild() {
        return pixBuild;
    }

    /**
     * Sets the value of the pixBuild property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setPixBuild(EntityStateIntType value) {
        this.pixBuild = value;
    }

}
