


package org.mitre.oval.xmlschema.oval_definitions_5_windows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateBoolType;
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
 *         &lt;element name="service_name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="trustee_sid" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="standard_delete" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="standard_read_control" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="standard_write_dac" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="standard_write_owner" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="generic_read" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="generic_write" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="generic_execute" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="service_query_conf" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="service_change_conf" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="service_query_stat" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="service_enum_dependents" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="service_start" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="service_stop" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="service_pause" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="service_interrogate" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="service_user_defined" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
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
    "serviceName",
    "trusteeSid",
    "standardDelete",
    "standardReadControl",
    "standardWriteDac",
    "standardWriteOwner",
    "genericRead",
    "genericWrite",
    "genericExecute",
    "serviceQueryConf",
    "serviceChangeConf",
    "serviceQueryStat",
    "serviceEnumDependents",
    "serviceStart",
    "serviceStop",
    "servicePause",
    "serviceInterrogate",
    "serviceUserDefined"
})
public class ServiceeffectiverightsState
    extends StateType
{

    @XmlElement(name = "service_name", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateStringType serviceName;
    @XmlElement(name = "trustee_sid", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateStringType trusteeSid;
    @XmlElement(name = "standard_delete", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType standardDelete;
    @XmlElement(name = "standard_read_control", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType standardReadControl;
    @XmlElement(name = "standard_write_dac", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType standardWriteDac;
    @XmlElement(name = "standard_write_owner", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType standardWriteOwner;
    @XmlElement(name = "generic_read", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType genericRead;
    @XmlElement(name = "generic_write", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType genericWrite;
    @XmlElement(name = "generic_execute", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType genericExecute;
    @XmlElement(name = "service_query_conf", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType serviceQueryConf;
    @XmlElement(name = "service_change_conf", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType serviceChangeConf;
    @XmlElement(name = "service_query_stat", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType serviceQueryStat;
    @XmlElement(name = "service_enum_dependents", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType serviceEnumDependents;
    @XmlElement(name = "service_start", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType serviceStart;
    @XmlElement(name = "service_stop", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType serviceStop;
    @XmlElement(name = "service_pause", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType servicePause;
    @XmlElement(name = "service_interrogate", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType serviceInterrogate;
    @XmlElement(name = "service_user_defined", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType serviceUserDefined;

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setServiceName(EntityStateStringType value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the trusteeSid property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getTrusteeSid() {
        return trusteeSid;
    }

    /**
     * Sets the value of the trusteeSid property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setTrusteeSid(EntityStateStringType value) {
        this.trusteeSid = value;
    }

    /**
     * Gets the value of the standardDelete property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getStandardDelete() {
        return standardDelete;
    }

    /**
     * Sets the value of the standardDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setStandardDelete(EntityStateBoolType value) {
        this.standardDelete = value;
    }

    /**
     * Gets the value of the standardReadControl property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getStandardReadControl() {
        return standardReadControl;
    }

    /**
     * Sets the value of the standardReadControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setStandardReadControl(EntityStateBoolType value) {
        this.standardReadControl = value;
    }

    /**
     * Gets the value of the standardWriteDac property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getStandardWriteDac() {
        return standardWriteDac;
    }

    /**
     * Sets the value of the standardWriteDac property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setStandardWriteDac(EntityStateBoolType value) {
        this.standardWriteDac = value;
    }

    /**
     * Gets the value of the standardWriteOwner property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getStandardWriteOwner() {
        return standardWriteOwner;
    }

    /**
     * Sets the value of the standardWriteOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setStandardWriteOwner(EntityStateBoolType value) {
        this.standardWriteOwner = value;
    }

    /**
     * Gets the value of the genericRead property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getGenericRead() {
        return genericRead;
    }

    /**
     * Sets the value of the genericRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setGenericRead(EntityStateBoolType value) {
        this.genericRead = value;
    }

    /**
     * Gets the value of the genericWrite property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getGenericWrite() {
        return genericWrite;
    }

    /**
     * Sets the value of the genericWrite property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setGenericWrite(EntityStateBoolType value) {
        this.genericWrite = value;
    }

    /**
     * Gets the value of the genericExecute property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getGenericExecute() {
        return genericExecute;
    }

    /**
     * Sets the value of the genericExecute property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setGenericExecute(EntityStateBoolType value) {
        this.genericExecute = value;
    }

    /**
     * Gets the value of the serviceQueryConf property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getServiceQueryConf() {
        return serviceQueryConf;
    }

    /**
     * Sets the value of the serviceQueryConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setServiceQueryConf(EntityStateBoolType value) {
        this.serviceQueryConf = value;
    }

    /**
     * Gets the value of the serviceChangeConf property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getServiceChangeConf() {
        return serviceChangeConf;
    }

    /**
     * Sets the value of the serviceChangeConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setServiceChangeConf(EntityStateBoolType value) {
        this.serviceChangeConf = value;
    }

    /**
     * Gets the value of the serviceQueryStat property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getServiceQueryStat() {
        return serviceQueryStat;
    }

    /**
     * Sets the value of the serviceQueryStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setServiceQueryStat(EntityStateBoolType value) {
        this.serviceQueryStat = value;
    }

    /**
     * Gets the value of the serviceEnumDependents property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getServiceEnumDependents() {
        return serviceEnumDependents;
    }

    /**
     * Sets the value of the serviceEnumDependents property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setServiceEnumDependents(EntityStateBoolType value) {
        this.serviceEnumDependents = value;
    }

    /**
     * Gets the value of the serviceStart property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getServiceStart() {
        return serviceStart;
    }

    /**
     * Sets the value of the serviceStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setServiceStart(EntityStateBoolType value) {
        this.serviceStart = value;
    }

    /**
     * Gets the value of the serviceStop property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getServiceStop() {
        return serviceStop;
    }

    /**
     * Sets the value of the serviceStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setServiceStop(EntityStateBoolType value) {
        this.serviceStop = value;
    }

    /**
     * Gets the value of the servicePause property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getServicePause() {
        return servicePause;
    }

    /**
     * Sets the value of the servicePause property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setServicePause(EntityStateBoolType value) {
        this.servicePause = value;
    }

    /**
     * Gets the value of the serviceInterrogate property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getServiceInterrogate() {
        return serviceInterrogate;
    }

    /**
     * Sets the value of the serviceInterrogate property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setServiceInterrogate(EntityStateBoolType value) {
        this.serviceInterrogate = value;
    }

    /**
     * Gets the value of the serviceUserDefined property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getServiceUserDefined() {
        return serviceUserDefined;
    }

    /**
     * Sets the value of the serviceUserDefined property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setServiceUserDefined(EntityStateBoolType value) {
        this.serviceUserDefined = value;
    }

}
