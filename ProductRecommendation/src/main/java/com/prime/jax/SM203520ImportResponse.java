
package com.prime.jax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ImportResult" type="{http://www.acumatica.com/generic/}SM203520ArrayOfImportResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "importResult"
})
@XmlRootElement(name = "SM203520ImportResponse")
public class SM203520ImportResponse {

    @XmlElement(name = "ImportResult")
    protected SM203520ArrayOfImportResult importResult;

    /**
     * Gets the value of the importResult property.
     * 
     * @return
     *     possible object is
     *     {@link SM203520ArrayOfImportResult }
     *     
     */
    public SM203520ArrayOfImportResult getImportResult() {
        return importResult;
    }

    /**
     * Sets the value of the importResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SM203520ArrayOfImportResult }
     *     
     */
    public void setImportResult(SM203520ArrayOfImportResult value) {
        this.importResult = value;
    }

}
