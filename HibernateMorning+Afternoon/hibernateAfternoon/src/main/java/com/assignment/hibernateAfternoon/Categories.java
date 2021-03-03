package com.assignment.hibernateAfternoon;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Categories {
	@Id
	private int category__id;
	private String category__name;
	
	@ManyToOne
	Product product_Object;
	
	@ManyToMany(mappedBy="category_list")
	List<Supplier> supplier_list=new ArrayList();
	
	public Product getproduct_Object() {
		return product_Object;
	}
	public void setproduct_Object(Product product_Object) {
		this.product_Object = product_Object;
	}
	public List<Supplier> getSupplier_list() {
		return supplier_list;
	}
	public void setSupplier_list(List<Supplier> supplierlist) {
		this.supplier_list = supplier_list;
	}
	
	
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	@Override
	public String toString() {
		return "Categories [category_id=" + category_id + ", category_name=" + category_name + ", product_Object=" + product_Object + ", supplier_list=" + supplier_list + "]";
	}

}