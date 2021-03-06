
package com.prime.jax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SM203520Actions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SM203520Actions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SaveCompanyCommand" type="{http://www.acumatica.com/generic/}Action" minOccurs="0"/>
 *         &lt;element name="Cancel" type="{http://www.acumatica.com/generic/}Action" minOccurs="0"/>
 *         &lt;element name="InsertCompanyCommand" type="{http://www.acumatica.com/generic/}Action" minOccurs="0"/>
 *         &lt;element name="DeleteCompanyCommand" type="{http://www.acumatica.com/generic/}Action" minOccurs="0"/>
 *         &lt;element name="Previous" type="{http://www.acumatica.com/generic/}Action" minOccurs="0"/>
 *         &lt;element name="Next" type="{http://www.acumatica.com/generic/}Action" minOccurs="0"/>
 *         &lt;element name="CopyCompanyCommand" type="{http://www.acumatica.com/generic/}Action" minOccurs="0"/>
 *         &lt;element name="ExportSnapshotCommand" type="{http://www.acumatica.com/generic/}Action" minOccurs="0"/>
 *         &lt;element name="ReloadSnapshotCommand" type="{http://www.acumatica.com/generic/}Action" minOccurs="0"/>
 *         &lt;element name="PrepareAdbSnapshotCommandPrepareSnapshotCommand" type="{http://www.acumatica.com/generic/}Action" minOccurs="0"/>
 *         &lt;element name="PrepareXmlSnapshotCommandPrepareSnapshotCommand" type="{http://www.acumatica.com/generic/}Action" minOccurs="0"/>
 *         &lt;element name="PrepareXmlSnapshotCommand" type="{http://www.acumatica.com/generic/}Action" minOccurs="0"/>
 *         &lt;element name="PrepareAdbSnapshotCommand" type="{http://www.acumatica.com/generic/}Action" minOccurs="0"/>
 *         &lt;element name="ImportSnapshotCommand" type="{http://www.acumatica.com/generic/}Action" minOccurs="0"/>
 *         &lt;element name="DownloadSnapshotCommand" type="{http://www.acumatica.com/generic/}Action" minOccurs="0"/>
 *         &lt;element name="UploadSnapshotCommand" type="{http://www.acumatica.com/generic/}Action" minOccurs="0"/>
 *         &lt;element name="ManageUsersCommand" type="{http://www.acumatica.com/generic/}Action" minOccurs="0"/>
 *         &lt;element name="ChangeVisibilityCommand" type="{http://www.acumatica.com/generic/}Action" minOccurs="0"/>
 *         &lt;element name="TrialCompanyCommand" type="{http://www.acumatica.com/generic/}Action" minOccurs="0"/>
 *         &lt;element name="DeleteOrphanedRows" type="{http://www.acumatica.com/generic/}Action" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SM203520Actions", propOrder = {
    "saveCompanyCommand",
    "cancel",
    "insertCompanyCommand",
    "deleteCompanyCommand",
    "previous",
    "next",
    "copyCompanyCommand",
    "exportSnapshotCommand",
    "reloadSnapshotCommand",
    "prepareAdbSnapshotCommandPrepareSnapshotCommand",
    "prepareXmlSnapshotCommandPrepareSnapshotCommand",
    "prepareXmlSnapshotCommand",
    "prepareAdbSnapshotCommand",
    "importSnapshotCommand",
    "downloadSnapshotCommand",
    "uploadSnapshotCommand",
    "manageUsersCommand",
    "changeVisibilityCommand",
    "trialCompanyCommand",
    "deleteOrphanedRows"
})
public class SM203520Actions {

