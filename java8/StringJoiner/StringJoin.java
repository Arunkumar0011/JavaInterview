package StringJoiner;

public class StringJoin {
	
	public static void main(String[] args) {
		
		String [] str = {"1","2","3","4"};
		
		String strNew = String.join("=", str);
	
		System.out.println(strNew);
		
	}

}
