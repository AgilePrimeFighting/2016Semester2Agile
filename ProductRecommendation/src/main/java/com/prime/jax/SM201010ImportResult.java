
package com.prime.jax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SM201010ImportResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SM201010ImportResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Processed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Keys" type="{http://www.acumatica.com/generic/}SM201010PrimaryKey" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SM201010ImportResult", propOrder = {
    "processed",
    "error",
    "keys"
})
public class SM201010ImportResult {

    @XmlElement(name = "Processed")
    protected boolean processed;
    @XmlElement(name = "Error")
    protected String error;
    @XmlElement(name = "Keys")
    protected SM201010PrimaryKey keys;

    /**
     * Gets the value of the processed property.
     * 
     */
    public boolean isProcessed() {
        return processed;
    }

    /**
     * Sets the value of the processed property.
     * 
     */
    public void setProcessed(boolean value) {
        this.processed = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

    /**
     * Gets the value of the keys property.
     * 
     * @return
     *     possible object is
     *     {@link SM201010PrimaryKey }
     *     
     */
    public SM201010PrimaryKey getKeys() {
        return keys;
    }

    /**
     * Sets the value of the keys property.
     * 
     * @param value
     *     allowed object is
     *     {@link SM201010PrimaryKey }
     *     
     */
    public void setKeys(SM201010PrimaryKey value) {
        this.keys = value;
    }

}
