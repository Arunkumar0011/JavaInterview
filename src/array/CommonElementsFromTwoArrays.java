package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsFromTwoArrays {
	
	public static void main(String[] args) {
		
		//Print common elements in the given two arrays.
		
		Integer a [] = {1,2,3,4,5,6,10,11};
		Integer b [] = {6,7,8,9,10,11};
		
		//USING TWO FOR LOOP
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < b.length; j++) {
				if(a[i] == b[j]) {
					System.out.println("This value contains in the both element :::  " + a[i]);
				}
				
			}
		}
		
		//USING SINGLE FOR LOOP
		List<Integer> ala = Arrays.asList(a);
		List<Integer> alb = Arrays.asList(b);
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.addAll(ala);
		hs.addAll(alb);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (Integer integer : hs) {
			
			if(ala.contains(integer) && alb.contains(integer)) {
				al.add(integer);
			}
		}
		System.out.println(al);
		
		//USING JAVA 8 
		
		List<Integer> list = Arrays.asList(a).stream().filter(astream -> Arrays.asList(b)
				.contains(astream)).collect(Collectors.toList());
		
		System.out.println(list);
	}
	


}
