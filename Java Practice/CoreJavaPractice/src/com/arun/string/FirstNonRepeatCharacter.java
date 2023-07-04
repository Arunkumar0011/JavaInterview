package com.arun.string;

import java.util.HashMap;
import java.util.Map.Entry;

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
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
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
				System.out.println("First Non Repeating Character"+ entryset.getKey());
				break;
			}
		}

	}
}
