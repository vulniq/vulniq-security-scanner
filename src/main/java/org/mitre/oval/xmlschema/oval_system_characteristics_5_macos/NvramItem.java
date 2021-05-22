


package org.mitre.oval.xmlschema.oval_system_characteristics_5_macos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="nvram_var" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="nvram_value" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
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
    "nvramVar",
    "nvramValue"
})
public class NvramItem
    extends ItemType
{

    @XmlElement(name = "nvram_var", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemStringType nvramVar;
    @XmlElement(name = "nvram_value", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos")
    protected EntityItemStringType nvramValue;

    /**
     * Gets the value of the nvramVar property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getNvramVar() {
        return nvramVar;
    }

    /**
     * Sets the value of the nvramVar property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setNvramVar(EntityItemStringType value) {
        this.nvramVar = value;
    }

    /**
     * Gets the value of the nvramValue property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getNvramValue() {
        return nvramValue;
    }

    /**
     * Sets the value of the nvramValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setNvramValue(EntityItemStringType value) {
        this.nvramValue = value;
    }

}
