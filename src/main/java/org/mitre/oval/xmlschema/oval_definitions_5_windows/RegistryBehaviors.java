


package org.mitre.oval.xmlschema.oval_definitions_5_windows;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The RegistryBehaviors complex type defines a number of behaviors that allow a more detailed definition of the registry_object being specified.  Note that using these behaviors may result in some unique results.  For example, a double negative type condition might be created where an object entity says include everything except a specific item, but a behavior is used that might then add that item back in.
 * 
 * <p>Java class for RegistryBehaviors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistryBehaviors">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="max_depth" default="-1">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;fractionDigits value="0"/>
 *             &lt;minInclusive value="-1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="recurse_direction" default="none">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="none"/>
 *             &lt;enumeration value="up"/>
 *             &lt;enumeration value="down"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="windows_view" default="64_bit">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="32_bit"/>
 *             &lt;enumeration value="64_bit"/>
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
@XmlType(name = "RegistryBehaviors", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
@XmlSeeAlso({
    RegkeyEffectiveRightsBehaviors.class,
    RegkeyAuditPermissions53Behaviors.class,
    RegkeyAuditPermissionsBehaviors.class,
    RegkeyEffectiveRights53Behaviors.class
})
public class RegistryBehaviors {

    @XmlAttribute(name = "max_depth")
    protected BigInteger maxDepth;
    @XmlAttribute(name = "recurse_direction")
    protected String recurseDirection;
    @XmlAttribute(name = "windows_view")
    protected String windowsView;

    /**
     * Gets the value of the maxDepth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxDepth() {
        if (maxDepth == null) {
            return new BigInteger("-1");
        } else {
            return maxDepth;
        }
    }

    /**
     * Sets the value of the maxDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxDepth(BigInteger value) {
        this.maxDepth = value;
    }

    /**
     * Gets the value of the recurseDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurseDirection() {
        if (recurseDirection == null) {
            return "none";
        } else {
            return recurseDirection;
        }
    }

    /**
     * Sets the value of the recurseDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurseDirection(String value) {
        this.recurseDirection = value;
    }

    /**
     * Gets the value of the windowsView property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindowsView() {
        if (windowsView == null) {
            return "64_bit";
        } else {
            return windowsView;
        }
    }

    /**
     * Sets the value of the windowsView property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindowsView(String value) {
        this.windowsView = value;
    }

}
