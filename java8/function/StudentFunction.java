package function;

public class StudentFunction {
	
	String name;
	
	int marks;

	public StudentFunction(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "StudentFunction [name=" + name + ", marks=" + marks + "]";
	}
	
	

}
