


package org.mitre.oval.xmlschema.oval_definitions_5_android;

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
 *         &lt;element name="max_num_failed_user_auth" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="password_hist" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="password_quality" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#android}EntityStatePasswordQualityType" minOccurs="0"/>
 *         &lt;element name="password_min_length" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="password_min_letters" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="password_min_lower_case_letters" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="password_min_non_letters" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="password_min_numeric" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="password_min_symbols" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="password_min_upper_case_letters" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="password_expiration_timeout" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="password_visible" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="active_password_sufficient" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="current_failed_password_attempts" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="screen_lock_timeout" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="keyguard_disabled_features" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#android}EntityStateKeyguardDisabledFeaturesType" minOccurs="0"/>
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
public class PasswordState
    extends StateType
{

    @XmlElement(name = "max_num_failed_user_auth", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateIntType maxNumFailedUserAuth;
    @XmlElement(name = "password_hist", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateIntType passwordHist;
    @XmlElement(name = "password_quality", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStatePasswordQualityType passwordQuality;
    @XmlElement(name = "password_min_length", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateIntType passwordMinLength;
    @XmlElement(name = "password_min_letters", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateIntType passwordMinLetters;
    @XmlElement(name = "password_min_lower_case_letters", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateIntType passwordMinLowerCaseLetters;
    @XmlElement(name = "password_min_non_letters", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateIntType passwordMinNonLetters;
    @XmlElement(name = "password_min_numeric", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateIntType passwordMinNumeric;
    @XmlElement(name = "password_min_symbols", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateIntType passwordMinSymbols;
    @XmlElement(name = "password_min_upper_case_letters", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateIntType passwordMinUpperCaseLetters;
    @XmlElement(name = "password_expiration_timeout", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateIntType passwordExpirationTimeout;
    @XmlElement(name = "password_visible", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateBoolType passwordVisible;
    @XmlElement(name = "active_password_sufficient", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateBoolType activePasswordSufficient;
    @XmlElement(name = "current_failed_password_attempts", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateIntType currentFailedPasswordAttempts;
    @XmlElement(name = "screen_lock_timeout", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateIntType screenLockTimeout;
    @XmlElement(name = "keyguard_disabled_features", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateKeyguardDisabledFeaturesType keyguardDisabledFeatures;

    /**
     * Gets the value of the maxNumFailedUserAuth property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMaxNumFailedUserAuth() {
        return maxNumFailedUserAuth;
    }

    /**
     * Sets the value of the maxNumFailedUserAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMaxNumFailedUserAuth(EntityStateIntType value) {
        this.maxNumFailedUserAuth = value;
    }

    /**
     * Gets the value of the passwordHist property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getPasswordHist() {
        return passwordHist;
    }

    /**
     * Sets the value of the passwordHist property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setPasswordHist(EntityStateIntType value) {
        this.passwordHist = value;
    }

    /**
     * Gets the value of the passwordQuality property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStatePasswordQualityType }
     *     
     */
    public EntityStatePasswordQualityType getPasswordQuality() {
        return passwordQuality;
    }

    /**
     * Sets the value of the passwordQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStatePasswordQualityType }
     *     
     */
    public void setPasswordQuality(EntityStatePasswordQualityType value) {
        this.passwordQuality = value;
    }

    /**
     * Gets the value of the passwordMinLength property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getPasswordMinLength() {
        return passwordMinLength;
    }

    /**
     * Sets the value of the passwordMinLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setPasswordMinLength(EntityStateIntType value) {
        this.passwordMinLength = value;
    }

    /**
     * Gets the value of the passwordMinLetters property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getPasswordMinLetters() {
        return passwordMinLetters;
    }

    /**
     * Sets the value of the passwordMinLetters property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setPasswordMinLetters(EntityStateIntType value) {
        this.passwordMinLetters = value;
    }

    /**
     * Gets the value of the passwordMinLowerCaseLetters property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getPasswordMinLowerCaseLetters() {
        return passwordMinLowerCaseLetters;
    }

    /**
     * Sets the value of the passwordMinLowerCaseLetters property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setPasswordMinLowerCaseLetters(EntityStateIntType value) {
        this.passwordMinLowerCaseLetters = value;
    }

    /**
     * Gets the value of the passwordMinNonLetters property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getPasswordMinNonLetters() {
        return passwordMinNonLetters;
    }

    /**
     * Sets the value of the passwordMinNonLetters property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setPasswordMinNonLetters(EntityStateIntType value) {
        this.passwordMinNonLetters = value;
    }

    /**
     * Gets the value of the passwordMinNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getPasswordMinNumeric() {
        return passwordMinNumeric;
    }

    /**
     * Sets the value of the passwordMinNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setPasswordMinNumeric(EntityStateIntType value) {
        this.passwordMinNumeric = value;
    }

    /**
     * Gets the value of the passwordMinSymbols property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getPasswordMinSymbols() {
        return passwordMinSymbols;
    }

    /**
     * Sets the value of the passwordMinSymbols property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setPasswordMinSymbols(EntityStateIntType value) {
        this.passwordMinSymbols = value;
    }

    /**
     * Gets the value of the passwordMinUpperCaseLetters property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getPasswordMinUpperCaseLetters() {
        return passwordMinUpperCaseLetters;
    }

    /**
     * Sets the value of the passwordMinUpperCaseLetters property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setPasswordMinUpperCaseLetters(EntityStateIntType value) {
        this.passwordMinUpperCaseLetters = value;
    }

    /**
     * Gets the value of the passwordExpirationTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getPasswordExpirationTimeout() {
        return passwordExpirationTimeout;
    }

    /**
     * Sets the value of the passwordExpirationTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setPasswordExpirationTimeout(EntityStateIntType value) {
        this.passwordExpirationTimeout = value;
    }

    /**
     * Gets the value of the passwordVisible property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getPasswordVisible() {
        return passwordVisible;
    }

    /**
     * Sets the value of the passwordVisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setPasswordVisible(EntityStateBoolType value) {
        this.passwordVisible = value;
    }

    /**
     * Gets the value of the activePasswordSufficient property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getActivePasswordSufficient() {
        return activePasswordSufficient;
    }

    /**
     * Sets the value of the activePasswordSufficient property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setActivePasswordSufficient(EntityStateBoolType value) {
        this.activePasswordSufficient = value;
    }

    /**
     * Gets the value of the currentFailedPasswordAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getCurrentFailedPasswordAttempts() {
        return currentFailedPasswordAttempts;
    }

    /**
     * Sets the value of the currentFailedPasswordAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setCurrentFailedPasswordAttempts(EntityStateIntType value) {
        this.currentFailedPasswordAttempts = value;
    }

    /**
     * Gets the value of the screenLockTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getScreenLockTimeout() {
        return screenLockTimeout;
    }

    /**
     * Sets the value of the screenLockTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setScreenLockTimeout(EntityStateIntType value) {
        this.screenLockTimeout = value;
    }

    /**
     * Gets the value of the keyguardDisabledFeatures property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateKeyguardDisabledFeaturesType }
     *     
     */
    public EntityStateKeyguardDisabledFeaturesType getKeyguardDisabledFeatures() {
        return keyguardDisabledFeatures;
    }

    /**
     * Sets the value of the keyguardDisabledFeatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateKeyguardDisabledFeaturesType }
     *     
     */
    public void setKeyguardDisabledFeatures(EntityStateKeyguardDisabledFeaturesType value) {
        this.keyguardDisabledFeatures = value;
    }

}
