package collection;

import java.util.Comparator;

public class IdComparator implements Comparator<ComparatorStudent>{

	@Override
	public int compare(ComparatorStudent o1, ComparatorStudent o2) {
		
		if(o1.getId() > o2.getId()) {
			return 1;
		} else if (o1.getId() < o2.getId()) {
			return -1;
		} else {
			return 0;
		}
	}

}
