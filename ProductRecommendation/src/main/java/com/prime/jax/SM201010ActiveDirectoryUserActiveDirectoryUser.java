
package com.prime.jax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SM201010ActiveDirectoryUserActiveDirectoryUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SM201010ActiveDirectoryUserActiveDirectoryUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Username" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="ServiceCommands" type="{http://www.acumatica.com/generic/}SM201010ActiveDirectoryUserActiveDirectoryUserServiceCommands" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SM201010ActiveDirectoryUserActiveDirectoryUser", propOrder = {
    "displayName",
    "username",
    "serviceCommands"
})
public class SM201010ActiveDirectoryUserActiveDirectoryUser {

    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "Username")
    protected Field username;
    @XmlElement(name = "ServiceCommands")
    protected SM201010ActiveDirectoryUserActiveDirectoryUserServiceCommands serviceCommands;

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
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setUsername(Field value) {
        this.username = value;
    }

    /**
     * Gets the value of the serviceCommands property.
     * 
     * @return
     *     possible object is
     *     {@link SM201010ActiveDirectoryUserActiveDirectoryUserServiceCommands }
     *     
     */
    public SM201010ActiveDirectoryUserActiveDirectoryUserServiceCommands getServiceCommands() {
        return serviceCommands;
    }

    /**
     * Sets the value of the serviceCommands property.
     * 
     * @param value
     *     allowed object is
     *     {@link SM201010ActiveDirectoryUserActiveDirectoryUserServiceCommands }
     *     
     */
    public void setServiceCommands(SM201010ActiveDirectoryUserActiveDirectoryUserServiceCommands value) {
        this.serviceCommands = value;
    }

}
