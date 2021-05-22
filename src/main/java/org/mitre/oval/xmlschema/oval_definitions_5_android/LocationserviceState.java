


package org.mitre.oval.xmlschema.oval_definitions_5_android;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateBoolType;
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
 *         &lt;element name="gps_enabled" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="network_enabled" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
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
    "gpsEnabled",
    "networkEnabled"
})
public class LocationserviceState
    extends StateType
{

    @XmlElement(name = "gps_enabled", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateBoolType gpsEnabled;
    @XmlElement(name = "network_enabled", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateBoolType networkEnabled;

    /**
     * Gets the value of the gpsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getGpsEnabled() {
        return gpsEnabled;
    }

    /**
     * Sets the value of the gpsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setGpsEnabled(EntityStateBoolType value) {
        this.gpsEnabled = value;
    }

    /**
     * Gets the value of the networkEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getNetworkEnabled() {
        return networkEnabled;
    }

    /**
     * Sets the value of the networkEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setNetworkEnabled(EntityStateBoolType value) {
        this.networkEnabled = value;
    }

}
