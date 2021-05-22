


package org.mitre.oval.xmlschema.oval_system_characteristics_5_windows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="account_logon" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="account_management" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="detailed_tracking" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="directory_service_access" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="logon" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="object_access" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="policy_change" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="privilege_use" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="system" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
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
    "accountLogon",
    "accountManagement",
    "detailedTracking",
    "directoryServiceAccess",
    "logon",
    "objectAccess",
    "policyChange",
    "privilegeUse",
    "system"
})
public class AuditeventpolicyItem
    extends ItemType
{

    @XmlElement(name = "account_logon", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType accountLogon;
    @XmlElement(name = "account_management", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType accountManagement;
    @XmlElement(name = "detailed_tracking", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType detailedTracking;
    @XmlElement(name = "directory_service_access", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType directoryServiceAccess;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType logon;
    @XmlElement(name = "object_access", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType objectAccess;
    @XmlElement(name = "policy_change", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType policyChange;
    @XmlElement(name = "privilege_use", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType privilegeUse;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType system;

    /**
     * Gets the value of the accountLogon property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getAccountLogon() {
        return accountLogon;
    }

    /**
     * Sets the value of the accountLogon property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setAccountLogon(EntityItemAuditType value) {
        this.accountLogon = value;
    }

    /**
     * Gets the value of the accountManagement property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getAccountManagement() {
        return accountManagement;
    }

    /**
     * Sets the value of the accountManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setAccountManagement(EntityItemAuditType value) {
        this.accountManagement = value;
    }

    /**
     * Gets the value of the detailedTracking property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getDetailedTracking() {
        return detailedTracking;
    }

    /**
     * Sets the value of the detailedTracking property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setDetailedTracking(EntityItemAuditType value) {
        this.detailedTracking = value;
    }

    /**
     * Gets the value of the directoryServiceAccess property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getDirectoryServiceAccess() {
        return directoryServiceAccess;
    }

    /**
     * Sets the value of the directoryServiceAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setDirectoryServiceAccess(EntityItemAuditType value) {
        this.directoryServiceAccess = value;
    }

    /**
     * Gets the value of the logon property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getLogon() {
        return logon;
    }

    /**
     * Sets the value of the logon property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setLogon(EntityItemAuditType value) {
        this.logon = value;
    }

    /**
     * Gets the value of the objectAccess property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getObjectAccess() {
        return objectAccess;
    }

    /**
     * Sets the value of the objectAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setObjectAccess(EntityItemAuditType value) {
        this.objectAccess = value;
    }

    /**
     * Gets the value of the policyChange property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getPolicyChange() {
        return policyChange;
    }

    /**
     * Sets the value of the policyChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setPolicyChange(EntityItemAuditType value) {
        this.policyChange = value;
    }

    /**
     * Gets the value of the privilegeUse property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getPrivilegeUse() {
        return privilegeUse;
    }

    /**
     * Sets the value of the privilegeUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setPrivilegeUse(EntityItemAuditType value) {
        this.privilegeUse = value;
    }

    /**
     * Gets the value of the system property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setSystem(EntityItemAuditType value) {
        this.system = value;
    }

}
