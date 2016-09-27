package com.prime.customer.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.prime.product.model.Product;
import com.prime.response.model.Response;

@Entity
@Table
public class Customer {
	
	@Id
	@Column(name = "CUSTOMER_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer customerId;
	
	
	@OneToOne
	@JoinColumn(name = "PRODUCT_ID")
	private Product product;
	
	@Column(name = "DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date  date;
	
	@Column(name = "HAS_TRIAL")
	private String hasTrial;
	
	@Column(name = "FIRST_NAME")
	private String  firstName;
	
	@Column(name = "LAST_NAME")
	private String  lastName;
	
	@Column(name = "EMAIL")
	private String  email;
		
	@Column(name = "PHONE")
	private String  phone;

	@Column(name = "COMPANY")
	private String  company;
	
	@Column(name = "COUNTRY")
	private String  country;
	
	@Column(name = "BUSINESS_TYPE")
	private String  businessType;
	
	@Column(name = "ADDITIONAL_MSG")
	private String  addiMsg;
	
	@Column(name = "IS_SUBSCRIBE")
	private String  isSubscribe;
	
	@OneToMany(mappedBy = "customer", targetEntity = Response.class, orphanRemoval=true,
			fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Response> responses;

	
	public Integer getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getHasTrial() {
		return hasTrial;
	}

	public void setHasTrial(String hasTrial) {
		this.hasTrial = hasTrial;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getCompany(){
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getCountry(){
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getBusinessType(){
		return businessType;
	}
	
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	
	public String getAddiMsg(){
		return addiMsg;
	}

	public void setAddiMsg(String addiMsg) {
		this.addiMsg = addiMsg;
	}
	
	public String getIsSubscribe() {
		return isSubscribe;
	}
	
	public void setIsSubscribe(String isSubscribe) {
		this.isSubscribe = isSubscribe;
	}
	
	public List<Response> getResponses() {
		return responses;
	}

	public void setResponses(List<Response> responses) {
		this.responses = responses;
	}
}
