


package org.mitre.oval.xmlschema.oval_system_characteristics_5_sharepoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemBoolType;
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
 *         &lt;element name="webcollectionurl" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="sitecollectionurl" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="secondarysitecolladmin" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="secondsitecolladminenabled" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="allowanonymousaccess" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
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
    "webcollectionurl",
    "sitecollectionurl",
    "secondarysitecolladmin",
    "secondsitecolladminenabled",
    "allowanonymousaccess"
})
public class SpwebItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemStringType webcollectionurl;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemStringType sitecollectionurl;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemStringType secondarysitecolladmin;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType secondsitecolladminenabled;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType allowanonymousaccess;

    /**
     * Gets the value of the webcollectionurl property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getWebcollectionurl() {
        return webcollectionurl;
    }

    /**
     * Sets the value of the webcollectionurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setWebcollectionurl(EntityItemStringType value) {
        this.webcollectionurl = value;
    }

    /**
     * Gets the value of the sitecollectionurl property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getSitecollectionurl() {
        return sitecollectionurl;
    }

    /**
     * Sets the value of the sitecollectionurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setSitecollectionurl(EntityItemStringType value) {
        this.sitecollectionurl = value;
    }

    /**
     * Gets the value of the secondarysitecolladmin property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getSecondarysitecolladmin() {
        return secondarysitecolladmin;
    }

    /**
     * Sets the value of the secondarysitecolladmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setSecondarysitecolladmin(EntityItemStringType value) {
        this.secondarysitecolladmin = value;
    }

    /**
     * Gets the value of the secondsitecolladminenabled property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSecondsitecolladminenabled() {
        return secondsitecolladminenabled;
    }

    /**
     * Sets the value of the secondsitecolladminenabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSecondsitecolladminenabled(EntityItemBoolType value) {
        this.secondsitecolladminenabled = value;
    }

    /**
     * Gets the value of the allowanonymousaccess property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowanonymousaccess() {
        return allowanonymousaccess;
    }

    /**
     * Sets the value of the allowanonymousaccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowanonymousaccess(EntityItemBoolType value) {
        this.allowanonymousaccess = value;
    }

}
