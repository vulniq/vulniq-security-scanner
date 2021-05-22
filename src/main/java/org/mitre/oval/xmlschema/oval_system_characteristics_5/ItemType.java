


package org.mitre.oval.xmlschema.oval_system_characteristics_5;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_common_5.MessageType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_aix.FilesetItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_aix.FixItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_aix.InterimFixItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_aix.NoItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_aix.OslevelItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_android.AppmanagerItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_android.BluetoothItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_android.CameraItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_android.CertificateItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_android.DevicesettingsItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_android.EncryptionItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_android.LocationserviceItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_android.NetworkItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_android.SystemdetailsItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_android.TelephonyItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_android.WifiItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_android.WifinetworkItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_apache.HttpdItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_apple_ios.GlobalrestrictionsItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_apple_ios.PasscodepolicyItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_apple_ios.ProfileItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_asa.ClassMapItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_asa.PolicyMapItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_asa.ServicePolicyItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_asa.SnmpGroupItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_asa.SnmpHostItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_asa.SnmpUserItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_asa.TcpMapItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_catos.ModuleItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_esx.VisdkmanagedobjectItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_freebsd.PortinfoItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_hpux.GetconfItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_hpux.SwlistItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_hpux.TrustedItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_independent.Environmentvariable58Item;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_independent.EnvironmentvariableItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_independent.FamilyItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_independent.Filehash58Item;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_independent.FilehashItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_independent.Ldap57Item;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_independent.LdapItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_independent.Sql57Item;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_independent.SqlItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_independent.TextfilecontentItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_independent.VariableItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_independent.XmlfilecontentItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.SnmpItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.TclshItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_junos.ShowItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_junos.XmlConfigItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_junos.XmlShowItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.ApparmorstatusItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.DpkginfoItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.IflistenersItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.PartitionItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.RpminfoItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.RpmverifyItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.RpmverifyfileItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.RpmverifypackageItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.SelinuxbooleanItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.SelinuxsecuritycontextItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.SlackwarepkginfoItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.SystemdunitdependencyItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.SystemdunitpropertyItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_macos.AccountinfoItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_macos.AuthorizationdbItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_macos.CorestorageItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_macos.DiskutilItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_macos.GatekeeperItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_macos.Inetlisteningserver510Item;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_macos.KeychainItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_macos.LaunchdItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_macos.NvramItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_macos.Plist511Item;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_macos.PlistItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_macos.Pwpolicy59Item;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_macos.PwpolicyItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_macos.RlimitItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_macos.SoftwareupdateItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_macos.SystemprofilerItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_macos.SystemsetupItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_netconf.ConfigItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_sharepoint.BestbetItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_sharepoint.InfopolicycollItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_sharepoint.SpantivirussettingsItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_sharepoint.SpcrawlruleItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_sharepoint.SpdiagnosticslevelItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_sharepoint.SpdiagnosticsserviceItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_sharepoint.SpgroupItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_sharepoint.Spjobdefinition510Item;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_sharepoint.SpjobdefinitionItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_sharepoint.SplistItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_sharepoint.SppolicyItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_sharepoint.SppolicyfeatureItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_sharepoint.SpsiteItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_sharepoint.SpsiteadministrationItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_sharepoint.SpwebItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_sharepoint.SpwebapplicationItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_solaris.FacetItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_solaris.ImageItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_solaris.IsainfoItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_solaris.Package511Item;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_solaris.PackageItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_solaris.PackageavoidlistItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_solaris.PackagecheckItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_solaris.PackagefreezelistItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_solaris.PackagepublisherItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_solaris.SmfItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_solaris.SmfpropertyItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_solaris.VariantItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_solaris.VirtualizationinfoItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.FileextendedattributeItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.GconfItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.InetdItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.Process58Item;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.RoutingtableItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.RunlevelItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.SccsItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.ShadowItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.SymlinkItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.SysctlItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.UnameItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.XinetdItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.AccesstokenItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.Activedirectory57Item;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.ActivedirectoryItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.AuditeventpolicyItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.AuditeventpolicysubcategoriesItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.CmdletItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.FileauditedpermissionsItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.FileeffectiverightsItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.GroupItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.GroupSidItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.JunctionItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.LicenseItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.LockoutpolicyItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.MetabaseItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.NtuserItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.PasswordpolicyItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.PeheaderItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.PortItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.PrintereffectiverightsItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.RegistryItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.RegkeyauditedpermissionsItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.RegkeyeffectiverightsItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.ServiceItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.ServiceeffectiverightsItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.SharedresourceItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.SharedresourceauditedpermissionsItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.SharedresourceeffectiverightsItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.SidItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.SidSidItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.SystemmetricItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.UacItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.UserItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.UserSidItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.UserrightItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.VolumeItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.Wmi57Item;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.WmiItem;
import org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.WuaupdatesearcherItem;


