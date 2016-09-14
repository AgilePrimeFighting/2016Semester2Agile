package com.prime.question;

import java.io.Serializable;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.prime.question.model.Question;
import com.prime.question.service.QuestionService;

@Controller
@Scope("session")
public class EditQuestionBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger( EditQuestionBean.class.getName() );
	
	
	private Question question;
	
	
	@Autowired
	private QuestionService questionService;
	
	@PostConstruct
	public void init(){
		logger.info("initiated");
	}
	
	public void initEdit(Question question){
		logger.info("question received");
		this.question = question;
	}


	public String doSave(){
		if(question != null){
			questionService.update(question);
		}
		
		return "ViewQuestions?faces-redirect=true";
	}
	




	
	public QuestionService getQuestionService() {
		return questionService;
	}

	public void setQuestionService(QuestionService questionService) {
		this.questionService = questionService;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

}
