package optionClass;

import java.util.Optional;

public class OptionalClass {
	
	public static void main(String[] args) {
		
		OptionalStudentPojo stu = new OptionalStudentPojo(1, "Arun", "arun@gmail.com");  //"arun@gmail.com"
		
		/************************STATIC METHOD************************************/
		
		//Empty the Object
		Optional<OptionalStudentPojo> empty = Optional.empty();
		System.out.println(empty);
		
		//If value is there return the value. if null throw null point exception
		//Optional<String> of = Optional.of(stu.getEmail());
		//System.out.println(of);
		
		//OFF NULLABLE - If it's null it's return the Optional.empty. If it's hold the value return that one
		Optional<String> ofnullable = Optional.ofNullable(stu.getEmail());
		System.out.println(ofnullable);
		
		/************************INSTANCE METHOD************************************/
		
		//ISPRESENT is check the value is presented or not and GET method return the value
		if(ofnullable.isPresent()) {
			System.out.println(ofnullable.get());
		}
		
		//ORELSE - If value is null it's return the input String in ORELSE method. it's useful for the set the default values
		System.out.println(ofnullable.orElse("No Email present"));
		
		//ORELSETHROW - if value is not there will throw the exception
		System.out.println(ofnullable.orElseThrow(() ->new IllegalArgumentException("Email is empty exception")));
		
	}
}
