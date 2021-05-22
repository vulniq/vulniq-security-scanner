


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
 *         &lt;element name="type_inspect" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa}EntityItemInspectionType" minOccurs="0"/>
 *         &lt;element name="parameters" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="match_action" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="used_in" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
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
public class PolicyMapItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
    protected EntityItemStringType name;
    @XmlElement(name = "type_inspect", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
    protected EntityItemInspectionType typeInspect;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
    protected List<EntityItemStringType> parameters;
    @XmlElement(name = "match_action", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
    protected List<EntityItemStringType> matchAction;
    @XmlElement(name = "used_in", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#asa")
    protected EntityItemStringType usedIn;

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
     * Gets the value of the parameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemStringType }
     * 
     * 
     */
    public List<EntityItemStringType> getParameters() {
        if (parameters == null) {
            parameters = new ArrayList<EntityItemStringType>();
        }
        return this.parameters;
    }

    /**
     * Gets the value of the matchAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matchAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatchAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemStringType }
     * 
     * 
     */
    public List<EntityItemStringType> getMatchAction() {
        if (matchAction == null) {
            matchAction = new ArrayList<EntityItemStringType>();
        }
        return this.matchAction;
    }

    /**
     * Gets the value of the usedIn property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getUsedIn() {
        return usedIn;
    }

    /**
     * Sets the value of the usedIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setUsedIn(EntityItemStringType value) {
        this.usedIn = value;
    }

}
