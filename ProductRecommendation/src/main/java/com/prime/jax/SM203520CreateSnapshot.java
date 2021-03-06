
package com.prime.jax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SM203520CreateSnapshot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SM203520CreateSnapshot">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Company" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="ExportMode" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="Prepare" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="PrepareMode" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="ServiceCommands" type="{http://www.acumatica.com/generic/}SM203520CreateSnapshotServiceCommands" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SM203520CreateSnapshot", propOrder = {
    "displayName",
    "company",
    "description",
    "exportMode",
    "prepare",
    "prepareMode",
    "serviceCommands"
})
public class SM203520CreateSnapshot {

    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "Company")
    protected Field company;
    @XmlElement(name = "Description")
    protected Field description;
    @XmlElement(name = "ExportMode")
    protected Field exportMode;
    @XmlElement(name = "Prepare")
    protected Field prepare;
    @XmlElement(name = "PrepareMode")
    protected Field prepareMode;
    @XmlElement(name = "ServiceCommands")
    protected SM203520CreateSnapshotServiceCommands serviceCommands;

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
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setCompany(Field value) {
        this.company = value;
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
     * Gets the value of the prepare property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getPrepare() {
        return prepare;
    }

    /**
     * Sets the value of the prepare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setPrepare(Field value) {
        this.prepare = value;
    }

    /**
     * Gets the value of the prepareMode property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getPrepareMode() {
        return prepareMode;
    }

    /**
     * Sets the value of the prepareMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setPrepareMode(Field value) {
        this.prepareMode = value;
    }

    /**
     * Gets the value of the serviceCommands property.
     * 
     * @return
     *     possible object is
     *     {@link SM203520CreateSnapshotServiceCommands }
     *     
     */
    public SM203520CreateSnapshotServiceCommands getServiceCommands() {
        return serviceCommands;
    }

    /**
     * Sets the value of the serviceCommands property.
     * 
     * @param value
     *     allowed object is
     *     {@link SM203520CreateSnapshotServiceCommands }
     *     
     */
    public void setServiceCommands(SM203520CreateSnapshotServiceCommands value) {
        this.serviceCommands = value;
    }

}
