package sorting;

import java.util.Arrays;

public class BubbleSorting2 {
	
	public static void main(String[] args) {
		
		int [] a = {6,3,9,2,1,5};
		
		System.out.println("Before Sorting" + Arrays.toString(a));
		
		int length = a.length - 1;
		
		while(0<length) {
			
			for (int i = 0; i < length; i++) {
				if(a[i]>a[i+1]) {
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}
			}
			length--;
		}
		
		System.out.println("After Sorting"+ Arrays.toString(a));
	}
}
