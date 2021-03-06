
package com.prime.jax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SM201010Actions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SM201010Actions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SaveUsers" type="{http://www.acumatica.com/generic/}Action" minOccurs="0"/>
 *         &lt;element name="CancelUsers" type="{http://www.acumatica.com/generic/}Action" minOccurs="0"/>
 *         &lt;element name="InsertUsers" type="{http://www.acumatica.com/generic/}Action" minOccurs="0"/>
 *         &lt;element name="DeleteUsers" type="{http://www.acumatica.com/generic/}Action" minOccurs="0"/>
 *         &lt;element name="FirstUsers" type="{http://www.acumatica.com/generic/}Action" minOccurs="0"/>
 *         &lt;element name="PrevUsers" type="{http://www.acumatica.com/generic/}Action" minOccurs="0"/>
 *         &lt;element name="NextUsers" type="{http://www.acumatica.com/generic/}Action" minOccurs="0"/>
 *         &lt;element name="LastUsers" type="{http://www.acumatica.com/generic/}Action" minOccurs="0"/>
 *         &lt;element name="LoginAsUser" type="{http://www.acumatica.com/generic/}Action" minOccurs="0"/>
 *         &lt;element name="RestrictionGroupsByUser" type="{http://www.acumatica.com/generic/}Action" minOccurs="0"/>
 *         &lt;element name="ResetPassword" type="{http://www.acumatica.com/generic/}Action" minOccurs="0"/>
 *         &lt;element name="ResetPasswordOK" type="{http://www.acumatica.com/generic/}Action" minOccurs="0"/>
 *         &lt;element name="ActivateLogin" type="{http://www.acumatica.com/generic/}Action" minOccurs="0"/>
 *         &lt;element name="EnableLogin" type="{http://www.acumatica.com/generic/}Action" minOccurs="0"/>
 *         &lt;element name="DisableLogin" type="{http://www.acumatica.com/generic/}Action" minOccurs="0"/>
 *         &lt;element name="UnlockLogin" type="{http://www.acumatica.com/generic/}Action" minOccurs="0"/>
 *         &lt;element name="Cancel" type="{http://www.acumatica.com/generic/}Action" minOccurs="0"/>
 *         &lt;element name="AddADUser" type="{http://www.acumatica.com/generic/}Action" minOccurs="0"/>
 *         &lt;element name="AddADUserOK" type="{http://www.acumatica.com/generic/}Action" minOccurs="0"/>
 *         &lt;element name="ReloadADUsers" type="{http://www.acumatica.com/generic/}Action" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SM201010Actions", propOrder = {
    "saveUsers",
    "cancelUsers",
    "insertUsers",
    "deleteUsers",
    "firstUsers",
    "prevUsers",
    "nextUsers",
    "lastUsers",
    "loginAsUser",
    "restrictionGroupsByUser",
    "resetPassword",
    "resetPasswordOK",
    "activateLogin",
    "enableLogin",
    "disableLogin",
    "unlockLogin",
    "cancel",
    "addADUser",
    "addADUserOK",
    "reloadADUsers"
})
public class SM201010Actions {

    @XmlElement(name = "SaveUsers")
    protected Action saveUsers;
    @XmlElement(name = "CancelUsers")
    protected Action cancelUsers;
    @XmlElement(name = "InsertUsers")
    protected Action insertUsers;
    @XmlElement(name = "DeleteUsers")
    protected Action deleteUsers;
    @XmlElement(name = "FirstUsers")
    protected Action firstUsers;
    @XmlElement(name = "PrevUsers")
    protected Action prevUsers;
    @XmlElement(name = "NextUsers")
    protected Action nextUsers;
    @XmlElement(name = "LastUsers")
    protected Action lastUsers;
    @XmlElement(name = "LoginAsUser")
    protected Action loginAsUser;
    @XmlElement(name = "RestrictionGroupsByUser")
    protected Action restrictionGroupsByUser;
    @XmlElement(name = "ResetPassword")
    protected Action resetPassword;
    @XmlElement(name = "ResetPasswordOK")
    protected Action resetPasswordOK;
    @XmlElement(name = "ActivateLogin")
    protected Action activateLogin;
    @XmlElement(name = "EnableLogin")
    protected Action enableLogin;
    @XmlElement(name = "DisableLogin")
    protected Action disableLogin;
    @XmlElement(name = "UnlockLogin")
    protected Action unlockLogin;
    @XmlElement(name = "Cancel")
    protected Action cancel;
    @XmlElement(name = "AddADUser")
    protected Action addADUser;
    @XmlElement(name = "AddADUserOK")
    protected Action addADUserOK;
    @XmlElement(name = "ReloadADUsers")
    protected Action reloadADUsers;

