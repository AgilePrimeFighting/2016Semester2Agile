package com.prime.customer.service;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prime.customer.model.Customer;
import com.prime.product.model.Product;

@Service
public class CustomerService {
	
	@PersistenceContext
	private EntityManager em;
	
	 public List<Customer> listAll() 
	 {
	        return em.createQuery("SELECT u FROM Customer u", Customer.class).getResultList();
	 }
	 
	 @Transactional
	 public Customer createNewCustomer(Product product, String hasTrial, String firstName, 
			 String lastName, String email, String phone, String company, 
			 String country, String businessType, String addiMsg, String isSubscribe){
		 Customer customer = new Customer();
		 customer.setProduct(product);
		 customer.setDate(new Date());
		 customer.setHasTrial(hasTrial);
		 customer.setFirstName(firstName);
		 customer.setLastName(lastName);
		 customer.setEmail(email);
		 customer.setPhone(phone);
		 customer.setCompany(company);
		 customer.setCountry(country);
		 customer.setBusinessType(businessType);
		 customer.setAddiMsg(addiMsg);
		 customer.setIsSubscribe(isSubscribe);
		 if("false".equals(isSubscribe)){
			 customer.setIsSubscribe("No");
		 }else{
			 customer.setIsSubscribe("Yes");
		 }
		 em.persist(customer);
		 return customer;
	 }
	 
	 public Customer getCustomer(Integer customerId){
		 return em.find(Customer.class, customerId);
	 }

}
