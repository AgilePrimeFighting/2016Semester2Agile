package com.prime.product;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.prime.product.service.ProductService;
import com.prime.question.CreateQuestionBean;

@Controller
@Scope("session")
public class CreateProductBean
{
	
	private static final Logger logger = Logger.getLogger( CreateQuestionBean.class.getName() );


	@Autowired
	private ProductService productService;
	
	private String productName ; 
	private boolean productActive ;
	private boolean productTrail ;
	private String productURL ;

	public void initBean () 
	{
		System.out.println("start to init product bean");
		productName = null ;
		productActive = false ;
		productTrail  = false ;
		productURL = null ;
	}

	
	public String onSave(){
		logger.info("onSave");
		//logger.info("question body = " + getQuestionBody());
		productService.createNewProduct(productName, productActive ,productTrail , productURL);
		initBean();
		return "viewProducts" ;
	//	return "ViewQuestions?faces-redirect=true";
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
	public boolean isProductTrail() {
		return productTrail;
	}
	public void setProductTrail(boolean productTrail) {
		this.productTrail = productTrail;
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

}
