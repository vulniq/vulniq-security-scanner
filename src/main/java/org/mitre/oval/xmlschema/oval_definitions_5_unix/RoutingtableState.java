


package org.mitre.oval.xmlschema.oval_definitions_5_unix;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateIPAddressType;
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
 *         &lt;element name="destination" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIPAddressType" minOccurs="0"/>
 *         &lt;element name="gateway" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIPAddressType" minOccurs="0"/>
 *         &lt;element name="flags" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#unix}EntityStateRoutingTableFlagsType" minOccurs="0"/>
 *         &lt;element name="interface_name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
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
public class RoutingtableState
    extends StateType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#unix")
    protected EntityStateIPAddressType destination;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#unix")
    protected EntityStateIPAddressType gateway;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#unix")
    protected EntityStateRoutingTableFlagsType flags;
    @XmlElement(name = "interface_name", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#unix")
    protected EntityStateStringType interfaceName;

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIPAddressType }
     *     
     */
    public EntityStateIPAddressType getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIPAddressType }
     *     
     */
    public void setDestination(EntityStateIPAddressType value) {
        this.destination = value;
    }

    /**
     * Gets the value of the gateway property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIPAddressType }
     *     
     */
    public EntityStateIPAddressType getGateway() {
        return gateway;
    }

    /**
     * Sets the value of the gateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIPAddressType }
     *     
     */
    public void setGateway(EntityStateIPAddressType value) {
        this.gateway = value;
    }

    /**
     * Gets the value of the flags property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateRoutingTableFlagsType }
     *     
     */
    public EntityStateRoutingTableFlagsType getFlags() {
        return flags;
    }

    /**
     * Sets the value of the flags property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateRoutingTableFlagsType }
     *     
     */
    public void setFlags(EntityStateRoutingTableFlagsType value) {
        this.flags = value;
    }

    /**
     * Gets the value of the interfaceName property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getInterfaceName() {
        return interfaceName;
    }

    /**
     * Sets the value of the interfaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setInterfaceName(EntityStateStringType value) {
        this.interfaceName = value;
    }

}
