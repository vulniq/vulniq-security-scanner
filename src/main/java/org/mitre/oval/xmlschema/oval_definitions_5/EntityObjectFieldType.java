


package org.mitre.oval.xmlschema.oval_definitions_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import org.mitre.oval.xmlschema.oval_common_5.CheckEnumeration;
import org.mitre.oval.xmlschema.oval_common_5.OperationEnumeration;


/**
 * Note that when the mask attribute is set to 'true' on a field's parent element the field must be masked regardless of the field's mask attribute value.
 * 
 * <p>Java class for EntityObjectFieldType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityObjectFieldType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anySimpleType">
 *       &lt;attGroup ref="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityAttributeGroup"/>
 *       &lt;attribute name="name" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[^A-Z]+"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="entity_check" type="{http://oval.mitre.org/XMLSchema/oval-common-5}CheckEnumeration" default="all" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityObjectFieldType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", propOrder = {
    "value"
})
public class EntityObjectFieldType {

    @XmlValue
    @XmlSchemaType(name = "anySimpleType")
    protected Object value;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "entity_check")
    protected CheckEnumeration entityCheck;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the entityCheck property.
     * 
     * @return
     *     possible object is
     *     {@link CheckEnumeration }
     *     
     */
    public CheckEnumeration getEntityCheck() {
        if (entityCheck == null) {
            return CheckEnumeration.ALL;
        } else {
            return entityCheck;
        }
    }

    /**
     * Sets the value of the entityCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckEnumeration }
     *     
     */
    public void setEntityCheck(CheckEnumeration value) {
        this.entityCheck = value;
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
