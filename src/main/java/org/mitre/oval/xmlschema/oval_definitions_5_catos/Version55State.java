


package org.mitre.oval.xmlschema.oval_definitions_5_catos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="catos_release" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateVersionType" minOccurs="0"/>
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
    "catosRelease"
})
public class Version55State
    extends StateType
{

    @XmlElement(name = "switch_series", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#catos")
    protected EntityStateStringType switchSeries;
    @XmlElement(name = "image_name", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#catos")
    protected EntityStateStringType imageName;
    @XmlElement(name = "catos_release", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#catos")
    protected EntityStateVersionType catosRelease;

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
     * Gets the value of the catosRelease property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateVersionType }
     *     
     */
    public EntityStateVersionType getCatosRelease() {
        return catosRelease;
    }

    /**
     * Sets the value of the catosRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateVersionType }
     *     
     */
    public void setCatosRelease(EntityStateVersionType value) {
        this.catosRelease = value;
    }

}
