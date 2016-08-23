package com.prime.question.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.prime.question.model.Response;

public class ResponseService {

	@PersistenceContext
	private EntityManager em;

	public List<Response> listAll() {
		return em.createQuery("SELECT u FROM Response u", Response.class)
				.getResultList();
	}

	@Transactional
	public void createNewStory(int customerId, int questionId, boolean answer) {
		Response response = new Response();
		response.setCustomerId(customerId);
		response.setQuestionId(questionId);
		response.setAnswer(answer);
		em.persist(response);
	}
}
