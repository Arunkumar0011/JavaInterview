package bifunction;

import java.util.function.BiFunction;

public class BiFunctionPra {

	public static void main(String[] args) {
		
		//FUNCTION always receive the only one input and return the object of values
		//But BIFUNCTION receive the Two inputs and return the object of values
		
		BiFunction<Integer, Integer, Integer> biFun = (a,b) -> (a*b);
		
		System.out.println(biFun.apply(100, 200));
	}
}
