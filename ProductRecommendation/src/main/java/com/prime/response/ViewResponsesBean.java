package com.prime.response;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.prime.question.service.ResponseService;
import com.prime.response.model.Response;

@Controller
@Scope("request")
public class ViewResponsesBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger logger = Logger.getLogger(ViewResponsesBean.class.getName());

	public List<Response> responses;
	
	@Autowired
	private ResponseService responseService;

	@PostConstruct
	public void init() {
		logger.info("initiating");
		responses = responseService.listAll();
	}
	
	public List<Response> getResponses() {
		return responses;
	}

	public void setResponses(List<Response> responses) {
		this.responses = responses;
	}
}
