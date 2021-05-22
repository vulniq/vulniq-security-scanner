


package org.mitre.oval.xmlschema.oval_system_characteristics_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The EntityItemBinaryType type is extended by the entities of an individual item. This type provides uniformity to each entity by including the attributes found in the EntityItemSimpleBaseType. This specific type describes simple binary data. The empty string is also allowed for cases where there was an error in the data collection of an entity and a status needs to be reported.
 * 
 * <p>Java class for EntityItemBinaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityItemBinaryType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-system-characteristics-5>EntityItemSimpleBaseType">
 *       &lt;attribute name="datatype" use="required" type="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration" fixed="binary" />
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityItemBinaryType", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5")
public class EntityItemBinaryType
    extends EntityItemSimpleBaseType
{


}
