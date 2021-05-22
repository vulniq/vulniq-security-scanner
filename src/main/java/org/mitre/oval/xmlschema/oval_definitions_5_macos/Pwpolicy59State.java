


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
 *         &lt;element name="target_user" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="username" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="userpass" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="directory_node" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="maxChars" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="maxFailedLoginAttempts" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="minChars" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="passwordCannotBeName" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="requiresAlpha" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="requiresNumeric" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="maxMinutesUntilChangePassword" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="minMinutesUntilChangePassword" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="requiresMixedCase" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="requiresSymbol" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="minutesUntilFailedLoginReset" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="usingHistory" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="canModifyPasswordforSelf" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="usingExpirationDate" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="usingHardExpirationDate" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="expirationDateGMT" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="hardExpireDateGMT" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="maxMinutesUntilDisabled" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="maxMinutesOfNonUse" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="newPasswordRequired" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="notGuessablePattern" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
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
    "targetUser",
    "username",
    "userpass",
    "directoryNode",
    "maxChars",
    "maxFailedLoginAttempts",
    "minChars",
    "passwordCannotBeName",
    "requiresAlpha",
    "requiresNumeric",
    "maxMinutesUntilChangePassword",
    "minMinutesUntilChangePassword",
    "requiresMixedCase",
    "requiresSymbol",
    "minutesUntilFailedLoginReset",
    "usingHistory",
    "canModifyPasswordforSelf",
    "usingExpirationDate",
    "usingHardExpirationDate",
    "expirationDateGMT",
    "hardExpireDateGMT",
    "maxMinutesUntilDisabled",
    "maxMinutesOfNonUse",
    "newPasswordRequired",
    "notGuessablePattern"
})
public class Pwpolicy59State
    extends StateType
{

    @XmlElement(name = "target_user", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateStringType targetUser;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateStringType username;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateStringType userpass;
    @XmlElement(name = "directory_node", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateStringType directoryNode;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateIntType maxChars;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateIntType maxFailedLoginAttempts;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateIntType minChars;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateBoolType passwordCannotBeName;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateBoolType requiresAlpha;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateBoolType requiresNumeric;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateIntType maxMinutesUntilChangePassword;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateIntType minMinutesUntilChangePassword;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateBoolType requiresMixedCase;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateBoolType requiresSymbol;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateIntType minutesUntilFailedLoginReset;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateIntType usingHistory;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateBoolType canModifyPasswordforSelf;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateBoolType usingExpirationDate;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateBoolType usingHardExpirationDate;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateStringType expirationDateGMT;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateStringType hardExpireDateGMT;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateIntType maxMinutesUntilDisabled;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateIntType maxMinutesOfNonUse;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateBoolType newPasswordRequired;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateBoolType notGuessablePattern;

    /**
     * Gets the value of the targetUser property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getTargetUser() {
        return targetUser;
    }

    /**
     * Sets the value of the targetUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setTargetUser(EntityStateStringType value) {
        this.targetUser = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setUsername(EntityStateStringType value) {
        this.username = value;
    }

    /**
     * Gets the value of the userpass property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getUserpass() {
        return userpass;
    }

    /**
     * Sets the value of the userpass property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setUserpass(EntityStateStringType value) {
        this.userpass = value;
    }

    /**
     * Gets the value of the directoryNode property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getDirectoryNode() {
        return directoryNode;
    }

    /**
     * Sets the value of the directoryNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setDirectoryNode(EntityStateStringType value) {
        this.directoryNode = value;
    }

    /**
     * Gets the value of the maxChars property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMaxChars() {
        return maxChars;
    }

    /**
     * Sets the value of the maxChars property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMaxChars(EntityStateIntType value) {
        this.maxChars = value;
    }

    /**
     * Gets the value of the maxFailedLoginAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMaxFailedLoginAttempts() {
        return maxFailedLoginAttempts;
    }

    /**
     * Sets the value of the maxFailedLoginAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMaxFailedLoginAttempts(EntityStateIntType value) {
        this.maxFailedLoginAttempts = value;
    }

    /**
     * Gets the value of the minChars property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMinChars() {
        return minChars;
    }

    /**
     * Sets the value of the minChars property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMinChars(EntityStateIntType value) {
        this.minChars = value;
    }

    /**
     * Gets the value of the passwordCannotBeName property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getPasswordCannotBeName() {
        return passwordCannotBeName;
    }

    /**
     * Sets the value of the passwordCannotBeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setPasswordCannotBeName(EntityStateBoolType value) {
        this.passwordCannotBeName = value;
    }

    /**
     * Gets the value of the requiresAlpha property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getRequiresAlpha() {
        return requiresAlpha;
    }

    /**
     * Sets the value of the requiresAlpha property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setRequiresAlpha(EntityStateBoolType value) {
        this.requiresAlpha = value;
    }

    /**
     * Gets the value of the requiresNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getRequiresNumeric() {
        return requiresNumeric;
    }

    /**
     * Sets the value of the requiresNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setRequiresNumeric(EntityStateBoolType value) {
        this.requiresNumeric = value;
    }

    /**
     * Gets the value of the maxMinutesUntilChangePassword property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMaxMinutesUntilChangePassword() {
        return maxMinutesUntilChangePassword;
    }

    /**
     * Sets the value of the maxMinutesUntilChangePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMaxMinutesUntilChangePassword(EntityStateIntType value) {
        this.maxMinutesUntilChangePassword = value;
    }

    /**
     * Gets the value of the minMinutesUntilChangePassword property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMinMinutesUntilChangePassword() {
        return minMinutesUntilChangePassword;
    }

    /**
     * Sets the value of the minMinutesUntilChangePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMinMinutesUntilChangePassword(EntityStateIntType value) {
        this.minMinutesUntilChangePassword = value;
    }

    /**
     * Gets the value of the requiresMixedCase property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getRequiresMixedCase() {
        return requiresMixedCase;
    }

    /**
     * Sets the value of the requiresMixedCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setRequiresMixedCase(EntityStateBoolType value) {
        this.requiresMixedCase = value;
    }

    /**
     * Gets the value of the requiresSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getRequiresSymbol() {
        return requiresSymbol;
    }

    /**
     * Sets the value of the requiresSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setRequiresSymbol(EntityStateBoolType value) {
        this.requiresSymbol = value;
    }

    /**
     * Gets the value of the minutesUntilFailedLoginReset property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMinutesUntilFailedLoginReset() {
        return minutesUntilFailedLoginReset;
    }

    /**
     * Sets the value of the minutesUntilFailedLoginReset property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMinutesUntilFailedLoginReset(EntityStateIntType value) {
        this.minutesUntilFailedLoginReset = value;
    }

    /**
     * Gets the value of the usingHistory property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getUsingHistory() {
        return usingHistory;
    }

    /**
     * Sets the value of the usingHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setUsingHistory(EntityStateIntType value) {
        this.usingHistory = value;
    }

    /**
     * Gets the value of the canModifyPasswordforSelf property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getCanModifyPasswordforSelf() {
        return canModifyPasswordforSelf;
    }

    /**
     * Sets the value of the canModifyPasswordforSelf property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setCanModifyPasswordforSelf(EntityStateBoolType value) {
        this.canModifyPasswordforSelf = value;
    }

    /**
     * Gets the value of the usingExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getUsingExpirationDate() {
        return usingExpirationDate;
    }

    /**
     * Sets the value of the usingExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setUsingExpirationDate(EntityStateBoolType value) {
        this.usingExpirationDate = value;
    }

    /**
     * Gets the value of the usingHardExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getUsingHardExpirationDate() {
        return usingHardExpirationDate;
    }

    /**
     * Sets the value of the usingHardExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setUsingHardExpirationDate(EntityStateBoolType value) {
        this.usingHardExpirationDate = value;
    }

    /**
     * Gets the value of the expirationDateGMT property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getExpirationDateGMT() {
        return expirationDateGMT;
    }

    /**
     * Sets the value of the expirationDateGMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setExpirationDateGMT(EntityStateStringType value) {
        this.expirationDateGMT = value;
    }

    /**
     * Gets the value of the hardExpireDateGMT property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getHardExpireDateGMT() {
        return hardExpireDateGMT;
    }

    /**
     * Sets the value of the hardExpireDateGMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setHardExpireDateGMT(EntityStateStringType value) {
        this.hardExpireDateGMT = value;
    }

    /**
     * Gets the value of the maxMinutesUntilDisabled property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMaxMinutesUntilDisabled() {
        return maxMinutesUntilDisabled;
    }

    /**
     * Sets the value of the maxMinutesUntilDisabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMaxMinutesUntilDisabled(EntityStateIntType value) {
        this.maxMinutesUntilDisabled = value;
    }

    /**
     * Gets the value of the maxMinutesOfNonUse property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMaxMinutesOfNonUse() {
        return maxMinutesOfNonUse;
    }

    /**
     * Sets the value of the maxMinutesOfNonUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMaxMinutesOfNonUse(EntityStateIntType value) {
        this.maxMinutesOfNonUse = value;
    }

    /**
     * Gets the value of the newPasswordRequired property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getNewPasswordRequired() {
        return newPasswordRequired;
    }

    /**
     * Sets the value of the newPasswordRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setNewPasswordRequired(EntityStateBoolType value) {
        this.newPasswordRequired = value;
    }

    /**
     * Gets the value of the notGuessablePattern property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getNotGuessablePattern() {
        return notGuessablePattern;
    }

    /**
     * Sets the value of the notGuessablePattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setNotGuessablePattern(EntityStateBoolType value) {
        this.notGuessablePattern = value;
    }

}
