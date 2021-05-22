


package org.mitre.oval.xmlschema.oval_definitions_5_windows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateRecordType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateStringType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateVersionType;
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
 *         &lt;element name="module_name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="module_id" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateGUIDType" minOccurs="0"/>
 *         &lt;element name="module_version" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateVersionType" minOccurs="0"/>
 *         &lt;element name="verb" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityStateCmdletVerbType" minOccurs="0"/>
 *         &lt;element name="noun" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="parameters" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateRecordType" minOccurs="0"/>
 *         &lt;element name="select" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateRecordType" minOccurs="0"/>
 *         &lt;element name="value" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateRecordType" minOccurs="0"/>
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
public class CmdletState
    extends StateType
{

    @XmlElement(name = "module_name", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateStringType moduleName;
    @XmlElement(name = "module_id", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateGUIDType moduleId;
    @XmlElement(name = "module_version", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateVersionType moduleVersion;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateCmdletVerbType verb;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateStringType noun;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateRecordType parameters;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateRecordType select;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateRecordType value;

    /**
     * Gets the value of the moduleName property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getModuleName() {
        return moduleName;
    }

    /**
     * Sets the value of the moduleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setModuleName(EntityStateStringType value) {
        this.moduleName = value;
    }

    /**
     * Gets the value of the moduleId property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateGUIDType }
     *     
     */
    public EntityStateGUIDType getModuleId() {
        return moduleId;
    }

    /**
     * Sets the value of the moduleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateGUIDType }
     *     
     */
    public void setModuleId(EntityStateGUIDType value) {
        this.moduleId = value;
    }

    /**
     * Gets the value of the moduleVersion property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateVersionType }
     *     
     */
    public EntityStateVersionType getModuleVersion() {
        return moduleVersion;
    }

    /**
     * Sets the value of the moduleVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateVersionType }
     *     
     */
    public void setModuleVersion(EntityStateVersionType value) {
        this.moduleVersion = value;
    }

    /**
     * Gets the value of the verb property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateCmdletVerbType }
     *     
     */
    public EntityStateCmdletVerbType getVerb() {
        return verb;
    }

    /**
     * Sets the value of the verb property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateCmdletVerbType }
     *     
     */
    public void setVerb(EntityStateCmdletVerbType value) {
        this.verb = value;
    }

    /**
     * Gets the value of the noun property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getNoun() {
        return noun;
    }

    /**
     * Sets the value of the noun property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setNoun(EntityStateStringType value) {
        this.noun = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateRecordType }
     *     
     */
    public EntityStateRecordType getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateRecordType }
     *     
     */
    public void setParameters(EntityStateRecordType value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the select property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateRecordType }
     *     
     */
    public EntityStateRecordType getSelect() {
        return select;
    }

    /**
     * Sets the value of the select property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateRecordType }
     *     
     */
    public void setSelect(EntityStateRecordType value) {
        this.select = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateRecordType }
     *     
     */
    public EntityStateRecordType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateRecordType }
     *     
     */
    public void setValue(EntityStateRecordType value) {
        this.value = value;
    }

}
