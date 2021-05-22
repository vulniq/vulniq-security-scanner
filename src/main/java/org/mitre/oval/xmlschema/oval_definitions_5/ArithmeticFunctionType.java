
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
 * Note that if both an integer and float components are used then the result is a float.
 * 
 * <p>Java class for ArithmeticFunctionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArithmeticFunctionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="2">
 *         &lt;group ref="{http://oval.mitre.org/XMLSchema/oval-definitions-5}ComponentGroup"/>
 *       &lt;/sequence>
 *       &lt;attribute name="arithmetic_operation" use="required" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}ArithmeticEnumeration" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArithmeticFunctionType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", propOrder = {
    "objectComponentOrVariableComponentOrLiteralComponent"
})
public class ArithmeticFunctionType {

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
    @XmlAttribute(name = "arithmetic_operation", required = true)
    protected ArithmeticEnumeration arithmeticOperation;

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
     * Gets the value of the arithmeticOperation property.
     * 
     * @return
     *     possible object is
     *     {@link ArithmeticEnumeration }
     *     
     */
    public ArithmeticEnumeration getArithmeticOperation() {
        return arithmeticOperation;
    }

    /**
     * Sets the value of the arithmeticOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArithmeticEnumeration }
     *     
     */
    public void setArithmeticOperation(ArithmeticEnumeration value) {
        this.arithmeticOperation = value;
    }

}
