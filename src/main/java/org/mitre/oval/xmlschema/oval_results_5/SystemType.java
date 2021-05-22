


package org.mitre.oval.xmlschema.oval_results_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.OvalSystemCharacteristics;


/**
 * The SystemType complex type holds the evaluation results of the definitions and tests, as well as a copy of the OVAL System Characteristics used to perform the evaluation. The definitions section holds the results of the definitions and the tests section holds the results of the tests. The oval_system_characteristics section is a copy of the System Characteristics document used to perform the evaluation of the OVAL Definitions.
 * 
 * <p>Java class for SystemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="definitions" type="{http://oval.mitre.org/XMLSchema/oval-results-5}DefinitionsType" minOccurs="0"/>
 *         &lt;element name="tests" type="{http://oval.mitre.org/XMLSchema/oval-results-5}TestsType" minOccurs="0"/>
 *         &lt;element ref="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}oval_system_characteristics"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemType", namespace = "http://oval.mitre.org/XMLSchema/oval-results-5", propOrder = {
    "definitions",
    "tests",
    "ovalSystemCharacteristics"
})
public class SystemType {

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-results-5")
    protected DefinitionsType definitions;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-results-5")
    protected TestsType tests;
    @XmlElement(name = "oval_system_characteristics", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", required = true)
    protected OvalSystemCharacteristics ovalSystemCharacteristics;

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
     * Gets the value of the ovalSystemCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link OvalSystemCharacteristics }
     *     
     */
    public OvalSystemCharacteristics getOvalSystemCharacteristics() {
        return ovalSystemCharacteristics;
    }

    /**
     * Sets the value of the ovalSystemCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link OvalSystemCharacteristics }
     *     
     */
    public void setOvalSystemCharacteristics(OvalSystemCharacteristics value) {
        this.ovalSystemCharacteristics = value;
    }

}
