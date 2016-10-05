package com.prime.customer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.prime.customer.model.Customer;
import com.prime.customer.service.CustomerService;
import com.prime.email.service.EmailService;
import com.prime.product.RecommendedProductBean;
import com.prime.product.model.Product;
import com.prime.question.service.ResponseService;
import com.prime.response.model.Response;
import com.prime.soap.SoapClientJax;

@Controller
@Scope("session")
public class CollectCustomerDetailBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LogManager.getLogger(CollectCustomerDetailBean.class);

	private Customer customer;
	private Product product;
	private List<Response> responses;
	

	private boolean isTryTrial;

	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private ResponseService responseService;

	@Autowired
	private EmailService emailService;

	@Autowired
	private SoapClientJax soapService;
	
	@Autowired
	private RecommendedProductBean recommendedProductBean;
	@PostConstruct
	public void init() {
		logger.info("init");
		clearSession();
	}
	
	private void clearSession(){
		customer = new Customer();
		//product = new Product();
		responses = new ArrayList<Response>();
		setIsTryTrial(false);
	}

	
	public String submitDetail() {
		if(product != null){
			customer.setDate(new Date());
			customer.setProduct(product);
			customer.setProductName(product.getProductName());
		}
		for (Response response : responses) {
			response.setCustomer(customer);
			customer.getResponses().add(response);
		}
		customer = customerService.persistCustomer(customer);
		
		emailService.sendCustomerResponseEmail(customer, responses);
		if(isTryTrial){
		soapService.createTrialUser(customer.getEmail());
		}
		recommendedProductBean.setProduct(product);
		clearSession();
		return "RecommendedProduct?faces-redirect=true";
	}
	

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public boolean getIsSubscribe(){
		if("Yes".equals(customer.getIsSubscribe())) return true;
		else return false;
	}
	
	public void setIsSubscribe(boolean isSubscribe){
		if(isSubscribe) customer.setIsSubscribe("Yes");
		else customer.setIsSubscribe("No");
	}

	public boolean getIsTryTrial() {
		return isTryTrial;
	}

	public void setIsTryTrial(boolean isTryTrial) {
		this.isTryTrial = isTryTrial;
	}
	
	public List<Response> getResponses() {
		return responses;
	}

	public void setResponses(List<Response> responses) {
		this.responses = responses;
	}
}
