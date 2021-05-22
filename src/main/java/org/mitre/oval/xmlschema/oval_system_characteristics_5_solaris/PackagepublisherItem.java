


package org.mitre.oval.xmlschema.oval_system_characteristics_5_solaris;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemBoolType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemIntType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemRecordType;
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
 *         &lt;element name="type" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris}EntityItemPublisherTypeType" minOccurs="0"/>
 *         &lt;element name="origin_uri" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="alias" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="ssl_key" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="ssl_cert" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="client_uuid" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris}EntityItemClientUUIDType" minOccurs="0"/>
 *         &lt;element name="catalog_updated" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="enabled" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="order" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="properties" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemRecordType" minOccurs="0"/>
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
    "type",
    "originUri",
    "alias",
    "sslKey",
    "sslCert",
    "clientUuid",
    "catalogUpdated",
    "enabled",
    "order",
    "properties"
})
public class PackagepublisherItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris")
    protected EntityItemStringType name;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris")
    protected EntityItemPublisherTypeType type;
    @XmlElement(name = "origin_uri", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris")
    protected EntityItemStringType originUri;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris")
    protected EntityItemStringType alias;
    @XmlElement(name = "ssl_key", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris")
    protected EntityItemStringType sslKey;
    @XmlElement(name = "ssl_cert", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris")
    protected EntityItemStringType sslCert;
    @XmlElement(name = "client_uuid", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris")
    protected EntityItemClientUUIDType clientUuid;
    @XmlElement(name = "catalog_updated", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris")
    protected EntityItemIntType catalogUpdated;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris")
    protected EntityItemBoolType enabled;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris")
    protected EntityItemIntType order;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#solaris")
    protected EntityItemRecordType properties;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemPublisherTypeType }
     *     
     */
    public EntityItemPublisherTypeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemPublisherTypeType }
     *     
     */
    public void setType(EntityItemPublisherTypeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the originUri property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getOriginUri() {
        return originUri;
    }

    /**
     * Sets the value of the originUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setOriginUri(EntityItemStringType value) {
        this.originUri = value;
    }

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setAlias(EntityItemStringType value) {
        this.alias = value;
    }

    /**
     * Gets the value of the sslKey property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getSslKey() {
        return sslKey;
    }

    /**
     * Sets the value of the sslKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setSslKey(EntityItemStringType value) {
        this.sslKey = value;
    }

    /**
     * Gets the value of the sslCert property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getSslCert() {
        return sslCert;
    }

    /**
     * Sets the value of the sslCert property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setSslCert(EntityItemStringType value) {
        this.sslCert = value;
    }

    /**
     * Gets the value of the clientUuid property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemClientUUIDType }
     *     
     */
    public EntityItemClientUUIDType getClientUuid() {
        return clientUuid;
    }

    /**
     * Sets the value of the clientUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemClientUUIDType }
     *     
     */
    public void setClientUuid(EntityItemClientUUIDType value) {
        this.clientUuid = value;
    }

    /**
     * Gets the value of the catalogUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getCatalogUpdated() {
        return catalogUpdated;
    }

    /**
     * Sets the value of the catalogUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setCatalogUpdated(EntityItemIntType value) {
        this.catalogUpdated = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setEnabled(EntityItemBoolType value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setOrder(EntityItemIntType value) {
        this.order = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemRecordType }
     *     
     */
    public EntityItemRecordType getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemRecordType }
     *     
     */
    public void setProperties(EntityItemRecordType value) {
        this.properties = value;
    }

}
