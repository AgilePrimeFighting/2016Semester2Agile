package com.prime.response.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.prime.customer.model.Customer;

@Entity
@Table
public class Response {
	@Id
	@Column(name = "RESPONSE_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer responseId;
	
	@Column(name="CUSTOMER_ID", insertable=false, updatable=false )
	private Integer customerId;
	
	@Column(name = "QUESTION_ID")
	private Integer questionId;

	@Column(name = "QUESTION_BODY")
	private String questionBody;

	@Column(name = "ANSWER")
	private String answer;
	
	@Column(name = "DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date  date;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="CUSTOMER_ID")
	private Customer customer;
	
	
	public Response(){
		
	}
	
	public Response(Integer questionId, String questionBody, String answer) {
		this.questionId = questionId;
		this.questionBody = questionBody;
		this.answer = answer;
		this.date= new Date();
	}
	

	public Integer getResponseId() {
		return responseId;
	}

	public void setResponseId(Integer responseId) {
		this.responseId = responseId;
	}
	
	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	
	public Integer getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public String getQuestionBody() {
		return questionBody;
	}

	public void setQuestionBody(String questionBody) {
		this.questionBody = questionBody;
	}
	

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer2) {
		this.answer = answer2;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
