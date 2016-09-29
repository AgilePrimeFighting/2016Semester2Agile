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
	@Autowired
	private WeightService weightService;
	
	@PostConstruct
	public void init() {
		logger.info("initiating");
		if (questionService != null) questions = questionService.listAll();
		if (productService != null) products = productService.listAll();
		rangeList = new ArrayList<RangeItem>();

		for(Product product : products){
			int totalMin = 0;
			int totalMax = 0;
			for(Question question : questions){
				List<Integer> optionIds = new ArrayList<Integer>();
				for(Option option : question.getOptions()){
					optionIds.add(option.getOptionId());
				}
				List<Weight> weights = weightService.getWeighFromId(product.getProductID(), optionIds);
				boolean isFirst = true;
				int min = 0;
				int max = 0;
				for(Weight weight : weights){
					int value = weight.getWeightValue();
					if(isFirst){
						min = value;
						max = value;
						isFirst = false;
					}
					if(value < min) min = value;
					if(value > max) max = value;
				}
				totalMin = totalMin + min;
				totalMax = totalMax + max;
			}
			RangeItem range = new RangeItem(product.getProductName(),totalMin,totalMax,product.outputActive());
			rangeList.add(range);
		}
		
		for(Question question : questions){
			for(Option option: question.getOptions()){
				HashMap<Integer, Weight> productIdToWeightMap = new HashMap<Integer, Weight>();
				weightMap.put(option.getOptionId(), productIdToWeightMap);
				for(Weight weight : option.getWeightList()){
					productIdToWeightMap.put(weight.getProductId(), weight);
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