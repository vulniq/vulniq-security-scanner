
package org.mitre.oval.xmlschema.oval_definitions_5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5_aix.FilesetState;
import org.mitre.oval.xmlschema.oval_definitions_5_aix.FixState;
import org.mitre.oval.xmlschema.oval_definitions_5_aix.InterimFixState;
import org.mitre.oval.xmlschema.oval_definitions_5_aix.NoState;
import org.mitre.oval.xmlschema.oval_definitions_5_aix.OslevelState;
import org.mitre.oval.xmlschema.oval_definitions_5_android.AppmanagerState;
import org.mitre.oval.xmlschema.oval_definitions_5_android.BluetoothState;
import org.mitre.oval.xmlschema.oval_definitions_5_android.CameraState;
import org.mitre.oval.xmlschema.oval_definitions_5_android.CertificateState;
import org.mitre.oval.xmlschema.oval_definitions_5_android.DevicesettingsState;
import org.mitre.oval.xmlschema.oval_definitions_5_android.EncryptionState;
import org.mitre.oval.xmlschema.oval_definitions_5_android.LocationserviceState;
import org.mitre.oval.xmlschema.oval_definitions_5_android.NetworkState;
import org.mitre.oval.xmlschema.oval_definitions_5_android.SystemdetailsState;
import org.mitre.oval.xmlschema.oval_definitions_5_android.TelephonyState;
import org.mitre.oval.xmlschema.oval_definitions_5_android.WifiState;
import org.mitre.oval.xmlschema.oval_definitions_5_android.WifinetworkState;
import org.mitre.oval.xmlschema.oval_definitions_5_apache.HttpdState;
import org.mitre.oval.xmlschema.oval_definitions_5_apple_ios.GlobalrestrictionsState;
import org.mitre.oval.xmlschema.oval_definitions_5_apple_ios.PasscodepolicyState;
import org.mitre.oval.xmlschema.oval_definitions_5_apple_ios.ProfileState;
import org.mitre.oval.xmlschema.oval_definitions_5_asa.ClassMapState;
import org.mitre.oval.xmlschema.oval_definitions_5_asa.PolicyMapState;
import org.mitre.oval.xmlschema.oval_definitions_5_asa.ServicePolicyState;
import org.mitre.oval.xmlschema.oval_definitions_5_asa.SnmpGroupState;
import org.mitre.oval.xmlschema.oval_definitions_5_asa.SnmpHostState;
import org.mitre.oval.xmlschema.oval_definitions_5_asa.SnmpUserState;
import org.mitre.oval.xmlschema.oval_definitions_5_asa.TcpMapState;
import org.mitre.oval.xmlschema.oval_definitions_5_catos.ModuleState;
import org.mitre.oval.xmlschema.oval_definitions_5_esx.Patch56State;
import org.mitre.oval.xmlschema.oval_definitions_5_esx.VisdkmanagedobjectState;
import org.mitre.oval.xmlschema.oval_definitions_5_freebsd.PortinfoState;
import org.mitre.oval.xmlschema.oval_definitions_5_hpux.GetconfState;
import org.mitre.oval.xmlschema.oval_definitions_5_hpux.Patch53State;
import org.mitre.oval.xmlschema.oval_definitions_5_hpux.SwlistState;
import org.mitre.oval.xmlschema.oval_definitions_5_hpux.TrustedState;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.Environmentvariable58State;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.EnvironmentvariableState;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.FamilyState;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.Filehash58State;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.FilehashState;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.Ldap57State;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.LdapState;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.Sql57State;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.SqlState;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.Textfilecontent54State;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.TextfilecontentState;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.VariableState;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.XmlfilecontentState;
import org.mitre.oval.xmlschema.oval_definitions_5_ios.SnmpState;
import org.mitre.oval.xmlschema.oval_definitions_5_ios.TclshState;
import org.mitre.oval.xmlschema.oval_definitions_5_junos.ShowState;
import org.mitre.oval.xmlschema.oval_definitions_5_junos.XmlConfigState;
import org.mitre.oval.xmlschema.oval_definitions_5_junos.XmlShowState;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.ApparmorstatusState;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.DpkginfoState;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.IflistenersState;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.PartitionState;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.RpminfoState;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifyState;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifyfileState;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifypackageState;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.SelinuxbooleanState;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.SelinuxsecuritycontextState;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.SlackwarepkginfoState;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.SystemdunitdependencyState;
import org.mitre.oval.xmlschema.oval_definitions_5_linux.SystemdunitpropertyState;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.AccountinfoState;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.AuthorizationdbState;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.CorestorageState;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.DiskutilState;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.GatekeeperState;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.Inetlisteningserver510State;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.KeychainState;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.LaunchdState;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.NvramState;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.Plist510State;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.Plist511State;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.PlistState;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.Pwpolicy59State;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.PwpolicyState;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.RlimitState;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.SoftwareupdateState;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.SystemprofilerState;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.SystemsetupState;
import org.mitre.oval.xmlschema.oval_definitions_5_netconf.ConfigState;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.BestbetState;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.InfopolicycollState;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SpantivirussettingsState;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SpcrawlruleState;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SpdiagnosticslevelState;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SpdiagnosticsserviceState;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SpgroupState;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.Spjobdefinition510State;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SpjobdefinitionState;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SplistState;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SppolicyState;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SppolicyfeatureState;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SpsiteState;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SpsiteadministrationState;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SpwebState;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.SpwebapplicationState;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.FacetState;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.ImageState;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.IsainfoState;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.Package511State;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.PackageState;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.PackageavoidlistState;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.PackagecheckState;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.PackagefreezelistState;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.PackagepublisherState;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.SmfState;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.SmfpropertyState;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.VariantState;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.VirtualizationinfoState;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.FileextendedattributeState;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.GconfState;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.InetdState;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.RoutingtableState;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.RunlevelState;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.SccsState;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.ShadowState;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.SymlinkState;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.SysctlState;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.UnameState;
import org.mitre.oval.xmlschema.oval_definitions_5_unix.XinetdState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.AccesstokenState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.Activedirectory57State;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.ActivedirectoryState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.AuditeventpolicyState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.AuditeventpolicysubcategoriesState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.CmdletState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.Fileauditedpermissions53State;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.FileauditedpermissionsState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.Fileeffectiverights53State;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.FileeffectiverightsState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.GroupSidState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.GroupState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.JunctionState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.LicenseState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.LockoutpolicyState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.MetabaseState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.NtuserState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.PasswordpolicyState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.PeheaderState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.PortState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.PrintereffectiverightsState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.RegistryState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.Regkeyauditedpermissions53State;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.RegkeyauditedpermissionsState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.Regkeyeffectiverights53State;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.RegkeyeffectiverightsState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.ServiceState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.ServiceeffectiverightsState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.SharedresourceState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.SharedresourceauditedpermissionsState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.SharedresourceeffectiverightsState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.SidSidState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.SidState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.SystemmetricState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.UacState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.UserSid55State;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.UserSidState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.UserState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.UserrightState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.VolumeState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.Wmi57State;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.WmiState;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.WuaupdatesearcherState;


