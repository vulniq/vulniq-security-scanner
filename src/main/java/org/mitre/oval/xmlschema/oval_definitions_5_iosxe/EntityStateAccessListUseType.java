


package org.mitre.oval.xmlschema.oval_definitions_5_iosxe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateStringType;


/**
 * The EntityStateAccessListUseType complex type restricts a string value to a specific set of values: INTERFACE, CRYPTO_MAP_MATCH, CLASS_MAP_MATCH, ROUTE_MAP_MATCH, IGMP_FILTER, VTY. These values describe the ACL use in a Cisco IOS-XE configuration. The empty string is also allowed to support empty element associated with variable references. Note that when using pattern matches and variables care must be taken to ensure that the regular expression and variable values align with the enumerated values.
 * 
 * <p>Java class for EntityStateAccessListUseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityStateAccessListUseType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntityStateStringType">
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityStateAccessListUseType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe")
public class EntityStateAccessListUseType
    extends EntityStateStringType
{


}
