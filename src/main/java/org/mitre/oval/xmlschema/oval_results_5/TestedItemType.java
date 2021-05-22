


package org.mitre.oval.xmlschema.oval_results_5;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_common_5.MessageType;


/**
 * The TestedItemType complex type holds a reference to a system characteristic item that matched the object specified in a test. Details of the item can be found in the oval_system_characteristics section of the OVAL Results document by using the required item_id. The optional message element holds an error message or some other message that the analysis engine wishes to pass along. The required result attribute holds the result of the evaluation of the individual item as it relates to the state specified by the test. If the test did not include a state reference then the result attribute will be set to 'not evaluated'. Please refer to the description of the ResultEnumeration for details about the different result values.
 * 
 * <p>Java class for TestedItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestedItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="message" type="{http://oval.mitre.org/XMLSchema/oval-common-5}MessageType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="item_id" use="required" type="{http://oval.mitre.org/XMLSchema/oval-common-5}ItemIDPattern" />
 *       &lt;attribute name="result" use="required" type="{http://oval.mitre.org/XMLSchema/oval-results-5}ResultEnumeration" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestedItemType", namespace = "http://oval.mitre.org/XMLSchema/oval-results-5", propOrder = {
    "message"
})
public class TestedItemType {

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-results-5")
    protected List<MessageType> message;
    @XmlAttribute(name = "item_id", required = true)
    protected BigInteger itemId;
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
     * Gets the value of the itemId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setItemId(BigInteger value) {
        this.itemId = value;
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
