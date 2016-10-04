
package com.prime.jax.sm507000;

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
 *         &lt;element name="GetProcessStatusResult" type="{http://www.acumatica.com/typed/}ProcessResult" minOccurs="0"/>
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
    "getProcessStatusResult"
})
@XmlRootElement(name = "GetProcessStatusResponse")
public class GetProcessStatusResponse {

    @XmlElement(name = "GetProcessStatusResult")
    protected ProcessResult getProcessStatusResult;

    /**
     * Gets the value of the getProcessStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessResult }
     *     
     */
    public ProcessResult getGetProcessStatusResult() {
        return getProcessStatusResult;
    }

    /**
     * Sets the value of the getProcessStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessResult }
     *     
     */
    public void setGetProcessStatusResult(ProcessResult value) {
        this.getProcessStatusResult = value;
    }

}
