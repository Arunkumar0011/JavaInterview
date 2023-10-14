package defaultmethodinterface;

public class DefaultMethodClass implements DefaultMethodInterf, DefaultMethodInterf1{
	
	public static void main(String[] args) {
	DefaultMethodClass obj = new DefaultMethodClass();
	obj.m1();
	}

	@Override
	public void m2() {
		System.out.println("M2");
	}

	@Override
	public void m1() {
		DefaultMethodInterf.super.m1();
		// IF same method name in two interf we need override using interface name other compile time 
		//error we will get
	}

}
