package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice {

	public static void main(String[] args) {
		
		String  str = "Arunkuamr g";
		
		char[] charArr = str.toCharArray();
		
		for(int i=0; i <charArr.length; i++) {
			boolean flag = false;
			for(int j=1; j<charArr.length; j++) {
				if(charArr[i] == charArr[j]) {
					flag =true;
				}
			}
			if(flag) {
				System.out.println(charArr[i]);
				break;
			}
			
		}
		
		
	}
}
