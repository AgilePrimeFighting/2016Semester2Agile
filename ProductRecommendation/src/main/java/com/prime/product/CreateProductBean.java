package com.prime.product;

import java.util.logging.Logger;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

import com.prime.url.model.Url;
import com.prime.video.model.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.prime.product.model.Product;
import com.prime.product.service.ProductService;
import com.prime.question.CreateQuestionBean;

@Controller
@Scope("session")
public class CreateProductBean {

	private static final Logger logger = Logger
			.getLogger(CreateQuestionBean.class.getName());

	@Autowired
	private ProductService productService;

	private Product product;

	public void initBean() {
		product = new Product();
		product.setProductName(null);
		product.setProductActive(false);
		product.setProductTrial(false);
		product.setOverview(null);
	}

	public String onSave() {
		logger.info("onSave");
		product = productService.createNewProduct(product);
		initBean();
		return "ViewProducts?faces-redirect=true";
	}

	public void validateURL(FacesContext context, UIComponent component,
			Object value) throws ValidatorException {
		if (product.isProductTrial()
				&& (value == null || value.toString().compareTo("") == 0)) {
			FacesMessage message = new FacesMessage(
					"This is a trial product , you must give a URL");
			throw new ValidatorException(message);
		}
	}

	public static Logger getLogger() {
		return logger;
	}

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void removeVideo(Video video) {
		product.getVideoList().remove(video);
	}

	public void addVideo(Video video) {
		product.getVideoList().add(video);
	}

	public void addVideo(String name, String description, String url, int length) {
		Video video = new Video();
		video.setVideoName(name);
		video.setVideoDescription(description);
		video.setVideoUrl(url);
		video.setVideoLength(length);
		video.setProduct(product);
		addVideo(video);
	}

	public void removeUrl(Url url) {
		product.getUrlSet().remove(url);
	}

	public void addUrl(Url url) {
		product.getUrlSet().add(url);
	}

}
