
package com.prime.jax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SM203520Users complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SM203520Users">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Login" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="ActivateAccount" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="IsOnline" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="TemporarilyLockOutAccount" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="ForceUserToChangePasswordOnNextLogin" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="AllowPasswordRecovery" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="PasswordNeverExpires" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="NoteText" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="ServiceCommands" type="{http://www.acumatica.com/generic/}SM203520UsersServiceCommands" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SM203520Users", propOrder = {
    "displayName",
    "login",
    "activateAccount",
    "firstName",
    "lastName",
    "email",
    "phone",
    "comment",
    "isOnline",
    "temporarilyLockOutAccount",
    "forceUserToChangePasswordOnNextLogin",
    "allowPasswordRecovery",
    "passwordNeverExpires",
    "noteText",
    "serviceCommands"
})
public class SM203520Users {

    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "Login")
    protected Field login;
    @XmlElement(name = "ActivateAccount")
    protected Field activateAccount;
    @XmlElement(name = "FirstName")
    protected Field firstName;
    @XmlElement(name = "LastName")
    protected Field lastName;
    @XmlElement(name = "Email")
    protected Field email;
    @XmlElement(name = "Phone")
    protected Field phone;
    @XmlElement(name = "Comment")
    protected Field comment;
    @XmlElement(name = "IsOnline")
    protected Field isOnline;
    @XmlElement(name = "TemporarilyLockOutAccount")
    protected Field temporarilyLockOutAccount;
    @XmlElement(name = "ForceUserToChangePasswordOnNextLogin")
    protected Field forceUserToChangePasswordOnNextLogin;
    @XmlElement(name = "AllowPasswordRecovery")
    protected Field allowPasswordRecovery;
    @XmlElement(name = "PasswordNeverExpires")
    protected Field passwordNeverExpires;
    @XmlElement(name = "NoteText")
    protected Field noteText;
    @XmlElement(name = "ServiceCommands")
    protected SM203520UsersServiceCommands serviceCommands;

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
     * Gets the value of the activateAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getActivateAccount() {
        return activateAccount;
    }

    /**
     * Sets the value of the activateAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setActivateAccount(Field value) {
        this.activateAccount = value;
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
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setPhone(Field value) {
        this.phone = value;
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
     * Gets the value of the isOnline property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getIsOnline() {
        return isOnline;
    }

    /**
     * Sets the value of the isOnline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setIsOnline(Field value) {
        this.isOnline = value;
    }

    /**
     * Gets the value of the temporarilyLockOutAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getTemporarilyLockOutAccount() {
        return temporarilyLockOutAccount;
    }

    /**
     * Sets the value of the temporarilyLockOutAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setTemporarilyLockOutAccount(Field value) {
        this.temporarilyLockOutAccount = value;
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
     * Gets the value of the noteText property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getNoteText() {
        return noteText;
    }

    /**
     * Sets the value of the noteText property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setNoteText(Field value) {
        this.noteText = value;
    }

    /**
     * Gets the value of the serviceCommands property.
     * 
     * @return
     *     possible object is
     *     {@link SM203520UsersServiceCommands }
     *     
     */
    public SM203520UsersServiceCommands getServiceCommands() {
        return serviceCommands;
    }

    /**
     * Sets the value of the serviceCommands property.
     * 
     * @param value
     *     allowed object is
     *     {@link SM203520UsersServiceCommands }
     *     
     */
    public void setServiceCommands(SM203520UsersServiceCommands value) {
        this.serviceCommands = value;
    }

}
