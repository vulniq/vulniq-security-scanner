


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
 *         &lt;element name="webapplicationurl" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="allowparttopartcommunication" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="allowaccesstowebpartcatalog" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="blockedfileextention" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="defaultquotatemplate" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="externalworkflowparticipantsenabled" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="recyclebinenabled" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="automaticallydeleteunusedsitecollections" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="selfservicesitecreationenabled" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="secondstagerecyclebinquota" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="recyclebinretentionperiod" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="outboundmailserverinstance" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="outboundmailsenderaddress" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="outboundmailreplytoaddress" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="secvalexpires" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="timeout" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="isadministrationwebapplication" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="applicationpoolname" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="applicationpoolusername" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="openitems" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="addlistitems" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="approveitems" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="deletelistitems" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="deleteversions" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="editlistitems" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="managelists" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="viewversions" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="viewlistitems" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="cancelcheckout" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="createalerts" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="viewformpages" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="viewpages" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="addandcustomizepages" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="applystylesheets" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="applythemeandborder" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="browsedirectories" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="browseuserinfo" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="creategroups" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="createsscsite" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="editmyuserinfo" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="enumeratepermissions" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="managealerts" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="managepermissions" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="managesubwebs" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="manageweb" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="open" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="useclientintegration" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="useremoteapis" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="viewusagedata" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="managepersonalviews" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="adddelprivatewebparts" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="updatepersonalwebparts" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
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
    "webapplicationurl",
    "allowparttopartcommunication",
    "allowaccesstowebpartcatalog",
    "blockedfileextention",
    "defaultquotatemplate",
    "externalworkflowparticipantsenabled",
    "recyclebinenabled",
    "automaticallydeleteunusedsitecollections",
    "selfservicesitecreationenabled",
    "secondstagerecyclebinquota",
    "recyclebinretentionperiod",
    "outboundmailserverinstance",
    "outboundmailsenderaddress",
    "outboundmailreplytoaddress",
    "secvalexpires",
    "timeout",
    "isadministrationwebapplication",
    "applicationpoolname",
    "applicationpoolusername",
    "openitems",
    "addlistitems",
    "approveitems",
    "deletelistitems",
    "deleteversions",
    "editlistitems",
    "managelists",
    "viewversions",
    "viewlistitems",
    "cancelcheckout",
    "createalerts",
    "viewformpages",
    "viewpages",
    "addandcustomizepages",
    "applystylesheets",
    "applythemeandborder",
    "browsedirectories",
    "browseuserinfo",
    "creategroups",
    "createsscsite",
    "editmyuserinfo",
    "enumeratepermissions",
    "managealerts",
    "managepermissions",
    "managesubwebs",
    "manageweb",
    "open",
    "useclientintegration",
    "useremoteapis",
    "viewusagedata",
    "managepersonalviews",
    "adddelprivatewebparts",
    "updatepersonalwebparts"
})
public class SpwebapplicationState
    extends StateType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateStringType webapplicationurl;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType allowparttopartcommunication;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType allowaccesstowebpartcatalog;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateStringType blockedfileextention;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateStringType defaultquotatemplate;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType externalworkflowparticipantsenabled;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType recyclebinenabled;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType automaticallydeleteunusedsitecollections;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType selfservicesitecreationenabled;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateIntType secondstagerecyclebinquota;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateIntType recyclebinretentionperiod;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateStringType outboundmailserverinstance;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateStringType outboundmailsenderaddress;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateStringType outboundmailreplytoaddress;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType secvalexpires;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateIntType timeout;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType isadministrationwebapplication;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateStringType applicationpoolname;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateStringType applicationpoolusername;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType openitems;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType addlistitems;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType approveitems;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType deletelistitems;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType deleteversions;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType editlistitems;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType managelists;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType viewversions;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType viewlistitems;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType cancelcheckout;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType createalerts;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType viewformpages;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType viewpages;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType addandcustomizepages;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType applystylesheets;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType applythemeandborder;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType browsedirectories;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType browseuserinfo;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType creategroups;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType createsscsite;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType editmyuserinfo;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType enumeratepermissions;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType managealerts;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType managepermissions;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType managesubwebs;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType manageweb;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType open;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType useclientintegration;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType useremoteapis;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType viewusagedata;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType managepersonalviews;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType adddelprivatewebparts;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#sharepoint")
    protected EntityStateBoolType updatepersonalwebparts;

    /**
     * Gets the value of the webapplicationurl property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getWebapplicationurl() {
        return webapplicationurl;
    }

    /**
     * Sets the value of the webapplicationurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setWebapplicationurl(EntityStateStringType value) {
        this.webapplicationurl = value;
    }

    /**
     * Gets the value of the allowparttopartcommunication property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowparttopartcommunication() {
        return allowparttopartcommunication;
    }

    /**
     * Sets the value of the allowparttopartcommunication property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowparttopartcommunication(EntityStateBoolType value) {
        this.allowparttopartcommunication = value;
    }

    /**
     * Gets the value of the allowaccesstowebpartcatalog property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAllowaccesstowebpartcatalog() {
        return allowaccesstowebpartcatalog;
    }

    /**
     * Sets the value of the allowaccesstowebpartcatalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAllowaccesstowebpartcatalog(EntityStateBoolType value) {
        this.allowaccesstowebpartcatalog = value;
    }

    /**
     * Gets the value of the blockedfileextention property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getBlockedfileextention() {
        return blockedfileextention;
    }

    /**
     * Sets the value of the blockedfileextention property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setBlockedfileextention(EntityStateStringType value) {
        this.blockedfileextention = value;
    }

    /**
     * Gets the value of the defaultquotatemplate property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getDefaultquotatemplate() {
        return defaultquotatemplate;
    }

    /**
     * Sets the value of the defaultquotatemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setDefaultquotatemplate(EntityStateStringType value) {
        this.defaultquotatemplate = value;
    }

    /**
     * Gets the value of the externalworkflowparticipantsenabled property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getExternalworkflowparticipantsenabled() {
        return externalworkflowparticipantsenabled;
    }

    /**
     * Sets the value of the externalworkflowparticipantsenabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setExternalworkflowparticipantsenabled(EntityStateBoolType value) {
        this.externalworkflowparticipantsenabled = value;
    }

    /**
     * Gets the value of the recyclebinenabled property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getRecyclebinenabled() {
        return recyclebinenabled;
    }

    /**
     * Sets the value of the recyclebinenabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setRecyclebinenabled(EntityStateBoolType value) {
        this.recyclebinenabled = value;
    }

    /**
     * Gets the value of the automaticallydeleteunusedsitecollections property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAutomaticallydeleteunusedsitecollections() {
        return automaticallydeleteunusedsitecollections;
    }

    /**
     * Sets the value of the automaticallydeleteunusedsitecollections property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAutomaticallydeleteunusedsitecollections(EntityStateBoolType value) {
        this.automaticallydeleteunusedsitecollections = value;
    }

    /**
     * Gets the value of the selfservicesitecreationenabled property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSelfservicesitecreationenabled() {
        return selfservicesitecreationenabled;
    }

    /**
     * Sets the value of the selfservicesitecreationenabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSelfservicesitecreationenabled(EntityStateBoolType value) {
        this.selfservicesitecreationenabled = value;
    }

    /**
     * Gets the value of the secondstagerecyclebinquota property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getSecondstagerecyclebinquota() {
        return secondstagerecyclebinquota;
    }

    /**
     * Sets the value of the secondstagerecyclebinquota property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setSecondstagerecyclebinquota(EntityStateIntType value) {
        this.secondstagerecyclebinquota = value;
    }

    /**
     * Gets the value of the recyclebinretentionperiod property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getRecyclebinretentionperiod() {
        return recyclebinretentionperiod;
    }

    /**
     * Sets the value of the recyclebinretentionperiod property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setRecyclebinretentionperiod(EntityStateIntType value) {
        this.recyclebinretentionperiod = value;
    }

    /**
     * Gets the value of the outboundmailserverinstance property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getOutboundmailserverinstance() {
        return outboundmailserverinstance;
    }

    /**
     * Sets the value of the outboundmailserverinstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setOutboundmailserverinstance(EntityStateStringType value) {
        this.outboundmailserverinstance = value;
    }

    /**
     * Gets the value of the outboundmailsenderaddress property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getOutboundmailsenderaddress() {
        return outboundmailsenderaddress;
    }

    /**
     * Sets the value of the outboundmailsenderaddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setOutboundmailsenderaddress(EntityStateStringType value) {
        this.outboundmailsenderaddress = value;
    }

    /**
     * Gets the value of the outboundmailreplytoaddress property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getOutboundmailreplytoaddress() {
        return outboundmailreplytoaddress;
    }

    /**
     * Sets the value of the outboundmailreplytoaddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setOutboundmailreplytoaddress(EntityStateStringType value) {
        this.outboundmailreplytoaddress = value;
    }

    /**
     * Gets the value of the secvalexpires property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSecvalexpires() {
        return secvalexpires;
    }

    /**
     * Sets the value of the secvalexpires property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSecvalexpires(EntityStateBoolType value) {
        this.secvalexpires = value;
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
     * Gets the value of the isadministrationwebapplication property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getIsadministrationwebapplication() {
        return isadministrationwebapplication;
    }

    /**
     * Sets the value of the isadministrationwebapplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setIsadministrationwebapplication(EntityStateBoolType value) {
        this.isadministrationwebapplication = value;
    }

    /**
     * Gets the value of the applicationpoolname property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getApplicationpoolname() {
        return applicationpoolname;
    }

    /**
     * Sets the value of the applicationpoolname property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setApplicationpoolname(EntityStateStringType value) {
        this.applicationpoolname = value;
    }

    /**
     * Gets the value of the applicationpoolusername property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getApplicationpoolusername() {
        return applicationpoolusername;
    }

    /**
     * Sets the value of the applicationpoolusername property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setApplicationpoolusername(EntityStateStringType value) {
        this.applicationpoolusername = value;
    }

    /**
     * Gets the value of the openitems property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getOpenitems() {
        return openitems;
    }

    /**
     * Sets the value of the openitems property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setOpenitems(EntityStateBoolType value) {
        this.openitems = value;
    }

    /**
     * Gets the value of the addlistitems property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAddlistitems() {
        return addlistitems;
    }

    /**
     * Sets the value of the addlistitems property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAddlistitems(EntityStateBoolType value) {
        this.addlistitems = value;
    }

    /**
     * Gets the value of the approveitems property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getApproveitems() {
        return approveitems;
    }

    /**
     * Sets the value of the approveitems property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setApproveitems(EntityStateBoolType value) {
        this.approveitems = value;
    }

    /**
     * Gets the value of the deletelistitems property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getDeletelistitems() {
        return deletelistitems;
    }

    /**
     * Sets the value of the deletelistitems property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setDeletelistitems(EntityStateBoolType value) {
        this.deletelistitems = value;
    }

    /**
     * Gets the value of the deleteversions property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getDeleteversions() {
        return deleteversions;
    }

    /**
     * Sets the value of the deleteversions property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setDeleteversions(EntityStateBoolType value) {
        this.deleteversions = value;
    }

    /**
     * Gets the value of the editlistitems property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getEditlistitems() {
        return editlistitems;
    }

    /**
     * Sets the value of the editlistitems property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setEditlistitems(EntityStateBoolType value) {
        this.editlistitems = value;
    }

    /**
     * Gets the value of the managelists property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getManagelists() {
        return managelists;
    }

    /**
     * Sets the value of the managelists property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setManagelists(EntityStateBoolType value) {
        this.managelists = value;
    }

    /**
     * Gets the value of the viewversions property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getViewversions() {
        return viewversions;
    }

    /**
     * Sets the value of the viewversions property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setViewversions(EntityStateBoolType value) {
        this.viewversions = value;
    }

    /**
     * Gets the value of the viewlistitems property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getViewlistitems() {
        return viewlistitems;
    }

    /**
     * Sets the value of the viewlistitems property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setViewlistitems(EntityStateBoolType value) {
        this.viewlistitems = value;
    }

    /**
     * Gets the value of the cancelcheckout property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getCancelcheckout() {
        return cancelcheckout;
    }

    /**
     * Sets the value of the cancelcheckout property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setCancelcheckout(EntityStateBoolType value) {
        this.cancelcheckout = value;
    }

    /**
     * Gets the value of the createalerts property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getCreatealerts() {
        return createalerts;
    }

    /**
     * Sets the value of the createalerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setCreatealerts(EntityStateBoolType value) {
        this.createalerts = value;
    }

    /**
     * Gets the value of the viewformpages property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getViewformpages() {
        return viewformpages;
    }

    /**
     * Sets the value of the viewformpages property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setViewformpages(EntityStateBoolType value) {
        this.viewformpages = value;
    }

    /**
     * Gets the value of the viewpages property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getViewpages() {
        return viewpages;
    }

    /**
     * Sets the value of the viewpages property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setViewpages(EntityStateBoolType value) {
        this.viewpages = value;
    }

    /**
     * Gets the value of the addandcustomizepages property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAddandcustomizepages() {
        return addandcustomizepages;
    }

    /**
     * Sets the value of the addandcustomizepages property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAddandcustomizepages(EntityStateBoolType value) {
        this.addandcustomizepages = value;
    }

    /**
     * Gets the value of the applystylesheets property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getApplystylesheets() {
        return applystylesheets;
    }

    /**
     * Sets the value of the applystylesheets property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setApplystylesheets(EntityStateBoolType value) {
        this.applystylesheets = value;
    }

    /**
     * Gets the value of the applythemeandborder property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getApplythemeandborder() {
        return applythemeandborder;
    }

    /**
     * Sets the value of the applythemeandborder property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setApplythemeandborder(EntityStateBoolType value) {
        this.applythemeandborder = value;
    }

    /**
     * Gets the value of the browsedirectories property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getBrowsedirectories() {
        return browsedirectories;
    }

    /**
     * Sets the value of the browsedirectories property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setBrowsedirectories(EntityStateBoolType value) {
        this.browsedirectories = value;
    }

    /**
     * Gets the value of the browseuserinfo property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getBrowseuserinfo() {
        return browseuserinfo;
    }

    /**
     * Sets the value of the browseuserinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setBrowseuserinfo(EntityStateBoolType value) {
        this.browseuserinfo = value;
    }

    /**
     * Gets the value of the creategroups property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getCreategroups() {
        return creategroups;
    }

    /**
     * Sets the value of the creategroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setCreategroups(EntityStateBoolType value) {
        this.creategroups = value;
    }

    /**
     * Gets the value of the createsscsite property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getCreatesscsite() {
        return createsscsite;
    }

    /**
     * Sets the value of the createsscsite property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setCreatesscsite(EntityStateBoolType value) {
        this.createsscsite = value;
    }

    /**
     * Gets the value of the editmyuserinfo property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getEditmyuserinfo() {
        return editmyuserinfo;
    }

    /**
     * Sets the value of the editmyuserinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setEditmyuserinfo(EntityStateBoolType value) {
        this.editmyuserinfo = value;
    }

    /**
     * Gets the value of the enumeratepermissions property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getEnumeratepermissions() {
        return enumeratepermissions;
    }

    /**
     * Sets the value of the enumeratepermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setEnumeratepermissions(EntityStateBoolType value) {
        this.enumeratepermissions = value;
    }

    /**
     * Gets the value of the managealerts property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getManagealerts() {
        return managealerts;
    }

    /**
     * Sets the value of the managealerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setManagealerts(EntityStateBoolType value) {
        this.managealerts = value;
    }

    /**
     * Gets the value of the managepermissions property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getManagepermissions() {
        return managepermissions;
    }

    /**
     * Sets the value of the managepermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setManagepermissions(EntityStateBoolType value) {
        this.managepermissions = value;
    }

    /**
     * Gets the value of the managesubwebs property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getManagesubwebs() {
        return managesubwebs;
    }

    /**
     * Sets the value of the managesubwebs property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setManagesubwebs(EntityStateBoolType value) {
        this.managesubwebs = value;
    }

    /**
     * Gets the value of the manageweb property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getManageweb() {
        return manageweb;
    }

    /**
     * Sets the value of the manageweb property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setManageweb(EntityStateBoolType value) {
        this.manageweb = value;
    }

    /**
     * Gets the value of the open property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getOpen() {
        return open;
    }

    /**
     * Sets the value of the open property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setOpen(EntityStateBoolType value) {
        this.open = value;
    }

    /**
     * Gets the value of the useclientintegration property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getUseclientintegration() {
        return useclientintegration;
    }

    /**
     * Sets the value of the useclientintegration property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setUseclientintegration(EntityStateBoolType value) {
        this.useclientintegration = value;
    }

    /**
     * Gets the value of the useremoteapis property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getUseremoteapis() {
        return useremoteapis;
    }

    /**
     * Sets the value of the useremoteapis property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setUseremoteapis(EntityStateBoolType value) {
        this.useremoteapis = value;
    }

    /**
     * Gets the value of the viewusagedata property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getViewusagedata() {
        return viewusagedata;
    }

    /**
     * Sets the value of the viewusagedata property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setViewusagedata(EntityStateBoolType value) {
        this.viewusagedata = value;
    }

    /**
     * Gets the value of the managepersonalviews property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getManagepersonalviews() {
        return managepersonalviews;
    }

    /**
     * Sets the value of the managepersonalviews property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setManagepersonalviews(EntityStateBoolType value) {
        this.managepersonalviews = value;
    }

    /**
     * Gets the value of the adddelprivatewebparts property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAdddelprivatewebparts() {
        return adddelprivatewebparts;
    }

    /**
     * Sets the value of the adddelprivatewebparts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAdddelprivatewebparts(EntityStateBoolType value) {
        this.adddelprivatewebparts = value;
    }

    /**
     * Gets the value of the updatepersonalwebparts property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getUpdatepersonalwebparts() {
        return updatepersonalwebparts;
    }

    /**
     * Sets the value of the updatepersonalwebparts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setUpdatepersonalwebparts(EntityStateBoolType value) {
        this.updatepersonalwebparts = value;
    }

}
