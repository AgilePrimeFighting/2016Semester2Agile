
package com.prime.jax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SM201010Statistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SM201010Statistics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountCreationDate" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="LastLoginDate" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="LastLockoutDate" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="LastPasswordChangeDate" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="NumberOfUnsuccessfulAttemptsToEnterPassword" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="NumberOfUnsuccessfulAttemptsToEnterRecoveryAnswer" type="{http://www.acumatica.com/generic/}Field" minOccurs="0"/>
 *         &lt;element name="ServiceCommands" type="{http://www.acumatica.com/generic/}SM201010StatisticsServiceCommands" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SM201010Statistics", propOrder = {
    "displayName",
    "accountCreationDate",
    "lastLoginDate",
    "lastLockoutDate",
    "lastPasswordChangeDate",
    "numberOfUnsuccessfulAttemptsToEnterPassword",
    "numberOfUnsuccessfulAttemptsToEnterRecoveryAnswer",
    "serviceCommands"
})
public class SM201010Statistics {

    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "AccountCreationDate")
    protected Field accountCreationDate;
    @XmlElement(name = "LastLoginDate")
    protected Field lastLoginDate;
    @XmlElement(name = "LastLockoutDate")
    protected Field lastLockoutDate;
    @XmlElement(name = "LastPasswordChangeDate")
    protected Field lastPasswordChangeDate;
    @XmlElement(name = "NumberOfUnsuccessfulAttemptsToEnterPassword")
    protected Field numberOfUnsuccessfulAttemptsToEnterPassword;
    @XmlElement(name = "NumberOfUnsuccessfulAttemptsToEnterRecoveryAnswer")
    protected Field numberOfUnsuccessfulAttemptsToEnterRecoveryAnswer;
    @XmlElement(name = "ServiceCommands")
    protected SM201010StatisticsServiceCommands serviceCommands;

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
     * Gets the value of the accountCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getAccountCreationDate() {
        return accountCreationDate;
    }

    /**
     * Sets the value of the accountCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setAccountCreationDate(Field value) {
        this.accountCreationDate = value;
    }

    /**
     * Gets the value of the lastLoginDate property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getLastLoginDate() {
        return lastLoginDate;
    }

    /**
     * Sets the value of the lastLoginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setLastLoginDate(Field value) {
        this.lastLoginDate = value;
    }

    /**
     * Gets the value of the lastLockoutDate property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getLastLockoutDate() {
        return lastLockoutDate;
    }

    /**
     * Sets the value of the lastLockoutDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setLastLockoutDate(Field value) {
        this.lastLockoutDate = value;
    }

    /**
     * Gets the value of the lastPasswordChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getLastPasswordChangeDate() {
        return lastPasswordChangeDate;
    }

    /**
     * Sets the value of the lastPasswordChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setLastPasswordChangeDate(Field value) {
        this.lastPasswordChangeDate = value;
    }

    /**
     * Gets the value of the numberOfUnsuccessfulAttemptsToEnterPassword property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getNumberOfUnsuccessfulAttemptsToEnterPassword() {
        return numberOfUnsuccessfulAttemptsToEnterPassword;
    }

    /**
     * Sets the value of the numberOfUnsuccessfulAttemptsToEnterPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setNumberOfUnsuccessfulAttemptsToEnterPassword(Field value) {
        this.numberOfUnsuccessfulAttemptsToEnterPassword = value;
    }

    /**
     * Gets the value of the numberOfUnsuccessfulAttemptsToEnterRecoveryAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getNumberOfUnsuccessfulAttemptsToEnterRecoveryAnswer() {
        return numberOfUnsuccessfulAttemptsToEnterRecoveryAnswer;
    }

    /**
     * Sets the value of the numberOfUnsuccessfulAttemptsToEnterRecoveryAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setNumberOfUnsuccessfulAttemptsToEnterRecoveryAnswer(Field value) {
        this.numberOfUnsuccessfulAttemptsToEnterRecoveryAnswer = value;
    }

    /**
     * Gets the value of the serviceCommands property.
     * 
     * @return
     *     possible object is
     *     {@link SM201010StatisticsServiceCommands }
     *     
     */
    public SM201010StatisticsServiceCommands getServiceCommands() {
        return serviceCommands;
    }

    /**
     * Sets the value of the serviceCommands property.
     * 
     * @param value
     *     allowed object is
     *     {@link SM201010StatisticsServiceCommands }
     *     
     */
    public void setServiceCommands(SM201010StatisticsServiceCommands value) {
        this.serviceCommands = value;
    }

}
