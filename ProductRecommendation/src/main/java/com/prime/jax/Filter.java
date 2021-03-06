
package com.prime.jax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Filter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Filter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Field" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="Condition" type="{http://www.acumatica.com/generic/}FilterCondition"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="Value2" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="OpenBrackets" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CloseBrackets" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Operator" type="{http://www.acumatica.com/generic/}FilterOperator"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Filter", propOrder = {
    "field",
    "condition",
    "value",
    "value2",
    "openBrackets",
    "closeBrackets",
    "operator"
})
public class Filter {

    @XmlElement(name = "Field")
    protected Field field;
    @XmlElement(name = "Condition", required = true)
    @XmlSchemaType(name = "string")
    protected FilterCondition condition;
    @XmlElement(name = "Value")
    protected Object value;
    @XmlElement(name = "Value2")
    protected Object value2;
    @XmlElement(name = "OpenBrackets")
    protected int openBrackets;
    @XmlElement(name = "CloseBrackets")
    protected int closeBrackets;
    @XmlElement(name = "Operator", required = true)
    @XmlSchemaType(name = "string")
    protected FilterOperator operator;

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setField(Field value) {
        this.field = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link FilterCondition }
     *     
     */
    public FilterCondition getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterCondition }
     *     
     */
    public void setCondition(FilterCondition value) {
        this.condition = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setValue(Object value) {
        this.value = value;
    }

    /**
     * Gets the value of the value2 property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getValue2() {
        return value2;
    }

    /**
     * Sets the value of the value2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setValue2(Object value) {
        this.value2 = value;
    }

    /**
     * Gets the value of the openBrackets property.
     * 
     */
    public int getOpenBrackets() {
        return openBrackets;
    }

    /**
     * Sets the value of the openBrackets property.
     * 
     */
    public void setOpenBrackets(int value) {
        this.openBrackets = value;
    }

    /**
     * Gets the value of the closeBrackets property.
     * 
     */
    public int getCloseBrackets() {
        return closeBrackets;
    }

    /**
     * Sets the value of the closeBrackets property.
     * 
     */
    public void setCloseBrackets(int value) {
        this.closeBrackets = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link FilterOperator }
     *     
     */
    public FilterOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterOperator }
     *     
     */
    public void setOperator(FilterOperator value) {
        this.operator = value;
    }

}
