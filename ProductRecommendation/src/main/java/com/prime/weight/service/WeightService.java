package com.prime.weight.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prime.weight.model.Weight;

@Service 
public class WeightService 
{

	@PersistenceContext
	private EntityManager em;
	
	public List<Weight>getWeightList ( int optionID , int productID) 
	{
		System.out.println("WeightService : option ID " + optionID + " procutID " + productID);
		return em.createQuery("FROM Weight where OPTION_ID =" + optionID + " and PRODUCT_ID = " + productID ).getResultList() ;
	}
	
	

}
