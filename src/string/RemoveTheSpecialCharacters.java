package string;

public class RemoveTheSpecialCharacters{
	
	public static void main(String[] args) {
		
		//REMOVE THE SPECIAL CHARATER FROM THE GIVEN STRING
		String name = "!A@R#U%N&*(";
		
		//REPLACE  ALL STRING
		String newName = name.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(newName);
	}

}
