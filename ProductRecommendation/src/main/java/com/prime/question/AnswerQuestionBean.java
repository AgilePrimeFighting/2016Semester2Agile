package com.prime.question;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.prime.customer.model.Customer;
import com.prime.customer.service.CustomerService;
import com.prime.email.service.EmailService;
import com.prime.product.RecommendedProductBean;
import com.prime.product.model.Product;
import com.prime.product.service.ProductService;
import com.prime.question.model.Option;
import com.prime.question.model.Question;
import com.prime.question.service.QuestionService;
import com.prime.question.service.ResponseService;
import com.prime.response.model.Response;

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
	private RecommendedProductBean recommendedProductBean;


	@PostConstruct
	public void init() {
		clearSession();
	}
	
	private void clearSession() {
		questions = new ArrayList<Question>();
		setQuestions(questionService.listAll());
		currentQuestionIndex = 0;
		responses = new ArrayList<Response>();
		selectedOptions = new ArrayList<Option>();
		selectedOptionId = null;
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
			List<Response> tmpResponses = new ArrayList<Response>();
			for (Response response : responses) {
				Response tmpResponse = responseService.createResponse(response);
				tmpResponses.add(tmpResponse);
			}
			recommendedProductBean.init(recommendedProduct, responses);
			clearSession();
			FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
			return "RecommendedProduct?faces-redirect=true";
		}
		
		selectedOptionId = null;
		return "AnswerQuestions";
	}
	

	public String doBack() {

		if (currentQuestionIndex == 0) {
			clearSession();
			FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
			return "StartToAnswerQuestion?faces-redirect=true";
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

	public Integer getSelectedOptionId() {
		return selectedOptionId;
	}

	public void setSelectedOptionId(Integer selectedOptionId) {
		this.selectedOptionId = selectedOptionId;
	}
}
