
package org.mitre.oval.xmlschema.oval_definitions_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The optional applicability_check attribute provides a Boolean flag that when true indicates that the criterion is being used to determine whether the OVAL Definition applies to a given system.
 * 
 * <p>Java class for CriterionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CriterionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="applicability_check" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="test_ref" use="required" type="{http://oval.mitre.org/XMLSchema/oval-common-5}TestIDPattern" />
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
@XmlType(name = "CriterionType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
public class CriterionType {

    @XmlAttribute(name = "applicability_check")
    protected Boolean applicabilityCheck;
    @XmlAttribute(name = "test_ref", required = true)
    protected String testRef;
    @XmlAttribute(name = "negate")
    protected Boolean negate;
    @XmlAttribute(name = "comment")
    protected String comment;

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
     * Gets the value of the testRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestRef() {
        return testRef;
    }

    /**
     * Sets the value of the testRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestRef(String value) {
        this.testRef = value;
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
