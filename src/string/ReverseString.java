package string;

public class ReverseString {
	
	public static void main(String [] args) {
		
		//REVERSE THE GIVEN STRING
		String name = "Arun";
		
		//1. TOCHARARRAY - It is a String Method
		char [] ch = name.toCharArray();
		
		for(int i = name.length()-1; i>=0; i--) {
			System.out.print(ch[i]);
		}
		System.out.println("");
		
		//2. CHARAAT - It is a String Method
		
		for(int j=name.length()-1; j>=0; j--) {
			System.out.print(name.charAt(j));
		}
		System.out.println("");
		
		//3. STRINGBUFFER
		
		StringBuffer sb = new StringBuffer(name);
		System.out.println(sb.reverse());
		
		//4. STRINGBUILDER
		StringBuilder sbu = new StringBuilder(name);
		System.out.println(sbu.reverse());
	}

}
