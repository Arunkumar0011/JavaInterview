package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortASCAndDSC {
	
	
	public static void main(String[] args) {
		
	Integer [] array = {8,3,6,1,7,2};
	
	Arrays.sort(array);
	
	System.out.println("ASC Order :::  " + Arrays.toString(array));
	

	Arrays.sort(array, Collections.reverseOrder());
	
	System.out.println("DSC Order :::  "+ Arrays.toString(array));
	
	
	//JAVA 8 
		
	List<Integer> ASClist = Arrays.stream(array).sorted().collect(Collectors.toList());
	
	System.out.println("ASC Order JAVA 8 :::  " + ASClist);
	
	List<Integer> DSCList = Arrays.stream(array).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

	System.out.println("ASC Order JAVA 8 :::  " + DSCList);

	
	
	}
}
