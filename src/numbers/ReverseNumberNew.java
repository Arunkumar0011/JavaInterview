package numbers;

import java.util.Scanner;

public class ReverseNumberNew {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int orginalInt = a;
		System.out.println(orginalInt);
		int rev=0;
		while (0<orginalInt) {
			int module = orginalInt%10;
			rev = (rev*10) + module;
			orginalInt = orginalInt/10;
		}
		System.out.println(rev);
	}
}
