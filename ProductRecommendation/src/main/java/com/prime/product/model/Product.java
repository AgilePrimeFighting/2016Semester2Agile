package com.prime.product.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity 
@Table
public class Product 
{

	@Id 
	@Column (name = "PRODUCT_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String productID ; 
	
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
	
	
	
	
//	private String activeOutput ;
//
//	public String getActiveOutput() {
//		return activeOutput;
//	}
//
//	public void setActiveOutput(String activeOutput) {
//		this.activeOutput = activeOutput;
//	}
	
	
	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String outputActive() 
	{
		return this.productActive == true ? "Active" : "Inactive" ;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
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
