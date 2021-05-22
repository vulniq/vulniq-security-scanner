


package org.mitre.oval.xmlschema.oval_system_characteristics_5_android;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemBoolType;
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
 *         &lt;element name="adb_enabled" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="allow_mock_location" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="install_non_market_apps" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="device_admin" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="auto_time" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="auto_time_zone" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="usb_mass_storage_enabled" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
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
public class DevicesettingsItem
    extends ItemType
{

    @XmlElement(name = "adb_enabled", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected EntityItemBoolType adbEnabled;
    @XmlElement(name = "allow_mock_location", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected EntityItemBoolType allowMockLocation;
    @XmlElement(name = "install_non_market_apps", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected EntityItemBoolType installNonMarketApps;
    @XmlElement(name = "device_admin", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected List<EntityItemStringType> deviceAdmin;
    @XmlElement(name = "auto_time", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected EntityItemBoolType autoTime;
    @XmlElement(name = "auto_time_zone", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected EntityItemBoolType autoTimeZone;
    @XmlElement(name = "usb_mass_storage_enabled", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected EntityItemBoolType usbMassStorageEnabled;

    /**
     * Gets the value of the adbEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAdbEnabled() {
        return adbEnabled;
    }

    /**
     * Sets the value of the adbEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAdbEnabled(EntityItemBoolType value) {
        this.adbEnabled = value;
    }

    /**
     * Gets the value of the allowMockLocation property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowMockLocation() {
        return allowMockLocation;
    }

    /**
     * Sets the value of the allowMockLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowMockLocation(EntityItemBoolType value) {
        this.allowMockLocation = value;
    }

    /**
     * Gets the value of the installNonMarketApps property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getInstallNonMarketApps() {
        return installNonMarketApps;
    }

    /**
     * Sets the value of the installNonMarketApps property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setInstallNonMarketApps(EntityItemBoolType value) {
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
     * {@link EntityItemStringType }
     * 
     * 
     */
    public List<EntityItemStringType> getDeviceAdmin() {
        if (deviceAdmin == null) {
            deviceAdmin = new ArrayList<EntityItemStringType>();
        }
        return this.deviceAdmin;
    }

    /**
     * Gets the value of the autoTime property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAutoTime() {
        return autoTime;
    }

    /**
     * Sets the value of the autoTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAutoTime(EntityItemBoolType value) {
        this.autoTime = value;
    }

    /**
     * Gets the value of the autoTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAutoTimeZone() {
        return autoTimeZone;
    }

    /**
     * Sets the value of the autoTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAutoTimeZone(EntityItemBoolType value) {
        this.autoTimeZone = value;
    }

    /**
     * Gets the value of the usbMassStorageEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getUsbMassStorageEnabled() {
        return usbMassStorageEnabled;
    }

    /**
     * Sets the value of the usbMassStorageEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setUsbMassStorageEnabled(EntityItemBoolType value) {
        this.usbMassStorageEnabled = value;
    }

}
