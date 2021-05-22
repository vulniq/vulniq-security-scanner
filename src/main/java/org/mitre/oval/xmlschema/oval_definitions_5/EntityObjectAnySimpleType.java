
package org.mitre.oval.xmlschema.oval_definitions_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The EntityObjectAnySimpleType type is extended by the entities of an individual OVAL Object. This type provides uniformity to each object entity by including the attributes found in the EntitySimpleBaseType. This specific type describes any simple data.
 * 
 * <p>Java class for EntityObjectAnySimpleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityObjectAnySimpleType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntitySimpleBaseType">
 *       &lt;attribute name="datatype" type="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration" default="string" />
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityObjectAnySimpleType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
@XmlSeeAlso({
    org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifypackageObject.Epoch.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifypackageObject.Version.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifypackageObject.Release.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifyfileObject.Epoch.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifyfileObject.Version.class,
    org.mitre.oval.xmlschema.oval_definitions_5_linux.RpmverifyfileObject.Release.class
})
public class EntityObjectAnySimpleType
    extends EntitySimpleBaseType
{


}
