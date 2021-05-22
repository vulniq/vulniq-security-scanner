


package org.mitre.oval.xmlschema.oval_definitions_5_hpux;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateAnySimpleType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateStringType;
import org.mitre.oval.xmlschema.oval_definitions_5.StateType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.mitre.org/XMLSchema/oval-definitions-5}StateType">
 *       &lt;sequence>
 *         &lt;element name="parameter_name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="pathname" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="output" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateAnySimpleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "parameterName",
    "pathname",
    "output"
})
public class GetconfState
    extends StateType
{

    @XmlElement(name = "parameter_name", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux")
    protected EntityStateStringType parameterName;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux")
    protected EntityStateStringType pathname;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux")
    protected EntityStateAnySimpleType output;

    /**
     * Gets the value of the parameterName property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getParameterName() {
        return parameterName;
    }

    /**
     * Sets the value of the parameterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setParameterName(EntityStateStringType value) {
        this.parameterName = value;
    }

    /**
     * Gets the value of the pathname property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getPathname() {
        return pathname;
    }

    /**
     * Sets the value of the pathname property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setPathname(EntityStateStringType value) {
        this.pathname = value;
    }

    /**
     * Gets the value of the output property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAnySimpleType }
     *     
     */
    public EntityStateAnySimpleType getOutput() {
        return output;
    }

    /**
     * Sets the value of the output property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAnySimpleType }
     *     
     */
    public void setOutput(EntityStateAnySimpleType value) {
        this.output = value;
    }

}
