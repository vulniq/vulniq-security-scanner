


package org.mitre.oval.xmlschema.oval_results_5;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_common_5.CheckEnumeration;
import org.mitre.oval.xmlschema.oval_common_5.ExistenceEnumeration;
import org.mitre.oval.xmlschema.oval_common_5.MessageType;
import org.mitre.oval.xmlschema.oval_common_5.OperatorEnumeration;


/**
 * The following section provides a more detailed description of  how the result for an OVAL Test is determined when using an OVAL System Characteristics document. An OVAL System Characteristics document can contain an optional collected_objects section. When the collected_objects section is present the following rules specify how the overall result for an OVAL Test is determined: When an oval-sc:collected_objects/oval-sc:object with an id that matches the OVAL Object id that is referenced by the OVAL Test is not found, the result for the OVAL Test must be "unknown". When the flag attribute of the corresponding oval-sc:collected_objects/oval-sc:object is "error", the result of the OVAL Test must be "error". When the flag attribute of the corresponding oval-sc:collected_objects/oval-sc:object is "not collected", the result of the OVAL Test must be "unknown".  When the flag attribute of the corresponding oval-sc:collected_objects/oval-sc:object is "not applicable", the result of the OVAL Test must be "not applicable".  When the flag attribute of the corresponding oval-sc:collected_objects/oval-sc:object is "does not exist", the result of the OVAL Test is determined by examining the check_existence attribute's value and if the check_existence attribute is "none_exist" or "any_exist" the OVAL Test should evaluate to "true", for all other values of the check_existence attribute the OVAL Test should evaluate to "false". The check and state_operator attributes do not need to be considered in this condition. When the flag attribute of the corresponding oval-sc:collected_objects/oval-sc:object is "complete", the result of the OVAL Test is determined by first evaluating the check_existence attribute specified by the OVAL Test and then evaluating the check and state_operator attributes. The check attribute only needs to be considered if the result of evaluating the check_existence attribute is "true". When the flag attribute of the corresponding oval-sc:collected_objects/oval-sc:object is "incomplete", the result of the OVAL Test must be "unknown" with the following exceptions: 1) When the check_existence attribute of the OVAL Test is set to "none_exist" and the collected object has 1 or more item references with a status of "exists", a result of "false" must be reported;  2) When the check_existence attribute of the OVAL Test is set to "only_one_exists", the collected object has more than 1 item reference with a status of "exists", a result of "false" must be reported;  3) If after evaluating the check_existence attribute a non "true" result has not been determined, the check attribute must be considered as follows: 3a) If the check attribute evaluation results in "false", then the OVAL Test result must be "false"; 3b) If the check attribute is set to "at_least_one_satisfies" and its evaluation results in "true", the OVAL Test result must be "true".  When the collected_objects section is not present in the OVAL System Characteristics document, the evaluation engine must search the system characteristics for all Items that match the OVAL Object referenced by the OVAL Test. The set of matching OVAL Items is then evaluated first based on the check_existence attribute, then the check attribute, and finally the state_operator attribute.
 * 
 * <p>Java class for TestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="message" type="{http://oval.mitre.org/XMLSchema/oval-common-5}MessageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tested_item" type="{http://oval.mitre.org/XMLSchema/oval-results-5}TestedItemType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tested_variable" type="{http://oval.mitre.org/XMLSchema/oval-results-5}TestedVariableType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="test_id" use="required" type="{http://oval.mitre.org/XMLSchema/oval-common-5}TestIDPattern" />
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="variable_instance" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" default="1" />
 *       &lt;attribute name="check_existence" type="{http://oval.mitre.org/XMLSchema/oval-common-5}ExistenceEnumeration" default="at_least_one_exists" />
 *       &lt;attribute name="check" use="required" type="{http://oval.mitre.org/XMLSchema/oval-common-5}CheckEnumeration" />
 *       &lt;attribute name="state_operator" type="{http://oval.mitre.org/XMLSchema/oval-common-5}OperatorEnumeration" default="AND" />
 *       &lt;attribute name="result" use="required" type="{http://oval.mitre.org/XMLSchema/oval-results-5}ResultEnumeration" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestType", namespace = "http://oval.mitre.org/XMLSchema/oval-results-5", propOrder = {
    "message",
    "testedItem",
    "testedVariable"
})
public class TestType {

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-results-5")
    protected List<MessageType> message;
    @XmlElement(name = "tested_item", namespace = "http://oval.mitre.org/XMLSchema/oval-results-5")
    protected List<TestedItemType> testedItem;
    @XmlElement(name = "tested_variable", namespace = "http://oval.mitre.org/XMLSchema/oval-results-5")
    protected List<TestedVariableType> testedVariable;
    @XmlAttribute(name = "test_id", required = true)
    protected String testId;
    @XmlAttribute(name = "version", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger version;
    @XmlAttribute(name = "variable_instance")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger variableInstance;
    @XmlAttribute(name = "check_existence")
    protected ExistenceEnumeration checkExistence;
    @XmlAttribute(name = "check", required = true)
    protected CheckEnumeration check;
    @XmlAttribute(name = "state_operator")
    protected OperatorEnumeration stateOperator;
    @XmlAttribute(name = "result", required = true)
    protected ResultEnumeration result;

    /**
     * Gets the value of the message property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the message property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageType }
     * 
     * 
     */
    public List<MessageType> getMessage() {
        if (message == null) {
            message = new ArrayList<MessageType>();
        }
        return this.message;
    }

    /**
     * Gets the value of the testedItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testedItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestedItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestedItemType }
     * 
     * 
     */
    public List<TestedItemType> getTestedItem() {
        if (testedItem == null) {
            testedItem = new ArrayList<TestedItemType>();
        }
        return this.testedItem;
    }

    /**
     * Gets the value of the testedVariable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testedVariable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestedVariable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestedVariableType }
     * 
     * 
     */
    public List<TestedVariableType> getTestedVariable() {
        if (testedVariable == null) {
            testedVariable = new ArrayList<TestedVariableType>();
        }
        return this.testedVariable;
    }

    /**
     * Gets the value of the testId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestId() {
        return testId;
    }

    /**
     * Sets the value of the testId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestId(String value) {
        this.testId = value;
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
     * Gets the value of the checkExistence property.
     * 
     * @return
     *     possible object is
     *     {@link ExistenceEnumeration }
     *     
     */
    public ExistenceEnumeration getCheckExistence() {
        if (checkExistence == null) {
            return ExistenceEnumeration.AT_LEAST_ONE_EXISTS;
        } else {
            return checkExistence;
        }
    }

    /**
     * Sets the value of the checkExistence property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExistenceEnumeration }
     *     
     */
    public void setCheckExistence(ExistenceEnumeration value) {
        this.checkExistence = value;
    }

    /**
     * Gets the value of the check property.
     * 
     * @return
     *     possible object is
     *     {@link CheckEnumeration }
     *     
     */
    public CheckEnumeration getCheck() {
        return check;
    }

    /**
     * Sets the value of the check property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckEnumeration }
     *     
     */
    public void setCheck(CheckEnumeration value) {
        this.check = value;
    }

    /**
     * Gets the value of the stateOperator property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorEnumeration }
     *     
     */
    public OperatorEnumeration getStateOperator() {
        if (stateOperator == null) {
            return OperatorEnumeration.AND;
        } else {
            return stateOperator;
        }
    }

    /**
     * Sets the value of the stateOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorEnumeration }
     *     
     */
    public void setStateOperator(OperatorEnumeration value) {
        this.stateOperator = value;
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
