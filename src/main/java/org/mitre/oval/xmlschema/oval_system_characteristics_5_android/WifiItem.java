
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
 *         &lt;element name="wifi_status" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="network_availability_notification" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
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
public class WifiItem
    extends ItemType
{

    @XmlElement(name = "wifi_status", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected EntityItemBoolType wifiStatus;
    @XmlElement(name = "network_availability_notification", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected EntityItemBoolType networkAvailabilityNotification;

    /**
     * Gets the value of the wifiStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getWifiStatus() {
        return wifiStatus;
    }

    /**
     * Sets the value of the wifiStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setWifiStatus(EntityItemBoolType value) {
        this.wifiStatus = value;
    }

    /**
     * Gets the value of the networkAvailabilityNotification property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getNetworkAvailabilityNotification() {
        return networkAvailabilityNotification;
    }

    /**
     * Sets the value of the networkAvailabilityNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setNetworkAvailabilityNotification(EntityItemBoolType value) {
        this.networkAvailabilityNotification = value;
    }

}
