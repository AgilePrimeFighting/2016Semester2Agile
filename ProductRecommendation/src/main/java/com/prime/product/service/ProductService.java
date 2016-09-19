package com.prime.product.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prime.product.model.Product;
import com.prime.question.model.Option;
import com.prime.question.model.Question;

@Service
public class ProductService 
{
	@PersistenceContext
	private EntityManager em;
	
	 public List<Product> listAll() 
	 {
		 	System.out.println("List all products");
	        return em.createQuery("SELECT u FROM Product u", Product.class).getResultList();
	 }
	 
	 
	 
	 @Transactional
	 public void createNewProduct ( String productName , boolean productActive , boolean productTrail  , String procutURL ) 
	 {
		 Product product = new Product() ;
		 product.setProductName(productName);
		 product.setProductActive(productActive);
		 product.setProductTrail(productTrail);
		 product.setProductURL(procutURL);
		 em.persist(product);
	 }
	 
	 
		@Transactional
		public void delete(Product product) {
			if(!em.contains(product)){
				product = em.merge(product);
			}
			em.remove(product);
		}
		
		
		@Transactional
		public void update(Question product) 
		{
//			if(question.getOptions() ==null)
//			{
//				question.setOptions(new ArrayList<Option>());
//			}
//			if(question.getOptions().isEmpty()){
//				Option yesOption = new Option();
//				yesOption.setOptionBody("Yes");
//				Option noOption = new Option();
//				noOption.setOptionBody("No");
//				question.getOptions().add(yesOption);
//				question.getOptions().add(noOption);
//				
//			}
//			for(Option option: question.getOptions()){
//				option.setQuestion(question);
//			}
//			if(!em.contains(question)){
//				question = em.merge(question);
//			}
			
		}

}
