
package com.prime.jax.sm507000;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Content complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Content">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Actions" type="{http://www.acumatica.com/typed/}Actions" minOccurs="0"/>
 *         &lt;element name="Selection" type="{http://www.acumatica.com/typed/}Selection" minOccurs="0"/>
 *         &lt;element name="Emails" type="{http://www.acumatica.com/typed/}Emails" minOccurs="0"/>
 *         &lt;element name="ScheduleHistoryParameters" type="{http://www.acumatica.com/typed/}ScheduleHistoryParameters" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Content", propOrder = {
    "actions",
    "selection",
    "emails",
    "scheduleHistoryParameters"
})
public class Content {

    @XmlElement(name = "Actions")
    protected Actions actions;
    @XmlElement(name = "Selection")
    protected Selection selection;
    @XmlElement(name = "Emails")
    protected Emails emails;
    @XmlElement(name = "ScheduleHistoryParameters")
    protected ScheduleHistoryParameters scheduleHistoryParameters;

    /**
     * Gets the value of the actions property.
     * 
     * @return
     *     possible object is
     *     {@link Actions }
     *     
     */
    public Actions getActions() {
        return actions;
    }

    /**
     * Sets the value of the actions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Actions }
     *     
     */
    public void setActions(Actions value) {
        this.actions = value;
    }

    /**
     * Gets the value of the selection property.
     * 
     * @return
     *     possible object is
     *     {@link Selection }
     *     
     */
    public Selection getSelection() {
        return selection;
    }

    /**
     * Sets the value of the selection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Selection }
     *     
     */
    public void setSelection(Selection value) {
        this.selection = value;
    }

    /**
     * Gets the value of the emails property.
     * 
     * @return
     *     possible object is
     *     {@link Emails }
     *     
     */
    public Emails getEmails() {
        return emails;
    }

    /**
     * Sets the value of the emails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Emails }
     *     
     */
    public void setEmails(Emails value) {
        this.emails = value;
    }

    /**
     * Gets the value of the scheduleHistoryParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleHistoryParameters }
     *     
     */
    public ScheduleHistoryParameters getScheduleHistoryParameters() {
        return scheduleHistoryParameters;
    }

    /**
     * Sets the value of the scheduleHistoryParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleHistoryParameters }
     *     
     */
    public void setScheduleHistoryParameters(ScheduleHistoryParameters value) {
        this.scheduleHistoryParameters = value;
    }

}
