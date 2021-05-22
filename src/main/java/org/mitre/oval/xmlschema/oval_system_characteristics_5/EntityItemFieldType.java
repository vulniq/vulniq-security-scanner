


package org.mitre.oval.xmlschema.oval_system_characteristics_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Note that when the mask attribute is set to 'true' on a field's parent element the field must be masked regardless of the field's mask attribute value.
 * 
 * <p>Java class for EntityItemFieldType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityItemFieldType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anySimpleType">
 *       &lt;attGroup ref="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityAttributeGroup"/>
 *       &lt;attribute name="name" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[^A-Z]+"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityItemFieldType", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", propOrder = {
    "value"
})
public class EntityItemFieldType {

    @XmlValue
    @XmlSchemaType(name = "anySimpleType")
    protected Object value;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "datatype")
    protected String datatype;
    @XmlAttribute(name = "mask")
    protected Boolean mask;
    @XmlAttribute(name = "status")
    protected StatusEnumeration status;

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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusEnumeration }
     *     
     */
    public StatusEnumeration getStatus() {
        if (status == null) {
            return StatusEnumeration.EXISTS;
        } else {
            return status;
        }
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusEnumeration }
     *     
     */
    public void setStatus(StatusEnumeration value) {
        this.status = value;
    }

}
