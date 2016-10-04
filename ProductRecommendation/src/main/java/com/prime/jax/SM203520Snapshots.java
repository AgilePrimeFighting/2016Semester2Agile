
package com.prime.jax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SM203520Snapshots complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SM203520Snapshots">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SnapshotID" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="ReadyForExport" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="SizeMB" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="ExportMode" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="CompanyID" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="Customisation" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="NoteText" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="ServiceCommands" type="{http://www.acumatica.com/generic/}SM203520SnapshotsServiceCommands" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SM203520Snapshots", propOrder = {
    "displayName",
    "snapshotID",
    "name",
    "description",
    "readyForExport",
    "sizeMB",
    "creationDate",
    "version",
    "exportMode",
    "companyID",
    "customisation",
    "noteText",
    "serviceCommands"
})
public class SM203520Snapshots {

    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "SnapshotID")
    protected Field snapshotID;
    @XmlElement(name = "Name")
    protected Field name;
    @XmlElement(name = "Description")
    protected Field description;
    @XmlElement(name = "ReadyForExport")
    protected Field readyForExport;
    @XmlElement(name = "SizeMB")
    protected Field sizeMB;
    @XmlElement(name = "CreationDate")
    protected Field creationDate;
    @XmlElement(name = "Version")
    protected Field version;
    @XmlElement(name = "ExportMode")
    protected Field exportMode;
    @XmlElement(name = "CompanyID")
    protected Field companyID;
    @XmlElement(name = "Customisation")
    protected Field customisation;
    @XmlElement(name = "NoteText")
    protected Field noteText;
    @XmlElement(name = "ServiceCommands")
    protected SM203520SnapshotsServiceCommands serviceCommands;

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
     * Gets the value of the readyForExport property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getReadyForExport() {
        return readyForExport;
    }

    /**
     * Sets the value of the readyForExport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setReadyForExport(Field value) {
        this.readyForExport = value;
    }

    /**
     * Gets the value of the sizeMB property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getSizeMB() {
        return sizeMB;
    }

    /**
     * Sets the value of the sizeMB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setSizeMB(Field value) {
        this.sizeMB = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setCreationDate(Field value) {
        this.creationDate = value;
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
     * Gets the value of the exportMode property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getExportMode() {
        return exportMode;
    }

    /**
     * Sets the value of the exportMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setExportMode(Field value) {
        this.exportMode = value;
    }

    /**
     * Gets the value of the companyID property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getCompanyID() {
        return companyID;
    }

    /**
     * Sets the value of the companyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setCompanyID(Field value) {
        this.companyID = value;
    }

    /**
     * Gets the value of the customisation property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getCustomisation() {
        return customisation;
    }

    /**
     * Sets the value of the customisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setCustomisation(Field value) {
        this.customisation = value;
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
     *     {@link SM203520SnapshotsServiceCommands }
     *     
     */
    public SM203520SnapshotsServiceCommands getServiceCommands() {
        return serviceCommands;
    }

    /**
     * Sets the value of the serviceCommands property.
     * 
     * @param value
     *     allowed object is
     *     {@link SM203520SnapshotsServiceCommands }
     *     
     */
    public void setServiceCommands(SM203520SnapshotsServiceCommands value) {
        this.serviceCommands = value;
    }

}
