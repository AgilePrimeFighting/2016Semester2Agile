package com.prime.customer;

public class ResponseItem {
	public Integer questionId;
	public String questionBody;
	public String response;

	public ResponseItem(Integer questionId, String questionBody, String response){
		this.questionId = questionId;
		this.questionBody = questionBody;
		this.response = response;
	}
}
