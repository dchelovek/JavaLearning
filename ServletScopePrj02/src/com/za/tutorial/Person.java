package com.za.tutorial;

import java.io.Serializable;

public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String getName() {
		return name + "<br/>";
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name = null;
}
