package com.prime.PDF.service;

import java.util.List;

import javax.persistence.EntityManager;

import com.prime.PDF.model.PDF;
import com.prime.question.model.Question;

public class PDFService
{
	private EntityManager em;

	public List<PDF> listAll() 
	{
		return em.createQuery("SELECT u FROM Question u", PDF.class).getResultList();
	}
	
	
	
	
	
	
	
	

}