    @XmlElement(name = "SaveCompanyCommand")
    protected Action saveCompanyCommand;
    @XmlElement(name = "Cancel")
    protected Action cancel;
    @XmlElement(name = "InsertCompanyCommand")
    protected Action insertCompanyCommand;
    @XmlElement(name = "DeleteCompanyCommand")
    protected Action deleteCompanyCommand;
    @XmlElement(name = "Previous")
    protected Action previous;
    @XmlElement(name = "Next")
    protected Action next;
    @XmlElement(name = "CopyCompanyCommand")
    protected Action copyCompanyCommand;
    @XmlElement(name = "ExportSnapshotCommand")
    protected Action exportSnapshotCommand;
    @XmlElement(name = "ReloadSnapshotCommand")
    protected Action reloadSnapshotCommand;
    @XmlElement(name = "PrepareAdbSnapshotCommandPrepareSnapshotCommand")
    protected Action prepareAdbSnapshotCommandPrepareSnapshotCommand;
    @XmlElement(name = "PrepareXmlSnapshotCommandPrepareSnapshotCommand")
    protected Action prepareXmlSnapshotCommandPrepareSnapshotCommand;
    @XmlElement(name = "PrepareXmlSnapshotCommand")
    protected Action prepareXmlSnapshotCommand;
    @XmlElement(name = "PrepareAdbSnapshotCommand")
    protected Action prepareAdbSnapshotCommand;
    @XmlElement(name = "ImportSnapshotCommand")
    protected Action importSnapshotCommand;
    @XmlElement(name = "DownloadSnapshotCommand")
    protected Action downloadSnapshotCommand;
    @XmlElement(name = "UploadSnapshotCommand")
    protected Action uploadSnapshotCommand;
    @XmlElement(name = "ManageUsersCommand")
    protected Action manageUsersCommand;
    @XmlElement(name = "ChangeVisibilityCommand")
    protected Action changeVisibilityCommand;
    @XmlElement(name = "TrialCompanyCommand")
    protected Action trialCompanyCommand;
    @XmlElement(name = "DeleteOrphanedRows")
    protected Action deleteOrphanedRows;

