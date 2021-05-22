


package org.mitre.oval.xmlschema.oval_definitions_5_unix;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateStringType;


/**
 * The EntityStateXinetdTypeStatusType complex type restricts a string value to five values, either RPC, INTERNAL, UNLISTED, TCPMUX, or TCPMUXPLUS that specify the type of service registered in xinetd. The empty string is also allowed to support empty elements associated with variable references. Note that when using pattern matches and variables care must be taken to ensure that the regular expression and variable values align with the enumerated values.
 * 
 * <p>Java class for EntityStateXinetdTypeStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityStateXinetdTypeStatusType">
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
@XmlType(name = "EntityStateXinetdTypeStatusType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#unix")
public class EntityStateXinetdTypeStatusType
    extends EntityStateStringType
{


}
