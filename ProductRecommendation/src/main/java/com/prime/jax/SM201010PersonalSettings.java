
package com.prime.jax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SM201010PersonalSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SM201010PersonalSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PDFSigningCertificate" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="TimeZone" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="DefaultBranch" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="DefaultBranchBranch" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="HomePage" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="ServiceCommands" type="{http://www.acumatica.com/generic/}SM201010PersonalSettingsServiceCommands" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SM201010PersonalSettings", propOrder = {
    "displayName",
    "pdfSigningCertificate",
    "timeZone",
    "defaultBranch",
    "defaultBranchBranch",
    "homePage",
    "serviceCommands"
})
public class SM201010PersonalSettings {

    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "PDFSigningCertificate")
    protected Field pdfSigningCertificate;
    @XmlElement(name = "TimeZone")
    protected Field timeZone;
    @XmlElement(name = "DefaultBranch")
    protected Field defaultBranch;
    @XmlElement(name = "DefaultBranchBranch")
    protected Field defaultBranchBranch;
    @XmlElement(name = "HomePage")
    protected Field homePage;
    @XmlElement(name = "ServiceCommands")
    protected SM201010PersonalSettingsServiceCommands serviceCommands;

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
     * Gets the value of the pdfSigningCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getPDFSigningCertificate() {
        return pdfSigningCertificate;
    }

    /**
     * Sets the value of the pdfSigningCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setPDFSigningCertificate(Field value) {
        this.pdfSigningCertificate = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setTimeZone(Field value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the defaultBranch property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getDefaultBranch() {
        return defaultBranch;
    }

    /**
     * Sets the value of the defaultBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setDefaultBranch(Field value) {
        this.defaultBranch = value;
    }

    /**
     * Gets the value of the defaultBranchBranch property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getDefaultBranchBranch() {
        return defaultBranchBranch;
    }

    /**
     * Sets the value of the defaultBranchBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setDefaultBranchBranch(Field value) {
        this.defaultBranchBranch = value;
    }

    /**
     * Gets the value of the homePage property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getHomePage() {
        return homePage;
    }

    /**
     * Sets the value of the homePage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setHomePage(Field value) {
        this.homePage = value;
    }

    /**
     * Gets the value of the serviceCommands property.
     * 
     * @return
     *     possible object is
     *     {@link SM201010PersonalSettingsServiceCommands }
     *     
     */
    public SM201010PersonalSettingsServiceCommands getServiceCommands() {
        return serviceCommands;
    }

    /**
     * Sets the value of the serviceCommands property.
     * 
     * @param value
     *     allowed object is
     *     {@link SM201010PersonalSettingsServiceCommands }
     *     
     */
    public void setServiceCommands(SM201010PersonalSettingsServiceCommands value) {
        this.serviceCommands = value;
    }

}
