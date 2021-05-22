


package org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="section_command" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="section_config_lines" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="config_line" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" maxOccurs="unbounded" minOccurs="0"/>
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
public class SectionItem
    extends ItemType
{

    @XmlElement(name = "section_command", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe")
    protected EntityItemStringType sectionCommand;
    @XmlElement(name = "section_config_lines", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe")
    protected EntityItemStringType sectionConfigLines;
    @XmlElement(name = "config_line", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe")
    protected List<EntityItemStringType> configLine;

    /**
     * Gets the value of the sectionCommand property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getSectionCommand() {
        return sectionCommand;
    }

    /**
     * Sets the value of the sectionCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setSectionCommand(EntityItemStringType value) {
        this.sectionCommand = value;
    }

    /**
     * Gets the value of the sectionConfigLines property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getSectionConfigLines() {
        return sectionConfigLines;
    }

    /**
     * Sets the value of the sectionConfigLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setSectionConfigLines(EntityItemStringType value) {
        this.sectionConfigLines = value;
    }

    /**
     * Gets the value of the configLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfigLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemStringType }
     * 
     * 
     */
    public List<EntityItemStringType> getConfigLine() {
        if (configLine == null) {
            configLine = new ArrayList<EntityItemStringType>();
        }
        return this.configLine;
    }

}
