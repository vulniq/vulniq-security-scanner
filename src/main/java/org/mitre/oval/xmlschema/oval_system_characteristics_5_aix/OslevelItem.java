


package org.mitre.oval.xmlschema.oval_system_characteristics_5_aix;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="maintenance_level" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemVersionType" minOccurs="0"/>
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
    "maintenanceLevel"
})
public class OslevelItem
    extends ItemType
{

    @XmlElement(name = "maintenance_level", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#aix")
    protected EntityItemVersionType maintenanceLevel;

    /**
     * Gets the value of the maintenanceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemVersionType }
     *     
     */
    public EntityItemVersionType getMaintenanceLevel() {
        return maintenanceLevel;
    }

    /**
     * Sets the value of the maintenanceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemVersionType }
     *     
     */
    public void setMaintenanceLevel(EntityItemVersionType value) {
        this.maintenanceLevel = value;
    }

}
