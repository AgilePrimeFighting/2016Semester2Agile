
package com.prime.jax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SM201010UserInformationServiceCommands complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SM201010UserInformationServiceCommands">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyLogin" type="{http://www.acumatica.com/generic/}Key" minOccurs="0"/>
 *         &lt;element name="EveryLogin" type="{http://www.acumatica.com/generic/}EveryValue" minOccurs="0"/>
 *         &lt;element name="DeleteRow" type="{http://www.acumatica.com/generic/}DeleteRow" minOccurs="0"/>
 *         &lt;element name="DialogAnswer" type="{http://www.acumatica.com/generic/}Answer" minOccurs="0"/>
 *         &lt;element name="Attachment" type="{http://www.acumatica.com/generic/}Attachment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SM201010UserInformationServiceCommands", propOrder = {
    "keyLogin",
    "everyLogin",
    "deleteRow",
    "dialogAnswer",
    "attachment"
})
public class SM201010UserInformationServiceCommands {

    @XmlElement(name = "KeyLogin")
    protected Key keyLogin;
    @XmlElement(name = "EveryLogin")
    protected EveryValue everyLogin;
    @XmlElement(name = "DeleteRow")
    protected DeleteRow deleteRow;
    @XmlElement(name = "DialogAnswer")
    protected Answer dialogAnswer;
    @XmlElement(name = "Attachment")
    protected Attachment attachment;

    /**
     * Gets the value of the keyLogin property.
     * 
     * @return
     *     possible object is
     *     {@link Key }
     *     
     */
    public Key getKeyLogin() {
        return keyLogin;
    }

    /**
     * Sets the value of the keyLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Key }
     *     
     */
    public void setKeyLogin(Key value) {
        this.keyLogin = value;
    }

    /**
     * Gets the value of the everyLogin property.
     * 
     * @return
     *     possible object is
     *     {@link EveryValue }
     *     
     */
    public EveryValue getEveryLogin() {
        return everyLogin;
    }

    /**
     * Sets the value of the everyLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EveryValue }
     *     
     */
    public void setEveryLogin(EveryValue value) {
        this.everyLogin = value;
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
