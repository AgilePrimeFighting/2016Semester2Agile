//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.30 at 07:59:27 PM NZDT 
//


package com.prime.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SM201010IPFilterAllowedIPAddressRanges complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SM201010IPFilterAllowedIPAddressRanges"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StartIPAddress" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/&gt;
 *         &lt;element name="EndIPAddress" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/&gt;
 *         &lt;element name="ServiceCommands" type="{http://www.acumatica.com/generic/}SM201010IPFilterAllowedIPAddressRangesServiceCommands" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SM201010IPFilterAllowedIPAddressRanges", propOrder = {
    "displayName",
    "startIPAddress",
    "endIPAddress",
    "serviceCommands"
})
public class SM201010IPFilterAllowedIPAddressRanges {

    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "StartIPAddress")
    protected Field startIPAddress;
    @XmlElement(name = "EndIPAddress")
    protected Field endIPAddress;
    @XmlElement(name = "ServiceCommands")
    protected SM201010IPFilterAllowedIPAddressRangesServiceCommands serviceCommands;

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
     * Gets the value of the startIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getStartIPAddress() {
        return startIPAddress;
    }

    /**
     * Sets the value of the startIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setStartIPAddress(Field value) {
        this.startIPAddress = value;
    }

    /**
     * Gets the value of the endIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getEndIPAddress() {
        return endIPAddress;
    }

    /**
     * Sets the value of the endIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setEndIPAddress(Field value) {
        this.endIPAddress = value;
    }

    /**
     * Gets the value of the serviceCommands property.
     * 
     * @return
     *     possible object is
     *     {@link SM201010IPFilterAllowedIPAddressRangesServiceCommands }
     *     
     */
    public SM201010IPFilterAllowedIPAddressRangesServiceCommands getServiceCommands() {
        return serviceCommands;
    }

    /**
     * Sets the value of the serviceCommands property.
     * 
     * @param value
     *     allowed object is
     *     {@link SM201010IPFilterAllowedIPAddressRangesServiceCommands }
     *     
     */
    public void setServiceCommands(SM201010IPFilterAllowedIPAddressRangesServiceCommands value) {
        this.serviceCommands = value;
    }

}
