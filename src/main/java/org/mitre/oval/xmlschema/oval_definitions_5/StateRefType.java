
package org.mitre.oval.xmlschema.oval_definitions_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The StateRefType complex type defines a state reference to be used by OVAL Tests that are defined in the component schemas. The required state_ref attribute specifies the id of the OVAL State being referenced.
 * 
 * <p>Java class for StateRefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StateRefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="state_ref" use="required" type="{http://oval.mitre.org/XMLSchema/oval-common-5}StateIDPattern" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StateRefType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
public class StateRefType {

    @XmlAttribute(name = "state_ref", required = true)
    protected String stateRef;

    /**
     * Gets the value of the stateRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateRef() {
        return stateRef;
    }

    /**
     * Sets the value of the stateRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateRef(String value) {
        this.stateRef = value;
    }

}
