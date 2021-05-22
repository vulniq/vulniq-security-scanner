


package org.mitre.oval.xmlschema.oval_system_characteristics_5_android;

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
 *         &lt;element name="max_num_failed_user_auth" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="password_hist" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="password_quality" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android}EntityItemPasswordQualityType" minOccurs="0"/>
 *         &lt;element name="password_min_length" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="password_min_letters" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="password_min_lower_case_letters" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="password_min_non_letters" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="password_min_numeric" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="password_min_symbols" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="password_min_upper_case_letters" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="password_expiration_timeout" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="password_visible" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="active_password_sufficient" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="current_failed_password_attempts" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="screen_lock_timeout" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="keyguard_disabled_features" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android}EntityItemKeyguardDisabledFeaturesType" minOccurs="0"/>
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
    "maxNumFailedUserAuth",
    "passwordHist",
    "passwordQuality",
    "passwordMinLength",
    "passwordMinLetters",
    "passwordMinLowerCaseLetters",
    "passwordMinNonLetters",
    "passwordMinNumeric",
    "passwordMinSymbols",
    "passwordMinUpperCaseLetters",
    "passwordExpirationTimeout",
    "passwordVisible",
    "activePasswordSufficient",
    "currentFailedPasswordAttempts",
    "screenLockTimeout",
    "keyguardDisabledFeatures"
})
public class PasswordItem
    extends ItemType
{

    @XmlElement(name = "max_num_failed_user_auth", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected EntityItemIntType maxNumFailedUserAuth;
    @XmlElement(name = "password_hist", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected EntityItemIntType passwordHist;
    @XmlElement(name = "password_quality", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected EntityItemPasswordQualityType passwordQuality;
    @XmlElement(name = "password_min_length", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected EntityItemIntType passwordMinLength;
    @XmlElement(name = "password_min_letters", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected EntityItemIntType passwordMinLetters;
    @XmlElement(name = "password_min_lower_case_letters", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected EntityItemIntType passwordMinLowerCaseLetters;
    @XmlElement(name = "password_min_non_letters", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected EntityItemIntType passwordMinNonLetters;
    @XmlElement(name = "password_min_numeric", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected EntityItemIntType passwordMinNumeric;
    @XmlElement(name = "password_min_symbols", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected EntityItemIntType passwordMinSymbols;
    @XmlElement(name = "password_min_upper_case_letters", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected EntityItemIntType passwordMinUpperCaseLetters;
    @XmlElement(name = "password_expiration_timeout", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected EntityItemIntType passwordExpirationTimeout;
    @XmlElement(name = "password_visible", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected EntityItemBoolType passwordVisible;
    @XmlElement(name = "active_password_sufficient", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected EntityItemBoolType activePasswordSufficient;
    @XmlElement(name = "current_failed_password_attempts", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected EntityItemIntType currentFailedPasswordAttempts;
    @XmlElement(name = "screen_lock_timeout", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected EntityItemIntType screenLockTimeout;
    @XmlElement(name = "keyguard_disabled_features", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected EntityItemKeyguardDisabledFeaturesType keyguardDisabledFeatures;

    /**
     * Gets the value of the maxNumFailedUserAuth property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMaxNumFailedUserAuth() {
        return maxNumFailedUserAuth;
    }

    /**
     * Sets the value of the maxNumFailedUserAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMaxNumFailedUserAuth(EntityItemIntType value) {
        this.maxNumFailedUserAuth = value;
    }

    /**
     * Gets the value of the passwordHist property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getPasswordHist() {
        return passwordHist;
    }

    /**
     * Sets the value of the passwordHist property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setPasswordHist(EntityItemIntType value) {
        this.passwordHist = value;
    }

    /**
     * Gets the value of the passwordQuality property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemPasswordQualityType }
     *     
     */
    public EntityItemPasswordQualityType getPasswordQuality() {
        return passwordQuality;
    }

    /**
     * Sets the value of the passwordQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemPasswordQualityType }
     *     
     */
    public void setPasswordQuality(EntityItemPasswordQualityType value) {
        this.passwordQuality = value;
    }

    /**
     * Gets the value of the passwordMinLength property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getPasswordMinLength() {
        return passwordMinLength;
    }

    /**
     * Sets the value of the passwordMinLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setPasswordMinLength(EntityItemIntType value) {
        this.passwordMinLength = value;
    }

    /**
     * Gets the value of the passwordMinLetters property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getPasswordMinLetters() {
        return passwordMinLetters;
    }

    /**
     * Sets the value of the passwordMinLetters property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setPasswordMinLetters(EntityItemIntType value) {
        this.passwordMinLetters = value;
    }

    /**
     * Gets the value of the passwordMinLowerCaseLetters property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getPasswordMinLowerCaseLetters() {
        return passwordMinLowerCaseLetters;
    }

    /**
     * Sets the value of the passwordMinLowerCaseLetters property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setPasswordMinLowerCaseLetters(EntityItemIntType value) {
        this.passwordMinLowerCaseLetters = value;
    }

    /**
     * Gets the value of the passwordMinNonLetters property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getPasswordMinNonLetters() {
        return passwordMinNonLetters;
    }

    /**
     * Sets the value of the passwordMinNonLetters property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setPasswordMinNonLetters(EntityItemIntType value) {
        this.passwordMinNonLetters = value;
    }

    /**
     * Gets the value of the passwordMinNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getPasswordMinNumeric() {
        return passwordMinNumeric;
    }

    /**
     * Sets the value of the passwordMinNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setPasswordMinNumeric(EntityItemIntType value) {
        this.passwordMinNumeric = value;
    }

    /**
     * Gets the value of the passwordMinSymbols property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getPasswordMinSymbols() {
        return passwordMinSymbols;
    }

    /**
     * Sets the value of the passwordMinSymbols property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setPasswordMinSymbols(EntityItemIntType value) {
        this.passwordMinSymbols = value;
    }

    /**
     * Gets the value of the passwordMinUpperCaseLetters property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getPasswordMinUpperCaseLetters() {
        return passwordMinUpperCaseLetters;
    }

    /**
     * Sets the value of the passwordMinUpperCaseLetters property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setPasswordMinUpperCaseLetters(EntityItemIntType value) {
        this.passwordMinUpperCaseLetters = value;
    }

    /**
     * Gets the value of the passwordExpirationTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getPasswordExpirationTimeout() {
        return passwordExpirationTimeout;
    }

    /**
     * Sets the value of the passwordExpirationTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setPasswordExpirationTimeout(EntityItemIntType value) {
        this.passwordExpirationTimeout = value;
    }

    /**
     * Gets the value of the passwordVisible property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getPasswordVisible() {
        return passwordVisible;
    }

    /**
     * Sets the value of the passwordVisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setPasswordVisible(EntityItemBoolType value) {
        this.passwordVisible = value;
    }

    /**
     * Gets the value of the activePasswordSufficient property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getActivePasswordSufficient() {
        return activePasswordSufficient;
    }

    /**
     * Sets the value of the activePasswordSufficient property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setActivePasswordSufficient(EntityItemBoolType value) {
        this.activePasswordSufficient = value;
    }

    /**
     * Gets the value of the currentFailedPasswordAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getCurrentFailedPasswordAttempts() {
        return currentFailedPasswordAttempts;
    }

    /**
     * Sets the value of the currentFailedPasswordAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setCurrentFailedPasswordAttempts(EntityItemIntType value) {
        this.currentFailedPasswordAttempts = value;
    }

    /**
     * Gets the value of the screenLockTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getScreenLockTimeout() {
        return screenLockTimeout;
    }

    /**
     * Sets the value of the screenLockTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setScreenLockTimeout(EntityItemIntType value) {
        this.screenLockTimeout = value;
    }

    /**
     * Gets the value of the keyguardDisabledFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemKeyguardDisabledFeaturesType }
     *     
     */
    public EntityItemKeyguardDisabledFeaturesType getKeyguardDisabledFeatures() {
        return keyguardDisabledFeatures;
    }

    /**
     * Sets the value of the keyguardDisabledFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemKeyguardDisabledFeaturesType }
     *     
     */
    public void setKeyguardDisabledFeatures(EntityItemKeyguardDisabledFeaturesType value) {
        this.keyguardDisabledFeatures = value;
    }

}
