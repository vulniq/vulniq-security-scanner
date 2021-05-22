


package org.mitre.oval.xmlschema.oval_definitions_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The optional record_field attribute specifies the name of a field in a record entity in an OVAL Item. The record_field attribute allows the value of a specific field to be retrieved from an entity with a datatype of 'record'. If a field with a matching name attribute value is not found in the referenced OVAL Item entity an error should be reported when determining the value of the ObjectComponentType.
 * 
 * <p>Java class for ObjectComponentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectComponentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="object_ref" use="required" type="{http://oval.mitre.org/XMLSchema/oval-common-5}ObjectIDPattern" />
 *       &lt;attribute name="item_field" use="required" type="{http://oval.mitre.org/XMLSchema/oval-common-5}NonEmptyStringType" />
 *       &lt;attribute name="record_field" type="{http://oval.mitre.org/XMLSchema/oval-common-5}NonEmptyStringType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectComponentType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
public class ObjectComponentType {

    @XmlAttribute(name = "object_ref", required = true)
    protected String objectRef;
    @XmlAttribute(name = "item_field", required = true)
    protected String itemField;
    @XmlAttribute(name = "record_field")
    protected String recordField;

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

    /**
     * Gets the value of the itemField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemField() {
        return itemField;
    }

    /**
     * Sets the value of the itemField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemField(String value) {
        this.itemField = value;
    }

    /**
     * Gets the value of the recordField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordField() {
        return recordField;
    }

    /**
     * Sets the value of the recordField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordField(String value) {
        this.recordField = value;
    }

}
