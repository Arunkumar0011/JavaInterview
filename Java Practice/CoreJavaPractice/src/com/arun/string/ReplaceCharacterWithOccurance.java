package com.arun.string;

public class ReplaceCharacterWithOccurance {

	public static void main(String[] args) {
		
		String str = "arunkumar";
		
		char character = 'u';
		
		if (str.indexOf(character) == -1) {
			System.out.println("Given character not avilable in the string");
			System.exit(0);
		}
		
		int count = 1;
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == character) {
				str = str.replaceFirst(String.valueOf(ch), String.valueOf(count));
				count++;
			}
		}

		System.out.println(str);
	}
}
