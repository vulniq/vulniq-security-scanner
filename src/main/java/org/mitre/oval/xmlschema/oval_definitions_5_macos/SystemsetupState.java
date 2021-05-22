


package org.mitre.oval.xmlschema.oval_definitions_5_macos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateBoolType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateIntType;
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
 *         &lt;element name="timezone" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="usingnetworktime" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="networktimeserver" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="computersleep" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="displaysleep" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="harddisksleep" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="wakeonmodem" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="wakeonnetworkaccess" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="restartfreeze" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allowpowerbuttontosleepcomputer" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="remotelogin" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="remoteappleevents" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="computername" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="startupdisk" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="waitforstartupafterpowerfailure" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="disablekeyboardwhenenclosurelockisengaged" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="kernelbootarchitecturesetting" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
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
    "allowpowerbuttontosleepcomputer",
    "remotelogin",
    "remoteappleevents",
    "computername",
    "startupdisk",
    "waitforstartupafterpowerfailure",
    "disablekeyboardwhenenclosurelockisengaged",
    "kernelbootarchitecturesetting"
})
public class SystemsetupState
    extends StateType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateStringType timezone;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateBoolType usingnetworktime;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateStringType networktimeserver;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateIntType computersleep;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateIntType displaysleep;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateIntType harddisksleep;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateBoolType wakeonmodem;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateBoolType wakeonnetworkaccess;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateBoolType restartfreeze;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateBoolType allowpowerbuttontosleepcomputer;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateBoolType remotelogin;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateBoolType remoteappleevents;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateStringType computername;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateStringType startupdisk;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateIntType waitforstartupafterpowerfailure;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateBoolType disablekeyboardwhenenclosurelockisengaged;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateStringType kernelbootarchitecturesetting;

    /**
     * Gets the value of the timezone property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getTimezone() {
        return timezone;
    }

    /**
     * Sets the value of the timezone property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setTimezone(EntityStateStringType value) {
        this.timezone = value;
    }

    /**
     * Gets the value of the usingnetworktime property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getUsingnetworktime() {
        return usingnetworktime;
    }

    /**
     * Sets the value of the usingnetworktime property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setUsingnetworktime(EntityStateBoolType value) {
        this.usingnetworktime = value;
    }

    /**
     * Gets the value of the networktimeserver property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getNetworktimeserver() {
        return networktimeserver;
    }

    /**
     * Sets the value of the networktimeserver property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setNetworktimeserver(EntityStateStringType value) {
        this.networktimeserver = value;
    }

    /**
     * Gets the value of the computersleep property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getComputersleep() {
        return computersleep;
    }

    /**
     * Sets the value of the computersleep property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setComputersleep(EntityStateIntType value) {
        this.computersleep = value;
    }

    /**
     * Gets the value of the displaysleep property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getDisplaysleep() {
        return displaysleep;
    }

    /**
     * Sets the value of the displaysleep property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setDisplaysleep(EntityStateIntType value) {
        this.displaysleep = value;
    }

    /**
     * Gets the value of the harddisksleep property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getHarddisksleep() {
        return harddisksleep;
    }

    /**
     * Sets the value of the harddisksleep property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setHarddisksleep(EntityStateIntType value) {
        this.harddisksleep = value;
    }

    /**
     * Gets the value of the wakeonmodem property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getWakeonmodem() {
        return wakeonmodem;
    }

    /**
     * Sets the value of the wakeonmodem property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setWakeonmodem(EntityStateBoolType value) {
        this.wakeonmodem = value;
    }

    /**
     * Gets the value of the wakeonnetworkaccess property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getWakeonnetworkaccess() {
        return wakeonnetworkaccess;
    }

    /**
     * Sets the value of the wakeonnetworkaccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setWakeonnetworkaccess(EntityStateBoolType value) {
        this.wakeonnetworkaccess = value;
    }

    /**
     * Gets the value of the restartfreeze property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getRestartfreeze() {
        return restartfreeze;
    }

    /**
     * Sets the value of the restartfreeze property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setRestartfreeze(EntityStateBoolType value) {
        this.restartfreeze = value;
    }

    /**
     * Gets the value of the allowpowerbuttontosleepcomputer property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowpowerbuttontosleepcomputer() {
        return allowpowerbuttontosleepcomputer;
    }

    /**
     * Sets the value of the allowpowerbuttontosleepcomputer property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowpowerbuttontosleepcomputer(EntityStateBoolType value) {
        this.allowpowerbuttontosleepcomputer = value;
    }

    /**
     * Gets the value of the remotelogin property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getRemotelogin() {
        return remotelogin;
    }

    /**
     * Sets the value of the remotelogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setRemotelogin(EntityStateBoolType value) {
        this.remotelogin = value;
    }

    /**
     * Gets the value of the remoteappleevents property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getRemoteappleevents() {
        return remoteappleevents;
    }

    /**
     * Sets the value of the remoteappleevents property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setRemoteappleevents(EntityStateBoolType value) {
        this.remoteappleevents = value;
    }

    /**
     * Gets the value of the computername property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getComputername() {
        return computername;
    }

    /**
     * Sets the value of the computername property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setComputername(EntityStateStringType value) {
        this.computername = value;
    }

    /**
     * Gets the value of the startupdisk property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getStartupdisk() {
        return startupdisk;
    }

    /**
     * Sets the value of the startupdisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setStartupdisk(EntityStateStringType value) {
        this.startupdisk = value;
    }

    /**
     * Gets the value of the waitforstartupafterpowerfailure property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getWaitforstartupafterpowerfailure() {
        return waitforstartupafterpowerfailure;
    }

    /**
     * Sets the value of the waitforstartupafterpowerfailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setWaitforstartupafterpowerfailure(EntityStateIntType value) {
        this.waitforstartupafterpowerfailure = value;
    }

    /**
     * Gets the value of the disablekeyboardwhenenclosurelockisengaged property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getDisablekeyboardwhenenclosurelockisengaged() {
        return disablekeyboardwhenenclosurelockisengaged;
    }

    /**
     * Sets the value of the disablekeyboardwhenenclosurelockisengaged property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setDisablekeyboardwhenenclosurelockisengaged(EntityStateBoolType value) {
        this.disablekeyboardwhenenclosurelockisengaged = value;
    }

    /**
     * Gets the value of the kernelbootarchitecturesetting property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getKernelbootarchitecturesetting() {
        return kernelbootarchitecturesetting;
    }

    /**
     * Sets the value of the kernelbootarchitecturesetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setKernelbootarchitecturesetting(EntityStateStringType value) {
        this.kernelbootarchitecturesetting = value;
    }

}
