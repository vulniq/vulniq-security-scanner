


package org.mitre.oval.xmlschema.oval_system_characteristics_5_android;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;
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
 *         &lt;element name="network_type" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android}EntityItemNetworkType" minOccurs="0"/>
 *         &lt;element name="sim_country_iso" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="sim_operator_code" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
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
    "networkType",
    "simCountryIso",
    "simOperatorCode"
})
public class TelephonyItem
    extends ItemType
{

    @XmlElement(name = "network_type", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected EntityItemNetworkType networkType;
    @XmlElement(name = "sim_country_iso", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected EntityItemStringType simCountryIso;
    @XmlElement(name = "sim_operator_code", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected EntityItemStringType simOperatorCode;

    /**
     * Gets the value of the networkType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemNetworkType }
     *     
     */
    public EntityItemNetworkType getNetworkType() {
        return networkType;
    }

    /**
     * Sets the value of the networkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemNetworkType }
     *     
     */
    public void setNetworkType(EntityItemNetworkType value) {
        this.networkType = value;
    }

    /**
     * Gets the value of the simCountryIso property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getSimCountryIso() {
        return simCountryIso;
    }

    /**
     * Sets the value of the simCountryIso property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setSimCountryIso(EntityItemStringType value) {
        this.simCountryIso = value;
    }

    /**
     * Gets the value of the simOperatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getSimOperatorCode() {
        return simOperatorCode;
    }

    /**
     * Sets the value of the simOperatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setSimOperatorCode(EntityItemStringType value) {
        this.simOperatorCode = value;
    }

}
