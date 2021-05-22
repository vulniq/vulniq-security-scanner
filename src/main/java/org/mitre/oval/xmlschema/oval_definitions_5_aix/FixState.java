


package org.mitre.oval.xmlschema.oval_definitions_5_aix;

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
 *         &lt;element name="apar_number" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="abstract" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="symptom" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="installation_status" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#aix}EntityStateFixInstallationStatusType" minOccurs="0"/>
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
public class FixState
    extends StateType
{

    @XmlElement(name = "apar_number", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#aix")
    protected EntityStateStringType aparNumber;
    @XmlElement(name = "abstract", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#aix")
    protected EntityStateStringType _abstract;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#aix")
    protected EntityStateStringType symptom;
    @XmlElement(name = "installation_status", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#aix")
    protected EntityStateFixInstallationStatusType installationStatus;

    /**
     * Gets the value of the aparNumber property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getAparNumber() {
        return aparNumber;
    }

    /**
     * Sets the value of the aparNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setAparNumber(EntityStateStringType value) {
        this.aparNumber = value;
    }

    /**
     * Gets the value of the abstract property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getAbstract() {
        return _abstract;
    }

    /**
     * Sets the value of the abstract property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setAbstract(EntityStateStringType value) {
        this._abstract = value;
    }

    /**
     * Gets the value of the symptom property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getSymptom() {
        return symptom;
    }

    /**
     * Sets the value of the symptom property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setSymptom(EntityStateStringType value) {
        this.symptom = value;
    }

    /**
     * Gets the value of the installationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateFixInstallationStatusType }
     *     
     */
    public EntityStateFixInstallationStatusType getInstallationStatus() {
        return installationStatus;
    }

    /**
     * Sets the value of the installationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateFixInstallationStatusType }
     *     
     */
    public void setInstallationStatus(EntityStateFixInstallationStatusType value) {
        this.installationStatus = value;
    }

}
