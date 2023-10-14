package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateWordsGivenString {

	public static void main(String[] args) {
		
		String word = "Hi Arunkumar Welcome Arunkumar";
		
		String[] arrWord = word.split(" "); //or ("\\s+")
		System.out.println(Arrays.toString(arrWord));
		
		HashSet<String> duplicate = new HashSet<>();
		HashSet<String> UniqueElemnts = new HashSet<>();
		
		
		for(String newWord : arrWord) {
		if(!UniqueElemnts.contains(newWord)) {
			UniqueElemnts.add(newWord);
		} else {
			duplicate.add(newWord);
		}
		}
		
		System.out.println("Duplicate word ::: "+duplicate);
		
		System.out.println("Non Duplicate Word :::"+ UniqueElemnts);
		
		
		//USING JAVA 8
		Map<String, Long> wordsList = Arrays.stream(arrWord)
										.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(wordsList);
		
		
		wordsList.entrySet().stream().filter(e -> e.getValue()>1)
							.forEach(e -> System.out.println("Word is ::: "+e.getKey() +" Count of this word ::: "+e.getValue()));
		
		
		
		//REMOVE THE SPACE AND DOTS AND COMMAS
	     String inputString = "This is a test. This is only a test. Testing, testing, 1, 2, 3.";

	     // Split the string into words and remove punctuation
	     String[] words1 = inputString.split("\\s+|\\p{Punct}");
	        
	     System.out.println(Arrays.toString(words1));
		 
		 
	}
	
}

