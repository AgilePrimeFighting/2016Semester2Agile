package com.prime.video.service;

import java.util.List;

import javax.persistence.EntityManager;

import com.prime.video.model.Video;

public class VideoService {
	private EntityManager em;

	public List<Video> listAll() {
		return em.createQuery("SELECT u FROM Question u", Video.class)
				.getResultList();
	}
}
