


package org.mitre.oval.xmlschema.oval_system_characteristics_5_unix;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemAnySimpleType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemBoolType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemIntType;
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
 *         &lt;element name="key" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="source" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="type" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix}EntityItemGconfTypeType" minOccurs="0"/>
 *         &lt;element name="is_writable" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="mod_user" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="mod_time" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="is_default" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="value" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemAnySimpleType" maxOccurs="unbounded" minOccurs="0"/>
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
    "key",
    "source",
    "type",
    "isWritable",
    "modUser",
    "modTime",
    "isDefault",
    "value"
})
public class GconfItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix")
    protected EntityItemStringType key;
    @XmlElementRef(name = "source", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityItemStringType> source;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix")
    protected EntityItemGconfTypeType type;
    @XmlElement(name = "is_writable", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix")
    protected EntityItemBoolType isWritable;
    @XmlElement(name = "mod_user", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix")
    protected EntityItemStringType modUser;
    @XmlElement(name = "mod_time", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix")
    protected EntityItemIntType modTime;
    @XmlElement(name = "is_default", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix")
    protected EntityItemBoolType isDefault;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix")
    protected List<EntityItemAnySimpleType> value;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setKey(EntityItemStringType value) {
        this.key = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}
     *     
     */
    public JAXBElement<EntityItemStringType> getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}
     *     
     */
    public void setSource(JAXBElement<EntityItemStringType> value) {
        this.source = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemGconfTypeType }
     *     
     */
    public EntityItemGconfTypeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemGconfTypeType }
     *     
     */
    public void setType(EntityItemGconfTypeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the isWritable property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getIsWritable() {
        return isWritable;
    }

    /**
     * Sets the value of the isWritable property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setIsWritable(EntityItemBoolType value) {
        this.isWritable = value;
    }

    /**
     * Gets the value of the modUser property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getModUser() {
        return modUser;
    }

    /**
     * Sets the value of the modUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setModUser(EntityItemStringType value) {
        this.modUser = value;
    }

    /**
     * Gets the value of the modTime property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getModTime() {
        return modTime;
    }

    /**
     * Sets the value of the modTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setModTime(EntityItemIntType value) {
        this.modTime = value;
    }

    /**
     * Gets the value of the isDefault property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getIsDefault() {
        return isDefault;
    }

    /**
     * Sets the value of the isDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setIsDefault(EntityItemBoolType value) {
        this.isDefault = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemAnySimpleType }
     * 
     * 
     */
    public List<EntityItemAnySimpleType> getValue() {
        if (value == null) {
            value = new ArrayList<EntityItemAnySimpleType>();
        }
        return this.value;
    }

}
