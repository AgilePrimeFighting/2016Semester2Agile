package com.prime.product;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.prime.product.model.Product;
import com.prime.question.AnswerQuestionBean;

@Controller
@Scope("session")
public class RecommendedProductBean {
	
	private static final Logger logger = Logger.getLogger(RecommendedProductBean.class.getName());
	
	
	private Product product;
	
	@PostConstruct
	public void init(){
		logger.info("initiating");
	}


	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	

}
