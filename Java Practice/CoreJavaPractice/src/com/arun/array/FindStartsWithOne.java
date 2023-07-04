package com.arun.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindStartsWithOne {
	
	public static void main(String[] args) {
		
		int [] num  = {1,2,11,15,22,56,90};
		
		
		//Find the starts with 1 USING JAVA 8
		
		List<String> staWithOne =   Arrays.stream(num).boxed()
				.map(s -> s+"")
				.filter(s -> s.startsWith("1"))
				.collect(Collectors.toList());
		
		System.out.println(staWithOne);
		
		
	}

}
