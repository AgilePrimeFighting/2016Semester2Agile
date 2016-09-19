package com.prime.customer.service;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prime.customer.model.Customer;

@Service
public class CustomerService {
	
	@PersistenceContext
	private EntityManager em;
	
	 public List<Customer> listAll() 
	 {
	        return em.createQuery("SELECT u FROM Customer u", Customer.class).getResultList();
	 }
	 
	 @Transactional
	 public Customer createNewCustomer(){
		 Customer customer = new Customer();
		 customer.setProduct("MYOB EXO");
		 customer.setDate(new Date());
		 em.persist(customer);
		 return customer;
	 }

}
