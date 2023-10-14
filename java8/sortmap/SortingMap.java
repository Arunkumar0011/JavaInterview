package sortmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import sortinglist.Employee;

import java.util.TreeMap;

public class SortingMap {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(4, "Java");
		map.put(2, "Spring");
		map.put(3, "Spring Boot");
		map.put(1, "ZHibernate");
		
		List<Entry<Integer, String>> entry = new ArrayList<Map.Entry<Integer,String>>(map.entrySet());
		
		//USING COLLECTION
		Collections.sort(entry, (a,b) -> a.getKey()>b.getKey()?1:a.getKey()<b.getKey()?-1:0);
		System.out.println(entry);
		for (Entry<Integer, String> entry2 : entry) {
			
			System.out.println(entry2.getKey() +"::::::"+entry2.getValue());
			
		}
		
		//USING STREAM
		//Comaparing by  key
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out :: println);
		
		//Comparing by value
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out :: println);
		
		
		//MAP USING CUSTOM VALUE
		
	    Map<Employee, Integer> employee = new TreeMap<>();
		
		employee.put(new Employee(1, "Arun", "Dev", 100000), 10);
		employee.put(new Employee(2, "Chandru", "Test", 90000), 30);
		employee.put(new Employee(4, "Babu", "Design", 60000), 20);
		employee.put(new Employee(3, "David", "Devops", 80000), 40);
		
		
		
	}

}
