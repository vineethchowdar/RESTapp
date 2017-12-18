package com.mvc.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
@Entity
@Table(name="product")
public class Product {
	
	@Id
	@Column(name="product_id")
	private int id;
	@Column(name="product_name")
	private String name;
	@Column(name="product_description")
	private String description;
	@Column(name="product_price")
	private float price;
	
	
//	@ManyToOne(fetch=FetchType.EAGER)
//	@JoinColumn(name="sup_id")
//	private Supplier supplier;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}	

	public Product(int id, String name, String description, float price) {
		
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
//	public Supplier getSupplier() {
//		return supplier;
//	}
//
//	public void setSupplier(Supplier supplier) {
//		this.supplier = supplier;
//	}
//
//	public Product(Supplier supplier) {
//		super();
//		this.supplier = supplier;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	

}
