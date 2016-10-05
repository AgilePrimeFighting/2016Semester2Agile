package com.prime.product.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.prime.PDF.model.PDF;
import com.prime.url.model.Url;
import com.prime.video.model.Video;
import com.prime.weight.model.Weight;

@Entity
@Table
public class Product {

	@Id
	@Column(name = "PRODUCT_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productId;

	@Column(name = "PRODUCT_NAME")
	private String productName;

	@Column(name = "PRODUCT_ACTIVE")
	private boolean productActive;

	@Column(name = "PRODUCT_TRIAL")
	private boolean productTrial;

	@Column(name = "OVERVIEW")
	private String overview;

	@OneToMany(mappedBy = "product", targetEntity = Weight.class, orphanRemoval = true,  fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<Weight> weightSet = new HashSet<Weight>();

	@OneToMany(mappedBy = "product", targetEntity = Url.class, orphanRemoval = true, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<Url> urlSet = new HashSet<Url>();

	@OneToMany(mappedBy = "product", targetEntity = PDF.class, orphanRemoval = true, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<PDF> pdfList = new ArrayList<PDF>();

	@OneToMany(mappedBy = "product", targetEntity = Video.class, orphanRemoval = true, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Video> videoList = new ArrayList<Video>();

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public Set<Weight> getWeightSet() {
		return weightSet;
	}

	public void setWeightSet(Set<Weight> weightSet) {
		this.weightSet = weightSet;
	}


	public List<Video> getVideoList() {
		return videoList;
	}

	public void setVideoList(List<Video> videoList) {
		this.videoList = videoList;
	}

	public void addVideo(Video video) {
		if (!videoList.contains(video))
			videoList.add(video);
	}

	public void removeVideo(Video video) {
		if (videoList.contains(video))
			videoList.remove(video);
	}

	public String outputActive() {
		return this.productActive == true ? "Active" : "Inactive";
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public boolean isProductActive() {
		return productActive;
	}

	public void setProductActive(boolean productActive) {
		this.productActive = productActive;
	}

	public boolean isProductTrial() {
		return productTrial;
	}

	public void setProductTrial(boolean productTrial) {
		this.productTrial = productTrial;
	}

	public String outputTrial() {
		return this.productTrial == true ? "YES" : "NO";
	}

	public Set<Url> getUrlSet() {
		return urlSet;
	}

	public void setUrlSet(Set<Url> urlList) {
		this.urlSet = urlList;
	}

	public List<PDF> getPdfList() {
		return pdfList;
	}

	public void setPdfList(List<PDF> pdfList) {
		this.pdfList = pdfList;
	}
}
