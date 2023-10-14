package doublecolonoperator;

public class ConstructorReference {
	
	ConstructorReference(){
		System.out.println("This Constructor Reference");
	}
	public static void main(String[] args) {
		
		MethodReferenceInterf mi = ConstructorReference :: new;
		
		mi.m1();
	}
	

}
