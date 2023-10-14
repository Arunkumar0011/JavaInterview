package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableAndComparator {
	
	public static void main(String[] args) {
		
	List<String> name = new ArrayList<String>();
	name.add("Java");
    name.add("Spring");
    name.add("Hibernate");
    
    
    //ASC ORDER USING COLLECTION
    Collections.sort(name);
    System.out.println(name);
    
    //DES ORDER USING COLLECTION
    Collections.sort(name, Collections.reverseOrder());
    System.out.println(name);
    
    
    //USER DEFINED COLLECTION THEY ARE TWO IS THERE 1. COMPARABLE 2. COMPARATOR
    
    //1. COMPARABLE (i) It will affect the original class (ii) Single sorting sequence 
    //              (iii) Provides compare to method (iv) Collection.sort(obj)
    //Note: Refer ComparableStudent class
    
    ComparableStudent cs1 = new ComparableStudent(10, "Arun");
    ComparableStudent cs2 = new ComparableStudent(3, "Arun");
    ComparableStudent cs3 = new ComparableStudent(6, "Arun");
    
    ArrayList<ComparableStudent> comparableList  = new ArrayList<ComparableStudent>();
    comparableList.add(cs1);
    comparableList.add(cs2);
    comparableList.add(cs3);
    
    System.out.println(comparableList);
    
    Collections.sort(comparableList);
    
    System.out.println(comparableList);
    
    
    //2. COMPARATOR
    // (i) Multiple sorting sequence (ii) It will not affect the original class (iii) Provides compare() method
    
    ComparatorStudent comstu1 = new ComparatorStudent(1, "Arun");
    ComparatorStudent comstu2 = new ComparatorStudent(5, "Kumar");
    ComparatorStudent comstu3 = new ComparatorStudent(3, "GAK");
    
    ArrayList<ComparatorStudent> comparatorList = new ArrayList<ComparatorStudent>();
    comparatorList.add(comstu1);
    comparatorList.add(comstu2);
    comparatorList.add(comstu3);
    
    System.out.println(comparatorList);
    
    Collections.sort(comparatorList, new IdComparator());
    
    System.out.println("ID Comparator ::: "+ comparatorList);
    
    Collections.sort(comparatorList, new NameComparator());
    
    System.out.println("Name Comparator ::: "+ comparatorList);
    
	

	}
}
