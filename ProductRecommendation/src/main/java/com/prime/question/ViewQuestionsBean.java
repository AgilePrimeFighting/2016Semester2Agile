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
import com.prime.weight.model.Weight;
import com.prime.weight.service.WeightService;

@Controller
@Scope("request")
public class ViewQuestionsBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger(ViewQuestionsBean.class.getName());
	

	private List<Question> questions;
	private List<RangeItem> rangeList;
	
	
	private List<Weight> weightList = new ArrayList<Weight>() ;
	
	private int choiceWeight[][] = new int[1000][1000]  ;
	private int currentWeight ;
	
	@Autowired 
	private WeightService weightService ;
	
	@Autowired
	private QuestionService questionService;
	
	
	//private int choiceWeight ; 

	public List<Weight> getWeightList() {
		return weightList;
	}

	public void setWeightList(List<Weight> weightList) {
		this.weightList = weightList;
	}

	

	public WeightService getWeightService() {
		return weightService;
	}

	public void setWeightService(WeightService weightService) {
		this.weightService = weightService;
	}


	private Question selectedQuestion;
	
	
	
	public int[][] getChoiceWeight() {
		return choiceWeight;
	}

	public void setChoiceWeight(int[][] choiceWeight) {
		this.choiceWeight = choiceWeight;
	}


	
	
	@PostConstruct
	public void init(){
		logger.info("initiating");
		
		questions = new ArrayList<Question>();
		setRangeList(new ArrayList<RangeItem>());
		
		if(questionService != null) questions = questionService.listAll();
		else logger.info("question service is null");
		
		
		
		//RangeItem range = new RangeItem("EXO",10,15,"true");
		//rangeList.add(range);
		//TODO set rangeList
		
		
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

	public int getCurrentWeight() {
		return currentWeight;
	}

	public void setCurrentWeight(int currentWeight) {
		this.currentWeight = currentWeight;
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
	
	
	public int getChoiceWeighting ( int optionID , int productID ) 
	{
		weightList = weightService.getWeightList(optionID, productID) ;
		if ( weightList == null || weightList.size() == 0 ) 
		{
			choiceWeight[optionID][productID] =  0 ;
			return 0 ;
		}
		choiceWeight[optionID][productID] = weightList.get(0).getWeightValue() ;

	return  weightList.get(0).getWeightValue() ; 
	}
	
	public void getChoiceWeightingNoOutput ( int optionID , int productID ) 
	{
		weightList = weightService.getWeightList(optionID, productID) ;
		if ( weightList == null ) 
		{
			choiceWeight[optionID][productID] =  0 ;
			currentWeight = 0 ;
		}
		//choiceWeight = weightList.get(0).getWeightValue() ; 
		choiceWeight[optionID][productID] = weightList.get(0).getWeightValue() ;
		System.out.println("choiceWeight["+optionID+"]["+productID+"]=" + choiceWeight[optionID][productID] );
		currentWeight = choiceWeight[optionID][productID] ;
		return  ;
	}

	public List<RangeItem> getRangeList() {
		return rangeList;
	}

	public void setRangeList(List<RangeItem> rangeList) {
		this.rangeList = rangeList;
	}
}