/**
 * The StatesType complex type is a container for one or more state child elements. Each state provides details about specific characteristics that can be used during an evaluation of an object. Please refer to the description of the state element for more information about an individual state.
 * 
 * <p>Java class for StatesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://oval.mitre.org/XMLSchema/oval-definitions-5}state" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatesType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", propOrder = {
    "state"
})
public class StatesType {

    @XmlElementRef(name = "state", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", type = JAXBElement.class)
    protected List<JAXBElement<? extends StateType>> state;

    /**
     * Gets the value of the state property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the state property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_esx.PatchState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.BgpneighborState }{@code >}
     * {@link JAXBElement }{@code <}{@link InetdState }{@code >}
     * {@link JAXBElement }{@code <}{@link RegkeyauditedpermissionsState }{@code >}
     * {@link JAXBElement }{@code <}{@link IflistenersState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.SnmpuserState }{@code >}
     * {@link JAXBElement }{@code <}{@link ModuleState }{@code >}
     * {@link JAXBElement }{@code <}{@link TclshState }{@code >}
     * {@link JAXBElement }{@code <}{@link RegistryState }{@code >}
     * {@link JAXBElement }{@code <}{@link LocationserviceState }{@code >}
     * {@link JAXBElement }{@code <}{@link SpsiteadministrationState }{@code >}
     * {@link JAXBElement }{@code <}{@link SystemdunitdependencyState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.SnmpcommunityState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_windows.DnscacheState }{@code >}
     * {@link JAXBElement }{@code <}{@link FileeffectiverightsState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.VersionState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_macos.InetlisteningserversState }{@code >}
     * {@link JAXBElement }{@code <}{@link SmfpropertyState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.AclState }{@code >}
     * {@link JAXBElement }{@code <}{@link GatekeeperState }{@code >}
     * {@link JAXBElement }{@code <}{@link CmdletState }{@code >}
     * {@link JAXBElement }{@code <}{@link PortState }{@code >}
     * {@link JAXBElement }{@code <}{@link Environmentvariable58State }{@code >}
     * {@link JAXBElement }{@code <}{@link RpminfoState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_linux.InetlisteningserversState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.SectionState }{@code >}
     * {@link JAXBElement }{@code <}{@link RlimitState }{@code >}
     * {@link JAXBElement }{@code <}{@link WmiState }{@code >}
     * {@link JAXBElement }{@code <}{@link SnmpGroupState }{@code >}
     * {@link JAXBElement }{@code <}{@link Plist510State }{@code >}
     * {@link JAXBElement }{@code <}{@link SharedresourceState }{@code >}
     * {@link JAXBElement }{@code <}{@link BluetoothState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.InterfaceState }{@code >}
     * {@link JAXBElement }{@code <}{@link ApparmorstatusState }{@code >}
     * {@link JAXBElement }{@code <}{@link RegkeyeffectiverightsState }{@code >}
     * {@link JAXBElement }{@code <}{@link Ldap57State }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.Version55State }{@code >}
     * {@link JAXBElement }{@code <}{@link GlobalrestrictionsState }{@code >}
     * {@link JAXBElement }{@code <}{@link VariableState }{@code >}
     * {@link JAXBElement }{@code <}{@link CameraState }{@code >}
     * {@link JAXBElement }{@code <}{@link TrustedState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_asa.VersionState }{@code >}
     * {@link JAXBElement }{@code <}{@link RunlevelState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.InterfaceState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.SnmpviewState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_asa.LineState }{@code >}
     * {@link JAXBElement }{@code <}{@link XmlfilecontentState }{@code >}
     * {@link JAXBElement }{@code <}{@link PeheaderState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_unix.DnscacheState }{@code >}
     * {@link JAXBElement }{@code <}{@link RpmverifyfileState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_catos.VersionState }{@code >}
     * {@link JAXBElement }{@code <}{@link SppolicyfeatureState }{@code >}
     * {@link JAXBElement }{@code <}{@link SidState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.SnmpgroupState }{@code >}
     * {@link JAXBElement }{@code <}{@link VirtualizationinfoState }{@code >}
     * {@link JAXBElement }{@code <}{@link SysctlState }{@code >}
     * {@link JAXBElement }{@code <}{@link Activedirectory57State }{@code >}
     * {@link JAXBElement }{@code <}{@link TextfilecontentState }{@code >}
     * {@link JAXBElement }{@code <}{@link UserState }{@code >}
     * {@link JAXBElement }{@code <}{@link CertificateState }{@code >}
     * {@link JAXBElement }{@code <}{@link WuaupdatesearcherState }{@code >}
     * {@link JAXBElement }{@code <}{@link Regkeyauditedpermissions53State }{@code >}
     * {@link JAXBElement }{@code <}{@link AuditeventpolicyState }{@code >}
     * {@link JAXBElement }{@code <}{@link LaunchdState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.LineState }{@code >}
     * {@link JAXBElement }{@code <}{@link UnameState }{@code >}
     * {@link JAXBElement }{@code <}{@link FileauditedpermissionsState }{@code >}
     * {@link JAXBElement }{@code <}{@link SwlistState }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupState }{@code >}
     * {@link JAXBElement }{@code <}{@link SccsState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.LineState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_solaris.NddState }{@code >}
     * {@link JAXBElement }{@code <}{@link EncryptionState }{@code >}
     * {@link JAXBElement }{@code <}{@link DpkginfoState }{@code >}
     * {@link JAXBElement }{@code <}{@link FilehashState }{@code >}
     * {@link JAXBElement }{@code <}{@link GetconfState }{@code >}
     * {@link JAXBElement }{@code <}{@link SqlState }{@code >}
     * {@link JAXBElement }{@code <}{@link AccountinfoState }{@code >}
     * {@link JAXBElement }{@code <}{@link LdapState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.RoutingprotocolauthintfState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.AclState }{@code >}
     * {@link JAXBElement }{@code <}{@link PwpolicyState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_unix.FileState }{@code >}
     * {@link JAXBElement }{@code <}{@link UserSid55State }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_pixos.VersionState }{@code >}
     * {@link JAXBElement }{@code <}{@link ServicePolicyState }{@code >}
     * {@link JAXBElement }{@code <}{@link OslevelState }{@code >}
     * {@link JAXBElement }{@code <}{@link SystemdunitpropertyState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_hpux.NddState }{@code >}
     * {@link JAXBElement }{@code <}{@link VariantState }{@code >}
     * {@link JAXBElement }{@code <}{@link XmlConfigState }{@code >}
     * {@link JAXBElement }{@code <}{@link IsainfoState }{@code >}
     * {@link JAXBElement }{@code <}{@link PackagefreezelistState }{@code >}
     * {@link JAXBElement }{@code <}{@link SystemmetricState }{@code >}
     * {@link JAXBElement }{@code <}{@link Pwpolicy59State }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.GlobalState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.RoutingprotocolauthintfState }{@code >}
     * {@link JAXBElement }{@code <}{@link NtuserState }{@code >}
     * {@link JAXBElement }{@code <}{@link SymlinkState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_solaris.PatchState }{@code >}
     * {@link JAXBElement }{@code <}{@link AuthorizationdbState }{@code >}
     * {@link JAXBElement }{@code <}{@link SplistState }{@code >}
     * {@link JAXBElement }{@code <}{@link SpgroupState }{@code >}
     * {@link JAXBElement }{@code <}{@link DiskutilState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_unix.ProcessState }{@code >}
     * {@link JAXBElement }{@code <}{@link SpantivirussettingsState }{@code >}
     * {@link JAXBElement }{@code <}{@link Fileeffectiverights53State }{@code >}
     * {@link JAXBElement }{@code <}{@link AccesstokenState }{@code >}
     * {@link JAXBElement }{@code <}{@link SpwebState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.SnmpviewState }{@code >}
     * {@link JAXBElement }{@code <}{@link GconfState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.SnmpcommunityState }{@code >}
     * {@link JAXBElement }{@code <}{@link PrintereffectiverightsState }{@code >}
     * {@link JAXBElement }{@code <}{@link SystemprofilerState }{@code >}
     * {@link JAXBElement }{@code <}{@link RoutingtableState }{@code >}
     * {@link JAXBElement }{@code <}{@link GroupSidState }{@code >}
     * {@link JAXBElement }{@code <}{@link SpdiagnosticslevelState }{@code >}
     * {@link JAXBElement }{@code <}{@link RpmverifypackageState }{@code >}
     * {@link JAXBElement }{@code <}{@link SelinuxsecuritycontextState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_hpux.PatchState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_unix.InterfaceState }{@code >}
     * {@link JAXBElement }{@code <}{@link LicenseState }{@code >}
     * {@link JAXBElement }{@code <}{@link TelephonyState }{@code >}
     * {@link JAXBElement }{@code <}{@link UserrightState }{@code >}
     * {@link JAXBElement }{@code <}{@link ShowState }{@code >}
     * {@link JAXBElement }{@code <}{@link SidSidState }{@code >}
     * {@link JAXBElement }{@code <}{@link PolicyMapState }{@code >}
     * {@link JAXBElement }{@code <}{@link PasscodepolicyState }{@code >}
     * {@link JAXBElement }{@code <}{@link Fileauditedpermissions53State }{@code >}
     * {@link JAXBElement }{@code <}{@link UacState }{@code >}
     * {@link JAXBElement }{@code <}{@link DevicesettingsState }{@code >}
     * {@link JAXBElement }{@code <}{@link InterimFixState }{@code >}
     * {@link JAXBElement }{@code <}{@link PortinfoState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_asa.InterfaceState }{@code >}
     * {@link JAXBElement }{@code <}{@link SnmpUserState }{@code >}
     * {@link JAXBElement }{@code <}{@link WifinetworkState }{@code >}
     * {@link JAXBElement }{@code <}{@link Patch53State }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.RouterState }{@code >}
     * {@link JAXBElement }{@code <}{@link SharedresourceauditedpermissionsState }{@code >}
     * {@link JAXBElement }{@code <}{@link RpmverifyState }{@code >}
     * {@link JAXBElement }{@code <}{@link NetworkState }{@code >}
     * {@link JAXBElement }{@code <}{@link JunctionState }{@code >}
     * {@link JAXBElement }{@code <}{@link SpcrawlruleState }{@code >}
     * {@link JAXBElement }{@code <}{@link SystemdetailsState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.GlobalState }{@code >}
     * {@link JAXBElement }{@code <}{@link SnmpState }{@code >}
     * {@link JAXBElement }{@code <}{@link EnvironmentvariableState }{@code >}
     * {@link JAXBElement }{@code <}{@link SystemsetupState }{@code >}
     * {@link JAXBElement }{@code <}{@link StateType }{@code >}
     * {@link JAXBElement }{@code <}{@link Sql57State }{@code >}
     * {@link JAXBElement }{@code <}{@link Inetlisteningserver510State }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_catos.LineState }{@code >}
     * {@link JAXBElement }{@code <}{@link HttpdState }{@code >}
     * {@link JAXBElement }{@code <}{@link AuditeventpolicysubcategoriesState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.RouterState }{@code >}
     * {@link JAXBElement }{@code <}{@link NvramState }{@code >}
     * {@link JAXBElement }{@code <}{@link FilesetState }{@code >}
     * {@link JAXBElement }{@code <}{@link ClassMapState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.SectionState }{@code >}
     * {@link JAXBElement }{@code <}{@link FacetState }{@code >}
     * {@link JAXBElement }{@code <}{@link NoState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.SnmphostState }{@code >}
     * {@link JAXBElement }{@code <}{@link FamilyState }{@code >}
     * {@link JAXBElement }{@code <}{@link SelinuxbooleanState }{@code >}
     * {@link JAXBElement }{@code <}{@link ConfigState }{@code >}
     * {@link JAXBElement }{@code <}{@link PlistState }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceeffectiverightsState }{@code >}
     * {@link JAXBElement }{@code <}{@link PasswordpolicyState }{@code >}
     * {@link JAXBElement }{@code <}{@link SlackwarepkginfoState }{@code >}
     * {@link JAXBElement }{@code <}{@link Regkeyeffectiverights53State }{@code >}
     * {@link JAXBElement }{@code <}{@link Wmi57State }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_windows.Process58State }{@code >}
     * {@link JAXBElement }{@code <}{@link ActivedirectoryState }{@code >}
     * {@link JAXBElement }{@code <}{@link ShadowState }{@code >}
     * {@link JAXBElement }{@code <}{@link Spjobdefinition510State }{@code >}
     * {@link JAXBElement }{@code <}{@link Filehash58State }{@code >}
     * {@link JAXBElement }{@code <}{@link AppmanagerState }{@code >}
     * {@link JAXBElement }{@code <}{@link XmlShowState }{@code >}
     * {@link JAXBElement }{@code <}{@link BestbetState }{@code >}
     * {@link JAXBElement }{@code <}{@link ServiceState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_windows.FileState }{@code >}
     * {@link JAXBElement }{@code <}{@link PackageavoidlistState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_junos.VersionState }{@code >}
     * {@link JAXBElement }{@code <}{@link SpwebapplicationState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_unix.PasswordState }{@code >}
     * {@link JAXBElement }{@code <}{@link PackageState }{@code >}
     * {@link JAXBElement }{@code <}{@link SnmpHostState }{@code >}
     * {@link JAXBElement }{@code <}{@link FileextendedattributeState }{@code >}
     * {@link JAXBElement }{@code <}{@link KeychainState }{@code >}
     * {@link JAXBElement }{@code <}{@link PackagecheckState }{@code >}
     * {@link JAXBElement }{@code <}{@link CorestorageState }{@code >}
     * {@link JAXBElement }{@code <}{@link SppolicyState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_asa.AclState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.VersionState }{@code >}
     * {@link JAXBElement }{@code <}{@link SmfState }{@code >}
     * {@link JAXBElement }{@code <}{@link ProfileState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_windows.ProcessState }{@code >}
     * {@link JAXBElement }{@code <}{@link TcpMapState }{@code >}
     * {@link JAXBElement }{@code <}{@link XinetdState }{@code >}
     * {@link JAXBElement }{@code <}{@link SpjobdefinitionState }{@code >}
     * {@link JAXBElement }{@code <}{@link Plist511State }{@code >}
     * {@link JAXBElement }{@code <}{@link ImageState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.BgpneighborState }{@code >}
     * {@link JAXBElement }{@code <}{@link SoftwareupdateState }{@code >}
     * {@link JAXBElement }{@code <}{@link WifiState }{@code >}
     * {@link JAXBElement }{@code <}{@link SharedresourceeffectiverightsState }{@code >}
     * {@link JAXBElement }{@code <}{@link SpsiteState }{@code >}
     * {@link JAXBElement }{@code <}{@link UserSidState }{@code >}
     * {@link JAXBElement }{@code <}{@link InfopolicycollState }{@code >}
     * {@link JAXBElement }{@code <}{@link Textfilecontent54State }{@code >}
     * {@link JAXBElement }{@code <}{@link VolumeState }{@code >}
     * {@link JAXBElement }{@code <}{@link LockoutpolicyState }{@code >}
     * {@link JAXBElement }{@code <}{@link MetabaseState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_pixos.LineState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.SnmpuserState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_android.PasswordState }{@code >}
     * {@link JAXBElement }{@code <}{@link Patch56State }{@code >}
     * {@link JAXBElement }{@code <}{@link PackagepublisherState }{@code >}
     * {@link JAXBElement }{@code <}{@link PartitionState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_ios.SnmpgroupState }{@code >}
     * {@link JAXBElement }{@code <}{@link FixState }{@code >}
     * {@link JAXBElement }{@code <}{@link SpdiagnosticsserviceState }{@code >}
     * {@link JAXBElement }{@code <}{@link VisdkmanagedobjectState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_catos.Version55State }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_esx.VersionState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_windows.InterfaceState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_iosxe.SnmphostState }{@code >}
     * {@link JAXBElement }{@code <}{@link org.mitre.oval.xmlschema.oval_definitions_5_unix.Process58State }{@code >}
     * {@link JAXBElement }{@code <}{@link Package511State }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends StateType>> getState() {
        if (state == null) {
            state = new ArrayList<JAXBElement<? extends StateType>>();
        }
        return this.state;
    }

}
