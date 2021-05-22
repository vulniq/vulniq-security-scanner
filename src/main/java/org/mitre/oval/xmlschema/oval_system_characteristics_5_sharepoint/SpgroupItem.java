


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
 *         &lt;element name="sitecollectionurl" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="gname" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="autoacceptrequesttojoinleave" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="allowmemberseditmembership" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="onlyallowmembersviewmembership" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
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
    "gname",
    "autoacceptrequesttojoinleave",
    "allowmemberseditmembership",
    "onlyallowmembersviewmembership"
})
public class SpgroupItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemStringType sitecollectionurl;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemStringType gname;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType autoacceptrequesttojoinleave;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType allowmemberseditmembership;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType onlyallowmembersviewmembership;

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
     * Gets the value of the gname property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getGname() {
        return gname;
    }

    /**
     * Sets the value of the gname property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setGname(EntityItemStringType value) {
        this.gname = value;
    }

    /**
     * Gets the value of the autoacceptrequesttojoinleave property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAutoacceptrequesttojoinleave() {
        return autoacceptrequesttojoinleave;
    }

    /**
     * Sets the value of the autoacceptrequesttojoinleave property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAutoacceptrequesttojoinleave(EntityItemBoolType value) {
        this.autoacceptrequesttojoinleave = value;
    }

    /**
     * Gets the value of the allowmemberseditmembership property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowmemberseditmembership() {
        return allowmemberseditmembership;
    }

    /**
     * Sets the value of the allowmemberseditmembership property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowmemberseditmembership(EntityItemBoolType value) {
        this.allowmemberseditmembership = value;
    }

    /**
     * Gets the value of the onlyallowmembersviewmembership property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getOnlyallowmembersviewmembership() {
        return onlyallowmembersviewmembership;
    }

    /**
     * Sets the value of the onlyallowmembersviewmembership property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setOnlyallowmembersviewmembership(EntityItemBoolType value) {
        this.onlyallowmembersviewmembership = value;
    }

}
