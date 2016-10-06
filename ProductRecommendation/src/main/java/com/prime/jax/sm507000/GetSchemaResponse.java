
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
 *         &lt;element name="GetSchemaResult" type="{http://www.acumatica.com/typed/}Content" minOccurs="0"/>
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
    "getSchemaResult"
})
@XmlRootElement(name = "GetSchemaResponse")
public class GetSchemaResponse {

    @XmlElement(name = "GetSchemaResult")
    protected Content getSchemaResult;

    /**
     * Gets the value of the getSchemaResult property.
     * 
     * @return
     *     possible object is
     *     {@link Content }
     *     
     */
    public Content getGetSchemaResult() {
        return getSchemaResult;
    }

    /**
     * Sets the value of the getSchemaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Content }
     *     
     */
    public void setGetSchemaResult(Content value) {
        this.getSchemaResult = value;
    }

}
