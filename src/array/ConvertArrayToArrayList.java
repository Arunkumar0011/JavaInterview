package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertArrayToArrayList {
	
	public static void main(String[] args) {
		
		String[] name = {"Arun", "Kumar", "Ram"};
        
		//Array to ArrayList conversion
		
		//1. Arrays.asList method
		System.out.println(Arrays.asList(name));
		
		//2. Collections.addAll
		ArrayList<String> al = new ArrayList<String>();
		Collections.addAll(al, name);
		System.out.println(al);
		
		//3. Without any predefined methods
		
		ArrayList<String> l = new ArrayList<String>();
		for (String string : name) {
			l.add(string);
		}
		System.out.println(l);
		
		
		// Primitive data type array to Arraylist
        int[] primitiveIntArray = {1, 2, 3, 4, 5};
        
        List<Integer> list = Arrays.stream(primitiveIntArray).boxed().collect(Collectors.toList()); 
        
        System.out.println(list);
	}

}
