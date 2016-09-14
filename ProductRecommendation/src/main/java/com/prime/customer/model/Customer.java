package com.prime.customer.model;

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

import com.prime.question.model.Option;
import com.prime.response.model.Response;

@Entity
@Table
public class Customer {
	
	@Id
	@Column(name = "CUSTOMER_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;

	public int getCustomerId() {
		return customerId;
	}
	
	@OneToMany(mappedBy = "customerId", targetEntity = Response.class, orphanRemoval=true,
			fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Response> responses;

	public List<Response> getResponses() {
		return responses;
	}

	public void setResponses(List<Response> responses) {
		this.responses = responses;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	


}
