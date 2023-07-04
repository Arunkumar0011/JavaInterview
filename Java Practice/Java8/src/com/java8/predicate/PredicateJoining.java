package com.java8.predicate;

import java.util.function.Predicate;

public class PredicateJoining {

	public static void main(String[] args) {
		int [] x= {1, 2,3,4,5,6,7,8,10,11};
		
		Predicate<Integer> p1 = i -> i>10;
		Predicate<Integer> p2 = i -> i%2 == 0;
		System.out.println("Greater Than 10 - Numbers Printing");
		m1(p1,x);
		System.out.println("Even Number Printing");
		m1(p2,x);
		System.out.println("Greater Than not 10 - Numbers Printing");
		m1(p1.negate(),x);
		System.out.println("Not Even Number Printing");
		m1(p2.negate(),x);
		System.out.println("Even Number Printing & Greater Than 10");
		m1(p1.and(p2),x);
		System.out.println("Even Number Printing || Greater Than 10");
		m1(p1.or(p2),x);
		
		
	}
	
	public  static void m1(Predicate<Integer> p, int [] x) {
		System.out.println("***********************");
		for(int x1 : x) {
			if(p.test(x1)) {
				System.out.println(x1);
			}
		}
		System.out.println("***********************");
	}
	
}
