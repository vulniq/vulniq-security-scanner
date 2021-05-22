


package org.mitre.oval.xmlschema.oval_system_characteristics_5_windows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemIntType;
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
 *         &lt;element name="force_logoff" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="lockout_duration" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="lockout_observation_window" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="lockout_threshold" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
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
    "forceLogoff",
    "lockoutDuration",
    "lockoutObservationWindow",
    "lockoutThreshold"
})
public class LockoutpolicyItem
    extends ItemType
{

    @XmlElement(name = "force_logoff", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType forceLogoff;
    @XmlElement(name = "lockout_duration", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType lockoutDuration;
    @XmlElement(name = "lockout_observation_window", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType lockoutObservationWindow;
    @XmlElement(name = "lockout_threshold", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType lockoutThreshold;

    /**
     * Gets the value of the forceLogoff property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getForceLogoff() {
        return forceLogoff;
    }

    /**
     * Sets the value of the forceLogoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setForceLogoff(EntityItemIntType value) {
        this.forceLogoff = value;
    }

    /**
     * Gets the value of the lockoutDuration property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getLockoutDuration() {
        return lockoutDuration;
    }

    /**
     * Sets the value of the lockoutDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setLockoutDuration(EntityItemIntType value) {
        this.lockoutDuration = value;
    }

    /**
     * Gets the value of the lockoutObservationWindow property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getLockoutObservationWindow() {
        return lockoutObservationWindow;
    }

    /**
     * Sets the value of the lockoutObservationWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setLockoutObservationWindow(EntityItemIntType value) {
        this.lockoutObservationWindow = value;
    }

    /**
     * Gets the value of the lockoutThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getLockoutThreshold() {
        return lockoutThreshold;
    }

    /**
     * Sets the value of the lockoutThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setLockoutThreshold(EntityItemIntType value) {
        this.lockoutThreshold = value;
    }

}
