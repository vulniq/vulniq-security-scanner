
package org.mitre.oval.xmlschema.oval_definitions_5_ios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateStringType;


/**
 * The EntityStateRoutingProtocolType complex type restricts a
 *                         string value to a specific set of values: IPV4, IPV6. These values describe
 *                         if an ACL is for IPv4 or IPv6 in a Cisco IOS configuration. The empty string
 *                         is also allowed to support empty element associated with variable
 *                         references. Note that when using pattern matches and variables care must be
 *                         taken to ensure that the regular expression and variable values align with
 *                         the enumerated values.
 * 
 * <p>Java class for EntityStateAccessListIPVersionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityStateAccessListIPVersionType">
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
@XmlType(name = "EntityStateAccessListIPVersionType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios")
public class EntityStateAccessListIPVersionType
    extends EntityStateStringType
{


}
