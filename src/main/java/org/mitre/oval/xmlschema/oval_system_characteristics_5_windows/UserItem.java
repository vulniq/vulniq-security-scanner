


package org.mitre.oval.xmlschema.oval_system_characteristics_5_windows;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="user" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="enabled" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="group" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="last_logon" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="full_name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="password_age_days" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="lockout" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="passwd_notreqd" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="dont_expire_passwd" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="encrypted_text_password_allowed" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="not_delegated" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="use_des_key_only" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="dont_require_preauth" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="password_expired" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="smartcard_required" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="trusted_for_delegation" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="trusted_to_authenticate_for_delegation" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
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
    "user",
    "enabled",
    "group",
    "lastLogon",
    "fullName",
    "comment",
    "passwordAgeDays",
    "lockout",
    "passwdNotreqd",
    "dontExpirePasswd",
    "encryptedTextPasswordAllowed",
    "notDelegated",
    "useDesKeyOnly",
    "dontRequirePreauth",
    "passwordExpired",
    "smartcardRequired",
    "trustedForDelegation",
    "trustedToAuthenticateForDelegation"
})
public class UserItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemStringType user;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType enabled;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected List<EntityItemStringType> group;
    @XmlElement(name = "last_logon", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType lastLogon;
    @XmlElement(name = "full_name", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemStringType fullName;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemStringType comment;
    @XmlElement(name = "password_age_days", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType passwordAgeDays;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType lockout;
    @XmlElement(name = "passwd_notreqd", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType passwdNotreqd;
    @XmlElement(name = "dont_expire_passwd", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType dontExpirePasswd;
    @XmlElement(name = "encrypted_text_password_allowed", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType encryptedTextPasswordAllowed;
    @XmlElement(name = "not_delegated", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType notDelegated;
    @XmlElement(name = "use_des_key_only", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType useDesKeyOnly;
    @XmlElement(name = "dont_require_preauth", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType dontRequirePreauth;
    @XmlElement(name = "password_expired", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType passwordExpired;
    @XmlElement(name = "smartcard_required", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType smartcardRequired;
    @XmlElement(name = "trusted_for_delegation", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType trustedForDelegation;
    @XmlElement(name = "trusted_to_authenticate_for_delegation", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType trustedToAuthenticateForDelegation;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setUser(EntityItemStringType value) {
        this.user = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setEnabled(EntityItemBoolType value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the group property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemStringType }
     * 
     * 
     */
    public List<EntityItemStringType> getGroup() {
        if (group == null) {
            group = new ArrayList<EntityItemStringType>();
        }
        return this.group;
    }

    /**
     * Gets the value of the lastLogon property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getLastLogon() {
        return lastLogon;
    }

    /**
     * Sets the value of the lastLogon property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setLastLogon(EntityItemIntType value) {
        this.lastLogon = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setFullName(EntityItemStringType value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setComment(EntityItemStringType value) {
        this.comment = value;
    }

    /**
     * Gets the value of the passwordAgeDays property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getPasswordAgeDays() {
        return passwordAgeDays;
    }

    /**
     * Sets the value of the passwordAgeDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setPasswordAgeDays(EntityItemIntType value) {
        this.passwordAgeDays = value;
    }

    /**
     * Gets the value of the lockout property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getLockout() {
        return lockout;
    }

    /**
     * Sets the value of the lockout property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setLockout(EntityItemBoolType value) {
        this.lockout = value;
    }

    /**
     * Gets the value of the passwdNotreqd property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getPasswdNotreqd() {
        return passwdNotreqd;
    }

    /**
     * Sets the value of the passwdNotreqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setPasswdNotreqd(EntityItemBoolType value) {
        this.passwdNotreqd = value;
    }

    /**
     * Gets the value of the dontExpirePasswd property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getDontExpirePasswd() {
        return dontExpirePasswd;
    }

    /**
     * Sets the value of the dontExpirePasswd property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setDontExpirePasswd(EntityItemBoolType value) {
        this.dontExpirePasswd = value;
    }

    /**
     * Gets the value of the encryptedTextPasswordAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getEncryptedTextPasswordAllowed() {
        return encryptedTextPasswordAllowed;
    }

    /**
     * Sets the value of the encryptedTextPasswordAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setEncryptedTextPasswordAllowed(EntityItemBoolType value) {
        this.encryptedTextPasswordAllowed = value;
    }

    /**
     * Gets the value of the notDelegated property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getNotDelegated() {
        return notDelegated;
    }

    /**
     * Sets the value of the notDelegated property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setNotDelegated(EntityItemBoolType value) {
        this.notDelegated = value;
    }

    /**
     * Gets the value of the useDesKeyOnly property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getUseDesKeyOnly() {
        return useDesKeyOnly;
    }

    /**
     * Sets the value of the useDesKeyOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setUseDesKeyOnly(EntityItemBoolType value) {
        this.useDesKeyOnly = value;
    }

    /**
     * Gets the value of the dontRequirePreauth property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getDontRequirePreauth() {
        return dontRequirePreauth;
    }

    /**
     * Sets the value of the dontRequirePreauth property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setDontRequirePreauth(EntityItemBoolType value) {
        this.dontRequirePreauth = value;
    }

    /**
     * Gets the value of the passwordExpired property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getPasswordExpired() {
        return passwordExpired;
    }

    /**
     * Sets the value of the passwordExpired property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setPasswordExpired(EntityItemBoolType value) {
        this.passwordExpired = value;
    }

    /**
     * Gets the value of the smartcardRequired property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSmartcardRequired() {
        return smartcardRequired;
    }

    /**
     * Sets the value of the smartcardRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSmartcardRequired(EntityItemBoolType value) {
        this.smartcardRequired = value;
    }

    /**
     * Gets the value of the trustedForDelegation property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getTrustedForDelegation() {
        return trustedForDelegation;
    }

    /**
     * Sets the value of the trustedForDelegation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setTrustedForDelegation(EntityItemBoolType value) {
        this.trustedForDelegation = value;
    }

    /**
     * Gets the value of the trustedToAuthenticateForDelegation property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getTrustedToAuthenticateForDelegation() {
        return trustedToAuthenticateForDelegation;
    }

    /**
     * Sets the value of the trustedToAuthenticateForDelegation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setTrustedToAuthenticateForDelegation(EntityItemBoolType value) {
        this.trustedToAuthenticateForDelegation = value;
    }

}
