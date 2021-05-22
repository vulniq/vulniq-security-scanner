


package org.mitre.oval.xmlschema.oval_system_characteristics_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_aix.EntityItemFilesetStateType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_aix.EntityItemFixInstallationStatusType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_aix.EntityItemInterimFixStateType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_android.EntityItemEncryptionStatusType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_android.EntityItemKeyguardDisabledFeaturesType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_android.EntityItemNetworkType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_android.EntityItemPasswordQualityType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_android.EntityItemWifiAuthAlgorithmType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_android.EntityItemWifiCurrentStatusType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_android.EntityItemWifiGroupCipherType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_android.EntityItemWifiKeyMgmtType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_android.EntityItemWifiPairwiseCipherType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_android.EntityItemWifiProtocolType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_asa.EntityItemApplyServicePolicyType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_asa.EntityItemClassMapType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_asa.EntityItemInspectionType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_asa.EntityItemMatchType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_esx.EntityItemClassificationType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_esx.EntityItemSupportLevelType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_independent.EntityItemEngineType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_independent.EntityItemFamilyType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_independent.EntityItemHashTypeType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_independent.EntityItemLdaptypeType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_independent.EntityItemVariableRefType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_junos.EntityItemJunosReleaseTypeType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.EntityItemRpmVerifyResultType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_macos.EntityItemDataTypeType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_macos.EntityItemPlistTypeType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_sharepoint.EntityItemEventSeverityType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_sharepoint.EntityItemPolicyFeatureStateType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_sharepoint.EntityItemPolicyRoleType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_sharepoint.EntityItemTraceSeverityType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_sharepoint.EntityItemUrlZoneType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_solaris.EntityItemClientUUIDType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_solaris.EntityItemLDOMRoleType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_solaris.EntityItemPublisherTypeType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_solaris.EntityItemSmfServiceStateType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_solaris.EntityItemV12NEnvType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.EntityItemCapabilityType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.EntityItemEncryptMethodType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.EntityItemEndpointType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.EntityItemGconfTypeType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.EntityItemInterfaceType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.EntityItemRoutingTableFlagsType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.EntityItemWaitStatusType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.EntityItemXinetdTypeStatusType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.EntityItemAddrTypeType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.EntityItemAdstypeType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.EntityItemAuditType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.EntityItemCmdletVerbType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.EntityItemDriveTypeType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.EntityItemFileAttributeType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.EntityItemFileTypeType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.EntityItemGUIDType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.EntityItemInterfaceTypeType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.EntityItemNTUserAccountTypeType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.EntityItemNamingContextType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.EntityItemPeSubsystemType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.EntityItemPeTargetMachineType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.EntityItemRegistryHiveType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.EntityItemRegistryTypeType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.EntityItemServiceControlsAcceptedType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.EntityItemServiceCurrentStateType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.EntityItemServiceStartTypeType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.EntityItemServiceTypeType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.EntityItemSharedResourceTypeType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.EntityItemSystemMetricIndexType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.EntityItemUserRightType;


