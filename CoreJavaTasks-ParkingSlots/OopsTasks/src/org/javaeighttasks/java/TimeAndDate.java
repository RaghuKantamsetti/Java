package org.javaeighttasks.java;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class TimeAndDate {

	public static void main(String[] args) {
		 LocalDate date=LocalDate.now();
		 System.out.println("today Date is "+date);
		 LocalTime time=LocalTime.now();
		 System.out.println("time right now: "+time);
		 LocalDateTime dateAndTime=LocalDateTime.now();
		 System.out.println("time and date right now:"+dateAndTime);
		 DateTimeFormatter formate=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		 String formatedDateTime=dateAndTime.format(formate);
		 System.out.println(formatedDateTime);
		 
		
		 
	}

}
