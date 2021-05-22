


package org.mitre.oval.xmlschema.oval_definitions_5_android;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateStringType;
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
 *         &lt;element name="network_type" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#android}EntityStateNetworkType" minOccurs="0"/>
 *         &lt;element name="sim_country_iso" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="sim_operator_code" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
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
public class TelephonyState
    extends StateType
{

    @XmlElement(name = "network_type", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateNetworkType networkType;
    @XmlElement(name = "sim_country_iso", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateStringType simCountryIso;
    @XmlElement(name = "sim_operator_code", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateStringType simOperatorCode;

    /**
     * Gets the value of the networkType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateNetworkType }
     *     
     */
    public EntityStateNetworkType getNetworkType() {
        return networkType;
    }

    /**
     * Sets the value of the networkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateNetworkType }
     *     
     */
    public void setNetworkType(EntityStateNetworkType value) {
        this.networkType = value;
    }

    /**
     * Gets the value of the simCountryIso property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getSimCountryIso() {
        return simCountryIso;
    }

    /**
     * Sets the value of the simCountryIso property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setSimCountryIso(EntityStateStringType value) {
        this.simCountryIso = value;
    }

    /**
     * Gets the value of the simOperatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getSimOperatorCode() {
        return simOperatorCode;
    }

    /**
     * Sets the value of the simOperatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setSimOperatorCode(EntityStateStringType value) {
        this.simOperatorCode = value;
    }

}
