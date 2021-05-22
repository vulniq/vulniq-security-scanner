


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
 *         &lt;element name="type" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#asa}EntityStateClassMapType" minOccurs="0"/>
 *         &lt;element name="type_inspect" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#asa}EntityStateInspectionType" minOccurs="0"/>
 *         &lt;element name="match_all_any" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#asa}EntityStateMatchType" minOccurs="0"/>
 *         &lt;element name="match" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="used_in_class_map" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="used_in_policy_map" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="policy_map_action" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
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
    "type",
    "typeInspect",
    "matchAllAny",
    "match",
    "usedInClassMap",
    "usedInPolicyMap",
    "policyMapAction"
})
public class ClassMapState
    extends StateType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa")
    protected EntityStateStringType name;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa")
    protected EntityStateClassMapType type;
    @XmlElement(name = "type_inspect", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa")
    protected EntityStateInspectionType typeInspect;
    @XmlElement(name = "match_all_any", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa")
    protected EntityStateMatchType matchAllAny;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa")
    protected EntityStateStringType match;
    @XmlElement(name = "used_in_class_map", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa")
    protected EntityStateStringType usedInClassMap;
    @XmlElement(name = "used_in_policy_map", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa")
    protected EntityStateStringType usedInPolicyMap;
    @XmlElement(name = "policy_map_action", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa")
    protected EntityStateStringType policyMapAction;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateClassMapType }
     *     
     */
    public EntityStateClassMapType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateClassMapType }
     *     
     */
    public void setType(EntityStateClassMapType value) {
        this.type = value;
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
     * Gets the value of the matchAllAny property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateMatchType }
     *     
     */
    public EntityStateMatchType getMatchAllAny() {
        return matchAllAny;
    }

    /**
     * Sets the value of the matchAllAny property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateMatchType }
     *     
     */
    public void setMatchAllAny(EntityStateMatchType value) {
        this.matchAllAny = value;
    }

    /**
     * Gets the value of the match property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getMatch() {
        return match;
    }

    /**
     * Sets the value of the match property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setMatch(EntityStateStringType value) {
        this.match = value;
    }

    /**
     * Gets the value of the usedInClassMap property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getUsedInClassMap() {
        return usedInClassMap;
    }

    /**
     * Sets the value of the usedInClassMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setUsedInClassMap(EntityStateStringType value) {
        this.usedInClassMap = value;
    }

    /**
     * Gets the value of the usedInPolicyMap property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getUsedInPolicyMap() {
        return usedInPolicyMap;
    }

    /**
     * Sets the value of the usedInPolicyMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setUsedInPolicyMap(EntityStateStringType value) {
        this.usedInPolicyMap = value;
    }

    /**
     * Gets the value of the policyMapAction property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getPolicyMapAction() {
        return policyMapAction;
    }

    /**
     * Sets the value of the policyMapAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setPolicyMapAction(EntityStateStringType value) {
        this.policyMapAction = value;
    }

}
