package com.prime.question;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.prime.question.model.Option;
import com.prime.question.service.QuestionService;

@Controller
@Scope("session")
public class CreateQuestionBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger( CreateQuestionBean.class.getName() );
	
	private String questionBody;
	private List<Option> options;
	
	@Autowired
	private QuestionService questionService;
	
	
	

	public void initBean(){
		questionBody = null;
		options = null;
	}
	
	public void addOption()
	{
		if(options == null){
		options = new ArrayList<Option>();
		}
		Option newOption = new Option();
		options.add(newOption);
	}

	public void removeOption(Option option){
		options.remove(option);
	}
	
	
	public String onSave(){
		logger.info("onSave");
		logger.info("question body = " + getQuestionBody());
		questionService.createNewQuestion(questionBody, options);
		initBean();
		return "ViewQuestions?faces-redirect=true";
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

	public List<Option> getOptions() {
		return options;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	}
}
