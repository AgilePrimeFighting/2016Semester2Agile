package com.prime.notification.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table
public class NotificationEmail {

	@Id
	@Column(name = "NOTIFICATION_EMAIL_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer notificationEmailId;
	
	@Column(name = "EMAIL")
	private String email;


	public Integer getNotificationEmailId() {
		return notificationEmailId;
	}

	public void setNotificationEmailId(Integer notificationEmailId) {
		this.notificationEmailId = notificationEmailId;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	


	
}
