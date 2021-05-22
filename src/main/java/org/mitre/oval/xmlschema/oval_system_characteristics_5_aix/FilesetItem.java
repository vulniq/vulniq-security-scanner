


package org.mitre.oval.xmlschema.oval_system_characteristics_5_aix;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="flstinst" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="level" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemVersionType" minOccurs="0"/>
 *         &lt;element name="state" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#aix}EntityItemFilesetStateType" minOccurs="0"/>
 *         &lt;element name="description" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
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
    "flstinst",
    "level",
    "state",
    "description"
})
public class FilesetItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#aix")
    protected EntityItemStringType flstinst;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#aix")
    protected EntityItemVersionType level;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#aix")
    protected EntityItemFilesetStateType state;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#aix")
    protected EntityItemStringType description;

    /**
     * Gets the value of the flstinst property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getFlstinst() {
        return flstinst;
    }

    /**
     * Sets the value of the flstinst property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setFlstinst(EntityItemStringType value) {
        this.flstinst = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemVersionType }
     *     
     */
    public EntityItemVersionType getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemVersionType }
     *     
     */
    public void setLevel(EntityItemVersionType value) {
        this.level = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemFilesetStateType }
     *     
     */
    public EntityItemFilesetStateType getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemFilesetStateType }
     *     
     */
    public void setState(EntityItemFilesetStateType value) {
        this.state = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setDescription(EntityItemStringType value) {
        this.description = value;
    }

}
