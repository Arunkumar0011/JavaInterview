package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatCharacter {
	
	public static void main(String[] args) {
		
		String str = "arunkumar";
		
		
		//1. NESTED LOOP - WITHOUT COLLECTION
		
		for (int i = 0; i < str.length(); i++) {
			boolean flag = true;
			for (int j = 0; j < str.length(); j++) {

				if(i!=j && str.charAt(i) == str.charAt(j)) {
					flag = false;
				}
			}
			
			if(flag) {
				System.out.println("This the first non repeation chanracter in the string "+ str.charAt(i));
			    break;
			}
			
		}
		
		//2. WITH COLLECTION
		
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>(); //Maintain the order
		
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			} else {
			map.put(ch, 1);
			}			
	}
		System.out.println(map);	
		
		for(Entry<Character, Integer> entryset : map.entrySet()) {
			
			if(entryset.getValue() == 1) {
				System.out.println("First Non Repeating Character ::: "+ entryset.getKey());
				break;
			}
		}

	
		
		//USING JAVA 8
		
		//USING JAVA 8 FIND REPEATED CHARACTERS
		
		 List<String> repeatedElements =   Arrays.stream(str.split(""))
								.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
								.entrySet().stream()
								.filter(x -> x.getValue() > 1)
								//.map(Map.Entry::getKey)
								.map(keyValue -> keyValue.getKey())
								.collect(Collectors.toList());
		 
		 System.out.println(repeatedElements);
		 
		 
		 //USING JAVA 8 FIND NON REPEATED CHARACTERS
		 
		List<String> nonRepeatChar = Arrays.stream(str.split(""))
								.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
								.entrySet().stream()
								.filter(x -> x.getValue() == 1)
								//.map(Map.Entry::getKey)
								.map(keyValue -> keyValue.getKey())
								.collect(Collectors.toList());
		
		System.out.println(nonRepeatChar);
			
		//FIND THE FIRST NON REPEATED CHARACTER USING JAVA 8 STREAM
		
		String firstNonRepChar  = Arrays.stream(str.split(""))
		  				 .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap :: new, Collectors.counting()))
		  				 .entrySet().stream()
						 .filter(x -> x.getValue() == 1)
						 .findFirst().get().getKey(); 
						//In case non repeating charaters we are getting "No value present" exception is there
						//So we  are writing the optional string 
		System.out.println(firstNonRepChar);
		

		//For Above mentioned Excetpion handling will split up the lines in two  parts of Stream
		
		String str1 = "arunnkkuammr";
		
		Map<String, Long> firstNonRepCharExc = Arrays.stream(str1.split(""))
				  						  .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		Optional<String> optStr = firstNonRepCharExc.entrySet().stream()
													.filter(x -> x.getValue() ==1)
													.map(e -> e.getKey()).findFirst();
		
		System.out.println(optStr.orElse("No Non Repeating for the given String"));
	
	}
}
