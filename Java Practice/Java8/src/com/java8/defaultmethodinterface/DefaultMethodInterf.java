package com.java8.defaultmethodinterface;

public interface DefaultMethodInterf {

	static final int a =1;  //PUBLIC STATIC FINAL - EVERY VARIABLE IS THAT ONE ONLY IF WE GIVE THE OTHER MODIFIERS GET EXCEPTION
	
	void m2();  //PUBLIC ABSTRACT
	
	default void m1() {
		System.out.println("DefaultMethodInterf");
	}
	
}