    /**
     * Gets the value of the saveUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getSaveUsers() {
        return saveUsers;
    }

    /**
     * Sets the value of the saveUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setSaveUsers(Action value) {
        this.saveUsers = value;
    }

    /**
     * Gets the value of the cancelUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getCancelUsers() {
        return cancelUsers;
    }

    /**
     * Sets the value of the cancelUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setCancelUsers(Action value) {
        this.cancelUsers = value;
    }

    /**
     * Gets the value of the insertUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getInsertUsers() {
        return insertUsers;
    }

    /**
     * Sets the value of the insertUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setInsertUsers(Action value) {
        this.insertUsers = value;
    }

    /**
     * Gets the value of the deleteUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getDeleteUsers() {
        return deleteUsers;
    }

    /**
     * Sets the value of the deleteUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setDeleteUsers(Action value) {
        this.deleteUsers = value;
    }

    /**
     * Gets the value of the firstUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getFirstUsers() {
        return firstUsers;
    }

    /**
     * Sets the value of the firstUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setFirstUsers(Action value) {
        this.firstUsers = value;
    }

    /**
     * Gets the value of the prevUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getPrevUsers() {
        return prevUsers;
    }

    /**
     * Sets the value of the prevUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setPrevUsers(Action value) {
        this.prevUsers = value;
    }

    /**
     * Gets the value of the nextUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getNextUsers() {
        return nextUsers;
    }

    /**
     * Sets the value of the nextUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setNextUsers(Action value) {
        this.nextUsers = value;
    }

    /**
     * Gets the value of the lastUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getLastUsers() {
        return lastUsers;
    }

    /**
     * Sets the value of the lastUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setLastUsers(Action value) {
        this.lastUsers = value;
    }

    /**
     * Gets the value of the loginAsUser property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getLoginAsUser() {
        return loginAsUser;
    }

    /**
     * Sets the value of the loginAsUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setLoginAsUser(Action value) {
        this.loginAsUser = value;
    }

    /**
     * Gets the value of the restrictionGroupsByUser property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getRestrictionGroupsByUser() {
        return restrictionGroupsByUser;
    }

    /**
     * Sets the value of the restrictionGroupsByUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setRestrictionGroupsByUser(Action value) {
        this.restrictionGroupsByUser = value;
    }

    /**
     * Gets the value of the resetPassword property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getResetPassword() {
        return resetPassword;
    }

    /**
     * Sets the value of the resetPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setResetPassword(Action value) {
        this.resetPassword = value;
    }

    /**
     * Gets the value of the resetPasswordOK property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getResetPasswordOK() {
        return resetPasswordOK;
    }

    /**
     * Sets the value of the resetPasswordOK property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setResetPasswordOK(Action value) {
        this.resetPasswordOK = value;
    }

    /**
     * Gets the value of the activateLogin property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getActivateLogin() {
        return activateLogin;
    }

    /**
     * Sets the value of the activateLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setActivateLogin(Action value) {
        this.activateLogin = value;
    }

    /**
     * Gets the value of the enableLogin property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getEnableLogin() {
        return enableLogin;
    }

    /**
     * Sets the value of the enableLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setEnableLogin(Action value) {
        this.enableLogin = value;
    }

    /**
     * Gets the value of the disableLogin property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getDisableLogin() {
        return disableLogin;
    }

    /**
     * Sets the value of the disableLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setDisableLogin(Action value) {
        this.disableLogin = value;
    }

    /**
     * Gets the value of the unlockLogin property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getUnlockLogin() {
        return unlockLogin;
    }

    /**
     * Sets the value of the unlockLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setUnlockLogin(Action value) {
        this.unlockLogin = value;
    }

    /**
     * Gets the value of the cancel property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getCancel() {
        return cancel;
    }

    /**
     * Sets the value of the cancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setCancel(Action value) {
        this.cancel = value;
    }

    /**
     * Gets the value of the addADUser property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getAddADUser() {
        return addADUser;
    }

    /**
     * Sets the value of the addADUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setAddADUser(Action value) {
        this.addADUser = value;
    }

    /**
     * Gets the value of the addADUserOK property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getAddADUserOK() {
        return addADUserOK;
    }

    /**
     * Sets the value of the addADUserOK property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setAddADUserOK(Action value) {
        this.addADUserOK = value;
    }

    /**
     * Gets the value of the reloadADUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getReloadADUsers() {
        return reloadADUsers;
    }

    /**
     * Sets the value of the reloadADUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setReloadADUsers(Action value) {
        this.reloadADUsers = value;
    }

}
