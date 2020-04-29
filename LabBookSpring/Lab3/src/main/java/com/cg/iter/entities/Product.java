package com.cg.iter.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name="products")
public class Product {

	@Id
	private Integer productId;
	@Column(name="name",length=20)
	private String productName;
	@Column(name="description",length=120)
	private String productDescription;
	@Column(name="price")
	private Double productPrice;
	
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}



	public Product(Integer productId, String productName, String productDescription, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productdescription = productDescription;
		this.productprice = productPrice;
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



	public String getProductDescription() {
		return productDescription;
	}



	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}



	public double getProductPrice() {
		return productPrice;
	}



	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	
}
