
package org.mitre.oval.xmlschema.oval_common_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The DeprecatedInfoType complex type defines a structure that will be used to flag schema-defined constructs as deprecated.  It holds information related to the version of OVAL when the construct was deprecated along with a reason and comment.
 * 
 * <p>Java class for DeprecatedInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeprecatedInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="version">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://oval.mitre.org/XMLSchema/oval-common-5}SchemaVersionPattern">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeprecatedInfoType", namespace = "http://oval.mitre.org/XMLSchema/oval-common-5", propOrder = {
    "version",
    "reason",
    "comment"
})
public class DeprecatedInfoType {

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-common-5", required = true)
    protected String version;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-common-5", required = true)
    protected String reason;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-common-5")
    protected String comment;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

}
