package com.prime.product.service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.hibernate.Hibernate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.prime.email.service.EmailService;
import com.prime.email.service.EmailServiceTest;
import com.prime.product.model.Product;
import com.prime.question.model.Option;
import com.prime.question.model.Question;
import com.prime.question.service.QuestionService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:/spring/spring-config.xml")
public class ProductServiceTest {
	
private static final Logger logger = Logger.getLogger(ProductServiceTest.class.getName());
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private QuestionService questionService;
	
	
	@Test
	public void testGetRecommendedProduct() {
		List<Question> questions = questionService.listAll();
		List<Option> options = new ArrayList<Option>();
		for(Question question : questions){
			options.add(question.getOptions().get(0));
		}
		Product recommendedProduct = productService.getRecommendedProduct(options);
		logger.info(recommendedProduct.getProductName());
	}
	
	@Test
	@Transactional
	public void testListActiveProducts(){
		List<Product> activeProducts = productService.listActiveProducts();
		for(Product product : activeProducts){
			logger.info(product.getProductName());
		}
		productService.initializeCollections(activeProducts.get(0));
		logger.info(activeProducts.get(0).getPdfList().size() + "1231321312123");
		logger.info(activeProducts.get(0).getVideoList().size() + "1231321312123");
	}

}
