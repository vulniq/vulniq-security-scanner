


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
import org.mitre.oval.xmlschema.oval_common_5.CheckEnumeration;
import org.mitre.oval.xmlschema.oval_common_5.ExistenceEnumeration;
import org.mitre.oval.xmlschema.oval_common_5.NotesType;
import org.mitre.oval.xmlschema.oval_common_5.OperatorEnumeration;
import org.mitre.oval.xmlschema.oval_definitions_5_aix.FilesetTest;
import org.mitre.oval.xmlschema.oval_definitions_5_aix.FixTest;
import org.mitre.oval.xmlschema.oval_definitions_5_aix.InterimFixTest;
import org.mitre.oval.xmlschema.oval_definitions_5_aix.NoTest;
import org.mitre.oval.xmlschema.oval_definitions_5_aix.OslevelTest;
import org.mitre.oval.xmlschema.oval_definitions_5_android.AppmanagerTest;
import org.mitre.oval.xmlschema.oval_definitions_5_android.BluetoothTest;
import org.mitre.oval.xmlschema.oval_definitions_5_android.CameraTest;
import org.mitre.oval.xmlschema.oval_definitions_5_android.CertificateTest;
import org.mitre.oval.xmlschema.oval_definitions_5_android.DevicesettingsTest;
import org.mitre.oval.xmlschema.oval_definitions_5_android.EncryptionTest;
import org.mitre.oval.xmlschema.oval_definitions_5_android.LocationserviceTest;
import org.mitre.oval.xmlschema.oval_definitions_5_android.NetworkTest;
import org.mitre.oval.xmlschema.oval_definitions_5_android.SystemdetailsTest;
import org.mitre.oval.xmlschema.oval_definitions_5_android.TelephonyTest;
import org.mitre.oval.xmlschema.oval_definitions_5_android.WifiTest;
import org.mitre.oval.xmlschema.oval_definitions_5_android.WifinetworkTest;
import org.mitre.oval.xmlschema.oval_definitions_5_apache.HttpdTest;
import org.mitre.oval.xmlschema.oval_definitions_5_apple_ios.GlobalrestrictionsTest;
import org.mitre.oval.xmlschema.oval_definitions_5_apple_ios.PasscodepolicyTest;
import org.mitre.oval.xmlschema.oval_definitions_5_apple_ios.ProfileTest;
import org.mitre.oval.xmlschema.oval_definitions_5_asa.ClassMapTest;
import org.mitre.oval.xmlschema.oval_definitions_5_asa.PolicyMapTest;
import org.mitre.oval.xmlschema.oval_definitions_5_asa.ServicePolicyTest;
import org.mitre.oval.xmlschema.oval_definitions_5_asa.SnmpGroupTest;
import org.mitre.oval.xmlschema.oval_definitions_5_asa.SnmpHostTest;
import org.mitre.oval.xmlschema.oval_definitions_5_asa.SnmpUserTest;
import org.mitre.oval.xmlschema.oval_definitions_5_asa.TcpMapTest;
import org.mitre.oval.xmlschema.oval_definitions_5_catos.ModuleTest;
import org.mitre.oval.xmlschema.oval_definitions_5_esx.Patch56Test;
import org.mitre.oval.xmlschema.oval_definitions_5_esx.VisdkmanagedobjectTest;
import org.mitre.oval.xmlschema.oval_definitions_5_freebsd.PortinfoTest;
import org.mitre.oval.xmlschema.oval_definitions_5_hpux.GetconfTest;
import org.mitre.oval.xmlschema.oval_definitions_5_hpux.Patch53Test;
import org.mitre.oval.xmlschema.oval_definitions_5_hpux.SwlistTest;
import org.mitre.oval.xmlschema.oval_definitions_5_hpux.TrustedTest;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.Environmentvariable58Test;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.EnvironmentvariableTest;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.FamilyTest;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.Filehash58Test;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.FilehashTest;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.Ldap57Test;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.LdapTest;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.Sql57Test;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.SqlTest;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.Textfilecontent54Test;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.TextfilecontentTest;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.UnknownTest;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.VariableTest;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.XmlfilecontentTest;
import org.mitre.oval.xmlschema.oval_definitions_5_ios.SnmpTest;
import org.mitre.oval.xmlschema.oval_definitions_5_ios.TclshTest;
import org.mitre.oval.xmlschema.oval_definitions_5_junos.ShowTest;
import org.mitre.oval.xmlschema.oval_definitions_5_junos.XmlConfigTest;
import org.mitre.oval.xmlschema.oval_definitions_5_junos.XmlShowTest;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.ApparmorstatusTest;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.DpkginfoTest;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.IflistenersTest;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.PartitionTest;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.RpminfoTest;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifyTest;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifyfileTest;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifypackageTest;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.SelinuxbooleanTest;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.SelinuxsecuritycontextTest;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.SlackwarepkginfoTest;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.SystemdunitdependencyTest;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.SystemdunitpropertyTest;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.AccountinfoTest;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.AuthorizationdbTest;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.CorestorageTest;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.DiskutilTest;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.GatekeeperTest;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.Inetlisteningserver510Test;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.KeychainTest;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.LaunchdTest;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.NvramTest;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.Plist510Test;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.Plist511Test;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.PlistTest;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.Pwpolicy59Test;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.PwpolicyTest;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.RlimitTest;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.SoftwareupdateTest;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.SystemprofilerTest;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.SystemsetupTest;
import org.mitre.oval.xmlschema.oval_definitions_5_netconf.ConfigTest;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.BestbetTest;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.InfopolicycollTest;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SpantivirussettingsTest;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SpcrawlruleTest;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SpdiagnosticslevelTest;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SpdiagnosticsserviceTest;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SpgroupTest;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.Spjobdefinition510Test;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SpjobdefinitionTest;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SplistTest;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SppolicyTest;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SppolicyfeatureTest;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SpsiteTest;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SpsiteadministrationTest;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SpwebTest;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SpwebapplicationTest;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.FacetTest;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.ImageTest;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.IsainfoTest;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.Package511Test;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.PackageTest;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.PackageavoidlistTest;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.PackagecheckTest;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.PackagefreezelistTest;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.PackagepublisherTest;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.Patch54Test;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.SmfTest;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.SmfpropertyTest;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.VariantTest;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.VirtualizationinfoTest;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.FileextendedattributeTest;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.GconfTest;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.InetdTest;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.RoutingtableTest;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.RunlevelTest;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.SccsTest;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.ShadowTest;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.SymlinkTest;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.SysctlTest;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.UnameTest;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.XinetdTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.AccesstokenTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.Activedirectory57Test;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.ActivedirectoryTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.AuditeventpolicyTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.AuditeventpolicysubcategoriesTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.CmdletTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.Fileauditedpermissions53Test;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.FileauditedpermissionsTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.Fileeffectiverights53Test;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.FileeffectiverightsTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.GroupSidTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.GroupTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.JunctionTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.LicenseTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.LockoutpolicyTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.MetabaseTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.NtuserTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.PasswordpolicyTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.PeheaderTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.PortTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.PrintereffectiverightsTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.RegistryTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.Regkeyauditedpermissions53Test;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.RegkeyauditedpermissionsTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.Regkeyeffectiverights53Test;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.RegkeyeffectiverightsTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.ServiceTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.ServiceeffectiverightsTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.SharedresourceTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.SharedresourceauditedpermissionsTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.SharedresourceeffectiverightsTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.SidSidTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.SidTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.SystemmetricTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.UacTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.UserSid55Test;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.UserSidTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.UserTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.UserrightTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.VolumeTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.Wmi57Test;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.WmiTest;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.WuaupdatesearcherTest;
import org.w3._2000._09.xmldsig_.SignatureType;


