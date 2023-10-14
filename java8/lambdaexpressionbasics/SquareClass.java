package lambdaexpressionbasics;

public class SquareClass {
	
	public static void main(String[] args) {
		
		SquareInterf squ = x -> x*x;
		
		int a = squ.square(100);
		System.out.println("Your Square Numbmer "+ a);
	}

}
