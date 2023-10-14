package array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindStartsWithOne {
	
	public static void main(String[] args) {
		
		int [] num  = {1,2,11,15,22,56,90};
		
		
		//Find the starts with 1 USING JAVA 8
		
		List<String> staWithOne =   Arrays.stream(num)  // Array to converting the  stream  object
				.boxed()								//int to converting the Integer object
				.map(s -> s+"")						    //process inside the map convert integer to string obj
				.filter(s -> s.startsWith("1"))			//filter which one is start with "1"
				.collect(Collectors.toList());          //collect using collectors.tolist
		
		System.out.println(staWithOne);
		
		
	}

}
