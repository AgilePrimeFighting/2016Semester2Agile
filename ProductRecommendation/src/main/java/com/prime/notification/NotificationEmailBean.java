package com.prime.notification;

import java.io.Serializable;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.prime.notification.service.NotificationEmailService;

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
