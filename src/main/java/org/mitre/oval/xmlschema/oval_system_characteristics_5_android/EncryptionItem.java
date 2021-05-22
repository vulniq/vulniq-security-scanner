


package org.mitre.oval.xmlschema.oval_system_characteristics_5_android;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemBoolType;
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
 *         &lt;element name="encryption_policy_enabled" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="encryption_status" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android}EntityItemEncryptionStatusType" minOccurs="0"/>
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
public class EncryptionItem
    extends ItemType
{

    @XmlElement(name = "encryption_policy_enabled", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected EntityItemBoolType encryptionPolicyEnabled;
    @XmlElement(name = "encryption_status", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected EntityItemEncryptionStatusType encryptionStatus;

    /**
     * Gets the value of the encryptionPolicyEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getEncryptionPolicyEnabled() {
        return encryptionPolicyEnabled;
    }

    /**
     * Sets the value of the encryptionPolicyEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setEncryptionPolicyEnabled(EntityItemBoolType value) {
        this.encryptionPolicyEnabled = value;
    }

    /**
     * Gets the value of the encryptionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemEncryptionStatusType }
     *     
     */
    public EntityItemEncryptionStatusType getEncryptionStatus() {
        return encryptionStatus;
    }

    /**
     * Sets the value of the encryptionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemEncryptionStatusType }
     *     
     */
    public void setEncryptionStatus(EntityItemEncryptionStatusType value) {
        this.encryptionStatus = value;
    }

}
