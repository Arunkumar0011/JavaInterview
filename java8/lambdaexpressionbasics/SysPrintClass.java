package lambdaexpressionbasics;

public class SysPrintClass {
	
	public static void main(String [] args) {
		
		SysPrintInterf print = () -> System.out.println("First Lambda Expression Printing");
		print.print();
	}

}
