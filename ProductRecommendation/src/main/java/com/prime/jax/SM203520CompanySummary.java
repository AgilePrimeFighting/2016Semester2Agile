
package com.prime.jax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SM203520CompanySummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SM203520CompanySummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyID" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="LoginName" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="CompanyName" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="ServiceCommands" type="{http://www.acumatica.com/generic/}SM203520CompanySummaryServiceCommands" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SM203520CompanySummary", propOrder = {
    "displayName",
    "companyID",
    "loginName",
    "status",
    "companyName",
    "serviceCommands"
})
public class SM203520CompanySummary {

    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "CompanyID")
    protected Field companyID;
    @XmlElement(name = "LoginName")
    protected Field loginName;
    @XmlElement(name = "Status")
    protected Field status;
    @XmlElement(name = "CompanyName")
    protected Field companyName;
    @XmlElement(name = "ServiceCommands")
    protected SM203520CompanySummaryServiceCommands serviceCommands;

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
     * Gets the value of the loginName property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getLoginName() {
        return loginName;
    }

    /**
     * Sets the value of the loginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setLoginName(Field value) {
        this.loginName = value;
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
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setCompanyName(Field value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the serviceCommands property.
     * 
     * @return
     *     possible object is
     *     {@link SM203520CompanySummaryServiceCommands }
     *     
     */
    public SM203520CompanySummaryServiceCommands getServiceCommands() {
        return serviceCommands;
    }

    /**
     * Sets the value of the serviceCommands property.
     * 
     * @param value
     *     allowed object is
     *     {@link SM203520CompanySummaryServiceCommands }
     *     
     */
    public void setServiceCommands(SM203520CompanySummaryServiceCommands value) {
        this.serviceCommands = value;
    }

}
