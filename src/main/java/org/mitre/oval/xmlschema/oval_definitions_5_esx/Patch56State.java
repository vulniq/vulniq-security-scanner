


package org.mitre.oval.xmlschema.oval_definitions_5_esx;

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
 *         &lt;element name="patch_name" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="knowledge_base_id" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="bundle_id" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateIntType" minOccurs="0"/>
 *         &lt;element name="classification" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#esx}EntityStateClassificationType" minOccurs="0"/>
 *         &lt;element name="support_level" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5#esx}EntityStateSupportLevelType" minOccurs="0"/>
 *         &lt;element name="status" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
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
    "patchName",
    "knowledgeBaseId",
    "bundleId",
    "classification",
    "supportLevel",
    "status"
})
public class Patch56State
    extends StateType
{

    @XmlElement(name = "patch_name", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#esx")
    protected EntityStateStringType patchName;
    @XmlElement(name = "knowledge_base_id", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#esx")
    protected EntityStateIntType knowledgeBaseId;
    @XmlElement(name = "bundle_id", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#esx")
    protected EntityStateIntType bundleId;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#esx")
    protected EntityStateClassificationType classification;
    @XmlElement(name = "support_level", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#esx")
    protected EntityStateSupportLevelType supportLevel;
    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#esx")
    protected EntityStateBoolType status;

    /**
     * Gets the value of the patchName property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getPatchName() {
        return patchName;
    }

    /**
     * Sets the value of the patchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setPatchName(EntityStateStringType value) {
        this.patchName = value;
    }

    /**
     * Gets the value of the knowledgeBaseId property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getKnowledgeBaseId() {
        return knowledgeBaseId;
    }

    /**
     * Sets the value of the knowledgeBaseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setKnowledgeBaseId(EntityStateIntType value) {
        this.knowledgeBaseId = value;
    }

    /**
     * Gets the value of the bundleId property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateIntType }
     *     
     */
    public EntityStateIntType getBundleId() {
        return bundleId;
    }

    /**
     * Sets the value of the bundleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateIntType }
     *     
     */
    public void setBundleId(EntityStateIntType value) {
        this.bundleId = value;
    }

    /**
     * Gets the value of the classification property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateClassificationType }
     *     
     */
    public EntityStateClassificationType getClassification() {
        return classification;
    }

    /**
     * Sets the value of the classification property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateClassificationType }
     *     
     */
    public void setClassification(EntityStateClassificationType value) {
        this.classification = value;
    }

    /**
     * Gets the value of the supportLevel property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateSupportLevelType }
     *     
     */
    public EntityStateSupportLevelType getSupportLevel() {
        return supportLevel;
    }

    /**
     * Sets the value of the supportLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateSupportLevelType }
     *     
     */
    public void setSupportLevel(EntityStateSupportLevelType value) {
        this.supportLevel = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setStatus(EntityStateBoolType value) {
        this.status = value;
    }

}
