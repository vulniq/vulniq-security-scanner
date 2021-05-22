


package org.mitre.oval.xmlschema.oval_definitions_5_sharepoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateBoolType;
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
 *         &lt;element name="webcollectionurl" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="sitecollectionurl" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="secondarysitecolladmin" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="secondsitecolladminenabled" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allowanonymousaccess" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
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
public class SpwebState
    extends StateType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateStringType webcollectionurl;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateStringType sitecollectionurl;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateStringType secondarysitecolladmin;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType secondsitecolladminenabled;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType allowanonymousaccess;

    /**
     * Gets the value of the webcollectionurl property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getWebcollectionurl() {
        return webcollectionurl;
    }

    /**
     * Sets the value of the webcollectionurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setWebcollectionurl(EntityStateStringType value) {
        this.webcollectionurl = value;
    }

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
     * Gets the value of the secondarysitecolladmin property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getSecondarysitecolladmin() {
        return secondarysitecolladmin;
    }

    /**
     * Sets the value of the secondarysitecolladmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setSecondarysitecolladmin(EntityStateStringType value) {
        this.secondarysitecolladmin = value;
    }

    /**
     * Gets the value of the secondsitecolladminenabled property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSecondsitecolladminenabled() {
        return secondsitecolladminenabled;
    }

    /**
     * Sets the value of the secondsitecolladminenabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSecondsitecolladminenabled(EntityStateBoolType value) {
        this.secondsitecolladminenabled = value;
    }

    /**
     * Gets the value of the allowanonymousaccess property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowanonymousaccess() {
        return allowanonymousaccess;
    }

    /**
     * Sets the value of the allowanonymousaccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowanonymousaccess(EntityStateBoolType value) {
        this.allowanonymousaccess = value;
    }

}
