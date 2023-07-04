package com.arun.collection;

public class ComparatorStudent {
	
	private int id;
	
	private String name;

	
	
	public ComparatorStudent(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + "]";
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}