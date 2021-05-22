
package org.mitre.oval.xmlschema.oval_definitions_5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
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


/**
 * The TestsType complex type is a container for one or more test child elements. Each test element describes a single OVAL Test. Please refer to the description of the TestType for more information about an individual test.
 * 
 * <p>Java class for TestsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://oval.mitre.org/XMLSchema/oval-definitions-5}test" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestsType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", propOrder = {
    "test"
})
public class TestsType {

    @XmlElementRef(name = "test", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", type = JAXBElement.class)
    protected List<JAXBElement<? extends TestType>> test;

    /**
     * Gets the value of the test property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the test property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link SidTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.LineTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.SnmpcommunityTest }{@code >}
     * {@link JAXBElement }{@code <}{@link PasswordpolicyTest }{@code >}
     * {@link JAXBElement }{@code <}{@link Patch56Test }{@code >}
     * {@link JAXBElement }{@code <}{@link Filehash58Test }{@code >}
     * {@link JAXBElement }{@code <}{@link SelinuxbooleanTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.RouterTest }{@code >}
     * {@link JAXBElement }{@code <}{@link ClassMapTest }{@code >}
     * {@link JAXBElement }{@code <}{@link LdapTest }{@code >}
     * {@link JAXBElement }{@code <}{@link RegkeyeffectiverightsTest }{@code >}
     * {@link JAXBElement }{@code <}{@link RpmverifypackageTest }{@code >}
     * {@link JAXBElement }{@code <}{@link GconfTest }{@code >}
     * {@link JAXBElement }{@code <}{@link LockoutpolicyTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_unix.PasswordTest }{@code >}
     * {@link JAXBElement }{@code <}{@link Fileeffectiverights53Test }{@code >}
     * {@link JAXBElement }{@code <}{@link Ldap57Test }{@code >}
     * {@link JAXBElement }{@code <}{@link XmlfilecontentTest }{@code >}
     * {@link JAXBElement }{@code <}{@link Spjobdefinition510Test }{@code >}
     * {@link JAXBElement }{@code <}{@link FileauditedpermissionsTest }{@code >}
     * {@link JAXBElement }{@code <}{@link EnvironmentvariableTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.SnmpuserTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.SnmpcommunityTest }{@code >}
     * {@link JAXBElement }{@code <}{@link Regkeyauditedpermissions53Test }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_asa.LineTest }{@code >}
     * {@link JAXBElement }{@code <}{@link KeychainTest }{@code >}
     * {@link JAXBElement }{@code <}{@link CameraTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.InterfaceTest }{@code >}
     * {@link JAXBElement }{@code <}{@link SpwebTest }{@code >}
     * {@link JAXBElement }{@code <}{@link ServicePolicyTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.SnmpgroupTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_pixos.LineTest }{@code >}
     * {@link JAXBElement }{@code <}{@link PolicyMapTest }{@code >}
     * {@link JAXBElement }{@code <}{@link SidSidTest }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceeffectiverightsTest }{@code >}
     * {@link JAXBElement }{@code <}{@link NoTest }{@code >}
     * {@link JAXBElement }{@code <}{@link PartitionTest }{@code >}
     * {@link JAXBElement }{@code <}{@link NvramTest }{@code >}
     * {@link JAXBElement }{@code <}{@link UnknownTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.GlobalTest }{@code >}
     * {@link JAXBElement }{@code <}{@link SpjobdefinitionTest }{@code >}
     * {@link JAXBElement }{@code <}{@link UacTest }{@code >}
     * {@link JAXBElement }{@code <}{@link SmfpropertyTest }{@code >}
     * {@link JAXBElement }{@code <}{@link Textfilecontent54Test }{@code >}
     * {@link JAXBElement }{@code <}{@link SystemdetailsTest }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupSidTest }{@code >}
     * {@link JAXBElement }{@code <}{@link Wmi57Test }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.SnmphostTest }{@code >}
     * {@link JAXBElement }{@code <}{@link WifinetworkTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.Version55Test }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.SectionTest }{@code >}
     * {@link JAXBElement }{@code <}{@link PeheaderTest }{@code >}
     * {@link JAXBElement }{@code <}{@link PortTest }{@code >}
     * {@link JAXBElement }{@code <}{@link DevicesettingsTest }{@code >}
     * {@link JAXBElement }{@code <}{@link RegkeyauditedpermissionsTest }{@code >}
     * {@link JAXBElement }{@code <}{@link XmlShowTest }{@code >}
     * {@link JAXBElement }{@code <}{@link PackagefreezelistTest }{@code >}
     * {@link JAXBElement }{@code <}{@link PasscodepolicyTest }{@code >}
     * {@link JAXBElement }{@code <}{@link RlimitTest }{@code >}
     * {@link JAXBElement }{@code <}{@link SqlTest }{@code >}
     * {@link JAXBElement }{@code <}{@link SnmpTest }{@code >}
     * {@link JAXBElement }{@code <}{@link SystemdunitdependencyTest }{@code >}
     * {@link JAXBElement }{@code <}{@link XinetdTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_hpux.PatchTest }{@code >}
     * {@link JAXBElement }{@code <}{@link SpsiteTest }{@code >}
     * {@link JAXBElement }{@code <}{@link TestType }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_catos.LineTest }{@code >}
     * {@link JAXBElement }{@code <}{@link AccesstokenTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_windows.FileTest }{@code >}
     * {@link JAXBElement }{@code <}{@link FilehashTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.SnmpgroupTest }{@code >}
     * {@link JAXBElement }{@code <}{@link SpcrawlruleTest }{@code >}
     * {@link JAXBElement }{@code <}{@link SppolicyTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_unix.ProcessTest }{@code >}
     * {@link JAXBElement }{@code <}{@link InetdTest }{@code >}
     * {@link JAXBElement }{@code <}{@link TclshTest }{@code >}
     * {@link JAXBElement }{@code <}{@link IsainfoTest }{@code >}
     * {@link JAXBElement }{@code <}{@link Activedirectory57Test }{@code >}
     * {@link JAXBElement }{@code <}{@link VariantTest }{@code >}
     * {@link JAXBElement }{@code <}{@link SnmpUserTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_catos.Version55Test }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.AclTest }{@code >}
     * {@link JAXBElement }{@code <}{@link FamilyTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_unix.FileTest }{@code >}
     * {@link JAXBElement }{@code <}{@link SccsTest }{@code >}
     * {@link JAXBElement }{@code <}{@link WuaupdatesearcherTest }{@code >}
     * {@link JAXBElement }{@code <}{@link UserTest }{@code >}
     * {@link JAXBElement }{@code <}{@link ShowTest }{@code >}
     * {@link JAXBElement }{@code <}{@link ConfigTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.SectionTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_windows.InterfaceTest }{@code >}
     * {@link JAXBElement }{@code <}{@link SpgroupTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_android.PasswordTest }{@code >}
     * {@link JAXBElement }{@code <}{@link NtuserTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_unix.InterfaceTest }{@code >}
     * {@link JAXBElement }{@code <}{@link BluetoothTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.BgpneighborTest }{@code >}
     * {@link JAXBElement }{@code <}{@link VisdkmanagedobjectTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_solaris.NddTest }{@code >}
     * {@link JAXBElement }{@code <}{@link FacetTest }{@code >}
     * {@link JAXBElement }{@code <}{@link PackageTest }{@code >}
     * {@link JAXBElement }{@code <}{@link TcpMapTest }{@code >}
     * {@link JAXBElement }{@code <}{@link UnameTest }{@code >}
     * {@link JAXBElement }{@code <}{@link ActivedirectoryTest }{@code >}
     * {@link JAXBElement }{@code <}{@link VariableTest }{@code >}
     * {@link JAXBElement }{@code <}{@link SymlinkTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.RoutingprotocolauthintfTest }{@code >}
     * {@link JAXBElement }{@code <}{@link LicenseTest }{@code >}
     * {@link JAXBElement }{@code <}{@link PackagecheckTest }{@code >}
     * {@link JAXBElement }{@code <}{@link FileeffectiverightsTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_junos.VersionTest }{@code >}
     * {@link JAXBElement }{@code <}{@link ShadowTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.BgpneighborTest }{@code >}
     * {@link JAXBElement }{@code <}{@link SharedresourceTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_esx.PatchTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.RouterTest }{@code >}
     * {@link JAXBElement }{@code <}{@link VirtualizationinfoTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.RoutingprotocolauthintfTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.SnmpuserTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_catos.VersionTest }{@code >}
     * {@link JAXBElement }{@code <}{@link Pwpolicy59Test }{@code >}
     * {@link JAXBElement }{@code <}{@link SpdiagnosticslevelTest }{@code >}
     * {@link JAXBElement }{@code <}{@link FileextendedattributeTest }{@code >}
     * {@link JAXBElement }{@code <}{@link AuthorizationdbTest }{@code >}
     * {@link JAXBElement }{@code <}{@link SharedresourceeffectiverightsTest }{@code >}
     * {@link JAXBElement }{@code <}{@link EncryptionTest }{@code >}
     * {@link JAXBElement }{@code <}{@link NetworkTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_windows.Process58Test }{@code >}
     * {@link JAXBElement }{@code <}{@link Fileauditedpermissions53Test }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_esx.VersionTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.SnmpviewTest }{@code >}
     * {@link JAXBElement }{@code <}{@link SpdiagnosticsserviceTest }{@code >}
     * {@link JAXBElement }{@code <}{@link Patch54Test }{@code >}
     * {@link JAXBElement }{@code <}{@link DpkginfoTest }{@code >}
     * {@link JAXBElement }{@code <}{@link FilesetTest }{@code >}
     * {@link JAXBElement }{@code <}{@link ImageTest }{@code >}
     * {@link JAXBElement }{@code <}{@link SnmpHostTest }{@code >}
     * {@link JAXBElement }{@code <}{@link Patch53Test }{@code >}
     * {@link JAXBElement }{@code <}{@link ProfileTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.AclTest }{@code >}
     * {@link JAXBElement }{@code <}{@link TrustedTest }{@code >}
     * {@link JAXBElement }{@code <}{@link Regkeyeffectiverights53Test }{@code >}
     * {@link JAXBElement }{@code <}{@link SpantivirussettingsTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.LineTest }{@code >}
     * {@link JAXBElement }{@code <}{@link SystemprofilerTest }{@code >}
     * {@link JAXBElement }{@code <}{@link PackagepublisherTest }{@code >}
     * {@link JAXBElement }{@code <}{@link SmfTest }{@code >}
     * {@link JAXBElement }{@code <}{@link Plist510Test }{@code >}
     * {@link JAXBElement }{@code <}{@link JunctionTest }{@code >}
     * {@link JAXBElement }{@code <}{@link CertificateTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.GlobalTest }{@code >}
     * {@link JAXBElement }{@code <}{@link PwpolicyTest }{@code >}
     * {@link JAXBElement }{@code <}{@link GetconfTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_solaris.PatchTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.VersionTest }{@code >}
     * {@link JAXBElement }{@code <}{@link SpwebapplicationTest }{@code >}
     * {@link JAXBElement }{@code <}{@link RunlevelTest }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceTest }{@code >}
     * {@link JAXBElement }{@code <}{@link SelinuxsecuritycontextTest }{@code >}
     * {@link JAXBElement }{@code <}{@link DiskutilTest }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupTest }{@code >}
     * {@link JAXBElement }{@code <}{@link OslevelTest }{@code >}
     * {@link JAXBElement }{@code <}{@link SystemdunitpropertyTest }{@code >}
     * {@link JAXBElement }{@code <}{@link SplistTest }{@code >}
     * {@link JAXBElement }{@code <}{@link Sql57Test }{@code >}
     * {@link JAXBElement }{@code <}{@link UserSidTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_windows.ProcessTest }{@code >}
     * {@link JAXBElement }{@code <}{@link VolumeTest }{@code >}
     * {@link JAXBElement }{@code <}{@link LaunchdTest }{@code >}
     * {@link JAXBElement }{@code <}{@link PackageavoidlistTest }{@code >}
     * {@link JAXBElement }{@code <}{@link InfopolicycollTest }{@code >}
     * {@link JAXBElement }{@code <}{@link UserrightTest }{@code >}
     * {@link JAXBElement }{@code <}{@link AccountinfoTest }{@code >}
     * {@link JAXBElement }{@code <}{@link TelephonyTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_windows.DnscacheTest }{@code >}
     * {@link JAXBElement }{@code <}{@link BestbetTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_macos.InetlisteningserversTest }{@code >}
     * {@link JAXBElement }{@code <}{@link RegistryTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_unix.Process58Test }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_hpux.NddTest }{@code >}
     * {@link JAXBElement }{@code <}{@link SlackwarepkginfoTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_unix.DnscacheTest }{@code >}
     * {@link JAXBElement }{@code <}{@link ModuleTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_asa.AclTest }{@code >}
     * {@link JAXBElement }{@code <}{@link InterimFixTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_linux.InetlisteningserversTest }{@code >}
     * {@link JAXBElement }{@code <}{@link CmdletTest }{@code >}
     * {@link JAXBElement }{@code <}{@link UserSid55Test }{@code >}
     * {@link JAXBElement }{@code <}{@link SysctlTest }{@code >}
     * {@link JAXBElement }{@code <}{@link LocationserviceTest }{@code >}
     * {@link JAXBElement }{@code <}{@link SystemsetupTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_asa.InterfaceTest }{@code >}
     * {@link JAXBElement }{@code <}{@link GlobalrestrictionsTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.VersionTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.SnmphostTest }{@code >}
     * {@link JAXBElement }{@code <}{@link XmlConfigTest }{@code >}
     * {@link JAXBElement }{@code <}{@link TextfilecontentTest }{@code >}
     * {@link JAXBElement }{@code <}{@link IflistenersTest }{@code >}
     * {@link JAXBElement }{@code <}{@link AuditeventpolicysubcategoriesTest }{@code >}
     * {@link JAXBElement }{@code <}{@link SnmpGroupTest }{@code >}
     * {@link JAXBElement }{@code <}{@link Inetlisteningserver510Test }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_asa.VersionTest }{@code >}
     * {@link JAXBElement }{@code <}{@link Package511Test }{@code >}
     * {@link JAXBElement }{@code <}{@link CorestorageTest }{@code >}
     * {@link JAXBElement }{@code <}{@link PlistTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.InterfaceTest }{@code >}
     * {@link JAXBElement }{@code <}{@link AuditeventpolicyTest }{@code >}
     * {@link JAXBElement }{@code <}{@link RpminfoTest }{@code >}
     * {@link JAXBElement }{@code <}{@link RoutingtableTest }{@code >}
     * {@link JAXBElement }{@code <}{@link RpmverifyfileTest }{@code >}
     * {@link JAXBElement }{@code <}{@link FixTest }{@code >}
     * {@link JAXBElement }{@code <}{@link WmiTest }{@code >}
     * {@link JAXBElement }{@code <}{@link SpsiteadministrationTest }{@code >}
     * {@link JAXBElement }{@code <}{@link HttpdTest }{@code >}
     * {@link JAXBElement }{@code <}{@link MetabaseTest }{@code >}
     * {@link JAXBElement }{@code <}{@link AppmanagerTest }{@code >}
     * {@link JAXBElement }{@code <}{@link PortinfoTest }{@code >}
     * {@link JAXBElement }{@code <}{@link Plist511Test }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_pixos.VersionTest }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.SnmpviewTest }{@code >}
     * {@link JAXBElement }{@code <}{@link SoftwareupdateTest }{@code >}
     * {@link JAXBElement }{@code <}{@link SwlistTest }{@code >}
     * {@link JAXBElement }{@code <}{@link ApparmorstatusTest }{@code >}
     * {@link JAXBElement }{@code <}{@link SystemmetricTest }{@code >}
     * {@link JAXBElement }{@code <}{@link SppolicyfeatureTest }{@code >}
     * {@link JAXBElement }{@code <}{@link SharedresourceauditedpermissionsTest }{@code >}
     * {@link JAXBElement }{@code <}{@link PrintereffectiverightsTest }{@code >}
     * {@link JAXBElement }{@code <}{@link Environmentvariable58Test }{@code >}
     * {@link JAXBElement }{@code <}{@link GatekeeperTest }{@code >}
     * {@link JAXBElement }{@code <}{@link RpmverifyTest }{@code >}
     * {@link JAXBElement }{@code <}{@link WifiTest }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends TestType>> getTest() {
        if (test == null) {
            test = new ArrayList<JAXBElement<? extends TestType>>();
        }
        return this.test;
    }

}
