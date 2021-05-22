


package org.mitre.oval.xmlschema.oval_definitions_5_independent;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateAnySimpleType;
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
 *         &lt;element name="var_ref" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#independent}EntityStateVariableRefType" minOccurs="0"/>
 *         &lt;element name="value" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateAnySimpleType" minOccurs="0"/>
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
    "varRef",
    "value"
})
public class VariableState
    extends StateType
{

    @XmlElement(name = "var_ref", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent")
    protected EntityStateVariableRefType varRef;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#independent")
    protected EntityStateAnySimpleType value;

    /**
     * Gets the value of the varRef property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateVariableRefType }
     *     
     */
    public EntityStateVariableRefType getVarRef() {
        return varRef;
    }

    /**
     * Sets the value of the varRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateVariableRefType }
     *     
     */
    public void setVarRef(EntityStateVariableRefType value) {
        this.varRef = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAnySimpleType }
     *     
     */
    public EntityStateAnySimpleType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAnySimpleType }
     *     
     */
    public void setValue(EntityStateAnySimpleType value) {
        this.value = value;
    }

}
