package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
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
		
		Integer arr [] = {10,20,30,4,0,50,60,70,80,100};
		
		List<Integer> a = Arrays.stream(arr).filter(b -> b>50).collect(Collectors.toList());
		
		System.out.println(a);
		
		Integer arrNew [] = {20,10,90,30};
		List<Integer> c = Arrays.stream(arrNew).sorted().collect(Collectors.toList());
		
		Optional<Integer> d = Arrays.stream(arrNew).sorted(Collections.reverseOrder()).skip(0).findAny();
		
		System.out.println(d);
		
	}

}
