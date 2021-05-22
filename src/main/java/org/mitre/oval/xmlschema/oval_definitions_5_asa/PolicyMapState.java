


package org.mitre.oval.xmlschema.oval_definitions_5_asa;

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
 *         &lt;element name="name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="type_inspect" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#asa}EntityStateInspectionType" minOccurs="0"/>
 *         &lt;element name="parameters" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="match_action" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="used_in" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
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
    "name",
    "typeInspect",
    "parameters",
    "matchAction",
    "usedIn"
})
public class PolicyMapState
    extends StateType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa")
    protected EntityStateStringType name;
    @XmlElement(name = "type_inspect", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa")
    protected EntityStateInspectionType typeInspect;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa")
    protected EntityStateStringType parameters;
    @XmlElement(name = "match_action", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa")
    protected EntityStateStringType matchAction;
    @XmlElement(name = "used_in", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa")
    protected EntityStateStringType usedIn;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setName(EntityStateStringType value) {
        this.name = value;
    }

    /**
     * Gets the value of the typeInspect property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateInspectionType }
     *     
     */
    public EntityStateInspectionType getTypeInspect() {
        return typeInspect;
    }

    /**
     * Sets the value of the typeInspect property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateInspectionType }
     *     
     */
    public void setTypeInspect(EntityStateInspectionType value) {
        this.typeInspect = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setParameters(EntityStateStringType value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the matchAction property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getMatchAction() {
        return matchAction;
    }

    /**
     * Sets the value of the matchAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setMatchAction(EntityStateStringType value) {
        this.matchAction = value;
    }

    /**
     * Gets the value of the usedIn property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getUsedIn() {
        return usedIn;
    }

    /**
     * Sets the value of the usedIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setUsedIn(EntityStateStringType value) {
        this.usedIn = value;
    }

}
