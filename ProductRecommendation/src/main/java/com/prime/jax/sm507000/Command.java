
package com.prime.jax.sm507000;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Command complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Command">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Commit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IgnoreError" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LinkedCommand" type="{http://www.acumatica.com/typed/}Command" minOccurs="0"/>
 *         &lt;element name="Descriptor" type="{http://www.acumatica.com/typed/}ElementDescriptor" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Command", propOrder = {
    "fieldName",
    "objectName",
    "value",
    "commit",
    "ignoreError",
    "linkedCommand",
    "descriptor"
})
@XmlSeeAlso({
    Action.class,
    NewRow.class,
    DeleteRow.class,
    EveryValue.class,
    Answer.class,
    RowNumber.class,
    Field.class,
    Parameter.class,
    Key.class
})
public class Command {

    @XmlElement(name = "FieldName")
    protected String fieldName;
    @XmlElement(name = "ObjectName")
    protected String objectName;
    @XmlElement(name = "Value")
    protected String value;
    @XmlElement(name = "Commit", defaultValue = "false")
    protected Boolean commit;
    @XmlElement(name = "IgnoreError", defaultValue = "false")
    protected Boolean ignoreError;
    @XmlElement(name = "LinkedCommand")
    protected Command linkedCommand;
    @XmlElement(name = "Descriptor")
    protected ElementDescriptor descriptor;

    /**
     * Gets the value of the fieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**
     * Gets the value of the objectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * Sets the value of the objectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectName(String value) {
        this.objectName = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the commit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommit() {
        return commit;
    }

    /**
     * Sets the value of the commit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommit(Boolean value) {
        this.commit = value;
    }

    /**
     * Gets the value of the ignoreError property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreError() {
        return ignoreError;
    }

    /**
     * Sets the value of the ignoreError property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreError(Boolean value) {
        this.ignoreError = value;
    }

    /**
     * Gets the value of the linkedCommand property.
     * 
     * @return
     *     possible object is
     *     {@link Command }
     *     
     */
    public Command getLinkedCommand() {
        return linkedCommand;
    }

    /**
     * Sets the value of the linkedCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Command }
     *     
     */
    public void setLinkedCommand(Command value) {
        this.linkedCommand = value;
    }

    /**
     * Gets the value of the descriptor property.
     * 
     * @return
     *     possible object is
     *     {@link ElementDescriptor }
     *     
     */
    public ElementDescriptor getDescriptor() {
        return descriptor;
    }

    /**
     * Sets the value of the descriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementDescriptor }
     *     
     */
    public void setDescriptor(ElementDescriptor value) {
        this.descriptor = value;
    }

}
