package com.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectMethod {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("Arunkumar G");
		l.add("Kumar");
		l.add("Aru");
        l.add("AK");
        
        //Using Filter
        List<String> fil = l.stream().filter(i -> i.length() >= 4).collect(Collectors.toList());
        System.out.println(fil);
        
        //Using Map
        List<String> map = l.stream().map(i -> i.toUpperCase()).collect(Collectors.toList());
        System.out.println(map);
        
        //Filter with count  method
        
        Long count = l.stream().filter(i -> i.length()>=4).count();
        System.out.println(count); 
        

        
	}
}
