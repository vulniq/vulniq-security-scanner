


package org.mitre.oval.xmlschema.oval_definitions_5_unix;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateIPAddressStringType;
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
 *         &lt;element name="domain_name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="ttl" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="ip_address" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIPAddressStringType" minOccurs="0"/>
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
    "domainName",
    "ttl",
    "ipAddress"
})
public class DnscacheState
    extends StateType
{

    @XmlElement(name = "domain_name", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#unix")
    protected EntityStateStringType domainName;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#unix")
    protected EntityStateIntType ttl;
    @XmlElement(name = "ip_address", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#unix")
    protected EntityStateIPAddressStringType ipAddress;

    /**
     * Gets the value of the domainName property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getDomainName() {
        return domainName;
    }

    /**
     * Sets the value of the domainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setDomainName(EntityStateStringType value) {
        this.domainName = value;
    }

    /**
     * Gets the value of the ttl property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getTtl() {
        return ttl;
    }

    /**
     * Sets the value of the ttl property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setTtl(EntityStateIntType value) {
        this.ttl = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIPAddressStringType }
     *     
     */
    public EntityStateIPAddressStringType getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIPAddressStringType }
     *     
     */
    public void setIpAddress(EntityStateIPAddressStringType value) {
        this.ipAddress = value;
    }

}
