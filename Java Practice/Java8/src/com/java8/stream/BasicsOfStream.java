package com.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BasicsOfStream {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(0);
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		
		List<Integer> l = al.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		System.out.println("Even Number Print Using Stream Concept from Array List ::: " +l);
		
		System.out.println();
		List<Integer> l1 = al.stream().filter(i -> i%2 != 0).collect(Collectors.toList());
		System.out.println("Add Number Print Using Steam Concept from Array List :::  " +l1);
		
		System.out.println();
		List<Integer> l2 =al.stream().map(i -> i*1000000).collect(Collectors.toList());
		System.out.println(l2);
		
	}

}
