package src.com.arun.sorting;

public class BubbleSorting {

	public static void main(String[] args) {
		
		int a[] = {9,8,7,6,5,4,3,2,1};
		
		//System.out.println(a.length);
		
		int j = a.length-1; //Length we are getting and -1 then onlyl it will get index values properly
		
		while(j>0) {
			for(int i=0; i<j; i++) {
				if(a[i]>a[i+1]) {
					int temp =a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}
			}
			j--;
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
	} 
	
	
}
