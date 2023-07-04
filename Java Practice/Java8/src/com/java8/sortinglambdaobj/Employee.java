package com.java8.sortinglambdaobj;

public class Employee {

	int id;
	
	String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return id + " : "+ name;
	}
	
	
}