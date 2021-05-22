


package org.mitre.oval.xmlschema.oval_definitions_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The substring function takes a single string component and produces a single value that contains a portion of the original string. The substring_start attribute defines the starting position in the original string. To include the first character of the string, the start position would be 1. A value less than 1 also means that the start position would be 1. If the substring_start attribute has value greater than the length of the original string an error should be reported. The substring_length attribute defines how many characters after, and including, the starting character to include. A substring_length value greater than the actual length of the string, or a negative value, means to include all of the characters after the starting character. For example, assume a basic component element that returns the value "abcdefg" with a substring_start value of 3 and a substring_length value of 2. The local_variable element would evaluate to have a single value
 *                 of "cd". If the string component used by the substring function returns a collection of values, then the substring operation is performed multiple times and results in a collection of values for the component.
 * 
 * <p>Java class for SubstringFunctionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubstringFunctionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://oval.mitre.org/XMLSchema/oval-definitions-5}ComponentGroup"/>
 *       &lt;/sequence>
 *       &lt;attribute name="substring_start" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="substring_length" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubstringFunctionType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", propOrder = {
    "objectComponent",
    "variableComponent",
    "literalComponent",
    "arithmetic",
    "begin",
    "concat",
    "end",
    "escapeRegex",
    "split",
    "substring",
    "timeDifference",
    "regexCapture",
    "unique",
    "count",
    "globToRegex"
})
public class SubstringFunctionType {

