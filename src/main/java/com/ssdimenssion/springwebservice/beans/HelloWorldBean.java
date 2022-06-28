package com.ssdimenssion.springwebservice.beans;

public class HelloWorldBean {
	
	private String name;

	public HelloWorldBean(String name){
		
		this.name =name;
		
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [name=" + name + "]";
	}
	

}
