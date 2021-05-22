


package org.mitre.oval.xmlschema.oval_definitions_5_android;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="ssid" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="bssid" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="auth_algorithms" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#android}EntityStateWifiAuthAlgorithmType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="group_ciphers" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#android}EntityStateWifiGroupCipherType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="key_management" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#android}EntityStateWifiKeyMgmtType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pairwise_ciphers" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#android}EntityStateWifiPairwiseCipherType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="protocols" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#android}EntityStateWifiProtocolType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hidden_ssid" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="network_id" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="current_status" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#android}EntityStateWifiCurrentStatusType" minOccurs="0"/>
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
    "ssid",
    "bssid",
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
public class WifinetworkState
    extends StateType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateStringType ssid;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateStringType bssid;
    @XmlElement(name = "auth_algorithms", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected List<EntityStateWifiAuthAlgorithmType> authAlgorithms;
    @XmlElement(name = "group_ciphers", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected List<EntityStateWifiGroupCipherType> groupCiphers;
    @XmlElement(name = "key_management", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected List<EntityStateWifiKeyMgmtType> keyManagement;
    @XmlElement(name = "pairwise_ciphers", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected List<EntityStateWifiPairwiseCipherType> pairwiseCiphers;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected List<EntityStateWifiProtocolType> protocols;
    @XmlElement(name = "hidden_ssid", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateBoolType hiddenSsid;
    @XmlElement(name = "network_id", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateIntType networkId;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateIntType priority;
    @XmlElement(name = "current_status", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateWifiCurrentStatusType currentStatus;

    /**
     * Gets the value of the ssid property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getSsid() {
        return ssid;
    }

    /**
     * Sets the value of the ssid property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setSsid(EntityStateStringType value) {
        this.ssid = value;
    }

    /**
     * Gets the value of the bssid property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getBssid() {
        return bssid;
    }

    /**
     * Sets the value of the bssid property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setBssid(EntityStateStringType value) {
        this.bssid = value;
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
     * {@link EntityStateWifiAuthAlgorithmType }
     * 
     * 
     */
    public List<EntityStateWifiAuthAlgorithmType> getAuthAlgorithms() {
        if (authAlgorithms == null) {
            authAlgorithms = new ArrayList<EntityStateWifiAuthAlgorithmType>();
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
     * {@link EntityStateWifiGroupCipherType }
     * 
     * 
     */
    public List<EntityStateWifiGroupCipherType> getGroupCiphers() {
        if (groupCiphers == null) {
            groupCiphers = new ArrayList<EntityStateWifiGroupCipherType>();
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
     * {@link EntityStateWifiKeyMgmtType }
     * 
     * 
     */
    public List<EntityStateWifiKeyMgmtType> getKeyManagement() {
        if (keyManagement == null) {
            keyManagement = new ArrayList<EntityStateWifiKeyMgmtType>();
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
     * {@link EntityStateWifiPairwiseCipherType }
     * 
     * 
     */
    public List<EntityStateWifiPairwiseCipherType> getPairwiseCiphers() {
        if (pairwiseCiphers == null) {
            pairwiseCiphers = new ArrayList<EntityStateWifiPairwiseCipherType>();
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
     * {@link EntityStateWifiProtocolType }
     * 
     * 
     */
    public List<EntityStateWifiProtocolType> getProtocols() {
        if (protocols == null) {
            protocols = new ArrayList<EntityStateWifiProtocolType>();
        }
        return this.protocols;
    }

    /**
     * Gets the value of the hiddenSsid property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getHiddenSsid() {
        return hiddenSsid;
    }

    /**
     * Sets the value of the hiddenSsid property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setHiddenSsid(EntityStateBoolType value) {
        this.hiddenSsid = value;
    }

    /**
     * Gets the value of the networkId property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getNetworkId() {
        return networkId;
    }

    /**
     * Sets the value of the networkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setNetworkId(EntityStateIntType value) {
        this.networkId = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setPriority(EntityStateIntType value) {
        this.priority = value;
    }

    /**
     * Gets the value of the currentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateWifiCurrentStatusType }
     *     
     */
    public EntityStateWifiCurrentStatusType getCurrentStatus() {
        return currentStatus;
    }

    /**
     * Sets the value of the currentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateWifiCurrentStatusType }
     *     
     */
    public void setCurrentStatus(EntityStateWifiCurrentStatusType value) {
        this.currentStatus = value;
    }

}
