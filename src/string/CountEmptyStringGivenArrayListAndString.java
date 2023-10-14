package string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountEmptyStringGivenArrayListAndString {
	
	public static void main(String[] args) {
		
		//////////////////////////////Given String value///////////////////////////////
		
		String word = "Hi Arunkumar welcome to interview preparation";
		
		//Total count without spaces
		long strCount = word.chars().filter(s -> s == ' ').count(); //Remove the space and return the count of values
		System.out.println(strCount); //Retun total count of word without spaces

		
		//Total count with words
		long withSpaceCount = word.chars().count();
		
		System.out.println(withSpaceCount); //Retun total count of word
		
		//Return total length or count of the word
		System.out.println(word.length());
		
		
		long strAvaluesOnly = word.chars().filter(s -> s == 'A').count();
		
		System.out.println(strAvaluesOnly);
		
		//Convert the lower case and check the values
		String lowerCaseWord = word.toLowerCase();
		
		long strAvalueslowercaseConverCount = lowerCaseWord.chars().filter(s -> s == 'a').count();
		
		System.out.println(strAvalueslowercaseConverCount);
		
		//PRINT THE INDEX VALUES
		System.out.println(lowerCaseWord);
		char searchChar = 'a';
		IntStream.range(0, lowerCaseWord.length()).filter(i -> lowerCaseWord.charAt(i) == searchChar)
				 .forEach(index -> System.out.println("Index Value for "+searchChar + ":::" +index));
		
		

		/////////////////////////// Given List of  String Values //////////////////////////////////////////
		
		String array[] = {"arun","","ram"};
		
		List<String> list = Arrays.asList(array);
		
		//Print the count of Empty String Using Java 8
	    long count =	list.stream().filter(s -> s.isEmpty()).count();

	    System.out.println(count);
	    
	    //Print values in the String
	    
	    List<String> newList =  list.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
	   
	    System.out.println(newList);
	    
	}

}
