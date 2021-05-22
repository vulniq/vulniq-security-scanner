


package org.mitre.oval.xmlschema.oval_definitions_5;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_common_5.NotesType;
import org.mitre.oval.xmlschema.oval_definitions_5_aix.FilesetObject;
import org.mitre.oval.xmlschema.oval_definitions_5_aix.FixObject;
import org.mitre.oval.xmlschema.oval_definitions_5_aix.InterimFixObject;
import org.mitre.oval.xmlschema.oval_definitions_5_aix.NoObject;
import org.mitre.oval.xmlschema.oval_definitions_5_aix.OslevelObject;
import org.mitre.oval.xmlschema.oval_definitions_5_android.AppmanagerObject;
import org.mitre.oval.xmlschema.oval_definitions_5_android.BluetoothObject;
import org.mitre.oval.xmlschema.oval_definitions_5_android.CameraObject;
import org.mitre.oval.xmlschema.oval_definitions_5_android.CertificateObject;
import org.mitre.oval.xmlschema.oval_definitions_5_android.DevicesettingsObject;
import org.mitre.oval.xmlschema.oval_definitions_5_android.EncryptionObject;
import org.mitre.oval.xmlschema.oval_definitions_5_android.LocationserviceObject;
import org.mitre.oval.xmlschema.oval_definitions_5_android.NetworkObject;
import org.mitre.oval.xmlschema.oval_definitions_5_android.SystemdetailsObject;
import org.mitre.oval.xmlschema.oval_definitions_5_android.TelephonyObject;
import org.mitre.oval.xmlschema.oval_definitions_5_android.WifiObject;
import org.mitre.oval.xmlschema.oval_definitions_5_android.WifinetworkObject;
import org.mitre.oval.xmlschema.oval_definitions_5_apache.HttpdObject;
import org.mitre.oval.xmlschema.oval_definitions_5_apple_ios.GlobalrestrictionsObject;
import org.mitre.oval.xmlschema.oval_definitions_5_apple_ios.PasscodepolicyObject;
import org.mitre.oval.xmlschema.oval_definitions_5_apple_ios.ProfileObject;
import org.mitre.oval.xmlschema.oval_definitions_5_asa.ClassMapObject;
import org.mitre.oval.xmlschema.oval_definitions_5_asa.PolicyMapObject;
import org.mitre.oval.xmlschema.oval_definitions_5_asa.ServicePolicyObject;
import org.mitre.oval.xmlschema.oval_definitions_5_asa.SnmpGroupObject;
import org.mitre.oval.xmlschema.oval_definitions_5_asa.SnmpHostObject;
import org.mitre.oval.xmlschema.oval_definitions_5_asa.SnmpUserObject;
import org.mitre.oval.xmlschema.oval_definitions_5_asa.TcpMapObject;
import org.mitre.oval.xmlschema.oval_definitions_5_catos.ModuleObject;
import org.mitre.oval.xmlschema.oval_definitions_5_esx.Patch56Object;
import org.mitre.oval.xmlschema.oval_definitions_5_esx.VisdkmanagedobjectObject;
import org.mitre.oval.xmlschema.oval_definitions_5_freebsd.PortinfoObject;
import org.mitre.oval.xmlschema.oval_definitions_5_hpux.GetconfObject;
import org.mitre.oval.xmlschema.oval_definitions_5_hpux.Patch53Object;
import org.mitre.oval.xmlschema.oval_definitions_5_hpux.SwlistObject;
import org.mitre.oval.xmlschema.oval_definitions_5_hpux.TrustedObject;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.Environmentvariable58Object;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.EnvironmentvariableObject;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.FamilyObject;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.Filehash58Object;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.FilehashObject;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.Ldap57Object;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.LdapObject;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.Sql57Object;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.SqlObject;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.Textfilecontent54Object;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.TextfilecontentObject;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.VariableObject;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.XmlfilecontentObject;
import org.mitre.oval.xmlschema.oval_definitions_5_ios.SnmpObject;
import org.mitre.oval.xmlschema.oval_definitions_5_ios.TclshObject;
import org.mitre.oval.xmlschema.oval_definitions_5_junos.ShowObject;
import org.mitre.oval.xmlschema.oval_definitions_5_junos.XmlConfigObject;
import org.mitre.oval.xmlschema.oval_definitions_5_junos.XmlShowObject;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.ApparmorstatusObject;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.DpkginfoObject;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.IflistenersObject;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.PartitionObject;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.RpminfoObject;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifyObject;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifyfileObject;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifypackageObject;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.SelinuxbooleanObject;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.SelinuxsecuritycontextObject;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.SlackwarepkginfoObject;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.SystemdunitdependencyObject;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.SystemdunitpropertyObject;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.AccountinfoObject;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.AuthorizationdbObject;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.CorestorageObject;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.DiskutilObject;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.GatekeeperObject;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.Inetlisteningserver510Object;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.KeychainObject;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.LaunchdObject;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.NvramObject;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.Plist510Object;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.Plist511Object;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.PlistObject;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.Pwpolicy59Object;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.PwpolicyObject;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.RlimitObject;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.SoftwareupdateObject;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.SystemprofilerObject;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.SystemsetupObject;
import org.mitre.oval.xmlschema.oval_definitions_5_netconf.ConfigObject;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.BestbetObject;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.InfopolicycollObject;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SpantivirussettingsObject;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SpcrawlruleObject;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SpdiagnosticslevelObject;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SpdiagnosticsserviceObject;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SpgroupObject;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.Spjobdefinition510Object;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SpjobdefinitionObject;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SplistObject;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SppolicyObject;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SppolicyfeatureObject;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SpsiteObject;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SpsiteadministrationObject;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SpwebObject;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SpwebapplicationObject;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.FacetObject;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.ImageObject;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.IsainfoObject;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.Package511Object;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.PackageObject;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.PackageavoidlistObject;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.PackagecheckObject;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.PackagefreezelistObject;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.PackagepublisherObject;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.Patch54Object;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.SmfObject;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.SmfpropertyObject;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.VariantObject;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.VirtualizationinfoObject;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.FileextendedattributeObject;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.GconfObject;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.InetdObject;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.RoutingtableObject;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.RunlevelObject;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.SccsObject;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.ShadowObject;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.SymlinkObject;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.SysctlObject;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.UnameObject;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.XinetdObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.AccesstokenObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.Activedirectory57Object;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.ActivedirectoryObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.AuditeventpolicyObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.AuditeventpolicysubcategoriesObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.CmdletObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.Fileauditedpermissions53Object;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.FileauditedpermissionsObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.Fileeffectiverights53Object;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.FileeffectiverightsObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.GroupObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.GroupSidObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.JunctionObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.LicenseObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.LockoutpolicyObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.MetabaseObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.NtuserObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.PasswordpolicyObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.PeheaderObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.PortObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.PrintereffectiverightsObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.RegistryObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.Regkeyauditedpermissions53Object;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.RegkeyauditedpermissionsObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.Regkeyeffectiverights53Object;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.RegkeyeffectiverightsObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.ServiceObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.ServiceeffectiverightsObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.SharedresourceObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.SharedresourceauditedpermissionsObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.SharedresourceeffectiverightsObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.SidObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.SidSidObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.SystemmetricObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.UacObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.UserObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.UserSid55Object;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.UserSidObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.UserrightObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.VolumeObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.Wmi57Object;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.WmiObject;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.WuaupdatesearcherObject;
import org.w3._2000._09.xmldsig_.SignatureType;


