package com.prime.question;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import com.prime.question.service.QuestionService;
import com.prime.question.service.ResponseService;

public class CreateResponseBean {
	private static final Logger logger = Logger
			.getLogger(CreateQuestionBean.class.getName());

	private int customerId;

	private int questionId;

	private boolean answer;

	@Autowired
	private ResponseService responseService;

	public String onSave() {
		logger.info("onSave");
		logger.info("customer id = " + getCustomerId());
		logger.info("question id = " + getQuestionId());
		logger.info("answer = " + isAnswer());
		responseService.createNewStory(customerId,questionId,answer);
		return "ViewQuestions";
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public boolean isAnswer() {
		return answer;
	}

	public void setAnswer(boolean answer) {
		this.answer = answer;
	}

	public ResponseService getResponseService() {
		return responseService;
	}

	public void setResponseService(ResponseService responseService) {
		this.responseService = responseService;
	}

}
