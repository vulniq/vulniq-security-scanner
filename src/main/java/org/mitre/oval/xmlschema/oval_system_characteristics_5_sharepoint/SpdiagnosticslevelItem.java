


package org.mitre.oval.xmlschema.oval_system_characteristics_5_sharepoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemBoolType;
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
 *         &lt;element name="farmname" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="eventseverity" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint}EntityItemEventSeverityType" minOccurs="0"/>
 *         &lt;element name="hidden" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="levelid" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="levelname" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="traceseverity" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint}EntityItemTraceSeverityType" minOccurs="0"/>
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
    "farmname",
    "eventseverity",
    "hidden",
    "levelid",
    "levelname",
    "traceseverity"
})
public class SpdiagnosticslevelItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemStringType farmname;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemEventSeverityType eventseverity;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType hidden;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemStringType levelid;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemStringType levelname;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemTraceSeverityType traceseverity;

    /**
     * Gets the value of the farmname property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getFarmname() {
        return farmname;
    }

    /**
     * Sets the value of the farmname property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setFarmname(EntityItemStringType value) {
        this.farmname = value;
    }

    /**
     * Gets the value of the eventseverity property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemEventSeverityType }
     *     
     */
    public EntityItemEventSeverityType getEventseverity() {
        return eventseverity;
    }

    /**
     * Sets the value of the eventseverity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemEventSeverityType }
     *     
     */
    public void setEventseverity(EntityItemEventSeverityType value) {
        this.eventseverity = value;
    }

    /**
     * Gets the value of the hidden property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getHidden() {
        return hidden;
    }

    /**
     * Sets the value of the hidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setHidden(EntityItemBoolType value) {
        this.hidden = value;
    }

    /**
     * Gets the value of the levelid property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getLevelid() {
        return levelid;
    }

    /**
     * Sets the value of the levelid property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setLevelid(EntityItemStringType value) {
        this.levelid = value;
    }

    /**
     * Gets the value of the levelname property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getLevelname() {
        return levelname;
    }

    /**
     * Sets the value of the levelname property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setLevelname(EntityItemStringType value) {
        this.levelname = value;
    }

    /**
     * Gets the value of the traceseverity property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemTraceSeverityType }
     *     
     */
    public EntityItemTraceSeverityType getTraceseverity() {
        return traceseverity;
    }

    /**
     * Sets the value of the traceseverity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemTraceSeverityType }
     *     
     */
    public void setTraceseverity(EntityItemTraceSeverityType value) {
        this.traceseverity = value;
    }

}
