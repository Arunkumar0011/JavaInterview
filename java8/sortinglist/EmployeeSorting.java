package sortinglist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSorting {

	public static void main(String[] args) {
		
		List<Employee> employee = new ArrayList<Employee>();
		
		employee.add(new Employee(1, "Arun", "Dev", 100000));
		employee.add(new Employee(2, "Chandru", "Test", 90000));
		employee.add(new Employee(4, "Babu", "Design", 60000));
		employee.add(new Employee(3, "David", "Devops", 80000));
		
		System.out.println("Without Order ::: " +employee);
		
		//Collection Sort
		Collections.sort(employee, (a, b) -> a.getId()>b.getId()?-1:a.getId()<b.getId()?1:0);
		
		System.out.println("DES Order ::: " + employee);
		
		Collections.sort(employee, (a, b) -> a.getId()>b.getId()?1:a.getId()<b.getId()?-1:0);
		
		System.out.println("ASC Order ::: " + employee);
		
		
		Collections.sort(employee, (a, b) ->b.getName().compareTo(a.getName()));
		System.out.println("New Logic Order ::: " + employee);
		
		
		//Stream  
		
		employee.stream()
				.sorted((a, b) -> a.getId()>b.getId()?1:a.getId()<b.getId()?-1:0)
				.forEach(System.out::println);
		
		
		List<Employee> filterList = employee.stream().filter(a -> a.getSalary()>60000 && a.getName().toUpperCase().startsWith("A")).collect(Collectors.toList());
		
		System.out.println(filterList);
		
		

	}
	
	
}
