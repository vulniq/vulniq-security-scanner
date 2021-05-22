


package org.mitre.oval.xmlschema.oval_results_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * The TestedVariableType complex type holds the value of a variable used during the evaluation of a test. Of special importance are the values of any external variables used since these values are not captured in either the definition or system characteristic documents. If a variable is represented by a collection of values, then multiple elements of TestedVariableType, each with the same variable_id attribute, would exist. The required variable_id attribute is the unique id of the variable that was used.
 * 
 * <p>Java class for TestedVariableType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestedVariableType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anySimpleType">
 *       &lt;attribute name="variable_id" use="required" type="{http://oval.mitre.org/XMLSchema/oval-common-5}VariableIDPattern" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestedVariableType", namespace = "http://oval.mitre.org/XMLSchema/oval-results-5", propOrder = {
    "value"
})
public class TestedVariableType {

    @XmlValue
    @XmlSchemaType(name = "anySimpleType")
    protected Object value;
    @XmlAttribute(name = "variable_id", required = true)
    protected String variableId;

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
     * Gets the value of the variableId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariableId() {
        return variableId;
    }

    /**
     * Sets the value of the variableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariableId(String value) {
        this.variableId = value;
    }

}
