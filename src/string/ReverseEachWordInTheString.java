package string;

public class ReverseEachWordInTheString {
	
	public static void main(String[] args) {
		
		//REVERSE THE EACH WORD THE GIVEN STRING
		//1. First will split the each words in string using .SPLIT method
		//2. Using FOREACH iterate the each words and reverse in the loop
		//3. And append the value in the empty string and once completed the loop then append the other output string
		
		String str ="Arun Kumar AK";
		
		String output = "";
		String[] words = str.split(" ");
		
		for(String word : words) {
			String reverseword ="";
			for(int i = word.length()-1; i>=0; i--) {
				reverseword = reverseword + word.charAt(i);
			}
			output = output + reverseword + " ";
		}
		System.out.println(output);
	}

}
