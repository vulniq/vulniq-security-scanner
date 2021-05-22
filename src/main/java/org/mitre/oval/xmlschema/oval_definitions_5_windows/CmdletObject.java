


package org.mitre.oval.xmlschema.oval_definitions_5_windows;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectRecordType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectStringType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectVersionType;
import org.mitre.oval.xmlschema.oval_definitions_5.Filter;
import org.mitre.oval.xmlschema.oval_definitions_5.ObjectType;
import org.mitre.oval.xmlschema.oval_definitions_5.Set;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.mitre.org/XMLSchema/oval-definitions-5}ObjectType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://oval.mitre.org/XMLSchema/oval-definitions-5}set"/>
 *           &lt;sequence>
 *             &lt;element name="module_name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityObjectStringType"/>
 *             &lt;element name="module_id" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityObjectGUIDType"/>
 *             &lt;element name="module_version" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityObjectVersionType"/>
 *             &lt;element name="verb" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityObjectCmdletVerbType"/>
 *             &lt;element name="noun" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityObjectStringType"/>
 *             &lt;element name="parameters" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityObjectRecordType"/>
 *             &lt;element name="select" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityObjectRecordType"/>
 *             &lt;element ref="{http://oval.mitre.org/XMLSchema/oval-definitions-5}filter" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
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
    "set",
    "moduleName",
    "moduleId",
    "moduleVersion",
    "verb",
    "noun",
    "parameters",
    "select",
    "filter"
})
public class CmdletObject
    extends ObjectType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    protected Set set;
    @XmlElementRef(name = "module_name", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityObjectStringType> moduleName;
    @XmlElementRef(name = "module_id", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityObjectGUIDType> moduleId;
    @XmlElementRef(name = "module_version", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityObjectVersionType> moduleVersion;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityObjectCmdletVerbType verb;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityObjectStringType noun;
    @XmlElementRef(name = "parameters", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityObjectRecordType> parameters;
    @XmlElementRef(name = "select", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows", type = JAXBElement.class, required = false)
    protected JAXBElement<EntityObjectRecordType> select;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    protected List<Filter> filter;

    /**
     * Gets the value of the set property.
     * 
     * @return
     *     possible object is
     *     {@link Set }
     *     
     */
    public Set getSet() {
        return set;
    }

    /**
     * Sets the value of the set property.
     * 
     * @param value
     *     allowed object is
     *     {@link Set }
     *     
     */
    public void setSet(Set value) {
        this.set = value;
    }

    /**
     * Gets the value of the moduleName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityObjectStringType }{@code >}
     *     
     */
    public JAXBElement<EntityObjectStringType> getModuleName() {
        return moduleName;
    }

    /**
     * Sets the value of the moduleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityObjectStringType }{@code >}
     *     
     */
    public void setModuleName(JAXBElement<EntityObjectStringType> value) {
        this.moduleName = value;
    }

    /**
     * Gets the value of the moduleId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityObjectGUIDType }{@code >}
     *     
     */
    public JAXBElement<EntityObjectGUIDType> getModuleId() {
        return moduleId;
    }

    /**
     * Sets the value of the moduleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityObjectGUIDType }{@code >}
     *     
     */
    public void setModuleId(JAXBElement<EntityObjectGUIDType> value) {
        this.moduleId = value;
    }

    /**
     * Gets the value of the moduleVersion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityObjectVersionType }{@code >}
     *     
     */
    public JAXBElement<EntityObjectVersionType> getModuleVersion() {
        return moduleVersion;
    }

    /**
     * Sets the value of the moduleVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityObjectVersionType }{@code >}
     *     
     */
    public void setModuleVersion(JAXBElement<EntityObjectVersionType> value) {
        this.moduleVersion = value;
    }

    /**
     * Gets the value of the verb property.
     * 
     * @return
     *     possible object is
     *     {@link EntityObjectCmdletVerbType }
     *     
     */
    public EntityObjectCmdletVerbType getVerb() {
        return verb;
    }

    /**
     * Sets the value of the verb property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityObjectCmdletVerbType }
     *     
     */
    public void setVerb(EntityObjectCmdletVerbType value) {
        this.verb = value;
    }

    /**
     * Gets the value of the noun property.
     * 
     * @return
     *     possible object is
     *     {@link EntityObjectStringType }
     *     
     */
    public EntityObjectStringType getNoun() {
        return noun;
    }

    /**
     * Sets the value of the noun property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityObjectStringType }
     *     
     */
    public void setNoun(EntityObjectStringType value) {
        this.noun = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityObjectRecordType }{@code >}
     *     
     */
    public JAXBElement<EntityObjectRecordType> getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityObjectRecordType }{@code >}
     *     
     */
    public void setParameters(JAXBElement<EntityObjectRecordType> value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the select property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EntityObjectRecordType }{@code >}
     *     
     */
    public JAXBElement<EntityObjectRecordType> getSelect() {
        return select;
    }

    /**
     * Sets the value of the select property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EntityObjectRecordType }{@code >}
     *     
     */
    public void setSelect(JAXBElement<EntityObjectRecordType> value) {
        this.select = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Filter }
     * 
     * 
     */
    public List<Filter> getFilter() {
        if (filter == null) {
            filter = new ArrayList<Filter>();
        }
        return this.filter;
    }

}
