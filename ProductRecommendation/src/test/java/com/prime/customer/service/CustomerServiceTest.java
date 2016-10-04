package com.prime.customer.service;

import java.util.logging.Logger;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.prime.customer.model.Customer;
import com.prime.email.service.EmailService;
import com.prime.email.service.EmailServiceTest;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:/spring/spring-config.xml")
public class CustomerServiceTest {
	private static final Logger logger = Logger.getLogger(EmailServiceTest.class.getName());
	
	@Autowired
	private CustomerService customerService;
	

	@Test
	public void testGetCustomer() {
		logger.info("test");
		Customer customer = customerService.getCustomer(82);
		logger.info(customer.getProduct().getProductName());
	}
}
