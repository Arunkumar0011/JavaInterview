package array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class DeleteTheElementFromArray {
	
	public static void main(String[] args) {
		
		//We are going to delete the specific element array
		
		/************************************************* JAVA 8 ****************************************************/
		
		//1. Taking the delete index value 
		//2. IntStream -> A sequence of primitive int-valued elements.  range -> it will take before length value => lenght -1.    rangeClosed -> it will add upto length
		// using filter we are filtering the value and set the value in map
		//We need a array so we are chging array using .toarray method 
		int [] a = {1,2,3,4,5,6,7,8,9};
		
		int index = 6;
		//int [] result = IntStream.range(0, a.length).filter(i -> i!=index).map(i -> a[i]).toArray();

		//System.out.println("After Removing the give index value"+ Arrays.toString(result));
		
		
		/************************************************* WITHOUT JAVA 8 ****************************************************/

		//1. Create new array - length is orginal array -1 
		//2. Iterate the Array based on the lenght -          ****** declare the k=0 for assign the value in second array ******
		
		int [] newArray = new int [a.length-1];
		
		for (int j = 0, k=0; j < a.length; j++) {
			
			if(j == index) {
				continue;   //CONTINUE is skip only once and BREAK terminate the entire loop
			}
			newArray [k++] = a[j];  
			
		}
		System.out.println(Arrays.toString(newArray));
	}

}
