package com.prime.product.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prime.product.model.Product;
import com.prime.question.AnswerQuestionBean;
import com.prime.question.model.Option;
import com.prime.response.model.Response;
import com.prime.weight.model.Weight;

@Service
public class ProductService 
{
	@PersistenceContext
	private EntityManager em;
	
	private static final Logger logger = Logger.getLogger(ProductService.class.getName());
	
	 public List<Product> listAll() 
	 {
		 	System.out.println("List all products");
	        return em.createQuery("SELECT u FROM Product u", Product.class).getResultList();
	 }
	 
	 
	 
	 @Transactional
	 public void createNewProduct ( String productName , boolean productActive , boolean productTrial  , String procutURL ) 
	 {
		 Product product = new Product() ;
		 product.setProductName(productName);
		 product.setProductActive(productActive);
		 product.setProductTrial(productTrial);
		 product.setProductURL(procutURL);
		 em.persist(product);
	 }
	 
	 
		@Transactional
		public void delete(Product product) {
			System.out.println("Product service : delete a product.");
			if(!em.contains(product)){
				product = em.merge(product);
			}
			em.remove(product);
		}
		
		
		@Transactional
		public void update(Product product) 
		{
			em.merge(product) ;
		}
		
		public Product getRecommendedProduct(List<Option> options){
			Map<Integer, Integer> weightMap = new HashMap<Integer, Integer>();
			Integer recommendedProductId = 0;
			Integer maximumWeight = 0;
			for(Option option : options){
				for(Weight weight: option.getWeightList()){
					Integer productID = weight.getProductId();
					Integer weightValue = weight.getWeightValue();
					Integer newValue = 0;
					if(!weightMap.containsKey(productID)){
						newValue = weightValue;
						
					}else{
						Integer oldValue = weightMap.get(productID);
						newValue = oldValue + weightValue;
						
					}
					weightMap.put(productID, newValue);
					if(newValue >= maximumWeight){
						maximumWeight = newValue;
						recommendedProductId = productID;
					}
				}
			}
			logger.info("recommended product Id is " + recommendedProductId);
			return em.find(Product.class, recommendedProductId);
		}
		

}
