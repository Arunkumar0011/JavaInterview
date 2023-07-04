/**
 * 
 */
package com.arun.string;

/**
 * @author ARUN
 *
 */
public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String a = new String ("Arun"); //Creating using new keyword
		String b = "Arun"; //String Literal
		if (a == b) {
			System.out.println("==");
		}
		else if (a.equals(b)) {
			System.out.println(".Equals");
		}
	}

}