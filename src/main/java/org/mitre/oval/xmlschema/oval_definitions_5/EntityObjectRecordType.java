


package org.mitre.oval.xmlschema.oval_definitions_5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Note that when the mask attribute is set to 'true', all child field elements must be masked regardless of the child field's mask attribute value.
 * 
 * <p>Java class for EntityObjectRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityObjectRecordType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityComplexBaseType">
 *       &lt;sequence>
 *         &lt;element name="field" type="{http://oval.mitre.org/XMLSchema/oval-definitions-5}EntityObjectFieldType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityObjectRecordType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5", propOrder = {
    "field"
})
public class EntityObjectRecordType
    extends EntityComplexBaseType
{

    @XmlElement(namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
    protected List<EntityObjectFieldType> field;

    /**
     * Gets the value of the field property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the field property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityObjectFieldType }
     * 
     * 
     */
    public List<EntityObjectFieldType> getField() {
        if (field == null) {
            field = new ArrayList<EntityObjectFieldType>();
        }
        return this.field;
    }

}
