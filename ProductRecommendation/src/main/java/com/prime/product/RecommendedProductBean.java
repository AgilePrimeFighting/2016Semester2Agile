package com.prime.product;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.prime.PDF.model.PDF;
import com.prime.customer.CollectCustomerDetailBean;
import com.prime.product.model.Product;
import com.prime.response.model.Response;

@Controller
@Scope("session")
public class RecommendedProductBean {

	private static final Logger logger = Logger
			.getLogger(RecommendedProductBean.class.getName());

	private Product product;
	private List<Response> responses;
	private boolean isAvailable;
	
	
	@PostConstruct
	public void init() {
		clearSession();
		if(product == null) isAvailable = false;
		else isAvailable = true;
	}
	
	private void clearSession(){
		product = new Product();
		responses = new ArrayList<Response>();
		isAvailable = false;
	}
	
	
	public String doRegister(){
		FacesContext.getCurrentInstance().getExternalContext().getFlash()
			.put("product", product);
		FacesContext.getCurrentInstance().getExternalContext().getFlash()
			.put("responses", responses);
		clearSession();
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "CollectCustomerDetail?faces-redirect=true";
	}
	
	public StreamedContent downloadPdf(PDF pdf) {
		InputStream stream = new ByteArrayInputStream(pdf.getFileContent());
		StreamedContent file = new DefaultStreamedContent(stream, "application/pdf",
				pdf.getPDF_Name());
		return file;
		}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

}
