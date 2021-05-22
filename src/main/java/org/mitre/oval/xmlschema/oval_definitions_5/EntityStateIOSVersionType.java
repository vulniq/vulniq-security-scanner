


package org.mitre.oval.xmlschema.oval_definitions_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The EntityStateIOSVersionType type is extended by the entities of an individual OVAL State. This type provides uniformity to each state entity by including the attributes found in the EntityStateSimpleBaseType. This specific type represents the version string related to CISCO IOS.
 * 
 * <p>Java class for EntityStateIOSVersionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityStateIOSVersionType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntityStateSimpleBaseType">
 *       &lt;attribute name="datatype" default="string">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration">
 *             &lt;enumeration value="ios_version"/>
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
@XmlType(name = "EntityStateIOSVersionType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
public class EntityStateIOSVersionType
    extends EntityStateSimpleBaseType
{


}
