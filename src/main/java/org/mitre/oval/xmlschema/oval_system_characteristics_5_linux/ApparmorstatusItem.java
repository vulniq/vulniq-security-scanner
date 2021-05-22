


package org.mitre.oval.xmlschema.oval_system_characteristics_5_linux;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemIntType;
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
 *         &lt;element name="loaded_profiles_count" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="enforce_mode_profiles_count" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="complain_mode_profiles_count" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="processes_with_profiles_count" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="enforce_mode_processes_count" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="complain_mode_processes_count" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="unconfined_processes_with_profiles_count" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
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
public class ApparmorstatusItem
    extends ItemType
{

    @XmlElement(name = "loaded_profiles_count", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemIntType loadedProfilesCount;
    @XmlElement(name = "enforce_mode_profiles_count", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemIntType enforceModeProfilesCount;
    @XmlElement(name = "complain_mode_profiles_count", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemIntType complainModeProfilesCount;
    @XmlElement(name = "processes_with_profiles_count", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemIntType processesWithProfilesCount;
    @XmlElement(name = "enforce_mode_processes_count", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemIntType enforceModeProcessesCount;
    @XmlElement(name = "complain_mode_processes_count", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemIntType complainModeProcessesCount;
    @XmlElement(name = "unconfined_processes_with_profiles_count", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#linux")
    protected EntityItemIntType unconfinedProcessesWithProfilesCount;

    /**
     * Gets the value of the loadedProfilesCount property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getLoadedProfilesCount() {
        return loadedProfilesCount;
    }

    /**
     * Sets the value of the loadedProfilesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setLoadedProfilesCount(EntityItemIntType value) {
        this.loadedProfilesCount = value;
    }

    /**
     * Gets the value of the enforceModeProfilesCount property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getEnforceModeProfilesCount() {
        return enforceModeProfilesCount;
    }

    /**
     * Sets the value of the enforceModeProfilesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setEnforceModeProfilesCount(EntityItemIntType value) {
        this.enforceModeProfilesCount = value;
    }

    /**
     * Gets the value of the complainModeProfilesCount property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getComplainModeProfilesCount() {
        return complainModeProfilesCount;
    }

    /**
     * Sets the value of the complainModeProfilesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setComplainModeProfilesCount(EntityItemIntType value) {
        this.complainModeProfilesCount = value;
    }

    /**
     * Gets the value of the processesWithProfilesCount property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getProcessesWithProfilesCount() {
        return processesWithProfilesCount;
    }

    /**
     * Sets the value of the processesWithProfilesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setProcessesWithProfilesCount(EntityItemIntType value) {
        this.processesWithProfilesCount = value;
    }

    /**
     * Gets the value of the enforceModeProcessesCount property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getEnforceModeProcessesCount() {
        return enforceModeProcessesCount;
    }

    /**
     * Sets the value of the enforceModeProcessesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setEnforceModeProcessesCount(EntityItemIntType value) {
        this.enforceModeProcessesCount = value;
    }

    /**
     * Gets the value of the complainModeProcessesCount property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getComplainModeProcessesCount() {
        return complainModeProcessesCount;
    }

    /**
     * Sets the value of the complainModeProcessesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setComplainModeProcessesCount(EntityItemIntType value) {
        this.complainModeProcessesCount = value;
    }

    /**
     * Gets the value of the unconfinedProcessesWithProfilesCount property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getUnconfinedProcessesWithProfilesCount() {
        return unconfinedProcessesWithProfilesCount;
    }

    /**
     * Sets the value of the unconfinedProcessesWithProfilesCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setUnconfinedProcessesWithProfilesCount(EntityItemIntType value) {
        this.unconfinedProcessesWithProfilesCount = value;
    }

}
