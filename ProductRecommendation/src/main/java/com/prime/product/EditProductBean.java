package com.prime.product;

import java.util.ArrayList;
<<<<<<< HEAD
import java.util.HashMap;
import java.util.List;
import java.util.Map;
=======
import java.util.List;
>>>>>>> origin/sprint-5
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

<<<<<<< HEAD
=======
import com.prime.url.model.Url;
import com.prime.video.model.Video;

>>>>>>> origin/sprint-5
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
	
<<<<<<< HEAD
	//private PDF pdfFileList ;
	
	//Map<Integer, PDF> pdfFileList = new HashMap<Integer, PDF>();
	
	private List<PDF> pdfTempList = new ArrayList<PDF>(); 
	
	public List<PDF> getPdfTempList() {
		return pdfTempList;
	}

	public void setPdfTempList(List<PDF> pdfTempList) {
		this.pdfTempList = pdfTempList;
	}


	static int fileListIndex = 0 ;

=======
	private List<Url> urlTempList = new ArrayList<Url>();

	private List<PDF> pdfTempList = new ArrayList<PDF>();
	
	public List<Url> getUrlTempList() {
		return urlTempList;
	}

	public void setUrlTempList(List<Url> urlTempList) {
		this.urlTempList = urlTempList;
	}
>>>>>>> origin/sprint-5

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
	public void init()
	{
		logger.info("initiated");
	}

	public void initEdit(Product product) 
	{
		logger.info("product received");
		this.product = product;
		pdfTempList = product.getPdfList() ;
	}

<<<<<<< HEAD
	public String doSave() 
	{	
=======
	public String doSave() {
>>>>>>> origin/sprint-5
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
	
<<<<<<< HEAD
	
	public void removePDF ( PDF pdf ) 
	{
		this.product.getPdfList().remove(pdf) ;
	}
	
	
	public void handleFileUpload(FileUploadEvent event) 
	{
		System.out.println("EditProductBean: handleFileUpload function.");
		if ( event == null ) 
		{
			System.out.println("Event is null ,exception ");
		}
		PDF pdfFile = new PDF() ;
		pdfFile.setPDF_Name(event.getFile().getFileName());
		pdfFile.setFileContent(event.getFile().getContents());
		pdfFile.setProduct(product);
		//pdfFile.setPDF_ID(product.getProductId());
		System.out.println("pdfName : " + event.getFile().getFileName());
	    System.out.println("fileLength " + event.getFile().getSize());
	   // System.out.println("productID  " + pdfFile.getPDF_ID());
        FacesMessage message = new FacesMessage("Succesful", event.getFile().getFileName() + " is uploaded.");
        //pdfFileList.put(fileListIndex, pdfFile) ;
        product.getPdfList().add(pdfFile) ;
       // pdfTempList.add(pdfFile) ;
   //     fileListIndex ++ ;
  //      System.out.println("pdfFileList : " + pdfFileList.size());
        FacesContext.getCurrentInstance().addMessage(null, message);
        return  ;
    }
	
	
=======
	public void removeUrl(Url url) {
		this.product.getUrlList().remove(url);
	}

	public void removePDF(PDF pdf) {
		this.product.getPdfList().remove(pdf);
	}

	public void addUrl() {
		if (urlTempList == null) {
			urlTempList = new ArrayList<Url>();
		}
		Url url = new Url();
		url.setProduct(product);

		urlTempList.add(url);
		product.setUrlList(urlTempList);
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
		video.setVideoProduct(product);
		addVideo(video);
	}

>>>>>>> origin/sprint-5
}
