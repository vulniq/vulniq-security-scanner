


package org.mitre.oval.xmlschema.oval_definitions_5_windows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateStringType;


/**
 * The EntityStateServiceTypeType complex type defines the different values that are valid for the service_type entity of a service. Note that the Windows API returns a DWORD value and OVAL uses the constant name that is normally defined for these return values. This is done to increase readability and maintainability of OVAL Definitions. The empty string is also allowed as a valid value to support an empty element that is found when a variable reference is used within the service_type entity. Note that when using pattern matches and variables care must be taken to ensure that the regular expression and variable values align with the enumerated values.
 * 
 * <p>Java class for EntityStateServiceTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityStateServiceTypeType">
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
@XmlType(name = "EntityStateServiceTypeType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
public class EntityStateServiceTypeType
    extends EntityStateStringType
{


}
