


package org.mitre.oval.xmlschema.oval_system_characteristics_5_windows;

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
 *         &lt;element name="max_passwd_age" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="min_passwd_age" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="min_passwd_len" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="password_hist_len" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="password_complexity" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="reversible_encryption" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="anonymous_name_lookup" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
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
    "maxPasswdAge",
    "minPasswdAge",
    "minPasswdLen",
    "passwordHistLen",
    "passwordComplexity",
    "reversibleEncryption",
    "anonymousNameLookup"
})
public class PasswordpolicyItem
    extends ItemType
{

    @XmlElement(name = "max_passwd_age", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType maxPasswdAge;
    @XmlElement(name = "min_passwd_age", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType minPasswdAge;
    @XmlElement(name = "min_passwd_len", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType minPasswdLen;
    @XmlElement(name = "password_hist_len", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemIntType passwordHistLen;
    @XmlElement(name = "password_complexity", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType passwordComplexity;
    @XmlElement(name = "reversible_encryption", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType reversibleEncryption;
    @XmlElement(name = "anonymous_name_lookup", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType anonymousNameLookup;

    /**
     * Gets the value of the maxPasswdAge property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMaxPasswdAge() {
        return maxPasswdAge;
    }

    /**
     * Sets the value of the maxPasswdAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMaxPasswdAge(EntityItemIntType value) {
        this.maxPasswdAge = value;
    }

    /**
     * Gets the value of the minPasswdAge property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMinPasswdAge() {
        return minPasswdAge;
    }

    /**
     * Sets the value of the minPasswdAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMinPasswdAge(EntityItemIntType value) {
        this.minPasswdAge = value;
    }

    /**
     * Gets the value of the minPasswdLen property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMinPasswdLen() {
        return minPasswdLen;
    }

    /**
     * Sets the value of the minPasswdLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMinPasswdLen(EntityItemIntType value) {
        this.minPasswdLen = value;
    }

    /**
     * Gets the value of the passwordHistLen property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getPasswordHistLen() {
        return passwordHistLen;
    }

    /**
     * Sets the value of the passwordHistLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setPasswordHistLen(EntityItemIntType value) {
        this.passwordHistLen = value;
    }

    /**
     * Gets the value of the passwordComplexity property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getPasswordComplexity() {
        return passwordComplexity;
    }

    /**
     * Sets the value of the passwordComplexity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setPasswordComplexity(EntityItemBoolType value) {
        this.passwordComplexity = value;
    }

    /**
     * Gets the value of the reversibleEncryption property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getReversibleEncryption() {
        return reversibleEncryption;
    }

    /**
     * Sets the value of the reversibleEncryption property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setReversibleEncryption(EntityItemBoolType value) {
        this.reversibleEncryption = value;
    }

    /**
     * Gets the value of the anonymousNameLookup property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAnonymousNameLookup() {
        return anonymousNameLookup;
    }

    /**
     * Sets the value of the anonymousNameLookup property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAnonymousNameLookup(EntityItemBoolType value) {
        this.anonymousNameLookup = value;
    }

}
