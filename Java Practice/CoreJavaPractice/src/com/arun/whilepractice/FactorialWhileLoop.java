package com.arun.whilepractice;

public class FactorialWhileLoop{

	public static void main(String[] args) {

		int fact =1;
		int start =1;
		while(start <= 5) {
			fact = fact * start;
			start = start +1;
		}
		System.out.println(fact);
	}
}
