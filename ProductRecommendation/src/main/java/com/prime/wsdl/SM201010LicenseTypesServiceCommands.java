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
 * <p>Java class for SM201010LicenseTypesServiceCommands complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SM201010LicenseTypesServiceCommands"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KeyLicenseType" type="{http://www.acumatica.com/generic/}Key" minOccurs="0"/&gt;
 *         &lt;element name="NewRow" type="{http://www.acumatica.com/generic/}NewRow" minOccurs="0"/&gt;
 *         &lt;element name="RowNumber" type="{http://www.acumatica.com/generic/}RowNumber" minOccurs="0"/&gt;
 *         &lt;element name="DeleteRow" type="{http://www.acumatica.com/generic/}DeleteRow" minOccurs="0"/&gt;
 *         &lt;element name="DialogAnswer" type="{http://www.acumatica.com/generic/}Answer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SM201010LicenseTypesServiceCommands", propOrder = {
    "keyLicenseType",
    "newRow",
    "rowNumber",
    "deleteRow",
    "dialogAnswer"
})
public class SM201010LicenseTypesServiceCommands {

    @XmlElement(name = "KeyLicenseType")
    protected Key keyLicenseType;
    @XmlElement(name = "NewRow")
    protected NewRow newRow;
    @XmlElement(name = "RowNumber")
    protected RowNumber rowNumber;
    @XmlElement(name = "DeleteRow")
    protected DeleteRow deleteRow;
    @XmlElement(name = "DialogAnswer")
    protected Answer dialogAnswer;

    /**
     * Gets the value of the keyLicenseType property.
     * 
     * @return
     *     possible object is
     *     {@link Key }
     *     
     */
    public Key getKeyLicenseType() {
        return keyLicenseType;
    }

    /**
     * Sets the value of the keyLicenseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Key }
     *     
     */
    public void setKeyLicenseType(Key value) {
        this.keyLicenseType = value;
    }

    /**
     * Gets the value of the newRow property.
     * 
     * @return
     *     possible object is
     *     {@link NewRow }
     *     
     */
    public NewRow getNewRow() {
        return newRow;
    }

    /**
     * Sets the value of the newRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewRow }
     *     
     */
    public void setNewRow(NewRow value) {
        this.newRow = value;
    }

    /**
     * Gets the value of the rowNumber property.
     * 
     * @return
     *     possible object is
     *     {@link RowNumber }
     *     
     */
    public RowNumber getRowNumber() {
        return rowNumber;
    }

    /**
     * Sets the value of the rowNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link RowNumber }
     *     
     */
    public void setRowNumber(RowNumber value) {
        this.rowNumber = value;
    }

    /**
     * Gets the value of the deleteRow property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteRow }
     *     
     */
    public DeleteRow getDeleteRow() {
        return deleteRow;
    }

    /**
     * Sets the value of the deleteRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteRow }
     *     
     */
    public void setDeleteRow(DeleteRow value) {
        this.deleteRow = value;
    }

    /**
     * Gets the value of the dialogAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link Answer }
     *     
     */
    public Answer getDialogAnswer() {
        return dialogAnswer;
    }

    /**
     * Sets the value of the dialogAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Answer }
     *     
     */
    public void setDialogAnswer(Answer value) {
        this.dialogAnswer = value;
    }

}
