


package org.mitre.oval.xmlschema.oval_definitions_5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_common_5.OperatorEnumeration;


/**
 * The optional applicability_check attribute provides a Boolean flag that when true indicates that the criteria is being used to determine whether the OVAL Definition applies to a given system.
 * 
 * <p>Java class for CriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="criteria" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}CriteriaType"/>
 *         &lt;element name="criterion" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}CriterionType"/>
 *         &lt;element name="extend_definition" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}ExtendDefinitionType"/>
 *       &lt;/choice>
 *       &lt;attribute name="applicability_check" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="operator" type="{http://oval.mitre.org/XMLSchema/oval-common-5}OperatorEnumeration" default="AND" />
 *       &lt;attribute name="negate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="comment" type="{http://oval.mitre.org/XMLSchema/oval-common-5}NonEmptyStringType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CriteriaType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", propOrder = {
    "criteriaOrCriterionOrExtendDefinition"
})
public class CriteriaType {

    @XmlElements({
        @XmlElement(name = "criteria", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", type = CriteriaType.class),
        @XmlElement(name = "criterion", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", type = CriterionType.class),
        @XmlElement(name = "extend_definition", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", type = ExtendDefinitionType.class)
    })
    protected List<Object> criteriaOrCriterionOrExtendDefinition;
    @XmlAttribute(name = "applicability_check")
    protected Boolean applicabilityCheck;
    @XmlAttribute(name = "operator")
    protected OperatorEnumeration operator;
    @XmlAttribute(name = "negate")
    protected Boolean negate;
    @XmlAttribute(name = "comment")
    protected String comment;

    /**
     * Gets the value of the criteriaOrCriterionOrExtendDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criteriaOrCriterionOrExtendDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriteriaOrCriterionOrExtendDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CriteriaType }
     * {@link CriterionType }
     * {@link ExtendDefinitionType }
     * 
     * 
     */
    public List<Object> getCriteriaOrCriterionOrExtendDefinition() {
        if (criteriaOrCriterionOrExtendDefinition == null) {
            criteriaOrCriterionOrExtendDefinition = new ArrayList<Object>();
        }
        return this.criteriaOrCriterionOrExtendDefinition;
    }

    /**
     * Gets the value of the applicabilityCheck property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplicabilityCheck() {
        return applicabilityCheck;
    }

    /**
     * Sets the value of the applicabilityCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplicabilityCheck(Boolean value) {
        this.applicabilityCheck = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorEnumeration }
     *     
     */
    public OperatorEnumeration getOperator() {
        if (operator == null) {
            return OperatorEnumeration.AND;
        } else {
            return operator;
        }
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorEnumeration }
     *     
     */
    public void setOperator(OperatorEnumeration value) {
        this.operator = value;
    }

    /**
     * Gets the value of the negate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNegate() {
        if (negate == null) {
            return false;
        } else {
            return negate;
        }
    }

    /**
     * Sets the value of the negate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNegate(Boolean value) {
        this.negate = value;
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
