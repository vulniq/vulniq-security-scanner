
package org.mitre.oval.xmlschema.oval_definitions_5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_common_5.FamilyEnumeration;


/**
 * Please note that the AffectedType will change in future versions of OVAL in order to support the Common Platform Enumeration (CPE).
 * 
 * <p>Java class for AffectedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffectedType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="platform" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="product" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="family" use="required" type="{http://oval.mitre.org/XMLSchema/oval-common-5}FamilyEnumeration" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", propOrder = {
    "platform",
    "product"
})
public class AffectedType {

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    protected List<String> platform;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    protected List<String> product;
    @XmlAttribute(name = "family", required = true)
    protected FamilyEnumeration family;

    /**
     * Gets the value of the platform property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the platform property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlatform().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPlatform() {
        if (platform == null) {
            platform = new ArrayList<String>();
        }
        return this.platform;
    }

    /**
     * Gets the value of the product property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the product property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProduct() {
        if (product == null) {
            product = new ArrayList<String>();
        }
        return this.product;
    }

    /**
     * Gets the value of the family property.
     * 
     * @return
     *     possible object is
     *     {@link FamilyEnumeration }
     *     
     */
    public FamilyEnumeration getFamily() {
        return family;
    }

    /**
     * Sets the value of the family property.
     * 
     * @param value
     *     allowed object is
     *     {@link FamilyEnumeration }
     *     
     */
    public void setFamily(FamilyEnumeration value) {
        this.family = value;
    }

}
