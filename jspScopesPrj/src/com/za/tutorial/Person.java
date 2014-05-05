package com.za.tutorial;

import java.io.Serializable;

public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -96900085652130735L;

	String name;

	public String getName() {
		return name + "<br/>";
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Person(String iName){
		name = iName;
	}
}
