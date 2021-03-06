
package com.prime.jax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SM201010Content complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SM201010Content">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Actions" type="{http://www.acumatica.com/generic/}SM201010Actions" minOccurs="0"/>
 *         &lt;element name="UserInformation" type="{http://www.acumatica.com/generic/}SM201010UserInformation" minOccurs="0"/>
 *         &lt;element name="Statistics" type="{http://www.acumatica.com/generic/}SM201010Statistics" minOccurs="0"/>
 *         &lt;element name="PersonalSettings" type="{http://www.acumatica.com/generic/}SM201010PersonalSettings" minOccurs="0"/>
 *         &lt;element name="IPFilterAllowedIPAddressRanges" type="{http://www.acumatica.com/generic/}SM201010IPFilterAllowedIPAddressRanges" minOccurs="0"/>
 *         &lt;element name="ExternalIdentities" type="{http://www.acumatica.com/generic/}SM201010ExternalIdentities" minOccurs="0"/>
 *         &lt;element name="Roles" type="{http://www.acumatica.com/generic/}SM201010Roles" minOccurs="0"/>
 *         &lt;element name="ActiveDirectoryUserActiveDirectoryUser" type="{http://www.acumatica.com/generic/}SM201010ActiveDirectoryUserActiveDirectoryUser" minOccurs="0"/>
 *         &lt;element name="LicenseTypes" type="{http://www.acumatica.com/generic/}SM201010LicenseTypes" minOccurs="0"/>
 *         &lt;element name="RolesRoleName" type="{http://www.acumatica.com/generic/}SM201010RolesRoleName" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SM201010Content", propOrder = {
    "actions",
    "userInformation",
    "statistics",
    "personalSettings",
    "ipFilterAllowedIPAddressRanges",
    "externalIdentities",
    "roles",
    "activeDirectoryUserActiveDirectoryUser",
    "licenseTypes",
    "rolesRoleName"
})
public class SM201010Content {

    @XmlElement(name = "Actions")
    protected SM201010Actions actions;
    @XmlElement(name = "UserInformation")
    protected SM201010UserInformation userInformation;
    @XmlElement(name = "Statistics")
    protected SM201010Statistics statistics;
    @XmlElement(name = "PersonalSettings")
    protected SM201010PersonalSettings personalSettings;
    @XmlElement(name = "IPFilterAllowedIPAddressRanges")
    protected SM201010IPFilterAllowedIPAddressRanges ipFilterAllowedIPAddressRanges;
    @XmlElement(name = "ExternalIdentities")
    protected SM201010ExternalIdentities externalIdentities;
    @XmlElement(name = "Roles")
    protected SM201010Roles roles;
    @XmlElement(name = "ActiveDirectoryUserActiveDirectoryUser")
    protected SM201010ActiveDirectoryUserActiveDirectoryUser activeDirectoryUserActiveDirectoryUser;
    @XmlElement(name = "LicenseTypes")
    protected SM201010LicenseTypes licenseTypes;
    @XmlElement(name = "RolesRoleName")
    protected SM201010RolesRoleName rolesRoleName;

    /**
     * Gets the value of the actions property.
     * 
     * @return
     *     possible object is
     *     {@link SM201010Actions }
     *     
     */
    public SM201010Actions getActions() {
        return actions;
    }

    /**
     * Sets the value of the actions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SM201010Actions }
     *     
     */
    public void setActions(SM201010Actions value) {
        this.actions = value;
    }

    /**
     * Gets the value of the userInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SM201010UserInformation }
     *     
     */
    public SM201010UserInformation getUserInformation() {
        return userInformation;
    }

    /**
     * Sets the value of the userInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SM201010UserInformation }
     *     
     */
    public void setUserInformation(SM201010UserInformation value) {
        this.userInformation = value;
    }

    /**
     * Gets the value of the statistics property.
     * 
     * @return
     *     possible object is
     *     {@link SM201010Statistics }
     *     
     */
    public SM201010Statistics getStatistics() {
        return statistics;
    }

