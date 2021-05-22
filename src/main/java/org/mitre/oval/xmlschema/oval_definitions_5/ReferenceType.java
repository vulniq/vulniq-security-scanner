
package org.mitre.oval.xmlschema.oval_definitions_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The required source attribute specifies where the reference is coming from. In other words, it identifies the reference repository being used. The required ref_id attribute is the external id of the reference. The optional ref_url attribute is the URL to the reference.
 * 
 * <p>Java class for ReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="source" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ref_id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ref_url" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
public class ReferenceType {

    @XmlAttribute(name = "source", required = true)
    protected String source;
    @XmlAttribute(name = "ref_id", required = true)
    protected String refId;
    @XmlAttribute(name = "ref_url")
    @XmlSchemaType(name = "anyURI")
    protected String refUrl;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the refId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefId() {
        return refId;
    }

    /**
     * Sets the value of the refId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefId(String value) {
        this.refId = value;
    }

    /**
     * Gets the value of the refUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefUrl() {
        return refUrl;
    }

    /**
     * Sets the value of the refUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefUrl(String value) {
        this.refUrl = value;
    }

}
