


package org.mitre.oval.xmlschema.oval_definitions_5_macos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectIPAddressStringType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectIntType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectStringType;
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
 *             &lt;element name="protocol" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityObjectStringType"/>
 *             &lt;element name="local_address" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityObjectIPAddressStringType"/>
 *             &lt;element name="local_port" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityObjectIntType"/>
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
    "protocol",
    "localAddress",
    "localPort",
    "filter"
})
public class Inetlisteningserver510Object
    extends ObjectType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    protected Set set;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityObjectStringType protocol;
    @XmlElement(name = "local_address", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityObjectIPAddressStringType localAddress;
    @XmlElement(name = "local_port", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityObjectIntType localPort;
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
     * Gets the value of the protocol property.
     * 
     * @return
     *     possible object is
     *     {@link EntityObjectStringType }
     *     
     */
    public EntityObjectStringType getProtocol() {
        return protocol;
    }

    /**
     * Sets the value of the protocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityObjectStringType }
     *     
     */
    public void setProtocol(EntityObjectStringType value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the localAddress property.
     * 
     * @return
     *     possible object is
     *     {@link EntityObjectIPAddressStringType }
     *     
     */
    public EntityObjectIPAddressStringType getLocalAddress() {
        return localAddress;
    }

    /**
     * Sets the value of the localAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityObjectIPAddressStringType }
     *     
     */
    public void setLocalAddress(EntityObjectIPAddressStringType value) {
        this.localAddress = value;
    }

    /**
     * Gets the value of the localPort property.
     * 
     * @return
     *     possible object is
     *     {@link EntityObjectIntType }
     *     
     */
    public EntityObjectIntType getLocalPort() {
        return localPort;
    }

    /**
     * Sets the value of the localPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityObjectIntType }
     *     
     */
    public void setLocalPort(EntityObjectIntType value) {
        this.localPort = value;
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
