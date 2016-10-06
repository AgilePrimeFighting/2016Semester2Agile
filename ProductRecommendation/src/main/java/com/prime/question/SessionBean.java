package com.prime.question;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.prime.product.model.Product;
import com.prime.response.model.Response;

@Controller
@Scope("session")
public class SessionBean {
	private Product recommendeProduct;
	private List<Response> responses;
	
	public Product getRecommendeProduct() {
		return recommendeProduct;
	}
	public void setRecommendeProduct(Product recommendeProduct) {
		this.recommendeProduct = recommendeProduct;
	}
	public List<Response> getResponses() {
		return responses;
	}
	public void setResponses(List<Response> responses) {
		this.responses = responses;
	}
}
