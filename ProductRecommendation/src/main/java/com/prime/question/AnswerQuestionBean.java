package com.prime.question;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.prime.customer.CollectCustomerDetailBean;
import com.prime.product.model.Product;
import com.prime.product.service.ProductService;
import com.prime.question.model.Option;
import com.prime.question.model.Question;
import com.prime.question.service.QuestionService;
import com.prime.question.service.ResponseService;
import com.prime.response.model.Response;
import com.prime.soap.SoapClientJax;

@Controller
@Scope("session")
public class AnswerQuestionBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(AnswerQuestionBean.class.getName());

	private List<Question> questions;
	private int currentQuestionIndex;
	private List<Response> responses;
	private List<Option> selectedOptions;
	private Integer selectedOptionId;

	@Autowired
	private QuestionService questionService;

	@Autowired
	private ResponseService responseService;

	@Autowired
	private ProductService productService;
	
	@Autowired
	private CollectCustomerDetailBean detailBean;
	



	@PostConstruct
	public void init() {
		clearSession();
		setQuestions(questionService.listAll());
	}
	
	private void clearSession() {
		questions = new ArrayList<Question>();
		setCurrentQuestionIndex(0);
		responses = new ArrayList<Response>();
		selectedOptions = new ArrayList<Option>();
		setSelectedOptionId(null);
	}

	
	public String doNext() {
		
		Question question = questions.get(currentQuestionIndex);
		Option selectedOption = null;
		for(Option option : question.getOptions()){
			if(selectedOptionId == option.getOptionId() ){
				selectedOption = option;
			}
		}
		Response responseItem = new Response(question.getQuestionId(), question.getQuestionBody(), selectedOption.getOptionBody());
		responses.add(responseItem);
		selectedOptions.add(selectedOption);
		currentQuestionIndex++;
		
		if (currentQuestionIndex == questions.size()) {
			Product recommendedProduct = null;
			recommendedProduct = productService.getRecommendedProduct(selectedOptions);
			detailBean.setProduct(recommendedProduct);
			detailBean.setResponses(responses);
			clearSession();
			return "CollectCustomerDetail?faces-redirect=true";
		}
		
		selectedOptionId = null;
		return "AnswerQuestions";
	}
	

	public String doBack() {

		if (currentQuestionIndex == 0) {
			clearSession();
			FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
			return "StartToAnswerQuestion";
		}

		responses.remove(responses.size() - 1);
		selectedOptions.remove(selectedOptions.size() - 1);
		System.out.println("currentQuestionIndex " + currentQuestionIndex);
		currentQuestionIndex--;
		System.out.println("currentQuestionIndex " + currentQuestionIndex);

		return "AnswerQuestions";
	}

		public List<Question> getQuestions() {
		return questions;
}
/*
	public String submitDetail() {
		Product recommendedProduct = productService.getRecommendedProduct(selectedOptions);
		customer = customerService.persistCustomer(customer,recommendedProduct);
		for (Response res : responseList) {
			res.setCustomer(customer);
			responseService.createResponse(res);
		}
		emailService.sendCustomerResponseEmail(customer, responseList);
		soapService.createTrialUser(customer.getEmail());
		recommendedProductBean.setProduct(recommendedProduct);
		clearSession();
		return "RecommendedProduct?faces-redirect=true";
	}*/


	private void clearSession() {
		setCurrentQuestionIndex(0);
		responses = new ArrayList<Response>();
		selectedOptions = new ArrayList<Option>();
		setSelectedOptionId(null);
	}
/*	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
*/
	public QuestionService getQuestionService() {
		return questionService;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	
	public int getTotalNumberOfQuestions() {
		return questions.size();
	}

	public Question getCurrentQuestion() {
		return this.getQuestions().get(currentQuestionIndex);
	}


	public int getCurrentQuestionIndex() {
		return currentQuestionIndex;
	}

	public void setCurrentQuestionIndex(int currentQuestionIndex) {
		this.currentQuestionIndex = currentQuestionIndex;
	}
	
	public List<Response> getResponses() {
		return responses;
	}

	public void setResponse(List<Response> responses) {
		this.responses = responses;
	}

	public Integer getSelectedOptionId() {
		return selectedOptionId;
	}

	public void setSelectedOptionId(Integer selectedOptionId) {
		this.selectedOptionId = selectedOptionId;
	}
}
