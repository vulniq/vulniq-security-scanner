


package org.mitre.oval.xmlschema.oval_definitions_5_sharepoint;

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
 *         &lt;element name="sitecollectionurl" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="quotaname" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="url" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
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
    "sitecollectionurl",
    "quotaname",
    "url"
})
public class SpsiteState
    extends StateType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateStringType sitecollectionurl;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateStringType quotaname;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateStringType url;

    /**
     * Gets the value of the sitecollectionurl property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getSitecollectionurl() {
        return sitecollectionurl;
    }

    /**
     * Sets the value of the sitecollectionurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setSitecollectionurl(EntityStateStringType value) {
        this.sitecollectionurl = value;
    }

    /**
     * Gets the value of the quotaname property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getQuotaname() {
        return quotaname;
    }

    /**
     * Sets the value of the quotaname property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setQuotaname(EntityStateStringType value) {
        this.quotaname = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setUrl(EntityStateStringType value) {
        this.url = value;
    }

}
