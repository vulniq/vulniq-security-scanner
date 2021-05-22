


package org.mitre.oval.xmlschema.oval_results_5;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The required result attribute holds the result of the evaluation. Please refer to the description of the ResultEnumeration for details about the different result values.
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
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="variable_instance" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" default="1" />
 *       &lt;attribute name="negate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="result" use="required" type="{http://oval.mitre.org/XMLSchema/oval-results-5}ResultEnumeration" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CriterionType", namespace = "http://oval.mitre.org/XMLSchema/oval-results-5")
public class CriterionType {

    @XmlAttribute(name = "applicability_check")
    protected Boolean applicabilityCheck;
    @XmlAttribute(name = "test_ref", required = true)
    protected String testRef;
    @XmlAttribute(name = "version", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger version;
    @XmlAttribute(name = "variable_instance")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger variableInstance;
    @XmlAttribute(name = "negate")
    protected Boolean negate;
    @XmlAttribute(name = "result", required = true)
    protected ResultEnumeration result;

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
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVersion(BigInteger value) {
        this.version = value;
    }

    /**
     * Gets the value of the variableInstance property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVariableInstance() {
        if (variableInstance == null) {
            return new BigInteger("1");
        } else {
            return variableInstance;
        }
    }

    /**
     * Sets the value of the variableInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVariableInstance(BigInteger value) {
        this.variableInstance = value;
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
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ResultEnumeration }
     *     
     */
    public ResultEnumeration getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultEnumeration }
     *     
     */
    public void setResult(ResultEnumeration value) {
        this.result = value;
    }

}
