package com.prime.email.service;

import java.util.Properties;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import com.prime.question.AnswerQuestionBean;

import javax.annotation.PostConstruct;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

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
		

	}
	
	public void sendMail(String from, String to, String subject, String msg) {

		SimpleMailMessage message = new SimpleMailMessage();

		message.setFrom(from);
		message.setTo(to);
		message.setSubject(subject);
		message.setText(msg);
		mailSender.send(message);
	}

}
