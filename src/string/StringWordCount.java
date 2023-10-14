package string;

import java.util.Iterator;

public class StringWordCount {
	
	public static void main(String[] args) {
		String name = "@Arunkumar G";
		String words[]= name.split("");
		int count =0;
		int spaceCount = 0;
		int specialCharacterCount = 0;
		for (int i = 0; i < words.length; i++) {
			String string = words[i];
			if(string.equals(" ")) {
				spaceCount++;
				continue;
			}
			String regex = "[^a-zA-Z0-9]";
			if(string.matches(regex)) {
				specialCharacterCount++;	
				continue;
			}
			count++;			
		}
		
		System.out.println("Total words count "+count);
		System.out.println("Space Count "+spaceCount);
		System.out.println("Special Character Count" +specialCharacterCount);
		
	}
	

	
}
