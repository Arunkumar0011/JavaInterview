package sorting;

import java.util.Arrays;

public class BubbleSorting {

	public static void main(String[] args) {
		
		int a[] = {9,8,7,6,5,4,3,2,1};
		
		//System.out.println(a.length);
		
		int j = a.length-1; //Length we are getting and -1 then only it will get index values properly
		
		//Sorting will going to happen ex: 9,8 compare and swap and then 8 will come first and 9 will come second
		//Then 9,7 will going to compare 7 will come first and 9 will go second
		//This process will going to happen continously upto  ---> n-1 
		
		while(j>0) {                     // Number of Index value based  it will  run
			for(int i=0; i<j; i++) {     // First time this loop will run 9 to 1 - in the first iteration highest number will go to the last this process will go continously
/* < DES > ASC */	if(a[i]>a[i+1]) {    //first number is greater then next one then it will go inside 
					int temp =a[i];      // If satisfied upper if conidition we will get one temp variable that one
					a[i] = a[i+1];       // will take and set the second value in first value
					a[i+1] = temp;       // Then second value we set the temp value
				}
			}
			j--;                          // Now highest value will go to the last so we are decreasing the count one time
		}
		
		//Printing the value in two ways 
		//1. one is iteration using loop
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		//2. Printing using arrays
		System.out.println(Arrays.toString(a));
		
	} 
	
	
}
