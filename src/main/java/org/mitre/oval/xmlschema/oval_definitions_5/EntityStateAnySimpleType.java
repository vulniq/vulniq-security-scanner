
package org.mitre.oval.xmlschema.oval_definitions_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The EntityStateAnySimpleType type is extended by the entities of an individual OVAL State. This type provides uniformity to each state entity by including the attributes found in the EntityStateSimpleBaseType. This specific type describes any simple data.
 * 
 * <p>Java class for EntityStateAnySimpleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityStateAnySimpleType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntityStateSimpleBaseType">
 *       &lt;attribute name="datatype" type="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration" default="string" />
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityStateAnySimpleType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
@XmlSeeAlso({
    org.mitre.oval.xmlschema.oval_definitions_5_windows.FileState.ProductVersion.class,
    org.mitre.oval.xmlschema.oval_definitions_5_hpux.SwlistState.Version.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.RouterState.OspfAuthenticationArea.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.InterfaceState.SwitchportNativeVlan.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.InterfaceState.SwitchportAccessVlan.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.RoutingprotocolauthintfState.OspfArea.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.RoutingprotocolauthintfState.OspfArea.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.RouterState.OspfAuthenticationArea.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.InterfaceState.IpDirectedBroadcastCommand.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.InterfaceState.ProxyArpCommand.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.InterfaceState.ShutdownCommand.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.InterfaceState.SwitchportNativeVlan.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.InterfaceState.SwitchportAccessVlan.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.RpminfoState.Epoch.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.RpminfoState.Release.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.RpminfoState.Version.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifypackageState.Epoch.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifypackageState.Version.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifypackageState.Release.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.SlackwarepkginfoState.Version.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.DpkginfoState.Epoch.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.DpkginfoState.Release.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.DpkginfoState.Version.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.DpkginfoState.Evr.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifyfileState.Epoch.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifyfileState.Version.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifyfileState.Release.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.PasswordState.UserId.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.PasswordState.GroupId.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.ShadowState.ChgLst.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.ShadowState.ChgAllow.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.ShadowState.ChgReq.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.ShadowState.ExpWarn.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.ShadowState.ExpInact.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.ShadowState.ExpDate.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.ShadowState.Flag.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.FileState.GroupId.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.FileState.UserId.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.FileState.ATime.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.FileState.CTime.class,
    org.mitre.oval.xmlschema.oval_definitions_5_unix.FileState.MTime.class,
    org.mitre.oval.xmlschema.oval_definitions_5_freebsd.PortinfoState.Version.class
})
public class EntityStateAnySimpleType
    extends EntityStateSimpleBaseType
{


}
