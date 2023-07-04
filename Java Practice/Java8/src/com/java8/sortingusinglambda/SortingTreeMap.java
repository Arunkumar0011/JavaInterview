package com.java8.sortingusinglambda;

import java.util.TreeMap;

public class SortingTreeMap {
	
	public static void main(String[] args) {
		
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(1, "arun");
		tm.put(5, "kumar");
		tm.put(2, "AK");
		tm.put(0, "GK");
		System.out.println(tm);
	}
}