    /**
     * Sets the value of the statistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link SM201010Statistics }
     *     
     */
    public void setStatistics(SM201010Statistics value) {
        this.statistics = value;
    }

    /**
     * Gets the value of the personalSettings property.
     * 
     * @return
     *     possible object is
     *     {@link SM201010PersonalSettings }
     *     
     */
    public SM201010PersonalSettings getPersonalSettings() {
        return personalSettings;
    }

    /**
     * Sets the value of the personalSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link SM201010PersonalSettings }
     *     
     */
    public void setPersonalSettings(SM201010PersonalSettings value) {
        this.personalSettings = value;
    }

    /**
     * Gets the value of the ipFilterAllowedIPAddressRanges property.
     * 
     * @return
     *     possible object is
     *     {@link SM201010IPFilterAllowedIPAddressRanges }
     *     
     */
    public SM201010IPFilterAllowedIPAddressRanges getIPFilterAllowedIPAddressRanges() {
        return ipFilterAllowedIPAddressRanges;
    }

    /**
     * Sets the value of the ipFilterAllowedIPAddressRanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link SM201010IPFilterAllowedIPAddressRanges }
     *     
     */
    public void setIPFilterAllowedIPAddressRanges(SM201010IPFilterAllowedIPAddressRanges value) {
        this.ipFilterAllowedIPAddressRanges = value;
    }

    /**
     * Gets the value of the externalIdentities property.
     * 
     * @return
     *     possible object is
     *     {@link SM201010ExternalIdentities }
     *     
     */
    public SM201010ExternalIdentities getExternalIdentities() {
        return externalIdentities;
    }

    /**
     * Sets the value of the externalIdentities property.
     * 
     * @param value
     *     allowed object is
     *     {@link SM201010ExternalIdentities }
     *     
     */
    public void setExternalIdentities(SM201010ExternalIdentities value) {
        this.externalIdentities = value;
    }

    /**
     * Gets the value of the roles property.
     * 
     * @return
     *     possible object is
     *     {@link SM201010Roles }
     *     
     */
    public SM201010Roles getRoles() {
        return roles;
    }

    /**
     * Sets the value of the roles property.
     * 
     * @param value
     *     allowed object is
     *     {@link SM201010Roles }
     *     
     */
    public void setRoles(SM201010Roles value) {
        this.roles = value;
    }

    /**
     * Gets the value of the activeDirectoryUserActiveDirectoryUser property.
     * 
     * @return
     *     possible object is
     *     {@link SM201010ActiveDirectoryUserActiveDirectoryUser }
     *     
     */
    public SM201010ActiveDirectoryUserActiveDirectoryUser getActiveDirectoryUserActiveDirectoryUser() {
        return activeDirectoryUserActiveDirectoryUser;
    }

    /**
     * Sets the value of the activeDirectoryUserActiveDirectoryUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link SM201010ActiveDirectoryUserActiveDirectoryUser }
     *     
     */
    public void setActiveDirectoryUserActiveDirectoryUser(SM201010ActiveDirectoryUserActiveDirectoryUser value) {
        this.activeDirectoryUserActiveDirectoryUser = value;
    }

    /**
     * Gets the value of the licenseTypes property.
     * 
     * @return
     *     possible object is
     *     {@link SM201010LicenseTypes }
     *     
     */
    public SM201010LicenseTypes getLicenseTypes() {
        return licenseTypes;
    }

    /**
     * Sets the value of the licenseTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link SM201010LicenseTypes }
     *     
     */
    public void setLicenseTypes(SM201010LicenseTypes value) {
        this.licenseTypes = value;
    }

    /**
     * Gets the value of the rolesRoleName property.
     * 
     * @return
     *     possible object is
     *     {@link SM201010RolesRoleName }
     *     
     */
    public SM201010RolesRoleName getRolesRoleName() {
        return rolesRoleName;
    }

    /**
     * Sets the value of the rolesRoleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SM201010RolesRoleName }
     *     
     */
    public void setRolesRoleName(SM201010RolesRoleName value) {
        this.rolesRoleName = value;
    }

}
