


package org.mitre.oval.xmlschema.oval_definitions_5_android;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateBoolType;
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
 *         &lt;element name="adb_enabled" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_mock_location" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="install_non_market_apps" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="device_admin" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="auto_time" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="auto_time_zone" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="usb_mass_storage_enabled" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
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
    "adbEnabled",
    "allowMockLocation",
    "installNonMarketApps",
    "deviceAdmin",
    "autoTime",
    "autoTimeZone",
    "usbMassStorageEnabled"
})
public class DevicesettingsState
    extends StateType
{

    @XmlElement(name = "adb_enabled", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateBoolType adbEnabled;
    @XmlElement(name = "allow_mock_location", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateBoolType allowMockLocation;
    @XmlElement(name = "install_non_market_apps", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateBoolType installNonMarketApps;
    @XmlElement(name = "device_admin", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected List<EntityStateStringType> deviceAdmin;
    @XmlElement(name = "auto_time", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateBoolType autoTime;
    @XmlElement(name = "auto_time_zone", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateBoolType autoTimeZone;
    @XmlElement(name = "usb_mass_storage_enabled", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateBoolType usbMassStorageEnabled;

    /**
     * Gets the value of the adbEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAdbEnabled() {
        return adbEnabled;
    }

    /**
     * Sets the value of the adbEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAdbEnabled(EntityStateBoolType value) {
        this.adbEnabled = value;
    }

    /**
     * Gets the value of the allowMockLocation property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowMockLocation() {
        return allowMockLocation;
    }

    /**
     * Sets the value of the allowMockLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowMockLocation(EntityStateBoolType value) {
        this.allowMockLocation = value;
    }

    /**
     * Gets the value of the installNonMarketApps property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getInstallNonMarketApps() {
        return installNonMarketApps;
    }

    /**
     * Sets the value of the installNonMarketApps property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setInstallNonMarketApps(EntityStateBoolType value) {
        this.installNonMarketApps = value;
    }

    /**
     * Gets the value of the deviceAdmin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceAdmin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceAdmin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityStateStringType }
     * 
     * 
     */
    public List<EntityStateStringType> getDeviceAdmin() {
        if (deviceAdmin == null) {
            deviceAdmin = new ArrayList<EntityStateStringType>();
        }
        return this.deviceAdmin;
    }

    /**
     * Gets the value of the autoTime property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAutoTime() {
        return autoTime;
    }

    /**
     * Sets the value of the autoTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAutoTime(EntityStateBoolType value) {
        this.autoTime = value;
    }

    /**
     * Gets the value of the autoTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAutoTimeZone() {
        return autoTimeZone;
    }

    /**
     * Sets the value of the autoTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAutoTimeZone(EntityStateBoolType value) {
        this.autoTimeZone = value;
    }

    /**
     * Gets the value of the usbMassStorageEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getUsbMassStorageEnabled() {
        return usbMassStorageEnabled;
    }

    /**
     * Sets the value of the usbMassStorageEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setUsbMassStorageEnabled(EntityStateBoolType value) {
        this.usbMassStorageEnabled = value;
    }

}
