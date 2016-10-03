package com.prime.product;

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
import com.prime.response.model.Response;

@Controller
@Scope("session")
public class RecommendedProductBean {

	private static final Logger logger = Logger
			.getLogger(RecommendedProductBean.class.getName());

	private Product product;
	private List<Response> responses;
	private boolean isAvailable;
	
	
	@SuppressWarnings("unchecked")
	@PostConstruct
	public void init() {
		clearSession();
		product = (Product) FacesContext.getCurrentInstance().getExternalContext()
				.getFlash().get("product");
		responses = (List<Response>) FacesContext.getCurrentInstance().getExternalContext()
				.getFlash().get("responses");
		if(product == null) isAvailable = false;
		else isAvailable = true;
	}
	
	private void clearSession(){
		product = new Product();
		responses = new ArrayList<Response>();
		isAvailable = false;
	}
	
	
	public String doRegister(){
		FacesContext.getCurrentInstance().getExternalContext().getFlash()
			.put("product", product);
		FacesContext.getCurrentInstance().getExternalContext().getFlash()
			.put("responses", responses);
		clearSession();
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "CollectCustomerDetail?faces-redirect=true";
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

}
