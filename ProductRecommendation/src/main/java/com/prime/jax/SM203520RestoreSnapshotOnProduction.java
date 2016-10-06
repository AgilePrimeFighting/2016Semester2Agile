
package com.prime.jax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SM203520RestoreSnapshotOnProduction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SM203520RestoreSnapshotOnProduction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserResponse" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="ServiceCommands" type="{http://www.acumatica.com/generic/}SM203520RestoreSnapshotOnProductionServiceCommands" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SM203520RestoreSnapshotOnProduction", propOrder = {
    "displayName",
    "userResponse",
    "serviceCommands"
})
public class SM203520RestoreSnapshotOnProduction {

    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "UserResponse")
    protected Field userResponse;
    @XmlElement(name = "ServiceCommands")
    protected SM203520RestoreSnapshotOnProductionServiceCommands serviceCommands;

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
     * Gets the value of the userResponse property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getUserResponse() {
        return userResponse;
    }

    /**
     * Sets the value of the userResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setUserResponse(Field value) {
        this.userResponse = value;
    }

    /**
     * Gets the value of the serviceCommands property.
     * 
     * @return
     *     possible object is
     *     {@link SM203520RestoreSnapshotOnProductionServiceCommands }
     *     
     */
    public SM203520RestoreSnapshotOnProductionServiceCommands getServiceCommands() {
        return serviceCommands;
    }

    /**
     * Sets the value of the serviceCommands property.
     * 
     * @param value
     *     allowed object is
     *     {@link SM203520RestoreSnapshotOnProductionServiceCommands }
     *     
     */
    public void setServiceCommands(SM203520RestoreSnapshotOnProductionServiceCommands value) {
        this.serviceCommands = value;
    }

}
