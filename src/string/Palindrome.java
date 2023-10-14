package string;

import java.util.Arrays;

import javax.naming.NameClassPair;

public class Palindrome {
	
	//PALINDROME CHECK
	//1. First reverse the String 
	//2. After reverse the string need to check  original string and reversed string same or not
	
	public static void main(String[] args) {
		
	String name = "arun";
	
	//1. Reverse the string we are able achive lot's of way.
	
	//(i) convert the Array and using loop to reverse
	
	char [] arr = name.toCharArray();
	
	String arrReverseName="";
	for(int i = arr.length-1; i>=0; i--) {
		arrReverseName = arrReverseName + arr[i];
	}
	
	System.out.println(arrReverseName);
	
	if (name.equals(arrReverseName)) {
		System.out.println("This Palindrome......."); 
	} else {
		System.out.println("This not a palindrome.....");
	}
	
	//2. Using CharAT method in string
	
	String charAtRevName ="";
	for(int i=name.length()-1; i>=0; i--) {
		
		charAtRevName = charAtRevName + name.charAt(i);
	}
	
	System.out.println(charAtRevName);
	
	if(name.equals(charAtRevName)) {
		System.out.println("This Palindrome...........");
	} else { 
		System.out.println("This not a Palindorme.....");
	}
	
	//3. Stringbuilder  reverse
	
	StringBuilder sb = new StringBuilder();
	StringBuilder sbName = sb.reverse();
	
	if(name.equals(sbName)) {
		System.out.println("This is palindrome....");
	} else {
		System.out.println("This is not a palindrome.....");
	}
	
	}
}
