
package com.prime.jax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SM203520Content complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SM203520Content">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Actions" type="{http://www.acumatica.com/generic/}SM203520Actions" minOccurs="0"/>
 *         &lt;element name="CompanySummary" type="{http://www.acumatica.com/generic/}SM203520CompanySummary" minOccurs="0"/>
 *         &lt;element name="Snapshots" type="{http://www.acumatica.com/generic/}SM203520Snapshots" minOccurs="0"/>
 *         &lt;element name="SnapshotRestorationHistory" type="{http://www.acumatica.com/generic/}SM203520SnapshotRestorationHistory" minOccurs="0"/>
 *         &lt;element name="Users" type="{http://www.acumatica.com/generic/}SM203520Users" minOccurs="0"/>
 *         &lt;element name="CopyCompany" type="{http://www.acumatica.com/generic/}SM203520CopyCompany" minOccurs="0"/>
 *         &lt;element name="CreateSnapshot" type="{http://www.acumatica.com/generic/}SM203520CreateSnapshot" minOccurs="0"/>
 *         &lt;element name="ResetData" type="{http://www.acumatica.com/generic/}SM203520ResetData" minOccurs="0"/>
 *         &lt;element name="RestoreSnapshot" type="{http://www.acumatica.com/generic/}SM203520RestoreSnapshot" minOccurs="0"/>
 *         &lt;element name="RestoreSnapshotOnProduction" type="{http://www.acumatica.com/generic/}SM203520RestoreSnapshotOnProduction" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SM203520Content", propOrder = {
    "actions",
    "companySummary",
    "snapshots",
    "snapshotRestorationHistory",
    "users",
    "copyCompany",
    "createSnapshot",
    "resetData",
    "restoreSnapshot",
    "restoreSnapshotOnProduction"
})
public class SM203520Content {

    @XmlElement(name = "Actions")
    protected SM203520Actions actions;
    @XmlElement(name = "CompanySummary")
    protected SM203520CompanySummary companySummary;
    @XmlElement(name = "Snapshots")
    protected SM203520Snapshots snapshots;
    @XmlElement(name = "SnapshotRestorationHistory")
    protected SM203520SnapshotRestorationHistory snapshotRestorationHistory;
    @XmlElement(name = "Users")
    protected SM203520Users users;
    @XmlElement(name = "CopyCompany")
    protected SM203520CopyCompany copyCompany;
    @XmlElement(name = "CreateSnapshot")
    protected SM203520CreateSnapshot createSnapshot;
    @XmlElement(name = "ResetData")
    protected SM203520ResetData resetData;
    @XmlElement(name = "RestoreSnapshot")
    protected SM203520RestoreSnapshot restoreSnapshot;
    @XmlElement(name = "RestoreSnapshotOnProduction")
    protected SM203520RestoreSnapshotOnProduction restoreSnapshotOnProduction;

    /**
     * Gets the value of the actions property.
     * 
     * @return
     *     possible object is
     *     {@link SM203520Actions }
     *     
     */
    public SM203520Actions getActions() {
        return actions;
    }

    /**
     * Sets the value of the actions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SM203520Actions }
     *     
     */
    public void setActions(SM203520Actions value) {
        this.actions = value;
    }

    /**
     * Gets the value of the companySummary property.
     * 
     * @return
     *     possible object is
     *     {@link SM203520CompanySummary }
     *     
     */
    public SM203520CompanySummary getCompanySummary() {
        return companySummary;
    }

    /**
     * Sets the value of the companySummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link SM203520CompanySummary }
     *     
     */
    public void setCompanySummary(SM203520CompanySummary value) {
        this.companySummary = value;
    }

    /**
     * Gets the value of the snapshots property.
     * 
     * @return
     *     possible object is
     *     {@link SM203520Snapshots }
     *     
     */
    public SM203520Snapshots getSnapshots() {
        return snapshots;
    }

    /**
     * Sets the value of the snapshots property.
     * 
     * @param value
     *     allowed object is
     *     {@link SM203520Snapshots }
     *     
     */
    public void setSnapshots(SM203520Snapshots value) {
        this.snapshots = value;
    }

    /**
     * Gets the value of the snapshotRestorationHistory property.
     * 
     * @return
     *     possible object is
     *     {@link SM203520SnapshotRestorationHistory }
     *     
     */
    public SM203520SnapshotRestorationHistory getSnapshotRestorationHistory() {
        return snapshotRestorationHistory;
    }

    /**
     * Sets the value of the snapshotRestorationHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link SM203520SnapshotRestorationHistory }
     *     
     */
    public void setSnapshotRestorationHistory(SM203520SnapshotRestorationHistory value) {
        this.snapshotRestorationHistory = value;
    }

    /**
     * Gets the value of the users property.
     * 
     * @return
     *     possible object is
     *     {@link SM203520Users }
     *     
     */
    public SM203520Users getUsers() {
        return users;
    }

    /**
     * Sets the value of the users property.
     * 
     * @param value
     *     allowed object is
     *     {@link SM203520Users }
     *     
     */
    public void setUsers(SM203520Users value) {
        this.users = value;
    }

    /**
     * Gets the value of the copyCompany property.
     * 
     * @return
     *     possible object is
     *     {@link SM203520CopyCompany }
     *     
     */
    public SM203520CopyCompany getCopyCompany() {
        return copyCompany;
    }

    /**
     * Sets the value of the copyCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link SM203520CopyCompany }
     *     
     */
    public void setCopyCompany(SM203520CopyCompany value) {
        this.copyCompany = value;
    }

    /**
     * Gets the value of the createSnapshot property.
     * 
     * @return
     *     possible object is
     *     {@link SM203520CreateSnapshot }
     *     
     */
    public SM203520CreateSnapshot getCreateSnapshot() {
        return createSnapshot;
    }

    /**
     * Sets the value of the createSnapshot property.
     * 
     * @param value
     *     allowed object is
     *     {@link SM203520CreateSnapshot }
     *     
     */
    public void setCreateSnapshot(SM203520CreateSnapshot value) {
        this.createSnapshot = value;
    }

    /**
     * Gets the value of the resetData property.
     * 
     * @return
     *     possible object is
     *     {@link SM203520ResetData }
     *     
     */
    public SM203520ResetData getResetData() {
        return resetData;
    }

    /**
     * Sets the value of the resetData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SM203520ResetData }
     *     
     */
    public void setResetData(SM203520ResetData value) {
        this.resetData = value;
    }

    /**
     * Gets the value of the restoreSnapshot property.
     * 
     * @return
     *     possible object is
     *     {@link SM203520RestoreSnapshot }
     *     
     */
    public SM203520RestoreSnapshot getRestoreSnapshot() {
        return restoreSnapshot;
    }

    /**
     * Sets the value of the restoreSnapshot property.
     * 
     * @param value
     *     allowed object is
     *     {@link SM203520RestoreSnapshot }
     *     
     */
    public void setRestoreSnapshot(SM203520RestoreSnapshot value) {
        this.restoreSnapshot = value;
    }

    /**
     * Gets the value of the restoreSnapshotOnProduction property.
     * 
     * @return
     *     possible object is
     *     {@link SM203520RestoreSnapshotOnProduction }
     *     
     */
    public SM203520RestoreSnapshotOnProduction getRestoreSnapshotOnProduction() {
        return restoreSnapshotOnProduction;
    }

    /**
     * Sets the value of the restoreSnapshotOnProduction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SM203520RestoreSnapshotOnProduction }
     *     
     */
    public void setRestoreSnapshotOnProduction(SM203520RestoreSnapshotOnProduction value) {
        this.restoreSnapshotOnProduction = value;
    }

}
