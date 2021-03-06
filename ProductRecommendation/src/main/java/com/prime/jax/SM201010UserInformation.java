
package com.prime.jax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SM201010UserInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SM201010UserInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Login" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="GeneratePassword" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="GuestAccount" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="UserType" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="LinkedEntityContactID" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="LinkedEntityDisplayName" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="LicenseStatus" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="LinkedEntityEntity" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="AllowPasswordRecovery" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="AllowPasswordChanges" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="PasswordNeverExpires" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="ForceUserToChangePasswordOnNextLogin" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="OverrideActiveDirectoryRolesWithLocalRoles" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="Source" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="ServiceCommands" type="{http://www.acumatica.com/generic/}SM201010UserInformationServiceCommands" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SM201010UserInformation", propOrder = {
    "displayName",
    "login",
    "password",
    "generatePassword",
    "guestAccount",
    "userType",
    "linkedEntityContactID",
    "linkedEntityDisplayName",
    "firstName",
    "lastName",
    "email",
    "comment",
    "status",
    "licenseStatus",
    "linkedEntityEntity",
    "allowPasswordRecovery",
    "allowPasswordChanges",
    "passwordNeverExpires",
    "forceUserToChangePasswordOnNextLogin",
    "overrideActiveDirectoryRolesWithLocalRoles",
    "source",
    "serviceCommands"
})
public class SM201010UserInformation {

    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "Login")
    protected Field login;
    @XmlElement(name = "Password")
    protected Field password;
    @XmlElement(name = "GeneratePassword")
    protected Field generatePassword;
    @XmlElement(name = "GuestAccount")
    protected Field guestAccount;
    @XmlElement(name = "UserType")
    protected Field userType;
    @XmlElement(name = "LinkedEntityContactID")
    protected Field linkedEntityContactID;
    @XmlElement(name = "LinkedEntityDisplayName")
    protected Field linkedEntityDisplayName;
    @XmlElement(name = "FirstName")
    protected Field firstName;
    @XmlElement(name = "LastName")
    protected Field lastName;
    @XmlElement(name = "Email")
    protected Field email;
    @XmlElement(name = "Comment")
    protected Field comment;
    @XmlElement(name = "Status")
    protected Field status;
    @XmlElement(name = "LicenseStatus")
    protected Field licenseStatus;
    @XmlElement(name = "LinkedEntityEntity")
    protected Field linkedEntityEntity;
    @XmlElement(name = "AllowPasswordRecovery")
    protected Field allowPasswordRecovery;
    @XmlElement(name = "AllowPasswordChanges")
    protected Field allowPasswordChanges;
    @XmlElement(name = "PasswordNeverExpires")
    protected Field passwordNeverExpires;
    @XmlElement(name = "ForceUserToChangePasswordOnNextLogin")
    protected Field forceUserToChangePasswordOnNextLogin;
    @XmlElement(name = "OverrideActiveDirectoryRolesWithLocalRoles")
    protected Field overrideActiveDirectoryRolesWithLocalRoles;
    @XmlElement(name = "Source")
    protected Field source;
    @XmlElement(name = "ServiceCommands")
    protected SM201010UserInformationServiceCommands serviceCommands;

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
     * Gets the value of the login property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getLogin() {
        return login;
    }

    /**
     * Sets the value of the login property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setLogin(Field value) {
        this.login = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setPassword(Field value) {
        this.password = value;
    }

    /**
     * Gets the value of the generatePassword property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getGeneratePassword() {
        return generatePassword;
    }

    /**
     * Sets the value of the generatePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setGeneratePassword(Field value) {
        this.generatePassword = value;
    }

    /**
     * Gets the value of the guestAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getGuestAccount() {
        return guestAccount;
    }

    /**
     * Sets the value of the guestAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setGuestAccount(Field value) {
        this.guestAccount = value;
    }

    /**
     * Gets the value of the userType property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setUserType(Field value) {
        this.userType = value;
    }

    /**
     * Gets the value of the linkedEntityContactID property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getLinkedEntityContactID() {
        return linkedEntityContactID;
    }

    /**
     * Sets the value of the linkedEntityContactID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setLinkedEntityContactID(Field value) {
        this.linkedEntityContactID = value;
    }

    /**
     * Gets the value of the linkedEntityDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getLinkedEntityDisplayName() {
        return linkedEntityDisplayName;
    }

    /**
     * Sets the value of the linkedEntityDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setLinkedEntityDisplayName(Field value) {
        this.linkedEntityDisplayName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setFirstName(Field value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setLastName(Field value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setEmail(Field value) {
        this.email = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setComment(Field value) {
        this.comment = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setStatus(Field value) {
        this.status = value;
    }

    /**
     * Gets the value of the licenseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getLicenseStatus() {
        return licenseStatus;
    }

    /**
     * Sets the value of the licenseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setLicenseStatus(Field value) {
        this.licenseStatus = value;
    }

    /**
     * Gets the value of the linkedEntityEntity property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getLinkedEntityEntity() {
        return linkedEntityEntity;
    }

    /**
     * Sets the value of the linkedEntityEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setLinkedEntityEntity(Field value) {
        this.linkedEntityEntity = value;
    }

    /**
     * Gets the value of the allowPasswordRecovery property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getAllowPasswordRecovery() {
        return allowPasswordRecovery;
    }

    /**
     * Sets the value of the allowPasswordRecovery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setAllowPasswordRecovery(Field value) {
        this.allowPasswordRecovery = value;
    }

    /**
     * Gets the value of the allowPasswordChanges property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getAllowPasswordChanges() {
        return allowPasswordChanges;
    }

    /**
     * Sets the value of the allowPasswordChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setAllowPasswordChanges(Field value) {
        this.allowPasswordChanges = value;
    }

    /**
     * Gets the value of the passwordNeverExpires property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getPasswordNeverExpires() {
        return passwordNeverExpires;
    }

    /**
     * Sets the value of the passwordNeverExpires property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setPasswordNeverExpires(Field value) {
        this.passwordNeverExpires = value;
    }

    /**
     * Gets the value of the forceUserToChangePasswordOnNextLogin property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getForceUserToChangePasswordOnNextLogin() {
        return forceUserToChangePasswordOnNextLogin;
    }

    /**
     * Sets the value of the forceUserToChangePasswordOnNextLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setForceUserToChangePasswordOnNextLogin(Field value) {
        this.forceUserToChangePasswordOnNextLogin = value;
    }

    /**
     * Gets the value of the overrideActiveDirectoryRolesWithLocalRoles property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getOverrideActiveDirectoryRolesWithLocalRoles() {
        return overrideActiveDirectoryRolesWithLocalRoles;
    }

    /**
     * Sets the value of the overrideActiveDirectoryRolesWithLocalRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setOverrideActiveDirectoryRolesWithLocalRoles(Field value) {
        this.overrideActiveDirectoryRolesWithLocalRoles = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setSource(Field value) {
        this.source = value;
    }

    /**
     * Gets the value of the serviceCommands property.
     * 
     * @return
     *     possible object is
     *     {@link SM201010UserInformationServiceCommands }
     *     
     */
    public SM201010UserInformationServiceCommands getServiceCommands() {
        return serviceCommands;
    }

    /**
     * Sets the value of the serviceCommands property.
     * 
     * @param value
     *     allowed object is
     *     {@link SM201010UserInformationServiceCommands }
     *     
     */
    public void setServiceCommands(SM201010UserInformationServiceCommands value) {
        this.serviceCommands = value;
    }

}
