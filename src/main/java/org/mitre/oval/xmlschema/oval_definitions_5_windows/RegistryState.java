


package org.mitre.oval.xmlschema.oval_definitions_5_windows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateAnySimpleType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateIntType;
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
 *         &lt;element name="hive" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateRegistryHiveType" minOccurs="0"/>
 *         &lt;element name="key" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="last_write_time" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="type" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateRegistryTypeType" minOccurs="0"/>
 *         &lt;element name="value" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateAnySimpleType" minOccurs="0"/>
 *         &lt;element name="expanded_value" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateAnySimpleType" minOccurs="0"/>
 *         &lt;element name="windows_view" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateWindowsViewType" minOccurs="0"/>
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
    "hive",
    "key",
    "name",
    "lastWriteTime",
    "type",
    "value",
    "expandedValue",
    "windowsView"
})
public class RegistryState
    extends StateType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateRegistryHiveType hive;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateStringType key;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateStringType name;
    @XmlElement(name = "last_write_time", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateIntType lastWriteTime;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateRegistryTypeType type;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAnySimpleType value;
    @XmlElement(name = "expanded_value", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateAnySimpleType expandedValue;
    @XmlElement(name = "windows_view", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateWindowsViewType windowsView;

    /**
     * Gets the value of the hive property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateRegistryHiveType }
     *     
     */
    public EntityStateRegistryHiveType getHive() {
        return hive;
    }

    /**
     * Sets the value of the hive property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateRegistryHiveType }
     *     
     */
    public void setHive(EntityStateRegistryHiveType value) {
        this.hive = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setKey(EntityStateStringType value) {
        this.key = value;
    }

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
     * Gets the value of the lastWriteTime property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getLastWriteTime() {
        return lastWriteTime;
    }

    /**
     * Sets the value of the lastWriteTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setLastWriteTime(EntityStateIntType value) {
        this.lastWriteTime = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateRegistryTypeType }
     *     
     */
    public EntityStateRegistryTypeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateRegistryTypeType }
     *     
     */
    public void setType(EntityStateRegistryTypeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAnySimpleType }
     *     
     */
    public EntityStateAnySimpleType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAnySimpleType }
     *     
     */
    public void setValue(EntityStateAnySimpleType value) {
        this.value = value;
    }

    /**
     * Gets the value of the expandedValue property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAnySimpleType }
     *     
     */
    public EntityStateAnySimpleType getExpandedValue() {
        return expandedValue;
    }

    /**
     * Sets the value of the expandedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAnySimpleType }
     *     
     */
    public void setExpandedValue(EntityStateAnySimpleType value) {
        this.expandedValue = value;
    }

    /**
     * Gets the value of the windowsView property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateWindowsViewType }
     *     
     */
    public EntityStateWindowsViewType getWindowsView() {
        return windowsView;
    }

    /**
     * Sets the value of the windowsView property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateWindowsViewType }
     *     
     */
    public void setWindowsView(EntityStateWindowsViewType value) {
        this.windowsView = value;
    }

}
