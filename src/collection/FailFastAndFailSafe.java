package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastAndFailSafe {
	
	public static void main(String[] args) {
		
		
		//FAIL FAST EXAMPLE
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Arun");
		map.put(2, "Kumar");
		
		Set s = map.entrySet();
		Iterator i = s.iterator();
		
		while(i.hasNext()) {
			
			Map.Entry<Integer, String> e = (Map.Entry<Integer, String>) (i.next());
			
			System.out.println("Key Value ::: " + e.getKey());
			System.out.println("Valeu :::" +e.getValue());
			//map.put(3, "AK"); //ConcurrentModificationException - This called fast fail  
			
			//BECAUSE THIS FOLLWING UNDERLYING DATASTRUCTURE - NEED TO EXPOSE MORE
			//
			
			
			
		}
		
		System.out.println("FAIL SAFE STARTED................");
		
		
		//FAIL SAFE
		Map<Integer, String> conMap = new ConcurrentHashMap<Integer, String>();
		conMap.put(1, "Arun");
		conMap.put(2, "Kumar");
		
		Set set = conMap.entrySet();
		
		Iterator iter = set.iterator();
		
		while(iter.hasNext()) {
			Map.Entry<Integer, String> mapentry = (Map.Entry<Integer, String>) iter.next();
			
		System.out.println(mapentry.getKey());
		System.out.println(mapentry.getValue());
		conMap.put(3, "AK"); //FAIL SAFE
		
		//IT IS FOLLWING  - segments
		/*
		 * Depending upon the level of concurrency required the concurrent HashMap is
		 * internally divided into segments. If the level of concurrency required is not
		 * specified then it is takes 16 as the default value. So internally the
		 * ConcurrentHashMap will be divided into 16 segments. Each Segment behaves
		 * independently.
		 */
		}
		//FOR MAP WE HAVE CONCURRENTHASHMAP
		//List -> CopyOnWriteArrayList
		//Set  -> CopyOnWriteArraySet
	}

}
