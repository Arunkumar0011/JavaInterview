package com.arun.array;

public class CommonElementsFromTwoArrays {
	
	public static void main(String[] args) {
		
		int a [] = {1,2,3,4,5,6,10,11};
		int b [] = {6,7,8,9,10,11};
		
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < b.length; j++) {
				if(a[i] == b[j]) {
					System.out.println("This value contains in the both element :::  " + a[i]);
				}
				
			}
		}
		
	}

}