/**
 * The required id attribute uniquely identifies each object, and must conform to the format specified by the ObjectIdPattern simple type. The required version attribute holds the current version of the object element. Versions are integers, starting at 1 and incrementing every time an object is modified. The optional comment attribute provides a short description of the object. The optional deprecated attribute signifies that an id is no longer to be used or referenced but the information has been kept around for historic purposes.
 * 
 * <p>Java class for ObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/>
 *         &lt;element ref="{http://oval.mitre.org/XMLSchema/oval-common-5}notes" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://oval.mitre.org/XMLSchema/oval-common-5}ObjectIDPattern" />
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="comment" type="{http://oval.mitre.org/XMLSchema/oval-common-5}NonEmptyStringType" />
 *       &lt;attribute name="deprecated" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", propOrder = {
    "signature",
    "notes"
})
@XmlSeeAlso({
    OslevelObject.class,
    FilesetObject.class,
    NoObject.class,
    InterimFixObject.class,
    FixObject.class,
    UserSid55Object.class,
    org.mitre.oval.xmlschema.oval_definitions_5_windows.FileObject.class,
    UserObject.class,
    Regkeyauditedpermissions53Object.class,
    PasswordpolicyObject.class,
    AuditeventpolicyObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_windows.InterfaceObject.class,
    UacObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_windows.ProcessObject.class,
    LicenseObject.class,
    MetabaseObject.class,
    FileeffectiverightsObject.class,
    AccesstokenObject.class,
    JunctionObject.class,
    PortObject.class,
    ActivedirectoryObject.class,
    LockoutpolicyObject.class,
    FileauditedpermissionsObject.class,
    SystemmetricObject.class,
    SharedresourceeffectiverightsObject.class,
    AuditeventpolicysubcategoriesObject.class,
    SharedresourceObject.class,
    PeheaderObject.class,
    CmdletObject.class,
    Wmi57Object.class,
    Fileeffectiverights53Object.class,
    GroupObject.class,
    Fileauditedpermissions53Object.class,
    SidObject.class,
    RegistryObject.class,
    NtuserObject.class,
    WmiObject.class,
    ServiceObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_windows.Process58Object.class,
    RegkeyeffectiverightsObject.class,
    UserSidObject.class,
    PrintereffectiverightsObject.class,
    Regkeyeffectiverights53Object.class,
    SharedresourceauditedpermissionsObject.class,
    RegkeyauditedpermissionsObject.class,
    ServiceeffectiverightsObject.class,
    UserrightObject.class,
    VolumeObject.class,
    WuaupdatesearcherObject.class,
    GroupSidObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_windows.DnscacheObject.class,
    SidSidObject.class,
    Activedirectory57Object.class,
    org.mitre.oval.xmlschema.oval_definitions_5_esx.VersionObject.class,
    VisdkmanagedobjectObject.class,
    Patch56Object.class,
    org.mitre.oval.xmlschema.oval_definitions_5_esx.PatchObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_pixos.LineObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_pixos.VersionObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_hpux.NddObject.class,
    GetconfObject.class,
    Patch53Object.class,
    TrustedObject.class,
    SwlistObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_hpux.PatchObject.class,
    ConfigObject.class,
    Spjobdefinition510Object.class,
    SpsiteObject.class,
    SpgroupObject.class,
    SpwebObject.class,
    SpdiagnosticsserviceObject.class,
    BestbetObject.class,
    SppolicyObject.class,
    SpcrawlruleObject.class,
    SpsiteadministrationObject.class,
    SpwebapplicationObject.class,
    SppolicyfeatureObject.class,
    SplistObject.class,
    SpjobdefinitionObject.class,
    SpdiagnosticslevelObject.class,
    InfopolicycollObject.class,
    SpantivirussettingsObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_solaris.NddObject.class,
    ImageObject.class,
    PackageObject.class,
    VariantObject.class,
    PackageavoidlistObject.class,
    FacetObject.class,
    SmfpropertyObject.class,
    IsainfoObject.class,
    PackagefreezelistObject.class,
    Patch54Object.class,
    SmfObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_solaris.PatchObject.class,
    VirtualizationinfoObject.class,
    PackagepublisherObject.class,
    PackagecheckObject.class,
    Package511Object.class,
    SnmpUserObject.class,
    SnmpHostObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_asa.VersionObject.class,
    ServicePolicyObject.class,
    TcpMapObject.class,
    SnmpGroupObject.class,
    ClassMapObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_asa.InterfaceObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_asa.LineObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_asa.AclObject.class,
    PolicyMapObject.class,
    Ldap57Object.class,
    Textfilecontent54Object.class,
    XmlfilecontentObject.class,
    Sql57Object.class,
    Environmentvariable58Object.class,
    EnvironmentvariableObject.class,
    LdapObject.class,
    Filehash58Object.class,
    TextfilecontentObject.class,
    VariableObject.class,
    FilehashObject.class,
    SqlObject.class,
    FamilyObject.class,
    CertificateObject.class,
    WifinetworkObject.class,
    CameraObject.class,
    SystemdetailsObject.class,
    BluetoothObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_android.PasswordObject.class,
    WifiObject.class,
    LocationserviceObject.class,
    NetworkObject.class,
    DevicesettingsObject.class,
    TelephonyObject.class,
    EncryptionObject.class,
    AppmanagerObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.SnmpcommunityObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.VersionObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.SnmpgroupObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.GlobalObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.RouterObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.InterfaceObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.SnmpviewObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.LineObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.RoutingprotocolauthintfObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.BgpneighborObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.SnmpuserObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.AclObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.SnmphostObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.SectionObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.SnmpcommunityObject.class,
    SnmpObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.GlobalObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.RouterObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.InterfaceObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.SnmpviewObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.LineObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.RoutingprotocolauthintfObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.SnmpuserObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.AclObject.class,
    TclshObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.VersionObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.SnmpgroupObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.Version55Object.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.BgpneighborObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.SnmphostObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.SectionObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_junos.VersionObject.class,
    XmlConfigObject.class,
    ShowObject.class,
    XmlShowObject.class,
    RpmverifyObject.class,
    SelinuxbooleanObject.class,
    RpminfoObject.class,
    ApparmorstatusObject.class,
    SlackwarepkginfoObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.InetlisteningserversObject.class,
    SystemdunitpropertyObject.class,
    RpmverifypackageObject.class,
    SystemdunitdependencyObject.class,
    DpkginfoObject.class,
    PartitionObject.class,
    IflistenersObject.class,
    RpmverifyfileObject.class,
    SelinuxsecuritycontextObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_catos.LineObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_catos.VersionObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_catos.Version55Object.class,
    ModuleObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.FileObject.class,
    InetdObject.class,
    FileextendedattributeObject.class,
    SysctlObject.class,
    ShadowObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.InterfaceObject.class,
    GconfObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.ProcessObject.class,
    SccsObject.class,
    RunlevelObject.class,
    SymlinkObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.Process58Object.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.PasswordObject.class,
    RoutingtableObject.class,
    XinetdObject.class,
    UnameObject.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.DnscacheObject.class,
    PortinfoObject.class,
    HttpdObject.class,
    GlobalrestrictionsObject.class,
    ProfileObject.class,
    PasscodepolicyObject.class,
    AuthorizationdbObject.class,
    KeychainObject.class,
    SystemprofilerObject.class,
    Inetlisteningserver510Object.class,
    org.mitre.oval.xmlschema.oval_definitions_5_macos.InetlisteningserversObject.class,
    PlistObject.class,
    Plist511Object.class,
    PwpolicyObject.class,
    Pwpolicy59Object.class,
    GatekeeperObject.class,
    DiskutilObject.class,
    RlimitObject.class,
    LaunchdObject.class,
    SystemsetupObject.class,
    Plist510Object.class,
    SoftwareupdateObject.class,
    CorestorageObject.class,
    NvramObject.class,
    AccountinfoObject.class
})
public class ObjectType {

    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected SignatureType signature;
    @XmlElementRef(name = "notes", namespace = "http://oval.mitre.org/XMLSchema/oval-common-5", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends NotesType> notes;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "version", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger version;
    @XmlAttribute(name = "comment")
    protected String comment;
    @XmlAttribute(name = "deprecated")
    protected Boolean deprecated;

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Notes }{@code >}
     *     {@link JAXBElement }{@code <}{@link NotesType }{@code >}
     *     
     */
    public JAXBElement<? extends NotesType> getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Notes }{@code >}
     *     {@link JAXBElement }{@code <}{@link NotesType }{@code >}
     *     
     */
    public void setNotes(JAXBElement<? extends NotesType> value) {
        this.notes = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVersion(BigInteger value) {
        this.version = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the deprecated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDeprecated() {
        if (deprecated == null) {
            return false;
        } else {
            return deprecated;
        }
    }

    /**
     * Sets the value of the deprecated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeprecated(Boolean value) {
        this.deprecated = value;
    }

}
