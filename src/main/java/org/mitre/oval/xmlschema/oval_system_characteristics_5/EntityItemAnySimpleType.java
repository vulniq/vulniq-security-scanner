


package org.mitre.oval.xmlschema.oval_system_characteristics_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The EntityItemAnySimpleType type is extended by the entities of an individual item. This type provides uniformity to each entity by including the attributes found in the EntityItemSimpleBaseType. This specific type describes any simple data.
 * 
 * <p>Java class for EntityItemAnySimpleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityItemAnySimpleType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-system-characteristics-5>EntityItemSimpleBaseType">
 *       &lt;attribute name="datatype" type="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration" default="string" />
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityItemAnySimpleType", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5")
@XmlSeeAlso({
    org.mitre.oval.xmlschema.oval_system_characteristics_5_hpux.SwlistItem.Version.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_freebsd.PortinfoItem.Version.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.FileItem.GroupId.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.FileItem.UserId.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.FileItem.ATime.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.FileItem.CTime.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.FileItem.MTime.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.PasswordItem.UserId.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.PasswordItem.GroupId.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.ShadowItem.ChgLst.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.ShadowItem.ChgAllow.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.ShadowItem.ChgReq.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.ShadowItem.ExpWarn.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.ShadowItem.ExpInact.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.ShadowItem.ExpDate.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_unix.ShadowItem.Flag.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_windows.FileItem.ProductVersion.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.RouterItem.OspfAuthenticationArea.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.RoutingprotocolauthintfItem.OspfArea.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.InterfaceItem.SwitchportNativeVlan.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe.InterfaceItem.SwitchportAccessVlan.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.RouterItem.OspfAuthenticationArea.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.RoutingprotocolauthintfItem.OspfArea.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.InterfaceItem.IpDirectedBroadcastCommand.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.InterfaceItem.ProxyArpCommand.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.InterfaceItem.ShutdownCommand.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.InterfaceItem.SwitchportNativeVlan.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_ios.InterfaceItem.SwitchportAccessVlan.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.RpmverifypackageItem.Epoch.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.RpmverifypackageItem.Version.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.RpmverifypackageItem.Release.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.RpminfoItem.Epoch.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.RpminfoItem.Release.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.RpminfoItem.Version.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.DpkginfoItem.Epoch.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.DpkginfoItem.Release.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.DpkginfoItem.Version.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.DpkginfoItem.Evr.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.RpmverifyfileItem.Epoch.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.RpmverifyfileItem.Version.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.RpmverifyfileItem.Release.class,
    org.mitre.oval.xmlschema.oval_system_characteristics_5_linux.SlackwarepkginfoItem.Version.class
})
public class EntityItemAnySimpleType
    extends EntityItemSimpleBaseType
{


}
