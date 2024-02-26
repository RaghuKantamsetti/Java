package org.parkingslots.java;

import java.util.HashMap;
import java.util.Scanner;

public class Bikes {
	
	HashMap <Integer, String> bikeSlots= new HashMap<>();
	Scanner sc=new Scanner(System.in);
	Bikes(){
		for (int i=1;i<=15;i++) {
			bikeSlots.put(i, null);
		}
		bikeSlots.put(1,null);
		bikeSlots.put(2,"virat");
		bikeSlots.put(3,"rohit");
		bikeSlots.put(4,"rohit");
		bikeSlots.put(5,"rohit");
		bikeSlots.put(6,null);
		bikeSlots.put(7,"rohit");
		bikeSlots.put(8,"rohit");
		bikeSlots.put(9,"rohit");
		bikeSlots.put(10,"rohit");
		bikeSlots.put(11,"rohit");
		bikeSlots.put(12,"rohit");
		bikeSlots.put(13,"rohit");
		bikeSlots.put(14,"rohit");
		bikeSlots.put(15,null);
	}
		public void bikeEntering() {
		
		for (int i=1;i<=15;i++) {
			if (bikeSlots.get(i)==null) {
				System.out.println("Enter your name: ");
				bikeSlots.put(i, sc.next());
				System.out.println("Your slot no is: "+i);
				continue;
				
			}
			
				
			}
		System.out.println("All slots are filled");
		
	}
		public void bikeLeaving(int n) {
			bikeSlots.replace(n, null);
			this.bikeEntering();
	}
	

	
}
