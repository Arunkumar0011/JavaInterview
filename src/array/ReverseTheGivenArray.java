package array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

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
		
		//JAVA 8 
		List<Integer> sortedList = Arrays.stream(array1)
				.boxed()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		
		System.out.println(sortedList);
		
	}
}
