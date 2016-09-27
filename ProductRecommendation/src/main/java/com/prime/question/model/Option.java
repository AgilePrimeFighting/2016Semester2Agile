package com.prime.question.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.prime.weight.model.Weight;

@Entity
@Table
public class Option {

	@Id
	@Column(name = "OPTION_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer optionId;


	@Column(name = "OPTION_BODY")
	private String optionBody;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "QUESTION_ID")
	private Question question;
	
	
	//modified
	@OneToMany(mappedBy = "option", targetEntity = Weight.class, orphanRemoval=true,
	fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Weight> weightList ;

	public List<Weight> getWeightList() {
		return weightList;
	}

	public void setWeightList(List<Weight> weightList) {
		this.weightList = weightList;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Integer getOptionId() {
		return optionId;
	}

	public void setOptionId(Integer optionId) {
		this.optionId = optionId;
	}


	public String getOptionBody() {
		return optionBody;
	}

	public void setOptionBody(String optionBody) {
		this.optionBody = optionBody;
	}

}
