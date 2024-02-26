package org.test2.java;

import java.util.HashMap;
import java.util.Map;

public class FootballSlots {



	static HashMap <Integer,String> footballFilledSlots=new HashMap<>();
	static HashMap <Integer,String> footballTiming=new HashMap<>();
// 	{
// 		footballTiming.put(1,"08:00-08:30");
// 		footballTiming.put(2,"08:30-09:00");
// 		footballTiming.put(3,"09:00-09:30");
// 		footballTiming.put(4,"09:30-10:00");
// 		footballTiming.put(5,"10:00-10:30");
// 		footballTiming.put(6,"10:30-11:00");
// 		footballTiming.put(8,"11:00-11:30");
// 		footballTiming.put(9,"11:30-12:00");
// 		footballTiming.put(10,"12:00-12:30");
// 		footballTiming.put(11,"15:00-15:30");
// 		footballTiming.put(12,"15:30-16:00");
// 		footballTiming.put(13,"16:00-16:30");
// 		footballTiming.put(14,"16:30-17:00");
// 		footballTiming.put(15,"17:00-17:30");
// 		footballTiming.put(16,"17:30-18:00");
// 		footballTiming.put(18,"18:00-18:30");
// 		footballTiming.put(19,"18:30-20:00");
// 		footballTiming.put(20,"20:00-20:30");
// 	}
	int count1=8;
	public void fillTimimgsForFootball(){
		 for (int i=1;i<=20;i++) {
			 footballTiming.put(i, toString(count1)+":00"+":"+toString(count1)+":30");
			 footballTiming.put(++i, toString(count1)+":30"+":"+toString(++count1)+":00");
		 }
	}
	public void availableSlotsFootball() {
		System.out.println("For Football available slots are: ");
		for(Map.Entry m : footballTiming.entrySet()){    
			System.out.println("for slot number:- "+m.getKey()+" timings is:- "+m.getValue());    
		}

	}
	public void football( int slotNo,String name){

		if(footballTiming.containsKey(slotNo)) {

			System.out.println("successfully slot booked");
			footballFilledSlots.put(slotNo,name);
			footballTiming.remove(slotNo);
			return;
		}
		else {
			System.out.println("this slot is not Available check displayed slot list ");
			return;
		}

	}

}
