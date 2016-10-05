package com.prime.video.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.prime.product.model.Product;

@Entity
@Table
public class Video {

	@Id
	@Column(name = "VIDEO_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer videoId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRODUCT_ID")
	private Product product;
	
	@Column (name = "PRODUCT_ID", insertable=false,updatable=false)
	private Integer productId ;
	
	

	@Column(name = "VIDEO_NAME")
	private String videoName;

	@Column(name = "VIDEO_URL")
	private String videoUrl;

	@Column(name = "VIDEO_DESCRIPTION")
	private String videoDescription;

	@Column(name = "VIDEO_LENGTH")
	private Integer videoLength;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRODUCT_ID", insertable = true, updatable = true)
	private Product product;

	public Integer getVideoId() {
		return videoId;
	}

	public void setVideoId(Integer videoId) {
		this.videoId = videoId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	
	public String getVideoName() {
		return videoName;
	}

	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public String getVideoDescription() {
		return videoDescription;
	}

	public void setVideoDescription(String videoDescription) {
		this.videoDescription = videoDescription;
	}

	public Integer getVideoLength() {
		return videoLength;
	}

	public void setVideoLength(Integer videoLength) {
		this.videoLength = videoLength;
	}
	
}
