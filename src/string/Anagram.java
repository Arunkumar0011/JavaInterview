package string;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		
		String name = "arun";
		
		String name2 = "nuraahkjh";
		
		char[] chName = name.toCharArray();
		char[] chName2 = name2.toCharArray();
		
		Arrays.sort(chName);
		Arrays.sort(chName2);
		
		boolean flag = Arrays.equals(chName, chName2);
		
		if(flag) {
			System.out.println("This Both String Anagram");
		} else {
			System.out.println("This Both String are not Anagram");
		}
			
		
	}

}
