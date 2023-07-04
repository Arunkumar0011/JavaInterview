package com.arun.string;

import java.util.HashSet;
import java.util.Set;

public class RemoveTheDuplicateCharacters {
	
	public static void main(String[] args) {
		
		String str = "arunkumar";
		
		//1. JAVA 8 STREAM 
		StringBuilder sb1 = new StringBuilder();
		str.chars().distinct().forEach(c -> sb1.append((char)c));
		System.out.println(sb1);
		
		//2. INDEXOF METHOD
		StringBuilder sb2 = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			
			char a = str.charAt(i);
			int idx = str.indexOf(a, i+1);
			if(idx == -1) {
				sb2.append(a);
			}
		}
		System.out.println(sb2);
		
		//3. NESTED FOR LOOP
		StringBuilder sb3 = new StringBuilder();
		
		char [] ch  = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			boolean flag = false;
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i] == ch[j]) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				sb3.append(ch[i]);
			}
		}
		System.out.println(sb3);
		
		
		//4. SET - HASHSET (IT WILL NOT THE DUPLICATES)
		StringBuffer sb4 = new StringBuffer();
		
		Set<Character> set = new HashSet<Character>();
		
		for (int i = 0; i < ch.length; i++) {
			set.add(str.charAt(i));
		}

		for (Character character : set) {
			sb4.append(character);
		}
		System.out.println(sb4);
	}

}
