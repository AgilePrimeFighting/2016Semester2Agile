package com.prime.notification.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prime.notification.model.NotificationEmail;

@Service
public class NotificationEmailService {

	@PersistenceContext
	private EntityManager em;

	public List<NotificationEmail> listAll() {
		return em.createQuery("SELECT u FROM NotificationEmail u", NotificationEmail.class).getResultList();
	}

	@Transactional
	public void updateEmail(String address ) {
		NotificationEmail email = new NotificationEmail();
		email.setNotificationEmailId(1);
		email.setEmail(address);
			em.merge(email);
		
	}
	
	public String getCurrentNotificationEmail(){
		NotificationEmail email = em.find(NotificationEmail.class, 1);
		if(email != null){
			return email.getEmail();
		}
		else{
			return "";
		}
		
	}
	
	

}
