package com.arun.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class WhetherArrayContainsDuplicateOrNot {
	
	public static void main(String[] args) {
		
		String [] name = {"Arun", "Kumar"};
		
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(name));
		HashSet<String> hs = new HashSet<String>(al);
		
		if(al.size() != hs.size()) {
			System.out.println("This Array contains duplicate elements");
		}
		else {
			
			System.out.println("No Duplicate Elements");
		}
	}

}
