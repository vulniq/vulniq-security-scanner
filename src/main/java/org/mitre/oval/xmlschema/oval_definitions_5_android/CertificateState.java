


package org.mitre.oval.xmlschema.oval_definitions_5_android;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_definitions_5.EntityStateBinaryType;
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
 *         &lt;element name="trusted_certificate" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityStateBinaryType" maxOccurs="unbounded" minOccurs="0"/>
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
    "trustedCertificate"
})
public class CertificateState
    extends StateType
{

    @XmlElement(name = "trusted_certificate", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5#android")
    protected List<EntityStateBinaryType> trustedCertificate;

    /**
     * Gets the value of the trustedCertificate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trustedCertificate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrustedCertificate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityStateBinaryType }
     * 
     * 
     */
    public List<EntityStateBinaryType> getTrustedCertificate() {
        if (trustedCertificate == null) {
            trustedCertificate = new ArrayList<EntityStateBinaryType>();
        }
        return this.trustedCertificate;
    }

}
