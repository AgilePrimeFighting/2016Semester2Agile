
package com.prime.jax.sm507000;

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
 *         &lt;element name="commands" type="{http://www.acumatica.com/typed/}ArrayOfCommand" minOccurs="0"/>
 *         &lt;element name="filters" type="{http://www.acumatica.com/typed/}ArrayOfFilter" minOccurs="0"/>
 *         &lt;element name="topCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="includeHeaders" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="breakOnError" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "topCount",
    "includeHeaders",
    "breakOnError"
})
@XmlRootElement(name = "Export")
public class Export {

    protected ArrayOfCommand commands;
    protected ArrayOfFilter filters;
    protected int topCount;
    protected boolean includeHeaders;
    protected boolean breakOnError;

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
     * Gets the value of the topCount property.
     * 
     */
    public int getTopCount() {
        return topCount;
    }

    /**
     * Sets the value of the topCount property.
     * 
     */
    public void setTopCount(int value) {
        this.topCount = value;
    }

    /**
     * Gets the value of the includeHeaders property.
     * 
     */
    public boolean isIncludeHeaders() {
        return includeHeaders;
    }

    /**
     * Sets the value of the includeHeaders property.
     * 
     */
    public void setIncludeHeaders(boolean value) {
        this.includeHeaders = value;
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

}
