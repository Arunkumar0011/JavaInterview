package com.arun.array;

import java.util.Stack;

public class ReverseTheGivenArray {

	
	public static void main(String[] args) {
		

		//REVERSE ARRAY USING STACK LOGIC
		
		
		int [] array = {5,4,3,2,1};
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0; i <array.length; i++) {
			stack.push(array[i]);
		}
		
		for(int j=0; j < array.length; j++) {
			
			array[j] = stack.pop();
			
			System.out.println(array[j]);
		}
		
		//REVERSE THE ARRAY USING FOR LOOP
		
		int[] array1 = {1,2,3,4,5};
		
		for(int k=array1.length-1; k>=0; k--) {
			System.out.println(array1[k]);
		}
	}
}
