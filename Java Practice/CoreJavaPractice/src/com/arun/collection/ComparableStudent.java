package com.arun.collection;

public class ComparableStudent  implements Comparable<ComparableStudent>{
	
	private int id;
	
	private String name;

	
	//COMPARATOR LOGIC
	@Override
	public int compareTo(ComparableStudent o) {
		
		if(id == o.id) {
		return 0;
		} else if (id > o.id) {
			return 1;                //ASC ORDER
		} else {
			return -1;
		}
	}
	
	public ComparableStudent(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "ComparableStudent [id=" + id + ", name=" + name + "]";
	}

	

	
	

}
