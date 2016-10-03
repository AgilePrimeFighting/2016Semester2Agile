package com.prime.question.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	public List<Question> listAll() 
	{
		return em.createQuery("SELECT u FROM Question u", Question.class).getResultList();
	}

	@Autowired
	private ProductService productService;

	@Transactional
	public void createNewQuestion(String body, List<Option> options) {
		Question question = new Question();
		question.setQuestionBody(body);

		if (options == null) {
			options = new ArrayList<Option>();
		}
		if (options.isEmpty()) {
			Option yesOption = new Option();
			yesOption.setOptionBody("Yes");
			Option noOption = new Option();
			noOption.setOptionBody("No");
			options.add(yesOption);
			options.add(noOption);

		}
		List<Product> products = productService.listAll();
		for (Option option : options) {
			option.setQuestion(question);
			if (option.getWeightList()== null || option.getWeightList().isEmpty()) {
				for (Product product : products) {
					Weight weight = new Weight();
					weight.setOption(option);
					weight.setProduct(product);
					weight.setWeightValue(0);
					option.getWeightList().add(weight);
				}
			}

		}
		question.setOptions(options);
		em.persist(question);

	}

	@Transactional
	public void delete(Question question) {
		if (!em.contains(question)) {
			question = em.merge(question);

		}
		em.remove(question);
		for (Option option : question.getOptions()) {

			for (Weight weight : option.getWeightList()) {
				em.remove(weight);
			}
		}
	}

	@Transactional
	public void update(Question question) {
		if (question.getOptions() == null) {
			question.setOptions(new ArrayList<Option>());
		}
		if (question.getOptions().isEmpty()) {
			Option yesOption = new Option();
			yesOption.setOptionBody("Yes");
			Option noOption = new Option();
			noOption.setOptionBody("No");
			question.getOptions().add(yesOption);
			question.getOptions().add(noOption);

		}
		for (Option option : question.getOptions()) {
			option.setQuestion(question);
		}
		if (!em.contains(question)) {
			question = em.merge(question);
		}

	}
	
	public Weight[][] buildWeightMatrix(List<Option> options, List<Product> products) 
	{
		Weight[][] weightMatrix = new Weight[options.size()][products.size()];
		Map<Integer, Integer> productIdIndex = new HashMap<Integer, Integer>();
		for(int i = 0; i < products.size(); i ++)
		{
			productIdIndex.put( products.get(i).getProductId(), i);
		}
		
		
		for(int optionIndex = 0; optionIndex < options.size(); optionIndex ++ )
		{
			Option option = options.get(optionIndex);
			for(Weight weight: option.getWeightList())
			{
				Integer productId = weight.getproductId();
				if(productId ==null){
					productId = weight.getProduct().getProductId();
				}
				Integer productPosition = productIdIndex.get( productId);
				
				weightMatrix[optionIndex][productPosition] = weight;
			}
		}
		return weightMatrix;
	}

}
