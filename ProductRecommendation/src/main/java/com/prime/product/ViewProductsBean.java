package com.prime.product;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.prime.product.model.Product;
import com.prime.product.service.ProductService;
import com.prime.question.ViewQuestionsBean;
import com.prime.question.model.Question;
import com.prime.question.service.QuestionService;


@Controller
@Scope("request")
public class ViewProductsBean 
{
	
	
	private List<Product> products = new ArrayList<Product>() ;
	private static final Logger logger = Logger.getLogger(ViewQuestionsBean.class.getName());
		
	@Autowired
	private ProductService productService;
	
	@PostConstruct
	public void init(){
		logger.info("initiating");
		System.out.println("Initing ~~~");
		if(productService != null){
		products = productService.listAll();
		}
		else{
			logger.info("product service is null");
		}
	}

	public void onDelete(Product product){
		logger.info("deleting question");
		products.remove(product);
		productService.delete(product);
	}

	public List<Product> getProducts() {
		System.out.println("get all the products");
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}



}
