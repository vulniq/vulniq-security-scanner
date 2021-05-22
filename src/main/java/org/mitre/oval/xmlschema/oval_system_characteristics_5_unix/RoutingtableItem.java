


package org.mitre.oval.xmlschema.oval_system_characteristics_5_unix;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemIPAddressType;
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
 *         &lt;element name="destination" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIPAddressType" minOccurs="0"/>
 *         &lt;element name="gateway" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIPAddressType" minOccurs="0"/>
 *         &lt;element name="flags" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix}EntityItemRoutingTableFlagsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="interface_name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
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
    "destination",
    "gateway",
    "flags",
    "interfaceName"
})
public class RoutingtableItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix")
    protected EntityItemIPAddressType destination;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix")
    protected EntityItemIPAddressType gateway;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix")
    protected List<EntityItemRoutingTableFlagsType> flags;
    @XmlElement(name = "interface_name", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#unix")
    protected EntityItemStringType interfaceName;

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIPAddressType }
     *     
     */
    public EntityItemIPAddressType getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIPAddressType }
     *     
     */
    public void setDestination(EntityItemIPAddressType value) {
        this.destination = value;
    }

    /**
     * Gets the value of the gateway property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIPAddressType }
     *     
     */
    public EntityItemIPAddressType getGateway() {
        return gateway;
    }

    /**
     * Sets the value of the gateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIPAddressType }
     *     
     */
    public void setGateway(EntityItemIPAddressType value) {
        this.gateway = value;
    }

    /**
     * Gets the value of the flags property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flags property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlags().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemRoutingTableFlagsType }
     * 
     * 
     */
    public List<EntityItemRoutingTableFlagsType> getFlags() {
        if (flags == null) {
            flags = new ArrayList<EntityItemRoutingTableFlagsType>();
        }
        return this.flags;
    }

    /**
     * Gets the value of the interfaceName property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getInterfaceName() {
        return interfaceName;
    }

    /**
     * Sets the value of the interfaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setInterfaceName(EntityItemStringType value) {
        this.interfaceName = value;
    }

}
