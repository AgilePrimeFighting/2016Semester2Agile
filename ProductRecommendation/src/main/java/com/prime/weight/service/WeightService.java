package com.prime.weight.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prime.question.model.Option;
import com.prime.question.model.Question;
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
	
	

	@Transactional
	public void update(List<Option> options , int choiceWeight[][]) 
	{
		for ( int i = 0 ; i < options.size() ; i ++ )
		{
			
			Option tempOption = options.get(i) ;
			
			System.out.println("WeightService : option size " + options.size());
			List<Weight> weightList = tempOption.getWeightList() ;
			for ( int j = 0 ; j < weightList.size() ; j ++ )
			{
				Weight tempWeight = weightList.get(j) ;
				
				int productID = tempWeight.getProductId() ;
				int optionID = tempOption.getOptionId() ;
				tempWeight.setWeightValue(choiceWeight[optionID][productID]);
				if(!em.contains(tempWeight))
				{
					em.merge(tempWeight) ;
				}
			}
			if(!em.contains(tempOption))
			{
				em.merge(tempOption) ;
			}
		}
		
	}
}
