


package org.mitre.oval.xmlschema.oval_definitions_5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * Note that the datatype associated with the components should be 'string' or 'int' depending on which date time format is specified.  The result of this function though is always an integer.
 * 
 * <p>Java class for TimeDifferenceFunctionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeDifferenceFunctionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="2">
 *         &lt;group ref="{http://oval.mitre.org/XMLSchema/oval-definitions-5}ComponentGroup"/>
 *       &lt;/sequence>
 *       &lt;attribute name="format_1" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}DateTimeFormatEnumeration" default="year_month_day" />
 *       &lt;attribute name="format_2" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}DateTimeFormatEnumeration" default="year_month_day" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeDifferenceFunctionType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", propOrder = {
    "objectComponentOrVariableComponentOrLiteralComponent"
})
public class TimeDifferenceFunctionType {

    @XmlElements({
        @XmlElement(name = "object_component", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", type = ObjectComponentType.class),
        @XmlElement(name = "variable_component", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", type = VariableComponentType.class),
        @XmlElement(name = "literal_component", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", type = LiteralComponentType.class),
        @XmlElement(name = "arithmetic", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", type = ArithmeticFunctionType.class),
        @XmlElement(name = "begin", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", type = BeginFunctionType.class),
        @XmlElement(name = "concat", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", type = ConcatFunctionType.class),
        @XmlElement(name = "end", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", type = EndFunctionType.class),
        @XmlElement(name = "escape_regex", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", type = EscapeRegexFunctionType.class),
        @XmlElement(name = "split", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", type = SplitFunctionType.class),
        @XmlElement(name = "substring", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", type = SubstringFunctionType.class),
        @XmlElement(name = "time_difference", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", type = TimeDifferenceFunctionType.class),
        @XmlElement(name = "regex_capture", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", type = RegexCaptureFunctionType.class),
        @XmlElement(name = "unique", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", type = UniqueFunctionType.class),
        @XmlElement(name = "count", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", type = CountFunctionType.class),
        @XmlElement(name = "glob_to_regex", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", type = GlobToRegexFunctionType.class)
    })
    protected List<Object> objectComponentOrVariableComponentOrLiteralComponent;
    @XmlAttribute(name = "format_1")
    protected DateTimeFormatEnumeration format1;
    @XmlAttribute(name = "format_2")
    protected DateTimeFormatEnumeration format2;

    /**
     * Gets the value of the objectComponentOrVariableComponentOrLiteralComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectComponentOrVariableComponentOrLiteralComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectComponentOrVariableComponentOrLiteralComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectComponentType }
     * {@link VariableComponentType }
     * {@link LiteralComponentType }
     * {@link ArithmeticFunctionType }
     * {@link BeginFunctionType }
     * {@link ConcatFunctionType }
     * {@link EndFunctionType }
     * {@link EscapeRegexFunctionType }
     * {@link SplitFunctionType }
     * {@link SubstringFunctionType }
     * {@link TimeDifferenceFunctionType }
     * {@link RegexCaptureFunctionType }
     * {@link UniqueFunctionType }
     * {@link CountFunctionType }
     * {@link GlobToRegexFunctionType }
     * 
     * 
     */
    public List<Object> getObjectComponentOrVariableComponentOrLiteralComponent() {
        if (objectComponentOrVariableComponentOrLiteralComponent == null) {
            objectComponentOrVariableComponentOrLiteralComponent = new ArrayList<Object>();
        }
        return this.objectComponentOrVariableComponentOrLiteralComponent;
    }

    /**
     * Gets the value of the format1 property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeFormatEnumeration }
     *     
     */
    public DateTimeFormatEnumeration getFormat1() {
        if (format1 == null) {
            return DateTimeFormatEnumeration.YEAR_MONTH_DAY;
        } else {
            return format1;
        }
    }

    /**
     * Sets the value of the format1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeFormatEnumeration }
     *     
     */
    public void setFormat1(DateTimeFormatEnumeration value) {
        this.format1 = value;
    }

    /**
     * Gets the value of the format2 property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeFormatEnumeration }
     *     
     */
    public DateTimeFormatEnumeration getFormat2() {
        if (format2 == null) {
            return DateTimeFormatEnumeration.YEAR_MONTH_DAY;
        } else {
            return format2;
        }
    }

    /**
     * Sets the value of the format2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeFormatEnumeration }
     *     
     */
    public void setFormat2(DateTimeFormatEnumeration value) {
        this.format2 = value;
    }

}
