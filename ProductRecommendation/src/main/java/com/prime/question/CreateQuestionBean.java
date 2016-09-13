package com.prime.question;

import java.io.Serializable;
import java.util.logging.Logger;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.prime.question.service.QuestionService;

@Controller
@Scope("request")
public class CreateQuestionBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger( CreateQuestionBean.class.getName() );
	
	private String questionBody;
	
	
	@Autowired
	private QuestionService questionService;
	




	public String onSave(){
		logger.info("onSave");
		logger.info("question body = " + getQuestionBody());
		questionService.createNewStory(questionBody);
		return "ViewQuestions";
	}

	public String getQuestionBody() {
		return questionBody;
	}

	public void setQuestionBody(String questionBody) {
		this.questionBody = questionBody;
	}


	
	public QuestionService getQuestionService() {
		return questionService;
	}

	public void setQuestionService(QuestionService questionService) {
		this.questionService = questionService;
	}

}
