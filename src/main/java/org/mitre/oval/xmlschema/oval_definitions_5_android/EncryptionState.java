


package org.mitre.oval.xmlschema.oval_definitions_5_android;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateBoolType;
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
 *         &lt;element name="encryption_policy_enabled" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="encryption_status" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#android}EntityStateEncryptionStatusType" minOccurs="0"/>
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
    "encryptionPolicyEnabled",
    "encryptionStatus"
})
public class EncryptionState
    extends StateType
{

    @XmlElement(name = "encryption_policy_enabled", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateBoolType encryptionPolicyEnabled;
    @XmlElement(name = "encryption_status", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateEncryptionStatusType encryptionStatus;

    /**
     * Gets the value of the encryptionPolicyEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getEncryptionPolicyEnabled() {
        return encryptionPolicyEnabled;
    }

    /**
     * Sets the value of the encryptionPolicyEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setEncryptionPolicyEnabled(EntityStateBoolType value) {
        this.encryptionPolicyEnabled = value;
    }

    /**
     * Gets the value of the encryptionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateEncryptionStatusType }
     *     
     */
    public EntityStateEncryptionStatusType getEncryptionStatus() {
        return encryptionStatus;
    }

    /**
     * Sets the value of the encryptionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateEncryptionStatusType }
     *     
     */
    public void setEncryptionStatus(EntityStateEncryptionStatusType value) {
        this.encryptionStatus = value;
    }

}
