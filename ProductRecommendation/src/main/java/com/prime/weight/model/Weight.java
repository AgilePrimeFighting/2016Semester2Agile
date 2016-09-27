package com.prime.weight.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Weight")  
public class Weight 
{
	
	
	@Id
	@Column(name = "WEIGHT_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer weightId ;
	
	
	@Column (name = "OPTION_ID")
	private Integer optonId ;
	
	@Column (name = "PRODUCT_ID")
	private Integer productId ;
	
	@Column (name="WEIGHT_VALUE")
	private Integer weightValue ;
	
	

	public Integer getWeightId() {
		return weightId;
	}

	public void setWeightId(Integer weightId) {
		this.weightId = weightId;
	}

	public Integer getOptonId() {
		return optonId;
	}

	public void setOptonId(Integer optonId) {
		this.optonId = optonId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getWeightValue() {
		return weightValue;
	}

	public void setWeightValue(Integer weightValue) {
		this.weightValue = weightValue;
	}
	
	
	
	
	
	
	

}
