package com.java8.sortinglambdaobj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeClassSortingUsingLambda {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(10, "Arun"));
		al.add(new Employee(5, "Kumar"));
		al.add(new Employee(7, "AK"));
		
		System.out.println(al);
		
		Collections.sort(al, (id1, id2)-> id1.id>id2.id?+1:id1.id<id2.id?-1:0);
		
		System.out.println(al);
		
	}
}
