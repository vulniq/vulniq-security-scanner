


package org.mitre.oval.xmlschema.oval_system_characteristics_5_iosxe;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="ip_version" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe}EntityItemAccessListIPVersionType" minOccurs="0"/>
 *         &lt;element name="use" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe}EntityItemAccessListUseType" minOccurs="0"/>
 *         &lt;element name="used_in" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="interface_direction" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe}EntityItemAccessListInterfaceDirectionType" minOccurs="0"/>
 *         &lt;element name="acl_config_lines" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="config_line" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" maxOccurs="unbounded" minOccurs="0"/>
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
public class AclItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe")
    protected EntityItemStringType name;
    @XmlElement(name = "ip_version", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe")
    protected EntityItemAccessListIPVersionType ipVersion;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe")
    protected EntityItemAccessListUseType use;
    @XmlElement(name = "used_in", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe")
    protected EntityItemStringType usedIn;
    @XmlElement(name = "interface_direction", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe")
    protected EntityItemAccessListInterfaceDirectionType interfaceDirection;
    @XmlElement(name = "acl_config_lines", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe")
    protected EntityItemStringType aclConfigLines;
    @XmlElement(name = "config_line", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#iosxe")
    protected List<EntityItemStringType> configLine;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setName(EntityItemStringType value) {
        this.name = value;
    }

    /**
     * Gets the value of the ipVersion property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAccessListIPVersionType }
     *     
     */
    public EntityItemAccessListIPVersionType getIpVersion() {
        return ipVersion;
    }

    /**
     * Sets the value of the ipVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAccessListIPVersionType }
     *     
     */
    public void setIpVersion(EntityItemAccessListIPVersionType value) {
        this.ipVersion = value;
    }

    /**
     * Gets the value of the use property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAccessListUseType }
     *     
     */
    public EntityItemAccessListUseType getUse() {
        return use;
    }

    /**
     * Sets the value of the use property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAccessListUseType }
     *     
     */
    public void setUse(EntityItemAccessListUseType value) {
        this.use = value;
    }

    /**
     * Gets the value of the usedIn property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getUsedIn() {
        return usedIn;
    }

    /**
     * Sets the value of the usedIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setUsedIn(EntityItemStringType value) {
        this.usedIn = value;
    }

    /**
     * Gets the value of the interfaceDirection property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemAccessListInterfaceDirectionType }
     *     
     */
    public EntityItemAccessListInterfaceDirectionType getInterfaceDirection() {
        return interfaceDirection;
    }

    /**
     * Sets the value of the interfaceDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemAccessListInterfaceDirectionType }
     *     
     */
    public void setInterfaceDirection(EntityItemAccessListInterfaceDirectionType value) {
        this.interfaceDirection = value;
    }

    /**
     * Gets the value of the aclConfigLines property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getAclConfigLines() {
        return aclConfigLines;
    }

    /**
     * Sets the value of the aclConfigLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setAclConfigLines(EntityItemStringType value) {
        this.aclConfigLines = value;
    }

    /**
     * Gets the value of the configLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfigLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemStringType }
     * 
     * 
     */
    public List<EntityItemStringType> getConfigLine() {
        if (configLine == null) {
            configLine = new ArrayList<EntityItemStringType>();
        }
        return this.configLine;
    }

}
