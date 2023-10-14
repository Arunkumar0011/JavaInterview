package numbers;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ContinueNumberPrint {
	
	public static void main (String[] args) {
	int start=1;
	int end =100;
	
	
	while (start <= end) {
		System.out.print(" " + start + " ");
		start++;
	}	 
     
	//JAVA 8
	
	IntStream.range(0, 100).forEach(System.out::println);
	
	
	//WITHOUT LOOP
    printContinousNumer(start, end);
	
	}
	
	private static void printContinousNumer(int start, int end) {
		if(start<=end) {
			System.out.println(start);
			printContinousNumer(start+1,end);
		}
	}
}
