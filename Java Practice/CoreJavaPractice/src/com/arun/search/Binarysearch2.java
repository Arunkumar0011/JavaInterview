package com.arun.search;

public class Binarysearch2 {
	
	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,6,7,8,9};
		
		int length = array.length -1;
		
		int no = 5;
		
		int min =0;
		int max = length;
		
		boolean x = false;
		
		while (min >= max) {

			int avg = (min+max)/2;
			if(array[avg] == no) {
				
				System.out.println("Your number is there "+ no);
				x = true;
				break;
			}
			else if (array[avg]>no) {
				max =  max-1;   // Wrong Logic
			}
			else if (array[avg]<no) {
				max = max+1;  ///wrong logic
				
			}
		}
		
		if(!x) {
			System.out.println("Your Searched Number  is Not there");
		}
		
	}
	

}
