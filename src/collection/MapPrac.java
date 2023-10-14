package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapPrac {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "java");
		map.put(2, "spring");
		map.put(3, "springboot");
		map.put(4, "hibernate");
		
		System.out.println(map);  // {1=java, 2=spring, 3=springboot, 4=hibernate}
		
		//CHNAGE MAP TO SET
		System.out.println(map.entrySet()); // [1=java, 2=spring, 3=springboot, 4=hibernate]
		
		Set s = map.entrySet();
		Iterator i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());     //1=java   2=spring 	3=springboot    4=hibernate
		}
		
		//KEYSET - GET ONLY KEY VALUES
		System.out.println(map.keySet());   //[1, 2, 3, 4]
		
		//VALUE - GET ONLY VALUES
		System.out.println(map.values());   //[java, spring, springboot, hibernate]
		
		
		//CONTAINS KEY - THAT KEY IS CONTAINS OR NOT IT  WILL CHECK
		System.out.println(map.containsKey(5));    //false
		
		//CONTAINS VALUE - VALUE IS CONTAINS OR NOT IT WILL CHECK
		System.out.println(map.containsValue("java"));   //true
		
		//GET - get key against values because key is unique value is not unique if go for value we will getting confuse that's why
		System.out.println(map.get(1)); //java

		//REMOVE
		//1. Give the key it remove that key and return the values
		//2. Give the key pair value return the boolean
		System.out.println(map.remove(4));   //hibernate
		System.out.println(map.remove(3, "springboot"));   //true
		
		//ITERATION
		
		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(1, "arun");
		map1.put(2, "kumar");
		map1.put(3, "AK");
		map1.put(4, "GAK");

		//USING KEY SET ITERATOR
		Set set = map1.entrySet();
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			Map.Entry<Integer, String> e = (Map.Entry<Integer, String>) i.next();
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		//USING FOR EACH LOOP - USING KEY SET
		
		for(Integer key : map1.keySet()) {
			System.out.println("Key "+key+ "Value" +map1.get(key));
		}
	}
}
