


package org.mitre.oval.xmlschema.oval_system_characteristics_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The EntityItemIPAddressType type is extended by the entities of an individual item. This type provides uniformity to each entity by including the attributes found in the EntityItemSimpleBaseType. This specific type describes any IPv4/IPv6 address or address prefix.
 * 
 * <p>Java class for EntityItemIPAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityItemIPAddressType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-system-characteristics-5>EntityItemSimpleBaseType">
 *       &lt;attribute name="datatype" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration">
 *             &lt;enumeration value="ipv4_address"/>
 *             &lt;enumeration value="ipv6_address"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityItemIPAddressType", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5")
public class EntityItemIPAddressType
    extends EntityItemSimpleBaseType
{


}
