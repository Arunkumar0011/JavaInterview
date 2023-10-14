package search;

public class BinarySearch {

	public static void main(String[] args) {
    		int [] numArray = {1,2,3,4,5,6,7,8,9};
		
    		int no=10; //Searching Number
    		
    		boolean x = false; //Flag for number is there or not checking purpose
    		
    		int min = 0; //We will take min value - Array Value
    		int max = numArray.length-1; //We are taking max value (If using length int will return lenth value. we need array but array will start from 0 so only length - 1
    		
    		while(min <= max) { //min value and  max value when it will going to same that time this loop will going to stop
    		
    		int avg = (min+max)/2; //Getting avg for the index - using avg we are able to check left side value is big or right side value is big will check and  able to process
    		
    		if(numArray[avg] == no) { //We are checking what ever we are identified avg index value and input idetified value are same or not incase same this condition will execute other wise going to run other condition
    			
    			System.out.println("Your Entered number is there in the Array list" +no+ "Index of the value in Array" + numArray[avg]);
    			
    			x=true; //Flag setting for value is there so only
    			
    			break; //Break the loop
    			
    		}
    		
    		else if(no > numArray[avg]) {   //If search no is big  array will increase the min value.
    			min = avg+1;				//If no is greater than avg add it min value avg + 1 
    		}
    		else if(no < numArray[avg]) {  //If Array is big 
    			max=avg-1;
    		}
    		}
    		
    		if(!x) {
    			System.out.println("Your entered number is not that Array List");
    		}
		
	}
}
