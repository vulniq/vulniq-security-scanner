


package org.mitre.oval.xmlschema.oval_definitions_5_sharepoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateBoolType;
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
 *         &lt;element name="farmname" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="eventseverity" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint}EntityStateEventSeverityType" minOccurs="0"/>
 *         &lt;element name="hidden" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="levelid" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="levelname" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="traceseverity" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint}EntityStateTraceSeverityType" minOccurs="0"/>
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
public class SpdiagnosticslevelState
    extends StateType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateStringType farmname;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateEventSeverityType eventseverity;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType hidden;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateStringType levelid;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateStringType levelname;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateTraceSeverityType traceseverity;

    /**
     * Gets the value of the farmname property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getFarmname() {
        return farmname;
    }

    /**
     * Sets the value of the farmname property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setFarmname(EntityStateStringType value) {
        this.farmname = value;
    }

    /**
     * Gets the value of the eventseverity property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateEventSeverityType }
     *     
     */
    public EntityStateEventSeverityType getEventseverity() {
        return eventseverity;
    }

    /**
     * Sets the value of the eventseverity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateEventSeverityType }
     *     
     */
    public void setEventseverity(EntityStateEventSeverityType value) {
        this.eventseverity = value;
    }

    /**
     * Gets the value of the hidden property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getHidden() {
        return hidden;
    }

    /**
     * Sets the value of the hidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setHidden(EntityStateBoolType value) {
        this.hidden = value;
    }

    /**
     * Gets the value of the levelid property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getLevelid() {
        return levelid;
    }

    /**
     * Sets the value of the levelid property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setLevelid(EntityStateStringType value) {
        this.levelid = value;
    }

    /**
     * Gets the value of the levelname property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getLevelname() {
        return levelname;
    }

    /**
     * Sets the value of the levelname property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setLevelname(EntityStateStringType value) {
        this.levelname = value;
    }

    /**
     * Gets the value of the traceseverity property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateTraceSeverityType }
     *     
     */
    public EntityStateTraceSeverityType getTraceseverity() {
        return traceseverity;
    }

    /**
     * Sets the value of the traceseverity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateTraceSeverityType }
     *     
     */
    public void setTraceseverity(EntityStateTraceSeverityType value) {
        this.traceseverity = value;
    }

}
