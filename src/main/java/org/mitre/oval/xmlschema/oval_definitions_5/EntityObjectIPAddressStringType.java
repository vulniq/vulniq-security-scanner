


package org.mitre.oval.xmlschema.oval_definitions_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The EntityObjectIPAddressStringType type is extended by the entities of an individual OVAL Object. This type provides uniformity to each object entity by including the attributes found in the EntitySimpleBaseType. This specific type describes any IPv4/IPv6 address, address prefix, or its string representation.
 * 
 * <p>Java class for EntityObjectIPAddressStringType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityObjectIPAddressStringType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntitySimpleBaseType">
 *       &lt;attribute name="datatype" default="string">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration">
 *             &lt;enumeration value="ipv4_address"/>
 *             &lt;enumeration value="ipv6_address"/>
 *             &lt;enumeration value="string"/>
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
@XmlType(name = "EntityObjectIPAddressStringType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
public class EntityObjectIPAddressStringType
    extends EntitySimpleBaseType
{


}
