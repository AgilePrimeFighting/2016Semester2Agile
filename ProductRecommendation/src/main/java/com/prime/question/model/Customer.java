package com.prime.question.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class Customer {

	@Id
	@Column(name = "customer_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int customerId;
	
	public void setCustomerId(int customerId){
		this.customerId = customerId;
	}

	public int getCustomerId(){
		return customerId;
	}
	
}
