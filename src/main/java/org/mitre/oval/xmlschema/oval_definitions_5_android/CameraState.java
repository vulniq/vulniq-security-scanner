


package org.mitre.oval.xmlschema.oval_definitions_5_android;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateBoolType;
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
 *         &lt;element name="camera_disabled_policy" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBoolType" minOccurs="0"/>
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
    "cameraDisabledPolicy"
})
public class CameraState
    extends StateType
{

    @XmlElement(name = "camera_disabled_policy", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected EntityStateBoolType cameraDisabledPolicy;

    /**
     * Gets the value of the cameraDisabledPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link EntityStateBoolType }
     *     
     */
    public EntityStateBoolType getCameraDisabledPolicy() {
        return cameraDisabledPolicy;
    }

    /**
     * Sets the value of the cameraDisabledPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityStateBoolType }
     *     
     */
    public void setCameraDisabledPolicy(EntityStateBoolType value) {
        this.cameraDisabledPolicy = value;
    }

}
