package com.java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortByUsingStream {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(2);
		l.add(1);
		l.add(9);
		
		//Using sorted method - It will return default order of sorting ASC
		List<Integer> l1 = l.stream().sorted().collect(Collectors.toList());
		System.out.println(l1);
		
		//Return Customized sorting order - DSC
		List<Integer> l2 = l.stream().sorted((i1,i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(l2);
		
		//Min value identification
		Integer min = l.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(min);
		
		//Max value identification
		Integer max =l.stream().max((i1,i2) -> i1.compareTo(i2)).get();
		System.out.println(max);
		
		//For Each using lambda expression
		l.stream().forEach(s -> System.out.println("For Each Started " + s));
		
		//For Each using :: operator
		l.stream().forEach(System.out :: println);
		
		//Collection to array copy
		
		Integer[] intArr = l.stream().toArray(Integer[] :: new);
		System.out.println("Collection object to array conversion ::: " + intArr);
		for (Integer integer : intArr) {
			System.out.println(integer);
			
		}
		
		
		//Stream Array - OF
		System.out.println("*******************Stream Array**************************");
		Stream<Integer> strInt = Stream.of(1,2,3,4,5,6,7,8,0);
		strInt.forEach(System.out :: println);
		
		Double[] dou = {0.1,9.0,8.3,7.5,6.6,5.8,4.9,1.1,2.4,3.0};
		Stream<Double> strdoub = Stream.of(dou);
		strdoub.forEach(System.out :: println);
	} 
	

}
