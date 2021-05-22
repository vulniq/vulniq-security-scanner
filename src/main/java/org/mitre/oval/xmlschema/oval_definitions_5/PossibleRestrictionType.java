


package org.mitre.oval.xmlschema.oval_definitions_5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_common_5.OperatorEnumeration;


/**
 * The PossibleRestrictionType complex type outlines a range of possible expected value of an external variable. Each possible_restriction element contains an unbounded list of child restriction elements that each specify a range that an actual value may fall in. For example, a restriction element may specify that a value must be less than 10. When multiple restriction elements are present, a valid possible value's evaluation is based on the operator attribute. The operator attribute is set to AND by default. Other valid operation values are explained in the description of the OperatorEnumeration simple type. One can think of the possible_value and possible_restriction elements as an OR'd list of possible values, with the restriction elements as using the selected operation to evaluate its own list of value descriptions. Please refer to the description of the RestrictionType complex type for more information. The required hint attribute gives a short description of what the value means or represents.
 * 
 * <p>Java class for PossibleRestrictionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PossibleRestrictionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="restriction" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}RestrictionType" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *       &lt;attribute name="operator" type="{http://oval.mitre.org/XMLSchema/oval-common-5}OperatorEnumeration" default="AND" />
 *       &lt;attribute name="hint" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PossibleRestrictionType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", propOrder = {
    "restriction"
})
public class PossibleRestrictionType {

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    protected List<RestrictionType> restriction;
    @XmlAttribute(name = "operator")
    protected OperatorEnumeration operator;
    @XmlAttribute(name = "hint", required = true)
    protected String hint;

    /**
     * Gets the value of the restriction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restriction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestriction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RestrictionType }
     * 
     * 
     */
    public List<RestrictionType> getRestriction() {
        if (restriction == null) {
            restriction = new ArrayList<RestrictionType>();
        }
        return this.restriction;
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
     * Gets the value of the hint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHint() {
        return hint;
    }

    /**
     * Sets the value of the hint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHint(String value) {
        this.hint = value;
    }

}
