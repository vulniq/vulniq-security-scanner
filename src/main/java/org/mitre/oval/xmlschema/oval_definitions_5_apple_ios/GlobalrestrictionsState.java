


package org.mitre.oval.xmlschema.oval_definitions_5_apple_ios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateBoolType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateStringType;
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
 *         &lt;element name="allow_account_modification" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_airdrop" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_app_cellular_data_modification" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_app_installation" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_assistant" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_assistant_user_generated_content" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_assistant_while_locked" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_bookstore" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_bookstore_erotica" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_camera" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_cloud_backup" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_cloud_document_sync" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_cloud_keychain_sync" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_diagnostic_submission" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_explicit_content" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_find_my_friends_modification" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_fingerprint_for_unlock" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_game_center" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_host_pairing" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_lock_screen_control_center" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_lock_screen_notifications_view" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_lock_screen_today_view" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_open_from_managed_to_unmanaged" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_open_from_unmanaged_to_managed" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_ota_pki_updates" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_passbook_while_locked" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_photo_stream" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_safari" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_screen_shot" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_shared_stream" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_ui_configuration_profile_installation" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_untrusted_tls_prompt" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_voice_dialing" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_youtube" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allow_itunes" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="autonomous_single_app_mode_permitted_appids" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="force_encrypted_backup" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="force_itunes_store_password_entry" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="force_limit_ad_tracking" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="safari_allow_auto_fill" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
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
    "allowAccountModification",
    "allowAirdrop",
    "allowAppCellularDataModification",
    "allowAppInstallation",
    "allowAssistant",
    "allowAssistantUserGeneratedContent",
    "allowAssistantWhileLocked",
    "allowBookstore",
    "allowBookstoreErotica",
    "allowCamera",
    "allowCloudBackup",
    "allowCloudDocumentSync",
    "allowCloudKeychainSync",
    "allowDiagnosticSubmission",
    "allowExplicitContent",
    "allowFindMyFriendsModification",
    "allowFingerprintForUnlock",
    "allowGameCenter",
    "allowHostPairing",
    "allowLockScreenControlCenter",
    "allowLockScreenNotificationsView",
    "allowLockScreenTodayView",
    "allowOpenFromManagedToUnmanaged",
    "allowOpenFromUnmanagedToManaged",
    "allowOtaPkiUpdates",
    "allowPassbookWhileLocked",
    "allowPhotoStream",
    "allowSafari",
    "allowScreenShot",
    "allowSharedStream",
    "allowUiConfigurationProfileInstallation",
    "allowUntrustedTlsPrompt",
    "allowVoiceDialing",
    "allowYoutube",
    "allowItunes",
    "autonomousSingleAppModePermittedAppids",
    "forceEncryptedBackup",
    "forceItunesStorePasswordEntry",
    "forceLimitAdTracking",
    "safariAllowAutoFill"
})
public class GlobalrestrictionsState
    extends StateType
{

    @XmlElement(name = "allow_account_modification", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowAccountModification;
    @XmlElement(name = "allow_airdrop", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowAirdrop;
    @XmlElement(name = "allow_app_cellular_data_modification", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowAppCellularDataModification;
    @XmlElement(name = "allow_app_installation", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowAppInstallation;
    @XmlElement(name = "allow_assistant", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowAssistant;
    @XmlElement(name = "allow_assistant_user_generated_content", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowAssistantUserGeneratedContent;
    @XmlElement(name = "allow_assistant_while_locked", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowAssistantWhileLocked;
    @XmlElement(name = "allow_bookstore", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowBookstore;
    @XmlElement(name = "allow_bookstore_erotica", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowBookstoreErotica;
    @XmlElement(name = "allow_camera", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowCamera;
    @XmlElement(name = "allow_cloud_backup", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowCloudBackup;
    @XmlElement(name = "allow_cloud_document_sync", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowCloudDocumentSync;
    @XmlElement(name = "allow_cloud_keychain_sync", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowCloudKeychainSync;
    @XmlElement(name = "allow_diagnostic_submission", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowDiagnosticSubmission;
    @XmlElement(name = "allow_explicit_content", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowExplicitContent;
    @XmlElement(name = "allow_find_my_friends_modification", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowFindMyFriendsModification;
    @XmlElement(name = "allow_fingerprint_for_unlock", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowFingerprintForUnlock;
    @XmlElement(name = "allow_game_center", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowGameCenter;
    @XmlElement(name = "allow_host_pairing", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowHostPairing;
    @XmlElement(name = "allow_lock_screen_control_center", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowLockScreenControlCenter;
    @XmlElement(name = "allow_lock_screen_notifications_view", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowLockScreenNotificationsView;
    @XmlElement(name = "allow_lock_screen_today_view", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowLockScreenTodayView;
    @XmlElement(name = "allow_open_from_managed_to_unmanaged", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowOpenFromManagedToUnmanaged;
    @XmlElement(name = "allow_open_from_unmanaged_to_managed", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowOpenFromUnmanagedToManaged;
    @XmlElement(name = "allow_ota_pki_updates", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowOtaPkiUpdates;
    @XmlElement(name = "allow_passbook_while_locked", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowPassbookWhileLocked;
    @XmlElement(name = "allow_photo_stream", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowPhotoStream;
    @XmlElement(name = "allow_safari", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowSafari;
    @XmlElement(name = "allow_screen_shot", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowScreenShot;
    @XmlElement(name = "allow_shared_stream", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowSharedStream;
    @XmlElement(name = "allow_ui_configuration_profile_installation", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowUiConfigurationProfileInstallation;
    @XmlElement(name = "allow_untrusted_tls_prompt", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowUntrustedTlsPrompt;
    @XmlElement(name = "allow_voice_dialing", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowVoiceDialing;
    @XmlElement(name = "allow_youtube", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowYoutube;
    @XmlElement(name = "allow_itunes", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType allowItunes;
    @XmlElement(name = "autonomous_single_app_mode_permitted_appids", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateStringType autonomousSingleAppModePermittedAppids;
    @XmlElement(name = "force_encrypted_backup", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType forceEncryptedBackup;
    @XmlElement(name = "force_itunes_store_password_entry", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType forceItunesStorePasswordEntry;
    @XmlElement(name = "force_limit_ad_tracking", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType forceLimitAdTracking;
    @XmlElement(name = "safari_allow_auto_fill", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#apple_ios")
    protected EntityStateBoolType safariAllowAutoFill;

    /**
     * Gets the value of the allowAccountModification property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowAccountModification() {
        return allowAccountModification;
    }

    /**
     * Sets the value of the allowAccountModification property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowAccountModification(EntityStateBoolType value) {
        this.allowAccountModification = value;
    }

    /**
     * Gets the value of the allowAirdrop property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowAirdrop() {
        return allowAirdrop;
    }

    /**
     * Sets the value of the allowAirdrop property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowAirdrop(EntityStateBoolType value) {
        this.allowAirdrop = value;
    }

    /**
     * Gets the value of the allowAppCellularDataModification property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowAppCellularDataModification() {
        return allowAppCellularDataModification;
    }

    /**
     * Sets the value of the allowAppCellularDataModification property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowAppCellularDataModification(EntityStateBoolType value) {
        this.allowAppCellularDataModification = value;
    }

    /**
     * Gets the value of the allowAppInstallation property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowAppInstallation() {
        return allowAppInstallation;
    }

    /**
     * Sets the value of the allowAppInstallation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowAppInstallation(EntityStateBoolType value) {
        this.allowAppInstallation = value;
    }

    /**
     * Gets the value of the allowAssistant property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowAssistant() {
        return allowAssistant;
    }

    /**
     * Sets the value of the allowAssistant property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowAssistant(EntityStateBoolType value) {
        this.allowAssistant = value;
    }

    /**
     * Gets the value of the allowAssistantUserGeneratedContent property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowAssistantUserGeneratedContent() {
        return allowAssistantUserGeneratedContent;
    }

    /**
     * Sets the value of the allowAssistantUserGeneratedContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowAssistantUserGeneratedContent(EntityStateBoolType value) {
        this.allowAssistantUserGeneratedContent = value;
    }

    /**
     * Gets the value of the allowAssistantWhileLocked property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowAssistantWhileLocked() {
        return allowAssistantWhileLocked;
    }

    /**
     * Sets the value of the allowAssistantWhileLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowAssistantWhileLocked(EntityStateBoolType value) {
        this.allowAssistantWhileLocked = value;
    }

    /**
     * Gets the value of the allowBookstore property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowBookstore() {
        return allowBookstore;
    }

    /**
     * Sets the value of the allowBookstore property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowBookstore(EntityStateBoolType value) {
        this.allowBookstore = value;
    }

    /**
     * Gets the value of the allowBookstoreErotica property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowBookstoreErotica() {
        return allowBookstoreErotica;
    }

    /**
     * Sets the value of the allowBookstoreErotica property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowBookstoreErotica(EntityStateBoolType value) {
        this.allowBookstoreErotica = value;
    }

    /**
     * Gets the value of the allowCamera property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowCamera() {
        return allowCamera;
    }

    /**
     * Sets the value of the allowCamera property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowCamera(EntityStateBoolType value) {
        this.allowCamera = value;
    }

    /**
     * Gets the value of the allowCloudBackup property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowCloudBackup() {
        return allowCloudBackup;
    }

    /**
     * Sets the value of the allowCloudBackup property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowCloudBackup(EntityStateBoolType value) {
        this.allowCloudBackup = value;
    }

    /**
     * Gets the value of the allowCloudDocumentSync property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowCloudDocumentSync() {
        return allowCloudDocumentSync;
    }

    /**
     * Sets the value of the allowCloudDocumentSync property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowCloudDocumentSync(EntityStateBoolType value) {
        this.allowCloudDocumentSync = value;
    }

    /**
     * Gets the value of the allowCloudKeychainSync property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowCloudKeychainSync() {
        return allowCloudKeychainSync;
    }

    /**
     * Sets the value of the allowCloudKeychainSync property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowCloudKeychainSync(EntityStateBoolType value) {
        this.allowCloudKeychainSync = value;
    }

    /**
     * Gets the value of the allowDiagnosticSubmission property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowDiagnosticSubmission() {
        return allowDiagnosticSubmission;
    }

    /**
     * Sets the value of the allowDiagnosticSubmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowDiagnosticSubmission(EntityStateBoolType value) {
        this.allowDiagnosticSubmission = value;
    }

    /**
     * Gets the value of the allowExplicitContent property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowExplicitContent() {
        return allowExplicitContent;
    }

    /**
     * Sets the value of the allowExplicitContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowExplicitContent(EntityStateBoolType value) {
        this.allowExplicitContent = value;
    }

    /**
     * Gets the value of the allowFindMyFriendsModification property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowFindMyFriendsModification() {
        return allowFindMyFriendsModification;
    }

    /**
     * Sets the value of the allowFindMyFriendsModification property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowFindMyFriendsModification(EntityStateBoolType value) {
        this.allowFindMyFriendsModification = value;
    }

    /**
     * Gets the value of the allowFingerprintForUnlock property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowFingerprintForUnlock() {
        return allowFingerprintForUnlock;
    }

    /**
     * Sets the value of the allowFingerprintForUnlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowFingerprintForUnlock(EntityStateBoolType value) {
        this.allowFingerprintForUnlock = value;
    }

    /**
     * Gets the value of the allowGameCenter property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowGameCenter() {
        return allowGameCenter;
    }

    /**
     * Sets the value of the allowGameCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowGameCenter(EntityStateBoolType value) {
        this.allowGameCenter = value;
    }

    /**
     * Gets the value of the allowHostPairing property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowHostPairing() {
        return allowHostPairing;
    }

    /**
     * Sets the value of the allowHostPairing property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowHostPairing(EntityStateBoolType value) {
        this.allowHostPairing = value;
    }

    /**
     * Gets the value of the allowLockScreenControlCenter property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowLockScreenControlCenter() {
        return allowLockScreenControlCenter;
    }

    /**
     * Sets the value of the allowLockScreenControlCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowLockScreenControlCenter(EntityStateBoolType value) {
        this.allowLockScreenControlCenter = value;
    }

    /**
     * Gets the value of the allowLockScreenNotificationsView property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowLockScreenNotificationsView() {
        return allowLockScreenNotificationsView;
    }

    /**
     * Sets the value of the allowLockScreenNotificationsView property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowLockScreenNotificationsView(EntityStateBoolType value) {
        this.allowLockScreenNotificationsView = value;
    }

    /**
     * Gets the value of the allowLockScreenTodayView property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowLockScreenTodayView() {
        return allowLockScreenTodayView;
    }

    /**
     * Sets the value of the allowLockScreenTodayView property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowLockScreenTodayView(EntityStateBoolType value) {
        this.allowLockScreenTodayView = value;
    }

    /**
     * Gets the value of the allowOpenFromManagedToUnmanaged property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowOpenFromManagedToUnmanaged() {
        return allowOpenFromManagedToUnmanaged;
    }

    /**
     * Sets the value of the allowOpenFromManagedToUnmanaged property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowOpenFromManagedToUnmanaged(EntityStateBoolType value) {
        this.allowOpenFromManagedToUnmanaged = value;
    }

    /**
     * Gets the value of the allowOpenFromUnmanagedToManaged property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowOpenFromUnmanagedToManaged() {
        return allowOpenFromUnmanagedToManaged;
    }

    /**
     * Sets the value of the allowOpenFromUnmanagedToManaged property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowOpenFromUnmanagedToManaged(EntityStateBoolType value) {
        this.allowOpenFromUnmanagedToManaged = value;
    }

    /**
     * Gets the value of the allowOtaPkiUpdates property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowOtaPkiUpdates() {
        return allowOtaPkiUpdates;
    }

    /**
     * Sets the value of the allowOtaPkiUpdates property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowOtaPkiUpdates(EntityStateBoolType value) {
        this.allowOtaPkiUpdates = value;
    }

    /**
     * Gets the value of the allowPassbookWhileLocked property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowPassbookWhileLocked() {
        return allowPassbookWhileLocked;
    }

    /**
     * Sets the value of the allowPassbookWhileLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowPassbookWhileLocked(EntityStateBoolType value) {
        this.allowPassbookWhileLocked = value;
    }

    /**
     * Gets the value of the allowPhotoStream property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowPhotoStream() {
        return allowPhotoStream;
    }

    /**
     * Sets the value of the allowPhotoStream property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowPhotoStream(EntityStateBoolType value) {
        this.allowPhotoStream = value;
    }

    /**
     * Gets the value of the allowSafari property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowSafari() {
        return allowSafari;
    }

    /**
     * Sets the value of the allowSafari property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowSafari(EntityStateBoolType value) {
        this.allowSafari = value;
    }

    /**
     * Gets the value of the allowScreenShot property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowScreenShot() {
        return allowScreenShot;
    }

    /**
     * Sets the value of the allowScreenShot property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowScreenShot(EntityStateBoolType value) {
        this.allowScreenShot = value;
    }

    /**
     * Gets the value of the allowSharedStream property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowSharedStream() {
        return allowSharedStream;
    }

    /**
     * Sets the value of the allowSharedStream property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowSharedStream(EntityStateBoolType value) {
        this.allowSharedStream = value;
    }

    /**
     * Gets the value of the allowUiConfigurationProfileInstallation property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowUiConfigurationProfileInstallation() {
        return allowUiConfigurationProfileInstallation;
    }

    /**
     * Sets the value of the allowUiConfigurationProfileInstallation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowUiConfigurationProfileInstallation(EntityStateBoolType value) {
        this.allowUiConfigurationProfileInstallation = value;
    }

    /**
     * Gets the value of the allowUntrustedTlsPrompt property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowUntrustedTlsPrompt() {
        return allowUntrustedTlsPrompt;
    }

    /**
     * Sets the value of the allowUntrustedTlsPrompt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowUntrustedTlsPrompt(EntityStateBoolType value) {
        this.allowUntrustedTlsPrompt = value;
    }

    /**
     * Gets the value of the allowVoiceDialing property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowVoiceDialing() {
        return allowVoiceDialing;
    }

    /**
     * Sets the value of the allowVoiceDialing property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowVoiceDialing(EntityStateBoolType value) {
        this.allowVoiceDialing = value;
    }

    /**
     * Gets the value of the allowYoutube property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowYoutube() {
        return allowYoutube;
    }

    /**
     * Sets the value of the allowYoutube property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowYoutube(EntityStateBoolType value) {
        this.allowYoutube = value;
    }

    /**
     * Gets the value of the allowItunes property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowItunes() {
        return allowItunes;
    }

    /**
     * Sets the value of the allowItunes property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowItunes(EntityStateBoolType value) {
        this.allowItunes = value;
    }

    /**
     * Gets the value of the autonomousSingleAppModePermittedAppids property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getAutonomousSingleAppModePermittedAppids() {
        return autonomousSingleAppModePermittedAppids;
    }

    /**
     * Sets the value of the autonomousSingleAppModePermittedAppids property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setAutonomousSingleAppModePermittedAppids(EntityStateStringType value) {
        this.autonomousSingleAppModePermittedAppids = value;
    }

    /**
     * Gets the value of the forceEncryptedBackup property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getForceEncryptedBackup() {
        return forceEncryptedBackup;
    }

    /**
     * Sets the value of the forceEncryptedBackup property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setForceEncryptedBackup(EntityStateBoolType value) {
        this.forceEncryptedBackup = value;
    }

    /**
     * Gets the value of the forceItunesStorePasswordEntry property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getForceItunesStorePasswordEntry() {
        return forceItunesStorePasswordEntry;
    }

    /**
     * Sets the value of the forceItunesStorePasswordEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setForceItunesStorePasswordEntry(EntityStateBoolType value) {
        this.forceItunesStorePasswordEntry = value;
    }

    /**
     * Gets the value of the forceLimitAdTracking property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getForceLimitAdTracking() {
        return forceLimitAdTracking;
    }

    /**
     * Sets the value of the forceLimitAdTracking property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setForceLimitAdTracking(EntityStateBoolType value) {
        this.forceLimitAdTracking = value;
    }

    /**
     * Gets the value of the safariAllowAutoFill property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSafariAllowAutoFill() {
        return safariAllowAutoFill;
    }

    /**
     * Sets the value of the safariAllowAutoFill property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSafariAllowAutoFill(EntityStateBoolType value) {
        this.safariAllowAutoFill = value;
    }

}
