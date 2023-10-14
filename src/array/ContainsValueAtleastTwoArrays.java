package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ContainsValueAtleastTwoArrays {
	
	public static void main(String[] args) {
		
		//We have 3 Arrays - we are going to identifie the value contains minimum two arrays that value only we are going to print
		
	    //Approach Plan
		//1. Add all array in list using Arrays.asList() - Static method in Arrays class
		//2. Then Array list setting the Hashset so we are getting unique
		//3. Then iterate and will check
		
		Integer a[] = {1,2,3,4,5,6};
		Integer b[] = {7,8,9,0,1,2};
		Integer c[] = {1,2,3,4,5,7};
		
		
		List<Integer> ala = Arrays.asList(a); 
		List<Integer> alb = Arrays.asList(b);
		List<Integer> alc = Arrays.asList(c);

		//Hash set not allow the duplicates so only we selected the hash set is there.
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.addAll(ala);
		hs.addAll(alb);
		hs.addAll(alc);
		
		System.out.println(hs);
		
		ArrayList<Integer> al = new ArrayList<>();
		for (Integer num : hs) {
			if((ala.contains(num) && alb.contains(num)) || 
					(alb.contains(num) && alc.contains(num)) ||
					(ala.contains(num) && alc.contains(num))) {
				al.add(num);
			}
			
		}
		System.out.println(al);
		
		
		//USING  JAVA 8 
		
		List<Integer> listStream = Arrays.asList(a).stream().filter(newa -> Arrays.asList(b).contains(newa) || Arrays.asList(c).contains(newa)).distinct()
													  .collect(Collectors.toList());
		
		
		List<Integer> listStream1 = Arrays.asList(b).stream().filter(newa -> Arrays.asList(a).contains(newa) || Arrays.asList(c).contains(newa)).distinct()
				  .collect(Collectors.toList());
		
		List<Integer> listStream2 = Arrays.asList(c).stream().filter(newa -> Arrays.asList(a).contains(newa) || Arrays.asList(b).contains(newa)).distinct()
				  .collect(Collectors.toList());
		
		HashSet<Integer> newHashSet = new HashSet<Integer>();
		newHashSet.addAll(listStream);
		newHashSet.addAll(listStream1);
		newHashSet.addAll(listStream2);		
		
	    System.out.println(newHashSet);
		
		
	}
}
