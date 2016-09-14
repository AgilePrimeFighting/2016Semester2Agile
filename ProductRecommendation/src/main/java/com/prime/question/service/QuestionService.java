package com.prime.question.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.primefaces.expression.SearchExpressionFacade.Options;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prime.question.model.Option;
import com.prime.question.model.Question;

@Service
public class QuestionService {

	@PersistenceContext
	private EntityManager em;

	public List<Question> listAll() {
		return em.createQuery("SELECT u FROM Question u", Question.class).getResultList();
	}

	@Transactional
	public void createNewStory(String body, List<Option> options) {
		Question question = new Question();
		question.setQuestionBody(body);
		question.setOptions(options);
		if(options ==null ){
			options = new ArrayList<Option>();
		}
		if(options.isEmpty()){
			Option yesOption = new Option();
			yesOption.setOptionBody("Yes");
			Option noOption = new Option();
			noOption.setOptionBody("No");
			options.add(yesOption);
			options.add(noOption);
			
		}
		for(Option option: options){
			option.setQuestion(question);
		}
		em.persist(question);
	}
	@Transactional
	public void delete(Question question) {
		if(!em.contains(question)){
			question = em.merge(question);
		}
		em.remove(question);
	}
	@Transactional
	public void update(Question question) {
		if(!em.contains(question)){
			question = em.merge(question);
		}
		em.flush();
		
	}

}
