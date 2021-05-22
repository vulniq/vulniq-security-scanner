


package org.mitre.oval.xmlschema.oval_definitions_5_linux;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateIntType;
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
 *         &lt;element name="loaded_profiles_count" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="enforce_mode_profiles_count" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="complain_mode_profiles_count" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="processes_with_profiles_count" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="enforce_mode_processes_count" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="complain_mode_processes_count" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="unconfined_processes_with_profiles_count" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
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
    "loadedProfilesCount",
    "enforceModeProfilesCount",
    "complainModeProfilesCount",
    "processesWithProfilesCount",
    "enforceModeProcessesCount",
    "complainModeProcessesCount",
    "unconfinedProcessesWithProfilesCount"
})
public class ApparmorstatusState
    extends StateType
{

    @XmlElement(name = "loaded_profiles_count", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateIntType loadedProfilesCount;
    @XmlElement(name = "enforce_mode_profiles_count", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateIntType enforceModeProfilesCount;
    @XmlElement(name = "complain_mode_profiles_count", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateIntType complainModeProfilesCount;
    @XmlElement(name = "processes_with_profiles_count", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateIntType processesWithProfilesCount;
    @XmlElement(name = "enforce_mode_processes_count", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateIntType enforceModeProcessesCount;
    @XmlElement(name = "complain_mode_processes_count", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateIntType complainModeProcessesCount;
    @XmlElement(name = "unconfined_processes_with_profiles_count", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#linux")
    protected EntityStateIntType unconfinedProcessesWithProfilesCount;

    /**
     * Gets the value of the loadedProfilesCount property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getLoadedProfilesCount() {
        return loadedProfilesCount;
    }

    /**
     * Sets the value of the loadedProfilesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setLoadedProfilesCount(EntityStateIntType value) {
        this.loadedProfilesCount = value;
    }

    /**
     * Gets the value of the enforceModeProfilesCount property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getEnforceModeProfilesCount() {
        return enforceModeProfilesCount;
    }

    /**
     * Sets the value of the enforceModeProfilesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setEnforceModeProfilesCount(EntityStateIntType value) {
        this.enforceModeProfilesCount = value;
    }

    /**
     * Gets the value of the complainModeProfilesCount property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getComplainModeProfilesCount() {
        return complainModeProfilesCount;
    }

    /**
     * Sets the value of the complainModeProfilesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setComplainModeProfilesCount(EntityStateIntType value) {
        this.complainModeProfilesCount = value;
    }

    /**
     * Gets the value of the processesWithProfilesCount property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getProcessesWithProfilesCount() {
        return processesWithProfilesCount;
    }

    /**
     * Sets the value of the processesWithProfilesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setProcessesWithProfilesCount(EntityStateIntType value) {
        this.processesWithProfilesCount = value;
    }

    /**
     * Gets the value of the enforceModeProcessesCount property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getEnforceModeProcessesCount() {
        return enforceModeProcessesCount;
    }

    /**
     * Sets the value of the enforceModeProcessesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setEnforceModeProcessesCount(EntityStateIntType value) {
        this.enforceModeProcessesCount = value;
    }

    /**
     * Gets the value of the complainModeProcessesCount property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getComplainModeProcessesCount() {
        return complainModeProcessesCount;
    }

    /**
     * Sets the value of the complainModeProcessesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setComplainModeProcessesCount(EntityStateIntType value) {
        this.complainModeProcessesCount = value;
    }

    /**
     * Gets the value of the unconfinedProcessesWithProfilesCount property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getUnconfinedProcessesWithProfilesCount() {
        return unconfinedProcessesWithProfilesCount;
    }

    /**
     * Sets the value of the unconfinedProcessesWithProfilesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setUnconfinedProcessesWithProfilesCount(EntityStateIntType value) {
        this.unconfinedProcessesWithProfilesCount = value;
    }

}
