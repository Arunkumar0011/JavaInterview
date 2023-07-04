package com.java8.doublecolonoperator;

public class MethodReference {
	
	public static void m2() {
		System.out.println("This Method Reference");
	}
	
	public static void main(String[] args) {
	
	MethodReferenceInterf mi = 	MethodReference :: m2;
	mi.m1();
	}
	
}
