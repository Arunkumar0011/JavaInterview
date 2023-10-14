package array;

import java.util.Arrays;

public class CompareTwoArrays {

	public static void main(String[] args) {

		
		int a[] = {1,2,3,4};
		int b[] = {1,2,3,4};
		
		//USING EQUALS - Will take primitive data type
		System.out.println(Arrays.equals(a, b)); //true
		
		//USING DEEPEQUALS - Will take only object
		Object [] aa = {a};
		Object [] bb = {b};
		System.out.println(Arrays.equals(aa, bb)); //false
		System.out.println(Arrays.deepEquals(aa, bb)); //true
		
		String[] name1 = {"Arun", "Kumar", "Ram"};
		String[] name2 = {"Arun", "Kumar", "Ram"};

		System.out.println(Arrays.equals(name1, name2));
		System.out.println(Arrays.deepEquals(name1, name2));

	}
}
