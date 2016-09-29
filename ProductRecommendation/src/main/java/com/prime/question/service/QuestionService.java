package com.prime.question.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prime.product.model.Product;
import com.prime.product.service.ProductService;
import com.prime.question.model.Option;
import com.prime.question.model.Question;
import com.prime.weight.model.Weight;

@Service
public class QuestionService {

	@PersistenceContext
	private EntityManager em;

	public List<Question> listAll() {
		return em.createQuery("SELECT u FROM Question u", Question.class).getResultList();
	}
	
	
	@Autowired
	private ProductService productService;

	@Transactional
	public void createNewQuestion(String body, List<Option> options) {
		Question question = new Question();
		question.setQuestionBody(body);
		
		if(options ==null )
		{
			options = new ArrayList<Option>();
		}
		if(options.isEmpty())
		{
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
		question.setOptions(options);
		em.persist(question);
		
		List<Product> products = productService.listAll() ;
		for ( Product product : products )
		{
			for ( Option option : options ) 
			{
				Weight weight = new Weight () ;
				weight.setOption(option);
				weight.setProduct(product);
				weight.setWeightValue(0);
				product.getWeightList().add(weight) ;
			}
			em.persist(product);
			
		}
	}
	
	
	@Transactional
	public void delete(Question question) {
		if(!em.contains(question)){
			question = em.merge(question);
			
		}
		em.remove(question);
		for ( Option option :question.getOptions() ) 
		{
			
			for ( Weight weight :option.getWeightList()  )
			{
				em.remove(weight);
			}
		}
	}
	
	
	@Transactional
	public void update(Question question) 
	{
		if(question.getOptions() ==null)
		{
			question.setOptions(new ArrayList<Option>());
		}
		if(question.getOptions().isEmpty()){
			Option yesOption = new Option();
			yesOption.setOptionBody("Yes");
			Option noOption = new Option();
			noOption.setOptionBody("No");
			question.getOptions().add(yesOption);
			question.getOptions().add(noOption);
			
		}
		for(Option option: question.getOptions())
		{
			option.setQuestion(question);
		}
		if(!em.contains(question)){
			question = em.merge(question);
		}
		
	}

}
