package com.prime.product;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.prime.customer.CollectCustomerDetailBean;
import com.prime.product.model.Product;
import com.prime.response.model.Response;

@Controller
@Scope("session")
public class RecommendedProductBean {

	private static final Logger logger = Logger
			.getLogger(RecommendedProductBean.class.getName());

	private Product product;
	private List<Response> responses;
	private boolean isAvailable;
	
	@Autowired
	private CollectCustomerDetailBean collectCustomerDetailBean;

	public void init(Product product, List<Response> responses) {
		clearSession();
		setProduct(product);
		setResponses(responses);
		if(product == null) isAvailable = false;
		else isAvailable = true;
	}
	
	private void clearSession(){
		product = new Product();
		responses = new ArrayList<Response>();
		isAvailable = false;
	}
	
	
	public String doRegister(){
		collectCustomerDetailBean.init(product, responses);
		clearSession();
		return "CollectCustomerDetail?faces-redirect=true";
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public List<Response> getResponses() {
		return responses;
	}

	public void setResponses(List<Response> responses) {
		this.responses = responses;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

}
