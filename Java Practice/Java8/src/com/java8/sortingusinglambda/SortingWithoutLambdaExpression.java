package com.java8.sortingusinglambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SortingWithoutLambdaExpression {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(5);
		al.add(0);
		al.add(2);
		
		System.out.println("List Normal Print     "+al);
		
		Collections.sort(al);
		
		System.out.println("After sorting using colletion.sort - Return Default Collection Sorting ASC     "+al);
		
		
		//Without Lambda Expression
		Comparator<Integer> com = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {

				return (o1>o2)?+1:(o1<o2)?-1:0;
			}
			
		};
		Collections.sort(al, com);
		
		System.out.println("After using comparator with Inner class Logic and ASC order     "+al);
		
		//With Lambda Expression
		Comparator<Integer> comLam = (al1,al2) -> (al1>al2)?-1:(al1<al2?+1:0);
		Collections.sort(al,comLam);
        System.out.println("After using comparator with Lambda Expression Logic and DES order     "+al);
	}

}
