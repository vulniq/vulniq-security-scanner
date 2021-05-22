


package org.mitre.oval.xmlschema.oval_system_characteristics_5_apple_ios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemBoolType;
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
 *         &lt;element name="allow_simple" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="force_pin" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="max_failed_attempts" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="max_inactivity" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="max_pin_age_in_days" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="min_complex_chars" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="min_length" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="require_alphanumeric" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="pin_history" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="max_grace_period" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
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
public class PasscodepolicyItem
    extends ItemType
{

    @XmlElement(name = "allow_simple", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType allowSimple;
    @XmlElement(name = "force_pin", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType forcePin;
    @XmlElement(name = "max_failed_attempts", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemIntType maxFailedAttempts;
    @XmlElement(name = "max_inactivity", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemIntType maxInactivity;
    @XmlElement(name = "max_pin_age_in_days", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemIntType maxPinAgeInDays;
    @XmlElement(name = "min_complex_chars", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemIntType minComplexChars;
    @XmlElement(name = "min_length", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemIntType minLength;
    @XmlElement(name = "require_alphanumeric", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemBoolType requireAlphanumeric;
    @XmlElement(name = "pin_history", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemIntType pinHistory;
    @XmlElement(name = "max_grace_period", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#apple_ios")
    protected EntityItemIntType maxGracePeriod;

    /**
     * Gets the value of the allowSimple property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowSimple() {
        return allowSimple;
    }

    /**
     * Sets the value of the allowSimple property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowSimple(EntityItemBoolType value) {
        this.allowSimple = value;
    }

    /**
     * Gets the value of the forcePin property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getForcePin() {
        return forcePin;
    }

    /**
     * Sets the value of the forcePin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setForcePin(EntityItemBoolType value) {
        this.forcePin = value;
    }

    /**
     * Gets the value of the maxFailedAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMaxFailedAttempts() {
        return maxFailedAttempts;
    }

    /**
     * Sets the value of the maxFailedAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMaxFailedAttempts(EntityItemIntType value) {
        this.maxFailedAttempts = value;
    }

    /**
     * Gets the value of the maxInactivity property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMaxInactivity() {
        return maxInactivity;
    }

    /**
     * Sets the value of the maxInactivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMaxInactivity(EntityItemIntType value) {
        this.maxInactivity = value;
    }

    /**
     * Gets the value of the maxPinAgeInDays property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMaxPinAgeInDays() {
        return maxPinAgeInDays;
    }

    /**
     * Sets the value of the maxPinAgeInDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMaxPinAgeInDays(EntityItemIntType value) {
        this.maxPinAgeInDays = value;
    }

    /**
     * Gets the value of the minComplexChars property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMinComplexChars() {
        return minComplexChars;
    }

    /**
     * Sets the value of the minComplexChars property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMinComplexChars(EntityItemIntType value) {
        this.minComplexChars = value;
    }

    /**
     * Gets the value of the minLength property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMinLength() {
        return minLength;
    }

    /**
     * Sets the value of the minLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMinLength(EntityItemIntType value) {
        this.minLength = value;
    }

    /**
     * Gets the value of the requireAlphanumeric property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getRequireAlphanumeric() {
        return requireAlphanumeric;
    }

    /**
     * Sets the value of the requireAlphanumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setRequireAlphanumeric(EntityItemBoolType value) {
        this.requireAlphanumeric = value;
    }

    /**
     * Gets the value of the pinHistory property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getPinHistory() {
        return pinHistory;
    }

    /**
     * Sets the value of the pinHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setPinHistory(EntityItemIntType value) {
        this.pinHistory = value;
    }

    /**
     * Gets the value of the maxGracePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMaxGracePeriod() {
        return maxGracePeriod;
    }

    /**
     * Sets the value of the maxGracePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMaxGracePeriod(EntityItemIntType value) {
        this.maxGracePeriod = value;
    }

}
