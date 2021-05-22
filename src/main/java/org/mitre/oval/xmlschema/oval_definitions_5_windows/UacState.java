


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
 *         &lt;element name="admin_approval_mode" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="elevation_prompt_admin" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="elevation_prompt_standard" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateStringType" minOccurs="0"/>
 *         &lt;element name="detect_installations" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="elevate_signed_executables" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="elevate_uiaccess" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="run_admins_aam" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="secure_desktop" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
 *         &lt;element name="virtualize_write_failures" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
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
public class UacState
    extends StateType
{

    @XmlElement(name = "admin_approval_mode", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType adminApprovalMode;
    @XmlElement(name = "elevation_prompt_admin", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateStringType elevationPromptAdmin;
    @XmlElement(name = "elevation_prompt_standard", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateStringType elevationPromptStandard;
    @XmlElement(name = "detect_installations", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType detectInstallations;
    @XmlElement(name = "elevate_signed_executables", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType elevateSignedExecutables;
    @XmlElement(name = "elevate_uiaccess", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType elevateUiaccess;
    @XmlElement(name = "run_admins_aam", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType runAdminsAam;
    @XmlElement(name = "secure_desktop", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType secureDesktop;
    @XmlElement(name = "virtualize_write_failures", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#windows")
    protected EntityStateBoolType virtualizeWriteFailures;

    /**
     * Gets the value of the adminApprovalMode property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getAdminApprovalMode() {
        return adminApprovalMode;
    }

    /**
     * Sets the value of the adminApprovalMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setAdminApprovalMode(EntityStateBoolType value) {
        this.adminApprovalMode = value;
    }

    /**
     * Gets the value of the elevationPromptAdmin property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getElevationPromptAdmin() {
        return elevationPromptAdmin;
    }

    /**
     * Sets the value of the elevationPromptAdmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setElevationPromptAdmin(EntityStateStringType value) {
        this.elevationPromptAdmin = value;
    }

    /**
     * Gets the value of the elevationPromptStandard property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateStringType }
     *     
     */
    public EntityStateStringType getElevationPromptStandard() {
        return elevationPromptStandard;
    }

    /**
     * Sets the value of the elevationPromptStandard property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateStringType }
     *     
     */
    public void setElevationPromptStandard(EntityStateStringType value) {
        this.elevationPromptStandard = value;
    }

    /**
     * Gets the value of the detectInstallations property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getDetectInstallations() {
        return detectInstallations;
    }

    /**
     * Sets the value of the detectInstallations property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setDetectInstallations(EntityStateBoolType value) {
        this.detectInstallations = value;
    }

    /**
     * Gets the value of the elevateSignedExecutables property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getElevateSignedExecutables() {
        return elevateSignedExecutables;
    }

    /**
     * Sets the value of the elevateSignedExecutables property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setElevateSignedExecutables(EntityStateBoolType value) {
        this.elevateSignedExecutables = value;
    }

    /**
     * Gets the value of the elevateUiaccess property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getElevateUiaccess() {
        return elevateUiaccess;
    }

    /**
     * Sets the value of the elevateUiaccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setElevateUiaccess(EntityStateBoolType value) {
        this.elevateUiaccess = value;
    }

    /**
     * Gets the value of the runAdminsAam property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getRunAdminsAam() {
        return runAdminsAam;
    }

    /**
     * Sets the value of the runAdminsAam property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setRunAdminsAam(EntityStateBoolType value) {
        this.runAdminsAam = value;
    }

    /**
     * Gets the value of the secureDesktop property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getSecureDesktop() {
        return secureDesktop;
    }

    /**
     * Sets the value of the secureDesktop property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setSecureDesktop(EntityStateBoolType value) {
        this.secureDesktop = value;
    }

    /**
     * Gets the value of the virtualizeWriteFailures property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getVirtualizeWriteFailures() {
        return virtualizeWriteFailures;
    }

    /**
     * Sets the value of the virtualizeWriteFailures property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setVirtualizeWriteFailures(EntityStateBoolType value) {
        this.virtualizeWriteFailures = value;
    }

}
