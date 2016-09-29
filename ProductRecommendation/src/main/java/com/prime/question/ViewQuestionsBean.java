package com.prime.question;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.prime.product.model.Product;
import com.prime.product.service.ProductService;
import com.prime.question.model.Option;
import com.prime.question.model.Question;
import com.prime.question.service.QuestionService;
import com.prime.weight.model.Weight;
import com.prime.weight.service.WeightService;

@Controller
@Scope("request")
public class ViewQuestionsBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger(ViewQuestionsBean.class.getName());

	private List<Question> questions;
	private List<RangeItem> rangeList;
	Map<Integer, HashMap<Integer, Weight>> weightMap = new HashMap<Integer, HashMap<Integer, Weight>>();
	private List<Product> products;
	@Autowired
	private QuestionService questionService;
	@Autowired
	private ProductService productService;
	
	@PostConstruct
	public void init() {
		logger.info("initiating");
		products = productService.listAll();
		setRangeList(new ArrayList<RangeItem>());

		if (questionService != null) {
			questions = questionService.listAll();
		} else {
			logger.info("question service is null");
		}
		// RangeItem range = new RangeItem("EXO",10,15,"true");
		// rangeList.add(range);
		// TODO set rangeList
		
		for(Question question : questions){
			for(Option option: question.getOptions()){
				HashMap<Integer, Weight> productIdToWeightMap = new HashMap<Integer, Weight>();
				weightMap.put(option.getOptionId(), productIdToWeightMap);
				for(Weight weight : option.getWeightList()){
					productIdToWeightMap.put(weight.getproductId(), weight);
				}
			}
		}

	}
	
	public Weight findWeight(Integer optionId, Integer productId ){
		Weight weight =  weightMap.get(optionId).get(productId);
		return weight;
	}

	public void onDelete(Question question) {
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

	public List<RangeItem> getRangeList() {
		return rangeList;
	}

	public void setRangeList(List<RangeItem> rangeList) {
		this.rangeList = rangeList;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}