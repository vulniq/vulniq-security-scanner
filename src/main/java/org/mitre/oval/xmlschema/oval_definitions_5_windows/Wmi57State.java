
package org.mitre.oval.xmlschema.oval_definitions_5_windows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateRecordType;
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
 *         &lt;element name="namespace" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="wql" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="result" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateRecordType" minOccurs="0"/>
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
    "namespace",
    "wql",
    "result"
})
public class Wmi57State
    extends StateType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateStringType namespace;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateStringType wql;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateRecordType result;

    /**
     * Gets the value of the namespace property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getNamespace() {
        return namespace;
    }

    /**
     * Sets the value of the namespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setNamespace(EntityStateStringType value) {
        this.namespace = value;
    }

    /**
     * Gets the value of the wql property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getWql() {
        return wql;
    }

    /**
     * Sets the value of the wql property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setWql(EntityStateStringType value) {
        this.wql = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateRecordType }
     *     
     */
    public EntityStateRecordType getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateRecordType }
     *     
     */
    public void setResult(EntityStateRecordType value) {
        this.result = value;
    }

}
