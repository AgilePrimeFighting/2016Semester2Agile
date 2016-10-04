package com.prime.url.service;

import java.util.List;

import javax.persistence.EntityManager;

import com.prime.url.model.Url;

public class UrlService {
	private EntityManager em;

	public List<Url> listAll() 
	{
		return em.createQuery("SELECT u FROM Question u", Url.class).getResultList();
	}
}
