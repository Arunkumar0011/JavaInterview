package lambdaexpressionbasics;

public class RunnableInterfThread {
	
	public static void main (String[] args) {
		
		Runnable run =() -> {
			for(int i=0; i<=1000; i++) {
				System.out.println("I am a Child Thread");
			}
		};
		 
		Thread thread = new Thread(run);
		thread.start();
		for(int i=0; i<=1000; i++) {
			System.out.println("I am a Main Thread");
		}
	}
}