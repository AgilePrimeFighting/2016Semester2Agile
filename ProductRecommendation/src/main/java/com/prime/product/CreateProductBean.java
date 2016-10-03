package com.prime.product;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

import org.primefaces.event.FileUploadEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.prime.PDF.model.PDF;
import com.prime.product.service.ProductService;
import com.prime.question.CreateQuestionBean;

@Controller
@Scope("session")
public class CreateProductBean
{
	
	private static final Logger logger = Logger.getLogger( CreateQuestionBean.class.getName() );


	@Autowired
	private ProductService productService;
	
	private String productName ; 
	private boolean productActive ;
	private boolean productTrial ;
	private String productURL ;
	private List<PDF> pdfList ;

	public void initBean () 
	{
		System.out.println("start to init product bean");
		productName = null ;
		productActive = false ;
		//productTrail  = false ;
		productTrial = false ;
		productURL = null ;
		pdfList = new ArrayList<PDF>();  
	}

	
	public String onSave(){
		logger.info("onSave");
		//logger.info("question body = " + getQuestionBody());
		productService.createNewProduct(productName, productActive ,productTrial , productURL , pdfList );
		initBean();
		//return "ViewProducts" ;
		return "ViewProducts?faces-redirect=true";
	}
	
	public ProductService getProductService() {
		return productService;
	}
	public void setProductService(ProductService productService) {
		this.productService = productService;
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


	public String getProductURL() {
		return productURL;
	}


	public void setProductURL(String productURL) {
		this.productURL = productURL;
	}


	public static Logger getLogger() 
	{
		return logger;
	}
	
	
	public void removePDF ( PDF pdf ) 
	{
		pdfList.remove(pdf) ;
	}

	public List<PDF> getPdfList() {
		return pdfList;
	}


	public void setPdfList(List<PDF> pdfList) {
		this.pdfList = pdfList;
	}


	public void validateURL (FacesContext context , UIComponent component , Object value ) throws ValidatorException
	{

		System.out.println("start to validate URL ");
		System.out.println("URL value " + value.toString()  + " trial value " + productTrial);
		//String data = value.toString() ;
		if ( productTrial == true && (value == null || value.toString().compareTo("") == 0 )) 
		{
			FacesMessage message = new FacesMessage ("This is a trial product , you must give a URL");
			throw new ValidatorException(message) ; 
		}
	}
	
	public void handleFileUpload(FileUploadEvent event) 
	{
		System.out.println("CreateProductBean: handleFileUpload function.");
		if ( event == null ) 
		{
			System.out.println("Event is null ,exception ");
		}
		PDF pdfFile = new PDF() ;
		pdfFile.setPDF_Name(event.getFile().getFileName());
		pdfFile.setFileContent(event.getFile().getContents());
		//pdfFile.setProduct(product);
		//pdfFile.setPDF_ID(product.getProductId());
		System.out.println("pdfName : " + event.getFile().getFileName());
	    System.out.println("fileLength " + event.getFile().getSize());
	   // System.out.println("productID  " + pdfFile.getPDF_ID());
        FacesMessage message = new FacesMessage("Succesful", event.getFile().getFileName() + " is uploaded.");
        //pdfFileList.put(fileListIndex, pdfFile) ;
        pdfList.add(pdfFile) ;
       // pdfTempList.add(pdfFile) ;
   //     fileListIndex ++ ;
  //      System.out.println("pdfFileList : " + pdfFileList.size());
        FacesContext.getCurrentInstance().addMessage(null, message);
        return  ;
    }
	
}
