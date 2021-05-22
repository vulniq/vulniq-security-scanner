


package org.mitre.oval.xmlschema.oval_system_characteristics_5_sharepoint;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemBoolType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemIntType;
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
 *         &lt;element name="webapplicationurl" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="allowparttopartcommunication" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="allowaccesstowebpartcatalog" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="blockedfileextention" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="defaultquotatemplate" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="externalworkflowparticipantsenabled" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="recyclebinenabled" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="automaticallydeleteunusedsitecollections" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="selfservicesitecreationenabled" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="secondstagerecyclebinquota" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="recyclebinretentionperiod" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="outboundmailserverinstance" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="outboundmailsenderaddress" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="outboundmailreplytoaddress" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="secvalexpires" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="timeout" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="isadministrationwebapplication" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="applicationpoolname" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="applicationpoolusername" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="openitems" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="addlistitems" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="approveitems" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="deletelistitems" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="deleteversions" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="editlistitems" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="managelists" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="viewversions" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="viewlistitems" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="cancelcheckout" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="createalerts" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="viewformpages" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="viewpages" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="addandcustomizepages" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="applystylesheets" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="applythemeandborder" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="browsedirectories" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="browseuserinfo" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="creategroups" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="createsscsite" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="editmyuserinfo" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="enumeratepermissions" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="managealerts" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="managepermissions" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="managesubwebs" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="manageweb" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="open" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="useclientintegration" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="useremoteapis" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="viewusagedata" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="managepersonalviews" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="adddelprivatewebparts" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="updatepersonalwebparts" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
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
public class SpwebapplicationItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemStringType webapplicationurl;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType allowparttopartcommunication;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType allowaccesstowebpartcatalog;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected List<EntityItemStringType> blockedfileextention;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemStringType defaultquotatemplate;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType externalworkflowparticipantsenabled;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType recyclebinenabled;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType automaticallydeleteunusedsitecollections;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType selfservicesitecreationenabled;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemIntType secondstagerecyclebinquota;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemIntType recyclebinretentionperiod;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemStringType outboundmailserverinstance;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemStringType outboundmailsenderaddress;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemStringType outboundmailreplytoaddress;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType secvalexpires;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemIntType timeout;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType isadministrationwebapplication;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemStringType applicationpoolname;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemStringType applicationpoolusername;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType openitems;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType addlistitems;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType approveitems;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType deletelistitems;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType deleteversions;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType editlistitems;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType managelists;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType viewversions;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType viewlistitems;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType cancelcheckout;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType createalerts;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType viewformpages;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType viewpages;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType addandcustomizepages;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType applystylesheets;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType applythemeandborder;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType browsedirectories;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType browseuserinfo;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType creategroups;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType createsscsite;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType editmyuserinfo;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType enumeratepermissions;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType managealerts;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType managepermissions;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType managesubwebs;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType manageweb;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType open;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType useclientintegration;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType useremoteapis;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType viewusagedata;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType managepersonalviews;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType adddelprivatewebparts;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#sharepoint")
    protected EntityItemBoolType updatepersonalwebparts;

    /**
     * Gets the value of the webapplicationurl property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getWebapplicationurl() {
        return webapplicationurl;
    }

    /**
     * Sets the value of the webapplicationurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setWebapplicationurl(EntityItemStringType value) {
        this.webapplicationurl = value;
    }

    /**
     * Gets the value of the allowparttopartcommunication property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowparttopartcommunication() {
        return allowparttopartcommunication;
    }

    /**
     * Sets the value of the allowparttopartcommunication property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowparttopartcommunication(EntityItemBoolType value) {
        this.allowparttopartcommunication = value;
    }

    /**
     * Gets the value of the allowaccesstowebpartcatalog property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAllowaccesstowebpartcatalog() {
        return allowaccesstowebpartcatalog;
    }

    /**
     * Sets the value of the allowaccesstowebpartcatalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAllowaccesstowebpartcatalog(EntityItemBoolType value) {
        this.allowaccesstowebpartcatalog = value;
    }

    /**
     * Gets the value of the blockedfileextention property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blockedfileextention property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlockedfileextention().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemStringType }
     * 
     * 
     */
    public List<EntityItemStringType> getBlockedfileextention() {
        if (blockedfileextention == null) {
            blockedfileextention = new ArrayList<EntityItemStringType>();
        }
        return this.blockedfileextention;
    }

    /**
     * Gets the value of the defaultquotatemplate property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getDefaultquotatemplate() {
        return defaultquotatemplate;
    }

    /**
     * Sets the value of the defaultquotatemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setDefaultquotatemplate(EntityItemStringType value) {
        this.defaultquotatemplate = value;
    }

    /**
     * Gets the value of the externalworkflowparticipantsenabled property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getExternalworkflowparticipantsenabled() {
        return externalworkflowparticipantsenabled;
    }

    /**
     * Sets the value of the externalworkflowparticipantsenabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setExternalworkflowparticipantsenabled(EntityItemBoolType value) {
        this.externalworkflowparticipantsenabled = value;
    }

    /**
     * Gets the value of the recyclebinenabled property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getRecyclebinenabled() {
        return recyclebinenabled;
    }

    /**
     * Sets the value of the recyclebinenabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setRecyclebinenabled(EntityItemBoolType value) {
        this.recyclebinenabled = value;
    }

    /**
     * Gets the value of the automaticallydeleteunusedsitecollections property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAutomaticallydeleteunusedsitecollections() {
        return automaticallydeleteunusedsitecollections;
    }

    /**
     * Sets the value of the automaticallydeleteunusedsitecollections property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAutomaticallydeleteunusedsitecollections(EntityItemBoolType value) {
        this.automaticallydeleteunusedsitecollections = value;
    }

    /**
     * Gets the value of the selfservicesitecreationenabled property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSelfservicesitecreationenabled() {
        return selfservicesitecreationenabled;
    }

    /**
     * Sets the value of the selfservicesitecreationenabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSelfservicesitecreationenabled(EntityItemBoolType value) {
        this.selfservicesitecreationenabled = value;
    }

    /**
     * Gets the value of the secondstagerecyclebinquota property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getSecondstagerecyclebinquota() {
        return secondstagerecyclebinquota;
    }

    /**
     * Sets the value of the secondstagerecyclebinquota property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setSecondstagerecyclebinquota(EntityItemIntType value) {
        this.secondstagerecyclebinquota = value;
    }

    /**
     * Gets the value of the recyclebinretentionperiod property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getRecyclebinretentionperiod() {
        return recyclebinretentionperiod;
    }

    /**
     * Sets the value of the recyclebinretentionperiod property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setRecyclebinretentionperiod(EntityItemIntType value) {
        this.recyclebinretentionperiod = value;
    }

    /**
     * Gets the value of the outboundmailserverinstance property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getOutboundmailserverinstance() {
        return outboundmailserverinstance;
    }

    /**
     * Sets the value of the outboundmailserverinstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setOutboundmailserverinstance(EntityItemStringType value) {
        this.outboundmailserverinstance = value;
    }

    /**
     * Gets the value of the outboundmailsenderaddress property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getOutboundmailsenderaddress() {
        return outboundmailsenderaddress;
    }

    /**
     * Sets the value of the outboundmailsenderaddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setOutboundmailsenderaddress(EntityItemStringType value) {
        this.outboundmailsenderaddress = value;
    }

    /**
     * Gets the value of the outboundmailreplytoaddress property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getOutboundmailreplytoaddress() {
        return outboundmailreplytoaddress;
    }

    /**
     * Sets the value of the outboundmailreplytoaddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setOutboundmailreplytoaddress(EntityItemStringType value) {
        this.outboundmailreplytoaddress = value;
    }

    /**
     * Gets the value of the secvalexpires property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSecvalexpires() {
        return secvalexpires;
    }

    /**
     * Sets the value of the secvalexpires property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSecvalexpires(EntityItemBoolType value) {
        this.secvalexpires = value;
    }

    /**
     * Gets the value of the timeout property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getTimeout() {
        return timeout;
    }

    /**
     * Sets the value of the timeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setTimeout(EntityItemIntType value) {
        this.timeout = value;
    }

    /**
     * Gets the value of the isadministrationwebapplication property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getIsadministrationwebapplication() {
        return isadministrationwebapplication;
    }

    /**
     * Sets the value of the isadministrationwebapplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setIsadministrationwebapplication(EntityItemBoolType value) {
        this.isadministrationwebapplication = value;
    }

    /**
     * Gets the value of the applicationpoolname property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getApplicationpoolname() {
        return applicationpoolname;
    }

    /**
     * Sets the value of the applicationpoolname property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setApplicationpoolname(EntityItemStringType value) {
        this.applicationpoolname = value;
    }

    /**
     * Gets the value of the applicationpoolusername property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getApplicationpoolusername() {
        return applicationpoolusername;
    }

    /**
     * Sets the value of the applicationpoolusername property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setApplicationpoolusername(EntityItemStringType value) {
        this.applicationpoolusername = value;
    }

    /**
     * Gets the value of the openitems property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getOpenitems() {
        return openitems;
    }

    /**
     * Sets the value of the openitems property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setOpenitems(EntityItemBoolType value) {
        this.openitems = value;
    }

    /**
     * Gets the value of the addlistitems property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAddlistitems() {
        return addlistitems;
    }

    /**
     * Sets the value of the addlistitems property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAddlistitems(EntityItemBoolType value) {
        this.addlistitems = value;
    }

    /**
     * Gets the value of the approveitems property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getApproveitems() {
        return approveitems;
    }

    /**
     * Sets the value of the approveitems property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setApproveitems(EntityItemBoolType value) {
        this.approveitems = value;
    }

    /**
     * Gets the value of the deletelistitems property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getDeletelistitems() {
        return deletelistitems;
    }

    /**
     * Sets the value of the deletelistitems property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setDeletelistitems(EntityItemBoolType value) {
        this.deletelistitems = value;
    }

    /**
     * Gets the value of the deleteversions property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getDeleteversions() {
        return deleteversions;
    }

    /**
     * Sets the value of the deleteversions property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setDeleteversions(EntityItemBoolType value) {
        this.deleteversions = value;
    }

    /**
     * Gets the value of the editlistitems property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getEditlistitems() {
        return editlistitems;
    }

    /**
     * Sets the value of the editlistitems property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setEditlistitems(EntityItemBoolType value) {
        this.editlistitems = value;
    }

    /**
     * Gets the value of the managelists property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getManagelists() {
        return managelists;
    }

    /**
     * Sets the value of the managelists property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setManagelists(EntityItemBoolType value) {
        this.managelists = value;
    }

    /**
     * Gets the value of the viewversions property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getViewversions() {
        return viewversions;
    }

    /**
     * Sets the value of the viewversions property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setViewversions(EntityItemBoolType value) {
        this.viewversions = value;
    }

    /**
     * Gets the value of the viewlistitems property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getViewlistitems() {
        return viewlistitems;
    }

    /**
     * Sets the value of the viewlistitems property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setViewlistitems(EntityItemBoolType value) {
        this.viewlistitems = value;
    }

    /**
     * Gets the value of the cancelcheckout property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getCancelcheckout() {
        return cancelcheckout;
    }

    /**
     * Sets the value of the cancelcheckout property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setCancelcheckout(EntityItemBoolType value) {
        this.cancelcheckout = value;
    }

    /**
     * Gets the value of the createalerts property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getCreatealerts() {
        return createalerts;
    }

    /**
     * Sets the value of the createalerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setCreatealerts(EntityItemBoolType value) {
        this.createalerts = value;
    }

    /**
     * Gets the value of the viewformpages property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getViewformpages() {
        return viewformpages;
    }

    /**
     * Sets the value of the viewformpages property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setViewformpages(EntityItemBoolType value) {
        this.viewformpages = value;
    }

    /**
     * Gets the value of the viewpages property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getViewpages() {
        return viewpages;
    }

    /**
     * Sets the value of the viewpages property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setViewpages(EntityItemBoolType value) {
        this.viewpages = value;
    }

    /**
     * Gets the value of the addandcustomizepages property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAddandcustomizepages() {
        return addandcustomizepages;
    }

    /**
     * Sets the value of the addandcustomizepages property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAddandcustomizepages(EntityItemBoolType value) {
        this.addandcustomizepages = value;
    }

    /**
     * Gets the value of the applystylesheets property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getApplystylesheets() {
        return applystylesheets;
    }

    /**
     * Sets the value of the applystylesheets property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setApplystylesheets(EntityItemBoolType value) {
        this.applystylesheets = value;
    }

    /**
     * Gets the value of the applythemeandborder property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getApplythemeandborder() {
        return applythemeandborder;
    }

    /**
     * Sets the value of the applythemeandborder property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setApplythemeandborder(EntityItemBoolType value) {
        this.applythemeandborder = value;
    }

    /**
     * Gets the value of the browsedirectories property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getBrowsedirectories() {
        return browsedirectories;
    }

    /**
     * Sets the value of the browsedirectories property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setBrowsedirectories(EntityItemBoolType value) {
        this.browsedirectories = value;
    }

    /**
     * Gets the value of the browseuserinfo property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getBrowseuserinfo() {
        return browseuserinfo;
    }

    /**
     * Sets the value of the browseuserinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setBrowseuserinfo(EntityItemBoolType value) {
        this.browseuserinfo = value;
    }

    /**
     * Gets the value of the creategroups property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getCreategroups() {
        return creategroups;
    }

    /**
     * Sets the value of the creategroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setCreategroups(EntityItemBoolType value) {
        this.creategroups = value;
    }

    /**
     * Gets the value of the createsscsite property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getCreatesscsite() {
        return createsscsite;
    }

    /**
     * Sets the value of the createsscsite property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setCreatesscsite(EntityItemBoolType value) {
        this.createsscsite = value;
    }

    /**
     * Gets the value of the editmyuserinfo property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getEditmyuserinfo() {
        return editmyuserinfo;
    }

    /**
     * Sets the value of the editmyuserinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setEditmyuserinfo(EntityItemBoolType value) {
        this.editmyuserinfo = value;
    }

    /**
     * Gets the value of the enumeratepermissions property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getEnumeratepermissions() {
        return enumeratepermissions;
    }

    /**
     * Sets the value of the enumeratepermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setEnumeratepermissions(EntityItemBoolType value) {
        this.enumeratepermissions = value;
    }

    /**
     * Gets the value of the managealerts property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getManagealerts() {
        return managealerts;
    }

    /**
     * Sets the value of the managealerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setManagealerts(EntityItemBoolType value) {
        this.managealerts = value;
    }

    /**
     * Gets the value of the managepermissions property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getManagepermissions() {
        return managepermissions;
    }

    /**
     * Sets the value of the managepermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setManagepermissions(EntityItemBoolType value) {
        this.managepermissions = value;
    }

    /**
     * Gets the value of the managesubwebs property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getManagesubwebs() {
        return managesubwebs;
    }

    /**
     * Sets the value of the managesubwebs property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setManagesubwebs(EntityItemBoolType value) {
        this.managesubwebs = value;
    }

    /**
     * Gets the value of the manageweb property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getManageweb() {
        return manageweb;
    }

    /**
     * Sets the value of the manageweb property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setManageweb(EntityItemBoolType value) {
        this.manageweb = value;
    }

    /**
     * Gets the value of the open property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getOpen() {
        return open;
    }

    /**
     * Sets the value of the open property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setOpen(EntityItemBoolType value) {
        this.open = value;
    }

    /**
     * Gets the value of the useclientintegration property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getUseclientintegration() {
        return useclientintegration;
    }

    /**
     * Sets the value of the useclientintegration property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setUseclientintegration(EntityItemBoolType value) {
        this.useclientintegration = value;
    }

    /**
     * Gets the value of the useremoteapis property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getUseremoteapis() {
        return useremoteapis;
    }

    /**
     * Sets the value of the useremoteapis property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setUseremoteapis(EntityItemBoolType value) {
        this.useremoteapis = value;
    }

    /**
     * Gets the value of the viewusagedata property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getViewusagedata() {
        return viewusagedata;
    }

    /**
     * Sets the value of the viewusagedata property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setViewusagedata(EntityItemBoolType value) {
        this.viewusagedata = value;
    }

    /**
     * Gets the value of the managepersonalviews property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getManagepersonalviews() {
        return managepersonalviews;
    }

    /**
     * Sets the value of the managepersonalviews property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setManagepersonalviews(EntityItemBoolType value) {
        this.managepersonalviews = value;
    }

    /**
     * Gets the value of the adddelprivatewebparts property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAdddelprivatewebparts() {
        return adddelprivatewebparts;
    }

    /**
     * Sets the value of the adddelprivatewebparts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAdddelprivatewebparts(EntityItemBoolType value) {
        this.adddelprivatewebparts = value;
    }

    /**
     * Gets the value of the updatepersonalwebparts property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getUpdatepersonalwebparts() {
        return updatepersonalwebparts;
    }

    /**
     * Sets the value of the updatepersonalwebparts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setUpdatepersonalwebparts(EntityItemBoolType value) {
        this.updatepersonalwebparts = value;
    }

}
