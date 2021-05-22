


package org.mitre.oval.xmlschema.oval_system_characteristics_5_aix;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="apar_number" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="abstract" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="symptom" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="installation_status" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#aix}EntityItemFixInstallationStatusType" minOccurs="0"/>
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
    "aparNumber",
    "_abstract",
    "symptom",
    "installationStatus"
})
public class FixItem
    extends ItemType
{

    @XmlElement(name = "apar_number", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#aix")
    protected EntityItemStringType aparNumber;
    @XmlElement(name = "abstract", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#aix")
    protected EntityItemStringType _abstract;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#aix")
    protected EntityItemStringType symptom;
    @XmlElement(name = "installation_status", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#aix")
    protected EntityItemFixInstallationStatusType installationStatus;

    /**
     * Gets the value of the aparNumber property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getAparNumber() {
        return aparNumber;
    }

    /**
     * Sets the value of the aparNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setAparNumber(EntityItemStringType value) {
        this.aparNumber = value;
    }

    /**
     * Gets the value of the abstract property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getAbstract() {
        return _abstract;
    }

    /**
     * Sets the value of the abstract property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setAbstract(EntityItemStringType value) {
        this._abstract = value;
    }

    /**
     * Gets the value of the symptom property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getSymptom() {
        return symptom;
    }

    /**
     * Sets the value of the symptom property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setSymptom(EntityItemStringType value) {
        this.symptom = value;
    }

    /**
     * Gets the value of the installationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemFixInstallationStatusType }
     *     
     */
    public EntityItemFixInstallationStatusType getInstallationStatus() {
        return installationStatus;
    }

    /**
     * Sets the value of the installationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemFixInstallationStatusType }
     *     
     */
    public void setInstallationStatus(EntityItemFixInstallationStatusType value) {
        this.installationStatus = value;
    }

}
