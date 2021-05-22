


package org.mitre.oval.xmlschema.oval_definitions_5_windows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateIntType;
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
 *         &lt;element name="force_logoff" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="lockout_duration" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="lockout_observation_window" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="lockout_threshold" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
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
public class LockoutpolicyState
    extends StateType
{

    @XmlElement(name = "force_logoff", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType forceLogoff;
    @XmlElement(name = "lockout_duration", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType lockoutDuration;
    @XmlElement(name = "lockout_observation_window", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType lockoutObservationWindow;
    @XmlElement(name = "lockout_threshold", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType lockoutThreshold;

    /**
     * Gets the value of the forceLogoff property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getForceLogoff() {
        return forceLogoff;
    }

    /**
     * Sets the value of the forceLogoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setForceLogoff(EntityStateIntType value) {
        this.forceLogoff = value;
    }

    /**
     * Gets the value of the lockoutDuration property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getLockoutDuration() {
        return lockoutDuration;
    }

    /**
     * Sets the value of the lockoutDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setLockoutDuration(EntityStateIntType value) {
        this.lockoutDuration = value;
    }

    /**
     * Gets the value of the lockoutObservationWindow property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getLockoutObservationWindow() {
        return lockoutObservationWindow;
    }

    /**
     * Sets the value of the lockoutObservationWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setLockoutObservationWindow(EntityStateIntType value) {
        this.lockoutObservationWindow = value;
    }

    /**
     * Gets the value of the lockoutThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getLockoutThreshold() {
        return lockoutThreshold;
    }

    /**
     * Sets the value of the lockoutThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setLockoutThreshold(EntityStateIntType value) {
        this.lockoutThreshold = value;
    }

}
