


package org.mitre.oval.xmlschema.oval_system_characteristics_5_windows;

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
 *         &lt;element name="group_sid" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="user_sid" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subgroup_sid" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" maxOccurs="unbounded" minOccurs="0"/>
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
    "groupSid",
    "userSid",
    "subgroupSid"
})
public class GroupSidItem
    extends ItemType
{

    @XmlElement(name = "group_sid", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemStringType groupSid;
    @XmlElement(name = "user_sid", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected List<EntityItemStringType> userSid;
    @XmlElement(name = "subgroup_sid", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected List<EntityItemStringType> subgroupSid;

    /**
     * Gets the value of the groupSid property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getGroupSid() {
        return groupSid;
    }

    /**
     * Sets the value of the groupSid property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setGroupSid(EntityItemStringType value) {
        this.groupSid = value;
    }

    /**
     * Gets the value of the userSid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userSid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserSid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemStringType }
     * 
     * 
     */
    public List<EntityItemStringType> getUserSid() {
        if (userSid == null) {
            userSid = new ArrayList<EntityItemStringType>();
        }
        return this.userSid;
    }

    /**
     * Gets the value of the subgroupSid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subgroupSid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubgroupSid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemStringType }
     * 
     * 
     */
    public List<EntityItemStringType> getSubgroupSid() {
        if (subgroupSid == null) {
            subgroupSid = new ArrayList<EntityItemStringType>();
        }
        return this.subgroupSid;
    }

}
