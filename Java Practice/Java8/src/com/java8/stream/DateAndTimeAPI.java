package com.java8.stream;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class DateAndTimeAPI {
	
	//In upto java 7 - date, calender and timestamp class is there but this performance wise not upto mark
	
	//Java 8 JODA API 
	public static void main(String[] args) {
		
		
		//Get today Date
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate); //2023-06-13
		
		System.out.println(localDate.getDayOfMonth()); //13
		System.out.println(localDate.getMonthValue()); //6
		System.out.println(localDate.getYear());       //2023
		
		//Get current time
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);    //23:28:22.676546100
		
		System.out.println(localTime.getHour());  //23
		System.out.println(localTime.getMinute()); //28
		System.out.println(localTime.getSecond()); //22
		System.out.println(localTime.getNano());   //676546100
		
		//Get Current Date and Time
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime); //2023-06-13T23:28:22.678546600
		
		//Period 
		
		LocalDate localDatePer = LocalDate.of(1998, 2, 16); 
		LocalDate localDatePerNow = LocalDate.now();
		
		Period period = Period.between(localDatePer, localDatePerNow);
		System.out.println(period);  ////P25Y3M28D
		
		
		//Leap Year
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year");
		int year = sc.nextInt();
		Year clsYear = Year.of(year);
		if(clsYear.isLeap()) {
			System.out.println("This Leap Year");
		}
		else {
			System.out.println("This not a Leap Year");
		}
		
		//ZONE ID
		ZoneId zoneId = ZoneId.systemDefault();
		System.out.println(zoneId); //Asia/Calcutta
		
		ZoneId zoneidof = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zdt = ZonedDateTime.now(zoneidof);
		System.out.println(zoneidof); //America/Los_Angeles
		System.out.println(zdt); //2023-06-13T11:13:10.001032900-07:00[America/Los_Angeles]

	}
	
	

}
