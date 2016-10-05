
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
 *         &lt;element name="GetScenarioResult" type="{http://www.acumatica.com/generic/}ArrayOfCommand" minOccurs="0"/>
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
    "getScenarioResult"
})
@XmlRootElement(name = "GetScenarioResponse")
public class GetScenarioResponse {

    @XmlElement(name = "GetScenarioResult")
    protected ArrayOfCommand getScenarioResult;

    /**
     * Gets the value of the getScenarioResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommand }
     *     
     */
    public ArrayOfCommand getGetScenarioResult() {
        return getScenarioResult;
    }

    /**
     * Sets the value of the getScenarioResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommand }
     *     
     */
    public void setGetScenarioResult(ArrayOfCommand value) {
        this.getScenarioResult = value;
    }

}
