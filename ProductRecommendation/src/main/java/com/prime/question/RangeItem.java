package com.prime.question;

public class RangeItem{
	private String productName;
	private int max;
	private int min;
	private String status;
	
	RangeItem(String productName, int max, int min, String status){
		this.productName = productName;
		this.max = max;
		this.min = min;
		this.status = status;
	}
	

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}