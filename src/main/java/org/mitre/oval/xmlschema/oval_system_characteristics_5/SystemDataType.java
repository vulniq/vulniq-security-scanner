


package org.mitre.oval.xmlschema.oval_system_characteristics_5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
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
 * The SystemDataType complex type is a container for one or more item elements. Each item defines a specific piece of data on the system.
 * 
 * <p>Java class for SystemDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}item" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemDataType", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", propOrder = {
    "item"
})
public class SystemDataType {

    @XmlElementRef(name = "item", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", type = JAXBElement.class)
    protected List<JAXBElement<? extends ItemType>> item;

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link RegistryItem }{@code >}
     * {@link JAXBElement }{@code <}{@link RegkeyeffectiverightsItem }{@code >}
     * {@link JAXBElement }{@code <}{@link PasscodepolicyItem }{@code >}
     * {@link JAXBElement }{@code <}{@link InfopolicycollItem }{@code >}
     * {@link JAXBElement }{@code <}{@link TextfilecontentItem }{@code >}
     * {@link JAXBElement }{@code <}{@link PlistItem }{@code >}
     * {@link JAXBElement }{@code <}{@link SidSidItem }{@code >}
     * {@link JAXBElement }{@code <}{@link SpsiteadministrationItem }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupSidItem }{@code >}
     * {@link JAXBElement }{@code <}{@link ClassMapItem }{@code >}
     * {@link JAXBElement }{@code <}{@link NoItem }{@code >}
     * {@link JAXBElement }{@code <}{@link SystemsetupItem }{@code >}
     * {@link JAXBElement }{@code <}{@link ActivedirectoryItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.InetlisteningserverItem }{@code >}
     * {@link JAXBElement }{@code <}{@link IflistenersItem }{@code >}
     * {@link JAXBElement }{@code <}{@link Spjobdefinition510Item }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.GlobalItem }{@code >}
     * {@link JAXBElement }{@code <}{@link PackagecheckItem }{@code >}
     * {@link JAXBElement }{@code <}{@link Sql57Item }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.GlobalItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.LineItem }{@code >}
     * {@link JAXBElement }{@code <}{@link SidItem }{@code >}
     * {@link JAXBElement }{@code <}{@link UacItem }{@code >}
     * {@link JAXBElement }{@code <}{@link FixItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.InterfaceItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.LineItem }{@code >}
     * {@link JAXBElement }{@code <}{@link Package511Item }{@code >}
     * {@link JAXBElement }{@code <}{@link PortinfoItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.SnmpgroupItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.SnmpuserItem }{@code >}
     * {@link JAXBElement }{@code <}{@link SpsiteItem }{@code >}
     * {@link JAXBElement }{@code <}{@link Filehash58Item }{@code >}
     * {@link JAXBElement }{@code <}{@link ApparmorstatusItem }{@code >}
     * {@link JAXBElement }{@code <}{@link SelinuxsecuritycontextItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_solaris.NddItem }{@code >}
     * {@link JAXBElement }{@code <}{@link SplistItem }{@code >}
     * {@link JAXBElement }{@code <}{@link VariableItem }{@code >}
     * {@link JAXBElement }{@code <}{@link SpgroupItem }{@code >}
     * {@link JAXBElement }{@code <}{@link WmiItem }{@code >}
     * {@link JAXBElement }{@code <}{@link Activedirectory57Item }{@code >}
     * {@link JAXBElement }{@code <}{@link WifiItem }{@code >}
     * {@link JAXBElement }{@code <}{@link JunctionItem }{@code >}
     * {@link JAXBElement }{@code <}{@link TelephonyItem }{@code >}
     * {@link JAXBElement }{@code <}{@link SnmpUserItem }{@code >}
     * {@link JAXBElement }{@code <}{@link InterimFixItem }{@code >}
     * {@link JAXBElement }{@code <}{@link SharedresourceeffectiverightsItem }{@code >}
     * {@link JAXBElement }{@code <}{@link SppolicyItem }{@code >}
     * {@link JAXBElement }{@code <}{@link VisdkmanagedobjectItem }{@code >}
     * {@link JAXBElement }{@code <}{@link SpjobdefinitionItem }{@code >}
     * {@link JAXBElement }{@code <}{@link SystemdetailsItem }{@code >}
     * {@link JAXBElement }{@code <}{@link FilehashItem }{@code >}
     * {@link JAXBElement }{@code <}{@link ImageItem }{@code >}
     * {@link JAXBElement }{@code <}{@link RpmverifyItem }{@code >}
     * {@link JAXBElement }{@code <}{@link SystemdunitpropertyItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_catos.LineItem }{@code >}
     * {@link JAXBElement }{@code <}{@link SpwebapplicationItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.VersionItem }{@code >}
     * {@link JAXBElement }{@code <}{@link BluetoothItem }{@code >}
     * {@link JAXBElement }{@code <}{@link RegkeyauditedpermissionsItem }{@code >}
     * {@link JAXBElement }{@code <}{@link PartitionItem }{@code >}
     * {@link JAXBElement }{@code <}{@link XmlShowItem }{@code >}
     * {@link JAXBElement }{@code <}{@link IsainfoItem }{@code >}
     * {@link JAXBElement }{@code <}{@link SccsItem }{@code >}
     * {@link JAXBElement }{@code <}{@link GetconfItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.SectionItem }{@code >}
     * {@link JAXBElement }{@code <}{@link ServicePolicyItem }{@code >}
     * {@link JAXBElement }{@code <}{@link WifinetworkItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.SnmpviewItem }{@code >}
     * {@link JAXBElement }{@code <}{@link PasswordpolicyItem }{@code >}
     * {@link JAXBElement }{@code <}{@link WuaupdatesearcherItem }{@code >}
     * {@link JAXBElement }{@code <}{@link KeychainItem }{@code >}
     * {@link JAXBElement }{@code <}{@link ItemType }{@code >}
     * {@link JAXBElement }{@code <}{@link SystemprofilerItem }{@code >}
     * {@link JAXBElement }{@code <}{@link ShadowItem }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceeffectiverightsItem }{@code >}
     * {@link JAXBElement }{@code <}{@link ConfigItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.DnscacheItem }{@code >}
     * {@link JAXBElement }{@code <}{@link Inetlisteningserver510Item }{@code >}
     * {@link JAXBElement }{@code <}{@link EncryptionItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.SnmphostItem }{@code >}
     * {@link JAXBElement }{@code <}{@link VirtualizationinfoItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.SnmpcommunityItem }{@code >}
     * {@link JAXBElement }{@code <}{@link RpmverifyfileItem }{@code >}
     * {@link JAXBElement }{@code <}{@link FileeffectiverightsItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_pixos.VersionItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_solaris.PatchItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.SnmpviewItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.AclItem }{@code >}
     * {@link JAXBElement }{@code <}{@link RoutingtableItem }{@code >}
     * {@link JAXBElement }{@code <}{@link InetdItem }{@code >}
     * {@link JAXBElement }{@code <}{@link AuditeventpolicyItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_hpux.NddItem }{@code >}
     * {@link JAXBElement }{@code <}{@link UserSidItem }{@code >}
     * {@link JAXBElement }{@code <}{@link ShowItem }{@code >}
     * {@link JAXBElement }{@code <}{@link LicenseItem }{@code >}
     * {@link JAXBElement }{@code <}{@link Ldap57Item }{@code >}
     * {@link JAXBElement }{@code <}{@link RlimitItem }{@code >}
     * {@link JAXBElement }{@code <}{@link AuditeventpolicysubcategoriesItem }{@code >}
     * {@link JAXBElement }{@code <}{@link SelinuxbooleanItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.DnscacheItem }{@code >}
     * {@link JAXBElement }{@code <}{@link SharedresourceItem }{@code >}
     * {@link JAXBElement }{@code <}{@link GlobalrestrictionsItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_android.PasswordItem }{@code >}
     * {@link JAXBElement }{@code <}{@link CameraItem }{@code >}
     * {@link JAXBElement }{@code <}{@link UserrightItem }{@code >}
     * {@link JAXBElement }{@code <}{@link FacetItem }{@code >}
     * {@link JAXBElement }{@code <}{@link DiskutilItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.InterfaceItem }{@code >}
     * {@link JAXBElement }{@code <}{@link VolumeItem }{@code >}
     * {@link JAXBElement }{@code <}{@link VariantItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.RoutingprotocolauthintfItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.SnmpgroupItem }{@code >}
     * {@link JAXBElement }{@code <}{@link PackagepublisherItem }{@code >}
     * {@link JAXBElement }{@code <}{@link FamilyItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.BgpneighborItem }{@code >}
     * {@link JAXBElement }{@code <}{@link AccountinfoItem }{@code >}
     * {@link JAXBElement }{@code <}{@link LaunchdItem }{@code >}
     * {@link JAXBElement }{@code <}{@link SlackwarepkginfoItem }{@code >}
     * {@link JAXBElement }{@code <}{@link Process58Item }{@code >}
     * {@link JAXBElement }{@code <}{@link FileextendedattributeItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_asa.AclItem }{@code >}
     * {@link JAXBElement }{@code <}{@link RunlevelItem }{@code >}
     * {@link JAXBElement }{@code <}{@link SqlItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.BgpneighborItem }{@code >}
     * {@link JAXBElement }{@code <}{@link UserItem }{@code >}
     * {@link JAXBElement }{@code <}{@link OslevelItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_junos.VersionItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_macos.InetlisteningserverItem }{@code >}
     * {@link JAXBElement }{@code <}{@link SnmpHostItem }{@code >}
     * {@link JAXBElement }{@code <}{@link PrintereffectiverightsItem }{@code >}
     * {@link JAXBElement }{@code <}{@link SwlistItem }{@code >}
     * {@link JAXBElement }{@code <}{@link PortItem }{@code >}
     * {@link JAXBElement }{@code <}{@link PackageavoidlistItem }{@code >}
     * {@link JAXBElement }{@code <}{@link GconfItem }{@code >}
     * {@link JAXBElement }{@code <}{@link SystemmetricItem }{@code >}
     * {@link JAXBElement }{@code <}{@link LockoutpolicyItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.FileItem }{@code >}
     * {@link JAXBElement }{@code <}{@link Wmi57Item }{@code >}
     * {@link JAXBElement }{@code <}{@link SpantivirussettingsItem }{@code >}
     * {@link JAXBElement }{@code <}{@link LocationserviceItem }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_asa.VersionItem }{@code >}
     * {@link JAXBElement }{@code <}{@link GatekeeperItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.ProcessItem }{@code >}
     * {@link JAXBElement }{@code <}{@link Environmentvariable58Item }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.AclItem }{@code >}
     * {@link JAXBElement }{@code <}{@link SpwebItem }{@code >}
     * {@link JAXBElement }{@code <}{@link Pwpolicy59Item }{@code >}
     * {@link JAXBElement }{@code <}{@link FileauditedpermissionsItem }{@code >}
     * {@link JAXBElement }{@code <}{@link TcpMapItem }{@code >}
     * {@link JAXBElement }{@code <}{@link ModuleItem }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupItem }{@code >}
     * {@link JAXBElement }{@code <}{@link CmdletItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.InterfaceItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.SnmpuserItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.InterfaceItem }{@code >}
     * {@link JAXBElement }{@code <}{@link PackageItem }{@code >}
     * {@link JAXBElement }{@code <}{@link SmfpropertyItem }{@code >}
     * {@link JAXBElement }{@code <}{@link RpmverifypackageItem }{@code >}
     * {@link JAXBElement }{@code <}{@link SharedresourceauditedpermissionsItem }{@code >}
     * {@link JAXBElement }{@code <}{@link PwpolicyItem }{@code >}
     * {@link JAXBElement }{@code <}{@link PolicyMapItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_catos.VersionItem }{@code >}
     * {@link JAXBElement }{@code <}{@link SymlinkItem }{@code >}
     * {@link JAXBElement }{@code <}{@link AppmanagerItem }{@code >}
     * {@link JAXBElement }{@code <}{@link SysctlItem }{@code >}
     * {@link JAXBElement }{@code <}{@link BestbetItem }{@code >}
     * {@link JAXBElement }{@code <}{@link NtuserItem }{@code >}
     * {@link JAXBElement }{@code <}{@link CorestorageItem }{@code >}
     * {@link JAXBElement }{@code <}{@link SpdiagnosticslevelItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.ProcessItem }{@code >}
     * {@link JAXBElement }{@code <}{@link SnmpItem }{@code >}
     * {@link JAXBElement }{@code <}{@link SppolicyfeatureItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_asa.InterfaceItem }{@code >}
     * {@link JAXBElement }{@code <}{@link AuthorizationdbItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_asa.LineItem }{@code >}
     * {@link JAXBElement }{@code <}{@link NetworkItem }{@code >}
     * {@link JAXBElement }{@code <}{@link TrustedItem }{@code >}
     * {@link JAXBElement }{@code <}{@link SpdiagnosticsserviceItem }{@code >}
     * {@link JAXBElement }{@code <}{@link ProfileItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.SnmphostItem }{@code >}
     * {@link JAXBElement }{@code <}{@link TclshItem }{@code >}
     * {@link JAXBElement }{@code <}{@link EnvironmentvariableItem }{@code >}
     * {@link JAXBElement }{@code <}{@link PeheaderItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_esx.VersionItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_hpux.PatchItem }{@code >}
     * {@link JAXBElement }{@code <}{@link RpminfoItem }{@code >}
     * {@link JAXBElement }{@code <}{@link NvramItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.RouterItem }{@code >}
     * {@link JAXBElement }{@code <}{@link SystemdunitdependencyItem }{@code >}
     * {@link JAXBElement }{@code <}{@link HttpdItem }{@code >}
     * {@link JAXBElement }{@code <}{@link MetabaseItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_esx.PatchItem }{@code >}
     * {@link JAXBElement }{@code <}{@link DevicesettingsItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.SnmpcommunityItem }{@code >}
     * {@link JAXBElement }{@code <}{@link SpcrawlruleItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_pixos.LineItem }{@code >}
     * {@link JAXBElement }{@code <}{@link DpkginfoItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.PasswordItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.SectionItem }{@code >}
     * {@link JAXBElement }{@code <}{@link AccesstokenItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.FileItem }{@code >}
     * {@link JAXBElement }{@code <}{@link UnameItem }{@code >}
     * {@link JAXBElement }{@code <}{@link SnmpGroupItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.RouterItem }{@code >}
     * {@link JAXBElement }{@code <}{@link Plist511Item }{@code >}
     * {@link JAXBElement }{@code <}{@link SmfItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.VersionItem }{@code >}
     * {@link JAXBElement }{@code <}{@link FilesetItem }{@code >}
     * {@link JAXBElement }{@code <}{@link CertificateItem }{@code >}
     * {@link JAXBElement }{@code <}{@link XinetdItem }{@code >}
     * {@link JAXBElement }{@code <}{@link XmlConfigItem }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.RoutingprotocolauthintfItem }{@code >}
     * {@link JAXBElement }{@code <}{@link LdapItem }{@code >}
     * {@link JAXBElement }{@code <}{@link XmlfilecontentItem }{@code >}
     * {@link JAXBElement }{@code <}{@link PackagefreezelistItem }{@code >}
     * {@link JAXBElement }{@code <}{@link SoftwareupdateItem }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends ItemType>> getItem() {
        if (item == null) {
            item = new ArrayList<JAXBElement<? extends ItemType>>();
        }
        return this.item;
    }

}
