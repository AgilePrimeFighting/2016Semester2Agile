package com.prime.question.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Option {

	@Id
	@Column(name = "OPTION_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int optionId;

	@Column(name = "QUESTION_ID", updatable=false, insertable=false)
	private int questionId;

	@Column(name = "OPTION_BODY")
	private String optionBody;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "QUESTION_ID")
	private Question question;

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public int getOptionId() {
		return optionId;
	}

	public void setOptionId(int optionId) {
		this.optionId = optionId;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getOptionBody() {
		return optionBody;
	}

	public void setOptionBody(String optionBody) {
		this.optionBody = optionBody;
	}

}
