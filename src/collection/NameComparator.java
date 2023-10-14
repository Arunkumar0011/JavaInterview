package collection;

import java.util.Comparator;

public class NameComparator implements Comparator<ComparatorStudent>{

	@Override
	public int compare(ComparatorStudent o1, ComparatorStudent o2) {
		
		 return o1.getName().compareTo(o2.getName());
	}

}
