
package com.prime.jax.sm507000;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Actions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Actions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cancel" type="{http://www.acumatica.com/typed/}Action" minOccurs="0"/>
 *         &lt;element name="Process" type="{http://www.acumatica.com/typed/}Action" minOccurs="0"/>
 *         &lt;element name="ProcessAll" type="{http://www.acumatica.com/typed/}Action" minOccurs="0"/>
 *         &lt;element name="ScheduleAdd" type="{http://www.acumatica.com/typed/}Action" minOccurs="0"/>
 *         &lt;element name="ScheduleView" type="{http://www.acumatica.com/typed/}Action" minOccurs="0"/>
 *         &lt;element name="ScheduleHistory" type="{http://www.acumatica.com/typed/}Action" minOccurs="0"/>
 *         &lt;element name="ScheduleHistoryDelete" type="{http://www.acumatica.com/typed/}Action" minOccurs="0"/>
 *         &lt;element name="ScheduleHistoryDeleteAll" type="{http://www.acumatica.com/typed/}Action" minOccurs="0"/>
 *         &lt;element name="ScheduleHistorySchedule" type="{http://www.acumatica.com/typed/}Action" minOccurs="0"/>
 *         &lt;element name="ScheduleHistoryDeleteSchedule" type="{http://www.acumatica.com/typed/}Action" minOccurs="0"/>
 *         &lt;element name="ScheduleHistoryDeleteAllSchedule" type="{http://www.acumatica.com/typed/}Action" minOccurs="0"/>
 *         &lt;element name="ScheduleAddSchedule" type="{http://www.acumatica.com/typed/}Action" minOccurs="0"/>
 *         &lt;element name="ScheduleViewSchedule" type="{http://www.acumatica.com/typed/}Action" minOccurs="0"/>
 *         &lt;element name="ViewDetails" type="{http://www.acumatica.com/typed/}Action" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Actions", propOrder = {
    "cancel",
    "process",
    "processAll",
    "scheduleAdd",
    "scheduleView",
    "scheduleHistory",
    "scheduleHistoryDelete",
    "scheduleHistoryDeleteAll",
    "scheduleHistorySchedule",
    "scheduleHistoryDeleteSchedule",
    "scheduleHistoryDeleteAllSchedule",
    "scheduleAddSchedule",
    "scheduleViewSchedule",
    "viewDetails"
})
public class Actions {

    @XmlElement(name = "Cancel")
    protected Action cancel;
    @XmlElement(name = "Process")
    protected Action process;
    @XmlElement(name = "ProcessAll")
    protected Action processAll;
    @XmlElement(name = "ScheduleAdd")
    protected Action scheduleAdd;
    @XmlElement(name = "ScheduleView")
    protected Action scheduleView;
    @XmlElement(name = "ScheduleHistory")
    protected Action scheduleHistory;
    @XmlElement(name = "ScheduleHistoryDelete")
    protected Action scheduleHistoryDelete;
    @XmlElement(name = "ScheduleHistoryDeleteAll")
    protected Action scheduleHistoryDeleteAll;
    @XmlElement(name = "ScheduleHistorySchedule")
    protected Action scheduleHistorySchedule;
    @XmlElement(name = "ScheduleHistoryDeleteSchedule")
    protected Action scheduleHistoryDeleteSchedule;
    @XmlElement(name = "ScheduleHistoryDeleteAllSchedule")
    protected Action scheduleHistoryDeleteAllSchedule;
    @XmlElement(name = "ScheduleAddSchedule")
    protected Action scheduleAddSchedule;
    @XmlElement(name = "ScheduleViewSchedule")
    protected Action scheduleViewSchedule;
    @XmlElement(name = "ViewDetails")
    protected Action viewDetails;

    /**
     * Gets the value of the cancel property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getCancel() {
        return cancel;
    }

    /**
     * Sets the value of the cancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setCancel(Action value) {
        this.cancel = value;
    }

    /**
     * Gets the value of the process property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getProcess() {
        return process;
    }

    /**
     * Sets the value of the process property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setProcess(Action value) {
        this.process = value;
    }

    /**
     * Gets the value of the processAll property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getProcessAll() {
        return processAll;
    }

    /**
     * Sets the value of the processAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setProcessAll(Action value) {
        this.processAll = value;
    }

    /**
     * Gets the value of the scheduleAdd property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getScheduleAdd() {
        return scheduleAdd;
    }

    /**
     * Sets the value of the scheduleAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setScheduleAdd(Action value) {
        this.scheduleAdd = value;
    }

    /**
     * Gets the value of the scheduleView property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getScheduleView() {
        return scheduleView;
    }

    /**
     * Sets the value of the scheduleView property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setScheduleView(Action value) {
        this.scheduleView = value;
    }

    /**
     * Gets the value of the scheduleHistory property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getScheduleHistory() {
        return scheduleHistory;
    }

    /**
     * Sets the value of the scheduleHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setScheduleHistory(Action value) {
        this.scheduleHistory = value;
    }

    /**
     * Gets the value of the scheduleHistoryDelete property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getScheduleHistoryDelete() {
        return scheduleHistoryDelete;
    }

    /**
     * Sets the value of the scheduleHistoryDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setScheduleHistoryDelete(Action value) {
        this.scheduleHistoryDelete = value;
    }

    /**
     * Gets the value of the scheduleHistoryDeleteAll property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getScheduleHistoryDeleteAll() {
        return scheduleHistoryDeleteAll;
    }

    /**
     * Sets the value of the scheduleHistoryDeleteAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setScheduleHistoryDeleteAll(Action value) {
        this.scheduleHistoryDeleteAll = value;
    }

    /**
     * Gets the value of the scheduleHistorySchedule property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getScheduleHistorySchedule() {
        return scheduleHistorySchedule;
    }

    /**
     * Sets the value of the scheduleHistorySchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setScheduleHistorySchedule(Action value) {
        this.scheduleHistorySchedule = value;
    }

    /**
     * Gets the value of the scheduleHistoryDeleteSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getScheduleHistoryDeleteSchedule() {
        return scheduleHistoryDeleteSchedule;
    }

    /**
     * Sets the value of the scheduleHistoryDeleteSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setScheduleHistoryDeleteSchedule(Action value) {
        this.scheduleHistoryDeleteSchedule = value;
    }

    /**
     * Gets the value of the scheduleHistoryDeleteAllSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getScheduleHistoryDeleteAllSchedule() {
        return scheduleHistoryDeleteAllSchedule;
    }

    /**
     * Sets the value of the scheduleHistoryDeleteAllSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setScheduleHistoryDeleteAllSchedule(Action value) {
        this.scheduleHistoryDeleteAllSchedule = value;
    }

    /**
     * Gets the value of the scheduleAddSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getScheduleAddSchedule() {
        return scheduleAddSchedule;
    }

    /**
     * Sets the value of the scheduleAddSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setScheduleAddSchedule(Action value) {
        this.scheduleAddSchedule = value;
    }

    /**
     * Gets the value of the scheduleViewSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getScheduleViewSchedule() {
        return scheduleViewSchedule;
    }

    /**
     * Sets the value of the scheduleViewSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setScheduleViewSchedule(Action value) {
        this.scheduleViewSchedule = value;
    }

    /**
     * Gets the value of the viewDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getViewDetails() {
        return viewDetails;
    }

    /**
     * Sets the value of the viewDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setViewDetails(Action value) {
        this.viewDetails = value;
    }

}
