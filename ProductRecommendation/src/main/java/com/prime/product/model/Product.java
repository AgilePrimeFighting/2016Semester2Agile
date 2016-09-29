package com.prime.product.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.prime.weight.model.Weight;



@Entity 
@Table
public class Product 
{

	@Id 
	@Column (name = "PRODUCT_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productId ; 
	
	@Column (name = "PRODUCT_NAME")
	private String productName ;
	
	@Column (name = "PRODUCT_ACTIVE")
	private boolean productActive ;
	
	@Column (name = "PRODUCT_TRIAL")
	private boolean productTrial ;
	
	@Column (name = "PRODUCT_URL")
	private String productURL ;
	
	@Column (name = "OVERVIEW")
	private String overview ;
	
	@OneToMany(mappedBy = "product", targetEntity = Weight.class, orphanRemoval=true,
	fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Weight> weightList = new ArrayList<Weight>();
	
	
	
	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	
	public List<Weight> getWeightList() {
		return weightList;
	}

	public void setWeightList(List<Weight> weightList) {
		this.weightList = weightList;
	}

	public String outputActive() 
	{
		return this.productActive == true ? "Active" : "Inactive" ;
	}

	public Integer getproductId() {
		return productId;
	}

	public void setproductId(Integer productId) {
		this.productId = productId;
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
//		if ( productActive == true ) 
//		{
//			activeOutput = "active" ;
//		}
//		else 
//		{
//			activeOutput = "disactive" ;
//		}
	}

	
	public boolean isProductTrial() {
		return productTrial;
	}

	public void setProductTrial(boolean productTrial) {
		this.productTrial = productTrial;
	}
	
	public String outputTrial () 
	{
		return this.productTrial == true ? "YES" : "NO" ;
	}

	public String getProductURL() {
		return productURL;
	}

	public void setProductURL(String productURL) {
		this.productURL = productURL;
	}



	
	
	
	
}
