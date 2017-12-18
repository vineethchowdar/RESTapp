package com.mvc.app.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="supplier")
public class Supplier {
	
	@Id
	private int sup_id;
	private String sup_name;
	
	@OneToMany(mappedBy="supplier", fetch=FetchType.EAGER)
	private Set<Product> products;

	public Supplier() {
		
	}

	public Supplier(int sup_id, String sup_name, Set<Product> products) {
		
		this.sup_id = sup_id;
		this.sup_name = sup_name;
		this.products = products;
	}

	public int getSup_id() {
		return sup_id;
	}

	public void setSup_id(int sup_id) {
		this.sup_id = sup_id;
	}

	public String getSup_name() {
		return sup_name;
	}

	public void setSup_name(String sup_name) {
		this.sup_name = sup_name;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
	

}
