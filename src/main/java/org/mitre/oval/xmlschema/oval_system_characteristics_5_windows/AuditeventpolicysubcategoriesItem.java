


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
 *         &lt;element name="credential_validation" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="kerberos_authentication_service" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="kerberos_service_ticket_operations" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="kerberos_ticket_events" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="other_account_logon_events" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="application_group_management" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="computer_account_management" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="distribution_group_management" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="other_account_management_events" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="security_group_management" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="user_account_management" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="dpapi_activity" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="process_creation" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="process_termination" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="rpc_events" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="directory_service_access" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="directory_service_changes" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="directory_service_replication" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="detailed_directory_service_replication" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="account_lockout" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="ipsec_extended_mode" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="ipsec_main_mode" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="ipsec_quick_mode" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="logoff" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="logon" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="network_policy_server" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="other_logon_logoff_events" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="special_logon" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="logon_claims" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="application_generated" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="certification_services" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="detailed_file_share" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="file_share" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="file_system" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="filtering_platform_connection" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="filtering_platform_packet_drop" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="handle_manipulation" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="kernel_object" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="other_object_access_events" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="registry" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="sam" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="removable_storage" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="central_access_policy_staging" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="audit_policy_change" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="authentication_policy_change" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="authorization_policy_change" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="filtering_platform_policy_change" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="mpssvc_rule_level_policy_change" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="other_policy_change_events" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="non_sensitive_privilege_use" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="other_privilege_use_events" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="sensitive_privilege_use" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="ipsec_driver" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="other_system_events" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="security_state_change" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="security_system_extension" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="system_integrity" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="group_membership" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="pnp_activity" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="user_device_claims" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
 *         &lt;element name="audit_detailedtracking_tokenrightadjusted" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAuditType" minOccurs="0"/>
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
    "credentialValidation",
    "kerberosAuthenticationService",
    "kerberosServiceTicketOperations",
    "kerberosTicketEvents",
    "otherAccountLogonEvents",
    "applicationGroupManagement",
    "computerAccountManagement",
    "distributionGroupManagement",
    "otherAccountManagementEvents",
    "securityGroupManagement",
    "userAccountManagement",
    "dpapiActivity",
    "processCreation",
    "processTermination",
    "rpcEvents",
    "directoryServiceAccess",
    "directoryServiceChanges",
    "directoryServiceReplication",
    "detailedDirectoryServiceReplication",
    "accountLockout",
    "ipsecExtendedMode",
    "ipsecMainMode",
    "ipsecQuickMode",
    "logoff",
    "logon",
    "networkPolicyServer",
    "otherLogonLogoffEvents",
    "specialLogon",
    "logonClaims",
    "applicationGenerated",
    "certificationServices",
    "detailedFileShare",
    "fileShare",
    "fileSystem",
    "filteringPlatformConnection",
    "filteringPlatformPacketDrop",
    "handleManipulation",
    "kernelObject",
    "otherObjectAccessEvents",
    "registry",
    "sam",
    "removableStorage",
    "centralAccessPolicyStaging",
    "auditPolicyChange",
    "authenticationPolicyChange",
    "authorizationPolicyChange",
    "filteringPlatformPolicyChange",
    "mpssvcRuleLevelPolicyChange",
    "otherPolicyChangeEvents",
    "nonSensitivePrivilegeUse",
    "otherPrivilegeUseEvents",
    "sensitivePrivilegeUse",
    "ipsecDriver",
    "otherSystemEvents",
    "securityStateChange",
    "securitySystemExtension",
    "systemIntegrity",
    "groupMembership",
    "pnpActivity",
    "userDeviceClaims",
    "auditDetailedtrackingTokenrightadjusted"
})
public class AuditeventpolicysubcategoriesItem
    extends ItemType
{

    @XmlElement(name = "credential_validation", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType credentialValidation;
    @XmlElement(name = "kerberos_authentication_service", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType kerberosAuthenticationService;
    @XmlElement(name = "kerberos_service_ticket_operations", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType kerberosServiceTicketOperations;
    @XmlElement(name = "kerberos_ticket_events", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType kerberosTicketEvents;
    @XmlElement(name = "other_account_logon_events", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType otherAccountLogonEvents;
    @XmlElement(name = "application_group_management", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType applicationGroupManagement;
    @XmlElement(name = "computer_account_management", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType computerAccountManagement;
    @XmlElement(name = "distribution_group_management", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType distributionGroupManagement;
    @XmlElement(name = "other_account_management_events", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType otherAccountManagementEvents;
    @XmlElement(name = "security_group_management", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType securityGroupManagement;
    @XmlElement(name = "user_account_management", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType userAccountManagement;
    @XmlElement(name = "dpapi_activity", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType dpapiActivity;
    @XmlElement(name = "process_creation", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType processCreation;
    @XmlElement(name = "process_termination", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType processTermination;
    @XmlElement(name = "rpc_events", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType rpcEvents;
    @XmlElement(name = "directory_service_access", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType directoryServiceAccess;
    @XmlElement(name = "directory_service_changes", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType directoryServiceChanges;
    @XmlElement(name = "directory_service_replication", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType directoryServiceReplication;
    @XmlElement(name = "detailed_directory_service_replication", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType detailedDirectoryServiceReplication;
    @XmlElement(name = "account_lockout", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType accountLockout;
    @XmlElement(name = "ipsec_extended_mode", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType ipsecExtendedMode;
    @XmlElement(name = "ipsec_main_mode", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType ipsecMainMode;
    @XmlElement(name = "ipsec_quick_mode", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType ipsecQuickMode;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType logoff;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType logon;
    @XmlElement(name = "network_policy_server", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType networkPolicyServer;
    @XmlElement(name = "other_logon_logoff_events", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType otherLogonLogoffEvents;
    @XmlElement(name = "special_logon", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType specialLogon;
    @XmlElement(name = "logon_claims", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType logonClaims;
    @XmlElement(name = "application_generated", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType applicationGenerated;
    @XmlElement(name = "certification_services", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType certificationServices;
    @XmlElement(name = "detailed_file_share", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType detailedFileShare;
    @XmlElement(name = "file_share", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType fileShare;
    @XmlElement(name = "file_system", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType fileSystem;
    @XmlElement(name = "filtering_platform_connection", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType filteringPlatformConnection;
    @XmlElement(name = "filtering_platform_packet_drop", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType filteringPlatformPacketDrop;
    @XmlElement(name = "handle_manipulation", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType handleManipulation;
    @XmlElement(name = "kernel_object", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType kernelObject;
    @XmlElement(name = "other_object_access_events", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType otherObjectAccessEvents;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType registry;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType sam;
    @XmlElement(name = "removable_storage", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType removableStorage;
    @XmlElement(name = "central_access_policy_staging", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType centralAccessPolicyStaging;
    @XmlElement(name = "audit_policy_change", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType auditPolicyChange;
    @XmlElement(name = "authentication_policy_change", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType authenticationPolicyChange;
    @XmlElement(name = "authorization_policy_change", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType authorizationPolicyChange;
    @XmlElement(name = "filtering_platform_policy_change", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType filteringPlatformPolicyChange;
    @XmlElement(name = "mpssvc_rule_level_policy_change", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType mpssvcRuleLevelPolicyChange;
    @XmlElement(name = "other_policy_change_events", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType otherPolicyChangeEvents;
    @XmlElement(name = "non_sensitive_privilege_use", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType nonSensitivePrivilegeUse;
    @XmlElement(name = "other_privilege_use_events", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType otherPrivilegeUseEvents;
    @XmlElement(name = "sensitive_privilege_use", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType sensitivePrivilegeUse;
    @XmlElement(name = "ipsec_driver", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType ipsecDriver;
    @XmlElement(name = "other_system_events", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType otherSystemEvents;
    @XmlElement(name = "security_state_change", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType securityStateChange;
    @XmlElement(name = "security_system_extension", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType securitySystemExtension;
    @XmlElement(name = "system_integrity", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType systemIntegrity;
    @XmlElement(name = "group_membership", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType groupMembership;
    @XmlElement(name = "pnp_activity", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType pnpActivity;
    @XmlElement(name = "user_device_claims", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType userDeviceClaims;
    @XmlElement(name = "audit_detailedtracking_tokenrightadjusted", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAuditType auditDetailedtrackingTokenrightadjusted;

    /**
     * Gets the value of the credentialValidation property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getCredentialValidation() {
        return credentialValidation;
    }

    /**
     * Sets the value of the credentialValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setCredentialValidation(EntityItemAuditType value) {
        this.credentialValidation = value;
    }

    /**
     * Gets the value of the kerberosAuthenticationService property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getKerberosAuthenticationService() {
        return kerberosAuthenticationService;
    }

    /**
     * Sets the value of the kerberosAuthenticationService property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setKerberosAuthenticationService(EntityItemAuditType value) {
        this.kerberosAuthenticationService = value;
    }

    /**
     * Gets the value of the kerberosServiceTicketOperations property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getKerberosServiceTicketOperations() {
        return kerberosServiceTicketOperations;
    }

    /**
     * Sets the value of the kerberosServiceTicketOperations property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setKerberosServiceTicketOperations(EntityItemAuditType value) {
        this.kerberosServiceTicketOperations = value;
    }

    /**
     * Gets the value of the kerberosTicketEvents property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getKerberosTicketEvents() {
        return kerberosTicketEvents;
    }

    /**
     * Sets the value of the kerberosTicketEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setKerberosTicketEvents(EntityItemAuditType value) {
        this.kerberosTicketEvents = value;
    }

    /**
     * Gets the value of the otherAccountLogonEvents property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getOtherAccountLogonEvents() {
        return otherAccountLogonEvents;
    }

    /**
     * Sets the value of the otherAccountLogonEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setOtherAccountLogonEvents(EntityItemAuditType value) {
        this.otherAccountLogonEvents = value;
    }

    /**
     * Gets the value of the applicationGroupManagement property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getApplicationGroupManagement() {
        return applicationGroupManagement;
    }

    /**
     * Sets the value of the applicationGroupManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setApplicationGroupManagement(EntityItemAuditType value) {
        this.applicationGroupManagement = value;
    }

    /**
     * Gets the value of the computerAccountManagement property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getComputerAccountManagement() {
        return computerAccountManagement;
    }

    /**
     * Sets the value of the computerAccountManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setComputerAccountManagement(EntityItemAuditType value) {
        this.computerAccountManagement = value;
    }

    /**
     * Gets the value of the distributionGroupManagement property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getDistributionGroupManagement() {
        return distributionGroupManagement;
    }

    /**
     * Sets the value of the distributionGroupManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setDistributionGroupManagement(EntityItemAuditType value) {
        this.distributionGroupManagement = value;
    }

    /**
     * Gets the value of the otherAccountManagementEvents property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getOtherAccountManagementEvents() {
        return otherAccountManagementEvents;
    }

    /**
     * Sets the value of the otherAccountManagementEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setOtherAccountManagementEvents(EntityItemAuditType value) {
        this.otherAccountManagementEvents = value;
    }

    /**
     * Gets the value of the securityGroupManagement property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getSecurityGroupManagement() {
        return securityGroupManagement;
    }

    /**
     * Sets the value of the securityGroupManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setSecurityGroupManagement(EntityItemAuditType value) {
        this.securityGroupManagement = value;
    }

    /**
     * Gets the value of the userAccountManagement property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getUserAccountManagement() {
        return userAccountManagement;
    }

    /**
     * Sets the value of the userAccountManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setUserAccountManagement(EntityItemAuditType value) {
        this.userAccountManagement = value;
    }

    /**
     * Gets the value of the dpapiActivity property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getDpapiActivity() {
        return dpapiActivity;
    }

    /**
     * Sets the value of the dpapiActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setDpapiActivity(EntityItemAuditType value) {
        this.dpapiActivity = value;
    }

    /**
     * Gets the value of the processCreation property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getProcessCreation() {
        return processCreation;
    }

    /**
     * Sets the value of the processCreation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setProcessCreation(EntityItemAuditType value) {
        this.processCreation = value;
    }

    /**
     * Gets the value of the processTermination property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getProcessTermination() {
        return processTermination;
    }

    /**
     * Sets the value of the processTermination property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setProcessTermination(EntityItemAuditType value) {
        this.processTermination = value;
    }

    /**
     * Gets the value of the rpcEvents property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getRpcEvents() {
        return rpcEvents;
    }

    /**
     * Sets the value of the rpcEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setRpcEvents(EntityItemAuditType value) {
        this.rpcEvents = value;
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
     * Gets the value of the directoryServiceChanges property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getDirectoryServiceChanges() {
        return directoryServiceChanges;
    }

    /**
     * Sets the value of the directoryServiceChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setDirectoryServiceChanges(EntityItemAuditType value) {
        this.directoryServiceChanges = value;
    }

    /**
     * Gets the value of the directoryServiceReplication property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getDirectoryServiceReplication() {
        return directoryServiceReplication;
    }

    /**
     * Sets the value of the directoryServiceReplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setDirectoryServiceReplication(EntityItemAuditType value) {
        this.directoryServiceReplication = value;
    }

    /**
     * Gets the value of the detailedDirectoryServiceReplication property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getDetailedDirectoryServiceReplication() {
        return detailedDirectoryServiceReplication;
    }

    /**
     * Sets the value of the detailedDirectoryServiceReplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setDetailedDirectoryServiceReplication(EntityItemAuditType value) {
        this.detailedDirectoryServiceReplication = value;
    }

    /**
     * Gets the value of the accountLockout property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getAccountLockout() {
        return accountLockout;
    }

    /**
     * Sets the value of the accountLockout property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setAccountLockout(EntityItemAuditType value) {
        this.accountLockout = value;
    }

    /**
     * Gets the value of the ipsecExtendedMode property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getIpsecExtendedMode() {
        return ipsecExtendedMode;
    }

    /**
     * Sets the value of the ipsecExtendedMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setIpsecExtendedMode(EntityItemAuditType value) {
        this.ipsecExtendedMode = value;
    }

    /**
     * Gets the value of the ipsecMainMode property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getIpsecMainMode() {
        return ipsecMainMode;
    }

    /**
     * Sets the value of the ipsecMainMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setIpsecMainMode(EntityItemAuditType value) {
        this.ipsecMainMode = value;
    }

    /**
     * Gets the value of the ipsecQuickMode property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getIpsecQuickMode() {
        return ipsecQuickMode;
    }

    /**
     * Sets the value of the ipsecQuickMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setIpsecQuickMode(EntityItemAuditType value) {
        this.ipsecQuickMode = value;
    }

    /**
     * Gets the value of the logoff property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getLogoff() {
        return logoff;
    }

    /**
     * Sets the value of the logoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setLogoff(EntityItemAuditType value) {
        this.logoff = value;
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
     * Gets the value of the networkPolicyServer property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getNetworkPolicyServer() {
        return networkPolicyServer;
    }

    /**
     * Sets the value of the networkPolicyServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setNetworkPolicyServer(EntityItemAuditType value) {
        this.networkPolicyServer = value;
    }

    /**
     * Gets the value of the otherLogonLogoffEvents property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getOtherLogonLogoffEvents() {
        return otherLogonLogoffEvents;
    }

    /**
     * Sets the value of the otherLogonLogoffEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setOtherLogonLogoffEvents(EntityItemAuditType value) {
        this.otherLogonLogoffEvents = value;
    }

    /**
     * Gets the value of the specialLogon property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getSpecialLogon() {
        return specialLogon;
    }

    /**
     * Sets the value of the specialLogon property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setSpecialLogon(EntityItemAuditType value) {
        this.specialLogon = value;
    }

    /**
     * Gets the value of the logonClaims property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getLogonClaims() {
        return logonClaims;
    }

    /**
     * Sets the value of the logonClaims property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setLogonClaims(EntityItemAuditType value) {
        this.logonClaims = value;
    }

    /**
     * Gets the value of the applicationGenerated property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getApplicationGenerated() {
        return applicationGenerated;
    }

    /**
     * Sets the value of the applicationGenerated property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setApplicationGenerated(EntityItemAuditType value) {
        this.applicationGenerated = value;
    }

    /**
     * Gets the value of the certificationServices property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getCertificationServices() {
        return certificationServices;
    }

    /**
     * Sets the value of the certificationServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setCertificationServices(EntityItemAuditType value) {
        this.certificationServices = value;
    }

    /**
     * Gets the value of the detailedFileShare property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getDetailedFileShare() {
        return detailedFileShare;
    }

    /**
     * Sets the value of the detailedFileShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setDetailedFileShare(EntityItemAuditType value) {
        this.detailedFileShare = value;
    }

    /**
     * Gets the value of the fileShare property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getFileShare() {
        return fileShare;
    }

    /**
     * Sets the value of the fileShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setFileShare(EntityItemAuditType value) {
        this.fileShare = value;
    }

    /**
     * Gets the value of the fileSystem property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getFileSystem() {
        return fileSystem;
    }

    /**
     * Sets the value of the fileSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setFileSystem(EntityItemAuditType value) {
        this.fileSystem = value;
    }

    /**
     * Gets the value of the filteringPlatformConnection property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getFilteringPlatformConnection() {
        return filteringPlatformConnection;
    }

    /**
     * Sets the value of the filteringPlatformConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setFilteringPlatformConnection(EntityItemAuditType value) {
        this.filteringPlatformConnection = value;
    }

    /**
     * Gets the value of the filteringPlatformPacketDrop property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getFilteringPlatformPacketDrop() {
        return filteringPlatformPacketDrop;
    }

    /**
     * Sets the value of the filteringPlatformPacketDrop property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setFilteringPlatformPacketDrop(EntityItemAuditType value) {
        this.filteringPlatformPacketDrop = value;
    }

    /**
     * Gets the value of the handleManipulation property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getHandleManipulation() {
        return handleManipulation;
    }

    /**
     * Sets the value of the handleManipulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setHandleManipulation(EntityItemAuditType value) {
        this.handleManipulation = value;
    }

    /**
     * Gets the value of the kernelObject property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getKernelObject() {
        return kernelObject;
    }

    /**
     * Sets the value of the kernelObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setKernelObject(EntityItemAuditType value) {
        this.kernelObject = value;
    }

    /**
     * Gets the value of the otherObjectAccessEvents property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getOtherObjectAccessEvents() {
        return otherObjectAccessEvents;
    }

    /**
     * Sets the value of the otherObjectAccessEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setOtherObjectAccessEvents(EntityItemAuditType value) {
        this.otherObjectAccessEvents = value;
    }

    /**
     * Gets the value of the registry property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getRegistry() {
        return registry;
    }

    /**
     * Sets the value of the registry property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setRegistry(EntityItemAuditType value) {
        this.registry = value;
    }

    /**
     * Gets the value of the sam property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getSam() {
        return sam;
    }

    /**
     * Sets the value of the sam property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setSam(EntityItemAuditType value) {
        this.sam = value;
    }

    /**
     * Gets the value of the removableStorage property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getRemovableStorage() {
        return removableStorage;
    }

    /**
     * Sets the value of the removableStorage property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setRemovableStorage(EntityItemAuditType value) {
        this.removableStorage = value;
    }

    /**
     * Gets the value of the centralAccessPolicyStaging property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getCentralAccessPolicyStaging() {
        return centralAccessPolicyStaging;
    }

    /**
     * Sets the value of the centralAccessPolicyStaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setCentralAccessPolicyStaging(EntityItemAuditType value) {
        this.centralAccessPolicyStaging = value;
    }

    /**
     * Gets the value of the auditPolicyChange property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getAuditPolicyChange() {
        return auditPolicyChange;
    }

    /**
     * Sets the value of the auditPolicyChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setAuditPolicyChange(EntityItemAuditType value) {
        this.auditPolicyChange = value;
    }

    /**
     * Gets the value of the authenticationPolicyChange property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getAuthenticationPolicyChange() {
        return authenticationPolicyChange;
    }

    /**
     * Sets the value of the authenticationPolicyChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setAuthenticationPolicyChange(EntityItemAuditType value) {
        this.authenticationPolicyChange = value;
    }

    /**
     * Gets the value of the authorizationPolicyChange property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getAuthorizationPolicyChange() {
        return authorizationPolicyChange;
    }

    /**
     * Sets the value of the authorizationPolicyChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setAuthorizationPolicyChange(EntityItemAuditType value) {
        this.authorizationPolicyChange = value;
    }

    /**
     * Gets the value of the filteringPlatformPolicyChange property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getFilteringPlatformPolicyChange() {
        return filteringPlatformPolicyChange;
    }

    /**
     * Sets the value of the filteringPlatformPolicyChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setFilteringPlatformPolicyChange(EntityItemAuditType value) {
        this.filteringPlatformPolicyChange = value;
    }

    /**
     * Gets the value of the mpssvcRuleLevelPolicyChange property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getMpssvcRuleLevelPolicyChange() {
        return mpssvcRuleLevelPolicyChange;
    }

    /**
     * Sets the value of the mpssvcRuleLevelPolicyChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setMpssvcRuleLevelPolicyChange(EntityItemAuditType value) {
        this.mpssvcRuleLevelPolicyChange = value;
    }

    /**
     * Gets the value of the otherPolicyChangeEvents property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getOtherPolicyChangeEvents() {
        return otherPolicyChangeEvents;
    }

    /**
     * Sets the value of the otherPolicyChangeEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setOtherPolicyChangeEvents(EntityItemAuditType value) {
        this.otherPolicyChangeEvents = value;
    }

    /**
     * Gets the value of the nonSensitivePrivilegeUse property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getNonSensitivePrivilegeUse() {
        return nonSensitivePrivilegeUse;
    }

    /**
     * Sets the value of the nonSensitivePrivilegeUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setNonSensitivePrivilegeUse(EntityItemAuditType value) {
        this.nonSensitivePrivilegeUse = value;
    }

    /**
     * Gets the value of the otherPrivilegeUseEvents property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getOtherPrivilegeUseEvents() {
        return otherPrivilegeUseEvents;
    }

    /**
     * Sets the value of the otherPrivilegeUseEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setOtherPrivilegeUseEvents(EntityItemAuditType value) {
        this.otherPrivilegeUseEvents = value;
    }

    /**
     * Gets the value of the sensitivePrivilegeUse property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getSensitivePrivilegeUse() {
        return sensitivePrivilegeUse;
    }

    /**
     * Sets the value of the sensitivePrivilegeUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setSensitivePrivilegeUse(EntityItemAuditType value) {
        this.sensitivePrivilegeUse = value;
    }

    /**
     * Gets the value of the ipsecDriver property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getIpsecDriver() {
        return ipsecDriver;
    }

    /**
     * Sets the value of the ipsecDriver property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setIpsecDriver(EntityItemAuditType value) {
        this.ipsecDriver = value;
    }

    /**
     * Gets the value of the otherSystemEvents property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getOtherSystemEvents() {
        return otherSystemEvents;
    }

    /**
     * Sets the value of the otherSystemEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setOtherSystemEvents(EntityItemAuditType value) {
        this.otherSystemEvents = value;
    }

    /**
     * Gets the value of the securityStateChange property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getSecurityStateChange() {
        return securityStateChange;
    }

    /**
     * Sets the value of the securityStateChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setSecurityStateChange(EntityItemAuditType value) {
        this.securityStateChange = value;
    }

    /**
     * Gets the value of the securitySystemExtension property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getSecuritySystemExtension() {
        return securitySystemExtension;
    }

    /**
     * Sets the value of the securitySystemExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setSecuritySystemExtension(EntityItemAuditType value) {
        this.securitySystemExtension = value;
    }

    /**
     * Gets the value of the systemIntegrity property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getSystemIntegrity() {
        return systemIntegrity;
    }

    /**
     * Sets the value of the systemIntegrity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setSystemIntegrity(EntityItemAuditType value) {
        this.systemIntegrity = value;
    }

    /**
     * Gets the value of the groupMembership property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getGroupMembership() {
        return groupMembership;
    }

    /**
     * Sets the value of the groupMembership property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setGroupMembership(EntityItemAuditType value) {
        this.groupMembership = value;
    }

    /**
     * Gets the value of the pnpActivity property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getPnpActivity() {
        return pnpActivity;
    }

    /**
     * Sets the value of the pnpActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setPnpActivity(EntityItemAuditType value) {
        this.pnpActivity = value;
    }

    /**
     * Gets the value of the userDeviceClaims property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getUserDeviceClaims() {
        return userDeviceClaims;
    }

    /**
     * Sets the value of the userDeviceClaims property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setUserDeviceClaims(EntityItemAuditType value) {
        this.userDeviceClaims = value;
    }

    /**
     * Gets the value of the auditDetailedtrackingTokenrightadjusted property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAuditType }
     *     
     */
    public EntityItemAuditType getAuditDetailedtrackingTokenrightadjusted() {
        return auditDetailedtrackingTokenrightadjusted;
    }

    /**
     * Sets the value of the auditDetailedtrackingTokenrightadjusted property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAuditType }
     *     
     */
    public void setAuditDetailedtrackingTokenrightadjusted(EntityItemAuditType value) {
        this.auditDetailedtrackingTokenrightadjusted = value;
    }

}
