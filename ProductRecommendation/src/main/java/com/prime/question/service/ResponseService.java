package com.prime.question.service;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prime.question.AnswerQuestionBean;
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
	public void createNewResponse(int customerId, String questionBody, String answer) {
		Response response = new Response();
		response.setCustomerId(customerId);
		response.setQuestionBody(questionBody);
		response.setAnswer(answer);
		logger.info("answer " + answer);
		em.persist(response);
	}
}
