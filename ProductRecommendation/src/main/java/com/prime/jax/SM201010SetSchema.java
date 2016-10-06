
package com.prime.jax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="schema" type="{http://www.acumatica.com/generic/}SM201010Content" minOccurs="0"/>
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
    "schema"
})
@XmlRootElement(name = "SM201010SetSchema")
public class SM201010SetSchema {

    protected SM201010Content schema;

    /**
     * Gets the value of the schema property.
     * 
     * @return
     *     possible object is
     *     {@link SM201010Content }
     *     
     */
    public SM201010Content getSchema() {
        return schema;
    }

    /**
     * Sets the value of the schema property.
     * 
     * @param value
     *     allowed object is
     *     {@link SM201010Content }
     *     
     */
    public void setSchema(SM201010Content value) {
        this.schema = value;
    }

}
