package com.java8.lambdaexpressionbasics;

public class AddClass {
	
	
	public static void main(String[] args) {
		
		AddInterf add = (a,b) -> System.out.println("The Sum  "+ (a+b));
		add.add(10, 20);
	}

}
