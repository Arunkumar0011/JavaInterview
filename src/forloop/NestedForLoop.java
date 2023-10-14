
package forloop;

import java.util.Iterator;

public class NestedForLoop {


	public static void main(String[] args) {

		//OUTPUT -> 1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 
		
		//Approach
		
		for (int j=1; j <=5; j++) {         //3. Then need to check the how many times need to print the same values (Nested Loop)  ROW
			
			for (int i = 1; i <=5; i++) {   //1. First we need check counting number up to EX: 1 2 3 4 5   COLUMN
				System.out.print(i +" ");   //2. Need to print the value
				
			}
			//System.out.println();   --> If you need the space we will declare this one
		}		
		
	}

}
