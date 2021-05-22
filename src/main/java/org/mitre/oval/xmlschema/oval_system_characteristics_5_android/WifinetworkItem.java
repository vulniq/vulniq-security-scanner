


package org.mitre.oval.xmlschema.oval_system_characteristics_5_android;

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
 *         &lt;element name="bssid" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="ssid" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="auth_algorithms" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android}EntityItemWifiAuthAlgorithmType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="group_ciphers" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android}EntityItemWifiGroupCipherType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="key_management" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android}EntityItemWifiKeyMgmtType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pairwise_ciphers" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android}EntityItemWifiPairwiseCipherType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="protocols" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android}EntityItemWifiProtocolType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hidden_ssid" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="network_id" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemIntType" minOccurs="0"/>
 *         &lt;element name="current_status" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android}EntityItemWifiCurrentStatusType" minOccurs="0"/>
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
    "bssid",
    "ssid",
    "authAlgorithms",
    "groupCiphers",
    "keyManagement",
    "pairwiseCiphers",
    "protocols",
    "hiddenSsid",
    "networkId",
    "priority",
    "currentStatus"
})
public class WifinetworkItem
    extends ItemType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected EntityItemStringType bssid;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected EntityItemStringType ssid;
    @XmlElement(name = "auth_algorithms", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected List<EntityItemWifiAuthAlgorithmType> authAlgorithms;
    @XmlElement(name = "group_ciphers", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected List<EntityItemWifiGroupCipherType> groupCiphers;
    @XmlElement(name = "key_management", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected List<EntityItemWifiKeyMgmtType> keyManagement;
    @XmlElement(name = "pairwise_ciphers", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected List<EntityItemWifiPairwiseCipherType> pairwiseCiphers;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected List<EntityItemWifiProtocolType> protocols;
    @XmlElement(name = "hidden_ssid", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected EntityItemBoolType hiddenSsid;
    @XmlElement(name = "network_id", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected EntityItemIntType networkId;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected EntityItemIntType priority;
    @XmlElement(name = "current_status", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#android")
    protected EntityItemWifiCurrentStatusType currentStatus;

    /**
     * Gets the value of the bssid property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getBssid() {
        return bssid;
    }

    /**
     * Sets the value of the bssid property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setBssid(EntityItemStringType value) {
        this.bssid = value;
    }

    /**
     * Gets the value of the ssid property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getSsid() {
        return ssid;
    }

    /**
     * Sets the value of the ssid property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setSsid(EntityItemStringType value) {
        this.ssid = value;
    }

    /**
     * Gets the value of the authAlgorithms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authAlgorithms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthAlgorithms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemWifiAuthAlgorithmType }
     * 
     * 
     */
    public List<EntityItemWifiAuthAlgorithmType> getAuthAlgorithms() {
        if (authAlgorithms == null) {
            authAlgorithms = new ArrayList<EntityItemWifiAuthAlgorithmType>();
        }
        return this.authAlgorithms;
    }

    /**
     * Gets the value of the groupCiphers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupCiphers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupCiphers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemWifiGroupCipherType }
     * 
     * 
     */
    public List<EntityItemWifiGroupCipherType> getGroupCiphers() {
        if (groupCiphers == null) {
            groupCiphers = new ArrayList<EntityItemWifiGroupCipherType>();
        }
        return this.groupCiphers;
    }

    /**
     * Gets the value of the keyManagement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyManagement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyManagement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemWifiKeyMgmtType }
     * 
     * 
     */
    public List<EntityItemWifiKeyMgmtType> getKeyManagement() {
        if (keyManagement == null) {
            keyManagement = new ArrayList<EntityItemWifiKeyMgmtType>();
        }
        return this.keyManagement;
    }

    /**
     * Gets the value of the pairwiseCiphers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pairwiseCiphers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPairwiseCiphers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemWifiPairwiseCipherType }
     * 
     * 
     */
    public List<EntityItemWifiPairwiseCipherType> getPairwiseCiphers() {
        if (pairwiseCiphers == null) {
            pairwiseCiphers = new ArrayList<EntityItemWifiPairwiseCipherType>();
        }
        return this.pairwiseCiphers;
    }

    /**
     * Gets the value of the protocols property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the protocols property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProtocols().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityItemWifiProtocolType }
     * 
     * 
     */
    public List<EntityItemWifiProtocolType> getProtocols() {
        if (protocols == null) {
            protocols = new ArrayList<EntityItemWifiProtocolType>();
        }
        return this.protocols;
    }

    /**
     * Gets the value of the hiddenSsid property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getHiddenSsid() {
        return hiddenSsid;
    }

    /**
     * Sets the value of the hiddenSsid property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setHiddenSsid(EntityItemBoolType value) {
        this.hiddenSsid = value;
    }

    /**
     * Gets the value of the networkId property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getNetworkId() {
        return networkId;
    }

    /**
     * Sets the value of the networkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setNetworkId(EntityItemIntType value) {
        this.networkId = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemIntType }
     *     
     */
    public EntityItemIntType getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemIntType }
     *     
     */
    public void setPriority(EntityItemIntType value) {
        this.priority = value;
    }

    /**
     * Gets the value of the currentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemWifiCurrentStatusType }
     *     
     */
    public EntityItemWifiCurrentStatusType getCurrentStatus() {
        return currentStatus;
    }

    /**
     * Sets the value of the currentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemWifiCurrentStatusType }
     *     
     */
    public void setCurrentStatus(EntityItemWifiCurrentStatusType value) {
        this.currentStatus = value;
    }

}
