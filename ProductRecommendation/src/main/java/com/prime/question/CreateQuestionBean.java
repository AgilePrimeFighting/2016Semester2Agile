package com.prime.question;

import java.io.Serializable;
import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="createQuestionBean")
@ViewScoped
public class CreateQuestionBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger( CreateQuestionBean.class.getName() );
	
	private String questionBody;
	
	@ManagedProperty(value = "#{viewQuestionsBean}")
	private ViewQuestionsBean viewQuestionsBean;
	
	public void setViewQuestionBean(ViewQuestionsBean viewQuestionBean) {
		this.viewQuestionsBean = viewQuestionBean;
	}

	public String onSave(){
		logger.info("onSave");
		logger.info("question body = " + getQuestionBody());
		viewQuestionsBean.addQuestion(questionBody);
		return "ViewQuestions";
	}

	public String getQuestionBody() {
		return questionBody;
	}

	public void setQuestionBody(String questionBody) {
		this.questionBody = questionBody;
	}

	public ViewQuestionsBean getViewQuestionsBean() {
		return viewQuestionsBean;
	}

	public void setViewQuestionsBean(ViewQuestionsBean viewQuestionsBean) {
		this.viewQuestionsBean = viewQuestionsBean;
	}
	
	

}
