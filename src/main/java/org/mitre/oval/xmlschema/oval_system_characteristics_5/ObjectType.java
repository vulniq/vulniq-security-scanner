


package org.mitre.oval.xmlschema.oval_system_characteristics_5;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_common_5.MessageType;


/**
 * The required flag attribute holds information regarding the outcome of the data collection. For example, if there was an error looking for items that match the object specification, then the flag would be 'error'. Please refer to the description of FlagEnumeration for details about the different flag values.
 * 
 * <p>Java class for ObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="message" type="{http://oval.mitre.org/XMLSchema/oval-common-5}MessageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="variable_value" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}VariableValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reference" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://oval.mitre.org/XMLSchema/oval-common-5}ObjectIDPattern" />
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="variable_instance" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" default="1" />
 *       &lt;attribute name="comment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="flag" use="required" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}FlagEnumeration" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectType", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5", propOrder = {
    "message",
    "variableValue",
    "reference"
})
public class ObjectType {

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5")
    protected List<MessageType> message;
    @XmlElement(name = "variable_value", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5")
    protected List<VariableValueType> variableValue;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5")
    protected List<ReferenceType> reference;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "version", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger version;
    @XmlAttribute(name = "variable_instance")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger variableInstance;
    @XmlAttribute(name = "comment")
    protected String comment;
    @XmlAttribute(name = "flag", required = true)
    protected FlagEnumeration flag;

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
     * Gets the value of the variableValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variableValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariableValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VariableValueType }
     * 
     * 
     */
    public List<VariableValueType> getVariableValue() {
        if (variableValue == null) {
            variableValue = new ArrayList<VariableValueType>();
        }
        return this.variableValue;
    }

    /**
     * Gets the value of the reference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getReference() {
        if (reference == null) {
            reference = new ArrayList<ReferenceType>();
        }
        return this.reference;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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

    /**
     * Gets the value of the flag property.
     * 
     * @return
     *     possible object is
     *     {@link FlagEnumeration }
     *     
     */
    public FlagEnumeration getFlag() {
        return flag;
    }

    /**
     * Sets the value of the flag property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlagEnumeration }
     *     
     */
    public void setFlag(FlagEnumeration value) {
        this.flag = value;
    }

}
