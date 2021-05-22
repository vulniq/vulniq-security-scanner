
package org.mitre.oval.xmlschema.oval_results_5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_common_5.GeneratorType;
import org.mitre.oval.xmlschema.oval_definitions_5.OvalDefinitions;
import org.w3._2000._09.xmldsig_.SignatureType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="generator" type="{http://oval.mitre.org/XMLSchema/oval-common-5}GeneratorType"/>
 *         &lt;element name="directives" type="{http://oval.mitre.org/XMLSchema/oval-results-5}DefaultDirectivesType"/>
 *         &lt;element name="class_directives" type="{http://oval.mitre.org/XMLSchema/oval-results-5}ClassDirectivesType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element ref="{http://oval.mitre.org/XMLSchema/oval-definitions-5}oval_definitions" minOccurs="0"/>
 *         &lt;element name="results" type="{http://oval.mitre.org/XMLSchema/oval-results-5}ResultsType"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "generator",
    "directives",
    "classDirectives",
    "ovalDefinitions",
    "results",
    "signature"
})
@XmlRootElement(name = "oval_results", namespace = "http://oval.mitre.org/XMLSchema/oval-results-5")
public class OvalResults {

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-results-5", required = true)
    protected GeneratorType generator;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-results-5", required = true)
    protected DefaultDirectivesType directives;
    @XmlElement(name = "class_directives", namespace = "http://oval.mitre.org/XMLSchema/oval-results-5")
    protected List<ClassDirectivesType> classDirectives;
    @XmlElement(name = "oval_definitions", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    protected OvalDefinitions ovalDefinitions;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-results-5", required = true)
    protected ResultsType results;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected SignatureType signature;

    /**
     * Gets the value of the generator property.
     * 
     * @return
     *     possible object is
     *     {@link GeneratorType }
     *     
     */
    public GeneratorType getGenerator() {
        return generator;
    }

    /**
     * Sets the value of the generator property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneratorType }
     *     
     */
    public void setGenerator(GeneratorType value) {
        this.generator = value;
    }

    /**
     * Gets the value of the directives property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultDirectivesType }
     *     
     */
    public DefaultDirectivesType getDirectives() {
        return directives;
    }

    /**
     * Sets the value of the directives property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultDirectivesType }
     *     
     */
    public void setDirectives(DefaultDirectivesType value) {
        this.directives = value;
    }

    /**
     * Gets the value of the classDirectives property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classDirectives property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassDirectives().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassDirectivesType }
     * 
     * 
     */
    public List<ClassDirectivesType> getClassDirectives() {
        if (classDirectives == null) {
            classDirectives = new ArrayList<ClassDirectivesType>();
        }
        return this.classDirectives;
    }

    /**
     * The oval_definitions section is optional and dependent on the include_source_definitions attribute of the directives element. Its purpose is to provide an exact copy of the definitions evaluated for the results document.
     * 
     * @return
     *     possible object is
     *     {@link OvalDefinitions }
     *     
     */
    public OvalDefinitions getOvalDefinitions() {
        return ovalDefinitions;
    }

    /**
     * Sets the value of the ovalDefinitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OvalDefinitions }
     *     
     */
    public void setOvalDefinitions(OvalDefinitions value) {
        this.ovalDefinitions = value;
    }

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link ResultsType }
     *     
     */
    public ResultsType getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultsType }
     *     
     */
    public void setResults(ResultsType value) {
        this.results = value;
    }

    /**
     * The optional Signature element allows an XML Signature as defined by the W3C to be attached to the document. This allows authentication and data integrity to be provided to the user. Enveloped signatures are supported. More information about the official W3C Recommendation regarding XML digital signatures can be found at http://www.w3.org/TR/xmldsig-core/.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

}
