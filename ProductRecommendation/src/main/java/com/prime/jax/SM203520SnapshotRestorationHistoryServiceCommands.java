
package com.prime.jax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SM203520SnapshotRestorationHistoryServiceCommands complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SM203520SnapshotRestorationHistoryServiceCommands">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NewRow" type="{http://www.acumatica.com/generic/}NewRow" minOccurs="0"/>
 *         &lt;element name="RowNumber" type="{http://www.acumatica.com/generic/}RowNumber" minOccurs="0"/>
 *         &lt;element name="DeleteRow" type="{http://www.acumatica.com/generic/}DeleteRow" minOccurs="0"/>
 *         &lt;element name="DialogAnswer" type="{http://www.acumatica.com/generic/}Answer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SM203520SnapshotRestorationHistoryServiceCommands", propOrder = {
    "newRow",
    "rowNumber",
    "deleteRow",
    "dialogAnswer"
})
public class SM203520SnapshotRestorationHistoryServiceCommands {

    @XmlElement(name = "NewRow")
    protected NewRow newRow;
    @XmlElement(name = "RowNumber")
    protected RowNumber rowNumber;
    @XmlElement(name = "DeleteRow")
    protected DeleteRow deleteRow;
    @XmlElement(name = "DialogAnswer")
    protected Answer dialogAnswer;

    /**
     * Gets the value of the newRow property.
     * 
     * @return
     *     possible object is
     *     {@link NewRow }
     *     
     */
    public NewRow getNewRow() {
        return newRow;
    }

    /**
     * Sets the value of the newRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewRow }
     *     
     */
    public void setNewRow(NewRow value) {
        this.newRow = value;
    }

    /**
     * Gets the value of the rowNumber property.
     * 
     * @return
     *     possible object is
     *     {@link RowNumber }
     *     
     */
    public RowNumber getRowNumber() {
        return rowNumber;
    }

    /**
     * Sets the value of the rowNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link RowNumber }
     *     
     */
    public void setRowNumber(RowNumber value) {
        this.rowNumber = value;
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

}