    /**
     * Gets the value of the saveCompanyCommand property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getSaveCompanyCommand() {
        return saveCompanyCommand;
    }

    /**
     * Sets the value of the saveCompanyCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setSaveCompanyCommand(Action value) {
        this.saveCompanyCommand = value;
    }

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
     * Gets the value of the insertCompanyCommand property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getInsertCompanyCommand() {
        return insertCompanyCommand;
    }

    /**
     * Sets the value of the insertCompanyCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setInsertCompanyCommand(Action value) {
        this.insertCompanyCommand = value;
    }

    /**
     * Gets the value of the deleteCompanyCommand property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getDeleteCompanyCommand() {
        return deleteCompanyCommand;
    }

    /**
     * Sets the value of the deleteCompanyCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setDeleteCompanyCommand(Action value) {
        this.deleteCompanyCommand = value;
    }

    /**
     * Gets the value of the previous property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getPrevious() {
        return previous;
    }

    /**
     * Sets the value of the previous property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setPrevious(Action value) {
        this.previous = value;
    }

    /**
     * Gets the value of the next property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getNext() {
        return next;
    }

    /**
     * Sets the value of the next property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setNext(Action value) {
        this.next = value;
    }

    /**
     * Gets the value of the copyCompanyCommand property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getCopyCompanyCommand() {
        return copyCompanyCommand;
    }

    /**
     * Sets the value of the copyCompanyCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setCopyCompanyCommand(Action value) {
        this.copyCompanyCommand = value;
    }

    /**
     * Gets the value of the exportSnapshotCommand property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getExportSnapshotCommand() {
        return exportSnapshotCommand;
    }

    /**
     * Sets the value of the exportSnapshotCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setExportSnapshotCommand(Action value) {
        this.exportSnapshotCommand = value;
    }

    /**
     * Gets the value of the reloadSnapshotCommand property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getReloadSnapshotCommand() {
        return reloadSnapshotCommand;
    }

    /**
     * Sets the value of the reloadSnapshotCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setReloadSnapshotCommand(Action value) {
        this.reloadSnapshotCommand = value;
    }

    /**
     * Gets the value of the prepareAdbSnapshotCommandPrepareSnapshotCommand property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getPrepareAdbSnapshotCommandPrepareSnapshotCommand() {
        return prepareAdbSnapshotCommandPrepareSnapshotCommand;
    }

    /**
     * Sets the value of the prepareAdbSnapshotCommandPrepareSnapshotCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setPrepareAdbSnapshotCommandPrepareSnapshotCommand(Action value) {
        this.prepareAdbSnapshotCommandPrepareSnapshotCommand = value;
    }

    /**
     * Gets the value of the prepareXmlSnapshotCommandPrepareSnapshotCommand property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getPrepareXmlSnapshotCommandPrepareSnapshotCommand() {
        return prepareXmlSnapshotCommandPrepareSnapshotCommand;
    }

    /**
     * Sets the value of the prepareXmlSnapshotCommandPrepareSnapshotCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setPrepareXmlSnapshotCommandPrepareSnapshotCommand(Action value) {
        this.prepareXmlSnapshotCommandPrepareSnapshotCommand = value;
    }

    /**
     * Gets the value of the prepareXmlSnapshotCommand property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getPrepareXmlSnapshotCommand() {
        return prepareXmlSnapshotCommand;
    }

    /**
     * Sets the value of the prepareXmlSnapshotCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setPrepareXmlSnapshotCommand(Action value) {
        this.prepareXmlSnapshotCommand = value;
    }

    /**
     * Gets the value of the prepareAdbSnapshotCommand property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getPrepareAdbSnapshotCommand() {
        return prepareAdbSnapshotCommand;
    }

    /**
     * Sets the value of the prepareAdbSnapshotCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setPrepareAdbSnapshotCommand(Action value) {
        this.prepareAdbSnapshotCommand = value;
    }

    /**
     * Gets the value of the importSnapshotCommand property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getImportSnapshotCommand() {
        return importSnapshotCommand;
    }

    /**
     * Sets the value of the importSnapshotCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setImportSnapshotCommand(Action value) {
        this.importSnapshotCommand = value;
    }

    /**
     * Gets the value of the downloadSnapshotCommand property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getDownloadSnapshotCommand() {
        return downloadSnapshotCommand;
    }

    /**
     * Sets the value of the downloadSnapshotCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setDownloadSnapshotCommand(Action value) {
        this.downloadSnapshotCommand = value;
    }

    /**
     * Gets the value of the uploadSnapshotCommand property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getUploadSnapshotCommand() {
        return uploadSnapshotCommand;
    }

    /**
     * Sets the value of the uploadSnapshotCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setUploadSnapshotCommand(Action value) {
        this.uploadSnapshotCommand = value;
    }

    /**
     * Gets the value of the manageUsersCommand property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getManageUsersCommand() {
        return manageUsersCommand;
    }

    /**
     * Sets the value of the manageUsersCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setManageUsersCommand(Action value) {
        this.manageUsersCommand = value;
    }

    /**
     * Gets the value of the changeVisibilityCommand property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getChangeVisibilityCommand() {
        return changeVisibilityCommand;
    }

    /**
     * Sets the value of the changeVisibilityCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setChangeVisibilityCommand(Action value) {
        this.changeVisibilityCommand = value;
    }

    /**
     * Gets the value of the trialCompanyCommand property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getTrialCompanyCommand() {
        return trialCompanyCommand;
    }

    /**
     * Sets the value of the trialCompanyCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setTrialCompanyCommand(Action value) {
        this.trialCompanyCommand = value;
    }

    /**
     * Gets the value of the deleteOrphanedRows property.
     * 
     * @return
     *     possible object is
     *     {@link Action }
     *     
     */
    public Action getDeleteOrphanedRows() {
        return deleteOrphanedRows;
    }

    /**
     * Sets the value of the deleteOrphanedRows property.
     * 
     * @param value
     *     allowed object is
     *     {@link Action }
     *     
     */
    public void setDeleteOrphanedRows(Action value) {
        this.deleteOrphanedRows = value;
    }

}
