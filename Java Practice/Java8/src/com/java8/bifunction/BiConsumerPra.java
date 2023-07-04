package com.java8.bifunction;

import java.util.function.BiConsumer;

public class BiConsumerPra {
	
	//CONSUMER receive the one input but BICONSUMER receive the two inputs as arguments
	//CONSUMER & BICONUSMER doesn't return anything
	
	public static void main(String[] args) {
		
		BiConsumer<String, String> biCon = (a, b) -> System.out.println(a+b);
		biCon.accept("Arunkumar", " G");
	}
	
	

}
