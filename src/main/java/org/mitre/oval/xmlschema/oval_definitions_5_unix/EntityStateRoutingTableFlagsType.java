


package org.mitre.oval.xmlschema.oval_definitions_5_unix;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateStringType;


/**
 * The EntityStateRoutingTableFlagsType complex type restricts a string value to a specific set of values that describe the flags associated with a routing table entry. This list is based off the values defined in the man pages of various platforms. For Linux, please see route(8). For Solaris, please see netstat(1M). For HP-UX, please see netstat(1). For Mac OS, please see netstat(1). For FreeBSD, please see netstat(1). Documentation on each allowed value can be found in the previously listed man pages. The empty string is also allowed to support empty elements associated with variable references. Note that when using pattern matches and variables care must be taken to ensure that the regular expression and variable values align with the enumerated values.
 * 
 * <p>Java class for EntityStateRoutingTableFlagsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityStateRoutingTableFlagsType">
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
@XmlType(name = "EntityStateRoutingTableFlagsType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#unix")
public class EntityStateRoutingTableFlagsType
    extends EntityStateStringType
{


}
