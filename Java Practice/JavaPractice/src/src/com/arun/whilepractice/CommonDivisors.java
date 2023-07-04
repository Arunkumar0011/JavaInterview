package src.com.arun.whilepractice;

public class CommonDivisors {
	
	public static  void main (String[] args) {
		
		
		int commonDiv =100;
		int start=2;
		int count=0;
		while(start <= commonDiv) {
			if(start%2==0) {
			System.out.println(start);
			count=count+1;
			}
			start=start+1;
		}
		System.out.print("Count"+count);
		
	}

}
