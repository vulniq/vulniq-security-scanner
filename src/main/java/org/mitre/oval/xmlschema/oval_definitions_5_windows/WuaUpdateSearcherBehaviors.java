


package org.mitre.oval.xmlschema.oval_definitions_5_windows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The WuaUpdateSearcherBehaviors complex type defines behaviors that allow a more detailed definition of the wuaupdatesearcher_object being specified.  Note that using these behaviors may result in some unique results.  For example, a double negative type condition might be created where an object entity says include everything except a specific item, but a behavior is used that might then add that item back in.
 * 
 * <p>Java class for WuaUpdateSearcherBehaviors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WuaUpdateSearcherBehaviors">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="include_superseded_updates" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WuaUpdateSearcherBehaviors", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
public class WuaUpdateSearcherBehaviors {

    @XmlAttribute(name = "include_superseded_updates")
    protected Boolean includeSupersededUpdates;

    /**
     * Gets the value of the includeSupersededUpdates property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIncludeSupersededUpdates() {
        if (includeSupersededUpdates == null) {
            return true;
        } else {
            return includeSupersededUpdates;
        }
    }

    /**
     * Sets the value of the includeSupersededUpdates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeSupersededUpdates(Boolean value) {
        this.includeSupersededUpdates = value;
    }

}
