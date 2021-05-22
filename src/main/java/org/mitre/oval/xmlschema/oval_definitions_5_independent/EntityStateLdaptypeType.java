


package org.mitre.oval.xmlschema.oval_definitions_5_independent;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateStringType;


/**
 * The EntityStateLdaptypeType complex type restricts a string value to a specific set of values that specify the different types of information that an ldap attribute can represent. The empty string is also allowed to support empty elements associated with variable references.
 * 
 * <p>Java class for EntityStateLdaptypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityStateLdaptypeType">
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
@XmlType(name = "EntityStateLdaptypeType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent")
public class EntityStateLdaptypeType
    extends EntityStateStringType
{


}
