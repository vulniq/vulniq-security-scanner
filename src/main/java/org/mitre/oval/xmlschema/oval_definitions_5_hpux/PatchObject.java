


package org.mitre.oval.xmlschema.oval_definitions_5_hpux;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityObjectStringType;
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
 *           &lt;element name="patch_name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityObjectStringType"/>
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
    "patchName"
})
public class PatchObject
    extends ObjectType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    protected Set set;
    @XmlElement(name = "patch_name", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#hpux")
    protected EntityObjectStringType patchName;

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
     * Gets the value of the patchName property.
     * 
     * @return
     *     possible object is
     *     {@link EntityObjectStringType }
     *     
     */
    public EntityObjectStringType getPatchName() {
        return patchName;
    }

    /**
     * Sets the value of the patchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityObjectStringType }
     *     
     */
    public void setPatchName(EntityObjectStringType value) {
        this.patchName = value;
    }

}
