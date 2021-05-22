


package org.mitre.oval.xmlschema.oval_system_characteristics_5_ios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;


/**
 * The EntityItemAccessListUseType complex type restricts a string
 *                     value to a specific set of values: INTERFACE, CRYPTO_MAP_MATCH, CLASS_MAP_MATCH,
 *                     ROUTE_MAP_MATCH, IGMP_FILTER, VTY. These values describe the ACL use in a Cisco
 *                     IOS configuration.  The empty string is also allowed to support empty elements
 *                     associated with error conditions.
 * 
 * <p>Java class for EntityItemAccessListUseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityItemAccessListUseType">
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
@XmlType(name = "EntityItemAccessListUseType", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios")
public class EntityItemAccessListUseType
    extends EntityItemStringType
{


}
