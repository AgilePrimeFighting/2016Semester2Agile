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

	private Customer customer;
	private List<Question> questions;
	private int currentQuestionIndex;
	private List<Response> responseList;
	private Integer selectedOptionId;
	private List<Option> selectedOptions = new ArrayList<Option>();

	@Autowired
	private QuestionService questionService;

	@Autowired
	private ResponseService responseService;

	@Autowired
	private CustomerService customerService;

	@Autowired
	private EmailService emailService;

	@Autowired
	private RecommendedProductBean recommendedProductBean;

	@Autowired
	private ProductService productService;

	@PostConstruct
	public void init() {
		setQuestions(questionService.listAll());
		clearSession();
		
	}

	

	public String doNext() {

		Question question = questions.get(currentQuestionIndex);
		Option selectedOption = null;
		for(Option op : question.getOptions()){
			if(selectedOptionId == op.getOptionId() ){
				selectedOption = op;
			}
		}
		Response responseItem = new Response(question.getQuestionId(), question.getQuestionBody(), selectedOption.getOptionBody());
		responseList.add(responseItem);
		selectedOptions.add(selectedOption);
		currentQuestionIndex++;
		if (currentQuestionIndex == questions.size()) {
			currentQuestionIndex = 0;
			selectedOptionId = null;

			return "CollectCustomerDetail?faces-redirect=true";

		}
		selectedOptionId = null;
		return "AnswerQuestions";
	}

	public String doBack() {

		if (currentQuestionIndex == 0) {
			FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
			return "StartToAnswerQuestion";

		}
		// Question question = questions.get(currentQuestionIndex);
		// responseService.createNewResponse(customer.getCustomerId(),question.getQuestionId(),
		// question.getQuestionBody(), response);
		responseList.remove(responseList.size() - 1);
		System.out.println("currentQuestionIndex " + currentQuestionIndex);
		currentQuestionIndex--;
		System.out.println("currentQuestionIndex " + currentQuestionIndex);

		//response = null;
		return "AnswerQuestions";
	}

	public String submitDetail() {
		Product recommendedProduct = productService.getRecommendedProduct(selectedOptions);
		customer.setProduct(recommendedProduct);
		customer = customerService.persistCustomer(customer,recommendedProduct);
		for (Response res : responseList) {
			res.setCustomer(customer);
			responseService.createResponse(res);
		}
		emailService.sendCustomerResponseEmail(customer, responseList);
		recommendedProductBean.setProduct(recommendedProduct);
		clearSession();
		return "RecommendedProduct?faces-redirect=true";
	}

	private void clearSession() {
		currentQuestionIndex = 0;
		responseList = new ArrayList<Response>();
		customer = new Customer();
		selectedOptionId= null;
		selectedOptions.clear();
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public QuestionService getQuestionService() {
		return questionService;
	}

	public void setQuestionService(QuestionService questionService) {
		this.questionService = questionService;
	}

	public int getTotalNumberOfQuestions() {
		return questions.size();
	}

	public Question getCurrentQuestion() {
		return this.getQuestions().get(currentQuestionIndex);
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public int getCurrentQuestionIndex() {
		return currentQuestionIndex;
	}

	public void setCurrentQuestionIndex(int currentQuestionIndex) {
		this.currentQuestionIndex = currentQuestionIndex;
	}


	public boolean getIsSubscribe(){
		if("Yes".equals(customer.getIsSubscribe())){
			return true;
		}else{
			return false;
		}
	}
	
	public void setIsSubscribe(boolean isSubscribe){
		if(isSubscribe){
			customer.setIsSubscribe("Yes");
		}else{
			customer.setIsSubscribe("No");
		}
	}



	public Integer getSelectedOptionId() {
		return selectedOptionId;
	}



	public void setSelectedOptionId(Integer selectedOptionId) {
		this.selectedOptionId = selectedOptionId;
	}
}
