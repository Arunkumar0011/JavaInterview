package whilepractice;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author ARUN
 *
 */
public class WhileLoop {

	public static void main(String[] args) {

		int total=0; 
		int count=1;
		
		//Getting Input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Mark");
		
		//Loop start 
		while(count<=5){
			int mark = sc.nextInt();
			total = total + mark;
			count++;
		}
    System.out.println("Your Total Mark :::"+total);		
		
	}

}
