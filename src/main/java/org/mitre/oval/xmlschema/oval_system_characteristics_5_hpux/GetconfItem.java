


package org.mitre.oval.xmlschema.oval_system_characteristics_5_hpux;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemAnySimpleType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}ItemType">
 *       &lt;sequence>
 *         &lt;element name="parameter_name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="pathname" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="output" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemAnySimpleType" minOccurs="0"/>
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
public class GetconfItem
    extends ItemType
{

    @XmlElement(name = "parameter_name", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemStringType parameterName;
    @XmlElementRef(name = "pathname", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityItemStringType> pathname;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#hpux")
    protected EntityItemAnySimpleType output;

    /**
     * Gets the value of the parameterName property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getParameterName() {
        return parameterName;
    }

    /**
     * Sets the value of the parameterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setParameterName(EntityItemStringType value) {
        this.parameterName = value;
    }

    /**
     * Gets the value of the pathname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}
     *     
     */
    public JAXBElement<EntityItemStringType> getPathname() {
        return pathname;
    }

    /**
     * Sets the value of the pathname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}
     *     
     */
    public void setPathname(JAXBElement<EntityItemStringType> value) {
        this.pathname = value;
    }

    /**
     * Gets the value of the output property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAnySimpleType }
     *     
     */
    public EntityItemAnySimpleType getOutput() {
        return output;
    }

    /**
     * Sets the value of the output property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAnySimpleType }
     *     
     */
    public void setOutput(EntityItemAnySimpleType value) {
        this.output = value;
    }

}
