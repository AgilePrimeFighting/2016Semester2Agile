package com.prime.product.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prime.product.model.Product;
import com.prime.response.model.Response;

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
			//System.out.println("This is product update function.");
//			if ( !em.contains(product)  )
//			{
//				em.merge(product) ;
//			} 
			em.merge(product) ;
		}
		

		
	
	

	@Transactional
	public void delete(Product product) {
		logger.info(" delete  product with id : " + product.getproductId());
		if (!em.contains(product)) {
			product = em.merge(product);
		}
		em.remove(product);
	}

	@Transactional
	public void update(Product product) {
		em.merge(product);
	}

	public Product getRecommendedProduct(List<Option> options) {
		Map<Integer, Integer> weightMap = new HashMap<Integer, Integer>();
		List<Product> activeProducts = this.listActiveProducts();
		Map<Integer, Product> idToProductMap = new HashMap<Integer, Product>();
		for (Product product : activeProducts) {
			idToProductMap.put(product.getproductId(), product);
		}
		Integer recommendedproductId = 0;
		Integer maximumWeight = 0;
		for (Option option : options) {
			for (Weight weight : option.getWeightList()) {
				Integer productId = weight.getproductId();
				if (idToProductMap.containsKey(productId)) {
					Integer weightValue = weight.getWeightValue();
					Integer newValue = 0;
					if (!weightMap.containsKey(productId)) {
						newValue = weightValue;

					} else {
						Integer oldValue = weightMap.get(productId);
						newValue = oldValue + weightValue;

					}
					weightMap.put(productId, newValue);
					if (newValue >= maximumWeight) {
						maximumWeight = newValue;
						recommendedproductId = productId;
					}
				}
			}
		}
		logger.info("recommended product Id is " + recommendedproductId);
		return idToProductMap.get(recommendedproductId);
	}


}
