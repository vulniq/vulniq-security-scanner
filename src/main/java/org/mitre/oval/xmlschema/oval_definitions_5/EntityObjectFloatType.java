


package org.mitre.oval.xmlschema.oval_definitions_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The EntityObjectFloatType type is extended by the entities of an individual OVAL Object. This type provides uniformity to each object entity by including the attributes found in the EntitySimpleBaseType. This specific type describes simple float data. The empty string is also allowed when using a variable reference with an element.
 * 
 * <p>Java class for EntityObjectFloatType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityObjectFloatType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntitySimpleBaseType">
 *       &lt;attribute name="datatype" use="required" type="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration" fixed="float" />
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityObjectFloatType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
public class EntityObjectFloatType
    extends EntitySimpleBaseType
{


}
