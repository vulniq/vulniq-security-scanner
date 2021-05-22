
package org.mitre.oval.xmlschema.oval_definitions_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.EntityObjectEngineType;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.EntityObjectHashTypeType;
import org.mitre.oval.xmlschema.oval_definitions_5_independent.EntityObjectVariableRefType;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.EntityObjectDataTypeType;
import org.mitre.oval.xmlschema.oval_definitions_5_macos.EntityStateDataTypeType;
import org.mitre.oval.xmlschema.oval_definitions_5_sharepoint.EntityObjectUrlZoneType;
import org.mitre.oval.xmlschema.oval_definitions_5_solaris.EntityObjectPublisherTypeType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.EntityObjectCmdletVerbType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.EntityObjectGUIDType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.EntityObjectNamingContextType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.EntityObjectProtocolType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.EntityObjectRegistryHiveType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.EntityObjectSystemMetricIndexType;
import org.mitre.oval.xmlschema.oval_definitions_5_windows.EntityObjectUserRightType;


/**
 * The EntityStringType type is extended by the entities of an individual OVAL Object. This type provides uniformity to each object entity by including the attributes found in the EntitySimpleBaseType. This specific type describes simple string data.
 * 
 * <p>Java class for EntityObjectStringType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityObjectStringType">
 *   &lt;simpleContent>
 *     &lt;restriction base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntitySimpleBaseType">
 *       &lt;attribute name="datatype" type="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration" fixed="string" />
 *     &lt;/restriction>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityObjectStringType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
@XmlSeeAlso({
    EntityObjectSystemMetricIndexType.class,
    EntityObjectCmdletVerbType.class,
    EntityObjectGUIDType.class,
    EntityObjectNamingContextType.class,
    EntityObjectRegistryHiveType.class,
    EntityObjectUserRightType.class,
    EntityObjectProtocolType.class,
    EntityObjectUrlZoneType.class,
    EntityObjectPublisherTypeType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_asa.EntityObjectAccessListIPVersionType.class,
    EntityObjectVariableRefType.class,
    EntityObjectEngineType.class,
    EntityObjectHashTypeType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.EntityObjectAccessListIPVersionType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_iosxe.EntityObjectRoutingProtocolType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.EntityObjectAccessListIPVersionType.class,
    org.mitre.oval.xmlschema.oval_definitions_5_ios.EntityObjectRoutingProtocolType.class,
    EntityStateDataTypeType.class,
    EntityObjectDataTypeType.class
})
public class EntityObjectStringType
    extends EntitySimpleBaseType
{


}
