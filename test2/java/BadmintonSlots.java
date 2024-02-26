package org.test2.java;

import java.util.HashMap;
import java.util.Map;

public class BadmintonSlots {
	
	static HashMap <Integer,String> badmintonfilledSlots=new HashMap<>();
	static HashMap <Integer,String> badmintonTiming=new HashMap<>();
	
// 	{badmintonTiming.put(1,"08:00-09:00");
// 	badmintonTiming.put(2,"09:00-10:00");
// 	badmintonTiming.put(3,"10:00-11:00");
// 	badmintonTiming.put(4,"11:00-12:00");
// 	badmintonTiming.put(5,"14:00-15:00");
// 	badmintonTiming.put(6,"15:00-16:00");
// 	badmintonTiming.put(7,"16:00-17:00");
// 	badmintonTiming.put(8,"17:00-18:00");
// 	badmintonTiming.put(9,"18:00-19:00");
// 	badmintonTiming.put(10,"19:00-20:00");}
	
	int count=8;
	public void fillTimimgsForBadminton(){
		 for (int i=1;i<=10;i++) {
			 badmintonTiming.put(i, toString(count)+":00"+":"+toString(++count)+":00");
		 }
	}
	public void availableSlots() {
		System.out.println("For Badminton available slots are: ");
		for(Map.Entry m : badmintonTiming.entrySet()){    
		    System.out.println("for slot number:- "+m.getKey()+" timings is:- "+m.getValue());    
	 }
		
	}
	public void badminton( int slotNo,String name){
		
			 
			if(badmintonTiming.containsKey(slotNo)) {
				
				System.out.println("successfully slot booked");
				badmintonfilledSlots.put(slotNo,name);
				badmintonTiming.remove(slotNo);
				return;
			}
			else {
				System.out.println("this slot is not Available check displayed slot list ");	
				return;
			}
	}
}

