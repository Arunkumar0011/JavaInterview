package function;

import java.util.function.Function;

public class BasicsOfFunctionInterface {
	
	public static void main(String[] args) {
		
		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply("Arunkumar G"));
		
		
		Function<String, String> f1 = s1 -> s1.replaceAll(" ", "#");
		System.out.println(f1.apply("Arun  Kumar G "));
	}

}
