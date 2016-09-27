package com.prime.question;

public class RangeItem{
	private int max;
	private int min;
	private boolean status;
	
	RangeItem(int max, int min, boolean status){
		this.max = max;
		this.min = min;
		this.status = status;
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

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}