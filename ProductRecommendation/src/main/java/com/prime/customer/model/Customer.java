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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.prime.question.model.Option;
import com.prime.response.model.Response;

@Entity
@Table
public class Customer {
	
	@Id
	@Column(name = "CUSTOMER_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer customerId;
	
	@Column(name = "PRODUCT")
	private String product;
	
	@Column(name = "HAS_TRIAL")
	private String hasTrial;
	
	@Column(name = "DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date  date;
	
	@Column(name = "FIRST_NAME")
	private String  firstName;
	
	@Column(name = "LAST_NAME")
	private String  lastName;
	
	@Column(name = "EMAIL")
	private String  email;
	
	@Column(name = "COMPANY")
	private String  company;
	
	@Column(name = "COUNTRY")
	private String  country;
	
	@Column(name = "BUSINESS_TYPE")
	private String  businessType;
	
	@Column(name = "ADDITIONAL_MSG")
	private String  addiMsg;
	
	@Column(name = "IS_SUBSCRIBE")
	private Boolean  isSubscribe;
	
	@OneToMany(mappedBy = "customer", targetEntity = Response.class, orphanRemoval=true,
			fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Response> responses;
	
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

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Integer getCustomerId() {
		return customerId;
	}
	

	public List<Response> getResponses() {
		return responses;
	}

	public void setResponses(List<Response> responses) {
		this.responses = responses;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public String getEmail(){
		return email;
	}
	
	public String getCompany(){
		return company;
	}
	
	public String getCountry(){
		return country;
	}
	
	public String getBusinessType(){
		return businessType;
	}
	
	public String getAddiMsg(){
		return addiMsg;
	}
	
	public Boolean getIsSubcribe(){
		return isSubscribe;
	}

}
