
package org.mitre.oval.xmlschema.oval_definitions_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_common_5.GeneratorType;
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
 *         &lt;element name="definitions" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}DefinitionsType" minOccurs="0"/>
 *         &lt;element name="tests" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}TestsType" minOccurs="0"/>
 *         &lt;element name="objects" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}ObjectsType" minOccurs="0"/>
 *         &lt;element name="states" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}StatesType" minOccurs="0"/>
 *         &lt;element name="variables" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}VariablesType" minOccurs="0"/>
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
    "definitions",
    "tests",
    "objects",
    "states",
    "variables",
    "signature"
})
@XmlRootElement(name = "oval_definitions", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
public class OvalDefinitions {

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", required = true)
    protected GeneratorType generator;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    protected DefinitionsType definitions;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    protected TestsType tests;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    protected ObjectsType objects;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    protected StatesType states;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    protected VariablesType variables;
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
     * Gets the value of the definitions property.
     * 
     * @return
     *     possible object is
     *     {@link DefinitionsType }
     *     
     */
    public DefinitionsType getDefinitions() {
        return definitions;
    }

    /**
     * Sets the value of the definitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefinitionsType }
     *     
     */
    public void setDefinitions(DefinitionsType value) {
        this.definitions = value;
    }

    /**
     * Gets the value of the tests property.
     * 
     * @return
     *     possible object is
     *     {@link TestsType }
     *     
     */
    public TestsType getTests() {
        return tests;
    }

    /**
     * Sets the value of the tests property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestsType }
     *     
     */
    public void setTests(TestsType value) {
        this.tests = value;
    }

    /**
     * Gets the value of the objects property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectsType }
     *     
     */
    public ObjectsType getObjects() {
        return objects;
    }

    /**
     * Sets the value of the objects property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectsType }
     *     
     */
    public void setObjects(ObjectsType value) {
        this.objects = value;
    }

    /**
     * Gets the value of the states property.
     * 
     * @return
     *     possible object is
     *     {@link StatesType }
     *     
     */
    public StatesType getStates() {
        return states;
    }

    /**
     * Sets the value of the states property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatesType }
     *     
     */
    public void setStates(StatesType value) {
        this.states = value;
    }

    /**
     * Gets the value of the variables property.
     * 
     * @return
     *     possible object is
     *     {@link VariablesType }
     *     
     */
    public VariablesType getVariables() {
        return variables;
    }

    /**
     * Sets the value of the variables property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariablesType }
     *     
     */
    public void setVariables(VariablesType value) {
        this.variables = value;
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
