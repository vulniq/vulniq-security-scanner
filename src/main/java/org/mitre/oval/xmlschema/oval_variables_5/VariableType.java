


package org.mitre.oval.xmlschema.oval_variables_5;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_common_5.NotesType;
import org.mitre.oval.xmlschema.oval_common_5.SimpleDatatypeEnumeration;


/**
 * The notes section of a variable should be used to hold information that might be helpful to someone examining the technical aspects of the variable. Please refer to the description of the NotesType complex type for more information about the notes element.
 * 
 * <p>Java class for VariableType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VariableType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" maxOccurs="unbounded"/>
 *         &lt;element name="notes" type="{http://oval.mitre.org/XMLSchema/oval-common-5}NotesType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://oval.mitre.org/XMLSchema/oval-common-5}VariableIDPattern" />
 *       &lt;attribute name="datatype" use="required" type="{http://oval.mitre.org/XMLSchema/oval-common-5}SimpleDatatypeEnumeration" />
 *       &lt;attribute name="instance" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" default="1" />
 *       &lt;attribute name="comment" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariableType", namespace = "http://oval.mitre.org/XMLSchema/oval-variables-5", propOrder = {
    "value",
    "notes"
})
public class VariableType {

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-variables-5", required = true)
    protected List<Object> value;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-variables-5")
    protected NotesType notes;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "datatype", required = true)
    protected SimpleDatatypeEnumeration datatype;
    @XmlAttribute(name = "instance")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger instance;
    @XmlAttribute(name = "comment", required = true)
    protected String comment;

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getValue() {
        if (value == null) {
            value = new ArrayList<Object>();
        }
        return this.value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link NotesType }
     *     
     */
    public NotesType getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotesType }
     *     
     */
    public void setNotes(NotesType value) {
        this.notes = value;
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
     * Gets the value of the datatype property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleDatatypeEnumeration }
     *     
     */
    public SimpleDatatypeEnumeration getDatatype() {
        return datatype;
    }

    /**
     * Sets the value of the datatype property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleDatatypeEnumeration }
     *     
     */
    public void setDatatype(SimpleDatatypeEnumeration value) {
        this.datatype = value;
    }

    /**
     * Gets the value of the instance property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInstance() {
        if (instance == null) {
            return new BigInteger("1");
        } else {
            return instance;
        }
    }

    /**
     * Sets the value of the instance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInstance(BigInteger value) {
        this.instance = value;
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
