


package org.mitre.oval.xmlschema.oval_definitions_5_windows;

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
 *         &lt;element name="max_passwd_age" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="min_passwd_age" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="min_passwd_len" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="password_hist_len" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="password_complexity" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="reversible_encryption" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="anonymous_name_lookup" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
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
public class PasswordpolicyState
    extends StateType
{

    @XmlElement(name = "max_passwd_age", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType maxPasswdAge;
    @XmlElement(name = "min_passwd_age", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType minPasswdAge;
    @XmlElement(name = "min_passwd_len", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType minPasswdLen;
    @XmlElement(name = "password_hist_len", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType passwordHistLen;
    @XmlElement(name = "password_complexity", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType passwordComplexity;
    @XmlElement(name = "reversible_encryption", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType reversibleEncryption;
    @XmlElement(name = "anonymous_name_lookup", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType anonymousNameLookup;

    /**
     * Gets the value of the maxPasswdAge property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMaxPasswdAge() {
        return maxPasswdAge;
    }

    /**
     * Sets the value of the maxPasswdAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMaxPasswdAge(EntityStateIntType value) {
        this.maxPasswdAge = value;
    }

    /**
     * Gets the value of the minPasswdAge property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMinPasswdAge() {
        return minPasswdAge;
    }

    /**
     * Sets the value of the minPasswdAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMinPasswdAge(EntityStateIntType value) {
        this.minPasswdAge = value;
    }

    /**
     * Gets the value of the minPasswdLen property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMinPasswdLen() {
        return minPasswdLen;
    }

    /**
     * Sets the value of the minPasswdLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMinPasswdLen(EntityStateIntType value) {
        this.minPasswdLen = value;
    }

    /**
     * Gets the value of the passwordHistLen property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getPasswordHistLen() {
        return passwordHistLen;
    }

    /**
     * Sets the value of the passwordHistLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setPasswordHistLen(EntityStateIntType value) {
        this.passwordHistLen = value;
    }

    /**
     * Gets the value of the passwordComplexity property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getPasswordComplexity() {
        return passwordComplexity;
    }

    /**
     * Sets the value of the passwordComplexity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setPasswordComplexity(EntityStateBoolType value) {
        this.passwordComplexity = value;
    }

    /**
     * Gets the value of the reversibleEncryption property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getReversibleEncryption() {
        return reversibleEncryption;
    }

    /**
     * Sets the value of the reversibleEncryption property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setReversibleEncryption(EntityStateBoolType value) {
        this.reversibleEncryption = value;
    }

    /**
     * Gets the value of the anonymousNameLookup property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAnonymousNameLookup() {
        return anonymousNameLookup;
    }

    /**
     * Sets the value of the anonymousNameLookup property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAnonymousNameLookup(EntityStateBoolType value) {
        this.anonymousNameLookup = value;
    }

}
