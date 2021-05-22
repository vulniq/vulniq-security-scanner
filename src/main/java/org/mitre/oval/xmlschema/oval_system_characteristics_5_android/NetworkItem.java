


package org.mitre.oval.xmlschema.oval_system_characteristics_5_android;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemBoolType;
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
 *         &lt;element name="airplane_mode" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="nfc_enabled" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
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
    "airplaneMode",
    "nfcEnabled"
})
public class NetworkItem
    extends ItemType
{

    @XmlElement(name = "airplane_mode", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected EntityItemBoolType airplaneMode;
    @XmlElement(name = "nfc_enabled", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected EntityItemBoolType nfcEnabled;

    /**
     * Gets the value of the airplaneMode property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAirplaneMode() {
        return airplaneMode;
    }

    /**
     * Sets the value of the airplaneMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAirplaneMode(EntityItemBoolType value) {
        this.airplaneMode = value;
    }

    /**
     * Gets the value of the nfcEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getNfcEnabled() {
        return nfcEnabled;
    }

    /**
     * Sets the value of the nfcEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setNfcEnabled(EntityItemBoolType value) {
        this.nfcEnabled = value;
    }

}
