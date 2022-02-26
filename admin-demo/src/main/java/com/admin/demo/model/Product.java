package com.admin.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;
//import org.springframework.data.annotation.Id;
//
//import lombok.AllArgsConstructor;
//import lombok.data;
//
//@Data
//@AllArgsConstructor
@Document (collection = "Product")
public class Product {
	
	private String productName;
	private String productDescription;
	private String price;
	
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
	
	public String getPrice() {
		return price;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}
	
//	@Override
//	public String toString() {
//		return "Product [productName=" + productName + ", productDescription=" + productDescription + ", price=" + price
//				+ "]";
//	}
	
}

