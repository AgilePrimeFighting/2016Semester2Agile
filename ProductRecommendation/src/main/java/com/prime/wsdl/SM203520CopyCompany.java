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
 * <p>Java class for SM203520CopyCompany complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SM203520CopyCompany"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyID" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/&gt;
 *         &lt;element name="ServiceCommands" type="{http://www.acumatica.com/generic/}SM203520CopyCompanyServiceCommands" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SM203520CopyCompany", propOrder = {
    "displayName",
    "companyID",
    "serviceCommands"
})
public class SM203520CopyCompany {

    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "CompanyID")
    protected Field companyID;
    @XmlElement(name = "ServiceCommands")
    protected SM203520CopyCompanyServiceCommands serviceCommands;

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
     * Gets the value of the companyID property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getCompanyID() {
        return companyID;
    }

    /**
     * Sets the value of the companyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setCompanyID(Field value) {
        this.companyID = value;
    }

    /**
     * Gets the value of the serviceCommands property.
     * 
     * @return
     *     possible object is
     *     {@link SM203520CopyCompanyServiceCommands }
     *     
     */
    public SM203520CopyCompanyServiceCommands getServiceCommands() {
        return serviceCommands;
    }

    /**
     * Sets the value of the serviceCommands property.
     * 
     * @param value
     *     allowed object is
     *     {@link SM203520CopyCompanyServiceCommands }
     *     
     */
    public void setServiceCommands(SM203520CopyCompanyServiceCommands value) {
        this.serviceCommands = value;
    }

}
