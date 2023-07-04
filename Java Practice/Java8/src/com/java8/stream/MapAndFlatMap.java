package com.java8.stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMap {
	
	public static void main(String[] args) {
		
		List<Integer> addNum = Arrays.asList(2,4,6,8);
		
		List<Integer> evenNum = Arrays.asList(1,3,5,7,9);
		
		List<Integer> otherNum = Arrays.asList(0);
		
		List<List<Integer>> a = Arrays.asList(addNum, evenNum, otherNum);
		
		System.out.println(a);  // [[2, 4, 6, 8], [1, 3, 5, 7, 9], [0]]
		
		
		List<List<Integer>> listInt = a.stream().map(i -> i).collect(Collectors.toList());

		System.out.println(listInt); //[[2, 4, 6, 8], [1, 3, 5, 7, 9], [0]]
		
		//FLATMAP - Flat map returns the list of list
		List<Integer> listIntFlatt = a.stream().flatMap(i -> i.stream()).collect(Collectors.toList());
	
		System.out.println(listIntFlatt);  //[2, 4, 6, 8, 1, 3, 5, 7, 9, 0]
	}

}
