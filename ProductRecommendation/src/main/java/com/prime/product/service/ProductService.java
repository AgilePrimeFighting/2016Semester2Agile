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

}
