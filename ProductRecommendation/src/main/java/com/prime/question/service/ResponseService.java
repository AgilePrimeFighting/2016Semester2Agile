package com.prime.question.service;

import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prime.customer.model.Customer;
import com.prime.response.model.Response;

@Service
public class ResponseService {

	private static final Logger logger = Logger.getLogger( ResponseService.class.getName() );
	@PersistenceContext
	private EntityManager em;

	public List<Response> listAll() {
		return em.createQuery("SELECT u FROM Response u", Response.class)
				.getResultList();
	}

	@Transactional
	public void createNewResponse(int customerId, int questionId, String questionBody, String answer) {
		Customer customer = em.find(Customer.class, customerId);
		Response response = new Response();
		response.setCustomer(customer);
		response.setQuestionId(questionId);
		response.setQuestionBody(questionBody);
		response.setAnswer(answer);
		response.setDate(new Date());
		logger.info("answer " + answer);
		em.persist(response);
	}
	
	@Transactional
	public void createResponse(Response response) {
		em.persist(response);
	}
	
}
