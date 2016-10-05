package com.prime.PDF.model;

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
@Table (name="PDF")
public class PDF 
{
	@Id
	@Column (name ="PDF_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer PDF_ID ;
	
	@Column (name="PDF_Name")
	String PDF_Name ; 
	
	@Column (name="PDF_Content")
	byte[] fileContent ;
	
	//@ (name="PRODUCT_ID")
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRODUCT_ID")
	private Product product ;
	
	@Column (name = "PRODUCT_ID", insertable=false,updatable=false)
	private Integer productId ;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getPDF_ID() {
		return PDF_ID;
	}

	public void setPDF_ID(Integer pDF_ID) {
		PDF_ID = pDF_ID;
	}

	public String getPDF_Name() {
		return PDF_Name;
	}

	public void setPDF_Name(String pDF_Name) {
		PDF_Name = pDF_Name;
	}


	public byte[] getFileContent() {
		return fileContent;
	}

	public void setFileContent(byte[] bs) {
		this.fileContent = bs;
	}

}
