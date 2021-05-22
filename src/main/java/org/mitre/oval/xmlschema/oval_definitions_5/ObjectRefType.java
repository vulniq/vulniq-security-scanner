
package org.mitre.oval.xmlschema.oval_definitions_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The ObjectRefType complex type defines an object reference to be used by OVAL Tests that are defined in the component schemas. The required object_ref attribute specifies the id of the OVAL Object being referenced.
 * 
 * <p>Java class for ObjectRefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectRefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="object_ref" use="required" type="{http://oval.mitre.org/XMLSchema/oval-common-5}ObjectIDPattern" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectRefType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
public class ObjectRefType {

    @XmlAttribute(name = "object_ref", required = true)
    protected String objectRef;

    /**
     * Gets the value of the objectRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectRef() {
        return objectRef;
    }

    /**
     * Sets the value of the objectRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectRef(String value) {
        this.objectRef = value;
    }

}
