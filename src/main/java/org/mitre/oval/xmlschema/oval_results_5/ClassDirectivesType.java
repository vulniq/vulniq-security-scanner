


package org.mitre.oval.xmlschema.oval_results_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_common_5.ClassEnumeration;


/**
 * The required class attribute allows a set of directives to be specified for each supported OVAL Definition class (See the definition of the oval:ClassEnumeration for more information about the supported classes). A set of class specific directives overrides the default directives for the specified definition class. A given class may be specified once.
 * 
 * <p>Java class for ClassDirectivesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassDirectivesType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.mitre.org/XMLSchema/oval-results-5}DirectivesType">
 *       &lt;attribute name="class" use="required" type="{http://oval.mitre.org/XMLSchema/oval-common-5}ClassEnumeration" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassDirectivesType", namespace = "http://oval.mitre.org/XMLSchema/oval-results-5")
public class ClassDirectivesType
    extends DirectivesType
{

    @XmlAttribute(name = "class", required = true)
    protected ClassEnumeration clazz;

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link ClassEnumeration }
     *     
     */
    public ClassEnumeration getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassEnumeration }
     *     
     */
    public void setClazz(ClassEnumeration value) {
        this.clazz = value;
    }

}
