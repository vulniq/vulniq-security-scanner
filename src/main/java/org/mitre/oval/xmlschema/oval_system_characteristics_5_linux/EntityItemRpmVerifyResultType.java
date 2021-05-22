


package org.mitre.oval.xmlschema.oval_system_characteristics_5_linux;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;


/**
 * The EntityItemRpmVerifyResultType complex type restricts a string value to the set of possible outcomes of checking an attribute of a file included in an RPM against the actual value of that attribute in the RPM database. The empty string is also allowed to support empty elements associated with error conditions.
 * 
 * <p>Java class for EntityItemRpmVerifyResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityItemRpmVerifyResultType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-system-characteristics-5>EntityItemStringType">
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityItemRpmVerifyResultType", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
public class EntityItemRpmVerifyResultType
    extends EntityItemStringType
{


}
