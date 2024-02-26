package org.sportscomplex.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BoxCricketSlots {

	
	static HashMap <Integer,String> cricketFilledSlots=new HashMap<>();
	static HashMap <Integer,String> cricketTiming=new HashMap<>();{
		cricketTiming.put(1,"08:00-10:00");
		cricketTiming.put(2,"10:00-12:00");
		cricketTiming.put(3,"14:00-16:00");
		cricketTiming.put(4,"16:00-18:00");
		cricketTiming.put(5,"18:00-20:00");
	}
	
	public void availableSlotsCricket() {
		System.out.println("For Cricket available slots are: ");
		for(Map.Entry m : cricketTiming.entrySet()){    
		    System.out.println("for slot number:- "+m.getKey()+" timings is:- "+m.getValue());    
	 }
		
	}
	public void cricket( int slotNo,String name){
			 
			if(cricketTiming.containsKey(slotNo)) {
				
				System.out.println("successfully slot booked");
				cricketFilledSlots.put(slotNo,name);
				cricketTiming.remove(slotNo);
				return;
			}
			else {
				System.out.println("this slot is not Available check displayed slot list ");
				return;
			}
		
	}

}
