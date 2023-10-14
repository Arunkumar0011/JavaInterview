package defaultmethodinterface;

public interface DefaultMethodInterf {

	//PUBLIC STATIC FINAL - EVERY VARIABLE IS THAT ONE ONLY IF WE GIVE THE OTHER MODIFIERS GET EXCEPTION
	static final int a =1;  
	
	void m2();  //PUBLIC ABSTRACT
	
	default void m1() {
		System.out.println("DefaultMethodInterf");
	}
	
}
