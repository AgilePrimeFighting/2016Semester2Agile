package com.prime.product;

import java.util.logging.Logger;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.prime.product.service.ProductService;
import com.prime.question.CreateQuestionBean;

@Controller
@Scope("session")
public class CreateProductBean {

	private static final Logger logger = Logger
			.getLogger(CreateQuestionBean.class.getName());

	@Autowired
	private ProductService productService;

	private String productName;
	private boolean productActive;
	private boolean productTrial;
	private String productURL;
	private String productOverview;

	public String getProductOverview() {
		return productOverview;
	}

	public void setProductOverview(String productOverview) {
		this.productOverview = productOverview;
	}

	public void initBean() {
		System.out.println("start to init product bean");
		productName = null;
		productActive = false;
		// productTrail = false ;
		productTrial = false;
		productURL = null;
		productOverview = null;
	}

	public String onSave() {
		logger.info("onSave");
		// logger.info("question body = " + getQuestionBody());
		productService.createNewProduct(productName, productActive,
				productTrial, productURL, productOverview);
		initBean();
		// return "ViewProducts" ;
		return "ViewProducts?faces-redirect=true";
	}

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public boolean isProductActive() {
		return productActive;
	}

	public void setProductActive(boolean productActive) {
		this.productActive = productActive;
	}

	public boolean isProductTrial() {
		return productTrial;
	}

	public void setProductTrial(boolean productTrial) {
		this.productTrial = productTrial;
	}

	public String getProductURL() {
		return productURL;
	}

	public void setProductURL(String productURL) {
		this.productURL = productURL;
	}

	public static Logger getLogger() {
		return logger;
	}

	public void validateURL(FacesContext context, UIComponent component,
			Object value) throws ValidatorException

	{

		System.out.println("start to validate URL ");
		System.out.println("URL value " + value.toString() + " trial value "
				+ productTrial);
		// String data = value.toString() ;
		if (productTrial == true
				&& (value == null || value.toString().compareTo("") == 0)) {
			FacesMessage message = new FacesMessage(
					"This is a trial product , you must give a URL");
			throw new ValidatorException(message);
		}
	}

}
