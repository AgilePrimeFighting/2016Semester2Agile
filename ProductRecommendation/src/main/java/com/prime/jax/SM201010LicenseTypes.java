
package com.prime.jax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SM201010LicenseTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SM201010LicenseTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Selected" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="LicenseType" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="Available" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="ServiceCommands" type="{http://www.acumatica.com/generic/}SM201010LicenseTypesServiceCommands" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SM201010LicenseTypes", propOrder = {
    "displayName",
    "selected",
    "licenseType",
    "description",
    "available",
    "serviceCommands"
})
public class SM201010LicenseTypes {

    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "Selected")
    protected Field selected;
    @XmlElement(name = "LicenseType")
    protected Field licenseType;
    @XmlElement(name = "Description")
    protected Field description;
    @XmlElement(name = "Available")
    protected Field available;
    @XmlElement(name = "ServiceCommands")
    protected SM201010LicenseTypesServiceCommands serviceCommands;

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
     * Gets the value of the licenseType property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getLicenseType() {
        return licenseType;
    }

    /**
     * Sets the value of the licenseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setLicenseType(Field value) {
        this.licenseType = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setDescription(Field value) {
        this.description = value;
    }

    /**
     * Gets the value of the available property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getAvailable() {
        return available;
    }

    /**
     * Sets the value of the available property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setAvailable(Field value) {
        this.available = value;
    }

    /**
     * Gets the value of the serviceCommands property.
     * 
     * @return
     *     possible object is
     *     {@link SM201010LicenseTypesServiceCommands }
     *     
     */
    public SM201010LicenseTypesServiceCommands getServiceCommands() {
        return serviceCommands;
    }

    /**
     * Sets the value of the serviceCommands property.
     * 
     * @param value
     *     allowed object is
     *     {@link SM201010LicenseTypesServiceCommands }
     *     
     */
    public void setServiceCommands(SM201010LicenseTypesServiceCommands value) {
        this.serviceCommands = value;
    }

}
