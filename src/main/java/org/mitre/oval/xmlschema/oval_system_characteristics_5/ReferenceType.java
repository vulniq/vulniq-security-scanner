


package org.mitre.oval.xmlschema.oval_system_characteristics_5;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The ReferenceType complex type specifies an item in the system characteristics file. This reference is used to link global OVAL Objects to specific items.
 * 
 * <p>Java class for ReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="item_ref" use="required" type="{http://oval.mitre.org/XMLSchema/oval-common-5}ItemIDPattern" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceType", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5")
public class ReferenceType {

    @XmlAttribute(name = "item_ref", required = true)
    protected BigInteger itemRef;

    /**
     * Gets the value of the itemRef property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getItemRef() {
        return itemRef;
    }

    /**
     * Sets the value of the itemRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setItemRef(BigInteger value) {
        this.itemRef = value;
    }

}
