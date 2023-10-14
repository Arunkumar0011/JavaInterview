package string;

public class RemoveTheWhiteSpace {
	
	public static void main(String[] args) {
		
		String name = "    A            R     U     N";
		
		String newName = name.replaceAll("\\s", "");  //  \\s is a unicode of space
		System.out.println(newName);
		
		//Note: If we go for the  trim method is only remove first and  last white space only 
	}

}
