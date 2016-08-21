package com.prime.question;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "viewQuestionsBean")
@SessionScoped
public class ViewQuestionsBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger(ViewQuestionsBean.class.getName());
	
	private List<String> questions = new ArrayList<String>();

	public List<String> getQuestions() {
		return questions;
	}

	public void setQuestions(List<String> questions) {
		this.questions = questions;
	}
	
	public void addQuestion(String questionBody){
		getQuestions().add(questionBody);
	}

}