    @XmlElement(name = "object_component", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    protected ObjectComponentType objectComponent;
    @XmlElement(name = "variable_component", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    protected VariableComponentType variableComponent;
    @XmlElement(name = "literal_component", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    protected LiteralComponentType literalComponent;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    protected ArithmeticFunctionType arithmetic;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    protected BeginFunctionType begin;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    protected ConcatFunctionType concat;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    protected EndFunctionType end;
    @XmlElement(name = "escape_regex", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    protected EscapeRegexFunctionType escapeRegex;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    protected SplitFunctionType split;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    protected SubstringFunctionType substring;
    @XmlElement(name = "time_difference", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    protected TimeDifferenceFunctionType timeDifference;
    @XmlElement(name = "regex_capture", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    protected RegexCaptureFunctionType regexCapture;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    protected UniqueFunctionType unique;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    protected CountFunctionType count;
    @XmlElement(name = "glob_to_regex", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    protected GlobToRegexFunctionType globToRegex;
    @XmlAttribute(name = "substring_start", required = true)
    protected int substringStart;
    @XmlAttribute(name = "substring_length", required = true)
    protected int substringLength;

    /**
     * Gets the value of the objectComponent property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectComponentType }
     *     
     */
    public ObjectComponentType getObjectComponent() {
        return objectComponent;
    }

    /**
     * Sets the value of the objectComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectComponentType }
     *     
     */
    public void setObjectComponent(ObjectComponentType value) {
        this.objectComponent = value;
    }

    /**
     * Gets the value of the variableComponent property.
     * 
     * @return
     *     possible object is
     *     {@link VariableComponentType }
     *     
     */
    public VariableComponentType getVariableComponent() {
        return variableComponent;
    }

    /**
     * Sets the value of the variableComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariableComponentType }
     *     
     */
    public void setVariableComponent(VariableComponentType value) {
        this.variableComponent = value;
    }

    /**
     * Gets the value of the literalComponent property.
     * 
     * @return
     *     possible object is
     *     {@link LiteralComponentType }
     *     
     */
    public LiteralComponentType getLiteralComponent() {
        return literalComponent;
    }

    /**
     * Sets the value of the literalComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiteralComponentType }
     *     
     */
    public void setLiteralComponent(LiteralComponentType value) {
        this.literalComponent = value;
    }

    /**
     * Gets the value of the arithmetic property.
     * 
     * @return
     *     possible object is
     *     {@link ArithmeticFunctionType }
     *     
     */
    public ArithmeticFunctionType getArithmetic() {
        return arithmetic;
    }

    /**
     * Sets the value of the arithmetic property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArithmeticFunctionType }
     *     
     */
    public void setArithmetic(ArithmeticFunctionType value) {
        this.arithmetic = value;
    }

    /**
     * Gets the value of the begin property.
     * 
     * @return
     *     possible object is
     *     {@link BeginFunctionType }
     *     
     */
    public BeginFunctionType getBegin() {
        return begin;
    }

    /**
     * Sets the value of the begin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeginFunctionType }
     *     
     */
    public void setBegin(BeginFunctionType value) {
        this.begin = value;
    }

    /**
     * Gets the value of the concat property.
     * 
     * @return
     *     possible object is
     *     {@link ConcatFunctionType }
     *     
     */
    public ConcatFunctionType getConcat() {
        return concat;
    }

    /**
     * Sets the value of the concat property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConcatFunctionType }
     *     
     */
    public void setConcat(ConcatFunctionType value) {
        this.concat = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link EndFunctionType }
     *     
     */
    public EndFunctionType getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndFunctionType }
     *     
     */
    public void setEnd(EndFunctionType value) {
        this.end = value;
    }

    /**
     * Gets the value of the escapeRegex property.
     * 
     * @return
     *     possible object is
     *     {@link EscapeRegexFunctionType }
     *     
     */
    public EscapeRegexFunctionType getEscapeRegex() {
        return escapeRegex;
    }

    /**
     * Sets the value of the escapeRegex property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscapeRegexFunctionType }
     *     
     */
    public void setEscapeRegex(EscapeRegexFunctionType value) {
        this.escapeRegex = value;
    }

    /**
     * Gets the value of the split property.
     * 
     * @return
     *     possible object is
     *     {@link SplitFunctionType }
     *     
     */
    public SplitFunctionType getSplit() {
        return split;
    }

    /**
     * Sets the value of the split property.
     * 
     * @param value
     *     allowed object is
     *     {@link SplitFunctionType }
     *     
     */
    public void setSplit(SplitFunctionType value) {
        this.split = value;
    }

    /**
     * Gets the value of the substring property.
     * 
     * @return
     *     possible object is
     *     {@link SubstringFunctionType }
     *     
     */
    public SubstringFunctionType getSubstring() {
        return substring;
    }

    /**
     * Sets the value of the substring property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstringFunctionType }
     *     
     */
    public void setSubstring(SubstringFunctionType value) {
        this.substring = value;
    }

    /**
     * Gets the value of the timeDifference property.
     * 
     * @return
     *     possible object is
     *     {@link TimeDifferenceFunctionType }
     *     
     */
    public TimeDifferenceFunctionType getTimeDifference() {
        return timeDifference;
    }

    /**
     * Sets the value of the timeDifference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeDifferenceFunctionType }
     *     
     */
    public void setTimeDifference(TimeDifferenceFunctionType value) {
        this.timeDifference = value;
    }

    /**
     * Gets the value of the regexCapture property.
     * 
     * @return
     *     possible object is
     *     {@link RegexCaptureFunctionType }
     *     
     */
    public RegexCaptureFunctionType getRegexCapture() {
        return regexCapture;
    }

    /**
     * Sets the value of the regexCapture property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegexCaptureFunctionType }
     *     
     */
    public void setRegexCapture(RegexCaptureFunctionType value) {
        this.regexCapture = value;
    }

    /**
     * Gets the value of the unique property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueFunctionType }
     *     
     */
    public UniqueFunctionType getUnique() {
        return unique;
    }

    /**
     * Sets the value of the unique property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueFunctionType }
     *     
     */
    public void setUnique(UniqueFunctionType value) {
        this.unique = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link CountFunctionType }
     *     
     */
    public CountFunctionType getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountFunctionType }
     *     
     */
    public void setCount(CountFunctionType value) {
        this.count = value;
    }

    /**
     * Gets the value of the globToRegex property.
     * 
     * @return
     *     possible object is
     *     {@link GlobToRegexFunctionType }
     *     
     */
    public GlobToRegexFunctionType getGlobToRegex() {
        return globToRegex;
    }

    /**
     * Sets the value of the globToRegex property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobToRegexFunctionType }
     *     
     */
    public void setGlobToRegex(GlobToRegexFunctionType value) {
        this.globToRegex = value;
    }

    /**
     * Gets the value of the substringStart property.
     * 
     */
    public int getSubstringStart() {
        return substringStart;
    }

    /**
     * Sets the value of the substringStart property.
     * 
     */
    public void setSubstringStart(int value) {
        this.substringStart = value;
    }

    /**
     * Gets the value of the substringLength property.
     * 
     */
    public int getSubstringLength() {
        return substringLength;
    }

    /**
     * Sets the value of the substringLength property.
     * 
     */
    public void setSubstringLength(int value) {
        this.substringLength = value;
    }

}
