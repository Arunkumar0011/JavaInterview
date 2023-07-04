package com.arun.array;

import java.util.Arrays;

public class PrintTheArray {

	public static void main(String[] args) {
		
		int num[] = {1,2,3,4,5};
		
		System.out.println(num); //[I@41a4555e
		System.out.println(Arrays.toString(num));  //[1, 2, 3, 4, 5]

		int [] [] Array2D =  {{1,2,3,4} , {1,2,3,4}};
		
		System.out.println(Array2D);  //[[I@3830f1c0
		System.out.println(Arrays.toString(Array2D));  //[[I@39ed3c8d, [I@71dac704]
		System.out.println(Arrays.deepToString(Array2D));  //[[1, 2, 3, 4], [1, 2, 3, 4]]
		
	}
}
