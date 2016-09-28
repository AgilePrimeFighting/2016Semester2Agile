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


@Controller
@Scope("request")
public class ViewProductsBean 
{
	
	
	private List<Product> products = new ArrayList<Product>() ;
	private static final Logger logger = Logger.getLogger(ViewProductsBean.class.getName());
	
	
	
	private Product selectedProduct;
	

	@Autowired
	private ProductService productService;
	
	@PostConstruct
	public void init(){
		logger.info("initiating");
		if(productService != null){
		products = productService.listAll();
		}
		else{
			logger.info("product service is null");
		}
		logger.info("finish initiating");
	}

	public void onDelete(Product product){
		System.out.println("Start to delet a product");
		logger.info("deleting product");
		products.remove(product);
		productService.delete(product);
	}

	public List<Product> getProducts() {
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
	

	public Product getSelectedProduct() {
		return selectedProduct;
	}

	public void setSelectedProduct(Product selectedProduct) {
		this.selectedProduct = selectedProduct;
	}



}
