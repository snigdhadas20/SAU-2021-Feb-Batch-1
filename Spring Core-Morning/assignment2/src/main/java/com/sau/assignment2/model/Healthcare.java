package com.sau.assignment2.model;

public class Healthcare {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		throw (new RuntimeException());
	}
}