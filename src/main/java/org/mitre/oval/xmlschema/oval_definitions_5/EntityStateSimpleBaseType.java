
package org.mitre.oval.xmlschema.oval_definitions_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.mitre.oval.xmlschema.oval_common_5.CheckEnumeration;
import org.mitre.oval.xmlschema.oval_common_5.ExistenceEnumeration;


/**
 * The entity_check and var_check attributes are considered together when evaluating a single state entity. When a variable identifies more than one value and multiple item entities with the same name exist, for a single state entity, a many-to-many comparison must be conducted.  In this situation, there are many values for the state entity that must be compared to many item entities.  Each item entity is compared to the state entity. For each item entity, an interim result is calculated by using the var_check attribute to combine the result of comparing each variable value with a single system value. Then these interim results are combined for each system value using the entity_check attribute.
 * 
 * <p>Java class for EntityStateSimpleBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityStateSimpleBaseType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://oval.mitre.org/XMLSchema/oval-definitions-5>EntitySimpleBaseType">
 *       &lt;attribute name="entity_check" type="{http://oval.mitre.org/XMLSchema/oval-common-5}CheckEnumeration" default="all" />
 *       &lt;attribute name="check_existence" type="{http://oval.mitre.org/XMLSchema/oval-common-5}ExistenceEnumeration" default="at_least_one_exists" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityStateSimpleBaseType", namespace = "http://oval.mitre.org/XMLSchema/oval-definitions-5")
@XmlSeeAlso({
    EntityStateIPAddressType.class,
    EntityStateDebianEVRStringType.class,
    EntityStateVersionType.class,
    EntityStateIOSVersionType.class,
    EntityStateFileSetRevisionType.class,
    EntityStateIntType.class,
    EntityStateFloatType.class,
    EntityStateBoolType.class,
    EntityStateEVRStringType.class,
    EntityStateBinaryType.class,
    EntityStateIPAddressStringType.class,
    EntityStateAnySimpleType.class,
    EntityStateStringType.class
})
public abstract class EntityStateSimpleBaseType
    extends EntitySimpleBaseType
{

    @XmlAttribute(name = "entity_check")
    protected CheckEnumeration entityCheck;
    @XmlAttribute(name = "check_existence")
    protected ExistenceEnumeration checkExistence;

    /**
     * Gets the value of the entityCheck property.
     * 
     * @return
     *     possible object is
     *     {@link CheckEnumeration }
     *     
     */
    public CheckEnumeration getEntityCheck() {
        if (entityCheck == null) {
            return CheckEnumeration.ALL;
        } else {
            return entityCheck;
        }
    }

    /**
     * Sets the value of the entityCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckEnumeration }
     *     
     */
    public void setEntityCheck(CheckEnumeration value) {
        this.entityCheck = value;
    }

    /**
     * Gets the value of the checkExistence property.
     * 
     * @return
     *     possible object is
     *     {@link ExistenceEnumeration }
     *     
     */
    public ExistenceEnumeration getCheckExistence() {
        if (checkExistence == null) {
            return ExistenceEnumeration.AT_LEAST_ONE_EXISTS;
        } else {
            return checkExistence;
        }
    }

    /**
     * Sets the value of the checkExistence property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExistenceEnumeration }
     *     
     */
    public void setCheckExistence(ExistenceEnumeration value) {
        this.checkExistence = value;
    }

}
