


package org.mitre.oval.xmlschema.oval_definitions_5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * The count function takes one or more components and returns the count of all of the values represented by the components. For example, assume that two variables exist, each with a single value. By applying the count function against two variable components that resolve to the two variables, the resulting local_variable would have a value of '2'. Additionally, if any of the components referenced by the count function evaluate to a collection of values, then those values are used in the count calculation. For example, assume that there are two components, one of which resolves to a single value, the other of which resolves to two values. If the count function is used to provide a count of these two components, the function will resolve to a local_variable with the values '3'.
 * 
 * <p>Java class for CountFunctionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountFunctionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;group ref="{http://oval.mitre.org/XMLSchema/oval-definitions-5}ComponentGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountFunctionType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", propOrder = {
    "objectComponentOrVariableComponentOrLiteralComponent"
})
public class CountFunctionType {

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

}
