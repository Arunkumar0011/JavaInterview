package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class CopyOfOneArrayToAnotherArray {
	
	public static void main(String[] args) {
		
		int [] array= {1,2,3,4};
		
		//USING COPY OF METHOD
		int [] newArray = Arrays.copyOf(array, array.length);
		
		System.out.println(Arrays.toString(newArray));
	
		//WITHOUT COPY  OF METHOD
		
		int [] array1 = {1,2,3,4};
		
		int [] array2 = new int [array1.length];
		
		for (int i = 0; i < array1.length; i++) {
			array2 [i]= array1[i];
		}		
		System.out.println(Arrays.toString(array2));
		
		//USING JAVA 8 PRIMITIVE TO WRAPPER CLASS ARRAY
		
	    Integer[] a =  Arrays.stream(array).boxed().toArray(streamArray -> new Integer[streamArray]);
	    
		System.out.println(a);
	}

}
