


package org.mitre.oval.xmlschema.oval_definitions_5_independent;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectStringType;


/**
 * The EntityObjectEngineType complex type defines a string entity value that is restricted to a set of enumerations. Each valid enumeration is a valid database engine. The empty string is also allowed to support empty elements associated with variable references.
 * 
 * <p>Java class for EntityObjectEngineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityObjectEngineType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntityObjectStringType">
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityObjectEngineType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent")
public class EntityObjectEngineType
    extends EntityObjectStringType
{


}
