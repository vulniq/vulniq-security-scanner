
package org.mitre.oval.xmlschema.oval_definitions_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The EntityStateVersionType type is extended by the entities of an individual OVAL State. This type provides uniformity to each state entity by including the attributes found in the EntityStateSimpleBaseType. This specific type describes simple version data.
 * 
 * <p>Java class for EntityStateVersionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityStateVersionType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntityStateSimpleBaseType">
 *       &lt;attribute name="datatype" use="required" type="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration" fixed="version" />
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityStateVersionType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
public class EntityStateVersionType
    extends EntityStateSimpleBaseType
{


}
