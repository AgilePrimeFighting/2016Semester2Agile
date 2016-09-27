package com.prime.question;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.prime.question.model.Question;
import com.prime.question.service.QuestionService;

@Controller
@Scope("request")
public class ViewQuestionsBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger(ViewQuestionsBean.class.getName());
	

	private List<Question> questions = new ArrayList<Question>();
	private List<RangeItem> rangeList;
	
	private Question selectedQuestion;
	
	@Autowired
	private QuestionService questionService;
	
	@PostConstruct
	public void init(){
		logger.info("initiating");
		if(questionService != null){
		questions = questionService.listAll();
		}
		else{
			logger.info("question service is null");
		}
	}

	public void onDelete(Question question){
		logger.info("deleting question");
		questions.remove(question);
		questionService.delete(question);
	}

	public List<Question> getQuestions() {
		return questions;
	}
	

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	
	
	public QuestionService getQuestionService() {
		return questionService;
	}

	public void setQuestionService(QuestionService questionService) {
		this.questionService = questionService;
	}

	public Question getSelectedQuestion() {
		return selectedQuestion;
	}

	public void setSelectedQuestion(Question selectedQuestion) {
		this.selectedQuestion = selectedQuestion;
	}

}
