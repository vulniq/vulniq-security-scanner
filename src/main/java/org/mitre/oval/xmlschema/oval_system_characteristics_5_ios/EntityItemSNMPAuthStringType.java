
package org.mitre.oval.xmlschema.oval_system_characteristics_5_ios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;


/**
 * The EntityItemSNMPAuthStringType complex type restricts a string value to a specific set of values: MD5, SHA. These values describe the authentication algorithm in a Cisco IOS SNMPv3 related configurations. The empty string is also allowed to support empty elements associated with error conditions.
 * 
 * <p>Java class for EntityItemSNMPAuthStringType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityItemSNMPAuthStringType">
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
@XmlType(name = "EntityItemSNMPAuthStringType", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#ios")
public class EntityItemSNMPAuthStringType
    extends EntityItemStringType
{


}