/**
 * The optional state_operator attribute provides the logical operator that combines the evaluation results from each referenced state on a per item basis.  Each matching item is compared to each referenced state. The result of comparing each state to a single item is combined based on the specified state_operator value to determine one result for each item. Finally, the results for each item are combined based on the specified check value.  Note that if the test does not contain any references to OVAL States, then the state_operator attribute has no meaning and can be ignored during evaluation. Referencing multiple states in one test allows ranges of possible values to be expressed. For example, one state can check that a value greater than 8 is found and another state can check that a value of less than 16 is found.  In this example the referenced states are combined with a state_operator = 'AND' indicating that the conditions of all referenced states must be satisfied and that the value must be between 8 AND 16.  The valid state_operation values are explained in the description of the OperatorEnumeration simple type.
 * 
 * <p>Java class for TestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/>
 *         &lt;element ref="{http://oval.mitre.org/XMLSchema/oval-common-5}notes" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://oval.mitre.org/XMLSchema/oval-common-5}TestIDPattern" />
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="check_existence" type="{http://oval.mitre.org/XMLSchema/oval-common-5}ExistenceEnumeration" default="at_least_one_exists" />
 *       &lt;attribute name="check" use="required" type="{http://oval.mitre.org/XMLSchema/oval-common-5}CheckEnumeration" />
 *       &lt;attribute name="state_operator" type="{http://oval.mitre.org/XMLSchema/oval-common-5}OperatorEnumeration" default="AND" />
 *       &lt;attribute name="comment" use="required" type="{http://oval.mitre.org/XMLSchema/oval-common-5}NonEmptyStringType" />
 *       &lt;attribute name="deprecated" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", propOrder = {
    "signature",
    "notes"
})
@XmlSeeAlso({
    FixTest.class,
    InterimFixTest.class,
    OslevelTest.class,
    NoTest.class,
    FilesetTest.class,
    PeheaderTest.class,
    UserSid55Test.class,
    GroupTest.class,
    SystemmetricTest.class,
    Fileeffectiverights53Test.class,
    SharedresourceeffectiverightsTest.class,
    PrintereffectiverightsTest.class,
    RegkeyauditedpermissionsTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_windows.Process58Test.class,
    FileauditedpermissionsTest.class,
    WuaupdatesearcherTest.class,
    NtuserTest.class,
    VolumeTest.class,
    AccesstokenTest.class,
    ActivedirectoryTest.class,
    Fileauditedpermissions53Test.class,
    SharedresourceTest.class,
    GroupSidTest.class,
    UserrightTest.class,
    RegistryTest.class,
    PasswordpolicyTest.class,
    ServiceTest.class,
    LockoutpolicyTest.class,
    WmiTest.class,
    AuditeventpolicysubcategoriesTest.class,
    FileeffectiverightsTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_windows.ProcessTest.class,
    UserTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_windows.InterfaceTest.class,
    Wmi57Test.class,
    ServiceeffectiverightsTest.class,
    SidTest.class,
    MetabaseTest.class,
    Activedirectory57Test.class,
    LicenseTest.class,
    AuditeventpolicyTest.class,
    CmdletTest.class,
    RegkeyeffectiverightsTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_windows.DnscacheTest.class,
    JunctionTest.class,
    PortTest.class,
    SharedresourceauditedpermissionsTest.class,
    SidSidTest.class,
    UserSidTest.class,
    UacTest.class,
    Regkeyauditedpermissions53Test.class,
    org.mitre.oval.xmlschema.oval_definitions_5_windows.FileTest.class,
    Regkeyeffectiverights53Test.class,
    org.mitre.oval.xmlschema.oval_definitions_5_esx.PatchTest.class,
    Patch56Test.class,
    org.mitre.oval.xmlschema.oval_definitions_5_esx.VersionTest.class,
    VisdkmanagedobjectTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_pixos.VersionTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_pixos.LineTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_hpux.PatchTest.class,
    TrustedTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_hpux.NddTest.class,
    SwlistTest.class,
    Patch53Test.class,
    GetconfTest.class,
    ConfigTest.class,
    SpcrawlruleTest.class,
    BestbetTest.class,
    InfopolicycollTest.class,
    SppolicyfeatureTest.class,
    SpsiteadministrationTest.class,
    SpantivirussettingsTest.class,
    SpsiteTest.class,
    SpjobdefinitionTest.class,
    SpwebapplicationTest.class,
    SpdiagnosticslevelTest.class,
    SpwebTest.class,
    SpgroupTest.class,
    SpdiagnosticsserviceTest.class,
    SppolicyTest.class,
    SplistTest.class,
    Spjobdefinition510Test.class,
    org.mitre.oval.xmlschema.oval_definitions_5_solaris.NddTest.class,
    Patch54Test.class,
    SmfTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_solaris.PatchTest.class,
    FacetTest.class,
    Package511Test.class,
    VirtualizationinfoTest.class,
    PackageavoidlistTest.class,
    PackagefreezelistTest.class,
    PackageTest.class,
    ImageTest.class,
    PackagecheckTest.class,
    IsainfoTest.class,
    PackagepublisherTest.class,
    SmfpropertyTest.class,
    VariantTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_asa.InterfaceTest.class,
    PolicyMapTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_asa.LineTest.class,
    TcpMapTest.class,
    SnmpUserTest.class,
    ServicePolicyTest.class,
    ClassMapTest.class,
    SnmpGroupTest.class,
    SnmpHostTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_asa.AclTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_asa.VersionTest.class,
    Filehash58Test.class,
    LdapTest.class,
    EnvironmentvariableTest.class,
    VariableTest.class,
    Environmentvariable58Test.class,
    Ldap57Test.class,
    FilehashTest.class,
    TextfilecontentTest.class,
    SqlTest.class,
    Sql57Test.class,
    XmlfilecontentTest.class,
    FamilyTest.class,
    Textfilecontent54Test.class,
    UnknownTest.class,
    DevicesettingsTest.class,
    CameraTest.class,
    SystemdetailsTest.class,
    NetworkTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_android.PasswordTest.class,
    TelephonyTest.class,
    LocationserviceTest.class,
    CertificateTest.class,
    WifinetworkTest.class,
    BluetoothTest.class,
    AppmanagerTest.class,
    EncryptionTest.class,
    WifiTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.SnmpgroupTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.InterfaceTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.RouterTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.LineTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.RoutingprotocolauthintfTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.SnmpviewTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.BgpneighborTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.SnmpuserTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.SectionTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.SnmpcommunityTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.AclTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.GlobalTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.SnmphostTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.VersionTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.SnmpgroupTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.RouterTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.LineTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.SnmpviewTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.Version55Test.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.SnmpcommunityTest.class,
    TclshTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.AclTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.SnmphostTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.InterfaceTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.RoutingprotocolauthintfTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.BgpneighborTest.class,
    SnmpTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.SnmpuserTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.SectionTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.GlobalTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.VersionTest.class,
    XmlConfigTest.class,
    XmlShowTest.class,
    ShowTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_junos.VersionTest.class,
    IflistenersTest.class,
    RpmverifypackageTest.class,
    RpmverifyTest.class,
    RpmverifyfileTest.class,
    SystemdunitdependencyTest.class,
    SlackwarepkginfoTest.class,
    PartitionTest.class,
    ApparmorstatusTest.class,
    DpkginfoTest.class,
    SelinuxbooleanTest.class,
    RpminfoTest.class,
    SystemdunitpropertyTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.InetlisteningserversTest.class,
    SelinuxsecuritycontextTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_catos.Version55Test.class,
    ModuleTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_catos.VersionTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_catos.LineTest.class,
    SymlinkTest.class,
    ShadowTest.class,
    RunlevelTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.ProcessTest.class,
    SccsTest.class,
    RoutingtableTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.Process58Test.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.InterfaceTest.class,
    FileextendedattributeTest.class,
    GconfTest.class,
    SysctlTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.PasswordTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.DnscacheTest.class,
    XinetdTest.class,
    InetdTest.class,
    UnameTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.FileTest.class,
    PortinfoTest.class,
    HttpdTest.class,
    PasscodepolicyTest.class,
    GlobalrestrictionsTest.class,
    ProfileTest.class,
    SystemsetupTest.class,
    PlistTest.class,
    CorestorageTest.class,
    Inetlisteningserver510Test.class,
    SoftwareupdateTest.class,
    RlimitTest.class,
    AccountinfoTest.class,
    org.mitre.oval.xmlschema.oval_definitions_5_macos.InetlisteningserversTest.class,
    GatekeeperTest.class,
    DiskutilTest.class,
    LaunchdTest.class,
    SystemprofilerTest.class,
    NvramTest.class,
    AuthorizationdbTest.class,
    Plist511Test.class,
    KeychainTest.class,
    PwpolicyTest.class,
    Pwpolicy59Test.class,
    Plist510Test.class
})
public class TestType {

    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected SignatureType signature;
    @XmlElementRef(name = "notes", namespace = "http://oval.mitre.org/XMLSchema/oval-common-5", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends NotesType> notes;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "version", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger version;
    @XmlAttribute(name = "check_existence")
    protected ExistenceEnumeration checkExistence;
    @XmlAttribute(name = "check", required = true)
    protected CheckEnumeration check;
    @XmlAttribute(name = "state_operator")
    protected OperatorEnumeration stateOperator;
    @XmlAttribute(name = "comment", required = true)
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
     * Gets the value of the checkExistence property.
     * 
     * @return
     *     possible object is
     *     {@link ExistenceEnumeration }
     *     
     */
    public ExistenceEnumeration getCheckExistence() {
        if (checkExistence == null) {
            return ExistenceEnumeration.AT_LEAST_ONE_EXISTS;
        } else {
            return checkExistence;
        }
    }

    /**
     * Sets the value of the checkExistence property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExistenceEnumeration }
     *     
     */
    public void setCheckExistence(ExistenceEnumeration value) {
        this.checkExistence = value;
    }

    /**
     * Gets the value of the check property.
     * 
     * @return
     *     possible object is
     *     {@link CheckEnumeration }
     *     
     */
    public CheckEnumeration getCheck() {
        return check;
    }

    /**
     * Sets the value of the check property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckEnumeration }
     *     
     */
    public void setCheck(CheckEnumeration value) {
        this.check = value;
    }

    /**
     * Gets the value of the stateOperator property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorEnumeration }
     *     
     */
    public OperatorEnumeration getStateOperator() {
        if (stateOperator == null) {
            return OperatorEnumeration.AND;
        } else {
            return stateOperator;
        }
    }

    /**
     * Sets the value of the stateOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorEnumeration }
     *     
     */
    public void setStateOperator(OperatorEnumeration value) {
        this.stateOperator = value;
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
