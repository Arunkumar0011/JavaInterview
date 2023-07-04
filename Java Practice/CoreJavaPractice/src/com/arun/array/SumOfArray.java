package com.arun.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class SumOfArray {
	
	public static void main(String[] args) {
		
		int [] array = {1,2,3,4,5};
		
		int sum = Arrays.stream(array).sum();
		System.out.println(sum);
		
		int sum2 = IntStream.of(array).sum();
		System.out.println(sum2);
		
		int sum3 = Arrays.stream(array).reduce((x,y) -> x+y).getAsInt();
		System.out.println(sum3);
		
		int sum4 = Arrays.stream(array).reduce(Integer :: sum).getAsInt();
		System.out.println(sum4);
		
		long sum5 = Arrays.stream(array).summaryStatistics().getSum();
		System.out.println(sum5);
	}
}
