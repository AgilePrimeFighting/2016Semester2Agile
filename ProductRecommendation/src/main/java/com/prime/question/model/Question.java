package com.prime.question.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Question {

	@Id
	@Column(name = "QUESTION_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int questionId;
	
	@Column(name = "QUESTION_BODY")
	private String questionBody;

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestionBody() {
		return questionBody;
	}

	public void setQuestionBody(String question_body) {
		this.questionBody = question_body;
	}
}
