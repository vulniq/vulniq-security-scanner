


package org.mitre.oval.xmlschema.oval_system_characteristics_5_macos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemBoolType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemIntType;
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
 *         &lt;element name="timezone" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType"/>
 *         &lt;element name="usingnetworktime" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType"/>
 *         &lt;element name="networktimeserver" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="computersleep" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="displaysleep" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="harddisksleep" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="wakeonmodem" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType"/>
 *         &lt;element name="wakeonnetworkaccess" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType"/>
 *         &lt;element name="restartfreeze" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType"/>
 *         &lt;element name="restartpowerfailure" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType"/>
 *         &lt;element name="allowpowerbuttontosleepcomputer" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType"/>
 *         &lt;element name="remotelogin" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType"/>
 *         &lt;element name="remoteappleevents" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="computername" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType"/>
 *         &lt;element name="localsubnetname" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType"/>
 *         &lt;element name="startupdisk" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType"/>
 *         &lt;element name="waitforstartupafterpowerfailure" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="disablekeyboardwhenenclosurelockisengaged" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType"/>
 *         &lt;element name="kernelbootarchitecturesetting" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType"/>
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
    "timezone",
    "usingnetworktime",
    "networktimeserver",
    "computersleep",
    "displaysleep",
    "harddisksleep",
    "wakeonmodem",
    "wakeonnetworkaccess",
    "restartfreeze",
    "restartpowerfailure",
    "allowpowerbuttontosleepcomputer",
    "remotelogin",
    "remoteappleevents",
    "computername",
    "localsubnetname",
    "startupdisk",
    "waitforstartupafterpowerfailure",
    "disablekeyboardwhenenclosurelockisengaged",
    "kernelbootarchitecturesetting"
})
public class SystemsetupItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", required = true)
    protected EntityItemStringType timezone;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", required = true)
    protected EntityItemBoolType usingnetworktime;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemStringType networktimeserver;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", required = true)
    protected EntityItemIntType computersleep;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", required = true)
    protected EntityItemIntType displaysleep;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", required = true)
    protected EntityItemIntType harddisksleep;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", required = true)
    protected EntityItemBoolType wakeonmodem;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", required = true)
    protected EntityItemBoolType wakeonnetworkaccess;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", required = true)
    protected EntityItemBoolType restartfreeze;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", required = true)
    protected EntityItemBoolType restartpowerfailure;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", required = true)
    protected EntityItemBoolType allowpowerbuttontosleepcomputer;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", required = true)
    protected EntityItemBoolType remotelogin;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemBoolType remoteappleevents;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", required = true)
    protected EntityItemStringType computername;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", required = true)
    protected EntityItemStringType localsubnetname;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", required = true)
    protected EntityItemStringType startupdisk;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", required = true)
    protected EntityItemIntType waitforstartupafterpowerfailure;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", required = true)
    protected EntityItemBoolType disablekeyboardwhenenclosurelockisengaged;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", required = true)
    protected EntityItemStringType kernelbootarchitecturesetting;

    /**
     * Gets the value of the timezone property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getTimezone() {
        return timezone;
    }

    /**
     * Sets the value of the timezone property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setTimezone(EntityItemStringType value) {
        this.timezone = value;
    }

    /**
     * Gets the value of the usingnetworktime property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getUsingnetworktime() {
        return usingnetworktime;
    }

    /**
     * Sets the value of the usingnetworktime property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setUsingnetworktime(EntityItemBoolType value) {
        this.usingnetworktime = value;
    }

    /**
     * Gets the value of the networktimeserver property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getNetworktimeserver() {
        return networktimeserver;
    }

    /**
     * Sets the value of the networktimeserver property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setNetworktimeserver(EntityItemStringType value) {
        this.networktimeserver = value;
    }

    /**
     * Gets the value of the computersleep property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getComputersleep() {
        return computersleep;
    }

    /**
     * Sets the value of the computersleep property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setComputersleep(EntityItemIntType value) {
        this.computersleep = value;
    }

    /**
     * Gets the value of the displaysleep property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getDisplaysleep() {
        return displaysleep;
    }

    /**
     * Sets the value of the displaysleep property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setDisplaysleep(EntityItemIntType value) {
        this.displaysleep = value;
    }

    /**
     * Gets the value of the harddisksleep property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getHarddisksleep() {
        return harddisksleep;
    }

    /**
     * Sets the value of the harddisksleep property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setHarddisksleep(EntityItemIntType value) {
        this.harddisksleep = value;
    }

    /**
     * Gets the value of the wakeonmodem property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getWakeonmodem() {
        return wakeonmodem;
    }

    /**
     * Sets the value of the wakeonmodem property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setWakeonmodem(EntityItemBoolType value) {
        this.wakeonmodem = value;
    }

    /**
     * Gets the value of the wakeonnetworkaccess property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getWakeonnetworkaccess() {
        return wakeonnetworkaccess;
    }

    /**
     * Sets the value of the wakeonnetworkaccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setWakeonnetworkaccess(EntityItemBoolType value) {
        this.wakeonnetworkaccess = value;
    }

    /**
     * Gets the value of the restartfreeze property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getRestartfreeze() {
        return restartfreeze;
    }

    /**
     * Sets the value of the restartfreeze property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setRestartfreeze(EntityItemBoolType value) {
        this.restartfreeze = value;
    }

    /**
     * Gets the value of the restartpowerfailure property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getRestartpowerfailure() {
        return restartpowerfailure;
    }

    /**
     * Sets the value of the restartpowerfailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setRestartpowerfailure(EntityItemBoolType value) {
        this.restartpowerfailure = value;
    }

    /**
     * Gets the value of the allowpowerbuttontosleepcomputer property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowpowerbuttontosleepcomputer() {
        return allowpowerbuttontosleepcomputer;
    }

    /**
     * Sets the value of the allowpowerbuttontosleepcomputer property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowpowerbuttontosleepcomputer(EntityItemBoolType value) {
        this.allowpowerbuttontosleepcomputer = value;
    }

    /**
     * Gets the value of the remotelogin property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getRemotelogin() {
        return remotelogin;
    }

    /**
     * Sets the value of the remotelogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setRemotelogin(EntityItemBoolType value) {
        this.remotelogin = value;
    }

    /**
     * Gets the value of the remoteappleevents property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getRemoteappleevents() {
        return remoteappleevents;
    }

    /**
     * Sets the value of the remoteappleevents property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setRemoteappleevents(EntityItemBoolType value) {
        this.remoteappleevents = value;
    }

    /**
     * Gets the value of the computername property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getComputername() {
        return computername;
    }

    /**
     * Sets the value of the computername property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setComputername(EntityItemStringType value) {
        this.computername = value;
    }

    /**
     * Gets the value of the localsubnetname property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getLocalsubnetname() {
        return localsubnetname;
    }

    /**
     * Sets the value of the localsubnetname property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setLocalsubnetname(EntityItemStringType value) {
        this.localsubnetname = value;
    }

    /**
     * Gets the value of the startupdisk property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getStartupdisk() {
        return startupdisk;
    }

    /**
     * Sets the value of the startupdisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setStartupdisk(EntityItemStringType value) {
        this.startupdisk = value;
    }

    /**
     * Gets the value of the waitforstartupafterpowerfailure property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getWaitforstartupafterpowerfailure() {
        return waitforstartupafterpowerfailure;
    }

    /**
     * Sets the value of the waitforstartupafterpowerfailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setWaitforstartupafterpowerfailure(EntityItemIntType value) {
        this.waitforstartupafterpowerfailure = value;
    }

    /**
     * Gets the value of the disablekeyboardwhenenclosurelockisengaged property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getDisablekeyboardwhenenclosurelockisengaged() {
        return disablekeyboardwhenenclosurelockisengaged;
    }

    /**
     * Sets the value of the disablekeyboardwhenenclosurelockisengaged property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setDisablekeyboardwhenenclosurelockisengaged(EntityItemBoolType value) {
        this.disablekeyboardwhenenclosurelockisengaged = value;
    }

    /**
     * Gets the value of the kernelbootarchitecturesetting property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getKernelbootarchitecturesetting() {
        return kernelbootarchitecturesetting;
    }

    /**
     * Sets the value of the kernelbootarchitecturesetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setKernelbootarchitecturesetting(EntityItemStringType value) {
        this.kernelbootarchitecturesetting = value;
    }

}
