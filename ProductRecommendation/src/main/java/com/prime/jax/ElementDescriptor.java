
package com.prime.jax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElementDescriptor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElementDescriptor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsDisabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ElementType" type="{http://www.acumatica.com/generic/}ElementTypes" minOccurs="0"/>
 *         &lt;element name="LengthLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InputMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayRules" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AllowedValues" type="{http://www.acumatica.com/generic/}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementDescriptor", propOrder = {
    "displayName",
    "isDisabled",
    "isRequired",
    "elementType",
    "lengthLimit",
    "inputMask",
    "displayRules",
    "allowedValues"
})
public class ElementDescriptor {

    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "IsDisabled", defaultValue = "false")
    protected Boolean isDisabled;
    @XmlElement(name = "IsRequired", defaultValue = "false")
    protected Boolean isRequired;
    @XmlElement(name = "ElementType", defaultValue = "String")
    @XmlSchemaType(name = "string")
    protected ElementTypes elementType;
    @XmlElement(name = "LengthLimit", defaultValue = "0")
    protected Integer lengthLimit;
    @XmlElement(name = "InputMask")
    protected String inputMask;
    @XmlElement(name = "DisplayRules")
    protected String displayRules;
    @XmlElement(name = "AllowedValues")
    protected ArrayOfString allowedValues;

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the isDisabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDisabled() {
        return isDisabled;
    }

    /**
     * Sets the value of the isDisabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDisabled(Boolean value) {
        this.isDisabled = value;
    }

    /**
     * Gets the value of the isRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRequired() {
        return isRequired;
    }

    /**
     * Sets the value of the isRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRequired(Boolean value) {
        this.isRequired = value;
    }

    /**
     * Gets the value of the elementType property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTypes }
     *     
     */
    public ElementTypes getElementType() {
        return elementType;
    }

    /**
     * Sets the value of the elementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTypes }
     *     
     */
    public void setElementType(ElementTypes value) {
        this.elementType = value;
    }

    /**
     * Gets the value of the lengthLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLengthLimit() {
        return lengthLimit;
    }

    /**
     * Sets the value of the lengthLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLengthLimit(Integer value) {
        this.lengthLimit = value;
    }

    /**
     * Gets the value of the inputMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputMask() {
        return inputMask;
    }

    /**
     * Sets the value of the inputMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputMask(String value) {
        this.inputMask = value;
    }

    /**
     * Gets the value of the displayRules property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayRules() {
        return displayRules;
    }

    /**
     * Sets the value of the displayRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayRules(String value) {
        this.displayRules = value;
    }

    /**
     * Gets the value of the allowedValues property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getAllowedValues() {
        return allowedValues;
    }

    /**
     * Sets the value of the allowedValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setAllowedValues(ArrayOfString value) {
        this.allowedValues = value;
    }

}
