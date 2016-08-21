package com.prime.question;

import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="createQuestionBean")
@ViewScoped
public class CreateQuestionBean {
	
	private static final Logger logger = Logger.getLogger( CreateQuestionBean.class.getName() );
	
	private String questionBody;
	
	public void onSave(){
		logger.info("onSave");
		logger.info("question body = " + getQuestionBody());
	}

	public String getQuestionBody() {
		return questionBody;
	}

	public void setQuestionBody(String questionBody) {
		this.questionBody = questionBody;
	}
	
	

}
