
package com.prime.jax.sm507000;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Emails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Emails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Selected" type="{http://www.acumatica.com/typed/}Field" minOccurs="0"/>
 *         &lt;element name="ScheduleID" type="{http://www.acumatica.com/typed/}Field" minOccurs="0"/>
 *         &lt;element name="ExecutionDate" type="{http://www.acumatica.com/typed/}Field" minOccurs="0"/>
 *         &lt;element name="ExecutionResult" type="{http://www.acumatica.com/typed/}Field" minOccurs="0"/>
 *         &lt;element name="EmailAccountID" type="{http://www.acumatica.com/typed/}Field" minOccurs="0"/>
 *         &lt;element name="Subject" type="{http://www.acumatica.com/typed/}Field" minOccurs="0"/>
 *         &lt;element name="From" type="{http://www.acumatica.com/typed/}Field" minOccurs="0"/>
 *         &lt;element name="To" type="{http://www.acumatica.com/typed/}Field" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.acumatica.com/typed/}Field" minOccurs="0"/>
 *         &lt;element name="Owner" type="{http://www.acumatica.com/typed/}Field" minOccurs="0"/>
 *         &lt;element name="MailStatus" type="{http://www.acumatica.com/typed/}Field" minOccurs="0"/>
 *         &lt;element name="NoteText" type="{http://www.acumatica.com/typed/}Field" minOccurs="0"/>
 *         &lt;element name="ServiceCommands" type="{http://www.acumatica.com/typed/}EmailsServiceCommands" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Emails", propOrder = {
    "displayName",
    "selected",
    "scheduleID",
    "executionDate",
    "executionResult",
    "emailAccountID",
    "subject",
    "from",
    "to",
    "startDate",
    "owner",
    "mailStatus",
    "noteText",
    "serviceCommands"
})
public class Emails {

    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "Selected")
    protected Field selected;
    @XmlElement(name = "ScheduleID")
    protected Field scheduleID;
    @XmlElement(name = "ExecutionDate")
    protected Field executionDate;
    @XmlElement(name = "ExecutionResult")
    protected Field executionResult;
    @XmlElement(name = "EmailAccountID")
    protected Field emailAccountID;
    @XmlElement(name = "Subject")
    protected Field subject;
    @XmlElement(name = "From")
    protected Field from;
    @XmlElement(name = "To")
    protected Field to;
    @XmlElement(name = "StartDate")
    protected Field startDate;
    @XmlElement(name = "Owner")
    protected Field owner;
    @XmlElement(name = "MailStatus")
    protected Field mailStatus;
    @XmlElement(name = "NoteText")
    protected Field noteText;
    @XmlElement(name = "ServiceCommands")
    protected EmailsServiceCommands serviceCommands;

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
     * Gets the value of the selected property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getSelected() {
        return selected;
    }

    /**
     * Sets the value of the selected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setSelected(Field value) {
        this.selected = value;
    }

    /**
     * Gets the value of the scheduleID property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getScheduleID() {
        return scheduleID;
    }

    /**
     * Sets the value of the scheduleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setScheduleID(Field value) {
        this.scheduleID = value;
    }

    /**
     * Gets the value of the executionDate property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getExecutionDate() {
        return executionDate;
    }

    /**
     * Sets the value of the executionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setExecutionDate(Field value) {
        this.executionDate = value;
    }

    /**
     * Gets the value of the executionResult property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getExecutionResult() {
        return executionResult;
    }

    /**
     * Sets the value of the executionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setExecutionResult(Field value) {
        this.executionResult = value;
    }

    /**
     * Gets the value of the emailAccountID property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getEmailAccountID() {
        return emailAccountID;
    }

    /**
     * Sets the value of the emailAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setEmailAccountID(Field value) {
        this.emailAccountID = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setSubject(Field value) {
        this.subject = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setFrom(Field value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setTo(Field value) {
        this.to = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setStartDate(Field value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setOwner(Field value) {
        this.owner = value;
    }

    /**
     * Gets the value of the mailStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getMailStatus() {
        return mailStatus;
    }

    /**
     * Sets the value of the mailStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setMailStatus(Field value) {
        this.mailStatus = value;
    }

    /**
     * Gets the value of the noteText property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getNoteText() {
        return noteText;
    }

    /**
     * Sets the value of the noteText property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setNoteText(Field value) {
        this.noteText = value;
    }

    /**
     * Gets the value of the serviceCommands property.
     * 
     * @return
     *     possible object is
     *     {@link EmailsServiceCommands }
     *     
     */
    public EmailsServiceCommands getServiceCommands() {
        return serviceCommands;
    }

    /**
     * Sets the value of the serviceCommands property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailsServiceCommands }
     *     
     */
    public void setServiceCommands(EmailsServiceCommands value) {
        this.serviceCommands = value;
    }

}
