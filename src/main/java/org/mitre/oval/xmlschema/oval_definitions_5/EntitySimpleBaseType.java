
package org.mitre.oval.xmlschema.oval_definitions_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import org.mitre.oval.xmlschema.oval_common_5.CheckEnumeration;
import org.mitre.oval.xmlschema.oval_common_5.OperationEnumeration;


/**
 * The EntitySimpleBaseType complex type is an abstract type that defines the default attributes associated with every simple entity. Entities can be found in both OVAL Objects and OVAL States and represent the individual properties associated with items found on a system. An example of a single entity would be the path of a file. Another example would be the version of the file.
 * 
 * <p>Java class for EntitySimpleBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntitySimpleBaseType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anySimpleType">
 *       &lt;attGroup ref="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityAttributeGroup"/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntitySimpleBaseType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", propOrder = {
    "value"
})
@XmlSeeAlso({
    EntityObjectBinaryType.class,
    EntityObjectIPAddressStringType.class,
    EntityObjectBoolType.class,
    EntityObjectVersionType.class,
    EntityObjectFloatType.class,
    EntityObjectIPAddressType.class,
    EntityObjectIntType.class,
    EntityObjectAnySimpleType.class,
    EntityStateSimpleBaseType.class,
    EntityObjectStringType.class
})
public abstract class EntitySimpleBaseType {

    @XmlValue
    @XmlSchemaType(name = "anySimpleType")
    protected Object value;
    @XmlAttribute(name = "datatype")
    protected String datatype;
    @XmlAttribute(name = "operation")
    protected OperationEnumeration operation;
    @XmlAttribute(name = "mask")
    protected Boolean mask;
    @XmlAttribute(name = "var_ref")
    protected String varRef;
    @XmlAttribute(name = "var_check")
    protected CheckEnumeration varCheck;

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
     *     {@link String }
     *     
     */
    public String getDatatype() {
        if (datatype == null) {
            return "string";
        } else {
            return datatype;
        }
    }

    /**
     * Sets the value of the datatype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatatype(String value) {
        this.datatype = value;
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
        if (operation == null) {
            return OperationEnumeration.EQUALS;
        } else {
            return operation;
        }
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

    /**
     * Gets the value of the mask property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMask() {
        if (mask == null) {
            return false;
        } else {
            return mask;
        }
    }

    /**
     * Sets the value of the mask property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMask(Boolean value) {
        this.mask = value;
    }

    /**
     * Gets the value of the varRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVarRef() {
        return varRef;
    }

    /**
     * Sets the value of the varRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVarRef(String value) {
        this.varRef = value;
    }

    /**
     * Gets the value of the varCheck property.
     * 
     * @return
     *     possible object is
     *     {@link CheckEnumeration }
     *     
     */
    public CheckEnumeration getVarCheck() {
        return varCheck;
    }

    /**
     * Sets the value of the varCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckEnumeration }
     *     
     */
    public void setVarCheck(CheckEnumeration value) {
        this.varCheck = value;
    }

}
