package com.prime.question;

import java.io.Serializable;
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
	private static final Logger logger = Logger.getLogger( AnswerQuestionBean.class.getName() );
	
	private Customer customer;
	private List<Question> questions;
	private int currentQuestionIndex;
	private List<Response> responseList;
	private String response;
	private String head = null;
	private String product = "MYOB EXO";
	private String hasTrial = "false";
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String company;
	private String country;
	private String businessType;
	private String addiMsg;
	private String isSubscribe;
	
	@Autowired
	private QuestionService questionService;
	
	@Autowired
	private ResponseService responseService;
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private EmailService emailService;
	
	@PostConstruct
	public void init(){
		setQuestions(questionService.listAll());
		currentQuestionIndex = 0;
		responseList = new CopyOnWriteArrayList<Response>();
	}
	
	public void initCollectCustomerDetailPage(){
		if(hasTrial.equals("false")) setHead("Please complete the below details "
				+ "to have someone from MYOB contact you with more details for "
				+ "the recommended product.");
		else if(hasTrial.equals("true")) setHead("Please complete the below details to have someone from MYOB "
				+ "contact you with more details, or to proceed with a free trial "
				+ "of the recommended product.");
	}

	public void sendEmailToDemandGenerationTeam(){
		
	}

	public String doNext(){
		
		logger.info("response : " + getResponse());
		Question question = questions.get(currentQuestionIndex);
		//responseService.createNewResponse(customer.getCustomerId(),question.getQuestionId(), question.getQuestionBody(), response);
		Response responseItem = new Response(question.getQuestionId(), 
				question.getQuestionBody(), response);
		responseList.add(responseItem);		
		
		currentQuestionIndex ++;
		//System.out.println("currentQuestionIndex " + currentQuestionIndex);
		if(currentQuestionIndex == questions.size() ){
			initCollectCustomerDetailPage();
			FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
			return "CollectCustomerDetail";
			
		}
		response = null;
		return "AnswerQuestions";
	}
	

	public String doBack(){
		
		if(currentQuestionIndex == 0 ){
			FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
			return "StartToAnswerQuestion";
			
		}
		logger.info("response : " + getResponse());
		//Question question = questions.get(currentQuestionIndex);
		//responseService.createNewResponse(customer.getCustomerId(),question.getQuestionId(), question.getQuestionBody(), response);
		responseList.remove(responseList.size() - 1);
		System.out.println("currentQuestionIndex " + currentQuestionIndex);
		currentQuestionIndex --;
		System.out.println("currentQuestionIndex " + currentQuestionIndex);
		
		response = null;
		return "AnswerQuestions";
	}
	
	public String submitDetail(){
//		System.out.println("isSub: " + isSubscribe);
		customer = customerService.createNewCustomer(product, hasTrial, firstName, lastName, email,
				phone, company, country, businessType, addiMsg, isSubscribe);
		for(Response res : responseList){
			res.setCustomer(customer);
		
		responseService.createResponse(res);
	}
		emailService.sendCustomerResponseEmail(customer, responseList);
		return "ThankYou";
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
	
	public int getTotalNumberOfQuestions(){
		return questions.size();
	}
	
	public Question getCurrentQuestion(){
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
	
	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}
	
	public String getHasTrial() {
		return hasTrial;
	}

	public void setHasTrial(String hasTrial) {
		this.hasTrial = hasTrial;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	
	public String getAddiMsg(){
		return addiMsg;
	}

	public void setAddiMsg(String addiMsg) {
		this.addiMsg = addiMsg;
	}
	
	public String getIsSubscribe() {
		return isSubscribe;
	}
	
	public void setIsSubscribe(String isSubscribe) {
		this.isSubscribe = isSubscribe;
	}
}
