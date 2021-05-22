
package org.mitre.oval.xmlschema.oval_results_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * An individual directive element determines whether or not a specific type of result is included in the results document. The required reported attribute controls this by providing a true or false for the specific directive. The optional content attribute controls how much information about the specific result is provided. For example, thin content would only be the id of the definition and the result, while a full content set would be the definition id with the result along with results for all the individual tests and extended definitions.  Please refer to the oval-res:ContentEnumeration for details about the different content options.
 * 
 * <p>Java class for DirectiveType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectiveType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="reported" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="content" type="{http://oval.mitre.org/XMLSchema/oval-results-5}ContentEnumeration" default="full" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectiveType", namespace = "http://oval.mitre.org/XMLSchema/oval-results-5")
public class DirectiveType {

    @XmlAttribute(name = "reported", required = true)
    protected boolean reported;
    @XmlAttribute(name = "content")
    protected ContentEnumeration content;

    /**
     * Gets the value of the reported property.
     * 
     */
    public boolean isReported() {
        return reported;
    }

    /**
     * Sets the value of the reported property.
     * 
     */
    public void setReported(boolean value) {
        this.reported = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link ContentEnumeration }
     *     
     */
    public ContentEnumeration getContent() {
        if (content == null) {
            return ContentEnumeration.FULL;
        } else {
            return content;
        }
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentEnumeration }
     *     
     */
    public void setContent(ContentEnumeration value) {
        this.content = value;
    }

}
