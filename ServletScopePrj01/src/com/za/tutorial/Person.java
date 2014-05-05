package com.za.tutorial;

import java.io.Serializable;

public class Person implements Serializable {

	
	private static final long serialVersionUID = -96900085652130735L;
	private String name = null;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
