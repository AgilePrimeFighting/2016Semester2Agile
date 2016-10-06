
package com.prime.jax.sm507000;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Selection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Selection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Account" type="{http://www.acumatica.com/typed/}Field" minOccurs="0"/>
 *         &lt;element name="AccountEmailAccountID" type="{http://www.acumatica.com/typed/}Field" minOccurs="0"/>
 *         &lt;element name="Me" type="{http://www.acumatica.com/typed/}Field" minOccurs="0"/>
 *         &lt;element name="Owner" type="{http://www.acumatica.com/typed/}Field" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.acumatica.com/typed/}Field" minOccurs="0"/>
 *         &lt;element name="IncludeFailed" type="{http://www.acumatica.com/typed/}Field" minOccurs="0"/>
 *         &lt;element name="ServiceCommands" type="{http://www.acumatica.com/typed/}SelectionServiceCommands" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Selection", propOrder = {
    "displayName",
    "account",
    "accountEmailAccountID",
    "me",
    "owner",
    "type",
    "includeFailed",
    "serviceCommands"
})
public class Selection {

    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "Account")
    protected Field account;
    @XmlElement(name = "AccountEmailAccountID")
    protected Field accountEmailAccountID;
    @XmlElement(name = "Me")
    protected Field me;
    @XmlElement(name = "Owner")
    protected Field owner;
    @XmlElement(name = "Type")
    protected Field type;
    @XmlElement(name = "IncludeFailed")
    protected Field includeFailed;
    @XmlElement(name = "ServiceCommands")
    protected SelectionServiceCommands serviceCommands;

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
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setAccount(Field value) {
        this.account = value;
    }

    /**
     * Gets the value of the accountEmailAccountID property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getAccountEmailAccountID() {
        return accountEmailAccountID;
    }

    /**
     * Sets the value of the accountEmailAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setAccountEmailAccountID(Field value) {
        this.accountEmailAccountID = value;
    }

    /**
     * Gets the value of the me property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getMe() {
        return me;
    }

    /**
     * Sets the value of the me property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setMe(Field value) {
        this.me = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setOwner(Field value) {
        this.owner = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setType(Field value) {
        this.type = value;
    }

    /**
     * Gets the value of the includeFailed property.
     * 
     * @return
     *     possible object is
     *     {@link Field }
     *     
     */
    public Field getIncludeFailed() {
        return includeFailed;
    }

    /**
     * Sets the value of the includeFailed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Field }
     *     
     */
    public void setIncludeFailed(Field value) {
        this.includeFailed = value;
    }

    /**
     * Gets the value of the serviceCommands property.
     * 
     * @return
     *     possible object is
     *     {@link SelectionServiceCommands }
     *     
     */
    public SelectionServiceCommands getServiceCommands() {
        return serviceCommands;
    }

    /**
     * Sets the value of the serviceCommands property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectionServiceCommands }
     *     
     */
    public void setServiceCommands(SelectionServiceCommands value) {
        this.serviceCommands = value;
    }

}
