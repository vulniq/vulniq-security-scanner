


package org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;


/**
 * The EntityItemRoutingProtocolType complex type restricts a string
 *                 value to a specific set of values: IPV4, IPV6. These values describe if an ACL is
 *                 for IPv4 or IPv6 in a Cisco IOS-XE configuration. The empty string is also allowed
 *                 to support empty element associated with error conditions.
 * 
 * <p>Java class for EntityItemAccessListIPVersionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityItemAccessListIPVersionType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-system-characteristics-5>EntityItemStringType">
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityItemAccessListIPVersionType", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe")
public class EntityItemAccessListIPVersionType
    extends EntityItemStringType
{


}
