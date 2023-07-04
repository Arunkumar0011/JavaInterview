package com.arun.array;

import java.util.Arrays;

public class CopyOfOneArrayToAnotherArray {
	
	public static void main(String[] args) {
		
		int [] array= {1,2,3,4};
		
		//USING COPY OF METHOD
		int [] newArray = Arrays.copyOf(array, array.length);
		
		System.out.println(Arrays.toString(newArray));
	
		//WITHOUT COPY  OF METHOD
		
		int [] array1 = {1,2,3,4};
		
		int [] array2 = new int [array1.length];
		
		for (int i = 0; i < array.length; i++) {
			array2 [i]= array1[i];
		}		
		System.out.println(Arrays.toString(array2));
	}

}
