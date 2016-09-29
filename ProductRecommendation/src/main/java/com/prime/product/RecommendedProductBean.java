package com.prime.product;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.prime.product.model.Product;
import com.prime.product.service.ProductService;
import com.prime.question.AnswerQuestionBean;

@Controller
@Scope("session")
public class RecommendedProductBean {

	private static final Logger logger = Logger
			.getLogger(RecommendedProductBean.class.getName());

	private Product product;

	private boolean isAvailable = false;

	@Autowired
	private ProductService productService;

	@PostConstruct
	public void init() {
		logger.info("initiating");
		if (productService != null) {
			product = productService.listAll().get(0);
		} else {
			logger.info("product service is null");
		}

		isAvailable = true;
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
