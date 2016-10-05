package com.prime.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import com.prime.url.model.Url;
import com.prime.video.model.Video;

import org.primefaces.event.FileUploadEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.prime.PDF.model.PDF;
import com.prime.product.model.Product;
import com.prime.product.service.ProductService;


@Controller
@Scope("session")
public class EditProductBean 
{
	
	private static final Logger logger = Logger.getLogger(EditProductBean.class.getName());

	private Product product;
	

	private List<PDF> pdfTempList = new ArrayList<PDF>();
	

	public List<PDF> getPdfTempList() {
		return pdfTempList;
	}

	public void setPdfTempList(List<PDF> pdfTempList) {
		this.pdfTempList = pdfTempList;
	}

	static int fileListIndex = 0;
	
	@Autowired
	private ProductService productService;

	@PostConstruct
	public void init() {
		logger.info("initiated");
	}

	public void initEdit(Product product) {
		
		logger.info("product received");
		logger.info("no of urls " + product.getUrlSet().size()) ;
		this.product= productService.initializeCollections(product);
		logger.info("no of urls " + product.getUrlSet().size()) ;
	}

	public String doSave() {
		if (product != null) {
			productService.update(product);
		}

		return "ViewProducts?faces-redirect=true";
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	public void removeUrl(Url url) {
		this.product.getUrlSet().remove(url);
	}

	public void removePDF(PDF pdf) {
		this.product.getPdfList().remove(pdf);
	}

	public void addUrl() {
		Url url = new Url();
		url.setProduct(product);

		product.getUrlSet().add(url);
	}

	public void handleFileUpload(FileUploadEvent event) {
		System.out.println("EditProductBean: handleFileUpload function.");
		if (event == null) {
			System.out.println("Event is null ,exception ");
		}
		PDF pdfFile = new PDF();
		pdfFile.setPDF_Name(event.getFile().getFileName());
		pdfFile.setFileContent(event.getFile().getContents());
		pdfFile.setProduct(product);
		FacesMessage message = new FacesMessage("Succesful", event.getFile()
				.getFileName() + " is uploaded.");
		// pdfFileList.put(fileListIndex, pdfFile) ;
		product.getPdfList().add(pdfFile);
		// pdfTempList.add(pdfFile) ;
		// fileListIndex ++ ;
		// System.out.println("pdfFileList : " + pdfFileList.size());
		FacesContext.getCurrentInstance().addMessage(null, message);
		return;
	}
	
	public void removeVideo(Video video){
		product.removeVideo(video);
	}

	public void addVideo(Video video){
		product.addVideo(video);
	}

	public void addVideo(String name, String description, String url, int length) {
		Video video=new Video();
		video.setVideoName(name);
		video.setVideoDescription(description);
		video.setVideoUrl(url);
		video.setVideoLength(length);
		video.setProduct(product);
		addVideo(video);
	}
	
	public Set<Url> links(){
		logger.info("get links " + product.getUrlSet().size());
		return product.getUrlSet();
	}

}
