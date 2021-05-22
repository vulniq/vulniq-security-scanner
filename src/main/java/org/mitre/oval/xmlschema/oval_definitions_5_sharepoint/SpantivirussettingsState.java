


package org.mitre.oval.xmlschema.oval_definitions_5_sharepoint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateBoolType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateIntType;
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
 *         &lt;element name="spwebservicename" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="spfarmname" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="allowdownload" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="cleaningenabled" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="downloadscanenabled" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="numberofthreads" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="skipsearchcrawl" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="timeout" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="uploadscanenabled" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="vendorupdatecount" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
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
    "spwebservicename",
    "spfarmname",
    "allowdownload",
    "cleaningenabled",
    "downloadscanenabled",
    "numberofthreads",
    "skipsearchcrawl",
    "timeout",
    "uploadscanenabled",
    "vendorupdatecount"
})
public class SpantivirussettingsState
    extends StateType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateStringType spwebservicename;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateStringType spfarmname;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType allowdownload;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType cleaningenabled;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType downloadscanenabled;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateIntType numberofthreads;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType skipsearchcrawl;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateIntType timeout;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType uploadscanenabled;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateIntType vendorupdatecount;

    /**
     * Gets the value of the spwebservicename property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getSpwebservicename() {
        return spwebservicename;
    }

    /**
     * Sets the value of the spwebservicename property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setSpwebservicename(EntityStateStringType value) {
        this.spwebservicename = value;
    }

    /**
     * Gets the value of the spfarmname property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getSpfarmname() {
        return spfarmname;
    }

    /**
     * Sets the value of the spfarmname property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setSpfarmname(EntityStateStringType value) {
        this.spfarmname = value;
    }

    /**
     * Gets the value of the allowdownload property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowdownload() {
        return allowdownload;
    }

    /**
     * Sets the value of the allowdownload property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowdownload(EntityStateBoolType value) {
        this.allowdownload = value;
    }

    /**
     * Gets the value of the cleaningenabled property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getCleaningenabled() {
        return cleaningenabled;
    }

    /**
     * Sets the value of the cleaningenabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setCleaningenabled(EntityStateBoolType value) {
        this.cleaningenabled = value;
    }

    /**
     * Gets the value of the downloadscanenabled property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getDownloadscanenabled() {
        return downloadscanenabled;
    }

    /**
     * Sets the value of the downloadscanenabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setDownloadscanenabled(EntityStateBoolType value) {
        this.downloadscanenabled = value;
    }

    /**
     * Gets the value of the numberofthreads property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getNumberofthreads() {
        return numberofthreads;
    }

    /**
     * Sets the value of the numberofthreads property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setNumberofthreads(EntityStateIntType value) {
        this.numberofthreads = value;
    }

    /**
     * Gets the value of the skipsearchcrawl property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSkipsearchcrawl() {
        return skipsearchcrawl;
    }

    /**
     * Sets the value of the skipsearchcrawl property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSkipsearchcrawl(EntityStateBoolType value) {
        this.skipsearchcrawl = value;
    }

    /**
     * Gets the value of the timeout property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getTimeout() {
        return timeout;
    }

    /**
     * Sets the value of the timeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setTimeout(EntityStateIntType value) {
        this.timeout = value;
    }

    /**
     * Gets the value of the uploadscanenabled property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getUploadscanenabled() {
        return uploadscanenabled;
    }

    /**
     * Sets the value of the uploadscanenabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setUploadscanenabled(EntityStateBoolType value) {
        this.uploadscanenabled = value;
    }

    /**
     * Gets the value of the vendorupdatecount property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getVendorupdatecount() {
        return vendorupdatecount;
    }

    /**
     * Sets the value of the vendorupdatecount property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setVendorupdatecount(EntityStateIntType value) {
        this.vendorupdatecount = value;
    }

}
