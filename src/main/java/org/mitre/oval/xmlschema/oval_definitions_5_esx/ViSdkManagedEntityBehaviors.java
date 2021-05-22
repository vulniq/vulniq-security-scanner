


package org.mitre.oval.xmlschema.oval_definitions_5_esx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The ViSdkManagedEntityBehaviors complex type defines a number of behaviors that allow a more detailed definition of the visdkmanagedobject_object being specified.  Note that using these behaviors is *highly* encouraged because enumerating all Managed Objects in an inventory hierarchy could cause performance problems.  Interpreters should enumerate only the entities specified by the behavior prior to set/filter logic and evaluation.
 * 
 * <p>Java class for ViSdkManagedEntityBehaviors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViSdkManagedEntityBehaviors">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="managed_entity_type" default="VirtualMachine">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="ClusterComputerResource"/>
 *             &lt;enumeration value="ComputeResource"/>
 *             &lt;enumeration value="Datacenter"/>
 *             &lt;enumeration value="Datastore"/>
 *             &lt;enumeration value="DistributedVirtualPortgroup"/>
 *             &lt;enumeration value="DistributedVirtualSwitch"/>
 *             &lt;enumeration value="Folder"/>
 *             &lt;enumeration value="HostSystem"/>
 *             &lt;enumeration value="Network"/>
 *             &lt;enumeration value="ResourcePool"/>
 *             &lt;enumeration value="VirtualApp"/>
 *             &lt;enumeration value="VirtualMachine"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViSdkManagedEntityBehaviors", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#esx")
public class ViSdkManagedEntityBehaviors {

    @XmlAttribute(name = "managed_entity_type")
    protected String managedEntityType;

    /**
     * Gets the value of the managedEntityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagedEntityType() {
        if (managedEntityType == null) {
            return "VirtualMachine";
        } else {
            return managedEntityType;
        }
    }

    /**
     * Sets the value of the managedEntityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagedEntityType(String value) {
        this.managedEntityType = value;
    }

}
