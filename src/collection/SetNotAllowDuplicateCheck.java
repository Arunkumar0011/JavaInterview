package collection;

import java.util.HashSet;
import java.util.Set;

public class SetNotAllowDuplicateCheck {
	
	//Set normally not allow the duplicate it is a wrapper class 
	//In case that one is Object (POJO - own class) Ex: Student (C) -> int id; int name; it will allow the duplicate
	//We need to overide the hashcode and equals method then it will going to work
	
	public static void main(String[] args) {
		
		//I need to overide the hashcode and equals method in my setStudent class if overided it will not allow the duplicate
		//If I didn't overided the hashcode and equals method in my setStudent class i will allow the duplicate
		
		SetStudent ss1 = new SetStudent(1, "Arun");
		SetStudent ss2 = new SetStudent(1, "Arun");
		Set<SetStudent> ss = new HashSet<SetStudent>();
		ss.add(ss1);
		ss.add(ss2);
		System.out.println(ss);

		
		
	}

}
