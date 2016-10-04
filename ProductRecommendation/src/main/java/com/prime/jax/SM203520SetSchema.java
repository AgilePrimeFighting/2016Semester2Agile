
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
 *         &lt;element name="schema" type="{http://www.acumatica.com/generic/}SM203520Content" minOccurs="0"/>
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
@XmlRootElement(name = "SM203520SetSchema")
public class SM203520SetSchema {

    protected SM203520Content schema;

    /**
     * Gets the value of the schema property.
     * 
     * @return
     *     possible object is
     *     {@link SM203520Content }
     *     
     */
    public SM203520Content getSchema() {
        return schema;
    }

    /**
     * Sets the value of the schema property.
     * 
     * @param value
     *     allowed object is
     *     {@link SM203520Content }
     *     
     */
    public void setSchema(SM203520Content value) {
        this.schema = value;
    }

}
