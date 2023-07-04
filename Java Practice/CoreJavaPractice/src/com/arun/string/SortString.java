package com.arun.string;

import java.util.Arrays;

public class SortString {
	
	public static void main(String[] args) {
		
		String str = "arun";
		
		//1.WRITE OUR OWN SORTING ALGORITHIM - NESTED LOOP
		char[] ch = str.toCharArray();
		char temp;
		for (int i = 0; i < ch.length; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i] > ch[j]) {
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		System.out.println(ch);
		
	   //2. USING  PREDEFINED SORT METHOD IN ARRAY
		
		char[] ch2 = str.toCharArray();
		Arrays.sort(ch2);
		System.out.println(ch2);
		
	}
	

}
