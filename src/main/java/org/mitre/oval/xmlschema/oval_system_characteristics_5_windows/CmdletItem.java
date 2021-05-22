


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
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemVersionType;
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
 *         &lt;element name="module_name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="module_id" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemGUIDType" minOccurs="0"/>
 *         &lt;element name="module_version" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemVersionType" minOccurs="0"/>
 *         &lt;element name="verb" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemCmdletVerbType" minOccurs="0"/>
 *         &lt;element name="noun" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="parameters" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemRecordType" minOccurs="0"/>
 *         &lt;element name="select" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemRecordType" minOccurs="0"/>
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
    "moduleName",
    "moduleId",
    "moduleVersion",
    "verb",
    "noun",
    "parameters",
    "select",
    "value"
})
public class CmdletItem
    extends ItemType
{

    @XmlElementRef(name = "module_name", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityItemStringType> moduleName;
    @XmlElementRef(name = "module_id", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityItemGUIDType> moduleId;
    @XmlElementRef(name = "module_version", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityItemVersionType> moduleVersion;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemCmdletVerbType verb;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemStringType noun;
    @XmlElementRef(name = "parameters", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityItemRecordType> parameters;
    @XmlElementRef(name = "select", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityItemRecordType> select;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected List<EntityItemRecordType> value;

    /**
     * Gets the value of the moduleName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}
     *     
     */
    public JAXBElement<EntityItemStringType> getModuleName() {
        return moduleName;
    }

    /**
     * Sets the value of the moduleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityItemStringType }{@code >}
     *     
     */
    public void setModuleName(JAXBElement<EntityItemStringType> value) {
        this.moduleName = value;
    }

    /**
     * Gets the value of the moduleId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityItemGUIDType }{@code >}
     *     
     */
    public JAXBElement<EntityItemGUIDType> getModuleId() {
        return moduleId;
    }

    /**
     * Sets the value of the moduleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityItemGUIDType }{@code >}
     *     
     */
    public void setModuleId(JAXBElement<EntityItemGUIDType> value) {
        this.moduleId = value;
    }

    /**
     * Gets the value of the moduleVersion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityItemVersionType }{@code >}
     *     
     */
    public JAXBElement<EntityItemVersionType> getModuleVersion() {
        return moduleVersion;
    }

    /**
     * Sets the value of the moduleVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityItemVersionType }{@code >}
     *     
     */
    public void setModuleVersion(JAXBElement<EntityItemVersionType> value) {
        this.moduleVersion = value;
    }

    /**
     * Gets the value of the verb property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemCmdletVerbType }
     *     
     */
    public EntityItemCmdletVerbType getVerb() {
        return verb;
    }

    /**
     * Sets the value of the verb property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemCmdletVerbType }
     *     
     */
    public void setVerb(EntityItemCmdletVerbType value) {
        this.verb = value;
    }

    /**
     * Gets the value of the noun property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getNoun() {
        return noun;
    }

    /**
     * Sets the value of the noun property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setNoun(EntityItemStringType value) {
        this.noun = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityItemRecordType }{@code >}
     *     
     */
    public JAXBElement<EntityItemRecordType> getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityItemRecordType }{@code >}
     *     
     */
    public void setParameters(JAXBElement<EntityItemRecordType> value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the select property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityItemRecordType }{@code >}
     *     
     */
    public JAXBElement<EntityItemRecordType> getSelect() {
        return select;
    }

    /**
     * Sets the value of the select property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityItemRecordType }{@code >}
     *     
     */
    public void setSelect(JAXBElement<EntityItemRecordType> value) {
        this.select = value;
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
