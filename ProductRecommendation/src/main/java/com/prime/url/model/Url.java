package com.prime.url.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Url")
public class Url {

	@Id
	@Column(name = "URL_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer urlId;

	@Column(name = "PRODUCT_ID", insertable = false, updatable = false)
	private Integer productId;

	@Column(name = "URL")
	private String url;

	@Column(name = "DISPLAY_TEXT")
	private String displayText;

	public Integer getUrlId() {
		return urlId;
	}

	public void setUrlId(Integer urlId) {
		this.urlId = urlId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDisplayText() {
		return displayText;
	}

	public void setDisplayText(String displayText) {
		this.displayText = displayText;
	}
}
