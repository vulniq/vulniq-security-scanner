
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
 *         &lt;element name="switch_series" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="image_name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="catos_release" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemVersionType" minOccurs="0"/>
 *         &lt;element name="catos_major_release" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemVersionType" minOccurs="0"/>
 *         &lt;element name="catos_individual_release" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="catos_version_id" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
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
    "switchSeries",
    "imageName",
    "catosRelease",
    "catosMajorRelease",
    "catosIndividualRelease",
    "catosVersionId"
})
public class VersionItem
    extends ItemType
{

    @XmlElement(name = "switch_series", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#catos")
    protected EntityItemStringType switchSeries;
    @XmlElement(name = "image_name", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#catos")
    protected EntityItemStringType imageName;
    @XmlElement(name = "catos_release", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#catos")
    protected EntityItemVersionType catosRelease;
    @XmlElement(name = "catos_major_release", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#catos")
    protected EntityItemVersionType catosMajorRelease;
    @XmlElement(name = "catos_individual_release", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#catos")
    protected EntityItemIntType catosIndividualRelease;
    @XmlElement(name = "catos_version_id", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#catos")
    protected EntityItemStringType catosVersionId;

    /**
     * Gets the value of the switchSeries property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getSwitchSeries() {
        return switchSeries;
    }

    /**
     * Sets the value of the switchSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setSwitchSeries(EntityItemStringType value) {
        this.switchSeries = value;
    }

    /**
     * Gets the value of the imageName property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getImageName() {
        return imageName;
    }

    /**
     * Sets the value of the imageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setImageName(EntityItemStringType value) {
        this.imageName = value;
    }

    /**
     * Gets the value of the catosRelease property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemVersionType }
     *     
     */
    public EntityItemVersionType getCatosRelease() {
        return catosRelease;
    }

    /**
     * Sets the value of the catosRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemVersionType }
     *     
     */
    public void setCatosRelease(EntityItemVersionType value) {
        this.catosRelease = value;
    }

    /**
     * Gets the value of the catosMajorRelease property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemVersionType }
     *     
     */
    public EntityItemVersionType getCatosMajorRelease() {
        return catosMajorRelease;
    }

    /**
     * Sets the value of the catosMajorRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemVersionType }
     *     
     */
    public void setCatosMajorRelease(EntityItemVersionType value) {
        this.catosMajorRelease = value;
    }

    /**
     * Gets the value of the catosIndividualRelease property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getCatosIndividualRelease() {
        return catosIndividualRelease;
    }

    /**
     * Sets the value of the catosIndividualRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setCatosIndividualRelease(EntityItemIntType value) {
        this.catosIndividualRelease = value;
    }

    /**
     * Gets the value of the catosVersionId property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getCatosVersionId() {
        return catosVersionId;
    }

    /**
     * Sets the value of the catosVersionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setCatosVersionId(EntityItemStringType value) {
        this.catosVersionId = value;
    }

}
