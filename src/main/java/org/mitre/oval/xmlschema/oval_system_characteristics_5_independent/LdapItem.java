


package org.mitre.oval.xmlschema.oval_system_characteristics_5_independent;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemAnySimpleType;
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
 *         &lt;element name="suffix" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="relative_dn" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="attribute" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="object_class" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="ldaptype" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#independent}EntityItemLdaptypeType" minOccurs="0"/>
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
    "suffix",
    "relativeDn",
    "attribute",
    "objectClass",
    "ldaptype",
    "value"
})
public class LdapItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#independent")
    protected EntityItemStringType suffix;
    @XmlElementRef(name = "relative_dn", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#independent", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityItemStringType> relativeDn;
    @XmlElementRef(name = "attribute", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#independent", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityItemStringType> attribute;
    @XmlElement(name = "object_class", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#independent")
    protected EntityItemStringType objectClass;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#independent")
    protected EntityItemLdaptypeType ldaptype;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#independent")
    protected List<EntityItemAnySimpleType> value;

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setSuffix(EntityItemStringType value) {
        this.suffix = value;
    }

    /**
     * Gets the value of the relativeDn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}
     *     
     */
    public JAXBElement<EntityItemStringType> getRelativeDn() {
        return relativeDn;
    }

    /**
     * Sets the value of the relativeDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}
     *     
     */
    public void setRelativeDn(JAXBElement<EntityItemStringType> value) {
        this.relativeDn = value;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}
     *     
     */
    public JAXBElement<EntityItemStringType> getAttribute() {
        return attribute;
    }

    /**
     * Sets the value of the attribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}
     *     
     */
    public void setAttribute(JAXBElement<EntityItemStringType> value) {
        this.attribute = value;
    }

    /**
     * Gets the value of the objectClass property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getObjectClass() {
        return objectClass;
    }

    /**
     * Sets the value of the objectClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setObjectClass(EntityItemStringType value) {
        this.objectClass = value;
    }

    /**
     * Gets the value of the ldaptype property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemLdaptypeType }
     *     
     */
    public EntityItemLdaptypeType getLdaptype() {
        return ldaptype;
    }

    /**
     * Sets the value of the ldaptype property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemLdaptypeType }
     *     
     */
    public void setLdaptype(EntityItemLdaptypeType value) {
        this.ldaptype = value;
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
