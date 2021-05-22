
package org.mitre.oval.xmlschema.oval_common_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The ElementMapType is used to document the association between OVAL test, object, state, and item entities.
 * 
 * <p>Java class for ElementMapType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElementMapType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="test" type="{http://oval.mitre.org/XMLSchema/oval-common-5}ElementMapItemType"/>
 *         &lt;element name="object" type="{http://oval.mitre.org/XMLSchema/oval-common-5}ElementMapItemType" minOccurs="0"/>
 *         &lt;element name="state" type="{http://oval.mitre.org/XMLSchema/oval-common-5}ElementMapItemType" minOccurs="0"/>
 *         &lt;element name="item" type="{http://oval.mitre.org/XMLSchema/oval-common-5}ElementMapItemType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementMapType", namespace = "http://oval.mitre.org/XMLSchema/oval-common-5", propOrder = {
    "test",
    "object",
    "state",
    "item"
})
public class ElementMapType {

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-common-5", required = true)
    protected ElementMapItemType test;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-common-5")
    protected ElementMapItemType object;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-common-5")
    protected ElementMapItemType state;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-common-5")
    protected ElementMapItemType item;

    /**
     * Gets the value of the test property.
     * 
     * @return
     *     possible object is
     *     {@link ElementMapItemType }
     *     
     */
    public ElementMapItemType getTest() {
        return test;
    }

    /**
     * Sets the value of the test property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementMapItemType }
     *     
     */
    public void setTest(ElementMapItemType value) {
        this.test = value;
    }

    /**
     * Gets the value of the object property.
     * 
     * @return
     *     possible object is
     *     {@link ElementMapItemType }
     *     
     */
    public ElementMapItemType getObject() {
        return object;
    }

    /**
     * Sets the value of the object property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementMapItemType }
     *     
     */
    public void setObject(ElementMapItemType value) {
        this.object = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link ElementMapItemType }
     *     
     */
    public ElementMapItemType getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementMapItemType }
     *     
     */
    public void setState(ElementMapItemType value) {
        this.state = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link ElementMapItemType }
     *     
     */
    public ElementMapItemType getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementMapItemType }
     *     
     */
    public void setItem(ElementMapItemType value) {
        this.item = value;
    }

}
