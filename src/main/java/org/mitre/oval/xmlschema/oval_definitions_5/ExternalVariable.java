


package org.mitre.oval.xmlschema.oval_definitions_5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.mitre.org/XMLSchema/oval-definitions-5}VariableType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="possible_value" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}PossibleValueType"/>
 *         &lt;element name="possible_restriction" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}PossibleRestrictionType"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "possibleValueOrPossibleRestriction"
})
public class ExternalVariable
    extends VariableType
{

    @XmlElements({
        @XmlElement(name = "possible_value", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", type = PossibleValueType.class),
        @XmlElement(name = "possible_restriction", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", type = PossibleRestrictionType.class)
    })
    protected List<Object> possibleValueOrPossibleRestriction;

    /**
     * Gets the value of the possibleValueOrPossibleRestriction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the possibleValueOrPossibleRestriction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPossibleValueOrPossibleRestriction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PossibleValueType }
     * {@link PossibleRestrictionType }
     * 
     * 
     */
    public List<Object> getPossibleValueOrPossibleRestriction() {
        if (possibleValueOrPossibleRestriction == null) {
            possibleValueOrPossibleRestriction = new ArrayList<Object>();
        }
        return this.possibleValueOrPossibleRestriction;
    }

}
