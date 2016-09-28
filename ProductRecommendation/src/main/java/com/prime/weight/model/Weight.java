package com.prime.weight.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.prime.product.model.Product;
import com.prime.question.model.Option;

@Entity
@Table (name="Weight")  
public class Weight 
{
	
	
	@Id
	@Column(name = "WEIGHT_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer weightId ;
	
	
	@Column (name="WEIGHT_VALUE")
	private Integer weightValue ;
	
//	
//	@Column (name = "PRODUCT_ID")
//	private Integer productId ;
//	
//	@Column (name = "OPTION_ID")
//	private Integer optionId ;
	
	//modified
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "OPTION_ID")
	private Option option ;
	
	
	//modified 
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRODUCT_ID")
	private Product product ;
	
	
	public Option getOption() {
		return option;
	}

	public void setOption(Option option) {
		this.option = option;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getWeightId() {
		return weightId;
	}

	public void setWeightId(Integer weightId) {
		this.weightId = weightId;
	}

	

	

	public Integer getWeightValue() {
		return weightValue;
	}

	public void setWeightValue(Integer weightValue) {
		this.weightValue = weightValue;
	}
	
	
	
	
	
	
	

}
