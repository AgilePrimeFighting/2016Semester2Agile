package com.prime.email.service;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.prime.question.AnswerQuestionBean;

@Service
public class EmailService {
	
	private static final Logger logger = Logger.getLogger( EmailService.class.getName() );
	
	 @Value("${mail.smtp.auth}")
	 private String smtpAuth;
	 
	 public void init(){
		 logger.info(smtpAuth);
	 }
	 
	 
	

}
