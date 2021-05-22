
package org.mitre.oval.xmlschema.oval_definitions_5_ios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="show_subcommand" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="config_line" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
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
    "showSubcommand",
    "configLine"
})
public class LineState
    extends StateType
{

    @XmlElement(name = "show_subcommand", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios")
    protected EntityStateStringType showSubcommand;
    @XmlElement(name = "config_line", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios")
    protected EntityStateStringType configLine;

    /**
     * Gets the value of the showSubcommand property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getShowSubcommand() {
        return showSubcommand;
    }

    /**
     * Sets the value of the showSubcommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setShowSubcommand(EntityStateStringType value) {
        this.showSubcommand = value;
    }

    /**
     * Gets the value of the configLine property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getConfigLine() {
        return configLine;
    }

    /**
     * Sets the value of the configLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setConfigLine(EntityStateStringType value) {
        this.configLine = value;
    }

}
