


package org.mitre.oval.xmlschema.oval_system_characteristics_5_windows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_system_characteristics_5.EntityItemBoolType;
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
 *         &lt;element name="admin_approval_mode" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="elevation_prompt_admin" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="elevation_prompt_standard" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemStringType" minOccurs="0"/>
 *         &lt;element name="detect_installations" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="elevate_signed_executables" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="elevate_uiaccess" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="run_admins_aam" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="secure_desktop" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
 *         &lt;element name="virtualize_write_failures" type="{http://oval.mitre.org/XMLSchema/oval-system-characteristics-5}EntityItemBoolType" minOccurs="0"/>
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
    "adminApprovalMode",
    "elevationPromptAdmin",
    "elevationPromptStandard",
    "detectInstallations",
    "elevateSignedExecutables",
    "elevateUiaccess",
    "runAdminsAam",
    "secureDesktop",
    "virtualizeWriteFailures"
})
public class UacItem
    extends ItemType
{

    @XmlElement(name = "admin_approval_mode", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType adminApprovalMode;
    @XmlElement(name = "elevation_prompt_admin", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemStringType elevationPromptAdmin;
    @XmlElement(name = "elevation_prompt_standard", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemStringType elevationPromptStandard;
    @XmlElement(name = "detect_installations", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType detectInstallations;
    @XmlElement(name = "elevate_signed_executables", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType elevateSignedExecutables;
    @XmlElement(name = "elevate_uiaccess", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType elevateUiaccess;
    @XmlElement(name = "run_admins_aam", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType runAdminsAam;
    @XmlElement(name = "secure_desktop", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType secureDesktop;
    @XmlElement(name = "virtualize_write_failures", namespace = "http://oval.mitre.org/XMLSchema/oval-system-characteristics-5#windows")
    protected EntityItemBoolType virtualizeWriteFailures;

    /**
     * Gets the value of the adminApprovalMode property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getAdminApprovalMode() {
        return adminApprovalMode;
    }

    /**
     * Sets the value of the adminApprovalMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setAdminApprovalMode(EntityItemBoolType value) {
        this.adminApprovalMode = value;
    }

    /**
     * Gets the value of the elevationPromptAdmin property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getElevationPromptAdmin() {
        return elevationPromptAdmin;
    }

    /**
     * Sets the value of the elevationPromptAdmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setElevationPromptAdmin(EntityItemStringType value) {
        this.elevationPromptAdmin = value;
    }

    /**
     * Gets the value of the elevationPromptStandard property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemStringType }
     *     
     */
    public EntityItemStringType getElevationPromptStandard() {
        return elevationPromptStandard;
    }

    /**
     * Sets the value of the elevationPromptStandard property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemStringType }
     *     
     */
    public void setElevationPromptStandard(EntityItemStringType value) {
        this.elevationPromptStandard = value;
    }

    /**
     * Gets the value of the detectInstallations property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getDetectInstallations() {
        return detectInstallations;
    }

    /**
     * Sets the value of the detectInstallations property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setDetectInstallations(EntityItemBoolType value) {
        this.detectInstallations = value;
    }

    /**
     * Gets the value of the elevateSignedExecutables property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getElevateSignedExecutables() {
        return elevateSignedExecutables;
    }

    /**
     * Sets the value of the elevateSignedExecutables property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setElevateSignedExecutables(EntityItemBoolType value) {
        this.elevateSignedExecutables = value;
    }

    /**
     * Gets the value of the elevateUiaccess property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getElevateUiaccess() {
        return elevateUiaccess;
    }

    /**
     * Sets the value of the elevateUiaccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setElevateUiaccess(EntityItemBoolType value) {
        this.elevateUiaccess = value;
    }

    /**
     * Gets the value of the runAdminsAam property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getRunAdminsAam() {
        return runAdminsAam;
    }

    /**
     * Sets the value of the runAdminsAam property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setRunAdminsAam(EntityItemBoolType value) {
        this.runAdminsAam = value;
    }

    /**
     * Gets the value of the secureDesktop property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getSecureDesktop() {
        return secureDesktop;
    }

    /**
     * Sets the value of the secureDesktop property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setSecureDesktop(EntityItemBoolType value) {
        this.secureDesktop = value;
    }

    /**
     * Gets the value of the virtualizeWriteFailures property.
     * 
     * @return
     *     possible object is
     *     {@link EntityItemBoolType }
     *     
     */
    public EntityItemBoolType getVirtualizeWriteFailures() {
        return virtualizeWriteFailures;
    }

    /**
     * Sets the value of the virtualizeWriteFailures property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityItemBoolType }
     *     
     */
    public void setVirtualizeWriteFailures(EntityItemBoolType value) {
        this.virtualizeWriteFailures = value;
    }

}
