package array;

import java.util.Arrays;

public class FindMinAndMaxValueInTheArray {
	public static void main(String[] args) {
		
		//FIND THE MAX AND MIN VALUE IN THE GIVEN ARRAY
		
		//1. set min in maximum value and max in minimum value using Integer class
		//2. Iterate the array and assign the min value in min variable same for the max as well.
		
		
		
		int [] array = {2,100,10,1,4};
		System.out.println(Arrays.toString(array));
		
		//ONE WAY USING MIN AND MAX VALUES
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for (int i : array) {
			if(min > i) {
				min = i;
			}
		}
		
		System.out.println("Minimum Value ::: "+ min);
		
		for (int j : array) {
			if (max < j) {
				max = j;
			}
		}

		System.out.println("Maximum Value ::: " + max);
		
		
		//USING SORTING METHODS
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		System.out.println("Minimum Value ::: "+ array[0]);
		
		System.out.println("Maximum Value  ::: " + array[array.length - 1]);

		
		
	}
	
	

}
