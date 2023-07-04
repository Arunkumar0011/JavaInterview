package com.java8.bifunction;

import java.util.function.BiPredicate;

public class BiPredicatePra {

    
public static void main(String[] args) {
	
	//Normal Predicate only receive the one value as a argument 
	//But BIPREDICATe receive the two arguments as a input
	//BIPREDICATE and PREDICATE always return boolean value
	
	BiPredicate<Integer, Integer> biPre = (a,b) -> (a+b)%2 == 0;
	System.out.println(biPre.test(10, 10));
	System.out.println(biPre.test(100, 99));
}
}
