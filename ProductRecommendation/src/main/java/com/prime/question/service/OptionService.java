package com.prime.question.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prime.product.service.ProductService;
import com.prime.question.model.Option;

@Service
public class OptionService {

	@PersistenceContext
	private EntityManager em;
	


	public List<Option> listAll() {
		return em.createQuery("SELECT u FROM Option u", Option.class).getResultList();
	}
	
	
	

}
