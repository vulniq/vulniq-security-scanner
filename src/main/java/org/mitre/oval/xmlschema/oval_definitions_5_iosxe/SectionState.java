


package org.mitre.oval.xmlschema.oval_definitions_5_iosxe;

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
 *         &lt;element name="section_command" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="section_config_lines" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
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
    "sectionCommand",
    "sectionConfigLines",
    "configLine"
})
public class SectionState
    extends StateType
{

    @XmlElement(name = "section_command", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe")
    protected EntityStateStringType sectionCommand;
    @XmlElement(name = "section_config_lines", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe")
    protected EntityStateStringType sectionConfigLines;
    @XmlElement(name = "config_line", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#iosxe")
    protected EntityStateStringType configLine;

    /**
     * Gets the value of the sectionCommand property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getSectionCommand() {
        return sectionCommand;
    }

    /**
     * Sets the value of the sectionCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setSectionCommand(EntityStateStringType value) {
        this.sectionCommand = value;
    }

    /**
     * Gets the value of the sectionConfigLines property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getSectionConfigLines() {
        return sectionConfigLines;
    }

    /**
     * Sets the value of the sectionConfigLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setSectionConfigLines(EntityStateStringType value) {
        this.sectionConfigLines = value;
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