/**
 * In some cases, when an item for a specified object does not exist, it may be beneficial to report a partial match of an item showing what entities did exist and what entities did not exist for debugging purposes. This is especially true when considering items that are collected by objects with hierarchical object entities. An example of such a case is when a file_object has a path entity equal to 'C:\' and a filename entity equal to 'test.txt' where 'test.txt' does not exist in the 'C:\' directory. This would result in the creation of a partially matching file_item with a status of 'does not exist' where the path entity equals 'C:\' and the filename entity equals 'test.txt' with a status of 'does not exist'. By showing the partial match, someone reading a system-characteristics document can quickly see that a matching file_item did not exist because the specified filename did not exist and not that the specified path did not exist. Again, please note that the implementation of partial matches, when an item for a specified object does not exist,  is completely optional.  
 * 
 * <p>Java class for ItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="message" type="{http://oval.mitre.org/XMLSchema/oval-common-5}MessageType" maxOccurs="50" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://oval.mitre.org/XMLSchema/oval-common-5}ItemIDPattern" />
 *       &lt;attribute name="status" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}StatusEnumeration" default="exists" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemType", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", propOrder = {
    "message"
})
@XmlSeeAlso({
    GetconfItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_hpux.NddItem.class,
    SwlistItem.class,
    TrustedItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_hpux.PatchItem.class,
    Plist511Item.class,
    SystemprofilerItem.class,
    AccountinfoItem.class,
    PlistItem.class,
    AuthorizationdbItem.class,
    Inetlisteningserver510Item.class,
    CorestorageItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_macos.InetlisteningserverItem.class,
    PwpolicyItem.class,
    GatekeeperItem.class,
    NvramItem.class,
    KeychainItem.class,
    SoftwareupdateItem.class,
    RlimitItem.class,
    SystemsetupItem.class,
    DiskutilItem.class,
    LaunchdItem.class,
    Pwpolicy59Item.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_esx.VersionItem.class,
    VisdkmanagedobjectItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_esx.PatchItem.class,
    VariantItem.class,
    FacetItem.class,
    Package511Item.class,
    PackagecheckItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_solaris.NddItem.class,
    ImageItem.class,
    SmfItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_solaris.PatchItem.class,
    PackageavoidlistItem.class,
    PackagefreezelistItem.class,
    VirtualizationinfoItem.class,
    PackageItem.class,
    SmfpropertyItem.class,
    IsainfoItem.class,
    PackagepublisherItem.class,
    SnmpHostItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_asa.LineItem.class,
    PolicyMapItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_asa.VersionItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_asa.AclItem.class,
    TcpMapItem.class,
    ServicePolicyItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_asa.InterfaceItem.class,
    SnmpUserItem.class,
    SnmpGroupItem.class,
    ClassMapItem.class,
    BluetoothItem.class,
    CertificateItem.class,
    WifiItem.class,
    WifinetworkItem.class,
    AppmanagerItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_android.PasswordItem.class,
    DevicesettingsItem.class,
    NetworkItem.class,
    SystemdetailsItem.class,
    TelephonyItem.class,
    CameraItem.class,
    LocationserviceItem.class,
    EncryptionItem.class,
    PortinfoItem.class,
    LdapItem.class,
    Sql57Item.class,
    TextfilecontentItem.class,
    VariableItem.class,
    FamilyItem.class,
    Ldap57Item.class,
    XmlfilecontentItem.class,
    EnvironmentvariableItem.class,
    Environmentvariable58Item.class,
    SqlItem.class,
    FilehashItem.class,
    Filehash58Item.class,
    InetdItem.class,
    SymlinkItem.class,
    UnameItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.ProcessItem.class,
    FileextendedattributeItem.class,
    GconfItem.class,
    SysctlItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.InterfaceItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.DnscacheItem.class,
    XinetdItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.FileItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.PasswordItem.class,
    ShadowItem.class,
    SccsItem.class,
    RunlevelItem.class,
    RoutingtableItem.class,
    Process58Item.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_junos.VersionItem.class,
    XmlConfigItem.class,
    ShowItem.class,
    XmlShowItem.class,
    HttpdItem.class,
    GlobalrestrictionsItem.class,
    PasscodepolicyItem.class,
    ProfileItem.class,
    SpsiteItem.class,
    InfopolicycollItem.class,
    SpdiagnosticslevelItem.class,
    SpsiteadministrationItem.class,
    BestbetItem.class,
    SppolicyItem.class,
    SpwebapplicationItem.class,
    SppolicyfeatureItem.class,
    SpcrawlruleItem.class,
    Spjobdefinition510Item.class,
    SpwebItem.class,
    SpantivirussettingsItem.class,
    SplistItem.class,
    SpgroupItem.class,
    SpdiagnosticsserviceItem.class,
    SpjobdefinitionItem.class,
    ServiceeffectiverightsItem.class,
    SidItem.class,
    NtuserItem.class,
    LicenseItem.class,
    PeheaderItem.class,
    FileauditedpermissionsItem.class,
    UserrightItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.InterfaceItem.class,
    Wmi57Item.class,
    VolumeItem.class,
    RegistryItem.class,
    ActivedirectoryItem.class,
    AuditeventpolicyItem.class,
    CmdletItem.class,
    MetabaseItem.class,
    PasswordpolicyItem.class,
    AccesstokenItem.class,
    WuaupdatesearcherItem.class,
    SharedresourceauditedpermissionsItem.class,
    RegkeyeffectiverightsItem.class,
    SystemmetricItem.class,
    SidSidItem.class,
    PortItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.ProcessItem.class,
    FileeffectiverightsItem.class,
    SharedresourceeffectiverightsItem.class,
    GroupSidItem.class,
    ServiceItem.class,
    SharedresourceItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.DnscacheItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.FileItem.class,
    UserItem.class,
    JunctionItem.class,
    LockoutpolicyItem.class,
    UserSidItem.class,
    WmiItem.class,
    Activedirectory57Item.class,
    AuditeventpolicysubcategoriesItem.class,
    UacItem.class,
    PrintereffectiverightsItem.class,
    GroupItem.class,
    RegkeyauditedpermissionsItem.class,
    ConfigItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.RouterItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.SnmphostItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.SnmpcommunityItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.SnmpuserItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.SnmpviewItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.VersionItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.RoutingprotocolauthintfItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.SectionItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.InterfaceItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.LineItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.BgpneighborItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.AclItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.GlobalItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.SnmpgroupItem.class,
    NoItem.class,
    OslevelItem.class,
    FilesetItem.class,
    FixItem.class,
    InterimFixItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.RouterItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.SnmphostItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.SnmpcommunityItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.SnmpuserItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.SnmpviewItem.class,
    SnmpItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.VersionItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.RoutingprotocolauthintfItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.SectionItem.class,
    TclshItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.InterfaceItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.LineItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.BgpneighborItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.AclItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.GlobalItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.SnmpgroupItem.class,
    RpmverifypackageItem.class,
    ApparmorstatusItem.class,
    RpminfoItem.class,
    SystemdunitpropertyItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.InetlisteningserverItem.class,
    SelinuxsecuritycontextItem.class,
    DpkginfoItem.class,
    PartitionItem.class,
    IflistenersItem.class,
    RpmverifyfileItem.class,
    SelinuxbooleanItem.class,
    SlackwarepkginfoItem.class,
    SystemdunitdependencyItem.class,
    RpmverifyItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_pixos.LineItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_pixos.VersionItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_catos.LineItem.class,
    ModuleItem.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_catos.VersionItem.class
})
public class ItemType {

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5")
    protected List<MessageType> message;
    @XmlAttribute(name = "id", required = true)
    protected BigInteger id;
    @XmlAttribute(name = "status")
    protected StatusEnumeration status;

    /**
     * Gets the value of the message property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the message property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageType }
     * 
     * 
     */
    public List<MessageType> getMessage() {
        if (message == null) {
            message = new ArrayList<MessageType>();
        }
        return this.message;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusEnumeration }
     *     
     */
    public StatusEnumeration getStatus() {
        if (status == null) {
            return StatusEnumeration.EXISTS;
        } else {
            return status;
        }
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusEnumeration }
     *     
     */
    public void setStatus(StatusEnumeration value) {
        this.status = value;
    }

}
