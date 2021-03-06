
package com.prime.jax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SM201010Roles complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SM201010Roles">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Selected" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="RoleName" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="RoleDescription" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="ServiceCommands" type="{http://www.acumatica.com/generic/}SM201010RolesServiceCommands" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SM201010Roles", propOrder = {
    "displayName",
    "selected",
    "roleName",
    "roleDescription",
    "serviceCommands"
})
public class SM201010Roles {

    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "Selected")
    protected Field selected;
    @XmlElement(name = "RoleName")
    protected Field roleName;
    @XmlElement(name = "RoleDescription")
    protected Field roleDescription;
    @XmlElement(name = "ServiceCommands")
    protected SM201010RolesServiceCommands serviceCommands;

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the selected property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getSelected() {
        return selected;
    }

    /**
     * Sets the value of the selected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setSelected(Field value) {
        this.selected = value;
    }

    /**
     * Gets the value of the roleName property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getRoleName() {
        return roleName;
    }

    /**
     * Sets the value of the roleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setRoleName(Field value) {
        this.roleName = value;
    }

    /**
     * Gets the value of the roleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getRoleDescription() {
        return roleDescription;
    }

    /**
     * Sets the value of the roleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setRoleDescription(Field value) {
        this.roleDescription = value;
    }

    /**
     * Gets the value of the serviceCommands property.
     * 
     * @return
     *     possible object is
     *     {@link SM201010RolesServiceCommands }
     *     
     */
    public SM201010RolesServiceCommands getServiceCommands() {
        return serviceCommands;
    }

    /**
     * Sets the value of the serviceCommands property.
     * 
     * @param value
     *     allowed object is
     *     {@link SM201010RolesServiceCommands }
     *     
     */
    public void setServiceCommands(SM201010RolesServiceCommands value) {
        this.serviceCommands = value;
    }

}
