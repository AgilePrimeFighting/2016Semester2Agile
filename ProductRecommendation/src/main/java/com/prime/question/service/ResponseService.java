package com.prime.question.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prime.question.model.Response;

@Service
public class ResponseService {

	@PersistenceContext
	private EntityManager em;

	public List<Response> listAll() {
		return em.createQuery("SELECT u FROM Response u", Response.class)
				.getResultList();
	}

	@Transactional
	public void createNewResponse(int customerId, String questionBody, String answer) {
		Response response = new Response();
		response.setCustomerId(customerId);
		response.setQuestionBody(questionBody);
		response.setAnswer(answer);
		em.persist(response);
	}
}
