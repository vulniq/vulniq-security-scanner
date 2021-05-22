


package org.mitre.oval.xmlschema.oval_definitions_5_catos;

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
 *         &lt;element name="switch_series" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="image_name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="catos_major_release" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateVersionType" minOccurs="0"/>
 *         &lt;element name="catos_individual_release" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="catos_version_id" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
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
    "catosMajorRelease",
    "catosIndividualRelease",
    "catosVersionId"
})
public class VersionState
    extends StateType
{

    @XmlElement(name = "switch_series", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#catos")
    protected EntityStateStringType switchSeries;
    @XmlElement(name = "image_name", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#catos")
    protected EntityStateStringType imageName;
    @XmlElement(name = "catos_major_release", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#catos")
    protected EntityStateVersionType catosMajorRelease;
    @XmlElement(name = "catos_individual_release", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#catos")
    protected EntityStateIntType catosIndividualRelease;
    @XmlElement(name = "catos_version_id", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#catos")
    protected EntityStateStringType catosVersionId;

    /**
     * Gets the value of the switchSeries property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getSwitchSeries() {
        return switchSeries;
    }

    /**
     * Sets the value of the switchSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setSwitchSeries(EntityStateStringType value) {
        this.switchSeries = value;
    }

    /**
     * Gets the value of the imageName property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getImageName() {
        return imageName;
    }

    /**
     * Sets the value of the imageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setImageName(EntityStateStringType value) {
        this.imageName = value;
    }

    /**
     * Gets the value of the catosMajorRelease property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateVersionType }
     *     
     */
    public EntityStateVersionType getCatosMajorRelease() {
        return catosMajorRelease;
    }

    /**
     * Sets the value of the catosMajorRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateVersionType }
     *     
     */
    public void setCatosMajorRelease(EntityStateVersionType value) {
        this.catosMajorRelease = value;
    }

    /**
     * Gets the value of the catosIndividualRelease property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getCatosIndividualRelease() {
        return catosIndividualRelease;
    }

    /**
     * Sets the value of the catosIndividualRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setCatosIndividualRelease(EntityStateIntType value) {
        this.catosIndividualRelease = value;
    }

    /**
     * Gets the value of the catosVersionId property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getCatosVersionId() {
        return catosVersionId;
    }

    /**
     * Sets the value of the catosVersionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setCatosVersionId(EntityStateStringType value) {
        this.catosVersionId = value;
    }

}
