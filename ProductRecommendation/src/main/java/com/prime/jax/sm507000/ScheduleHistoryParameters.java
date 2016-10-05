
package com.prime.jax.sm507000;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScheduleHistoryParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduleHistoryParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScheduleID" type="{http://www.acumatica.com/typed/}Field" minOccurs="0"/>
 *         &lt;element name="ScheduleIDDescription" type="{http://www.acumatica.com/typed/}Field" minOccurs="0"/>
 *         &lt;element name="FromDateTime" type="{http://www.acumatica.com/typed/}Field" minOccurs="0"/>
 *         &lt;element name="ToDateTime" type="{http://www.acumatica.com/typed/}Field" minOccurs="0"/>
 *         &lt;element name="ServiceCommands" type="{http://www.acumatica.com/typed/}ScheduleHistoryParametersServiceCommands" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleHistoryParameters", propOrder = {
    "displayName",
    "scheduleID",
    "scheduleIDDescription",
    "fromDateTime",
    "toDateTime",
    "serviceCommands"
})
public class ScheduleHistoryParameters {

    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "ScheduleID")
    protected Field scheduleID;
    @XmlElement(name = "ScheduleIDDescription")
    protected Field scheduleIDDescription;
    @XmlElement(name = "FromDateTime")
    protected Field fromDateTime;
    @XmlElement(name = "ToDateTime")
    protected Field toDateTime;
    @XmlElement(name = "ServiceCommands")
    protected ScheduleHistoryParametersServiceCommands serviceCommands;

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
     * Gets the value of the scheduleIDDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getScheduleIDDescription() {
        return scheduleIDDescription;
    }

    /**
     * Sets the value of the scheduleIDDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setScheduleIDDescription(Field value) {
        this.scheduleIDDescription = value;
    }

    /**
     * Gets the value of the fromDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getFromDateTime() {
        return fromDateTime;
    }

    /**
     * Sets the value of the fromDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setFromDateTime(Field value) {
        this.fromDateTime = value;
    }

    /**
     * Gets the value of the toDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getToDateTime() {
        return toDateTime;
    }

    /**
     * Sets the value of the toDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setToDateTime(Field value) {
        this.toDateTime = value;
    }

    /**
     * Gets the value of the serviceCommands property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleHistoryParametersServiceCommands }
     *     
     */
    public ScheduleHistoryParametersServiceCommands getServiceCommands() {
        return serviceCommands;
    }

    /**
     * Sets the value of the serviceCommands property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleHistoryParametersServiceCommands }
     *     
     */
    public void setServiceCommands(ScheduleHistoryParametersServiceCommands value) {
        this.serviceCommands = value;
    }

}
