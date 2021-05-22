
package org.mitre.oval.xmlschema.oval_system_characteristics_5_windows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemStringType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.ItemType;


/**
 * The userright_item is used to specify a trustee name and corresponding SID that has been granted a user right/privilege.
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}ItemType">
 *       &lt;sequence>
 *         &lt;element name="userright" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows}EntityItemUserRightType" minOccurs="0"/>
 *         &lt;element name="trustee_name" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="trustee_sid" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
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
    "userright",
    "trusteeName",
    "trusteeSid"
})
public class UserrightItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemUserRightType userright;
    @XmlElement(name = "trustee_name", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemStringType trusteeName;
    @XmlElement(name = "trustee_sid", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemStringType trusteeSid;

    /**
     * Gets the value of the userright property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemUserRightType }
     *     
     */
    public EntityItemUserRightType getUserright() {
        return userright;
    }

    /**
     * Sets the value of the userright property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemUserRightType }
     *     
     */
    public void setUserright(EntityItemUserRightType value) {
        this.userright = value;
    }

    /**
     * Gets the value of the trusteeName property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getTrusteeName() {
        return trusteeName;
    }

    /**
     * Sets the value of the trusteeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setTrusteeName(EntityItemStringType value) {
        this.trusteeName = value;
    }

    /**
     * Gets the value of the trusteeSid property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getTrusteeSid() {
        return trusteeSid;
    }

    /**
     * Sets the value of the trusteeSid property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setTrusteeSid(EntityItemStringType value) {
        this.trusteeSid = value;
    }

}
