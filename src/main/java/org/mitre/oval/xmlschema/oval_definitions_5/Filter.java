
package org.mitre.oval.xmlschema.oval_definitions_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://oval.mitre.org/XMLSchema/oval-common-5>StateIDPattern">
 *       &lt;attribute name="action" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}FilterActionEnumeration" default="exclude" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "filter", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
public class Filter {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "action")
    protected FilterActionEnumeration action;

    /**
     * Define the format for acceptable OVAL State ids. An urn format is used with the id starting with the word oval followed by a unique string, followed by the three letter code 'ste', and ending with an integer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link FilterActionEnumeration }
     *     
     */
    public FilterActionEnumeration getAction() {
        if (action == null) {
            return FilterActionEnumeration.EXCLUDE;
        } else {
            return action;
        }
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterActionEnumeration }
     *     
     */
    public void setAction(FilterActionEnumeration value) {
        this.action = value;
    }

}
