package oops;

public class WaysOfCreatingObject{
	
	
	public WaysOfCreatingObject() {
		System.out.println("I am a Zero argument constructor");
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
	//1. Create object an new keyword
	WaysOfCreatingObject object1 = new WaysOfCreatingObject();
	
	//2. Create an object using reflection 
	WaysOfCreatingObject objevct2 = (WaysOfCreatingObject) Class.forName("com.arun.oops.WaysOfCreatingObject").newInstance();
				
	//3. Create an object using clone
	
	
	//4. Create an object using  class loader
	
	
	//5. Use the constructor class from the java.lang.reflect
	
	
	//6. Create object for serialization
	
	}

}
