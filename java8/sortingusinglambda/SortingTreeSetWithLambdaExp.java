package sortingusinglambda;

import java.util.TreeSet;

public class SortingTreeSetWithLambdaExp {
	
	
	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<>((ts1,ts2) -> ts1>ts2?-1:ts1<ts2?1:0);
		ts.add(10);
		ts.add(9);
		ts.add(8);
		ts.add(5);
		ts.add(2);
		ts.add(1);		
		System.out.println(ts);
	}

}
