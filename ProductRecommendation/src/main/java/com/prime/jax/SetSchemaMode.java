
package com.prime.jax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="mode" type="{http://www.acumatica.com/generic/}SchemaMode"/>
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
    "mode"
})
@XmlRootElement(name = "SetSchemaMode")
public class SetSchemaMode {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SchemaMode mode;

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link SchemaMode }
     *     
     */
    public SchemaMode getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemaMode }
     *     
     */
    public void setMode(SchemaMode value) {
        this.mode = value;
    }

}
