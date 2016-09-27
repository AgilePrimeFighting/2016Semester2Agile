package com.prime.question.model;

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


@Entity
@Table
public class Question {

	@Id
	@Column(name = "QUESTION_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer questionId;

	@Column(name = "QUESTION_BODY")
	private String questionBody;

	@OneToMany(mappedBy = "question", targetEntity = Option.class, orphanRemoval=true,
			fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Option> options;

	
	public List<Option> getOptions() {
		return options;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
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

	public void setQuestionBody(String question_body) {
		this.questionBody = question_body;
	}
}
