
package com.prime.jax.sm507000;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelectionServiceCommands complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectionServiceCommands">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EveryAccount" type="{http://www.acumatica.com/typed/}EveryValue" minOccurs="0"/>
 *         &lt;element name="EveryOwner" type="{http://www.acumatica.com/typed/}EveryValue" minOccurs="0"/>
 *         &lt;element name="EveryType" type="{http://www.acumatica.com/typed/}EveryValue" minOccurs="0"/>
 *         &lt;element name="DeleteRow" type="{http://www.acumatica.com/typed/}DeleteRow" minOccurs="0"/>
 *         &lt;element name="DialogAnswer" type="{http://www.acumatica.com/typed/}Answer" minOccurs="0"/>
 *         &lt;element name="Attachment" type="{http://www.acumatica.com/typed/}Attachment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectionServiceCommands", propOrder = {
    "everyAccount",
    "everyOwner",
    "everyType",
    "deleteRow",
    "dialogAnswer",
    "attachment"
})
public class SelectionServiceCommands {

    @XmlElement(name = "EveryAccount")
    protected EveryValue everyAccount;
    @XmlElement(name = "EveryOwner")
    protected EveryValue everyOwner;
    @XmlElement(name = "EveryType")
    protected EveryValue everyType;
    @XmlElement(name = "DeleteRow")
    protected DeleteRow deleteRow;
    @XmlElement(name = "DialogAnswer")
    protected Answer dialogAnswer;
    @XmlElement(name = "Attachment")
    protected Attachment attachment;

    /**
     * Gets the value of the everyAccount property.
     * 
     * @return
     *     possible object is
     *     {@link EveryValue }
     *     
     */
    public EveryValue getEveryAccount() {
        return everyAccount;
    }

    /**
     * Sets the value of the everyAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link EveryValue }
     *     
     */
    public void setEveryAccount(EveryValue value) {
        this.everyAccount = value;
    }

    /**
     * Gets the value of the everyOwner property.
     * 
     * @return
     *     possible object is
     *     {@link EveryValue }
     *     
     */
    public EveryValue getEveryOwner() {
        return everyOwner;
    }

    /**
     * Sets the value of the everyOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link EveryValue }
     *     
     */
    public void setEveryOwner(EveryValue value) {
        this.everyOwner = value;
    }

    /**
     * Gets the value of the everyType property.
     * 
     * @return
     *     possible object is
     *     {@link EveryValue }
     *     
     */
    public EveryValue getEveryType() {
        return everyType;
    }

    /**
     * Sets the value of the everyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EveryValue }
     *     
     */
    public void setEveryType(EveryValue value) {
        this.everyType = value;
    }

    /**
     * Gets the value of the deleteRow property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteRow }
     *     
     */
    public DeleteRow getDeleteRow() {
        return deleteRow;
    }

    /**
     * Sets the value of the deleteRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteRow }
     *     
     */
    public void setDeleteRow(DeleteRow value) {
        this.deleteRow = value;
    }

    /**
     * Gets the value of the dialogAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link Answer }
     *     
     */
    public Answer getDialogAnswer() {
        return dialogAnswer;
    }

    /**
     * Sets the value of the dialogAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Answer }
     *     
     */
    public void setDialogAnswer(Answer value) {
        this.dialogAnswer = value;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * @return
     *     possible object is
     *     {@link Attachment }
     *     
     */
    public Attachment getAttachment() {
        return attachment;
    }

    /**
     * Sets the value of the attachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachment }
     *     
     */
    public void setAttachment(Attachment value) {
        this.attachment = value;
    }

}
