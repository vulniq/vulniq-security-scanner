


package org.mitre.oval.xmlschema.oval_definitions_5_windows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="account_logon" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="account_management" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="detailed_tracking" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="directory_service_access" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="logon" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="object_access" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="policy_change" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="privilege_use" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="system" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
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
public class AuditeventpolicyState
    extends StateType
{

    @XmlElement(name = "account_logon", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType accountLogon;
    @XmlElement(name = "account_management", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType accountManagement;
    @XmlElement(name = "detailed_tracking", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType detailedTracking;
    @XmlElement(name = "directory_service_access", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType directoryServiceAccess;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType logon;
    @XmlElement(name = "object_access", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType objectAccess;
    @XmlElement(name = "policy_change", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType policyChange;
    @XmlElement(name = "privilege_use", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType privilegeUse;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType system;

    /**
     * Gets the value of the accountLogon property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getAccountLogon() {
        return accountLogon;
    }

    /**
     * Sets the value of the accountLogon property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setAccountLogon(EntityStateAuditType value) {
        this.accountLogon = value;
    }

    /**
     * Gets the value of the accountManagement property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getAccountManagement() {
        return accountManagement;
    }

    /**
     * Sets the value of the accountManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setAccountManagement(EntityStateAuditType value) {
        this.accountManagement = value;
    }

    /**
     * Gets the value of the detailedTracking property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getDetailedTracking() {
        return detailedTracking;
    }

    /**
     * Sets the value of the detailedTracking property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setDetailedTracking(EntityStateAuditType value) {
        this.detailedTracking = value;
    }

    /**
     * Gets the value of the directoryServiceAccess property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getDirectoryServiceAccess() {
        return directoryServiceAccess;
    }

    /**
     * Sets the value of the directoryServiceAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setDirectoryServiceAccess(EntityStateAuditType value) {
        this.directoryServiceAccess = value;
    }

    /**
     * Gets the value of the logon property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getLogon() {
        return logon;
    }

    /**
     * Sets the value of the logon property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setLogon(EntityStateAuditType value) {
        this.logon = value;
    }

    /**
     * Gets the value of the objectAccess property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getObjectAccess() {
        return objectAccess;
    }

    /**
     * Sets the value of the objectAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setObjectAccess(EntityStateAuditType value) {
        this.objectAccess = value;
    }

    /**
     * Gets the value of the policyChange property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getPolicyChange() {
        return policyChange;
    }

    /**
     * Sets the value of the policyChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setPolicyChange(EntityStateAuditType value) {
        this.policyChange = value;
    }

    /**
     * Gets the value of the privilegeUse property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getPrivilegeUse() {
        return privilegeUse;
    }

    /**
     * Sets the value of the privilegeUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setPrivilegeUse(EntityStateAuditType value) {
        this.privilegeUse = value;
    }

    /**
     * Gets the value of the system property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setSystem(EntityStateAuditType value) {
        this.system = value;
    }

}
