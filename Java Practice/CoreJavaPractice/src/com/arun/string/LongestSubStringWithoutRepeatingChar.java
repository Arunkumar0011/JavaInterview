package com.arun.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeatingChar {
	
	public static void main(String[] args) {
		
		
		///////////////////WRONG ANSWERE NEED TO CHECK////////////////////////////////////
		String name  = "java";
		
		String longestSubString= null;
		int longestSubStringLenght = 0;
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		char [] ch = name.toCharArray();
		for(int i=0; i<ch.length; i++) {
			char cha = ch[i];
			if(! map.containsKey(cha)) {
			map.put(cha, i);
			} else {
				i = map.get(ch);
				map.clear();
			}

			if(map.size() > longestSubStringLenght) {
				longestSubStringLenght = map.size();
				longestSubString = map.keySet().toString();
				
			}
			
		}
		System.out.println(longestSubString);
	}
}
