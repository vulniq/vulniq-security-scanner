
package org.mitre.oval.xmlschema.oval_definitions_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The EntityStateEVRStringType type is extended by the entities of an individual OVAL State. This type provides uniformity to each state entity by including the attributes found in the EntityStateSimpleBaseType. This type represents the epoch, version, and release fields, for an RPM package, as a single version string. It has the form "EPOCH:VERSION-RELEASE". Note that a null epoch (or '(none)' as returned by rpm) is equivalent to '0' and would hence have the form 0:VERSION-RELEASE. Comparisons involving this datatype should follow the algorithm of librpm's rpmvercmp() function.
 * 
 * <p>Java class for EntityStateEVRStringType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityStateEVRStringType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntityStateSimpleBaseType">
 *       &lt;attribute name="datatype" use="required" type="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration" fixed="evr_string" />
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityStateEVRStringType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
public class EntityStateEVRStringType
    extends EntityStateSimpleBaseType
{


}
