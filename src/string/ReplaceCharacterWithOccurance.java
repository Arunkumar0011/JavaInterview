package string;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReplaceCharacterWithOccurance {

	public static void main(String[] args) {
		
		String str = "arunkumar";
		
		char character = 'u';
		
		if (str.indexOf(character) == -1) {
			System.out.println("Given character not avilable in the string");
			System.exit(0);
		}
		
		int count = 1;
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == character) {
				str = str.replaceFirst(String.valueOf(ch), String.valueOf(count));
				count++;
			}
		}

		System.out.println(str);
	
	
	//JAVA 8
		
		  String inputString = "hello world";

	        // Create a map of character occurrences
	        Map<Character, Long> charCounts = inputString.chars()
	                .mapToObj(c -> (char) c)
	                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

	        // Replace characters with their occurrences
	        String result = inputString.chars()
	                .mapToObj(c -> (char) c)
	                .map(c -> charCounts.get(c) > 0 ? c.toString() + charCounts.get(c) : c.toString())
	                .collect(Collectors.joining());

	        System.out.println(result);
	
	
	
	}
}
