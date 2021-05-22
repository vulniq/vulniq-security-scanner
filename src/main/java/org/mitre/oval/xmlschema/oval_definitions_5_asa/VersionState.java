


package org.mitre.oval.xmlschema.oval_definitions_5_asa;

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
 *         &lt;element name="asa_release" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="asa_major_release" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateVersionType" minOccurs="0"/>
 *         &lt;element name="asa_minor_release" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateVersionType" minOccurs="0"/>
 *         &lt;element name="asa_build" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
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
    "asaRelease",
    "asaMajorRelease",
    "asaMinorRelease",
    "asaBuild"
})
public class VersionState
    extends StateType
{

    @XmlElement(name = "asa_release", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa")
    protected EntityStateStringType asaRelease;
    @XmlElement(name = "asa_major_release", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa")
    protected EntityStateVersionType asaMajorRelease;
    @XmlElement(name = "asa_minor_release", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa")
    protected EntityStateVersionType asaMinorRelease;
    @XmlElement(name = "asa_build", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa")
    protected EntityStateIntType asaBuild;

    /**
     * Gets the value of the asaRelease property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getAsaRelease() {
        return asaRelease;
    }

    /**
     * Sets the value of the asaRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setAsaRelease(EntityStateStringType value) {
        this.asaRelease = value;
    }

    /**
     * Gets the value of the asaMajorRelease property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateVersionType }
     *     
     */
    public EntityStateVersionType getAsaMajorRelease() {
        return asaMajorRelease;
    }

    /**
     * Sets the value of the asaMajorRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateVersionType }
     *     
     */
    public void setAsaMajorRelease(EntityStateVersionType value) {
        this.asaMajorRelease = value;
    }

    /**
     * Gets the value of the asaMinorRelease property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateVersionType }
     *     
     */
    public EntityStateVersionType getAsaMinorRelease() {
        return asaMinorRelease;
    }

    /**
     * Sets the value of the asaMinorRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateVersionType }
     *     
     */
    public void setAsaMinorRelease(EntityStateVersionType value) {
        this.asaMinorRelease = value;
    }

    /**
     * Gets the value of the asaBuild property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getAsaBuild() {
        return asaBuild;
    }

    /**
     * Sets the value of the asaBuild property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setAsaBuild(EntityStateIntType value) {
        this.asaBuild = value;
    }

}
