package com.prime.question;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.prime.customer.model.Customer;
import com.prime.product.model.Product;
import com.prime.product.service.ProductService;
import com.prime.question.model.Question;
import com.prime.question.service.QuestionService;
import com.prime.weight.model.Weight;

@Controller
@Scope("request")
public class ViewQuestionsBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger(ViewQuestionsBean.class.getName());
	
	private List<Question> questions;
	private List<RangeItem> ranges;
	private Question selectedQuestion;
	
	@Autowired
	private QuestionService questionService;
	
//	@Autowired
//	private WeightService weightService;
	
	@Autowired
	private ProductService productService;
	
	@PostConstruct
	public void init(){
		logger.info("initiating");
		
		questions = new ArrayList<Question>();
		ranges = new ArrayList<RangeItem>();
		
		if(questionService != null) questions = questionService.listAll();
		else logger.info("question service is null");
		
		//TODO set rangeList
		List<Product> products = productService.listAll();
//		for(Product product : products){
//			List<Weight> weights = weightService.getWeighsFromProductId(product.getProductID());
//			boolean isFirst = true;
//			int min = 0;
//			int max = 0;
//			for(Weight weight : weights){
//				int value = weight.getWeightValue();
//				if(isFirst){
//					min = value;
//					max = value;
//					isFirst = false;
//				}
//				if(value < min) min = value;
//				if(value > max) max = value;
//			}
//			RangeItem range = new RangeItem(product.getProductName(),min,max,product.outputActive());
//			ranges.add(range);
//		}
		
		
	}
	
//	public List<Weight> getWeighsFromProductId(int id){
//		return em.createQuery("SELECT w FROM Weight WHERE w.PRODUCT_ID = " + id , Weight.class).getResultList();
//	}

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

	public List<RangeItem> getRanges() {
		return ranges;
	}

	public void setRanges(List<RangeItem> ranges) {
		this.ranges = ranges;
	}

}
