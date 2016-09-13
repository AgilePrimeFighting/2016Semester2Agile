package com.prime.question;

import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.primefaces.event.FlowEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.prime.question.model.Question;
import com.prime.question.service.QuestionService;
import com.prime.question.service.ResponseService;

@Controller
@Scope("session")
public class CreateResponseBean {
	private static final Log log = LogFactory.getLog(CreateResponseBean.class);

	private int customerId;

	private int questionId;

	private boolean answer;
	
	private String step;

	private List<Question> questions;

	@Autowired
	private ResponseService responseService;

	@Autowired
	private QuestionService questionSerice;

	@PostConstruct
	public void init() {
		log.info("initiating");
		setQuestions(questionSerice.listAll());
		log.info(questions.size());
	}

	public String onSave() {
		log.info("onSave");
		log.info("customer id = " + getCustomerId());
		log.info("question id = " + getQuestionId());
		log.info("answer = " + isAnswer());
		responseService.createNewStory(customerId, questionId, answer);

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

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public String onFlowProcess(FlowEvent event) {
		event.getNewStep();
		log.info(step);
		log.info(event.getOldStep());
		log.info("processing");
			return event.getNewStep();
	}
	
	public String getAnswerString(){
		if(answer){
			return "True";
		}else{
			return "False";
		}
	}
	
	public void setAnswerString(String answerString){
		if("True".equals(answerString)){
			setAnswer(true);
		}else{
			setAnswer(false);
		}
	}

	public String getStep() {
		return step;
	}

	public void setStep(String step) {
		this.step = step;
	}
}