/**
 * The EntityItemStringType type is extended by the entities of an individual item. This type provides uniformity to each entity by including the attributes found in the EntityItemSimpleBaseType. This specific type describes simple string data.
 * 
 * <p>Java class for EntityItemStringType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityItemStringType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-system-characteristics-5>EntityItemSimpleBaseType">
 *       &lt;attribute name="datatype" type="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration" fixed="string" />
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityItemStringType", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5")
@XmlSeeAlso({
    EntityItemDataTypeType.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_macos.EntityItemPermissionCompareType.class,
    EntityItemPlistTypeType.class,
    EntityItemClassificationType.class,
    EntityItemSupportLevelType.class,
    EntityItemPublisherTypeType.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_solaris.EntityItemPermissionCompareType.class,
    EntityItemSmfServiceStateType.class,
    EntityItemClientUUIDType.class,
    EntityItemLDOMRoleType.class,
    EntityItemV12NEnvType.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_asa.EntityItemAccessListUseType.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_asa.EntityItemSNMPPrivStringType.class,
    EntityItemInspectionType.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_asa.EntityItemAccessListInterfaceDirectionType.class,
    EntityItemMatchType.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_asa.EntityItemSNMPVersionStringType.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_asa.EntityItemAccessListIPVersionType.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_asa.EntityItemSNMPSecLevelStringType.class,
    EntityItemClassMapType.class,
    EntityItemApplyServicePolicyType.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_asa.EntityItemSNMPAuthStringType.class,
    EntityItemWifiPairwiseCipherType.class,
    EntityItemKeyguardDisabledFeaturesType.class,
    EntityItemWifiCurrentStatusType.class,
    EntityItemWifiAuthAlgorithmType.class,
    EntityItemWifiGroupCipherType.class,
    EntityItemWifiKeyMgmtType.class,
    EntityItemPasswordQualityType.class,
    EntityItemEncryptionStatusType.class,
    EntityItemNetworkType.class,
    EntityItemWifiProtocolType.class,
    EntityItemEngineType.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_independent.EntityItemWindowsViewType.class,
    EntityItemVariableRefType.class,
    EntityItemLdaptypeType.class,
    EntityItemHashTypeType.class,
    EntityItemFamilyType.class,
    EntityItemCapabilityType.class,
    EntityItemWaitStatusType.class,
    EntityItemEndpointType.class,
    EntityItemEncryptMethodType.class,
    EntityItemRoutingTableFlagsType.class,
    EntityItemInterfaceType.class,
    EntityItemXinetdTypeStatusType.class,
    EntityItemGconfTypeType.class,
    EntityItemJunosReleaseTypeType.class,
    EntityItemPolicyFeatureStateType.class,
    EntityItemEventSeverityType.class,
    EntityItemPolicyRoleType.class,
    EntityItemUrlZoneType.class,
    EntityItemTraceSeverityType.class,
    EntityItemAdstypeType.class,
    EntityItemPeSubsystemType.class,
    EntityItemServiceControlsAcceptedType.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.EntityItemWindowsViewType.class,
    EntityItemSharedResourceTypeType.class,
    EntityItemInterfaceTypeType.class,
    EntityItemCmdletVerbType.class,
    EntityItemAuditType.class,
    EntityItemRegistryHiveType.class,
    EntityItemUserRightType.class,
    EntityItemRegistryTypeType.class,
    EntityItemServiceTypeType.class,
    EntityItemGUIDType.class,
    EntityItemAddrTypeType.class,
    EntityItemServiceStartTypeType.class,
    EntityItemFileTypeType.class,
    EntityItemFileAttributeType.class,
    EntityItemPeTargetMachineType.class,
    EntityItemDriveTypeType.class,
    EntityItemNamingContextType.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.EntityItemProtocolType.class,
    EntityItemNTUserAccountTypeType.class,
    EntityItemServiceCurrentStateType.class,
    EntityItemSystemMetricIndexType.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.EntityItemTrunkEncapType.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.EntityItemSNMPPrivStringType.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.EntityItemAccessListUseType.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.EntityItemSNMPModeStringType.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.EntityItemAccessListInterfaceDirectionType.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.EntityItemSNMPVersionStringType.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.EntityItemRoutingAuthTypeStringType.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.EntityItemSNMPSecLevelStringType.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.EntityItemAccessListIPVersionType.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.EntityItemSNMPAuthStringType.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.EntityItemSwitchportModeType.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.EntityItemRoutingProtocolType.class,
    EntityItemFixInstallationStatusType.class,
    EntityItemInterimFixStateType.class,
    EntityItemFilesetStateType.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.EntityItemAccessListUseType.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.EntityItemSNMPPrivStringType.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.EntityItemTrunkEncapType.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.EntityItemAccessListInterfaceDirectionType.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.EntityItemSNMPModeStringType.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.EntityItemSNMPVersionStringType.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.EntityItemRoutingAuthTypeStringType.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.EntityItemAccessListIPVersionType.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.EntityItemSNMPSecLevelStringType.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.EntityItemSNMPAuthStringType.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.EntityItemRoutingProtocolType.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.EntityItemSwitchportModeType.class,
    EntityItemRpmVerifyResultType.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.EntityItemProtocolType.class
})
public class EntityItemStringType
    extends EntityItemSimpleBaseType
{


}
