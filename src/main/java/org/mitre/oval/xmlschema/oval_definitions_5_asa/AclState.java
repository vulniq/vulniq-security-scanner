


package org.mitre.oval.xmlschema.oval_definitions_5_asa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="ip_version" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#asa}EntityStateAccessListIPVersionType" minOccurs="0"/>
 *         &lt;element name="use" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#asa}EntityStateAccessListUseType" minOccurs="0"/>
 *         &lt;element name="used_in" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="interface_direction" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#asa}EntityStateAccessListInterfaceDirectionType" minOccurs="0"/>
 *         &lt;element name="acl_config_lines" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="config_line" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
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
    "name",
    "ipVersion",
    "use",
    "usedIn",
    "interfaceDirection",
    "aclConfigLines",
    "configLine"
})
public class AclState
    extends StateType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa")
    protected EntityStateStringType name;
    @XmlElement(name = "ip_version", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa")
    protected EntityStateAccessListIPVersionType ipVersion;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa")
    protected EntityStateAccessListUseType use;
    @XmlElement(name = "used_in", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa")
    protected EntityStateStringType usedIn;
    @XmlElement(name = "interface_direction", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa")
    protected EntityStateAccessListInterfaceDirectionType interfaceDirection;
    @XmlElement(name = "acl_config_lines", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa")
    protected EntityStateStringType aclConfigLines;
    @XmlElement(name = "config_line", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#asa")
    protected EntityStateStringType configLine;

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
     * Gets the value of the ipVersion property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAccessListIPVersionType }
     *     
     */
    public EntityStateAccessListIPVersionType getIpVersion() {
        return ipVersion;
    }

    /**
     * Sets the value of the ipVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAccessListIPVersionType }
     *     
     */
    public void setIpVersion(EntityStateAccessListIPVersionType value) {
        this.ipVersion = value;
    }

    /**
     * Gets the value of the use property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAccessListUseType }
     *     
     */
    public EntityStateAccessListUseType getUse() {
        return use;
    }

    /**
     * Sets the value of the use property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAccessListUseType }
     *     
     */
    public void setUse(EntityStateAccessListUseType value) {
        this.use = value;
    }

    /**
     * Gets the value of the usedIn property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getUsedIn() {
        return usedIn;
    }

    /**
     * Sets the value of the usedIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setUsedIn(EntityStateStringType value) {
        this.usedIn = value;
    }

    /**
     * Gets the value of the interfaceDirection property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateAccessListInterfaceDirectionType }
     *     
     */
    public EntityStateAccessListInterfaceDirectionType getInterfaceDirection() {
        return interfaceDirection;
    }

    /**
     * Sets the value of the interfaceDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateAccessListInterfaceDirectionType }
     *     
     */
    public void setInterfaceDirection(EntityStateAccessListInterfaceDirectionType value) {
        this.interfaceDirection = value;
    }

    /**
     * Gets the value of the aclConfigLines property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getAclConfigLines() {
        return aclConfigLines;
    }

    /**
     * Sets the value of the aclConfigLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setAclConfigLines(EntityStateStringType value) {
        this.aclConfigLines = value;
    }

    /**
     * Gets the value of the configLine property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getConfigLine() {
        return configLine;
    }

    /**
     * Sets the value of the configLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setConfigLine(EntityStateStringType value) {
        this.configLine = value;
    }

}
