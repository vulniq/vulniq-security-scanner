


package org.mitre.oval.xmlschema.oval_system_characteristics_5_asa;

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
 *         &lt;element name="asa_release" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="asa_major_release" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemVersionType" minOccurs="0"/>
 *         &lt;element name="asa_minor_release" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemVersionType" minOccurs="0"/>
 *         &lt;element name="asa_build" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
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
public class VersionItem
    extends ItemType
{

    @XmlElement(name = "asa_release", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
    protected EntityItemStringType asaRelease;
    @XmlElement(name = "asa_major_release", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
    protected EntityItemVersionType asaMajorRelease;
    @XmlElement(name = "asa_minor_release", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
    protected EntityItemVersionType asaMinorRelease;
    @XmlElement(name = "asa_build", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
    protected EntityItemIntType asaBuild;

    /**
     * Gets the value of the asaRelease property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getAsaRelease() {
        return asaRelease;
    }

    /**
     * Sets the value of the asaRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setAsaRelease(EntityItemStringType value) {
        this.asaRelease = value;
    }

    /**
     * Gets the value of the asaMajorRelease property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemVersionType }
     *     
     */
    public EntityItemVersionType getAsaMajorRelease() {
        return asaMajorRelease;
    }

    /**
     * Sets the value of the asaMajorRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemVersionType }
     *     
     */
    public void setAsaMajorRelease(EntityItemVersionType value) {
        this.asaMajorRelease = value;
    }

    /**
     * Gets the value of the asaMinorRelease property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemVersionType }
     *     
     */
    public EntityItemVersionType getAsaMinorRelease() {
        return asaMinorRelease;
    }

    /**
     * Sets the value of the asaMinorRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemVersionType }
     *     
     */
    public void setAsaMinorRelease(EntityItemVersionType value) {
        this.asaMinorRelease = value;
    }

    /**
     * Gets the value of the asaBuild property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getAsaBuild() {
        return asaBuild;
    }

    /**
     * Sets the value of the asaBuild property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setAsaBuild(EntityItemIntType value) {
        this.asaBuild = value;
    }

}
