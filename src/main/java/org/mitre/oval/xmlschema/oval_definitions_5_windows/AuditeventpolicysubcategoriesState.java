


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
 *         &lt;element name="credential_validation" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="kerberos_authentication_service" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="kerberos_service_ticket_operations" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="kerberos_ticket_events" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="other_account_logon_events" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="application_group_management" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="computer_account_management" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="distribution_group_management" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="other_account_management_events" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="security_group_management" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="user_account_management" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="dpapi_activity" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="process_creation" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="process_termination" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="rpc_events" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="directory_service_access" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="directory_service_changes" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="directory_service_replication" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="detailed_directory_service_replication" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="account_lockout" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="ipsec_extended_mode" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="ipsec_main_mode" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="ipsec_quick_mode" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="logoff" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="logon" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="network_policy_server" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="other_logon_logoff_events" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="special_logon" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="logon_claims" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="application_generated" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="certification_services" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="detailed_file_share" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="file_share" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="file_system" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="filtering_platform_connection" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="filtering_platform_packet_drop" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="handle_manipulation" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="kernel_object" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="other_object_access_events" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="registry" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="sam" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="removable_storage" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="central_access_policy_staging" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="audit_policy_change" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="authentication_policy_change" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="authorization_policy_change" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="filtering_platform_policy_change" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="mpssvc_rule_level_policy_change" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="other_policy_change_events" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="non_sensitive_privilege_use" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="other_privilege_use_events" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="sensitive_privilege_use" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="ipsec_driver" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="other_system_events" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="security_state_change" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="security_system_extension" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="system_integrity" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="group_membership" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="pnp_activity" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="user_device_claims" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
 *         &lt;element name="audit_detailedtracking_tokenrightadjusted" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateAuditType" minOccurs="0"/>
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
public class AuditeventpolicysubcategoriesState
    extends StateType
{

    @XmlElement(name = "credential_validation", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType credentialValidation;
    @XmlElement(name = "kerberos_authentication_service", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType kerberosAuthenticationService;
    @XmlElement(name = "kerberos_service_ticket_operations", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType kerberosServiceTicketOperations;
    @XmlElement(name = "kerberos_ticket_events", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType kerberosTicketEvents;
    @XmlElement(name = "other_account_logon_events", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType otherAccountLogonEvents;
    @XmlElement(name = "application_group_management", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType applicationGroupManagement;
    @XmlElement(name = "computer_account_management", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType computerAccountManagement;
    @XmlElement(name = "distribution_group_management", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType distributionGroupManagement;
    @XmlElement(name = "other_account_management_events", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType otherAccountManagementEvents;
    @XmlElement(name = "security_group_management", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType securityGroupManagement;
    @XmlElement(name = "user_account_management", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType userAccountManagement;
    @XmlElement(name = "dpapi_activity", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType dpapiActivity;
    @XmlElement(name = "process_creation", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType processCreation;
    @XmlElement(name = "process_termination", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType processTermination;
    @XmlElement(name = "rpc_events", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType rpcEvents;
    @XmlElement(name = "directory_service_access", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType directoryServiceAccess;
    @XmlElement(name = "directory_service_changes", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType directoryServiceChanges;
    @XmlElement(name = "directory_service_replication", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType directoryServiceReplication;
    @XmlElement(name = "detailed_directory_service_replication", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType detailedDirectoryServiceReplication;
    @XmlElement(name = "account_lockout", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType accountLockout;
    @XmlElement(name = "ipsec_extended_mode", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType ipsecExtendedMode;
    @XmlElement(name = "ipsec_main_mode", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType ipsecMainMode;
    @XmlElement(name = "ipsec_quick_mode", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType ipsecQuickMode;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType logoff;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType logon;
    @XmlElement(name = "network_policy_server", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType networkPolicyServer;
    @XmlElement(name = "other_logon_logoff_events", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType otherLogonLogoffEvents;
    @XmlElement(name = "special_logon", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType specialLogon;
    @XmlElement(name = "logon_claims", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType logonClaims;
    @XmlElement(name = "application_generated", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType applicationGenerated;
    @XmlElement(name = "certification_services", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType certificationServices;
    @XmlElement(name = "detailed_file_share", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType detailedFileShare;
    @XmlElement(name = "file_share", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType fileShare;
    @XmlElement(name = "file_system", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType fileSystem;
    @XmlElement(name = "filtering_platform_connection", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType filteringPlatformConnection;
    @XmlElement(name = "filtering_platform_packet_drop", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType filteringPlatformPacketDrop;
    @XmlElement(name = "handle_manipulation", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType handleManipulation;
    @XmlElement(name = "kernel_object", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType kernelObject;
    @XmlElement(name = "other_object_access_events", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType otherObjectAccessEvents;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType registry;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType sam;
    @XmlElement(name = "removable_storage", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType removableStorage;
    @XmlElement(name = "central_access_policy_staging", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType centralAccessPolicyStaging;
    @XmlElement(name = "audit_policy_change", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType auditPolicyChange;
    @XmlElement(name = "authentication_policy_change", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType authenticationPolicyChange;
    @XmlElement(name = "authorization_policy_change", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType authorizationPolicyChange;
    @XmlElement(name = "filtering_platform_policy_change", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType filteringPlatformPolicyChange;
    @XmlElement(name = "mpssvc_rule_level_policy_change", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType mpssvcRuleLevelPolicyChange;
    @XmlElement(name = "other_policy_change_events", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType otherPolicyChangeEvents;
    @XmlElement(name = "non_sensitive_privilege_use", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType nonSensitivePrivilegeUse;
    @XmlElement(name = "other_privilege_use_events", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType otherPrivilegeUseEvents;
    @XmlElement(name = "sensitive_privilege_use", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType sensitivePrivilegeUse;
    @XmlElement(name = "ipsec_driver", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType ipsecDriver;
    @XmlElement(name = "other_system_events", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType otherSystemEvents;
    @XmlElement(name = "security_state_change", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType securityStateChange;
    @XmlElement(name = "security_system_extension", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType securitySystemExtension;
    @XmlElement(name = "system_integrity", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType systemIntegrity;
    @XmlElement(name = "group_membership", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType groupMembership;
    @XmlElement(name = "pnp_activity", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType pnpActivity;
    @XmlElement(name = "user_device_claims", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType userDeviceClaims;
    @XmlElement(name = "audit_detailedtracking_tokenrightadjusted", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAuditType auditDetailedtrackingTokenrightadjusted;

    /**
     * Gets the value of the credentialValidation property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getCredentialValidation() {
        return credentialValidation;
    }

    /**
     * Sets the value of the credentialValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setCredentialValidation(EntityStateAuditType value) {
        this.credentialValidation = value;
    }

    /**
     * Gets the value of the kerberosAuthenticationService property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getKerberosAuthenticationService() {
        return kerberosAuthenticationService;
    }

    /**
     * Sets the value of the kerberosAuthenticationService property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setKerberosAuthenticationService(EntityStateAuditType value) {
        this.kerberosAuthenticationService = value;
    }

    /**
     * Gets the value of the kerberosServiceTicketOperations property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getKerberosServiceTicketOperations() {
        return kerberosServiceTicketOperations;
    }

    /**
     * Sets the value of the kerberosServiceTicketOperations property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setKerberosServiceTicketOperations(EntityStateAuditType value) {
        this.kerberosServiceTicketOperations = value;
    }

    /**
     * Gets the value of the kerberosTicketEvents property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getKerberosTicketEvents() {
        return kerberosTicketEvents;
    }

    /**
     * Sets the value of the kerberosTicketEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setKerberosTicketEvents(EntityStateAuditType value) {
        this.kerberosTicketEvents = value;
    }

    /**
     * Gets the value of the otherAccountLogonEvents property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getOtherAccountLogonEvents() {
        return otherAccountLogonEvents;
    }

    /**
     * Sets the value of the otherAccountLogonEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setOtherAccountLogonEvents(EntityStateAuditType value) {
        this.otherAccountLogonEvents = value;
    }

    /**
     * Gets the value of the applicationGroupManagement property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getApplicationGroupManagement() {
        return applicationGroupManagement;
    }

    /**
     * Sets the value of the applicationGroupManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setApplicationGroupManagement(EntityStateAuditType value) {
        this.applicationGroupManagement = value;
    }

    /**
     * Gets the value of the computerAccountManagement property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getComputerAccountManagement() {
        return computerAccountManagement;
    }

    /**
     * Sets the value of the computerAccountManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setComputerAccountManagement(EntityStateAuditType value) {
        this.computerAccountManagement = value;
    }

    /**
     * Gets the value of the distributionGroupManagement property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getDistributionGroupManagement() {
        return distributionGroupManagement;
    }

    /**
     * Sets the value of the distributionGroupManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setDistributionGroupManagement(EntityStateAuditType value) {
        this.distributionGroupManagement = value;
    }

    /**
     * Gets the value of the otherAccountManagementEvents property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getOtherAccountManagementEvents() {
        return otherAccountManagementEvents;
    }

    /**
     * Sets the value of the otherAccountManagementEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setOtherAccountManagementEvents(EntityStateAuditType value) {
        this.otherAccountManagementEvents = value;
    }

    /**
     * Gets the value of the securityGroupManagement property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getSecurityGroupManagement() {
        return securityGroupManagement;
    }

    /**
     * Sets the value of the securityGroupManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setSecurityGroupManagement(EntityStateAuditType value) {
        this.securityGroupManagement = value;
    }

    /**
     * Gets the value of the userAccountManagement property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getUserAccountManagement() {
        return userAccountManagement;
    }

    /**
     * Sets the value of the userAccountManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setUserAccountManagement(EntityStateAuditType value) {
        this.userAccountManagement = value;
    }

    /**
     * Gets the value of the dpapiActivity property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getDpapiActivity() {
        return dpapiActivity;
    }

    /**
     * Sets the value of the dpapiActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setDpapiActivity(EntityStateAuditType value) {
        this.dpapiActivity = value;
    }

    /**
     * Gets the value of the processCreation property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getProcessCreation() {
        return processCreation;
    }

    /**
     * Sets the value of the processCreation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setProcessCreation(EntityStateAuditType value) {
        this.processCreation = value;
    }

    /**
     * Gets the value of the processTermination property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getProcessTermination() {
        return processTermination;
    }

    /**
     * Sets the value of the processTermination property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setProcessTermination(EntityStateAuditType value) {
        this.processTermination = value;
    }

    /**
     * Gets the value of the rpcEvents property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getRpcEvents() {
        return rpcEvents;
    }

    /**
     * Sets the value of the rpcEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setRpcEvents(EntityStateAuditType value) {
        this.rpcEvents = value;
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
     * Gets the value of the directoryServiceChanges property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getDirectoryServiceChanges() {
        return directoryServiceChanges;
    }

    /**
     * Sets the value of the directoryServiceChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setDirectoryServiceChanges(EntityStateAuditType value) {
        this.directoryServiceChanges = value;
    }

    /**
     * Gets the value of the directoryServiceReplication property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getDirectoryServiceReplication() {
        return directoryServiceReplication;
    }

    /**
     * Sets the value of the directoryServiceReplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setDirectoryServiceReplication(EntityStateAuditType value) {
        this.directoryServiceReplication = value;
    }

    /**
     * Gets the value of the detailedDirectoryServiceReplication property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getDetailedDirectoryServiceReplication() {
        return detailedDirectoryServiceReplication;
    }

    /**
     * Sets the value of the detailedDirectoryServiceReplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setDetailedDirectoryServiceReplication(EntityStateAuditType value) {
        this.detailedDirectoryServiceReplication = value;
    }

    /**
     * Gets the value of the accountLockout property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getAccountLockout() {
        return accountLockout;
    }

    /**
     * Sets the value of the accountLockout property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setAccountLockout(EntityStateAuditType value) {
        this.accountLockout = value;
    }

    /**
     * Gets the value of the ipsecExtendedMode property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getIpsecExtendedMode() {
        return ipsecExtendedMode;
    }

    /**
     * Sets the value of the ipsecExtendedMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setIpsecExtendedMode(EntityStateAuditType value) {
        this.ipsecExtendedMode = value;
    }

    /**
     * Gets the value of the ipsecMainMode property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getIpsecMainMode() {
        return ipsecMainMode;
    }

    /**
     * Sets the value of the ipsecMainMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setIpsecMainMode(EntityStateAuditType value) {
        this.ipsecMainMode = value;
    }

    /**
     * Gets the value of the ipsecQuickMode property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getIpsecQuickMode() {
        return ipsecQuickMode;
    }

    /**
     * Sets the value of the ipsecQuickMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setIpsecQuickMode(EntityStateAuditType value) {
        this.ipsecQuickMode = value;
    }

    /**
     * Gets the value of the logoff property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getLogoff() {
        return logoff;
    }

    /**
     * Sets the value of the logoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setLogoff(EntityStateAuditType value) {
        this.logoff = value;
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
     * Gets the value of the networkPolicyServer property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getNetworkPolicyServer() {
        return networkPolicyServer;
    }

    /**
     * Sets the value of the networkPolicyServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setNetworkPolicyServer(EntityStateAuditType value) {
        this.networkPolicyServer = value;
    }

    /**
     * Gets the value of the otherLogonLogoffEvents property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getOtherLogonLogoffEvents() {
        return otherLogonLogoffEvents;
    }

    /**
     * Sets the value of the otherLogonLogoffEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setOtherLogonLogoffEvents(EntityStateAuditType value) {
        this.otherLogonLogoffEvents = value;
    }

    /**
     * Gets the value of the specialLogon property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getSpecialLogon() {
        return specialLogon;
    }

    /**
     * Sets the value of the specialLogon property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setSpecialLogon(EntityStateAuditType value) {
        this.specialLogon = value;
    }

    /**
     * Gets the value of the logonClaims property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getLogonClaims() {
        return logonClaims;
    }

    /**
     * Sets the value of the logonClaims property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setLogonClaims(EntityStateAuditType value) {
        this.logonClaims = value;
    }

    /**
     * Gets the value of the applicationGenerated property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getApplicationGenerated() {
        return applicationGenerated;
    }

    /**
     * Sets the value of the applicationGenerated property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setApplicationGenerated(EntityStateAuditType value) {
        this.applicationGenerated = value;
    }

    /**
     * Gets the value of the certificationServices property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getCertificationServices() {
        return certificationServices;
    }

    /**
     * Sets the value of the certificationServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setCertificationServices(EntityStateAuditType value) {
        this.certificationServices = value;
    }

    /**
     * Gets the value of the detailedFileShare property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getDetailedFileShare() {
        return detailedFileShare;
    }

    /**
     * Sets the value of the detailedFileShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setDetailedFileShare(EntityStateAuditType value) {
        this.detailedFileShare = value;
    }

    /**
     * Gets the value of the fileShare property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getFileShare() {
        return fileShare;
    }

    /**
     * Sets the value of the fileShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setFileShare(EntityStateAuditType value) {
        this.fileShare = value;
    }

    /**
     * Gets the value of the fileSystem property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getFileSystem() {
        return fileSystem;
    }

    /**
     * Sets the value of the fileSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setFileSystem(EntityStateAuditType value) {
        this.fileSystem = value;
    }

    /**
     * Gets the value of the filteringPlatformConnection property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getFilteringPlatformConnection() {
        return filteringPlatformConnection;
    }

    /**
     * Sets the value of the filteringPlatformConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setFilteringPlatformConnection(EntityStateAuditType value) {
        this.filteringPlatformConnection = value;
    }

    /**
     * Gets the value of the filteringPlatformPacketDrop property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getFilteringPlatformPacketDrop() {
        return filteringPlatformPacketDrop;
    }

    /**
     * Sets the value of the filteringPlatformPacketDrop property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setFilteringPlatformPacketDrop(EntityStateAuditType value) {
        this.filteringPlatformPacketDrop = value;
    }

    /**
     * Gets the value of the handleManipulation property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getHandleManipulation() {
        return handleManipulation;
    }

    /**
     * Sets the value of the handleManipulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setHandleManipulation(EntityStateAuditType value) {
        this.handleManipulation = value;
    }

    /**
     * Gets the value of the kernelObject property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getKernelObject() {
        return kernelObject;
    }

    /**
     * Sets the value of the kernelObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setKernelObject(EntityStateAuditType value) {
        this.kernelObject = value;
    }

    /**
     * Gets the value of the otherObjectAccessEvents property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getOtherObjectAccessEvents() {
        return otherObjectAccessEvents;
    }

    /**
     * Sets the value of the otherObjectAccessEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setOtherObjectAccessEvents(EntityStateAuditType value) {
        this.otherObjectAccessEvents = value;
    }

    /**
     * Gets the value of the registry property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getRegistry() {
        return registry;
    }

    /**
     * Sets the value of the registry property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setRegistry(EntityStateAuditType value) {
        this.registry = value;
    }

    /**
     * Gets the value of the sam property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getSam() {
        return sam;
    }

    /**
     * Sets the value of the sam property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setSam(EntityStateAuditType value) {
        this.sam = value;
    }

    /**
     * Gets the value of the removableStorage property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getRemovableStorage() {
        return removableStorage;
    }

    /**
     * Sets the value of the removableStorage property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setRemovableStorage(EntityStateAuditType value) {
        this.removableStorage = value;
    }

    /**
     * Gets the value of the centralAccessPolicyStaging property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getCentralAccessPolicyStaging() {
        return centralAccessPolicyStaging;
    }

    /**
     * Sets the value of the centralAccessPolicyStaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setCentralAccessPolicyStaging(EntityStateAuditType value) {
        this.centralAccessPolicyStaging = value;
    }

    /**
     * Gets the value of the auditPolicyChange property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getAuditPolicyChange() {
        return auditPolicyChange;
    }

    /**
     * Sets the value of the auditPolicyChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setAuditPolicyChange(EntityStateAuditType value) {
        this.auditPolicyChange = value;
    }

    /**
     * Gets the value of the authenticationPolicyChange property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getAuthenticationPolicyChange() {
        return authenticationPolicyChange;
    }

    /**
     * Sets the value of the authenticationPolicyChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setAuthenticationPolicyChange(EntityStateAuditType value) {
        this.authenticationPolicyChange = value;
    }

    /**
     * Gets the value of the authorizationPolicyChange property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getAuthorizationPolicyChange() {
        return authorizationPolicyChange;
    }

    /**
     * Sets the value of the authorizationPolicyChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setAuthorizationPolicyChange(EntityStateAuditType value) {
        this.authorizationPolicyChange = value;
    }

    /**
     * Gets the value of the filteringPlatformPolicyChange property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getFilteringPlatformPolicyChange() {
        return filteringPlatformPolicyChange;
    }

    /**
     * Sets the value of the filteringPlatformPolicyChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setFilteringPlatformPolicyChange(EntityStateAuditType value) {
        this.filteringPlatformPolicyChange = value;
    }

    /**
     * Gets the value of the mpssvcRuleLevelPolicyChange property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getMpssvcRuleLevelPolicyChange() {
        return mpssvcRuleLevelPolicyChange;
    }

    /**
     * Sets the value of the mpssvcRuleLevelPolicyChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setMpssvcRuleLevelPolicyChange(EntityStateAuditType value) {
        this.mpssvcRuleLevelPolicyChange = value;
    }

    /**
     * Gets the value of the otherPolicyChangeEvents property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getOtherPolicyChangeEvents() {
        return otherPolicyChangeEvents;
    }

    /**
     * Sets the value of the otherPolicyChangeEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setOtherPolicyChangeEvents(EntityStateAuditType value) {
        this.otherPolicyChangeEvents = value;
    }

    /**
     * Gets the value of the nonSensitivePrivilegeUse property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getNonSensitivePrivilegeUse() {
        return nonSensitivePrivilegeUse;
    }

    /**
     * Sets the value of the nonSensitivePrivilegeUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setNonSensitivePrivilegeUse(EntityStateAuditType value) {
        this.nonSensitivePrivilegeUse = value;
    }

    /**
     * Gets the value of the otherPrivilegeUseEvents property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getOtherPrivilegeUseEvents() {
        return otherPrivilegeUseEvents;
    }

    /**
     * Sets the value of the otherPrivilegeUseEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setOtherPrivilegeUseEvents(EntityStateAuditType value) {
        this.otherPrivilegeUseEvents = value;
    }

    /**
     * Gets the value of the sensitivePrivilegeUse property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getSensitivePrivilegeUse() {
        return sensitivePrivilegeUse;
    }

    /**
     * Sets the value of the sensitivePrivilegeUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setSensitivePrivilegeUse(EntityStateAuditType value) {
        this.sensitivePrivilegeUse = value;
    }

    /**
     * Gets the value of the ipsecDriver property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getIpsecDriver() {
        return ipsecDriver;
    }

    /**
     * Sets the value of the ipsecDriver property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setIpsecDriver(EntityStateAuditType value) {
        this.ipsecDriver = value;
    }

    /**
     * Gets the value of the otherSystemEvents property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getOtherSystemEvents() {
        return otherSystemEvents;
    }

    /**
     * Sets the value of the otherSystemEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setOtherSystemEvents(EntityStateAuditType value) {
        this.otherSystemEvents = value;
    }

    /**
     * Gets the value of the securityStateChange property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getSecurityStateChange() {
        return securityStateChange;
    }

    /**
     * Sets the value of the securityStateChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setSecurityStateChange(EntityStateAuditType value) {
        this.securityStateChange = value;
    }

    /**
     * Gets the value of the securitySystemExtension property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getSecuritySystemExtension() {
        return securitySystemExtension;
    }

    /**
     * Sets the value of the securitySystemExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setSecuritySystemExtension(EntityStateAuditType value) {
        this.securitySystemExtension = value;
    }

    /**
     * Gets the value of the systemIntegrity property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getSystemIntegrity() {
        return systemIntegrity;
    }

    /**
     * Sets the value of the systemIntegrity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setSystemIntegrity(EntityStateAuditType value) {
        this.systemIntegrity = value;
    }

    /**
     * Gets the value of the groupMembership property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getGroupMembership() {
        return groupMembership;
    }

    /**
     * Sets the value of the groupMembership property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setGroupMembership(EntityStateAuditType value) {
        this.groupMembership = value;
    }

    /**
     * Gets the value of the pnpActivity property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getPnpActivity() {
        return pnpActivity;
    }

    /**
     * Sets the value of the pnpActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setPnpActivity(EntityStateAuditType value) {
        this.pnpActivity = value;
    }

    /**
     * Gets the value of the userDeviceClaims property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getUserDeviceClaims() {
        return userDeviceClaims;
    }

    /**
     * Sets the value of the userDeviceClaims property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setUserDeviceClaims(EntityStateAuditType value) {
        this.userDeviceClaims = value;
    }

    /**
     * Gets the value of the auditDetailedtrackingTokenrightadjusted property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAuditType }
     *     
     */
    public EntityStateAuditType getAuditDetailedtrackingTokenrightadjusted() {
        return auditDetailedtrackingTokenrightadjusted;
    }

    /**
     * Sets the value of the auditDetailedtrackingTokenrightadjusted property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAuditType }
     *     
     */
    public void setAuditDetailedtrackingTokenrightadjusted(EntityStateAuditType value) {
        this.auditDetailedtrackingTokenrightadjusted = value;
    }

}
