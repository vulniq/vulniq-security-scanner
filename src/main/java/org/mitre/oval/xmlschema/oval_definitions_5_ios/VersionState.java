


package org.mitre.oval.xmlschema.oval_definitions_5_ios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateIOSVersionType;
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
 *         &lt;element name="major_release" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="train_number" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="train_identifier" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#ios}EntityStateTrainIdentifierType" minOccurs="0"/>
 *         &lt;element name="version_string" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIOSVersionType" minOccurs="0"/>
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
    "majorRelease",
    "trainNumber",
    "trainIdentifier",
    "versionString"
})
public class VersionState
    extends StateType
{

    @XmlElement(name = "major_release", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios")
    protected EntityStateStringType majorRelease;
    @XmlElement(name = "train_number", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios")
    protected EntityStateStringType trainNumber;
    @XmlElement(name = "train_identifier", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios")
    protected EntityStateTrainIdentifierType trainIdentifier;
    @XmlElement(name = "version_string", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#ios")
    protected EntityStateIOSVersionType versionString;

    /**
     * Gets the value of the majorRelease property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getMajorRelease() {
        return majorRelease;
    }

    /**
     * Sets the value of the majorRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setMajorRelease(EntityStateStringType value) {
        this.majorRelease = value;
    }

    /**
     * Gets the value of the trainNumber property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getTrainNumber() {
        return trainNumber;
    }

    /**
     * Sets the value of the trainNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setTrainNumber(EntityStateStringType value) {
        this.trainNumber = value;
    }

    /**
     * Gets the value of the trainIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateTrainIdentifierType }
     *     
     */
    public EntityStateTrainIdentifierType getTrainIdentifier() {
        return trainIdentifier;
    }

    /**
     * Sets the value of the trainIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateTrainIdentifierType }
     *     
     */
    public void setTrainIdentifier(EntityStateTrainIdentifierType value) {
        this.trainIdentifier = value;
    }

    /**
     * Gets the value of the versionString property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIOSVersionType }
     *     
     */
    public EntityStateIOSVersionType getVersionString() {
        return versionString;
    }

    /**
     * Sets the value of the versionString property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIOSVersionType }
     *     
     */
    public void setVersionString(EntityStateIOSVersionType value) {
        this.versionString = value;
    }

}
