


package org.mitre.oval.xmlschema.oval_definitions_5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * The VariablesType complex type is a container for one or more variable child elements. Each variable element is a way to define one or more values to be obtained at the time a definition is evaluated.
 * 
 * <p>Java class for VariablesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VariablesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://oval.mitre.org/XMLSchema/oval-definitions-5}variable" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariablesType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", propOrder = {
    "variable"
})
public class VariablesType {

    @XmlElementRef(name = "variable", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", type = JAXBElement.class)
    protected List<JAXBElement<? extends VariableType>> variable;

    /**
     * Gets the value of the variable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ExternalVariable }{@code >}
     * {@link JAXBElement }{@code <}{@link ConstantVariable }{@code >}
     * {@link JAXBElement }{@code <}{@link LocalVariable }{@code >}
     * {@link JAXBElement }{@code <}{@link VariableType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends VariableType>> getVariable() {
        if (variable == null) {
            variable = new ArrayList<JAXBElement<? extends VariableType>>();
        }
        return this.variable;
    }

}
