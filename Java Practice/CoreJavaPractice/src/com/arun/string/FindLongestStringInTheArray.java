package com.arun.string;

import java.util.Arrays;

public class FindLongestStringInTheArray {
	
	public static void main(String[] args) {
		
		String [] names = {"arun","kumar","ram"};
		
		//USING FOR LOOP
		
		int index = 0;
		int name = names[0].length();
		
		for(int i=1; i<names.length; i++) {
			
			if(names[i].length() > name) {
				
				index =i;
				name=names[i].length();
				
			}
		}
		
		System.out.println(names[index]);
	
	//USING JAVA 8 
	
		String longestName =   Arrays.stream(names)
				.reduce((name1, name2) -> name1.length() > name2.length() ? name1 : name2)
				.get();
		
		System.out.println(longestName);
	
	}

}
