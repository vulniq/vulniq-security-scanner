
package org.mitre.oval.xmlschema.oval_definitions_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import org.mitre.oval.xmlschema.oval_common_5.SimpleDatatypeEnumeration;


/**
 * The LiteralComponentType complex type defines a literal value to be used as a component.  The optional datatype attribute defines the type of data expected.  The default datatype is 'string'.
 * 
 * <p>Java class for LiteralComponentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LiteralComponentType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anySimpleType">
 *       &lt;attribute name="datatype" type="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration" default="string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiteralComponentType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", propOrder = {
    "value"
})
public class LiteralComponentType {

    @XmlValue
    @XmlSchemaType(name = "anySimpleType")
    protected Object value;
    @XmlAttribute(name = "datatype")
    protected SimpleDatatypeEnumeration datatype;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setValue(Object value) {
        this.value = value;
    }

    /**
     * Gets the value of the datatype property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleDatatypeEnumeration }
     *     
     */
    public SimpleDatatypeEnumeration getDatatype() {
        if (datatype == null) {
            return SimpleDatatypeEnumeration.STRING;
        } else {
            return datatype;
        }
    }

    /**
     * Sets the value of the datatype property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleDatatypeEnumeration }
     *     
     */
    public void setDatatype(SimpleDatatypeEnumeration value) {
        this.datatype = value;
    }

}
