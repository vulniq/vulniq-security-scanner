


package org.mitre.oval.xmlschema.oval_system_characteristics_5_pixos;

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
 *         &lt;element name="pix_release" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="pix_major_release" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemVersionType" minOccurs="0"/>
 *         &lt;element name="pix_minor_release" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemVersionType" minOccurs="0"/>
 *         &lt;element name="pix_build" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
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
public class VersionItem
    extends ItemType
{

    @XmlElement(name = "pix_release", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#pixos")
    protected EntityItemStringType pixRelease;
    @XmlElement(name = "pix_major_release", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#pixos")
    protected EntityItemVersionType pixMajorRelease;
    @XmlElement(name = "pix_minor_release", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#pixos")
    protected EntityItemVersionType pixMinorRelease;
    @XmlElement(name = "pix_build", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#pixos")
    protected EntityItemIntType pixBuild;

    /**
     * Gets the value of the pixRelease property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getPixRelease() {
        return pixRelease;
    }

    /**
     * Sets the value of the pixRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setPixRelease(EntityItemStringType value) {
        this.pixRelease = value;
    }

    /**
     * Gets the value of the pixMajorRelease property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemVersionType }
     *     
     */
    public EntityItemVersionType getPixMajorRelease() {
        return pixMajorRelease;
    }

    /**
     * Sets the value of the pixMajorRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemVersionType }
     *     
     */
    public void setPixMajorRelease(EntityItemVersionType value) {
        this.pixMajorRelease = value;
    }

    /**
     * Gets the value of the pixMinorRelease property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemVersionType }
     *     
     */
    public EntityItemVersionType getPixMinorRelease() {
        return pixMinorRelease;
    }

    /**
     * Sets the value of the pixMinorRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemVersionType }
     *     
     */
    public void setPixMinorRelease(EntityItemVersionType value) {
        this.pixMinorRelease = value;
    }

    /**
     * Gets the value of the pixBuild property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getPixBuild() {
        return pixBuild;
    }

    /**
     * Sets the value of the pixBuild property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setPixBuild(EntityItemIntType value) {
        this.pixBuild = value;
    }

}
