


package org.mitre.oval.xmlschema.oval_definitions_5_windows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateStringType;


/**
 * The EntityStateRegistryTypeType complex type defines the different values that are valid for the type entity of a registry state. These values describe the possible types of data stored in a registry key. The empty string is also allowed as a valid value to support an empty element that is found when a variable reference is used within the type entity. Note that when using pattern matches and variables care must be taken to ensure that the regular expression and variable values align with the enumerated values. Please note that the values identified are for the type entity and are not valid values for the datatype attribute. For information about how to encode registry data in OVAL for each of the different types, please visit the registry_state documentation.
 * 
 * <p>Java class for EntityStateRegistryTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityStateRegistryTypeType">
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
@XmlType(name = "EntityStateRegistryTypeType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
public class EntityStateRegistryTypeType
    extends EntityStateStringType
{


}
