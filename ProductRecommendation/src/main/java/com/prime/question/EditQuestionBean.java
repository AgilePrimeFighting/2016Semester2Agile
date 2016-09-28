package com.prime.question;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.prime.product.model.Product;
import com.prime.product.service.ProductService;
import com.prime.question.model.Option;
import com.prime.question.model.Question;
import com.prime.question.service.QuestionService;
import com.prime.weight.model.Weight;

@Controller
@Scope("session")
public class EditQuestionBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger(EditQuestionBean.class.getName());

	private Question question;
	private List<Product> products = new ArrayList<Product>() ;
	private Weight[][] weightMatrix;
	private Map<Integer, Integer> productIdIndex = new HashMap<Integer, Integer>();
	

	@Autowired
	private QuestionService questionService;
	
	
	@Autowired
	private ProductService productService;
	

	@PostConstruct
	public void init() {
		logger.info("initiated");
		products = productService.listAll();
		for(int i = 0; i < products.size(); i ++){
			productIdIndex.put( products.get(i).getProductID(), i);
		}
		
	}

	public void initEdit(Question question) {
		logger.info("question received");
		this.question = question;
		weightMatrix = new Weight[question.getOptions().size()][products.size()];
		for(int optionIndex = 0; optionIndex < question.getOptions().size(); optionIndex ++ ){
			Option option = question.getOptions().get(optionIndex);
			for(Weight weight: option.getWeightList()){
				Integer productPosition = productIdIndex.get(weight.getProductId());
				weightMatrix[optionIndex][productPosition] = weight;
			}
		}
		
	}

	public String doSave(int choiceWeight[][]) {
		
		
		if (question != null) {
			questionService.update(question);
		}
		
		return "ViewQuestions?faces-redirect=true";
	}
	
	public void addOption(){
		if(question.getOptions() == null){
			question.setOptions(new ArrayList<Option>());
		}
		Option newOption = new Option();
		question.getOptions().add(newOption);
	}
	

	public void removeOption(Option option){
		question.getOptions().remove(option);
	}

	public QuestionService getQuestionService() {
		return questionService;
	}

	public void setQuestionService(QuestionService questionService) {
		this.questionService = questionService;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
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
