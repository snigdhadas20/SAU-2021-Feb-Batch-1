package com.assignment.hibernateAfternoon;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Supplier {
	@Id
	private int supplier_id;
	
	@ManyToMany
	List<Categories> category_list=new ArrayList();
	
	@ManyToMany
	List<Product> product_list=new ArrayList();
	
	public List<Categories> getCategory_list() {
		return category_list;
	}
	public void setCategory_list(List<Categories> category_list) {
		this.category_list = category_list;
	}
	public List<Product> getProduct_list() {
		return product_list;
	}
	public void setProduct_list(List<Product> product_list) {
		this.product_list = product_list;
	}
	private String supplier_name;
	public int getSupplier_id() {
		return supplier_id;
	}
	public void setSupplier_id(int supplier_id) {
		this.supplier_id = supplier_id;
	}
	public String getSupplier_name() {
		return supplier_name;
	}
	public void setSupplier_name(String supplier_name) {
		this.supplier_name = supplier_name;
	}
	@Override
	public String toString() {
		return "Supplier [supplier_id=" + supplier_id + ", category_list=" + category_list + ", product_list=" + product_list + ", supplier_name=" + supplier_name + "]";
	}
	

}