package com.prime.email.service;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import com.prime.customer.model.Customer;
import com.prime.notification.service.NotificationEmailService;
import com.prime.response.model.Response;

@Service
public class EmailService {

	private static final Logger logger = Logger.getLogger(EmailService.class.getName());

	@Value("${mail.smtp.auth}")
	private String MAIL_SMTP_AUTH;
	@Value("${mail.smtp.starttls.enable}")
	private String MAIL_SMTP_STARTTLS_ENABLE;
	@Value("${mail.smtp.host}")
	private String MAIL_SMTP_HOST;
	@Value("${mail.smtp.port}")
	private int MAIL_SMTP_PORT;

	@Value("${gmail.username}")
	private String GMAIL_USERNAME;
	@Value("${gmail.password}")
	private String GMAIL_PASSWORD;
	@Value("${customer.response.email.subject}")
	private String CUSTOMER_RESPONSE_EMAIL_SUBJECT;
	
	private JavaMailSenderImpl  mailSender = new JavaMailSenderImpl();
	 @Autowired  
	 private VelocityEngine velocityEngine;  
	 
	 @Autowired
	 private NotificationEmailService notificationService;



	private Properties props = new Properties();

	@PostConstruct
	public void init() {
		logger.info("initiating mail service, using the following config:");
		logger.info("MAIL_SMTP_AUTH : " + MAIL_SMTP_AUTH);
		logger.info("MAIL_SMTP_STARTTLS_ENABLE : " + MAIL_SMTP_STARTTLS_ENABLE);
		logger.info("MAIL_SMTP_HOST : " + MAIL_SMTP_HOST);
		logger.info("MAIL_SMTP_PORT : " + MAIL_SMTP_PORT);
		logger.info("GMAIL_USERNAME : " + GMAIL_USERNAME);
		logger.info("GMAIL_PASSWORD : " + GMAIL_PASSWORD);

		props.put("mail.smtp.auth", MAIL_SMTP_AUTH);
		props.put("mail.smtp.starttls.enable", MAIL_SMTP_STARTTLS_ENABLE);
		
		mailSender.setHost(MAIL_SMTP_HOST);
		mailSender.setPort(MAIL_SMTP_PORT);
		mailSender.setUsername(GMAIL_USERNAME);
		mailSender.setPassword(GMAIL_PASSWORD);
		mailSender.setJavaMailProperties(props);
		
		velocityEngine.setProperty("spring.velocity.resource-loader-path", "classpath:/templates/");

	}
	
	public void sendMail(String from, String to, String subject, String msg) {

		SimpleMailMessage message = new SimpleMailMessage();

		message.setFrom(from);
		message.setTo(to);
		message.setSubject(subject);
		message.setText(msg);
		mailSender.send(message);
	}
	
	
	public String formatCustomerResponseEmail(Customer customer, List<Response> allResponses){
		VelocityContext velocityContext = new VelocityContext();
		velocityContext.put("customer", customer);
	    velocityContext.put("allResponses", allResponses);
	    StringWriter stringWriter = new StringWriter();
	    velocityEngine.mergeTemplate("templates/CustomerResponse.vm", "UTF-8", velocityContext, stringWriter);
	    return stringWriter.toString();
	}
	
	public void sendCustomerResponseEmail(Customer customer, List<Response> allResponses){
		String emailContent = this.formatCustomerResponseEmail(customer, allResponses);
		String toAddress = notificationService.getCurrentNotificationEmail();
		logger.info("sending to " + toAddress);
		this.sendMail(GMAIL_USERNAME, toAddress, CUSTOMER_RESPONSE_EMAIL_SUBJECT, emailContent);
	}

}
