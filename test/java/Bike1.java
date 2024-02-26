package org.test.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Bike1 {
	Scanner sc=new Scanner(System.in);

	static HashMap <Integer, String> bikeSlots= new HashMap<>();
	static HashMap <Integer, String> filledBikeSlots= new HashMap<>();
	Bike1(){
		for (int i=1;i<=15;i++) {

			bikeSlots.put(i, null);
		}
	}
	public void showSlotsForBikes(){

		System.out.println("Available Slots: ");
		for(Map.Entry m : bikeSlots.entrySet()){    
			System.out.println("This slot is Available:- "+m.getKey());
		}
		System.out.println(filledBikeSlots);

	}
	public void bikeEntering(int slotNo) {

		if(bikeSlots.containsKey(slotNo)) {
			System.out.println("Enter your name: ");
			filledBikeSlots.put(slotNo, sc.next());
			System.out.println("Your slot no is: "+slotNo);
			bikeSlots.remove(slotNo);
			return;

		}	
		System.out.println("This"+slotNo+" slots are filled");

	}
	public void bikeLeaving(int slotNo ) {
		bikeSlots.put(slotNo, null);
		filledBikeSlots.remove(slotNo);
		System.out.println("Thank you revist again");

	}
}
