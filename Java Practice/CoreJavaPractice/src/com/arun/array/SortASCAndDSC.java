package com.arun.array;

import java.util.Arrays;
import java.util.Collections;

public class SortASCAndDSC {
	
	
	public static void main(String[] args) {
		
	Integer [] array = {8,3,6,1,7,2};
	
	Arrays.sort(array);
	
	System.out.println("ASC Order :::  " + Arrays.toString(array));
	

	Arrays.sort(array, Collections.reverseOrder());
	
	System.out.println("DSC Order :::  "+ Arrays.toString(array));
	
	
	}
}
