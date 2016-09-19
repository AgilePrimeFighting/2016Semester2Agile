package com.prime.email.service;

import java.io.StringWriter;
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
	
	private JavaMailSenderImpl  mailSender = new JavaMailSenderImpl();
	 @Autowired  
	 private VelocityEngine velocityEngine;  



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
	
	public String formatMessage(){
	    VelocityContext velocityContext = new VelocityContext();
	    velocityContext.put("userName", "John Low");
	    StringWriter stringWriter = new StringWriter();
	    velocityEngine.mergeTemplate("CustomerResponse.vm", "UTF-8", velocityContext, stringWriter);
	    return stringWriter.toString();
	}

}