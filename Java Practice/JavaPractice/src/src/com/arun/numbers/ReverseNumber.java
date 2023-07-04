package src.com.arun.numbers;

public class ReverseNumber {
	
	public static void main(String[] args) {
		int a = 127122498;
		int no = a;
		int rev=0;
		while (a>0) {
		 int module = a%10;
		  rev = (rev*10) + module;
		  a=a/10;
		}
		System.out.println(rev);
		
	}

}
