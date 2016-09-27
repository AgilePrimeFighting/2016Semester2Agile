package com.prime.product;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.prime.product.model.Product;
import com.prime.product.service.ProductService;


@Controller
@Scope("session")
public class EditProductBean 
{
	
	private static final Logger logger = Logger.getLogger(EditProductBean.class.getName());

	private Product product;
	

	@Autowired
	private ProductService productService;

	@PostConstruct
	public void init() {
		logger.info("initiated");
	}

	public void initEdit(Product product) {
		logger.info("product received");
		this.product = product;
	}

	public String doSave() {
		
		
		if (product != null) {
			productService.update(product);
		}

		return "ViewProducts?faces-redirect=true";
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	

	


}
