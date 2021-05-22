


package org.mitre.oval.xmlschema.oval_definitions_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import org.mitre.oval.xmlschema.oval_common_5.OperationEnumeration;


/**
 * The RestrictionType complex type outlines a restriction that is placed on expected values for an external variable. For example, a possible value may be restricted to a integer less than 10. Please refer to the operationEnumeration simple type for a description of the valid operations.
 * 
 * <p>Java class for RestrictionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RestrictionType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anySimpleType">
 *       &lt;attribute name="operation" use="required" type="{http://oval.mitre.org/XMLSchema/oval-common-5}OperationEnumeration" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestrictionType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", propOrder = {
    "value"
})
public class RestrictionType {

    @XmlValue
    @XmlSchemaType(name = "anySimpleType")
    protected Object value;
    @XmlAttribute(name = "operation", required = true)
    protected OperationEnumeration operation;

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
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link OperationEnumeration }
     *     
     */
    public OperationEnumeration getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationEnumeration }
     *     
     */
    public void setOperation(OperationEnumeration value) {
        this.operation = value;
    }

}
