
package org.mitre.oval.xmlschema.oval_results_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The DirectivesType complex type presents a set of flags that describe what information has been included in the results document. There are six possible results (true, false, unknown, error, not evaluated, and not applicable) for the evaluation of an OVAL Definition. The directives state which of these results are being reported in the results document.
 * 
 * <p>Java class for DirectivesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectivesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="definition_true" type="{http://oval.mitre.org/XMLSchema/oval-results-5}DirectiveType"/>
 *         &lt;element name="definition_false" type="{http://oval.mitre.org/XMLSchema/oval-results-5}DirectiveType"/>
 *         &lt;element name="definition_unknown" type="{http://oval.mitre.org/XMLSchema/oval-results-5}DirectiveType"/>
 *         &lt;element name="definition_error" type="{http://oval.mitre.org/XMLSchema/oval-results-5}DirectiveType"/>
 *         &lt;element name="definition_not_evaluated" type="{http://oval.mitre.org/XMLSchema/oval-results-5}DirectiveType"/>
 *         &lt;element name="definition_not_applicable" type="{http://oval.mitre.org/XMLSchema/oval-results-5}DirectiveType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectivesType", namespace = "http://oval.mitre.org/XMLSchema/oval-results-5", propOrder = {
    "definitionTrue",
    "definitionFalse",
    "definitionUnknown",
    "definitionError",
    "definitionNotEvaluated",
    "definitionNotApplicable"
})
@XmlSeeAlso({
    DefaultDirectivesType.class,
    ClassDirectivesType.class
})
public class DirectivesType {

    @XmlElement(name = "definition_true", namespace = "http://oval.mitre.org/XMLSchema/oval-results-5", required = true)
    protected DirectiveType definitionTrue;
    @XmlElement(name = "definition_false", namespace = "http://oval.mitre.org/XMLSchema/oval-results-5", required = true)
    protected DirectiveType definitionFalse;
    @XmlElement(name = "definition_unknown", namespace = "http://oval.mitre.org/XMLSchema/oval-results-5", required = true)
    protected DirectiveType definitionUnknown;
    @XmlElement(name = "definition_error", namespace = "http://oval.mitre.org/XMLSchema/oval-results-5", required = true)
    protected DirectiveType definitionError;
    @XmlElement(name = "definition_not_evaluated", namespace = "http://oval.mitre.org/XMLSchema/oval-results-5", required = true)
    protected DirectiveType definitionNotEvaluated;
    @XmlElement(name = "definition_not_applicable", namespace = "http://oval.mitre.org/XMLSchema/oval-results-5", required = true)
    protected DirectiveType definitionNotApplicable;

    /**
     * Gets the value of the definitionTrue property.
     * 
     * @return
     *     possible object is
     *     {@link DirectiveType }
     *     
     */
    public DirectiveType getDefinitionTrue() {
        return definitionTrue;
    }

    /**
     * Sets the value of the definitionTrue property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectiveType }
     *     
     */
    public void setDefinitionTrue(DirectiveType value) {
        this.definitionTrue = value;
    }

    /**
     * Gets the value of the definitionFalse property.
     * 
     * @return
     *     possible object is
     *     {@link DirectiveType }
     *     
     */
    public DirectiveType getDefinitionFalse() {
        return definitionFalse;
    }

    /**
     * Sets the value of the definitionFalse property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectiveType }
     *     
     */
    public void setDefinitionFalse(DirectiveType value) {
        this.definitionFalse = value;
    }

    /**
     * Gets the value of the definitionUnknown property.
     * 
     * @return
     *     possible object is
     *     {@link DirectiveType }
     *     
     */
    public DirectiveType getDefinitionUnknown() {
        return definitionUnknown;
    }

    /**
     * Sets the value of the definitionUnknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectiveType }
     *     
     */
    public void setDefinitionUnknown(DirectiveType value) {
        this.definitionUnknown = value;
    }

    /**
     * Gets the value of the definitionError property.
     * 
     * @return
     *     possible object is
     *     {@link DirectiveType }
     *     
     */
    public DirectiveType getDefinitionError() {
        return definitionError;
    }

    /**
     * Sets the value of the definitionError property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectiveType }
     *     
     */
    public void setDefinitionError(DirectiveType value) {
        this.definitionError = value;
    }

    /**
     * Gets the value of the definitionNotEvaluated property.
     * 
     * @return
     *     possible object is
     *     {@link DirectiveType }
     *     
     */
    public DirectiveType getDefinitionNotEvaluated() {
        return definitionNotEvaluated;
    }

    /**
     * Sets the value of the definitionNotEvaluated property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectiveType }
     *     
     */
    public void setDefinitionNotEvaluated(DirectiveType value) {
        this.definitionNotEvaluated = value;
    }

    /**
     * Gets the value of the definitionNotApplicable property.
     * 
     * @return
     *     possible object is
     *     {@link DirectiveType }
     *     
     */
    public DirectiveType getDefinitionNotApplicable() {
        return definitionNotApplicable;
    }

    /**
     * Sets the value of the definitionNotApplicable property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectiveType }
     *     
     */
    public void setDefinitionNotApplicable(DirectiveType value) {
        this.definitionNotApplicable = value;
    }

}
