package com.prime.customer.service;

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
	
	 public List<Customer> listAll() {
	        return em.createQuery("SELECT u FROM Customer u", Customer.class).getResultList();
	 }
	 
	 public Customer getCustomer(Integer customerId){
		 return em.find(Customer.class, customerId);
	 }

	 @Transactional
	 public Customer persistCustomer(Customer customer){
		 if(!em.contains(customer)) em.persist(customer);
		 em.flush();
		 return customer;
	 }
}
