package com.prime.question.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Response {
	@Id
	@Column(name = "RESPONSE_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int responseId;
	
	@Column(name = "CUSTOMER_ID")
	private int customerId;

	@Column(name = "QUESTION_BODY")
	private String questionBody;

	@Column(name = "ANSWER")
	private String answer;

	public int getResponseId() {
		return responseId;
	}

	public void setResponseId(int responseId) {
		this.responseId = responseId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getQuestionBody() {
		return questionBody;
	}

	public void setQuestionBody(String questionId) {
		this.questionBody = questionId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer2) {
		this.answer = answer;
	}

}
