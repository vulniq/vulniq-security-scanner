


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
 *         &lt;element name="wifi_status" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="network_availability_notification" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
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
    "wifiStatus",
    "networkAvailabilityNotification"
})
public class WifiState
    extends StateType
{

    @XmlElement(name = "wifi_status", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateBoolType wifiStatus;
    @XmlElement(name = "network_availability_notification", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateBoolType networkAvailabilityNotification;

    /**
     * Gets the value of the wifiStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getWifiStatus() {
        return wifiStatus;
    }

    /**
     * Sets the value of the wifiStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setWifiStatus(EntityStateBoolType value) {
        this.wifiStatus = value;
    }

    /**
     * Gets the value of the networkAvailabilityNotification property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getNetworkAvailabilityNotification() {
        return networkAvailabilityNotification;
    }

    /**
     * Sets the value of the networkAvailabilityNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setNetworkAvailabilityNotification(EntityStateBoolType value) {
        this.networkAvailabilityNotification = value;
    }

}
