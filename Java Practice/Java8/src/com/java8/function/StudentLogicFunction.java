package com.java8.function;

import java.util.ArrayList;
import java.util.function.Function;

public class StudentLogicFunction {
	
	public static void main(String[] args) {
		
		ArrayList<StudentFunction> al = new ArrayList<StudentFunction>();
		populate(al);
		
		Function<StudentFunction, String> f = sf -> {
			int marks = sf.marks;
			if(marks >=80) {
				return "First class with Distinct";
			}
			else if (marks >= 50) {
				return "Pass";
			}
			else {
				return "Fail";
			}
		};
		
		for(StudentFunction s : al) {
			System.out.println(s.name);
			System.out.println(s.marks);
			System.out.println(f.apply(s));
			System.out.println("*****************************");
		}
	}

	private static void populate(ArrayList<StudentFunction> al) {
		al.add(new StudentFunction("Arun", 100));
		al.add(new StudentFunction("Kumar", 50));
		al.add(new StudentFunction("Ram", 35));
		al.add(new StudentFunction("Panneer", 10));
		
	}

}
