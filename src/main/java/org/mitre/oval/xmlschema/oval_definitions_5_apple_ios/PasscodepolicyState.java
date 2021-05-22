


package org.mitre.oval.xmlschema.oval_definitions_5_apple_ios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateBoolType;
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
 *         &lt;element name="allow_simple" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="force_pin" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="max_failed_attempts" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="max_inactivity" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="max_pin_age_in_days" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="min_complex_chars" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="min_length" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="require_alphanumeric" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="pin_history" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="max_grace_period" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
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
    "allowSimple",
    "forcePin",
    "maxFailedAttempts",
    "maxInactivity",
    "maxPinAgeInDays",
    "minComplexChars",
    "minLength",
    "requireAlphanumeric",
    "pinHistory",
    "maxGracePeriod"
})
public class PasscodepolicyState
    extends StateType
{

    @XmlElement(name = "allow_simple", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowSimple;
    @XmlElement(name = "force_pin", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType forcePin;
    @XmlElement(name = "max_failed_attempts", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateIntType maxFailedAttempts;
    @XmlElement(name = "max_inactivity", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateIntType maxInactivity;
    @XmlElement(name = "max_pin_age_in_days", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateIntType maxPinAgeInDays;
    @XmlElement(name = "min_complex_chars", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateIntType minComplexChars;
    @XmlElement(name = "min_length", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateIntType minLength;
    @XmlElement(name = "require_alphanumeric", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType requireAlphanumeric;
    @XmlElement(name = "pin_history", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateIntType pinHistory;
    @XmlElement(name = "max_grace_period", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateIntType maxGracePeriod;

    /**
     * Gets the value of the allowSimple property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowSimple() {
        return allowSimple;
    }

    /**
     * Sets the value of the allowSimple property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowSimple(EntityStateBoolType value) {
        this.allowSimple = value;
    }

    /**
     * Gets the value of the forcePin property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getForcePin() {
        return forcePin;
    }

    /**
     * Sets the value of the forcePin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setForcePin(EntityStateBoolType value) {
        this.forcePin = value;
    }

    /**
     * Gets the value of the maxFailedAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMaxFailedAttempts() {
        return maxFailedAttempts;
    }

    /**
     * Sets the value of the maxFailedAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMaxFailedAttempts(EntityStateIntType value) {
        this.maxFailedAttempts = value;
    }

    /**
     * Gets the value of the maxInactivity property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMaxInactivity() {
        return maxInactivity;
    }

    /**
     * Sets the value of the maxInactivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMaxInactivity(EntityStateIntType value) {
        this.maxInactivity = value;
    }

    /**
     * Gets the value of the maxPinAgeInDays property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMaxPinAgeInDays() {
        return maxPinAgeInDays;
    }

    /**
     * Sets the value of the maxPinAgeInDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMaxPinAgeInDays(EntityStateIntType value) {
        this.maxPinAgeInDays = value;
    }

    /**
     * Gets the value of the minComplexChars property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMinComplexChars() {
        return minComplexChars;
    }

    /**
     * Sets the value of the minComplexChars property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMinComplexChars(EntityStateIntType value) {
        this.minComplexChars = value;
    }

    /**
     * Gets the value of the minLength property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMinLength() {
        return minLength;
    }

    /**
     * Sets the value of the minLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMinLength(EntityStateIntType value) {
        this.minLength = value;
    }

    /**
     * Gets the value of the requireAlphanumeric property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getRequireAlphanumeric() {
        return requireAlphanumeric;
    }

    /**
     * Sets the value of the requireAlphanumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setRequireAlphanumeric(EntityStateBoolType value) {
        this.requireAlphanumeric = value;
    }

    /**
     * Gets the value of the pinHistory property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getPinHistory() {
        return pinHistory;
    }

    /**
     * Sets the value of the pinHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setPinHistory(EntityStateIntType value) {
        this.pinHistory = value;
    }

    /**
     * Gets the value of the maxGracePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMaxGracePeriod() {
        return maxGracePeriod;
    }

    /**
     * Sets the value of the maxGracePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMaxGracePeriod(EntityStateIntType value) {
        this.maxGracePeriod = value;
    }

}
