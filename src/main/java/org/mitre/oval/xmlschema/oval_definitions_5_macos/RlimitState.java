


package org.mitre.oval.xmlschema.oval_definitions_5_macos;

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
 *         &lt;element name="cpu_current" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="cpu_max" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="filesize_current" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="filesize_max" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="data_current" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="data_max" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="stack_current" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="stack_max" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="core_current" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="core_max" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="rss_current" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="rss_max" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="memlock_current" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="memlock_max" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="maxproc_current" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="maxproc_max" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="maxfiles_current" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="maxfiles_max" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
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
    "cpuCurrent",
    "cpuMax",
    "filesizeCurrent",
    "filesizeMax",
    "dataCurrent",
    "dataMax",
    "stackCurrent",
    "stackMax",
    "coreCurrent",
    "coreMax",
    "rssCurrent",
    "rssMax",
    "memlockCurrent",
    "memlockMax",
    "maxprocCurrent",
    "maxprocMax",
    "maxfilesCurrent",
    "maxfilesMax"
})
public class RlimitState
    extends StateType
{

    @XmlElement(name = "cpu_current", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateIntType cpuCurrent;
    @XmlElement(name = "cpu_max", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateIntType cpuMax;
    @XmlElement(name = "filesize_current", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateIntType filesizeCurrent;
    @XmlElement(name = "filesize_max", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateIntType filesizeMax;
    @XmlElement(name = "data_current", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateIntType dataCurrent;
    @XmlElement(name = "data_max", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateIntType dataMax;
    @XmlElement(name = "stack_current", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateIntType stackCurrent;
    @XmlElement(name = "stack_max", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateIntType stackMax;
    @XmlElement(name = "core_current", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateIntType coreCurrent;
    @XmlElement(name = "core_max", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateIntType coreMax;
    @XmlElement(name = "rss_current", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateIntType rssCurrent;
    @XmlElement(name = "rss_max", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateIntType rssMax;
    @XmlElement(name = "memlock_current", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateIntType memlockCurrent;
    @XmlElement(name = "memlock_max", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateIntType memlockMax;
    @XmlElement(name = "maxproc_current", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateIntType maxprocCurrent;
    @XmlElement(name = "maxproc_max", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateIntType maxprocMax;
    @XmlElement(name = "maxfiles_current", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateIntType maxfilesCurrent;
    @XmlElement(name = "maxfiles_max", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#macos")
    protected EntityStateIntType maxfilesMax;

    /**
     * Gets the value of the cpuCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getCpuCurrent() {
        return cpuCurrent;
    }

    /**
     * Sets the value of the cpuCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setCpuCurrent(EntityStateIntType value) {
        this.cpuCurrent = value;
    }

    /**
     * Gets the value of the cpuMax property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getCpuMax() {
        return cpuMax;
    }

    /**
     * Sets the value of the cpuMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setCpuMax(EntityStateIntType value) {
        this.cpuMax = value;
    }

    /**
     * Gets the value of the filesizeCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getFilesizeCurrent() {
        return filesizeCurrent;
    }

    /**
     * Sets the value of the filesizeCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setFilesizeCurrent(EntityStateIntType value) {
        this.filesizeCurrent = value;
    }

    /**
     * Gets the value of the filesizeMax property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getFilesizeMax() {
        return filesizeMax;
    }

    /**
     * Sets the value of the filesizeMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setFilesizeMax(EntityStateIntType value) {
        this.filesizeMax = value;
    }

    /**
     * Gets the value of the dataCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getDataCurrent() {
        return dataCurrent;
    }

    /**
     * Sets the value of the dataCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setDataCurrent(EntityStateIntType value) {
        this.dataCurrent = value;
    }

    /**
     * Gets the value of the dataMax property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getDataMax() {
        return dataMax;
    }

    /**
     * Sets the value of the dataMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setDataMax(EntityStateIntType value) {
        this.dataMax = value;
    }

    /**
     * Gets the value of the stackCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getStackCurrent() {
        return stackCurrent;
    }

    /**
     * Sets the value of the stackCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setStackCurrent(EntityStateIntType value) {
        this.stackCurrent = value;
    }

    /**
     * Gets the value of the stackMax property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getStackMax() {
        return stackMax;
    }

    /**
     * Sets the value of the stackMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setStackMax(EntityStateIntType value) {
        this.stackMax = value;
    }

    /**
     * Gets the value of the coreCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getCoreCurrent() {
        return coreCurrent;
    }

    /**
     * Sets the value of the coreCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setCoreCurrent(EntityStateIntType value) {
        this.coreCurrent = value;
    }

    /**
     * Gets the value of the coreMax property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getCoreMax() {
        return coreMax;
    }

    /**
     * Sets the value of the coreMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setCoreMax(EntityStateIntType value) {
        this.coreMax = value;
    }

    /**
     * Gets the value of the rssCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getRssCurrent() {
        return rssCurrent;
    }

    /**
     * Sets the value of the rssCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setRssCurrent(EntityStateIntType value) {
        this.rssCurrent = value;
    }

    /**
     * Gets the value of the rssMax property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getRssMax() {
        return rssMax;
    }

    /**
     * Sets the value of the rssMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setRssMax(EntityStateIntType value) {
        this.rssMax = value;
    }

    /**
     * Gets the value of the memlockCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMemlockCurrent() {
        return memlockCurrent;
    }

    /**
     * Sets the value of the memlockCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMemlockCurrent(EntityStateIntType value) {
        this.memlockCurrent = value;
    }

    /**
     * Gets the value of the memlockMax property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMemlockMax() {
        return memlockMax;
    }

    /**
     * Sets the value of the memlockMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMemlockMax(EntityStateIntType value) {
        this.memlockMax = value;
    }

    /**
     * Gets the value of the maxprocCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMaxprocCurrent() {
        return maxprocCurrent;
    }

    /**
     * Sets the value of the maxprocCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMaxprocCurrent(EntityStateIntType value) {
        this.maxprocCurrent = value;
    }

    /**
     * Gets the value of the maxprocMax property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMaxprocMax() {
        return maxprocMax;
    }

    /**
     * Sets the value of the maxprocMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMaxprocMax(EntityStateIntType value) {
        this.maxprocMax = value;
    }

    /**
     * Gets the value of the maxfilesCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMaxfilesCurrent() {
        return maxfilesCurrent;
    }

    /**
     * Sets the value of the maxfilesCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMaxfilesCurrent(EntityStateIntType value) {
        this.maxfilesCurrent = value;
    }

    /**
     * Gets the value of the maxfilesMax property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getMaxfilesMax() {
        return maxfilesMax;
    }

    /**
     * Sets the value of the maxfilesMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setMaxfilesMax(EntityStateIntType value) {
        this.maxfilesMax = value;
    }

}
