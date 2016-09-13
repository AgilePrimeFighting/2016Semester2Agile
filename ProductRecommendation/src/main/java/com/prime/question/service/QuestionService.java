package com.prime.question.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prime.question.model.Question;

@Service
public class QuestionService {

	@PersistenceContext
	private EntityManager em;

	public List<Question> listAll() {
		return em.createQuery("SELECT u FROM Question u", Question.class).getResultList();
	}

	@Transactional
	public void createNewStory(String body) {
		Question question = new Question();
		question.setQuestionBody(body);
		em.persist(question);
	}
	@Transactional
	public void delete(Question question) {
		if(!em.contains(question)){
			question = em.merge(question);
		}
		em.remove(question);
	}

}
