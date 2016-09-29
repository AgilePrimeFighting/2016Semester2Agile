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
import com.prime.question.service.QuestionService;
import com.prime.weight.model.Weight;

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
	private List<Product> products;
	private Weight[][] weightMatrix;
	
	

	@Autowired
	private QuestionService questionService;
	
	@Autowired
	private ProductService productService;
	
	@PostConstruct
	public void init(){
		products = productService.listAll();
	}
	

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
		for (Product product : products) {
			Weight weight = new Weight();
			weight.setOption(newOption);
			weight.setProduct(product);
			weight.setWeightValue(0);
			newOption.getWeightList().add(weight);
		}
		options.add(newOption);
		weightMatrix = questionService.buildWeightMatrix(options, products);
	}

	public void removeOption(Option option){
		options.remove(option);
		weightMatrix = questionService.buildWeightMatrix(options, products);
	}
	
	
	public String onSave(){
		logger.info("onSave");
		logger.info("question body = " + getQuestionBody());
		questionService.createNewQuestion(questionBody, options);
		initBean();
		return "ViewQuestions?faces-redirect=true";
	}
	
	public void accumulate() {
		logger.info("accumulate");
		logger.info("question weight="+ getQuestionBody());
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
	
	public List<Product> getProducts() {
		return products;
	}


	public void setProducts(List<Product> products) {
		this.products = products;
	}


	public Weight[][] getWeightMatrix() {
		return weightMatrix;
	}


	public void setWeightMatrix(Weight[][] weightMatrix) {
		this.weightMatrix = weightMatrix;
	}
}
