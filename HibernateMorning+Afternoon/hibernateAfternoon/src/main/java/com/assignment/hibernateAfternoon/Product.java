package com.assignment.hibernateAfternoon;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Product {
	@Id
	private int product_id;
	private String product_name;
	
	@OneToMany(mappedBy="product_Object")
	List<Categories> cats= new ArrayList();
	
	@ManyToMany(mappedBy="product_list")
	List<Supplier> supplier_list=new ArrayList();

	public List<Categories> getCategory_list() {
		return category_list;
	}

	public void setCategory_list(List<Categories> category_list) {
		this.category_list = category_list;
	}

	public List<Supplier> getSupplier_list() {
		return supplier_list;
	}

	public void setSupplier_list(List<Supplier> supplier_list) {
		this.supplier_list = supplier_list;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}


	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", category_list=" + category_list + ", supplier_list=" + supplier_list + "]";
	}
	

}