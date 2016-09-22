package com.prime.notification;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.prime.customer.ResponseItem;
import com.prime.customer.model.Customer;
import com.prime.customer.service.CustomerService;
import com.prime.email.service.EmailService;
import com.prime.notification.model.NotificationEmail;
import com.prime.notification.service.NotificationEmailService;
import com.prime.question.model.Question;
import com.prime.question.service.QuestionService;
import com.prime.question.service.ResponseService;

@Controller
@Scope("session")
public class NotificationEmailBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger( NotificationEmailBean.class.getName() );
	
	private String email;
	
	
	@Autowired
	private NotificationEmailService notificationService;
	
	@PostConstruct
	public void init(){
		logger.info("initiating");
		email = notificationService.getCurrentNotificationEmail();
	}
	
	
	public String doSave(){
		notificationService.updateEmail(email);
		return "AdministratorHome";
	}



	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
}
