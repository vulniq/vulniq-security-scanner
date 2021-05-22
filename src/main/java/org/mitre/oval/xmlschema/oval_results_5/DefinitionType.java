
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
import org.mitre.oval.xmlschema.oval_common_5.ClassEnumeration;
import org.mitre.oval.xmlschema.oval_common_5.MessageType;


/**
 * The required result attribute holds the result of the evaluation. Please refer to the description of the ResultEnumeration for details about the different result values.
 * 
 * <p>Java class for DefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DefinitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="message" type="{http://oval.mitre.org/XMLSchema/oval-common-5}MessageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="criteria" type="{http://oval.mitre.org/XMLSchema/oval-results-5}CriteriaType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="definition_id" use="required" type="{http://oval.mitre.org/XMLSchema/oval-common-5}DefinitionIDPattern" />
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="variable_instance" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" default="1" />
 *       &lt;attribute name="class" type="{http://oval.mitre.org/XMLSchema/oval-common-5}ClassEnumeration" />
 *       &lt;attribute name="result" use="required" type="{http://oval.mitre.org/XMLSchema/oval-results-5}ResultEnumeration" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefinitionType", namespace = "http://oval.mitre.org/XMLSchema/oval-results-5", propOrder = {
    "message",
    "criteria"
})
public class DefinitionType {

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-results-5")
    protected List<MessageType> message;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-results-5")
    protected CriteriaType criteria;
    @XmlAttribute(name = "definition_id", required = true)
    protected String definitionId;
    @XmlAttribute(name = "version", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger version;
    @XmlAttribute(name = "variable_instance")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger variableInstance;
    @XmlAttribute(name = "class")
    protected ClassEnumeration clazz;
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
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link CriteriaType }
     *     
     */
    public CriteriaType getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriteriaType }
     *     
     */
    public void setCriteria(CriteriaType value) {
        this.criteria = value;
    }

    /**
     * Gets the value of the definitionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefinitionId() {
        return definitionId;
    }

    /**
     * Sets the value of the definitionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefinitionId(String value) {
        this.definitionId = value;
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
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link ClassEnumeration }
     *     
     */
    public ClassEnumeration getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassEnumeration }
     *     
     */
    public void setClazz(ClassEnumeration value) {
        this.clazz = value;
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
