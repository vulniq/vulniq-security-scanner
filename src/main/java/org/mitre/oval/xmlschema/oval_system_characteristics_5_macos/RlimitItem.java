


package org.mitre.oval.xmlschema.oval_system_characteristics_5_macos;

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
 *         &lt;element name="cpu_current" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="cpu_max" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="filesize_current" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="filesize_max" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="data_current" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="data_max" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="stack_current" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="stack_max" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="core_current" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="core_max" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="rss_current" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="rss_max" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="memlock_current" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="memlock_max" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="maxproc_current" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="maxproc_max" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="maxfiles_current" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
 *         &lt;element name="maxfiles_max" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType"/>
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
public class RlimitItem
    extends ItemType
{

    @XmlElement(name = "cpu_current", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", required = true)
    protected EntityItemIntType cpuCurrent;
    @XmlElement(name = "cpu_max", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", required = true)
    protected EntityItemIntType cpuMax;
    @XmlElement(name = "filesize_current", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", required = true)
    protected EntityItemIntType filesizeCurrent;
    @XmlElement(name = "filesize_max", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", required = true)
    protected EntityItemIntType filesizeMax;
    @XmlElement(name = "data_current", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", required = true)
    protected EntityItemIntType dataCurrent;
    @XmlElement(name = "data_max", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", required = true)
    protected EntityItemIntType dataMax;
    @XmlElement(name = "stack_current", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", required = true)
    protected EntityItemIntType stackCurrent;
    @XmlElement(name = "stack_max", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", required = true)
    protected EntityItemIntType stackMax;
    @XmlElement(name = "core_current", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", required = true)
    protected EntityItemIntType coreCurrent;
    @XmlElement(name = "core_max", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", required = true)
    protected EntityItemIntType coreMax;
    @XmlElement(name = "rss_current", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", required = true)
    protected EntityItemIntType rssCurrent;
    @XmlElement(name = "rss_max", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", required = true)
    protected EntityItemIntType rssMax;
    @XmlElement(name = "memlock_current", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", required = true)
    protected EntityItemIntType memlockCurrent;
    @XmlElement(name = "memlock_max", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", required = true)
    protected EntityItemIntType memlockMax;
    @XmlElement(name = "maxproc_current", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", required = true)
    protected EntityItemIntType maxprocCurrent;
    @XmlElement(name = "maxproc_max", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", required = true)
    protected EntityItemIntType maxprocMax;
    @XmlElement(name = "maxfiles_current", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", required = true)
    protected EntityItemIntType maxfilesCurrent;
    @XmlElement(name = "maxfiles_max", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#macos", required = true)
    protected EntityItemIntType maxfilesMax;

    /**
     * Gets the value of the cpuCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getCpuCurrent() {
        return cpuCurrent;
    }

    /**
     * Sets the value of the cpuCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setCpuCurrent(EntityItemIntType value) {
        this.cpuCurrent = value;
    }

    /**
     * Gets the value of the cpuMax property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getCpuMax() {
        return cpuMax;
    }

    /**
     * Sets the value of the cpuMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setCpuMax(EntityItemIntType value) {
        this.cpuMax = value;
    }

    /**
     * Gets the value of the filesizeCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getFilesizeCurrent() {
        return filesizeCurrent;
    }

    /**
     * Sets the value of the filesizeCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setFilesizeCurrent(EntityItemIntType value) {
        this.filesizeCurrent = value;
    }

    /**
     * Gets the value of the filesizeMax property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getFilesizeMax() {
        return filesizeMax;
    }

    /**
     * Sets the value of the filesizeMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setFilesizeMax(EntityItemIntType value) {
        this.filesizeMax = value;
    }

    /**
     * Gets the value of the dataCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getDataCurrent() {
        return dataCurrent;
    }

    /**
     * Sets the value of the dataCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setDataCurrent(EntityItemIntType value) {
        this.dataCurrent = value;
    }

    /**
     * Gets the value of the dataMax property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getDataMax() {
        return dataMax;
    }

    /**
     * Sets the value of the dataMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setDataMax(EntityItemIntType value) {
        this.dataMax = value;
    }

    /**
     * Gets the value of the stackCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getStackCurrent() {
        return stackCurrent;
    }

    /**
     * Sets the value of the stackCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setStackCurrent(EntityItemIntType value) {
        this.stackCurrent = value;
    }

    /**
     * Gets the value of the stackMax property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getStackMax() {
        return stackMax;
    }

    /**
     * Sets the value of the stackMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setStackMax(EntityItemIntType value) {
        this.stackMax = value;
    }

    /**
     * Gets the value of the coreCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getCoreCurrent() {
        return coreCurrent;
    }

    /**
     * Sets the value of the coreCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setCoreCurrent(EntityItemIntType value) {
        this.coreCurrent = value;
    }

    /**
     * Gets the value of the coreMax property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getCoreMax() {
        return coreMax;
    }

    /**
     * Sets the value of the coreMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setCoreMax(EntityItemIntType value) {
        this.coreMax = value;
    }

    /**
     * Gets the value of the rssCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getRssCurrent() {
        return rssCurrent;
    }

    /**
     * Sets the value of the rssCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setRssCurrent(EntityItemIntType value) {
        this.rssCurrent = value;
    }

    /**
     * Gets the value of the rssMax property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getRssMax() {
        return rssMax;
    }

    /**
     * Sets the value of the rssMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setRssMax(EntityItemIntType value) {
        this.rssMax = value;
    }

    /**
     * Gets the value of the memlockCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMemlockCurrent() {
        return memlockCurrent;
    }

    /**
     * Sets the value of the memlockCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMemlockCurrent(EntityItemIntType value) {
        this.memlockCurrent = value;
    }

    /**
     * Gets the value of the memlockMax property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMemlockMax() {
        return memlockMax;
    }

    /**
     * Sets the value of the memlockMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMemlockMax(EntityItemIntType value) {
        this.memlockMax = value;
    }

    /**
     * Gets the value of the maxprocCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMaxprocCurrent() {
        return maxprocCurrent;
    }

    /**
     * Sets the value of the maxprocCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMaxprocCurrent(EntityItemIntType value) {
        this.maxprocCurrent = value;
    }

    /**
     * Gets the value of the maxprocMax property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMaxprocMax() {
        return maxprocMax;
    }

    /**
     * Sets the value of the maxprocMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMaxprocMax(EntityItemIntType value) {
        this.maxprocMax = value;
    }

    /**
     * Gets the value of the maxfilesCurrent property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMaxfilesCurrent() {
        return maxfilesCurrent;
    }

    /**
     * Sets the value of the maxfilesCurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMaxfilesCurrent(EntityItemIntType value) {
        this.maxfilesCurrent = value;
    }

    /**
     * Gets the value of the maxfilesMax property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getMaxfilesMax() {
        return maxfilesMax;
    }

    /**
     * Sets the value of the maxfilesMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setMaxfilesMax(EntityItemIntType value) {
        this.maxfilesMax = value;
    }

}
