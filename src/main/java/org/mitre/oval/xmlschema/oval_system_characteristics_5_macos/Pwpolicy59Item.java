


package org.mitre.oval.xmlschema.oval_system_characteristics_5_macos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="target_user" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="username" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="userpass" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="directory_node" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="maxChars" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="maxFailedLoginAttempts" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="minChars" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="passwordCannotBeName" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="requiresAlpha" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="requiresNumeric" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="maxMinutesUntilChangePassword" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="minMinutesUntilChangePassword" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="requiresMixedCase" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="requiresSymbol" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="minutesUntilFailedLoginReset" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="usingHistory" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="canModifyPasswordforSelf" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="usingExpirationDate" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="usingHardExpirationDate" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="expirationDateGMT" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="hardExpireDateGMT" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="maxMinutesUntilDisabled" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="maxMinutesOfNonUse" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="newPasswordRequired" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="notGuessablePattern" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
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
public class Pwpolicy59Item
    extends ItemType
{

    @XmlElementRef(name = "target_user", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityItemStringType> targetUser;
    @XmlElementRef(name = "username", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityItemStringType> username;
    @XmlElementRef(name = "userpass", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityItemStringType> userpass;
    @XmlElementRef(name = "directory_node", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityItemStringType> directoryNode;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemIntType maxChars;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemIntType maxFailedLoginAttempts;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemIntType minChars;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemBoolType passwordCannotBeName;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemBoolType requiresAlpha;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemBoolType requiresNumeric;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemIntType maxMinutesUntilChangePassword;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemIntType minMinutesUntilChangePassword;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemBoolType requiresMixedCase;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemBoolType requiresSymbol;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemIntType minutesUntilFailedLoginReset;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemIntType usingHistory;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemBoolType canModifyPasswordforSelf;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemBoolType usingExpirationDate;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemBoolType usingHardExpirationDate;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemStringType expirationDateGMT;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemStringType hardExpireDateGMT;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemIntType maxMinutesUntilDisabled;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemIntType maxMinutesOfNonUse;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemBoolType newPasswordRequired;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemBoolType notGuessablePattern;

    /**
     * Gets the value of the targetUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}
     *     
     */
    public JAXBElement<EntityItemStringType> getTargetUser() {
        return targetUser;
    }

    /**
     * Sets the value of the targetUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}
     *     
     */
    public void setTargetUser(JAXBElement<EntityItemStringType> value) {
        this.targetUser = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}
     *     
     */
    public JAXBElement<EntityItemStringType> getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}
     *     
     */
    public void setUsername(JAXBElement<EntityItemStringType> value) {
        this.username = value;
    }

    /**
     * Gets the value of the userpass property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}
     *     
     */
    public JAXBElement<EntityItemStringType> getUserpass() {
        return userpass;
    }

    /**
     * Sets the value of the userpass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}
     *     
     */
    public void setUserpass(JAXBElement<EntityItemStringType> value) {
        this.userpass = value;
    }

    /**
     * Gets the value of the directoryNode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}
     *     
     */
    public JAXBElement<EntityItemStringType> getDirectoryNode() {
        return directoryNode;
    }

    /**
     * Sets the value of the directoryNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}
     *     
     */
    public void setDirectoryNode(JAXBElement<EntityItemStringType> value) {
        this.directoryNode = value;
    }

    /**
     * Gets the value of the maxChars property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMaxChars() {
        return maxChars;
    }

    /**
     * Sets the value of the maxChars property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMaxChars(EntityItemIntType value) {
        this.maxChars = value;
    }

    /**
     * Gets the value of the maxFailedLoginAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMaxFailedLoginAttempts() {
        return maxFailedLoginAttempts;
    }

    /**
     * Sets the value of the maxFailedLoginAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMaxFailedLoginAttempts(EntityItemIntType value) {
        this.maxFailedLoginAttempts = value;
    }

    /**
     * Gets the value of the minChars property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMinChars() {
        return minChars;
    }

    /**
     * Sets the value of the minChars property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMinChars(EntityItemIntType value) {
        this.minChars = value;
    }

    /**
     * Gets the value of the passwordCannotBeName property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getPasswordCannotBeName() {
        return passwordCannotBeName;
    }

    /**
     * Sets the value of the passwordCannotBeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setPasswordCannotBeName(EntityItemBoolType value) {
        this.passwordCannotBeName = value;
    }

    /**
     * Gets the value of the requiresAlpha property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getRequiresAlpha() {
        return requiresAlpha;
    }

    /**
     * Sets the value of the requiresAlpha property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setRequiresAlpha(EntityItemBoolType value) {
        this.requiresAlpha = value;
    }

    /**
     * Gets the value of the requiresNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getRequiresNumeric() {
        return requiresNumeric;
    }

    /**
     * Sets the value of the requiresNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setRequiresNumeric(EntityItemBoolType value) {
        this.requiresNumeric = value;
    }

    /**
     * Gets the value of the maxMinutesUntilChangePassword property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMaxMinutesUntilChangePassword() {
        return maxMinutesUntilChangePassword;
    }

    /**
     * Sets the value of the maxMinutesUntilChangePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMaxMinutesUntilChangePassword(EntityItemIntType value) {
        this.maxMinutesUntilChangePassword = value;
    }

    /**
     * Gets the value of the minMinutesUntilChangePassword property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMinMinutesUntilChangePassword() {
        return minMinutesUntilChangePassword;
    }

    /**
     * Sets the value of the minMinutesUntilChangePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMinMinutesUntilChangePassword(EntityItemIntType value) {
        this.minMinutesUntilChangePassword = value;
    }

    /**
     * Gets the value of the requiresMixedCase property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getRequiresMixedCase() {
        return requiresMixedCase;
    }

    /**
     * Sets the value of the requiresMixedCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setRequiresMixedCase(EntityItemBoolType value) {
        this.requiresMixedCase = value;
    }

    /**
     * Gets the value of the requiresSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getRequiresSymbol() {
        return requiresSymbol;
    }

    /**
     * Sets the value of the requiresSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setRequiresSymbol(EntityItemBoolType value) {
        this.requiresSymbol = value;
    }

    /**
     * Gets the value of the minutesUntilFailedLoginReset property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMinutesUntilFailedLoginReset() {
        return minutesUntilFailedLoginReset;
    }

    /**
     * Sets the value of the minutesUntilFailedLoginReset property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMinutesUntilFailedLoginReset(EntityItemIntType value) {
        this.minutesUntilFailedLoginReset = value;
    }

    /**
     * Gets the value of the usingHistory property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getUsingHistory() {
        return usingHistory;
    }

    /**
     * Sets the value of the usingHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setUsingHistory(EntityItemIntType value) {
        this.usingHistory = value;
    }

    /**
     * Gets the value of the canModifyPasswordforSelf property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getCanModifyPasswordforSelf() {
        return canModifyPasswordforSelf;
    }

    /**
     * Sets the value of the canModifyPasswordforSelf property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setCanModifyPasswordforSelf(EntityItemBoolType value) {
        this.canModifyPasswordforSelf = value;
    }

    /**
     * Gets the value of the usingExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getUsingExpirationDate() {
        return usingExpirationDate;
    }

    /**
     * Sets the value of the usingExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setUsingExpirationDate(EntityItemBoolType value) {
        this.usingExpirationDate = value;
    }

    /**
     * Gets the value of the usingHardExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getUsingHardExpirationDate() {
        return usingHardExpirationDate;
    }

    /**
     * Sets the value of the usingHardExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setUsingHardExpirationDate(EntityItemBoolType value) {
        this.usingHardExpirationDate = value;
    }

    /**
     * Gets the value of the expirationDateGMT property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getExpirationDateGMT() {
        return expirationDateGMT;
    }

    /**
     * Sets the value of the expirationDateGMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setExpirationDateGMT(EntityItemStringType value) {
        this.expirationDateGMT = value;
    }

    /**
     * Gets the value of the hardExpireDateGMT property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getHardExpireDateGMT() {
        return hardExpireDateGMT;
    }

    /**
     * Sets the value of the hardExpireDateGMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setHardExpireDateGMT(EntityItemStringType value) {
        this.hardExpireDateGMT = value;
    }

    /**
     * Gets the value of the maxMinutesUntilDisabled property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMaxMinutesUntilDisabled() {
        return maxMinutesUntilDisabled;
    }

    /**
     * Sets the value of the maxMinutesUntilDisabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMaxMinutesUntilDisabled(EntityItemIntType value) {
        this.maxMinutesUntilDisabled = value;
    }

    /**
     * Gets the value of the maxMinutesOfNonUse property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMaxMinutesOfNonUse() {
        return maxMinutesOfNonUse;
    }

    /**
     * Sets the value of the maxMinutesOfNonUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMaxMinutesOfNonUse(EntityItemIntType value) {
        this.maxMinutesOfNonUse = value;
    }

    /**
     * Gets the value of the newPasswordRequired property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getNewPasswordRequired() {
        return newPasswordRequired;
    }

    /**
     * Sets the value of the newPasswordRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setNewPasswordRequired(EntityItemBoolType value) {
        this.newPasswordRequired = value;
    }

    /**
     * Gets the value of the notGuessablePattern property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getNotGuessablePattern() {
        return notGuessablePattern;
    }

    /**
     * Sets the value of the notGuessablePattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setNotGuessablePattern(EntityItemBoolType value) {
        this.notGuessablePattern = value;
    }

}
