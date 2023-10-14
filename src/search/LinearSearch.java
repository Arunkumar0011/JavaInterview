package search;

import java.util.Iterator;
import java.util.Scanner;

public class LinearSearch {
	
	public static void main(String[] args) {
		
		int [] intList = {1,2,3,4,5,6,7,8,10};
		boolean flag = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the you search value");
		int a = sc.nextInt();
		for(int i = 0; i<intList.length; i++) {
			if(intList[i] == a) {
				System.out.println("Your Entered Value is there  "+a);
				flag=false;
				break;
			}			
		}
		
		if(flag) {
			System.out.println("Your entered value is not there in the list");
		}
		
	}

}
