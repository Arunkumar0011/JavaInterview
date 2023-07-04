package com.java8.staticmethodinterface;

public class StaticMethodClass implements StaticMethodInterf{
	
	
	public static void main (String args[]) {
	
		//If we calling create the obj for this class and try to call static mehtod we are getting compile time error
		StaticMethodClass obj = new StaticMethodClass();
          
		//obj.test();   -> Combile time error
		//StaticMethodClass.test();  -> Combile time error
		
		//We are able to call only using interface name
		StaticMethodInterf.test();
	}
}
