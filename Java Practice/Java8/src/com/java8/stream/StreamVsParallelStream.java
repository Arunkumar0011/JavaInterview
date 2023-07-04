package com.java8.stream;

import java.util.Arrays;
import java.util.List;

public class StreamVsParallelStream {
	
	public static void main(String[] args) {
		
		List<String> lisStr = Arrays.asList("a","b","c","d");
		
		System.out.println("Stream");
		//Stream
		lisStr.stream().forEach(System.out :: println);
		
		System.out.println("Parallel Stream");
		//Parallel Stream
		lisStr.parallelStream().forEach(System.out :: println);
		}

}
