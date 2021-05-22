


package org.mitre.oval.xmlschema.oval_results_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The optional include_source_definitions attribute indicates whether or not the source OVAL Definitions document has been included in the results document.  A value of false indicates that the source OVAL Definitions has not been included. By default the source document is included.
 * 
 * <p>Java class for DefaultDirectivesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DefaultDirectivesType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.mitre.org/XMLSchema/oval-results-5}DirectivesType">
 *       &lt;attribute name="include_source_definitions" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefaultDirectivesType", namespace = "http://oval.mitre.org/XMLSchema/oval-results-5")
public class DefaultDirectivesType
    extends DirectivesType
{

    @XmlAttribute(name = "include_source_definitions")
    protected Boolean includeSourceDefinitions;

    /**
     * Gets the value of the includeSourceDefinitions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIncludeSourceDefinitions() {
        if (includeSourceDefinitions == null) {
            return true;
        } else {
            return includeSourceDefinitions;
        }
    }

    /**
     * Sets the value of the includeSourceDefinitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeSourceDefinitions(Boolean value) {
        this.includeSourceDefinitions = value;
    }

}
