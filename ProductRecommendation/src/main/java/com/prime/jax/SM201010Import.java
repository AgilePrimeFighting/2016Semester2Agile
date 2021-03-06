
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
 *         &lt;element name="filters" type="{http://www.acumatica.com/generic/}ArrayOfFilter" minOccurs="0"/>
 *         &lt;element name="data" type="{http://www.acumatica.com/generic/}ArrayOfArrayOfString" minOccurs="0"/>
 *         &lt;element name="includedHeaders" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="breakOnError" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="breakOnIncorrectTarget" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "commands",
    "filters",
    "data",
    "includedHeaders",
    "breakOnError",
    "breakOnIncorrectTarget"
})
@XmlRootElement(name = "SM201010Import")
public class SM201010Import {

    protected ArrayOfCommand commands;
    protected ArrayOfFilter filters;
    protected ArrayOfArrayOfString data;
    protected boolean includedHeaders;
    protected boolean breakOnError;
    protected boolean breakOnIncorrectTarget;

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

    /**
     * Gets the value of the filters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFilter }
     *     
     */
    public ArrayOfFilter getFilters() {
        return filters;
    }

    /**
     * Sets the value of the filters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFilter }
     *     
     */
    public void setFilters(ArrayOfFilter value) {
        this.filters = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArrayOfString }
     *     
     */
    public ArrayOfArrayOfString getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArrayOfString }
     *     
     */
    public void setData(ArrayOfArrayOfString value) {
        this.data = value;
    }

    /**
     * Gets the value of the includedHeaders property.
     * 
     */
    public boolean isIncludedHeaders() {
        return includedHeaders;
    }

    /**
     * Sets the value of the includedHeaders property.
     * 
     */
    public void setIncludedHeaders(boolean value) {
        this.includedHeaders = value;
    }

    /**
     * Gets the value of the breakOnError property.
     * 
     */
    public boolean isBreakOnError() {
        return breakOnError;
    }

    /**
     * Sets the value of the breakOnError property.
     * 
     */
    public void setBreakOnError(boolean value) {
        this.breakOnError = value;
    }

    /**
     * Gets the value of the breakOnIncorrectTarget property.
     * 
     */
    public boolean isBreakOnIncorrectTarget() {
        return breakOnIncorrectTarget;
    }

    /**
     * Sets the value of the breakOnIncorrectTarget property.
     * 
     */
    public void setBreakOnIncorrectTarget(boolean value) {
        this.breakOnIncorrectTarget = value;
    }

}
