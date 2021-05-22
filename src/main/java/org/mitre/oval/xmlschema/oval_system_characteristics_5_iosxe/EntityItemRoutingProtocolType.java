


package org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;


/**
 * The EntityItemRoutingProtocolType complex type restricts a string
 *                 value to a specific set of values: EIGRP, OSPF, BGP, RIP, RIPV2, ISIS. These values
 *                 describe the routing protocol used in a Cisco IOS-XE configuration. The empty string
 *                 is also allowed to support empty element associated with error
 *                 conditions.
 * 
 * <p>Java class for EntityItemRoutingProtocolType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityItemRoutingProtocolType">
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
@XmlType(name = "EntityItemRoutingProtocolType", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe")
public class EntityItemRoutingProtocolType
    extends EntityItemStringType
{


}
