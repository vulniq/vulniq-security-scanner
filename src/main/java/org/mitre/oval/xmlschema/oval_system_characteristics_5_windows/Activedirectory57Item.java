


package org.mitre.oval.xmlschema.oval_system_characteristics_5_windows;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="naming_context" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemNamingContextType" minOccurs="0"/>
 *         &lt;element name="relative_dn" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="attribute" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="object_class" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="adstype" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemAdstypeType" minOccurs="0"/>
 *         &lt;element name="value" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemRecordType" maxOccurs="unbounded" minOccurs="0"/>
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
    "namingContext",
    "relativeDn",
    "attribute",
    "objectClass",
    "adstype",
    "value"
})
public class Activedirectory57Item
    extends ItemType
{

    @XmlElement(name = "naming_context", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemNamingContextType namingContext;
    @XmlElementRef(name = "relative_dn", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityItemStringType> relativeDn;
    @XmlElementRef(name = "attribute", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityItemStringType> attribute;
    @XmlElement(name = "object_class", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemStringType objectClass;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemAdstypeType adstype;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected List<EntityItemRecordType> value;

    /**
     * Gets the value of the namingContext property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemNamingContextType }
     *     
     */
    public EntityItemNamingContextType getNamingContext() {
        return namingContext;
    }

    /**
     * Sets the value of the namingContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemNamingContextType }
     *     
     */
    public void setNamingContext(EntityItemNamingContextType value) {
        this.namingContext = value;
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
     * Gets the value of the adstype property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAdstypeType }
     *     
     */
    public EntityItemAdstypeType getAdstype() {
        return adstype;
    }

    /**
     * Sets the value of the adstype property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAdstypeType }
     *     
     */
    public void setAdstype(EntityItemAdstypeType value) {
        this.adstype = value;
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
     * {@link EntityItemRecordType }
     * 
     * 
     */
    public List<EntityItemRecordType> getValue() {
        if (value == null) {
            value = new ArrayList<EntityItemRecordType>();
        }
        return this.value;
    }

}
