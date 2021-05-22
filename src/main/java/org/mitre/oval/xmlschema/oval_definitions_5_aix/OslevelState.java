


package org.mitre.oval.xmlschema.oval_definitions_5_aix;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="maintenance_level" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateVersionType"/>
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
public class OslevelState
    extends StateType
{

    @XmlElement(name = "maintenance_level", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#aix", required = true)
    protected EntityStateVersionType maintenanceLevel;

    /**
     * Gets the value of the maintenanceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateVersionType }
     *     
     */
    public EntityStateVersionType getMaintenanceLevel() {
        return maintenanceLevel;
    }

    /**
     * Sets the value of the maintenanceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateVersionType }
     *     
     */
    public void setMaintenanceLevel(EntityStateVersionType value) {
        this.maintenanceLevel = value;
    }

}
