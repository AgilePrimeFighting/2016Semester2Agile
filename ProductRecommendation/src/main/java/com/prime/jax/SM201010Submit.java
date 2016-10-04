
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
 *         &lt;element name="commands" type="{http://www.acumatica.com/generic/}ArrayOfCommand" minOccurs="0"/>
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
    "commands"
})
@XmlRootElement(name = "SM201010Submit")
public class SM201010Submit {

    protected ArrayOfCommand commands;

    /**
     * Gets the value of the commands property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCommand }
     *     
     */
    public ArrayOfCommand getCommands() {
        return commands;
    }

    /**
     * Sets the value of the commands property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCommand }
     *     
     */
    public void setCommands(ArrayOfCommand value) {
        this.commands = value;
    }

}
