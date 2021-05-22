


package org.mitre.oval.xmlschema.oval_system_characteristics_5_solaris;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemRecordType;
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
 *         &lt;element name="current" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="supported" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris}EntityItemV12NEnvType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="parent" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris}EntityItemV12NEnvType" minOccurs="0"/>
 *         &lt;element name="ldom-role" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris}EntityItemLDOMRoleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="properties" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemRecordType" minOccurs="0"/>
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
    "current",
    "supported",
    "parent",
    "ldomRole",
    "properties"
})
public class VirtualizationinfoItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris")
    protected EntityItemStringType current;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris")
    protected List<EntityItemV12NEnvType> supported;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris")
    protected EntityItemV12NEnvType parent;
    @XmlElement(name = "ldom-role", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris")
    protected List<EntityItemLDOMRoleType> ldomRole;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris")
    protected EntityItemRecordType properties;

    /**
     * Gets the value of the current property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getCurrent() {
        return current;
    }

    /**
     * Sets the value of the current property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setCurrent(EntityItemStringType value) {
        this.current = value;
    }

    /**
     * Gets the value of the supported property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supported property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupported().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemV12NEnvType }
     * 
     * 
     */
    public List<EntityItemV12NEnvType> getSupported() {
        if (supported == null) {
            supported = new ArrayList<EntityItemV12NEnvType>();
        }
        return this.supported;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemV12NEnvType }
     *     
     */
    public EntityItemV12NEnvType getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemV12NEnvType }
     *     
     */
    public void setParent(EntityItemV12NEnvType value) {
        this.parent = value;
    }

    /**
     * Gets the value of the ldomRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ldomRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLdomRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemLDOMRoleType }
     * 
     * 
     */
    public List<EntityItemLDOMRoleType> getLdomRole() {
        if (ldomRole == null) {
            ldomRole = new ArrayList<EntityItemLDOMRoleType>();
        }
        return this.ldomRole;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemRecordType }
     *     
     */
    public EntityItemRecordType getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemRecordType }
     *     
     */
    public void setProperties(EntityItemRecordType value) {
        this.properties = value;
    }

}
