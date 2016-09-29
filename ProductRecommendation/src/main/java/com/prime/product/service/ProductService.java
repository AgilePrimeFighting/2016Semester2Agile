package com.prime.product.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prime.product.model.Product;
import com.prime.question.AnswerQuestionBean;
import com.prime.question.model.Option;
import com.prime.question.service.OptionService;
import com.prime.response.model.Response;
import com.prime.weight.model.Weight;

@Service
public class ProductService {
	@PersistenceContext
	private EntityManager em;

	private static final Logger logger = Logger.getLogger(ProductService.class.getName());
	
	@Autowired
	private OptionService optionService;

	public List<Product> listAll() {
		logger.info("List all products");
		return em.createQuery("SELECT u FROM Product u", Product.class).getResultList();
	}

	public List<Product> listActiveProducts() {
		return em.createQuery("SELECT u FROM Product u where u.productActive = 1", Product.class).getResultList();
	}

	@Transactional
	public void createNewProduct(String productName, boolean productActive, boolean productTrial, String procutURL) {
		Product product = new Product();
		product.setProductName(productName);
		product.setProductActive(productActive);
		product.setProductTrial(productTrial);
		product.setProductURL(procutURL);
		
		List<Option> options = optionService.listAll();
		
		for(Option option: options)
		{
			Weight weight = new Weight();
			weight.setProduct(product);
			weight.setOption(option);
			weight.setWeightValue(0);
			product.getWeightList().add(weight);
		}
		
		em.persist(product);		
	}
	
	

	@Transactional
	public void delete(Product product) {
		logger.info(" delete  product with id : " + product.getProductID());
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
			idToProductMap.put(product.getProductID(), product);
		}
		Integer recommendedProductId = 0;
		Integer maximumWeight = 0;
		for (Option option : options) {
			for (Weight weight : option.getWeightList()) {
				Integer productID = weight.getProductId();
				if (idToProductMap.containsKey(productID)) {
					Integer weightValue = weight.getWeightValue();
					Integer newValue = 0;
					if (!weightMap.containsKey(productID)) {
						newValue = weightValue;

					} else {
						Integer oldValue = weightMap.get(productID);
						newValue = oldValue + weightValue;

					}
					weightMap.put(productID, newValue);
					if (newValue >= maximumWeight) {
						maximumWeight = newValue;
						recommendedProductId = productID;
					}
				}
			}
		}
		logger.info("recommended product Id is " + recommendedProductId);
		return idToProductMap.get(recommendedProductId);
	}

}
