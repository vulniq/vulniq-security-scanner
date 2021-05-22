


package org.mitre.oval.xmlschema.oval_definitions_5_windows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectStringType;
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
 *             &lt;element name="behaviors" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}RegkeyAuditPermissionsBehaviors" minOccurs="0"/>
 *             &lt;element name="hive" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#windows}EntityObjectRegistryHiveType"/>
 *             &lt;element name="key" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityObjectStringType"/>
 *             &lt;element name="trustee_name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityObjectStringType"/>
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
    "behaviors",
    "hive",
    "key",
    "trusteeName"
})
public class RegkeyauditedpermissionsObject
    extends ObjectType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    protected Set set;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected RegkeyAuditPermissionsBehaviors behaviors;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityObjectRegistryHiveType hive;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityObjectStringType key;
    @XmlElement(name = "trustee_name", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityObjectStringType trusteeName;

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
     * Gets the value of the behaviors property.
     * 
     * @return
     *     possible object is
     *     {@link RegkeyAuditPermissionsBehaviors }
     *     
     */
    public RegkeyAuditPermissionsBehaviors getBehaviors() {
        return behaviors;
    }

    /**
     * Sets the value of the behaviors property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegkeyAuditPermissionsBehaviors }
     *     
     */
    public void setBehaviors(RegkeyAuditPermissionsBehaviors value) {
        this.behaviors = value;
    }

    /**
     * Gets the value of the hive property.
     * 
     * @return
     *     possible object is
     *     {@link EntityObjectRegistryHiveType }
     *     
     */
    public EntityObjectRegistryHiveType getHive() {
        return hive;
    }

    /**
     * Sets the value of the hive property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityObjectRegistryHiveType }
     *     
     */
    public void setHive(EntityObjectRegistryHiveType value) {
        this.hive = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link EntityObjectStringType }
     *     
     */
    public EntityObjectStringType getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityObjectStringType }
     *     
     */
    public void setKey(EntityObjectStringType value) {
        this.key = value;
    }

    /**
     * Gets the value of the trusteeName property.
     * 
     * @return
     *     possible object is
     *     {@link EntityObjectStringType }
     *     
     */
    public EntityObjectStringType getTrusteeName() {
        return trusteeName;
    }

    /**
     * Sets the value of the trusteeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityObjectStringType }
     *     
     */
    public void setTrusteeName(EntityObjectStringType value) {
        this.trusteeName = value;
    }

}
