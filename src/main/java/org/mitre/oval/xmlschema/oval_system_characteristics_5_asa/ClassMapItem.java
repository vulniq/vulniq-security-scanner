


package org.mitre.oval.xmlschema.oval_system_characteristics_5_asa;

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
 *         &lt;element name="name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="type" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa}EntityItemClassMapType" minOccurs="0"/>
 *         &lt;element name="type_inspect" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa}EntityItemInspectionType" minOccurs="0"/>
 *         &lt;element name="match_all_any" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa}EntityItemMatchType" minOccurs="0"/>
 *         &lt;element name="match" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="used_in_class_map" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="used_in_policy_map" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="policy_map_action" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" maxOccurs="unbounded" minOccurs="0"/>
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
public class ClassMapItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
    protected EntityItemStringType name;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
    protected EntityItemClassMapType type;
    @XmlElement(name = "type_inspect", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
    protected EntityItemInspectionType typeInspect;
    @XmlElement(name = "match_all_any", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
    protected EntityItemMatchType matchAllAny;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
    protected List<EntityItemStringType> match;
    @XmlElement(name = "used_in_class_map", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
    protected List<EntityItemStringType> usedInClassMap;
    @XmlElement(name = "used_in_policy_map", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
    protected EntityItemStringType usedInPolicyMap;
    @XmlElement(name = "policy_map_action", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
    protected List<EntityItemStringType> policyMapAction;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setName(EntityItemStringType value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemClassMapType }
     *     
     */
    public EntityItemClassMapType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemClassMapType }
     *     
     */
    public void setType(EntityItemClassMapType value) {
        this.type = value;
    }

    /**
     * Gets the value of the typeInspect property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemInspectionType }
     *     
     */
    public EntityItemInspectionType getTypeInspect() {
        return typeInspect;
    }

    /**
     * Sets the value of the typeInspect property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemInspectionType }
     *     
     */
    public void setTypeInspect(EntityItemInspectionType value) {
        this.typeInspect = value;
    }

    /**
     * Gets the value of the matchAllAny property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemMatchType }
     *     
     */
    public EntityItemMatchType getMatchAllAny() {
        return matchAllAny;
    }

    /**
     * Sets the value of the matchAllAny property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemMatchType }
     *     
     */
    public void setMatchAllAny(EntityItemMatchType value) {
        this.matchAllAny = value;
    }

    /**
     * Gets the value of the match property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the match property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemStringType }
     * 
     * 
     */
    public List<EntityItemStringType> getMatch() {
        if (match == null) {
            match = new ArrayList<EntityItemStringType>();
        }
        return this.match;
    }

    /**
     * Gets the value of the usedInClassMap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usedInClassMap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsedInClassMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemStringType }
     * 
     * 
     */
    public List<EntityItemStringType> getUsedInClassMap() {
        if (usedInClassMap == null) {
            usedInClassMap = new ArrayList<EntityItemStringType>();
        }
        return this.usedInClassMap;
    }

    /**
     * Gets the value of the usedInPolicyMap property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getUsedInPolicyMap() {
        return usedInPolicyMap;
    }

    /**
     * Sets the value of the usedInPolicyMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setUsedInPolicyMap(EntityItemStringType value) {
        this.usedInPolicyMap = value;
    }

    /**
     * Gets the value of the policyMapAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policyMapAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicyMapAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemStringType }
     * 
     * 
     */
    public List<EntityItemStringType> getPolicyMapAction() {
        if (policyMapAction == null) {
            policyMapAction = new ArrayList<EntityItemStringType>();
        }
        return this.policyMapAction;
    }

}
