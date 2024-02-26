package org.test.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Car1 {
	Scanner sc=new Scanner(System.in);
	HashMap<Integer,String> carSlots = new HashMap<> ();
	static HashMap <Integer, String> filledCarSlots= new HashMap<>();
	Car1(){
		for (int i=1;i<=15;i++) {

			carSlots.put(i, null);
		}
	}
	public void showSlotsForBikes(){

		System.out.println("Available Slots: ");
		for(Map.Entry m : carSlots.entrySet()){    
			System.out.println("This slot is Available:- "+m.getKey());
		}
		System.out.println(filledCarSlots);

	}
	public void carEntering(int slotNo) {


		if (carSlots.containsKey(slotNo)) {
			System.out.println("Enter your name: ");
			filledCarSlots.put(slotNo, sc.next());
			System.out.println("Your slot no is: "+slotNo);
			carSlots.remove(slotNo);
			return;

		}
		System.out.println("All slots are filled");

	}
	public void carLeaving(int slotNo ) {
		carSlots.put(slotNo, null);
		filledCarSlots.remove(slotNo);
		System.out.println("Thank you revist again");

	}

}
