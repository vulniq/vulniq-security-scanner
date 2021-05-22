


package org.mitre.oval.xmlschema.oval_system_characteristics_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The EntityItemComplexBaseType complex type is an abstract type that serves as the base type for all complex item entities.
 * 
 * <p>Java class for EntityItemComplexBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityItemComplexBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityAttributeGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityItemComplexBaseType", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5")
@XmlSeeAlso({
    EntityItemRecordType.class
})
public abstract class EntityItemComplexBaseType {

    @XmlAttribute(name = "datatype")
    protected String datatype;
    @XmlAttribute(name = "mask")
    protected Boolean mask;
    @XmlAttribute(name = "status")
    protected StatusEnumeration status;

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
