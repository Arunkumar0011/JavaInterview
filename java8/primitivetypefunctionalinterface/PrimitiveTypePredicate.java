package primitivetypefunctionalinterface;

import java.util.function.IntPredicate;

public class PrimitiveTypePredicate {
	
	public static void main(String[] args) {
	
		int [] x = {1,2,3,4,5,6,7,8,9,10};
		
		//This Intpreidcate no need to input type default input type for this one is INTEGER
		//LONGPREDICATE and DOUBLEPREDICATE also is there.
		IntPredicate intPre = a -> a%2 ==0;
		
		for (int y : x) {
			if(intPre.test(y)) {
				System.out.println("Even Numebr : " + y);
			}
		}
	}
	 

}
