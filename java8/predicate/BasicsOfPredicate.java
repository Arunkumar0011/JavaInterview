package predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

public class BasicsOfPredicate {

	public static void main(String[] args) {
		
		//INTEGER CHECK
		Predicate<Integer> pre1 = I1 -> I1>10;
				
		System.out.println(pre1.test(11));
		
		//STRING RELATED CHECK
		Predicate<String> preStr = S -> S.startsWith("A");
		System.out.println(preStr.test("Arun"));
		System.out.println(preStr.test("arun"));
		
		//COLLECTION CHECK
		
	//	Predicate<Collection> preColl = c ->  
	
		Predicate<Collection> preColl = c ->c.isEmpty();
		ArrayList al = new ArrayList<>();
		//al.add("Arun");
		System.out.println("Collection Check ::: " + preColl.test(al));
		
		//START WITH LETTERS
		String[] names = {"Arun", "arun", "Kumar", "Ram"}; 
		Predicate<String> preStrArr = sa -> sa.charAt(0) == 'A';
		for(String Obj : names) {
			if(preStr.test(Obj)) {
				System.out.println(Obj);
			}
		}
		
		//Remove empty string and remove null values
		
		String [] remStr = {"Arun",null,"","Kumar"};
		Predicate<String> remPre = R -> R!=null && R.length() !=0;
		
		ArrayList<String> alr = new ArrayList<>();
		
		for(String newStr : remStr) {
			if(remPre.test(newStr)) {
				alr.add(newStr);
			}
		}
		System.out.println(alr);
	}
	
}
