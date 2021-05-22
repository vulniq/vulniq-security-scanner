


package org.mitre.oval.xmlschema.oval_definitions_5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
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


/**
 * The ObjectsType complex type is a container for one or more object child elements. Each object element provides details that define a unique set of matching items to be used by an OVAL Test. Please refer to the description of the object element for more information about an individual object.
 * 
 * <p>Java class for ObjectsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://oval.mitre.org/XMLSchema/oval-definitions-5}object" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectsType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", propOrder = {
    "object"
})
public class ObjectsType {

    @XmlElementRef(name = "object", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", type = JAXBElement.class)
    protected List<JAXBElement<? extends ObjectType>> object;

    /**
     * Gets the value of the object property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the object property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.InterfaceObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.SnmpgroupObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_unix.ProcessObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_esx.VersionObject }{@code >}
     * {@link JAXBElement }{@code <}{@link ShowObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_solaris.PatchObject }{@code >}
     * {@link JAXBElement }{@code <}{@link DevicesettingsObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.LineObject }{@code >}
     * {@link JAXBElement }{@code <}{@link SharedresourceObject }{@code >}
     * {@link JAXBElement }{@code <}{@link UacObject }{@code >}
     * {@link JAXBElement }{@code <}{@link PasscodepolicyObject }{@code >}
     * {@link JAXBElement }{@code <}{@link VirtualizationinfoObject }{@code >}
     * {@link JAXBElement }{@code <}{@link NoObject }{@code >}
     * {@link JAXBElement }{@code <}{@link SidSidObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.SnmpuserObject }{@code >}
     * {@link JAXBElement }{@code <}{@link EncryptionObject }{@code >}
     * {@link JAXBElement }{@code <}{@link RlimitObject }{@code >}
     * {@link JAXBElement }{@code <}{@link UnameObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_asa.AclObject }{@code >}
     * {@link JAXBElement }{@code <}{@link SysctlObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_asa.InterfaceObject }{@code >}
     * {@link JAXBElement }{@code <}{@link TclshObject }{@code >}
     * {@link JAXBElement }{@code <}{@link SpgroupObject }{@code >}
     * {@link JAXBElement }{@code <}{@link InfopolicycollObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_unix.FileObject }{@code >}
     * {@link JAXBElement }{@code <}{@link PortinfoObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.GlobalObject }{@code >}
     * {@link JAXBElement }{@code <}{@link Plist511Object }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_windows.Process58Object }{@code >}
     * {@link JAXBElement }{@code <}{@link ModuleObject }{@code >}
     * {@link JAXBElement }{@code <}{@link SystemdunitpropertyObject }{@code >}
     * {@link JAXBElement }{@code <}{@link PartitionObject }{@code >}
     * {@link JAXBElement }{@code <}{@link CmdletObject }{@code >}
     * {@link JAXBElement }{@code <}{@link GatekeeperObject }{@code >}
     * {@link JAXBElement }{@code <}{@link CertificateObject }{@code >}
     * {@link JAXBElement }{@code <}{@link PackageavoidlistObject }{@code >}
     * {@link JAXBElement }{@code <}{@link AuthorizationdbObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.LineObject }{@code >}
     * {@link JAXBElement }{@code <}{@link FamilyObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_hpux.PatchObject }{@code >}
     * {@link JAXBElement }{@code <}{@link PackageObject }{@code >}
     * {@link JAXBElement }{@code <}{@link EnvironmentvariableObject }{@code >}
     * {@link JAXBElement }{@code <}{@link LdapObject }{@code >}
     * {@link JAXBElement }{@code <}{@link SqlObject }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceObject }{@code >}
     * {@link JAXBElement }{@code <}{@link SidObject }{@code >}
     * {@link JAXBElement }{@code <}{@link DpkginfoObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.VersionObject }{@code >}
     * {@link JAXBElement }{@code <}{@link FileeffectiverightsObject }{@code >}
     * {@link JAXBElement }{@code <}{@link PackagecheckObject }{@code >}
     * {@link JAXBElement }{@code <}{@link LockoutpolicyObject }{@code >}
     * {@link JAXBElement }{@code <}{@link Regkeyauditedpermissions53Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Pwpolicy59Object }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_esx.PatchObject }{@code >}
     * {@link JAXBElement }{@code <}{@link Fileauditedpermissions53Object }{@code >}
     * {@link JAXBElement }{@code <}{@link SystemdunitdependencyObject }{@code >}
     * {@link JAXBElement }{@code <}{@link OslevelObject }{@code >}
     * {@link JAXBElement }{@code <}{@link SwlistObject }{@code >}
     * {@link JAXBElement }{@code <}{@link NetworkObject }{@code >}
     * {@link JAXBElement }{@code <}{@link WifinetworkObject }{@code >}
     * {@link JAXBElement }{@code <}{@link ServicePolicyObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.SnmpgroupObject }{@code >}
     * {@link JAXBElement }{@code <}{@link ClassMapObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.AclObject }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceeffectiverightsObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.RouterObject }{@code >}
     * {@link JAXBElement }{@code <}{@link SystemsetupObject }{@code >}
     * {@link JAXBElement }{@code <}{@link Wmi57Object }{@code >}
     * {@link JAXBElement }{@code <}{@link RegkeyeffectiverightsObject }{@code >}
     * {@link JAXBElement }{@code <}{@link PortObject }{@code >}
     * {@link JAXBElement }{@code <}{@link UserObject }{@code >}
     * {@link JAXBElement }{@code <}{@link Textfilecontent54Object }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.SnmpviewObject }{@code >}
     * {@link JAXBElement }{@code <}{@link SoftwareupdateObject }{@code >}
     * {@link JAXBElement }{@code <}{@link FacetObject }{@code >}
     * {@link JAXBElement }{@code <}{@link LicenseObject }{@code >}
     * {@link JAXBElement }{@code <}{@link DiskutilObject }{@code >}
     * {@link JAXBElement }{@code <}{@link AppmanagerObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.RoutingprotocolauthintfObject }{@code >}
     * {@link JAXBElement }{@code <}{@link PackagepublisherObject }{@code >}
     * {@link JAXBElement }{@code <}{@link GconfObject }{@code >}
     * {@link JAXBElement }{@code <}{@link PolicyMapObject }{@code >}
     * {@link JAXBElement }{@code <}{@link SnmpUserObject }{@code >}
     * {@link JAXBElement }{@code <}{@link AccesstokenObject }{@code >}
     * {@link JAXBElement }{@code <}{@link SharedresourceeffectiverightsObject }{@code >}
     * {@link JAXBElement }{@code <}{@link Fileeffectiverights53Object }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_solaris.NddObject }{@code >}
     * {@link JAXBElement }{@code <}{@link UserrightObject }{@code >}
     * {@link JAXBElement }{@code <}{@link InetdObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_unix.DnscacheObject }{@code >}
     * {@link JAXBElement }{@code <}{@link ActivedirectoryObject }{@code >}
     * {@link JAXBElement }{@code <}{@link IsainfoObject }{@code >}
     * {@link JAXBElement }{@code <}{@link SelinuxbooleanObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_unix.InterfaceObject }{@code >}
     * {@link JAXBElement }{@code <}{@link TextfilecontentObject }{@code >}
     * {@link JAXBElement }{@code <}{@link NtuserObject }{@code >}
     * {@link JAXBElement }{@code <}{@link Regkeyeffectiverights53Object }{@code >}
     * {@link JAXBElement }{@code <}{@link RpminfoObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_catos.VersionObject }{@code >}
     * {@link JAXBElement }{@code <}{@link VariantObject }{@code >}
     * {@link JAXBElement }{@code <}{@link XmlShowObject }{@code >}
     * {@link JAXBElement }{@code <}{@link TcpMapObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.SnmpuserObject }{@code >}
     * {@link JAXBElement }{@code <}{@link ObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link FileextendedattributeObject }{@code >}
     * {@link JAXBElement }{@code <}{@link FixObject }{@code >}
     * {@link JAXBElement }{@code <}{@link Package511Object }{@code >}
     * {@link JAXBElement }{@code <}{@link SharedresourceauditedpermissionsObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.GlobalObject }{@code >}
     * {@link JAXBElement }{@code <}{@link XmlConfigObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_windows.InterfaceObject }{@code >}
     * {@link JAXBElement }{@code <}{@link RoutingtableObject }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_windows.FileObject }{@code >}
     * {@link JAXBElement }{@code <}{@link SnmpGroupObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.SnmpcommunityObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.VersionObject }{@code >}
     * {@link JAXBElement }{@code <}{@link RegistryObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_asa.LineObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_catos.LineObject }{@code >}
     * {@link JAXBElement }{@code <}{@link PlistObject }{@code >}
     * {@link JAXBElement }{@code <}{@link SpdiagnosticslevelObject }{@code >}
     * {@link JAXBElement }{@code <}{@link RegkeyauditedpermissionsObject }{@code >}
     * {@link JAXBElement }{@code <}{@link SppolicyObject }{@code >}
     * {@link JAXBElement }{@code <}{@link SpdiagnosticsserviceObject }{@code >}
     * {@link JAXBElement }{@code <}{@link Sql57Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Plist510Object }{@code >}
     * {@link JAXBElement }{@code <}{@link FilesetObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.Version55Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Patch56Object }{@code >}
     * {@link JAXBElement }{@code <}{@link UserSid55Object }{@code >}
     * {@link JAXBElement }{@code <}{@link VisdkmanagedobjectObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.SnmpviewObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_pixos.LineObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_unix.Process58Object }{@code >}
     * {@link JAXBElement }{@code <}{@link SnmpHostObject }{@code >}
     * {@link JAXBElement }{@code <}{@link InterimFixObject }{@code >}
     * {@link JAXBElement }{@code <}{@link ConfigObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_catos.Version55Object }{@code >}
     * {@link JAXBElement }{@code <}{@link PwpolicyObject }{@code >}
     * {@link JAXBElement }{@code <}{@link SystemprofilerObject }{@code >}
     * {@link JAXBElement }{@code <}{@link AuditeventpolicyObject }{@code >}
     * {@link JAXBElement }{@code <}{@link Inetlisteningserver510Object }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_macos.InetlisteningserversObject }{@code >}
     * {@link JAXBElement }{@code <}{@link JunctionObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.SnmphostObject }{@code >}
     * {@link JAXBElement }{@code <}{@link Ldap57Object }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.AclObject }{@code >}
     * {@link JAXBElement }{@code <}{@link RpmverifypackageObject }{@code >}
     * {@link JAXBElement }{@code <}{@link PasswordpolicyObject }{@code >}
     * {@link JAXBElement }{@code <}{@link SplistObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.SnmpcommunityObject }{@code >}
     * {@link JAXBElement }{@code <}{@link NvramObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_windows.DnscacheObject }{@code >}
     * {@link JAXBElement }{@code <}{@link KeychainObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_windows.ProcessObject }{@code >}
     * {@link JAXBElement }{@code <}{@link VolumeObject }{@code >}
     * {@link JAXBElement }{@code <}{@link ApparmorstatusObject }{@code >}
     * {@link JAXBElement }{@code <}{@link CameraObject }{@code >}
     * {@link JAXBElement }{@code <}{@link Filehash58Object }{@code >}
     * {@link JAXBElement }{@code <}{@link GetconfObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_hpux.NddObject }{@code >}
     * {@link JAXBElement }{@code <}{@link SymlinkObject }{@code >}
     * {@link JAXBElement }{@code <}{@link SystemdetailsObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.InterfaceObject }{@code >}
     * {@link JAXBElement }{@code <}{@link CorestorageObject }{@code >}
     * {@link JAXBElement }{@code <}{@link PackagefreezelistObject }{@code >}
     * {@link JAXBElement }{@code <}{@link TelephonyObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_linux.InetlisteningserversObject }{@code >}
     * {@link JAXBElement }{@code <}{@link AccountinfoObject }{@code >}
     * {@link JAXBElement }{@code <}{@link IflistenersObject }{@code >}
     * {@link JAXBElement }{@code <}{@link PeheaderObject }{@code >}
     * {@link JAXBElement }{@code <}{@link MetabaseObject }{@code >}
     * {@link JAXBElement }{@code <}{@link ShadowObject }{@code >}
     * {@link JAXBElement }{@code <}{@link SpwebapplicationObject }{@code >}
     * {@link JAXBElement }{@code <}{@link FilehashObject }{@code >}
     * {@link JAXBElement }{@code <}{@link SmfpropertyObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_junos.VersionObject }{@code >}
     * {@link JAXBElement }{@code <}{@link ProfileObject }{@code >}
     * {@link JAXBElement }{@code <}{@link XmlfilecontentObject }{@code >}
     * {@link JAXBElement }{@code <}{@link LocationserviceObject }{@code >}
     * {@link JAXBElement }{@code <}{@link SnmpObject }{@code >}
     * {@link JAXBElement }{@code <}{@link SpcrawlruleObject }{@code >}
     * {@link JAXBElement }{@code <}{@link SpsiteadministrationObject }{@code >}
     * {@link JAXBElement }{@code <}{@link UserSidObject }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupSidObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_pixos.VersionObject }{@code >}
     * {@link JAXBElement }{@code <}{@link Spjobdefinition510Object }{@code >}
     * {@link JAXBElement }{@code <}{@link RpmverifyObject }{@code >}
     * {@link JAXBElement }{@code <}{@link SppolicyfeatureObject }{@code >}
     * {@link JAXBElement }{@code <}{@link SmfObject }{@code >}
     * {@link JAXBElement }{@code <}{@link Environmentvariable58Object }{@code >}
     * {@link JAXBElement }{@code <}{@link RunlevelObject }{@code >}
     * {@link JAXBElement }{@code <}{@link SpwebObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.SnmphostObject }{@code >}
     * {@link JAXBElement }{@code <}{@link SlackwarepkginfoObject }{@code >}
     * {@link JAXBElement }{@code <}{@link WifiObject }{@code >}
     * {@link JAXBElement }{@code <}{@link SpjobdefinitionObject }{@code >}
     * {@link JAXBElement }{@code <}{@link PrintereffectiverightsObject }{@code >}
     * {@link JAXBElement }{@code <}{@link TrustedObject }{@code >}
     * {@link JAXBElement }{@code <}{@link LaunchdObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.RoutingprotocolauthintfObject }{@code >}
     * {@link JAXBElement }{@code <}{@link SelinuxsecuritycontextObject }{@code >}
     * {@link JAXBElement }{@code <}{@link SccsObject }{@code >}
     * {@link JAXBElement }{@code <}{@link SpsiteObject }{@code >}
     * {@link JAXBElement }{@code <}{@link BestbetObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_android.PasswordObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.BgpneighborObject }{@code >}
     * {@link JAXBElement }{@code <}{@link WuaupdatesearcherObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.BgpneighborObject }{@code >}
     * {@link JAXBElement }{@code <}{@link BluetoothObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.SectionObject }{@code >}
     * {@link JAXBElement }{@code <}{@link FileauditedpermissionsObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_unix.PasswordObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_asa.VersionObject }{@code >}
     * {@link JAXBElement }{@code <}{@link SpantivirussettingsObject }{@code >}
     * {@link JAXBElement }{@code <}{@link Activedirectory57Object }{@code >}
     * {@link JAXBElement }{@code <}{@link VariableObject }{@code >}
     * {@link JAXBElement }{@code <}{@link WmiObject }{@code >}
     * {@link JAXBElement }{@code <}{@link Patch53Object }{@code >}
     * {@link JAXBElement }{@code <}{@link ImageObject }{@code >}
     * {@link JAXBElement }{@code <}{@link Patch54Object }{@code >}
     * {@link JAXBElement }{@code <}{@link AuditeventpolicysubcategoriesObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.RouterObject }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.SectionObject }{@code >}
     * {@link JAXBElement }{@code <}{@link RpmverifyfileObject }{@code >}
     * {@link JAXBElement }{@code <}{@link XinetdObject }{@code >}
     * {@link JAXBElement }{@code <}{@link HttpdObject }{@code >}
     * {@link JAXBElement }{@code <}{@link SystemmetricObject }{@code >}
     * {@link JAXBElement }{@code <}{@link GlobalrestrictionsObject }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends ObjectType>> getObject() {
        if (object == null) {
            object = new ArrayList<JAXBElement<? extends ObjectType>>();
        }
        return this.object;
    }

}
