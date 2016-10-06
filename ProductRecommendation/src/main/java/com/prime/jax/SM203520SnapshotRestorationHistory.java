
package com.prime.jax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SM203520SnapshotRestorationHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SM203520SnapshotRestorationHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SnapshotID" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="User" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="RestorationDate" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="ServiceCommands" type="{http://www.acumatica.com/generic/}SM203520SnapshotRestorationHistoryServiceCommands" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SM203520SnapshotRestorationHistory", propOrder = {
    "displayName",
    "snapshotID",
    "name",
    "description",
    "user",
    "restorationDate",
    "version",
    "serviceCommands"
})
public class SM203520SnapshotRestorationHistory {

    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "SnapshotID")
    protected Field snapshotID;
    @XmlElement(name = "Name")
    protected Field name;
    @XmlElement(name = "Description")
    protected Field description;
    @XmlElement(name = "User")
    protected Field user;
    @XmlElement(name = "RestorationDate")
    protected Field restorationDate;
    @XmlElement(name = "Version")
    protected Field version;
    @XmlElement(name = "ServiceCommands")
    protected SM203520SnapshotRestorationHistoryServiceCommands serviceCommands;

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
     * Gets the value of the snapshotID property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getSnapshotID() {
        return snapshotID;
    }

    /**
     * Sets the value of the snapshotID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setSnapshotID(Field value) {
        this.snapshotID = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setName(Field value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setDescription(Field value) {
        this.description = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setUser(Field value) {
        this.user = value;
    }

    /**
     * Gets the value of the restorationDate property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getRestorationDate() {
        return restorationDate;
    }

    /**
     * Sets the value of the restorationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setRestorationDate(Field value) {
        this.restorationDate = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setVersion(Field value) {
        this.version = value;
    }

    /**
     * Gets the value of the serviceCommands property.
     * 
     * @return
     *     possible object is
     *     {@link SM203520SnapshotRestorationHistoryServiceCommands }
     *     
     */
    public SM203520SnapshotRestorationHistoryServiceCommands getServiceCommands() {
        return serviceCommands;
    }

    /**
     * Sets the value of the serviceCommands property.
     * 
     * @param value
     *     allowed object is
     *     {@link SM203520SnapshotRestorationHistoryServiceCommands }
     *     
     */
    public void setServiceCommands(SM203520SnapshotRestorationHistoryServiceCommands value) {
        this.serviceCommands = value;
    }

}
