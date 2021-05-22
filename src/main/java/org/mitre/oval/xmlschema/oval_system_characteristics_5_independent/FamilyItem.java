


package org.mitre.oval.xmlschema.oval_system_characteristics_5_independent;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="family" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#independent}EntityItemFamilyType" minOccurs="0"/>
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
    "family"
})
public class FamilyItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#independent")
    protected EntityItemFamilyType family;

    /**
     * Gets the value of the family property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemFamilyType }
     *     
     */
    public EntityItemFamilyType getFamily() {
        return family;
    }

    /**
     * Sets the value of the family property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemFamilyType }
     *     
     */
    public void setFamily(EntityItemFamilyType value) {
        this.family = value;
    }

}
